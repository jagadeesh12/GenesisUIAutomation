package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;

import com.dw.automation.beans.ProductInfoBean;

public interface IProductOrderTableSection {
	void verifyItemIsAddedOnStudentTable();

	void clickOnItemAddedOnStudentTable(Configuration data);

	void verifyItemQuickLookOnOrderTable(Configuration data);

	void editProductQuantityOnOrderTable(Configuration data);

	ProductInfoBean fillSFOProductBean(String studentName, String itemId);

	ProductInfoBean fillYTOProductBean(String itemId);

	void verifyStudentFlyerOrderTableHeader();

	void removeItemsFromStudentTable(Configuration testData, String confirmationStatus);

	int getTotalItemsOnProductTable();

	int getTotalStudentOnProductTable();

	void verifyUpdatedRecordsAfterRemoval(Configuration data);

	void verifyFullDetailsOfProduct(String itemid);

	void verifyItemQuantity(Configuration data);

	void verifyRecommendationButton();

	void clickOnRecommendation();

	void verifyRecommendationState();

	void clickOnWishList();

	void verifyWishListState();

	void verifyItemQuantityAfterAddingItem(String itemid);

	// void verifyAddItemQuantity(String itemid, String quantity, String
	// bonusquantity);

	void selectItemandEnterQuantity(Configuration configuration);

	void verifyQuantityFieldOfItems();

	void verifyBonusItemDetails(String itemid);

	void addOrUpdateItemToCartByQuantity(Configuration testData);

	void verifySelectedHighlightedProducts(Configuration configuration);

	void verifyQuantityOfBonusAndPrice();

	public void verifyUpdatedQuantityOfYTO(Configuration data);

	public void verifyItemIsHighlighted();

	void verifyBySelectingOtherItem();

	void selectAppliedSFOCoupon();

	void removeYTOItemsFromStudentTable(Configuration data, String confirmationStatus);

	void clickOnOutSide();

	void clickOnItem();

	void verifyItemPresent(String key);

	void verifyItemAddedOnByItem(Configuration data);

	void verifyItemAddedOnByFlyer(Configuration data);

	void updateQuantity(String itemId, String quantity);

	void verifyItemQuantityOnYTO(Configuration data);

	void addBPofItemToCart(Configuration testData);

	void removeItemFromCartByUpdatingQuantity(Configuration testData);

	void addNegativeBonusItemToCart();

	void verifyUpdationProcess();

	void verifyUnhighlightedItem();

	void verifyFlyerItemDetails();

	void verifyFlyerItemAllHeaders();

	void verifyListSortingOrder();

	void verifyUserAddItemOnYTO();

	void verifyScrollBar(Configuration testData);

	void verifyTitleOrderAlphabeticalOrder(Configuration testData);

	void verifyItemQuantityUpdated(Configuration testData, boolean QuantityFlag);

	void removeBonusItemFromCartByUpdatingQuantity(Configuration testData);

	IAddToWishListSection getAddToWishListSection();

	void verifyQuantityIsNotEditedForCouponsItem();

	void removeAppliedCoupons();

	void verifyCouponItemIsDeletedOnStudentTable(Configuration testData, String page);

	void removeCouponItemsFromStudentTable(Configuration data, String confirmationStatus);

	void verifyDigitalFlyerItemOnOrderForm();

	void verifyDigitalFlyerItemOnByItem();

	void verifyYourTeacherOrderTable();

	void enterDollarQuantity(String arg1, int loop);

	void verifyEnteredQunatityRow(String arg1, int loop);

	void verifyQuantityFieldMaxLimit(int loop);

	void clickOnItemWithSpecificInput(String clickon);

	void updateQuantityField(Configuration configuration, int maxQTYValue);

	void verifyCouponItemOnStudentTable(Configuration testData, String page);

	void verifyHighlightedProducts();

	void verifyHighlightedBonusPointItem(Configuration testData);

	void verifyItemInAscendingOrder();

	void verifyItemInDecendingOrder();

	void verfiyOrderByItemId();

	void verifyTitleDescendingOrderSort();

	void verifyTitleAscendingOrderSort();

	void verifyOrderOfTitleName();

	void verifyFlyerDescendingOrderSort();

	void verifyFlyerAscendingOrderSort();

	void verifyFlyerOrder();

	void verifyOrderPriceOfItem();

	void verifyPriceInAscendingOrder();

	void verfiyPriceInDescendingOrder();

	void verifyBounsPointOrder();

	void verfiBonusPointDescendingOrder();

	void verifyBonusPointAscendingOrder();

	void selectItemFromList(int index);

}