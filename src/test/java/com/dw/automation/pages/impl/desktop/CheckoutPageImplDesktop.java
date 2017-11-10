package com.dw.automation.pages.impl.desktop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.impl.CheckoutPage;

public class CheckoutPageImplDesktop extends CheckoutPage {
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.namererror")
	private WebElement lblErrorMsg;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.nameoncard")
	private WebElement txtNameOnCard;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expirymonth")
	private WebElement drpCardExpiryMonth;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expiryyear")
	private WebElement drpCardExpiryYear;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.firstname")
	private WebElement txtBillingFirstName;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addressone")
	private WebElement txtBillingAddressOne;

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

	public WebElement getTxtBillingFirstName() {
		return txtBillingFirstName;
	}
	public WebElement getTxtBillingLastName() {
		return txtBillingLastName;
	}

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.lastname")
	private WebElement txtBillingLastName;

	public WebElement getDrpCardExpiryYear() {
		return drpCardExpiryYear;
	}
	public void setDrpCardExpiryYear(WebElement drpCardExpiryYear) {
		this.drpCardExpiryYear = drpCardExpiryYear;
	}
	@Override
	public WebElement getTxtCardSecurityCode() {
		return txtCardSecurityCode;
	}
	public void setTxtCardSecurityCode(WebElement txtCardSecurityCode) {
		this.txtCardSecurityCode = txtCardSecurityCode;
	}

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.securitycode")
	private WebElement txtCardSecurityCode;

	public WebElement getDrpCardExpiryMonth() {
		return drpCardExpiryMonth;
	}
	public void setDrpCardExpiryMonth(WebElement drpCardExpiryMonth) {
		this.drpCardExpiryMonth = drpCardExpiryMonth;
	}
	public WebElement getTxtNameOnCard() {
		return txtNameOnCard;
	}
	/*
	@Override
	public void verifyRecommandedItemsFunctionality() {
		Assert.assertTrue(getLstLblCartRiges().get(0).getText().contains("RECOMMENDED"));
		if (getLstTotalRecommandationItems().size() <= 4) {
			AssertUtils.assertNotDisplayed(getBubbleNxtArrowReccItems());
			AssertUtils.assertNotDisplayed(getBubblePrvArrowReccItems());
		} else {
			Assert.assertTrue(getLstActiveRecommandationItems()
					.size() < getLstTotalRecommandationItems().size());
			AssertUtils.assertDisplayed(getBubbleNxtArrowReccItems());
			AssertUtils.assertDisplayed(getBubblePrvArrowReccItems());
			getBubbleNxtArrowReccItems().click();
			getBubblePrvArrowReccItems().click();
		}
	}

	@Override
	public void validateCreditCardFormError() {

		getTxtNameOnCard().click();
		PauseUtil.pause(1000);
		getTxtCardNumber().click();
		PauseUtil.pause(5000);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a Name"));

		getTxtCardSecurityCode().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a Credit Card Number"));
		getTxtCardNumber().click();
		// getTxtCardSecurityCode().click();
		PauseUtil.pause(250);
		// getTxtBillingFirstName().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter Security Code"));
		getTxtBillingFirstName().click();
		PauseUtil.pause(250);
		getTxtBillingLastName().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a First Name"));
		getTxtBillingAddressOne().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a Last Name"));
		getTxtBillingAddressTwo().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a Street Address"));
		getTxtBillingZip().click();
		PauseUtil.pause(250);
		getTxtBillingCity().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a Postal Code"));
		getTxtBillingZip().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please Enter a City Address"));
		getTxtBillingPhoneNumber().click();
		PauseUtil.pause(250);
		getTxtBillingCity().click();
		PauseUtil.pause(250);
		AssertUtils.assertTextMatches(lblErrorMsg,
				Matchers.containsString("Please specify a valid phone number"));

	}*/

}
