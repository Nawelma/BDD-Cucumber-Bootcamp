package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Account_Page {
	
	
	public WebDriver driver;
	
	@FindBy(xpath = "//p[text() = 'Congratulations! Your new account has been successfully created!']")
	private WebElement validMessage;
	
	@FindBy(xpath = "//a[@class = 'list-group-item']/following::a[@class = 'list-group-item'][text() = 'Logout']")
	private WebElement logoutButton;
	
	@FindBy(xpath = "//h1[text() = 'Account Logout']")
	private WebElement logoutText;
	
	@FindBy(xpath = "//h1[text() = 'Account Logout']//following::a[1]")
	private WebElement continueButtonToLogout;
	
	@FindBy(xpath = "//a[text() ='Modify your wish list']")
	private WebElement ModifywishList;
	
	public Account_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	
	
	public String displaySuccessfulMessage() {
		String Successmessage = validMessage.getText();
		return  Successmessage;
}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
		
	}
	public boolean LogoutMessage() {
		boolean text = logoutText.isDisplayed();
		return text;
	}
	
	public Home_Page clickOnContinueButtonToLogout() {
		continueButtonToLogout.click();
		return new Home_Page(driver);
		
	}
	public boolean displayModifyWishList() {
		boolean ModifyMyWishList = ModifywishList.isDisplayed();
		return ModifyMyWishList;
	}



}




