package Step_definition_files;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.TN.Pages.Account_Page;
import com.TN.Pages.Home_Page;
import com.TN.Pages.Login_Page;
import com.TN.Utils.ConfigReader;
import com.TN.driverFactory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
	public Home_Page homepage;
    public Login_Page loginpage;
    public Account_Page accountpage ;
    public Properties prop;
    public String emailaddress;
    
	
	
	@Given("User currently logged in")
	public void user_currently_logged_in() throws Exception {
		prop = ConfigReader.initializePropertiesFile();
		driver = DriverFactory .getDriver();
		homepage = new  Home_Page(driver);
	    homepage.clickOnMyAccountDropdown();
		loginpage = new Login_Page(driver);
		loginpage = homepage.clickOnLoginDropdown();
		loginpage.enterEmailInTextBox(prop.getProperty("validemail"));
		loginpage.enterPasswordInTextBox(prop.getProperty("validpassword"));
		accountpage =loginpage.clickOnLoginButton();
	}
	@When(" User clicks on the logout button")
	public void user_click_on_the_logout_button() {
		accountpage = new Account_Page(driver);
		accountpage.clickOnLogoutButton();
		
	}

	@And("User receives message about Account logout")
	public void user_receives_message_about_Account_logout() {
		accountpage = new Account_Page(driver);
		Assert.assertTrue(accountpage.LogoutMessage());
	}
	@Then("User clicks on countinue button to navigate to homepage")
		public void user_clicks_on_countinue_button_to_navigate_to_homepage() {
		accountpage = new Account_Page(driver);
		homepage =accountpage.clickOnContinueButtonToLogout();
	}
	}
