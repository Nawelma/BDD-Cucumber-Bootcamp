package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstName;
	
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	
	@FindBy(id = "input-email")
	private WebElement Email;
	
	@FindBy(id = "input-telephone")
	private WebElement Telephone;
	
	@FindBy(id = "input-password")
	private WebElement Password;
	
	@FindBy(id = "input-confirm" )
	private WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@name = 'newsletter'][@value = '0']")
	private WebElement newsletterBox;
	
	@FindBy(xpath = "//input[@name = 'agree']")
	private WebElement PolicyBox;
	
	@FindBy(xpath = "//input[@value = 'Continue']")
	private WebElement continueButton;
	
public Register_Page(WebDriver driver) {
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
}
public void enterFirstName(String firstname) {
	 firstName.sendKeys(firstname);
}
public void enterLastName(String lastname) {
	lastName.sendKeys(lastname);
}
public void enterEmail(String emailaddress) {
	Email.sendKeys(emailaddress);
}
public void enterTelephone(String phone) {
	 Telephone.sendKeys(phone);
}
public void enterPassword(String password) {
	Password.sendKeys(password);
}
public void confirmPassword(String confirmpass) {
	ConfirmPassword.sendKeys(confirmpass);
}
public void checkNewsLetterBox() {
	newsletterBox.click();

}
public void checkPolicyBox() {
	PolicyBox.click();
}
public Account_Page clickOnContinueButton() {
	continueButton.click();
	return new Account_Page(driver); 
}

}


