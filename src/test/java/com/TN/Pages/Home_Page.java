package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text() , 'Register')]")
	private WebElement registerDropdown;
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropDown;
	
	@FindBy(linkText = "Login")
	private WebElement loginDropdown;
	
	@FindBy(xpath ="//input[@name ='search']")
    private WebElement searchTextField;	
	
	@FindBy(xpath = "//button[@class = 'btn btn-default btn-lg']")
	private WebElement searchButton;
	
	public  Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver ,this);
	}
	public void clickOnMyAccountDropdown() {
		 myAccountDropDown.click();
	}

	public Login_Page clickOnLoginDropdown() {
		loginDropdown.click();
		return new Login_Page(driver);
}
	public Register_Page clickOnRegisertDropdown() {
		registerDropdown.click();
		return new Register_Page(driver);
	}
	
	public void insertValidProductInSearchField(String Productname) {
		searchTextField.sendKeys(Productname);
	}
	
	public Product_page clickOnSearchButton() {
		searchButton.click();
	return new Product_page(driver);

}
	
	
}