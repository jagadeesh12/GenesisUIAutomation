package com.dw.automation.pages.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.OrgCreateAndApprovePage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RConstantUtils;
import com.dw.automation.support.RUtils;
import com.dw.automation.support.RandomDataUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

import junit.framework.Assert;

public class OrgCreateAndApproveImpl extends BaseTestPage<TestPage> implements OrgCreateAndApprovePage {

	
	@FindBy(locator = "rd.orgonboard.usermenu")
	private WebElement UserMenu;
	
	@FindBy(locator = "rd.orgonboard.accmgmt")
	private WebElement AccountMgtMenu;
	
	@FindBy(locator = "rd.orgonboard.organization")
	private WebElement OrganizationMenu;
	
	@FindBy(locator = "rd.orgonboard.btn.Addbtn")
	private WebElement OrgAddBtn;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgname")
	private WebElement OrgNameTxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.mpnid")
	private WebElement MPNIDtxtBox;
	
	@FindBy(locator = "rd.orgonboard.btn.mpnverify")
	private WebElement mpnVerifyBtn;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgaddr1")
	private WebElement orgaddr1TxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgaddr2")
	private WebElement orgaddr2TxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgaddr3")
	private WebElement orgaddr3TxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.postalcode")
	private WebElement postalcodeTxtBox;
	
	@FindBy(locator = "rd.orgonboard.drpdwn.region")
	private WebElement regionDrpDwn;
	
	@FindBy(locator = "rd.orgonboard.drpdwn.country")
	private WebElement countryDrpDwn;
	
	public WebElement getOrgAddBtn() {
		return OrgAddBtn;
	}
	
	public WebElement getOrgNameTxtBox() {
		return OrgNameTxtBox;
	}
	
	public WebElement getMPNIDtxtBox() {
		return MPNIDtxtBox;
	}
	
	public WebElement getmpnVerifyBtn() {
		return mpnVerifyBtn;
	}
	
	public WebElement getorgaddr1TxtBox() {
		return orgaddr1TxtBox;
	}
	
	public WebElement getorgaddr2TxtBox() {
		return orgaddr2TxtBox;
	}
	public WebElement getorgaddr3TxtBox() {
		return orgaddr3TxtBox;
	}
	
	public WebElement getpostalcodeTxtBox() {
		return postalcodeTxtBox;
	}
	
	public WebElement getcountryDrpDwn() {
		return countryDrpDwn;
	}
	
	public WebElement getregionDrpDwn() {
		return regionDrpDwn;
	}
	
	public WebElement getAccountMgtMenu() {
		return AccountMgtMenu;
	}
	
	public WebElement getOrganizationMenu() {
		return OrganizationMenu;
	}
	
	public WebElement getUserMenu() {
		
		return UserMenu;
	}
	
	@FindBy(locator = "rd.orgonboard.drpdwn.city")
	private WebElement orgcity;
	
	public WebElement getorgcity() {
		return orgcity;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.mobile")
	private WebElement orgmobile;
	
	public WebElement getorgmobile() {
		return orgmobile;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.phone")
	private WebElement orgphone;
	
	public WebElement getorgphone() {
		return orgphone;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.signauthname")
	private WebElement orgsignauthname;
	
	public WebElement getorgsignauthname() {
		return orgsignauthname;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.signauthemail")
	private WebElement orgsignauthemail;
	
	public WebElement getorgsignauthemail() {
		return orgsignauthemail;
	}

	@FindBy(locator = "rd.orgonboard.rdBtn.finapproval")
	private WebElement orgfinapproval;
	
	public WebElement getorgfinapproval() {
		return orgfinapproval;
	}

	@FindBy(locator = "rd.orgonboard.drpdwn.partnersegmnt")
	private WebElement orgpartnersegmnt;
	
	public WebElement getorgpartnersegmnt() {
		return orgpartnersegmnt;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.compdomain")
	private WebElement orgcompdomain;
	
	public WebElement getorgcompdomain() {
		return orgcompdomain;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.tradelic")
	private WebElement orgtradelic;
	
	public WebElement getorgtradelic() {
		return orgtradelic;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.calendar")
	private WebElement orgtradecalendar;
	
	public WebElement getorgtradecalendar() {
		return orgtradecalendar;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.vatid")
	private WebElement orgvatid;
	
	public WebElement getorgvatid() {
		return orgvatid;
	}

	@FindBy(locator = "rd.orgonboard.chkbox.iagreechkbox")
	private WebElement orgiagreechkbox;
	
	public WebElement getiagreechkbox() {
		return orgiagreechkbox;
	}

	@FindBy(locator = "rd.orgonboard.btn.save")
	private WebElement orgsavebtn;
	
	public WebElement getorgsaveBtn() {
		return orgsavebtn;
	}


	@FindBy(locator = "rd.orgonboard.uploaf.file")
	private WebElement fileUpload;
	
	public WebElement getfileUpload() {
		return fileUpload;
	}
	
	@FindBy(locator = "rd.orgonboard.popUp.orgCreate")
	private WebElement orgCreate;
	
	public WebElement getffileUploadPopup() {
		return orgCreate;
	}

	
	@FindBy(locator = "rd.orgonboard.popUp.close")
	private WebElement closePopup;
	
	public WebElement getclosePopup() {
		return closePopup;
	}

	@FindBy(locator = "rd.orgonboard.bam.usermenu")
	private WebElement bamUserMenu;
	
	public WebElement getbamUserMenu() {
		return bamUserMenu;
	}
	
	@FindBy(locator = "rrd.orgonboard.bam.txtbox.search")
	private WebElement bamSearchTxtBox;
	
	public WebElement getbamSearchTxtBox() {
		return bamSearchTxtBox;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.btn.search")
	private WebElement bamSearchBtn;
	
	public WebElement getbamSearchBtn() {
		return bamSearchBtn;
	}
	
	
	WrapperFunctions wf = new WrapperFunctions();
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	TestBase testbase = TestBaseProvider.getTestBase();
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	public void goToOrgPage() {
		wf.click_element(getUserMenu());
		wf.click_element(getAccountMgtMenu());
		wf.click_element(getOrganizationMenu());
	
	}

	

	public String fillOrgForm() {
		wf.click_element(getOrgAddBtn());
		String orgName = testbase.getTestData().getString("orgname");
		String mpnId = testbase.getTestData().getString("mpnId");
		
		
		getOrgNameTxtBox().sendKeys(orgName);
		getMPNIDtxtBox().sendKeys(mpnId);
		wf.click_element(getmpnVerifyBtn());
		PauseUtil.pause(3000);
		RUtils.waitforloadingtodissappear();
		getOrgNameTxtBox().sendKeys(orgName);
		getorgaddr1TxtBox().sendKeys(testbase.getTestData().getString("orgAdd1"));
		getorgaddr2TxtBox().sendKeys(testbase.getTestData().getString("orgAdd2"));
		getorgaddr3TxtBox().sendKeys(testbase.getTestData().getString("orgAdd3"));
		getpostalcodeTxtBox().sendKeys(testbase.getTestData().getString("postalCode"));
		SCHUtils.selectOptionByvalue(getregionDrpDwn(), testbase.getTestData().getString("region"));
		SCHUtils.selectOptionByvalue(getcountryDrpDwn(), testbase.getTestData().getString("country"));
		SCHUtils.selectOptionByvalue(getorgcity(), testbase.getTestData().getString("city"));

		String number = null;
		getorgmobile().sendKeys(RandomDataUtil.getPhoneNumber(number));
		getorgphone().sendKeys(RandomDataUtil.getPhoneNumber(number));
		getorgsignauthname().sendKeys(testbase.getTestData().getString("signAuth"));
		getorgsignauthemail().sendKeys(testbase.getTestData().getString("signAuthEmail"));
		wf.click_element(getorgfinapproval());
		SCHUtils.selectOptionByvalue(getorgpartnersegmnt(), testbase.getTestData().getString("partnerSegment"));
		String name = RUtils.generateName();
		String domainName = "www."+name+".com";
		getorgcompdomain().sendKeys(domainName);
		getorgtradelic().sendKeys(testbase.getTestData().getString("tradeLi"));
		getorgtradecalendar().sendKeys(testbase.getTestData().getString("tradeLicCal"));
		getorgvatid().sendKeys(testbase.getTestData().getString("tradeLi"));
		PauseUtil.pause(30000);
		
//		String filePath = testbase.getContext().getString("filePath");
//	        //Uploading file
//	        StringSelection sel = new StringSelection(filePath);
//	        System.out.println("File location ===>" +sel);
//	        // Copy to clipboard
//	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
//	        System.out.println("selection" +sel);
//	        
//	        JavascriptExecutor j = (JavascriptExecutor) driver;
//	        j.executeScript("arguments[0].scrollIntoView(true);",getorgsaveBtn());
//	        //Code to add files in windows
//	        for (int i = 1;i<=4;i++){
//	        	WebElement wb = getfileUpload();
//	        	System.out.println(wb);
//	        	wf.click_element(wb);
////	            this.getElement(By.xpath("(//input[@class='form-control file-upload'])["+i+"]")).click();
//	            JavascriptExecutor je = (JavascriptExecutor) driver;
//	            Robot robot;
//				try {
//					robot = new Robot();
//					robot.keyPress(KeyEvent.VK_ENTER);
//		            robot.keyRelease(KeyEvent.VK_ENTER);
//		            robot.delay(2000);
//		            robot.keyPress(KeyEvent.VK_CONTROL);
//		            robot.keyPress(KeyEvent.VK_V);
//		            robot.keyRelease(KeyEvent.VK_V);
//		            robot.keyRelease(KeyEvent.VK_CONTROL);
//		            robot.keyPress(KeyEvent.VK_ENTER);
//		            robot.keyRelease(KeyEvent.VK_ENTER);
//				} catch (AWTException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	            
//	        /*        WebElement element = driver.findElement(By.xpath("//input[@class='form-control file-upload'])[4]"));
//	je.executeScript("arguments[0].scrollIntoView(true);",element);*/
//	            
//	        }
		JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",getorgsaveBtn());
		wf.click_element(getiagreechkbox());
		wf.click_element(getorgsaveBtn());
		RUtils.waitforloadingtodissappear();
		boolean partnerEnity = getffileUploadPopup().getText().contains(RConstantUtils.ORG_CREATE_SUCCESS);
        Assert.assertTrue("Partner Entity not created succesfully",partnerEnity);
        wf.click_element(getclosePopup());
		return domainName;
	}

	
	public void loginApplicationAsBAM() {

		String username = TestBaseProvider.getTestBase().getTestData().getString("userBam");
		String password = TestBaseProvider.getTestBase().getTestData().getString("passBam");
		RUtils.login(username,password);
        PauseUtil.waitForAjaxToComplete(4000);
		
	}

	
	public void approveOrg(String domainName) {
		wf.click_element(getbamUserMenu());
		wf.click_element(getAccountMgtMenu());
		wf.click_element(getOrganizationMenu());
		PauseUtil.pause(3000);
		getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(getbamSearchBtn());
		
		
	}

}
