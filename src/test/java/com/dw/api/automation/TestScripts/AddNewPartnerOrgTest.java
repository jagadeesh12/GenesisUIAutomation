package com.dw.api.automation.TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;
import com.dw.api.automation.libs.Post;
import com.dw.api.automation.pagefactory.ApiLoginPF;
import com.dw.api.automation.pagefactory.OrganisationPF;
import com.dw.api.automation.utils.Configurations;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

public class AddNewPartnerOrgTest {
	
	static NewCookie cook;
	ApiLoginPF login=new ApiLoginPF();
	Get get = new Get();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId;
	private List li;
	OrganisationPF org=new OrganisationPF();
	String testColomName="AddNewPartnerOrgTest";
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}
	/*Login to Application as Site Admin*/
	@Test(priority = 1)
	public void loginAsPm()
	{
		test = ExtentManager.loggerInstance(extent, " Use Case: Add New Partner Organisation Test");
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
		logPassStatus("login to Application  as P.M with <br/> Userid="+username+"<br/>Password="+password);
	}
	
	/*Verify MPN Id*/
	@Test(priority =2)
	public void verifyMpnId()
	{
		cook=login.loginAsPM();
		testdatamap = FilloExcelUtility.readExcelWithTestName("AddNewPartnerOrgTest");
		String verifyMPNidUrl = testdatamap.get("verifyMPNidUrl");
		System.out.println("Basic verifyMPNidUrl=" + verifyMPNidUrl);
		String mPNid = testdatamap.get("MPNid");
		System.out.println("MPNid=" + mPNid);
		verifyMPNidUrl=verifyMPNidUrl+mPNid;
		System.out.println(" verifyMPNidUrl=" + verifyMPNidUrl);
		response = get.getRestServiceMethod(verifyMPNidUrl, cook);
		logPassStatus("Validate MPN id="+mPNid);
	}
	
	@Test(priority = 3)
	public void addNewPartnerOrganisation()  {
		cook=login.loginAsPM();
		
		try {
			response=org.addNewPartnerOrganisation(testColomName, cook);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logPassStatus("Partner Organization created successfully.");
		
	}
	@Test(priority =4)
	public void approveNewOrgByBAM()
	{
		cook=login.loginAsBAM();
		org.approveNewOrganisationByBam(testColomName);
		logPassStatus("Partner Organization Approved From B.A.M");

	}
	
	@Test(priority =5)
	public void approveNewOrgByCA()
	{
		cook=login.loginAsCA();
		OrganisationPF org=new OrganisationPF();
		org.approveNewOrganisationByCA(testColomName);
		logPassStatus("Partner Organization Approved From B.A.M");

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
