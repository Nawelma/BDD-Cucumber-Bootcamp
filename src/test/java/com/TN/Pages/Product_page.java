package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text() , 'HP')]")
	private WebElement validProductSearch;
	

	@FindBy(xpath = "//div[@class = 'caption']/following-sibling::div/child::button[1]")
	private WebElement addToCartButton;
	
	@FindBy(linkText = "Shopping Cart")
	private WebElement shoppingCartbutton;
	
	public Product_page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this); 
		}
	public boolean displayedvalidProductSearch() {
		boolean product = validProductSearch.isDisplayed();
		return product;
	}
	
public AddToCart_Page  clickOnAddToCartButton() {
		addToCartButton.click();
		return new AddToCart_Page(driver);
	}	

public void clickOnShoppingCartbutton() {
	shoppingCartbutton.click();
}
}
