package com.TN.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	public static FileInputStream ip;

	public static Properties initializePropertiesFile() throws Exception {
		prop = new Properties();
		ip = new FileInputStream("/Users/hassanekhouni/git/cucumber3/src/test/resources/configer/config.properties");
		prop.load(ip);

		return prop;
	}

}
