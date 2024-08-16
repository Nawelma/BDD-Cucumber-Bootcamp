package Step_definition_files;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.TN.Pages.Account_Page;
import com.TN.Pages.Home_Page;
import com.TN.Pages.Login_Page;
import com.TN.driverFactory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public WebDriver driver;
	public Home_Page homepage;
    public Login_Page loginpage;
    public Account_Page accountpage ;
		
	
	
	@Given("User navigates to LoginPage")

	public void user_navigate_To_Login_page() {
		driver = DriverFactory .getDriver();
		homepage = new  Home_Page(driver);
	    homepage.clickOnMyAccountDropdown();
		loginpage = new Login_Page(driver);
		loginpage = homepage.clickOnLoginDropdown();
		
	}
	@When("User enters valid email {string}")
	public void user_enters_valid_email(String emailtext)  {
		
		loginpage = new  Login_Page(driver);
		loginpage.enterEmailInTextBox(emailtext);
		
	}
	
	@And("User enters valid password {string}")
	public void user_enters_valid_password(String password)  {
	
		loginpage = new Login_Page(driver);
		loginpage.enterPasswordInTextBox(password);
	}
	
	@And("User clicks on Login button")
	public void user_Clicks_on_login_button() {
		loginpage = new Login_Page(driver);
		accountpage =loginpage.clickOnLoginButton();
		
	}
	@Then("User successfully login into AccountPage")
	public void user_successfully_login_into_AccountPage() {
	    accountpage = new Account_Page(driver);
		Assert.assertTrue(accountpage.displayModifyWishList());
		
	}
	
	
	 }










	
	