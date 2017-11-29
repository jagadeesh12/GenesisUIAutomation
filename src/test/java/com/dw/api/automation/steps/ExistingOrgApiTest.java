package com.dw.api.automation.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

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
import com.dw.api.automation.libs.Post;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

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
			
			String validatexistUrl="https://test.redington.market/api/v1/mulesoft/getCustomer/1010006770/1120";
			response=get.getRestServiceMethod(validatexistUrl, cook);
			System.out.println("response"+response.getStatus());
			logPassStatus("Validate sucessfull  for the Organisation Name=1010006770 MPN id=1120 "+"<br/>Response code="+response.getStatus());
		}
		
		@Test(priority = 3)
		public void validateExistingCustomerWithWrongOrganisationName()
		{
			
			String validatexistUrl="https://test.redington.market/api/v1/mulesoft/getCustomer/0000000000/1120";
			response=get.getRestServiceMethod(validatexistUrl, cook);
			System.out.println("response"+response.getStatus());
			logPassStatus("Validation unsucessfull  for the Organisation Name=0000000000 MPN id=1120 "+"<br/>Response code="+response.getStatus());
		}
		
		
		@Test(priority = 4)
		public void validateExistingCustomerWithWrongCompanyCode()
		{
			
			String validatexistUrl="https://test.redington.market/api/v1/mulesoft/getCustomer/1010006770/0000";
			response=get.getRestServiceMethod(validatexistUrl, cook);
			System.out.println("response"+response.getStatus());
			logPassStatus("Validate unsucessfull  for the Organisation Name=1010006770 MPN id=0000 "+"<br/>Response code="+response.getStatus());
		}
		
		
		@Test(priority = 5)
		public void editExistingCustomer() throws FileNotFoundException
		{
			
			
			String editExistcustomerUrl="https://test.redington.market/api/v1/partnerEntity/onboardSAPEntity/1010006770/1120";			
			
			
			//response=get.getRestServiceMethod(validatexistUrl, cook);
			//multivalued form data call
			 File initialFile = new File("C:/Users/rle0517/Desktop/6.jpg");
			InputStream targetStream1 = new FileInputStream(initialFile);
		    InputStream targetStream2 = new FileInputStream(initialFile);
		    InputStream targetStream3 = new FileInputStream(initialFile);
		    InputStream targetStream4 = new FileInputStream(initialFile);
		    InputStream targetStream5 = new FileInputStream(initialFile);

		    HashMap<String,InputStream> fileloc=new HashMap<String,InputStream>();  
			
		    fileloc.put("f1", targetStream1);
		    fileloc.put("f2", targetStream2);
		    fileloc.put("f3", targetStream3);
		    fileloc.put("f4", targetStream4);
		    fileloc.put("f5", targetStream5);
		    
		    
		    FormDataMultiPart formData = new FormDataMultiPart() ; 
		    formData.bodyPart(new FileDataBodyPart("logo", initialFile));
			
			//formData.field("tradeLicenseValidityFrom", "2017-11-04");
			
			formData.field("entityName", "");
			formData.field("empnId", "2131911");
			formData.field("addressLine1", "");
			formData.field("addressLine2", "Al Karama");
			formData.field("addressLine3", "Mohammad Sultan Belsalath Building, Office 219,");
			formData.field("city", "Dubai");
			formData.field("countryCode", "United Arab Emirates");
			formData.field("contactMobile", "97143963369");
			formData.field("phoneNumber", "");
			formData.field("signingAuthorityName", "2343243243");
			formData.field("signingAuthorityEmail", "sdsdsds@sdsdsd.com");
			formData.field("financeApproval", "false");
			formData.field("partnerSegment", "1: Reseller");
			formData.field("fqdn", "www.gggt.com");
			formData.field("vatId", "2312312312312");
			formData.field("termsAndConditions", "on");
			Post postcall=new Post();
			postcall.postMultiValuedWithAttachments(editExistcustomerUrl, fileloc, formData, cook);
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
