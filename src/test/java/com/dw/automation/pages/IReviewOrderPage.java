package com.dw.automation.pages;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

import com.dw.automation.beans.ProductInfoBean;

public interface IReviewOrderPage {

	void launchPage();

	void waitForPageLoad();

	boolean isPageActive();

	public void verifyItemIsAddedOnReviewOrderSFO(String studentName, String itemID);

	public void removeItemsFromReviewOrderPage(Configuration data);

	public void verifyDeleteOptionDisappearOnNoActionOnReviewOrder(Configuration data);

	public void verifyUpdatedRecordsAfterRemovalOnReviewOrder(Configuration data);

	void editProductQuantityOnReviewOrder(Configuration data);

	void verifyStudentNamesAscOrder();

	void clickSFOLink();

	void clickYTOLink();

	void verifyStudentLevelOnReviewSFO();

	ProductInfoBean fillPOProductBean(String itemId, String childName);

	void clickOnSOOLink();

	void verifyButtonState(Configuration testData);

	void editProductQuantityOnOrderTable(Configuration testData);

	void verifyTotalPriceQuantity(Configuration testData);

	void clickOnItemAddedOnStudentTable(Configuration data);

	void verifyItemQuickLookOnOrderTable(Configuration data);

	void removeItemsFromReviewOrderPageBasedOnStatus(Configuration testData,
			String confirmationStatus);

	void setDefaultChild(String itemId);

	void verifyDefaultChild(String itemId);

	void verifyChildList();

	void clickOnAddChildFromChildDropDown();

	void removeFreePickItems();

	void verifyAddedFreePickItem();

	void removeParentOrderItem(String itemId);

	void verifyRemovedFreePickItem(Configuration data);

	void verifyChild(String itemId, String childName);

	void updateQuantity(String itemId, String childName);

	void verifyStudentConnectedToTeacher(String childName, String itemId);

	void setPropertyForNewChild(String itemId, String newChildName, String oldChild);

	void verifySelectChildForItem(String itemId);

	void verifyUpdatedChildName(Configuration data, String itemId);

	WebElement getErrorOnHold();
	
	WebElement getrevieworderPriceLabel();

	void verifyProductDetails(Configuration data);

	void verifyHideDetailsAndClick(Configuration data);

	void deleteItemFromParentById(String itemId);

	void verifyWishListSectionReviewCart(String itemId);


}
