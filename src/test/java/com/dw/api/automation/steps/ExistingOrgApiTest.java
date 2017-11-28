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

public class ExistingOrgApiTest {
	 static NewCookie cook;
		LoginPost lgoin=new LoginPost();
		Get get=new Get();
		ExtentReports extent;
		static ExtentTest test;
		ClientResponse response = null;
		@BeforeClass
		public void initateExtentManager()
		{
			extent = ExtentManager.Instance();
		}
		
		
		@Test(priority = 1)
	    public void login_to_application()  {
			test=ExtentManager.loggerInstance(extent, " Test case: Existing Organisation Api Test");
			
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
		logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");
	    }
		
		
		
		@Test(priority = 3)
		public void validateExistingCustomer()
		{
			System.out.println("im here");
			String validatexistUrl="https://test.redington.market/api/v1/mulesoft/getCustomer/1010006770/1120";
			response=get.getRestServiceMethod(validatexistUrl, cook);
			System.out.println("response"+response.getStatus());
			logPassStatus("Validate sucessfull  for the Organisation Name=1010006770 MPN id=1120 "+"<br/>Response code="+response.getStatus());
		}
		
		@Test(priority = 3)
		public void validateExistingCustomerWithWrongOrganisationName()
		{
			System.out.println("im here");
			String validatexistUrl="https://test.redington.market/api/v1/mulesoft/getCustomer/0000000000/1120";
			response=get.getRestServiceMethod(validatexistUrl, cook);
			System.out.println("response"+response.getStatus());
			logPassStatus("Validation unsucessfull  for the Organisation Name=0000000000 MPN id=1120 "+"<br/>Response code="+response.getStatus());
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
