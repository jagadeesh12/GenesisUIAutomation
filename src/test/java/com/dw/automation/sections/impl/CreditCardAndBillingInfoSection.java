package com.dw.automation.sections.impl;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dw.automation.sections.ICreditCardAndBillingInfoSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RandomDataUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

public class CreditCardAndBillingInfoSection extends Section
		implements
			ICreditCardAndBillingInfoSection {

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.nameoncard")
	private WebElement txtNameOnCard;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.cardnumber")
	private WebElement txtCardNumber;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.img.cardicon")
	private WebElement imgCardIcon;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expirymonth")
	private WebElement drpCardExpiryMonth;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expiryyear")
	private WebElement drpCardExpiryYear;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.securitycode")
	private WebElement txtCardSecurityCode;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.lnk.cvntooltip")
	private WebElement lnkCardCvnToolTip;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.cvntooltip.lbl.tooltipcontent")
	private WebElement lblCardCvnToolTipContent;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.firstname")
	private WebElement txtBillingFirstName;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.lastname")
	private WebElement txtBillingLastName;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addressone")
	private WebElement txtBillingAddressOne;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addresstwo")
	private WebElement txtBillingAddressTwo;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.zip")
	private WebElement txtBillingZip;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.city")
	private WebElement txtBillingCity;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.state")
	private WebElement drpBillingState;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.country")
	private WebElement drpBillingCountry;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.phonenumber")
	private WebElement txtBillingPhoneNumber;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.editcardinfo.btn.cancel")
	private WebElement btnCancel;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.editcardinfo.btn.save")
	private WebElement btnSave;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.scrollbarmonth")
	private WebElement scrollmonth;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.scrollbaryear")
	private WebElement scrollyear;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.nameoncard.validation")
	private WebElement validateCardname;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.cardnumber.validation")
	private WebElement validateCardNumber;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.cvn.validation")
	private WebElement validateCvn;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.expirymonth.validation")
	private WebElement validateExpMonth;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.expiryyear.validation")
	private WebElement validateExpYear;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.firstname.validation")
	private WebElement validateFirstName;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.lasttname.validation")
	private WebElement validateLastname;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.address1.validation")
	private WebElement validateAddress1;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.zip.validation")
	private WebElement validateZip;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.city.validation")
	private WebElement validateCity;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.state.validation")
	private WebElement validateState;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.country.validation")
	private WebElement validateCountry;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.phonenumber.validation")
	private WebElement validatePhoneNumber;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.form")
	private WebElement formCreditcard;

	public WebElement getFormCreditcard() {
		return formCreditcard;
	}

	public WebElement getValidateCardname() {
		return validateCardname;
	}

	public WebElement getValidateCardNumber() {
		return validateCardNumber;
	}

	public WebElement getValidateCvn() {
		return validateCvn;
	}

	public WebElement getValidateExpMonth() {
		return validateExpMonth;
	}

	public WebElement getValidateExpYear() {
		return validateExpYear;
	}

	public WebElement getValidateFirstName() {
		return validateFirstName;
	}

	public WebElement getValidateLastname() {
		return validateLastname;
	}

	public WebElement getValidateAddress1() {
		return validateAddress1;
	}

	public WebElement getValidateZip() {
		return validateZip;
	}

	public WebElement getValidateCity() {
		return validateCity;
	}

	public WebElement getValidateState() {
		return validateState;
	}

	public WebElement getValidateCountry() {
		return validateCountry;
	}

	public WebElement getValidatePhoneNumber() {
		return validatePhoneNumber;
	}

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.error.lbl.invalidcardnumber")
	private WebElement lblErrInvalidCardNumber;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.error.lbl.enterparticularfield")
	private WebElement lblErrEnterParticularField;

	public WebElement getScrollyear() {
		return scrollyear;
	}

	public WebElement getScrollmonth() {
		return scrollmonth;
	}

	public CreditCardAndBillingInfoSection(By by) {
		super(by);
	}

	public CreditCardAndBillingInfoSection(String loc) {
		super(LocatorUtils.getBy(loc));
	}

	@Override
	public boolean isPageActive() {
		return true;
	}

	public WebElement getTxtNameOnCard() {
		return txtNameOnCard;
	}

	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}

	public WebElement getImgCardIcon() {
		return imgCardIcon;
	}

	public WebElement getDrpCardExpiryMonth() {
		return drpCardExpiryMonth;
	}

	public WebElement getDrpCardExpiryYear() {
		return drpCardExpiryYear;
	}

	public WebElement getTxtCardSecurityCode() {
		return txtCardSecurityCode;
	}

	public WebElement getLnkCardCvnToolTip() {
		return lnkCardCvnToolTip;
	}

	public WebElement getLblCardCvnToolTipContent() {
		return lblCardCvnToolTipContent;
	}

	public WebElement getTxtBillingFirstName() {
		return txtBillingFirstName;
	}

	public WebElement getTxtBillingLastName() {
		return txtBillingLastName;
	}

	public WebElement getTxtBillingAddressOne() {
		return txtBillingAddressOne;
	}

	public WebElement getTxtBillingAddressTwo() {
		return txtBillingAddressTwo;
	}

	public WebElement getTxtBillingZip() {
		return txtBillingZip;
	}

	public WebElement getTxtBillingCity() {
		return txtBillingCity;
	}

	public WebElement getDrpBillingState() {
		return drpBillingState;
	}

	public WebElement getDrpBillingCountry() {
		return drpBillingCountry;
	}

	public WebElement getTxtBillingPhoneNumber() {
		return txtBillingPhoneNumber;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	@Override
	public void clickOnCancel() {
		getBtnCancel().click();
	}
	@Override
	public WebElement getBtnSave() {
		return btnSave;
	}

	@Override
	public WebElement getLblErrInvalidCardNumber() {
		return lblErrInvalidCardNumber;
	}

	public WebElement getLblErrEnterParticularField() {
		return lblErrEnterParticularField;
	}

	@Override
	public void waitForPageLoad() {
		WaitUtils.waitForDisplayed(getTxtNameOnCard());
	}

	@Override
	public void fillCreditCardSecurityCode(Configuration data) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		WaitUtils.waitForEnabled(getTxtNameOnCard());
		WaitUtils.waitForDisplayed(getTxtNameOnCard());
		WaitUtils.waitForEnabled(getTxtCardSecurityCode());
		getTxtCardSecurityCode().clear();
		getTxtCardSecurityCode().sendKeys(data.getString("securitycode"));
		PauseUtil.pause(2000);
	}

	@Override
	public boolean isCreditCardSection() {
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		if (SCHUtils.isPresent(getTxtNameOnCard())) {
			return true;
		}
		return false;
	}
	@Override
	public void fillCreditCardAndBillingInfoSection(Configuration data) {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(10000);
		// WaitUtils.waitForEnabled(getTxtNameOnCard());
		// WaitUtils.waitForDisplayed(getTxtNameOnCard());
		SCHUtils.scrollToView(getTxtNameOnCard());
		PauseUtil.pause(10000);
		SCHUtils.clickUsingJavaScript(getTxtNameOnCard());
		getTxtNameOnCard().clear();
		getTxtNameOnCard().sendKeys(data.getString("cardname"));
		String cardnumber = data.getString("cardnumber");
		if (getTxtCardNumber().isDisplayed()) {
			getTxtCardNumber().clear();
			getTxtCardNumber().sendKeys(cardnumber);
			PauseUtil.pause(3000);
	        String cardvalue = getTxtCardNumber().getAttribute("value");
	        String digits = cardvalue.substring(cardvalue.length()-4);
	        System.out.println("last four digits is :"+digits);
	        TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
			PauseUtil.pause(2000);
			JavascriptExecutor jsExecutor =
					(JavascriptExecutor) TestBaseProvider.getTestBase().getDriver();
			jsExecutor.executeScript("$(arguments[0]).change();", getTxtCardNumber());
			/*SCHUtils.selectItemByText(data.getString("expmonth"),getDrpCardExpiryMonth());
			PauseUtil.waitForAjaxToComplete(1000);
			SCHUtils.selectItemByText(data.getString("expyear"), getDrpCardExpiryYear());*/
			
			SCHUtils.selectOptionsByVisibleText(getDrpCardExpiryMonth(),
					ConstantUtils.EXPMONTH);
			PauseUtil.waitForAjaxToComplete(2500);
			SCHUtils.selectOptionsByVisibleText(getDrpCardExpiryYear(),
					ConstantUtils.EXPYEAR);
			

		} else {
			SCHUtils.selectItemByText(data.getString("expmonth"),
					getDrpCardExpiryMonth());
			SCHUtils.selectItemByText(data.getString("expyear"), getDrpCardExpiryYear());
		}

		getTxtCardSecurityCode().clear();
		getTxtCardSecurityCode().sendKeys(data.getString("securitycode"));
		

		
	}
	
	@Override
	public void fillCreditCardAndBillingInfoSection(Configuration data, int parentNumber) {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(10000);
		// WaitUtils.waitForEnabled(getTxtNameOnCard());
		// WaitUtils.waitForDisplayed(getTxtNameOnCard());
		SCHUtils.scrollToView(getTxtNameOnCard());
		PauseUtil.pause(10000);
		SCHUtils.clickUsingJavaScript(getTxtNameOnCard());
		getTxtNameOnCard().clear();
		getTxtNameOnCard().sendKeys(data.getString("cardname" + parentNumber));
		String cardnumber = data.getString("cardnumber" + parentNumber);
		if (getTxtCardNumber().isDisplayed()) {
			getTxtCardNumber().clear();
			getTxtCardNumber().sendKeys(cardnumber);
			PauseUtil.pause(3000);
	        String cardvalue = getTxtCardNumber().getAttribute("value");
	        String digits = cardvalue.substring(cardvalue.length()-4);
	        System.out.println("last four digits is :"+digits);
	        TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
			PauseUtil.pause(2000);
			JavascriptExecutor jsExecutor =
					(JavascriptExecutor) TestBaseProvider.getTestBase().getDriver();
			jsExecutor.executeScript("$(arguments[0]).change();", getTxtCardNumber());
			/*SCHUtils.selectItemByText(data.getString("expmonth"),getDrpCardExpiryMonth());
			PauseUtil.waitForAjaxToComplete(1000);
			SCHUtils.selectItemByText(data.getString("expyear"), getDrpCardExpiryYear());*/
			
			SCHUtils.selectOptionsByVisibleText(getDrpCardExpiryMonth(),
					ConstantUtils.EXPMONTH);
			PauseUtil.waitForAjaxToComplete(2500);
			SCHUtils.selectOptionsByVisibleText(getDrpCardExpiryYear(),
					ConstantUtils.EXPYEAR);
			

		} else {
			SCHUtils.selectItemByText(data.getString("expmonth" + parentNumber),
					getDrpCardExpiryMonth());
			SCHUtils.selectItemByText(data.getString("expyear" + parentNumber), getDrpCardExpiryYear());
		}

		getTxtCardSecurityCode().clear();
		getTxtCardSecurityCode().sendKeys(data.getString("securitycode" + parentNumber));
		

		
	}
	
	//this method is for selecting expiry month and year from xml file(do not delete it)
	@Override
	public void fillCreditCardAndBilling1InfoSection(Configuration data) {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(10000);
		// WaitUtils.waitForEnabled(getTxtNameOnCard());
		// WaitUtils.waitForDisplayed(getTxtNameOnCard());
		SCHUtils.scrollToView(getTxtNameOnCard());
		PauseUtil.pause(10000);
		SCHUtils.clickUsingJavaScript(getTxtNameOnCard());
		getTxtNameOnCard().clear();
		getTxtNameOnCard().sendKeys(data.getString("cardname"));
		String cardnumber = data.getString("cardnumber");
		if (getTxtCardNumber().isDisplayed()) {
			getTxtCardNumber().clear();
			getTxtCardNumber().sendKeys(cardnumber);
			PauseUtil.pause(2000);
			JavascriptExecutor jsExecutor =
					(JavascriptExecutor) TestBaseProvider.getTestBase().getDriver();
			jsExecutor.executeScript("$(arguments[0]).change();", getTxtCardNumber());
			SCHUtils.selectOptionByVisibleText(getDrpCardExpiryMonth(), data.getString("expmonth"));
			PauseUtil.waitForAjaxToComplete(1500);
			SCHUtils.selectOptionByVisibleText(getDrpCardExpiryYear(), data.getString("expyear"));
			

		} else {
			SCHUtils.selectItemByText(data.getString("expmonth"),
					getDrpCardExpiryMonth());
			SCHUtils.selectItemByText(data.getString("expyear"), getDrpCardExpiryYear());
		}

		getTxtCardSecurityCode().clear();
		getTxtCardSecurityCode().sendKeys(data.getString("securitycode"));
		

		
	}
	
	
	
	@Override
	public void fillCreditCardAddressInfoSection(Configuration data) {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(10000);
		getTxtBillingFirstName().clear();
		getTxtBillingFirstName().sendKeys(data.getString("firstname"));
		getTxtBillingLastName().clear();
		getTxtBillingLastName().sendKeys(data.getString("lastname"));
		getTxtBillingAddressOne().clear();
		getTxtBillingAddressOne().sendKeys(data.getString("address1"));
		getTxtBillingAddressTwo().clear();
		getTxtBillingAddressTwo().sendKeys(data.getString("address2"));
		getTxtBillingZip().clear();
		getTxtBillingZip().sendKeys(data.getString("zip"));
		getTxtBillingCity().clear();
		getTxtBillingCity().sendKeys(data.getString("city"));
		PauseUtil.waitForAjaxToComplete(1000);
		SCHUtils.selectOptionByVisibleText(getDrpBillingCountry(),
				data.getString("country"));
		SCHUtils.selectOptionByVisibleText(drpBillingState, data.getString("state"));
		getTxtBillingPhoneNumber().click();
		getTxtBillingPhoneNumber().clear();
		getTxtBillingPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phone")));

		
	}
	
	@Override
	public void fillCreditCardAddressInfoSection(Configuration data, int parentNumber) {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(10000);
		getTxtBillingFirstName().clear();
		getTxtBillingFirstName().sendKeys(data.getString("firstname" + parentNumber));
		getTxtBillingLastName().clear();
		getTxtBillingLastName().sendKeys(data.getString("lastname" + parentNumber));
		getTxtBillingAddressOne().clear();
		getTxtBillingAddressOne().sendKeys(data.getString("address1parent" + parentNumber));
		getTxtBillingAddressTwo().clear();
		getTxtBillingAddressTwo().sendKeys(data.getString("address2parent" + parentNumber));
		getTxtBillingZip().clear();
		getTxtBillingZip().sendKeys(data.getString("zip" + parentNumber));
		getTxtBillingCity().clear();
		getTxtBillingCity().sendKeys(data.getString("city" + parentNumber));
		PauseUtil.waitForAjaxToComplete(1000);
		SCHUtils.selectOptionByVisibleText(getDrpBillingCountry(),
				data.getString("country" + parentNumber));
		SCHUtils.selectOptionByVisibleText(drpBillingState, data.getString("state" + parentNumber));
		getTxtBillingPhoneNumber().click();
		getTxtBillingPhoneNumber().clear();
		getTxtBillingPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phone" + parentNumber)));

		
	}
	
	public void validateErrorMessage(Configuration data) {

		System.out.println("inside validate method");

		getTxtNameOnCard().click();
		getFormCreditcard().click();

		// AssertUtils.assertDisplayed(getLblErrEnterParticularField());
		// AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
		// Matchers.containsString("Please Enter a Name"));
		// getTxtNameOnCard().sendKeys(data.getString("cardname"));

		// getTxtCardNumber().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateCardNumber());
		// AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
		// Matchers.containsString("Please Enter a Credit Card Number"));
		// getTxtCardNumber().sendKeys(data.getString("cardnumber"));

		// getDrpCardExpiryMonth().click();
		// getFormCreditcard().click();
		// AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
		// Matchers.containsString("Please Select a Month"));
		// AssertUtils.assertDisplayed(getValidateExpMonth());
		//
		// // SCHUtils.selectItemByText(data.getString("expmonth"),
		// // getDrpCardExpiryMonth());
		//
		// getDrpCardExpiryYear().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateExpYear());
		// SCHUtils.selectItemByText(data.getString("expyear"),
		// getDrpCardExpiryYear());
		//
		// getTxtCardSecurityCode().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateCvn());
		// getTxtCardSecurityCode().sendKeys(data.getString("securitycode"));
		//
		// getTxtBillingFirstName().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateFirstName());
		// getTxtBillingFirstName().sendKeys(data.getString("firstname"));
		//
		// getTxtBillingLastName().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateLastname());
		// getTxtBillingLastName().sendKeys(data.getString("lastname"));
		//
		// getTxtBillingAddressOne().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateAddress1());
		// getTxtBillingAddressOne().sendKeys(data.getString("address1"));
		//
		// getTxtBillingZip().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateZip());
		// getTxtBillingZip().sendKeys(data.getString("zip"));
		//
		// getTxtBillingCity().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateCity());
		// getTxtBillingCity().sendKeys(data.getString("city"));
		//
		// getDrpBillingState().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateState());
		// SCHUtils.selectItemByText(data.getString("state"),
		// getDrpBillingState());
		//
		// getDrpBillingCountry().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateCountry());
		// SCHUtils.selectOptionByVisibleText(getDrpBillingCountry(),
		// data.getString("country"));
		//
		// getTxtBillingLastName().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidatePhoneNumber());
		// getTxtBillingPhoneNumber().sendKeys(
		// RandomDataUtil.getPhoneNumber(data.getString("phonenumber")));

	}

	@Deprecated
	@Override
	public void enterInvalidCreditcardInfo() {
		// Configuration data = TestBaseProvider.getTestBase().getTestData();

		getTxtNameOnCard().click();
		PauseUtil.pause(1000);
		getTxtCardNumber().click();
		PauseUtil.pause(5000);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a Name"));
		getDrpCardExpiryMonth().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a Credit Card Number"));
		getDrpCardExpiryYear().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Select a Month"));
		getTxtCardSecurityCode().click();
		PauseUtil.pause(250);
		getTxtBillingFirstName().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter Security Code"));
		getTxtBillingLastName().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a First Name"));
		getTxtBillingAddressOne().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a Last Name"));
		getTxtBillingAddressTwo().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a Street Address"));
		getTxtBillingZip().click();
		PauseUtil.pause(250);
		getTxtBillingCity().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a Postal Code"));
		getDrpBillingState().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Enter a City Address"));
		getDrpBillingCountry().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please Select a State"));
		getTxtBillingPhoneNumber().click();
		PauseUtil.pause(250);
		getTxtBillingCity().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(getLblErrEnterParticularField(),
				Matchers.containsString("Please specify a valid phone number."));
		// getTxtNameOnCard().sendKeys(data.getString("cardname"));
		// getTxtCardNumber().sendKeys(data.getString("invalidcardnumber"));
		// SCHUtils.selectItemByText(data.getString("expmonth"),
		// getDrpCardExpiryMonth());
		// SCHUtils.selectItemByText(data.getString("expyear"),
		// getDrpCardExpiryYear());
		// getTxtCardSecurityCode().sendKeys(data.getString("securitycode"));
		// getTxtBillingFirstName().sendKeys(data.getString("firstname"));
		// getTxtBillingLastName().sendKeys(data.getString("lastname"));
		// getTxtBillingAddressOne().sendKeys(data.getString("address1"));
		// getTxtBillingAddressTwo().sendKeys(data.getString("address2"));
		// getTxtBillingZip().sendKeys(data.getString("zip"));
		// getTxtBillingCity().sendKeys(data.getString("city"));
		// SCHUtils.selectItemByText(data.getString("state"),
		// getDrpBillingState());
		// SCHUtils.selectOptionByVisibleText(getDrpBillingCountry(),
		// data.getString("country"));
		// getTxtBillingPhoneNumber()
		// .sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phonenumber")));
	}

	@Override
	public void verifyDefaultStateDropDown() {
		Select dropBillingStateNames = new Select(drpBillingState);
		AssertUtils.assertTextMatches(dropBillingStateNames.getFirstSelectedOption(),
				Matchers.containsString("Select State"));
		List<WebElement> options = dropBillingStateNames.getOptions();
		String[] expected = {"Alabama", "Alaska", "American Samoa", "Arizona", "Arkansas",
				"California", "Colorado", "Connecticut", "Delaware",
				"District of Columbia", "Florida", "Georgia", "Guam", "Hawaii", "Idaho",
				"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
				"Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
				"Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
				"New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota",
				"Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico",
				"Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
				"Utah", "Vermont", "Virgin Islands", "Virginia", "Washington",
				"West Virginia", "Wisconsin", "Wyoming", "Armed Forces Middle East",
				"Armed Forces America (exc. Canada)", "Armed Forces Pacific"};
		for (int i = 1, j = 0; i < options.size(); i++, j++) {
			AssertUtils.assertTextMatches(options.get(i),
					Matchers.equalToIgnoringCase(expected[j]));
		}

	}

	@Override
	public void verifyDefaultCountryDropDown() {
		Select dropBillingCountryNames = new Select(drpBillingCountry);
		List<WebElement> options = dropBillingCountryNames.getOptions();
		String[] expected = {"United States"};
		for (int i = 1, j = 0; i < options.size(); i++, j++) {
			AssertUtils.assertTextMatches(options.get(i),
					Matchers.equalToIgnoringCase(expected[j]));
		}
		AssertUtils.assertTextMatches(dropBillingCountryNames.getFirstSelectedOption(),
				Matchers.containsString("Select Country"));
	}

	@Override
	public void verifyCreditCardFormFieldValidation() {
		// non numeric validation of credit card no
		getTxtCardNumber().sendKeys("ABCDE");
		getTxtNameOnCard().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtCardNumber(), "value",
				Matchers.isEmptyString());

		// more then 16 charchters are ignore on card number validation
		getTxtCardNumber().clear();
		getTxtCardNumber().sendKeys("1111111111111111111");
		getTxtNameOnCard().click();
		PauseUtil.pause(100);
		Assert.assertTrue(getTxtCardNumber().getAttribute("value").length() <= 16);

		// non numeric code into security code validation
		getTxtCardSecurityCode().sendKeys("ABCDE");
		getTxtBillingAddressOne().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtCardSecurityCode(), "value",
				Matchers.isEmptyString());

		// more then 4 charchters are ignore on security code validation
		getTxtCardSecurityCode().clear();
		getTxtCardSecurityCode().sendKeys("44444");
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtCardSecurityCode(), "maxlength",
				Matchers.containsString("4"));

		// non numeric code is not allowed on zip code field
		getTxtBillingZip().sendKeys("aaaa");
		AssertUtils.assertAttributeMatches(getTxtBillingZip(), "value",
				Matchers.isEmptyString());

		// not more then 5 charchter are allowed on TxtBillingZip code
		getTxtBillingZip().clear();
		getTxtBillingZip().sendKeys("111111");
		getTxtBillingPhoneNumber().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtBillingZip(), "maxlength",
				Matchers.containsString("5"));
		AssertUtils.assertAttributeMatches(getTxtBillingZip(), "value",
				Matchers.containsString("11111"));

		// non numeric is not allowd on phone number
		getTxtBillingPhoneNumber().sendKeys("jhsj");
		getTxtBillingAddressOne().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtBillingPhoneNumber(), "value",
				Matchers.isEmptyString());

		// not more then 10 charachter allowed on first name field validation
		getTxtBillingFirstName().sendKeys("ABCDEFGHIJKK");
		getTxtBillingLastName().click();
		AssertUtils.assertAttributeMatches(getTxtBillingFirstName(), "maxlength",
				Matchers.containsString("10"));
		AssertUtils.assertAttributeMatches(getTxtBillingFirstName(), "value",
				Matchers.containsString("ABCDEFGHIJ"));

		// not more then 16 charachter allowed on first name field validation
		getTxtBillingLastName().clear();
		getTxtBillingLastName().sendKeys("aaaabbbbddddeeeehhhh");
		getTxtBillingAddressOne().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtBillingFirstName(), "maxlength",
				Matchers.containsString("16"));
		AssertUtils.assertAttributeMatches(getTxtBillingLastName(), "value",
				Matchers.containsString("aaaabbbbddddeeee"));

		// not more then 30 charachter allowed on Address First field validation
		getTxtBillingAddressOne().sendKeys("ababababcdcdcdcdefefefefghghghkkkk");
		getTxtBillingAddressTwo().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtBillingAddressOne(), "maxlength",
				Matchers.containsString("30"));
		AssertUtils.assertAttributeMatches(getTxtBillingAddressOne(), "value",
				Matchers.containsString("ababababcdcdcdcdefefefefghghgh"));

		// not more then 30 charachter allowed on Address Second field
		// validation
		getTxtBillingAddressTwo().sendKeys("ababababcdcdcdcdefefefefghghghkkkk");
		getTxtBillingCity().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtBillingAddressTwo(), "maxlength",
				Matchers.containsString("30"));
		AssertUtils.assertAttributeMatches(getTxtBillingAddressTwo(), "value",
				Matchers.containsString("ababababcdcdcdcdefefefefghghgh"));

		// not more then 30 charachter allowed on City field
		// validation
		getTxtBillingCity().sendKeys("ababababcdcdcdcdefefefefghghghkkkk");
		getTxtBillingPhoneNumber().click();
		PauseUtil.pause(100);
		AssertUtils.assertAttributeMatches(getTxtBillingCity(), "maxlength",
				Matchers.containsString("30"));
		AssertUtils.assertAttributeMatches(getTxtBillingCity(), "value",
				Matchers.containsString("ababababcdcdcdcdefefefefghghgh"));

		// not more then 10 charcheters are Allowed For Phone Number
		getTxtBillingPhoneNumber().sendKeys("55555555555");
		AssertUtils.assertAttributeMatches(getTxtBillingPhoneNumber(), "value",
				Matchers.containsString("5555555555"));
		AssertUtils.assertAttributeMatches(getTxtBillingPhoneNumber(), "maxlength",
				Matchers.containsString("10"));

	}


}
