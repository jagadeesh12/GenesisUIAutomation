package com.dw.automation.pages.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.OrgCreditReqPage;
import com.dw.automation.support.PauseUtil;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

public class OrgCreditReqImpl extends BaseTestPage<TestPage> implements OrgCreditReqPage {

	@FindBy(locator = "rd.pm.orgCreditReqPage.option.orgcreditreq")
	private WebElement orgCreditReqOption;
	
	public WebElement getorgCreditReqOption() {
		return orgCreditReqOption;
	}
	
	@FindBy(locator = "rd.pm.orgCreditReqPage.icon.credit")
	private WebElement creditIcon;
	
	public WebElement getcreditIcon() {
		return creditIcon;
	}
	
	@FindBy(locator = "rd.pm.orgCreditReqPage.txtBox.credit")
	private WebElement creditTxtBox;
	
	public WebElement getcreditTxtBox() {
		return creditTxtBox;
	}
	
	@FindBy(locator = "rd.pm.orgCreditPage.txtBox.comment")
	private WebElement commentTxtBox;
	
	public WebElement getcommentTxtBox() {
		return commentTxtBox;
	}
	
	@FindBy(locator = "rd.pm.orgCreditPage.btn.update")
	private WebElement updateBtn;
	
	public WebElement getupdateBtn() {
		return updateBtn;
	}
	
	OrgCreateAndApproveImpl oca = new OrgCreateAndApproveImpl();
	WrapperFunctions wf = new WrapperFunctions();
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	TestBase testBase = TestBaseProvider.getTestBase();

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	
	public void applyForCredit(String domainName) {
		PauseUtil.pause(3000);
		wf.click_element(oca.getUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getorgCreditReqOption());
		oca.getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(oca.getsearchBtnPm());
		PauseUtil.pause(3000);
		wf.click_element(getcreditIcon());
		getcreditTxtBox().sendKeys(testBase.getTestData().getString("creditPMreq"));
		getcommentTxtBox().sendKeys(testBase.getTestData().getString("commentCredit"));
		wf.click_element(getupdateBtn());
		PauseUtil.pause(3000);
	}


	
	public void creditRequestBAM(String domainName) {
		wf.click_element(oca.getbamUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getorgCreditReqOption());
		
	}

}
