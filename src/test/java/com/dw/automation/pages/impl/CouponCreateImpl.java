package com.dw.automation.pages.impl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.CouponCreatePage;
import com.dw.automation.pages.OrgCreateAndApprovePage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RUtils;
import com.dw.automation.support.SCHUtils;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestPage;

public class CouponCreateImpl extends BaseTestPage<TestPage> implements CouponCreatePage  {
	
	@FindBy(locator = "rd.bam.homepage.userbtn")
	private WebElement userBtn;
	
	public WebElement getapproveIcon() {
		return userBtn;
	}
	
	@FindBy(locator = "rd.bam.homepage.option.coupon")
	private WebElement couponBtn;
	
	public WebElement getcouponBtn() {
		return couponBtn;
	}

	@FindBy(locator = "rd.bam.addCoupon.form.drpdwn.org")
	private WebElement orgdrpdwn;
	
	public WebElement getorgdrpdwn() {
		return orgdrpdwn;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.form.drpdwn.cust")
	private WebElement drpDwnCust;
	
	public WebElement getdrpdwnCust() {
		return drpDwnCust;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.form.drpdwn.countryCode")
	private WebElement drpdwnCountryCode;
	
	public WebElement getdrpdwnCountryCode() {
		return drpdwnCountryCode;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.form.btn.next")
	private WebElement nextBtn;
	
	public WebElement getnextBtn() {
		return nextBtn;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.form.txtBox.quantity")
	private WebElement quantityTxtBox;
	
	public WebElement getquantityTxtBox() {
		return quantityTxtBox;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.form.btn.generate")
	private WebElement generateBtn;
	
	public WebElement getCouponGenerateBtn() {
		return generateBtn;
	}
	
	
	
	
	
	WrapperFunctions wf = new WrapperFunctions();
	OrgCreateAndApproveImpl oca = new OrgCreateAndApproveImpl();
	
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	
	public void goToCouponPage() {
		wf.click_element(getapproveIcon());
		wf.click_element(getapproveIcon());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getcouponBtn());
		PauseUtil.pause(3000);
		
	}


	
	public void addCoupon() {
		wf.click_element(oca.getOrgAddBtn());
		PauseUtil.pause(3000);
		//RUtils.waitforloadingtodissappear();
		SCHUtils.selectOptionByVisibleText(getorgdrpdwn(), "Burhani Computers Trading LLC - www.pmfn29111057.com");
		//SCHUtils.selectOptionByVisibleText(getdrpdwnCoupon(), "CUST29111103 - cust29111103.onmicrosoft.com");
		SCHUtils.selectOptionByIndex(getdrpdwnCust(), 1);
		SCHUtils.selectOptionByVisibleText(getdrpdwnCountryCode(), "USD");
		wf.click_element(getnextBtn());
		getquantityTxtBox().sendKeys("3");
		wf.click_element(getCouponGenerateBtn());
		
		
		
	}

}
