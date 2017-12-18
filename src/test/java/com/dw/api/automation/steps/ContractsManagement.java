package com.dw.api.automation.steps;

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
import com.dw.api.automation.libs.CertificateHandle;
import com.dw.api.automation.libs.Delete;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;
import com.dw.api.automation.libs.ParseJsonArray;
import com.dw.api.automation.libs.Post;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class ContractsManagement {

	/* Login to Application */
	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	Post post=new Post();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, String> testdatamap = null;
	Delete delete=new Delete();
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		testdatamap = FilloExcelUtility.readExcel();
		test = ExtentManager.loggerInstance(extent, " Test case: Contracts Management");
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		cook = lgoin.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");

	}
	
	@Test(priority = 2)
	/*Contract Down size*/
	public void contractDownsize()
	{
		//Step 1:get _id for contract down size
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String contractDownSizeGetIdUrl="https://test.redington.market/api/v1/contract?page=1&pageSize=10&sortBy=createdOn&sortOrder=desc&filterBy=contractTerminated:false&searchKey="+companyName+"";
	    System.out.println("contractDownSizeGetIdUrl="+contractDownSizeGetIdUrl);
		String res = get.getRestServiceMethod2(contractDownSizeGetIdUrl, cook);
	    Object _id = ParseJsonArray.parseJsonArray(res, "data", "docs", "_id");
	    System.out.println("_id="+_id);
	    
	    //Step 2:Downsize the order by 1 value
	   String contractDownSizeUrl="https://test.redington.market/api/v1/contract/"+_id+"/1";
	   System.out.println("contractDownSizeUrl="+contractDownSizeUrl);
	   String contractDownSizeUrlPayload="{\"headers\":{\"Content-Type\":[\"application/json; charset=utf-8\"],\"user-role\": [\"PM\"],\"Cache-Control\": [\"no-cache\",\"no-cache\",\" no-store\",\" must-revalidate\"],\"Pragma\": [\"no-cache\" ],\"Expires\": [ \"-1\"]}}"; 
	   	//	post.getPostByJersey(contractDownSizeUrl, contractDownSizeUrlPayload, cook);
	   logPassStatus("Contract downsize For BaseProduct  done sucessfully");
	}
	
	@Test(priority = 3)
	/*Contract Down size*/
	public void contractDeactivate()
	{
		//Step 1:get _id for contract down size
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String contractDownSizeGetIdUrl="https://test.redington.market/api/v1/contract?page=1&pageSize=10&sortBy=createdOn&sortOrder=desc&filterBy=contractTerminated:false&searchKey="+companyName+"";
	    System.out.println("contractDownSizeGetIdUrl="+contractDownSizeGetIdUrl);
		String res = get.getRestServiceMethod2(contractDownSizeGetIdUrl, cook);
	    Object _id = ParseJsonArray.parseJsonArray(res, "data", "docs", "_id");
	    System.out.println("_id="+_id);
	    
	    //Step 2:Downsize the order by 1 value
	   String contractDeactivateUrl="https://test.redington.market/api/v1/contract/"+_id+"";
	   System.out.println("contractDownSizeUrl="+contractDeactivateUrl);
	   delete.delete(contractDeactivateUrl,  cook);
	   logPassStatus("Contract Deactivate for the Company="+companyName);   		
	    
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
