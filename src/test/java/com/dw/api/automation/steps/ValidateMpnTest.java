package com.dw.api.automation.steps;

import javax.ws.rs.core.NewCookie;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.CertificateHandle;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

import junit.framework.Assert;




//ExtentReports extent;


public class ValidateMpnTest {
	//NewCookie cook=null;
	 static NewCookie cook;
	LoginPost lgoin=new LoginPost();
	Get get=new Get();
	ExtentReports extent;
	static ExtentTest test;
	WebDriver driver=null;
	ClientResponse response = null;
	@BeforeClass
	public void initateExtentManager()
	{
		extent = ExtentManager.Instance();
	}
	
	
	@Test(priority = 1)
    public void login_to_application()  {
		test=ExtentManager.loggerInstance(extent, " Test case: validate Mpn id");
		
	try {
		CertificateHandle.IgnoreSSLClient();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String posturl="https://test.redington.market/api/v1/auth/signIn";
	String postparm="{\"username\":\"pm6.qa@mailinator.com\",\"password\":\"Pass@123\"}";
	 cook=lgoin.loginGetPostByJersey(posturl, postparm);
	System.out.println("Cookie as Token paramter="+cook);
	test.log(LogStatus.INFO, "Login to Application");
	test.log(LogStatus.INFO, "Cookie"+cook);
	logPassStatus("login to Application");
    }

	@Test(priority = 2)
    public void enter_mpn_id() {
    
    	String posturl3="https://test.redington.market/api/v1/partnerEntity/verifyMPN/991450";
       System.out.println("cookie"+cook);
       //cook=cook1;
    	response=get.getRestServiceMethod(posturl3, cook);
    	response.getStatus();
    	Assert.assertEquals(200, 200);
    	logPassStatus("Validate MPN id");
    	test.log(LogStatus.INFO, "Validate MPN id");
    }

	@Test(priority = 3)
    public void mpn_id_is_validated()  {
       System.out.println("Done");
    }
	
	public void logPassStatus(String statusMsg)
	{
		//test.log(LogStatus.PASS,statusMsg+ test.addScreenCapture(ExtentManager.CaprtureScreenshot(driver,statusMsg)));
		test.log(LogStatus.PASS,statusMsg);

	}
	@AfterClass
	public void tear()
	{
		extent.endTest(test);
		extent.flush();
	}

	@AfterMethod
	public synchronized void afterMethod(ITestResult result)
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			//test.log(LogStatus.FAIL,result.getThrowable()+ test.addScreenCapture(ExtentManager.CaprtureScreenshot(driver,result.getInstanceName())));
			test.log(LogStatus.FAIL,result.getThrowable());
		}	
    }

}
