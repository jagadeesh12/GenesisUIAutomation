package com.dw.automation.support;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.RandomStringUtils;

public class RandomDataUtil {

	public static String getString(String data) {
		if (data == null || data.equalsIgnoreCase("")) {
			return "auto_" + RandomStringUtils.randomAlphabetic(10);
		} else {
			return data;
		}
	}

	public static String getEmail(String email) {
		if (email == null || email.equalsIgnoreCase("")) {
			return "auto_" + RandomStringUtils.randomAlphanumeric(10) + "@example.com";
		} else {
			return email;
		}
	}
	
	public static String getRandomEmailId() {
			PauseUtil.pause(2000);
			return "auto_" + RandomStringUtils.randomAlphanumeric(16) + "@mailinator.com";
	}
	
	public static String getDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date today = new Date();
		return simpleDateFormat.format(today);
	}

	public static String getPassword(String password) {
		if (password == null || password.equalsIgnoreCase("")) {
			return RandomStringUtils.randomAlphanumeric(5) + "01";
		} else {
			return password;
		}
	}

	public static String getPhoneNumber(String number) {
		if (number == null || number.equalsIgnoreCase("")) {
			return "78"
					+ RandomStringUtils.random(6, 0, 8, false, true, new char[]{'1', '2',
							'3', '4', '5', '6', '7', '8', '9'}) + "78";
		} else {
			return number;
		}
	}
}
