package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface IStudentFlyerOrdersCartSection {

	void verifyItemsOnSFOCart();

	void verifySFOFunctionalities();

	void verifyItemsQuantityOnCart();

	int getTotalStudentOnSFOPage();

	WebElement getBtnPopupClose();

	void removeAllSfoItems();

	void updateQuantity(Configuration data);
	public void verifyCouponsIsNotEditedOnSfoCart();

	void expandItemInfo(String itemName, String studentName);

}
