package com.dw.automation.pages;

import org.apache.commons.configuration.Configuration;

import com.dw.automation.beans.ProductInfoBean;

public interface IProductDetailPage {

	void launchPage();

	void waitForPageLoad();

	void addYTOProductDetails();

	void verifyPDPPage();

	void clickOnAddToCartandCheckout();

	String getItemNumber();

	ProductInfoBean fillProductInfoBean(String childName);

	void addPOProductDetails(String childname);

	void addParentProductDetails();

	void verifyDigitalFlyerProductPopup();

	void addDigitalFlyerItemToCart();

	void verifyProductPriceInDollarsOnly();

	void verifySignInFunctionality();

	void verifyUserRegistrationFunctionality();

	void verifyWishListSection();

	void addItemToClassRoomWishList(boolean isRecommendation, boolean isClassroomWishlist,
			boolean isSaveForLater);

	void verifyNoteSection();

	void verifyAddToCartBtn();

	void selectAddToCartBtn();

	void verifyModalWindow();

	void checkQuentity(String qty);

	void addQuentity(String qty);

	void checkQuentityAsTextBox();

	void verifyRecommandedAndWishlistButton();

	void verifyWishListModel();

	void verifyRecommendedModel();

	void selectProductFromSearchPage();

	void checkItemInPackAreaNotActive();

	void clickOnExpand();

	void clickOnCollapses();

	void verifyRecommandedAndWishlistButtonNotDisplay();

	void verifySaveForLaterButton();

	void verifyProductPriceAndPoints();

	void verifyPriceSelectedDefault();

	void verifyPointSelectedView();

	void verifyPriceSelectedView();

	void verifyModelWindowInformation();

	void verifyContinueShoppingBtn();

	void selectContinueShoppingBtn();

	void verifyMostRecommended();

	void verifyRecommandedORWishlistBox();

	void selectProductForMultipleList();

	void verifyQuentityInput();

	void verifyDefaultQuentityInput();

	void verifyProductInList(String name);

	void deSelectProductForMultipleList();

	void verifyDefaultStarAndHeartIcon();

	void verifySelectedHeartAndStarIcon();

	void verifyAddingIlligalOptionsInQTYField();

	void verifyQuntityFieldDefaultValue(int defaultQTYValue);

	void verifyAddCartButtonIsActive();

	void verifyAddingMaxValueInQTYField(int maxQTYValue);

	void verifyFourDigitValueInQTY();

	void selectBundlePackItem();

	void clickOnSearchItemPackDrawer();

	void verifyItemCountInBundlePack();

	void VerifyItemAttributes();

	void verifySEEItemsInThisPackIsNotPresent();

	void verifyIsNotBundlePackItem();

	void verifyPackBundleOnlyAvailableItemNotClickable();

	void verifyOnlyAvailableInBundlePackItemAttributes();

	void verifyReccomendAndWishListInFillState();

	void verifyBundlePackItems(Configuration testData);

	void clickOnMinusSearchItemPackDrawer();

	void verifyBundleItemsDrawerPack();

	void hoverReadingLevel();

	void verifySeeItemPackSectionDisplayed();

	void clickOnBundlePackPurchasableItem();

	void verifyBundlePackItemOnPDP();

	void verifyBundlePackItemSearchPage(String string);

	void verifyProductDetails();

	void verifySaveForLaterLbl();

	void verifyItemFlyer();

	void verifyRecommendAndWishListNotDisplayed();

	void verifyBonusPointsSelectedDefault();

	void verifyReadingLevelModal();

	void clickOnBundlePackNorPurchasableItem();

	void verifyAttributeForSeperateSoldItem();

	void changeRecommendationStat();

	void changeWishListStat();

	void verifyBundlePackProductDetails();

	void verifyAuthorContentAssets();

	void hoverOverCatalog();

	void verifyNearestCatalog();

	void verifyAwardsContentAssets();

	void verifyShortDescriptionContentAssets();

	void verifyLongDescriptionContentAssets();

	void verifyProductNameContentAssets();

	void verifyPreOrderButton();

	void verifyProductInformation();

	void createNewListInAddToWishListModal();

	void verifysnapShotTextContentAssets();

	void verifyIllustratorContentAssets();

	void addItemToParentMyList(Configuration configuration);

	void verifyQuantityNotUpdated();

	void verifyAboutThisSeries();

	void verifyDisplayOfChildNameWithGradeAddToListModal();

	void selectQuickLookOfItemOnSearchResultPage(String itemLabel);
	void selectValuePackItem();

	void verifyItemInBundlePack(Configuration testData);

	void verifyValuePackSection();

	void clickGoToCheckOutWishListItem();

	void verifyAwardImageOnPDPPage();

	void verifyNewBadgeImageOnPDPPage();
	
	void teacher_lands_on_pdp_of_the_item_the_teacher_clicked_through();
	
	void teacher_lands_on_category_page_item_the_teacher_clicked_through();
	
	void teacher_lands_on_content_page_item_the_teacher_clicked_through();

	void verify_pdp_product_uniqueitemid();

	void verify_yto_product_uniqueitemid();

	void verify_confirmSubmitpage_product_uniqueitemid();
}
