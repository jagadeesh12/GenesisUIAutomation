package com.dw.api.automation.TestScripts;

import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.CertificateHandle;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;
import com.dw.api.automation.libs.Post;
import com.dw.api.automation.pagefactory.ApiLoginPF;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class LoginTest 
{
static NewCookie cook;
ApiLoginPF login=new ApiLoginPF();
Get get = new Get();
Post post = new Post();
ExtentReports extent;
static ExtentTest test;
ClientResponse response = null;
HashMap<String, String> testdatamap = null;
	
    @BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}
    
    //Login As P.A
    @Test(priority = 1)
	public void loginAsPM() {
		test = ExtentManager.loggerInstance(extent, " Use Case: Test All Possible Login's");
		//testdatamap = FilloExcelUtility.readExcel();
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		 String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		System.out.println("postparm="+postparm);
		cook = login.login(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application  as P.M with <br/> Userid="+username+"<br/>Password="+password);
	}
    
    //Login As B.A.M
    @Test(priority =2)
    public void loginAsBAM()
    {
    	
    	testdatamap = FilloExcelUtility.readExcelWithTestName("login");
    	String posturl = testdatamap.get("testurl");
    	String bamusername = testdatamap.get("bamusername");
		System.out.println("bamusernamee==" + bamusername);
		String bampassword = testdatamap.get("bampassword");
		System.out.println("bampassword==" + bampassword);
		String postparm = "{\"username\":\""+bamusername+"\",\"password\":\""+bampassword+"\"}";
		System.out.println("postparm="+postparm);
		cook = login.login(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application  as B.A.M with <br/> Userid="+bamusername+"<br/>Password="+bampassword);
	    }
    
    //Login As B.A.M
    @Test(priority =2)
    public void loginAsCA()
    {
    	testdatamap = FilloExcelUtility.readExcelWithTestName("login");
    	String posturl = testdatamap.get("testurl");
    	String causername = testdatamap.get("causername");
		System.out.println("bamusernamee=" + causername);
		String capassword = testdatamap.get("capassword");
		System.out.println("bampassword=" + capassword);
		String postparm = "{\"username\":\""+causername+"\",\"password\":\""+capassword+"\"}";
		System.out.println("postparm="+postparm);
		cook = login.login(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application  as C.A with <br/> Userid="+causername+"<br/>Password="+capassword);
	    }
    
    
    
    
    
    public void logPassStatus(String statusMsg) {
		test.log(LogStatus.PASS, statusMsg);

	}

	@AfterClass
	public void tear() {
		extent.endTest(test);
		extent.flush();
	}

	@AfterMethod
	public synchronized void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		}
	}
}
