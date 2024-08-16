package com.TN.Utils;

import java.util.Date;

public class Util {
	
	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", ":").replace(":", "_");
		return "rae.rom" + timeStamp + "@gmail.com";
	}
	
	public static final int IMPLICIT_WAIT_TIME = 20;
	public static final int PAGE_LOAD_TIME = 200;
	public static final int SCRIPT_TIME= 2000;

}
