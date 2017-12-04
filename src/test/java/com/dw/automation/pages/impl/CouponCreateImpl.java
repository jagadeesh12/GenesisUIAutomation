package com.dw.automation.pages.impl;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.dw.automation.pages.CouponCreatePage;
import com.dw.automation.pages.OrgCreateAndApprovePage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RUtils;
import com.dw.automation.support.SCHUtils;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
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
	
	@FindBy(locator = "rd.bam.addCoupon.form.drpdwn.product")
	private WebElement selectProductDrpDwn;
	
	public WebElement getselectProductDrpDwn() {
		return selectProductDrpDwn;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.form.txtBox.discount")
	private WebElement discountTxtBox;
	
	public WebElement getsdiscountTxtBox() {
		return discountTxtBox;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.txtbox.search")
	private WebElement searchTxtBox;
	
	public WebElement getsearchTxtBox(){
		return searchTxtBox;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.btn.search")
	private WebElement searchBtn;
	
	public WebElement getsearchBtn(){
		return searchBtn;
	}
	
	@FindBy(locator = "rd.bam.addCoupon.txt.couponCode")
	private WebElement couponCode;
	
	public WebElement getcouponCodeTxt(){
		return couponCode;
	}
	
	
	
	
	WrapperFunctions wf = new WrapperFunctions();
	OrgCreateAndApproveImpl oca = new OrgCreateAndApproveImpl();
	TestBase testBase = TestBaseProvider.getTestBase();
	WebDriver driver = TestBaseProvider.getTestBase().getDriver();
	
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	
	public void goToCouponPage() {
		//wf.click_element(getapproveIcon());
		wf.click_element(getapproveIcon());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getcouponBtn());
		PauseUtil.pause(3000);
		
	}


	
	public void addCoupon() {
		wf.click_element(oca.getOrgAddBtn());
		PauseUtil.pause(3000);
		//RUtils.waitforloadingtodissappear();
		String org =  PartnerUserPageImpl.readXML("orgname");
		String domainName = PartnerUserPageImpl.readXML("domain");
		
		SCHUtils.selectOptionByVisibleText(getorgdrpdwn(), org + " - "+ domainName.toLowerCase());
		String custName = PartnerUserPageImpl.readXML("custdomain");

		try {
			//SCHUtils.selectOptionByVisibleText(getdrpdwnCust(), custName+" - "+custName.toLowerCase()+".onmicrosoft.com");
			//getdrpdwnCust().click();
		Select sel = new Select(getdrpdwnCust());
		sel.selectByVisibleText( custName+" - "+custName.toLowerCase()+".onmicrosoft.com");
		SCHUtils.selectOptionByVisibleText(getdrpdwnCust() ,"CUST04121144 - cust04121144.onmicrosoft.com");
		PauseUtil.pause(5000);
		}catch(Exception e) {
			 Select sel = new Select(getdrpdwnCust());
		     sel.selectByVisibleText("CUST04121144 - cust04121144.onmicrosoft.com");
			System.out.println("Selecting using index");
		//SCHUtils.selectOptionByIndex(getdrpdwnCust(), 1);
			((JavascriptExecutor)driver).executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }", getdrpdwnCust(),"CUST04121144 - cust04121144.onmicrosoft.com" );

		}
		SCHUtils.selectOptionByVisibleText(getdrpdwnCountryCode(), "USD");
		wf.click_element(getnextBtn());
		SCHUtils.selectOptionByVisibleText(getselectProductDrpDwn(), testBase.getTestData().getString("product"));
		getquantityTxtBox().sendKeys(testBase.getTestData().getString("quantity"));
		getsdiscountTxtBox().sendKeys(testBase.getTestData().getString("discount"));
		wf.click_element(getCouponGenerateBtn());
		
		
		
	}


	
	public void getCouponNumber() {
		
		PauseUtil.pause(5000);
		getsearchTxtBox().sendKeys(PartnerUserPageImpl.readXML("domain").toLowerCase());
		wf.click_element(getsearchBtn());
		PauseUtil.pause(2000);
		String code = getcouponCodeTxt().getText();
		PartnerUserPageImpl.writeXML("couponCode","cust",code, "0000");
	}

}
