package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface ICreditCardAndBillingInfoSection {
	
	void fillCreditCardAndBillingInfoSection(Configuration data);
	
	void fillCreditCardAddressInfoSection(Configuration data);

	void waitForPageLoad();

	boolean isPageActive();

	void enterInvalidCreditcardInfo();

	WebElement getLblErrInvalidCardNumber();

	WebElement getBtnSave();

	void clickOnCancel();

	boolean isCreditCardSection();

	void fillCreditCardSecurityCode(Configuration data);

	void verifyDefaultStateDropDown();

	void verifyDefaultCountryDropDown();

	void verifyCreditCardFormFieldValidation();

	void fillCreditCardAndBilling1InfoSection(Configuration data);

	void fillCreditCardAndBillingInfoSection(Configuration data, int parentNumber);

	void fillCreditCardAddressInfoSection(Configuration data, int parentNumber);


}