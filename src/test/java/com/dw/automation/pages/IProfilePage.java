package com.dw.automation.pages;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

import com.dw.automation.beans.UserProfileBean;

public interface IProfilePage {

	void launchPage();

	void waitForPageLoad();

	boolean isPageActive();

	UserProfileBean fillUserProfileBean();

	void verifyDefaultSavedCard();

	void fillUserProfileBeanFromChildName();

	void verifyDefaultSavedPaypalCard();

	void verifyPage();

	public WebElement getTxtUsername();

	public WebElement getTxtEmail();

	void addCreditCard(Configuration data);

	void addCreditCardProfilePage(Configuration testData);

	void editSavedCreditCardProfilePage(Configuration testData);

}
