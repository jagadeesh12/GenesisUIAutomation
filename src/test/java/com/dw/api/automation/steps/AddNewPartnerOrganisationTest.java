package com.dw.api.automation.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

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

import junit.framework.Assert;

public class AddNewPartnerOrganisationTest {
	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;

	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		test = ExtentManager.loggerInstance(extent, " Add New Partner Organisation");

		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String posturl = "https://test.redington.market/api/v1/auth/signIn";
		String postparm = "{\"username\":\"pm6.qa@mailinator.com\",\"password\":\"Pass@123\"}";
		cook = lgoin.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");
	}
	
	
	@Test(priority = 2)
    public void enter_mpn_id() {
      String posturl3="https://test.redington.market/api/v1/partnerEntity/verifyMPN/991450";
       System.out.println("cookie"+cook);
       //cook=cook1;
    	response=get.getRestServiceMethod(posturl3, cook);
    	Assert.assertEquals(200, 200);
    	logPassStatus("Validate MPN id"+"<br/>rep"+response.getStatus());
    	   }
	
	
	
	@Test(priority = 3)
	public void addNewPartnerOrganisation() throws FileNotFoundException  {
		String posturl4="https://test.redington.market/api/v1/partnerEntity";
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
    	formData.bodyPart(new FileDataBodyPart("Trade License Copy with Partners Page",initialFile));
    	formData.bodyPart(new FileDataBodyPart("MOA / Shareholding letter (whichever is applicable)", initialFile));
    	formData.bodyPart(new FileDataBodyPart("Trade License Copy with Share Certificate", initialFile));
    	formData.bodyPart(new FileDataBodyPart("Owner/Decision Maker/Authorized Signatory Passport Copy with Visa Page", initialFile));
    	formData.field("tradeLicenseValidityFrom", "2017-11-04");
    	formData.field("tradeLicenseValidityTo", "2017-11-26");
    	formData.field("existingType", "New");
    	formData.field("entityName", "Burhani Computers Trading LLC");
    	formData.field("mpnId", "991450");
    	formData.field("addressLine1", "sdsa666dsdsdadsd");
    	formData.field("addressLine2", "sad777asdasdasdasdd");
    	formData.field("addressLine3", "asd888asdasdas");
    	formData.field("pinCode", "60254");
    	formData.field("countryCode", "ARE");
    	formData.field("region", "008");
    	formData.field("city", "dubai");
    	formData.field("contactMobile", "342000424424242");
    	formData.field("phoneNumber", "2323299243232");
    	formData.field("signingAuthorityName", "sddsrrrrrdsdsd");
    	formData.field("signingAuthorityEmail", "ssserrrsss@fff.com");
    	formData.field("financeApproval", "false");
       	formData.field("partnerSegment", "Advisor & Consulting Services");
    	formData.field("fqdn", "www.dddr44fr44r43d.com");
    	formData.field("tradeLicenseNo", "323404999002222");
    	formData.field("vatId", "434322002342");
    	formData.field("termsAndConditions", "on");   
    	Post postcall=new Post();
    	
    	response=postcall.postMultiValuedWithAttachments(posturl4, fileloc, formData, cook);
    	Assert.assertEquals("Partner organization with these details already exits in the system",200 , response.getStatus());
    	
    	//System.out.println(response.toString());
    	//logPassStatus("New Partner created   "+"<br/>Response=" +response.toString());
    	logPassStatus("New Partner created");
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
			// test.log(LogStatus.FAIL,result.getThrowable()+
			// test.addScreenCapture(ExtentManager.CaprtureScreenshot(driver,result.getInstanceName())));
			test.log(LogStatus.FAIL, result.getThrowable());
		}
	}

}
