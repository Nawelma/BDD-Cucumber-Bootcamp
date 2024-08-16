package Step_definition_files;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.TN.Pages.AddToCart_Page;
import com.TN.Pages.Home_Page;
import com.TN.Pages.Product_page;
import com.TN.Utils.ConfigReader;
import com.TN.driverFactory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	public WebDriver driver;
	public Properties prop;
	public com.TN.Pages.Home_Page homepage;
	public com.TN.Pages.Product_page productpage;
	public com.TN.Pages.AddToCart_Page addtocartpage;

	
	
	 @Given("User searches the product in product page")
	 public void  user_navigate_to_product_page() throws Exception {
		 prop = ConfigReader.initializePropertiesFile();
	     driver = DriverFactory.getDriver();
	     homepage = new Home_Page(driver);
	     homepage.insertValidProductInSearchField(prop.getProperty("product"));
	     productpage = homepage.clickOnSearchButton();
		 
	 }
	 @When("User clicks on AddToCart button")
	 public void user_click_on_AddToCart_button() {
		 productpage = new Product_page (driver);
		 addtocartpage = productpage.clickOnAddToCartButton();
	 }
	 @And("User clicks on ShoppingCart button")
	 public void user_click_on_ShoppingCart_button() {
		 productpage = new Product_page (driver);
		 productpage.clickOnShoppingCartbutton();
	 }
	 @And("User should find the right product in shoppingcart")
	 public void user_should_find_the_right_product_in_shoppingcart() {
		 addtocartpage = new AddToCart_Page(driver);
		 addtocartpage .displayedRightProduct();
	 }
	 @Then("User clicks on CheckOut button")
	 public void click_on_CheckOut_button() {
		 addtocartpage = new AddToCart_Page(driver);
		 addtocartpage.clickOncheckoutButton();
	 }
}
