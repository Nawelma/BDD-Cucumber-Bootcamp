package com.TN.Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.TN.Utils.ConfigReader;
import com.TN.Utils.Util;
import com.TN.driverFactory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public WebDriver driver;

	@Before
	public void setUp() throws Exception {
		Properties prop = ConfigReader.initializePropertiesFile();
		DriverFactory.intializeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGE_LOAD_TIME));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIME));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
