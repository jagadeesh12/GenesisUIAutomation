package com.dw.api.automation.pagefactory;

import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import com.dw.api.automation.libs.CertificateHandle;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.LoginPost;

public class ApiLoginPF {

	static NewCookie cook;
	HashMap<String, String> testdatamap = null;

	/* Login as P.M */
	public NewCookie login(String postUrl, String postparm) {
		/* Handle Certificate */
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LoginPost login = new LoginPost();
		cook = login.loginGetPostByJersey(postUrl, postparm);
		System.out.println("Cookie for P.M Login=" + cook);
		return cook;
	}

	/* Login as P.M */
	public NewCookie loginAsPM() {
		/* Handle Certificate */
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		System.out.println("postparm=" + postparm);
		LoginPost login = new LoginPost();
		cook = login.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie for P.M Login=" + cook);
		return cook;
	}

	/* Login as BAM */
	public NewCookie loginAsBAM() {
		/* Handle Certificate */
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("bamusername");
		System.out.println("User name==" + username);
		String password = testdatamap.get("bampassword");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		System.out.println("postparm=" + postparm);
		ApiLoginPF login = new ApiLoginPF();
		cook = login.login(posturl, postparm);
		return cook;
	}
	
	
	public NewCookie loginAsCA() {
		/* Handle Certificate */
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
	
		 testdatamap = FilloExcelUtility.readExcelWithTestName("login");
			String posturl = testdatamap.get("testurl");
			System.out.println("Login Url=" + posturl);
			String username = testdatamap.get("causername");
			System.out.println("CA User name==" + username);
			String password = testdatamap.get("capassword");
			System.out.println("CA Password==" + password);
			String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
			System.out.println("postparm="+postparm);
			ApiLoginPF login=new ApiLoginPF();
			 cook=login.login(posturl, postparm);
			 return cook;

	
	}
	
}
