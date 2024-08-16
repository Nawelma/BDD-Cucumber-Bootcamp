package Step_definition_files;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.TN.Pages.Account_Page;
import com.TN.Pages.Home_Page;
import com.TN.Pages.Register_Page;
import com.TN.Utils.Util;
import com.TN.driverFactory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	public WebDriver driver;
	public Home_Page homepage;
    public Register_Page registerpage ;
    public Account_Page accountpage; 
    
	
	@Given("User navigate to register page")
	public void user_navigate_to_register_page() throws Exception {
		driver =  DriverFactory.getDriver();
		homepage = new Home_Page(driver);
		homepage.clickOnMyAccountDropdown();
		registerpage = new Register_Page(driver);
		registerpage = homepage.clickOnRegisertDropdown();
	   
		
	}
	
	@When("User enters mandatory fields information")
	public void user_enters_mandatory_fields_information(io.cucumber.datatable.DataTable dataTable) {
		Map<String , String> map = dataTable.asMap(String.class , String.class);
	    registerpage = new Register_Page(driver);
		registerpage.enterFirstName(map.get("FirstName"));
		registerpage.enterLastName(map.get("LastName"));
		registerpage.enterEmail(Util.emailWithDateTimeStamp());
		registerpage.enterTelephone(map.get("Telephone"));
		registerpage.enterPassword(map.get("Password"));
		registerpage.confirmPassword(map.get("ConfirmPassword"));
		
	}
	
	
	@And("User checks the newsletter box")
	public void user_checks_the_newsletter_box() {
		registerpage = new Register_Page(driver);	
		registerpage.checkNewsLetterBox();
	}
	
	
	@And("User checks agree box")
	public void user_checks_agree_box() {
		registerpage = new Register_Page(driver);	
		registerpage.checkPolicyBox();
	}
	@And("User Clicks on continue button")
	public void user_Clicks_on_continue_button() {
		registerpage = new Register_Page(driver);
		 registerpage.clickOnContinueButton();
	}
	@Then("User successfuly creates account")
	public void user_successfuly_creates_account () {
		accountpage = new Account_Page(driver);
		Assert.assertTrue(accountpage.displaySuccessfulMessage().contains("Congratulations! Your new account has been successfully created!"));
		
	
	}
	
	}
	
	
	
	
	
	

