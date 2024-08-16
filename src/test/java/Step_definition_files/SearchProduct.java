package Step_definition_files;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.TN.Pages.Home_Page;
import com.TN.Pages.Product_page;
import com.TN.Utils.ConfigReader;
import com.TN.driverFactory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	
	public WebDriver driver;
	public Home_Page homepage;
	public Properties prop;
	public  Product_page productpage;
		
	@Given("User navigates to home page")
	public void user_navigates_to_home_page() {
		driver = DriverFactory .getDriver();
		
		
	}
	@When("User enters a valid product into search box") 
	public void user_enters_a_valid_product_into_search_box() throws Exception {
		prop = ConfigReader.initializePropertiesFile();
		homepage = new Home_Page(driver);
		homepage.insertValidProductInSearchField(prop.getProperty("product"));
	}
	@And("User clicks on search button")
	public void user_clicks_on_search_button() {
		homepage = new Home_Page(driver);
		productpage = homepage.clickOnSearchButton();
		
	}
	@Then("User should finds the right product in product page")
	public void user_should_finds_the_right_product_in_product_page () {
		productpage = new Product_page(driver);
		Assert.assertTrue(productpage.displayedvalidProductSearch());
		
	}
	
}
