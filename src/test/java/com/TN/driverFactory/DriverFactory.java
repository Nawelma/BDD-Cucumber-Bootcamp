package com.TN.driverFactory;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
	
	
	
	public static WebDriver driver;
	public static ChromeOptions option;
public static FirefoxOptions options;
	
	public static void  intializeBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
		option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		}
		else {
			System.out.println("The Browser above doesn't work");
		}
	
		}
		
		
	public static WebDriver getDriver(){
		return driver;
	}
}

