package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface ICouponSection {

	void addCoupon(Configuration testData);	
	
	void MakeSelectionWindow_SelectItem();
	
	void MakeSelectionWindow_SelectItemFreePick();
	
	void SelectItem_TopOff_DTS(Configuration testData, double topoff_dts);
	
	void MakeSelectionWindow_SelectMultipleItems(Configuration testData, double couponprice, double couponprice_limit);
	
	void MakeSelectionWindow_SelectMultipleItems_ToMeet_Promotions(Configuration testData, double couponprice, double couponprice_limit);
	
	void MakeSelectionWindow_SelectGrade(Configuration testData);
	
	void MakeSelectionWindow_SelectDifferentGrade(Configuration testData);
	
	void MakeSelectionWindow_SelectDropDownGradeLevel();
	
	void MakeSelectionWindow_verifyListDropDownGradeLevel();
	
	void MakeSelectionWindow_verifyTeacherCatalogueInDropDownGradeLevel();
	
	//void MakeSelectionWindow_SearchExpiredItems(Configuration testData);
	
	void MakeSelectionWindow_ExpiredItems_ValidationMessage();

	void verifyAppliedCoupons();

	void addSFOCoupoun(Configuration testData);

	void addCouponFromRewardsAndCoupons(Configuration testData, int i);

	void verifyMGMCouponFunctionality(Configuration data);

	void verifyInCompleteCouponEntryProcessMsg(Configuration data);

	void editFreePickCoupon(Configuration data);

	void searchCouponItemForinvalidKeyword(Configuration data);

	void verifyInvalidSearchErrorMessage();

	void verifyFreePickModalFunctionality(Configuration data);

	void verifyFPPopup();

	void verifyCouponsPagination();

	void verifySortingFunctionality();

	void verifyItemDetails();

	void verifyStudentRenameFunctionality();

	void verifyCouponsModal();

	void closeMakeYourSelectionPopUpMOdal();

	void verifyFullyUsedDollarToSpendPopup(Configuration testData);

	void verifyCouponsModalWithMakeYourSelectionSection();

	void searchItemByGradeLevel(String text);

	void searchItemByKeywordText(String text);

	void verifyPriceList();

	void enterItemInmakeYourSelectionSection(String itemID);

	void verifyNoResultFoundMessage();

	void enterItemInmakeYourSelectionSectionApply(String itemID);

	void selectItemByRadioButton(String itemPosition);
	
	void getYourCurrentSelectionSection();
	
	void verifyResultforParticularSearch(String couponsearch);
	
	void verifyResultforParticularSearch_FreePickCoupon(String couponsearch);

	void verifyYourCurrentSelectionSection();

	void verifyAppliedCouponsOnModal(Configuration testData);

	void deleteSelectedItemOnModal(Configuration testData);

	void verifyApplyCouponButton(String buttonState);
	
	void verifyApplyCouponButton_NotPresent();
	
	void verifyOrderTotalIncludesTopOff_CouponsAndRewardspage();
	
	void verifyOrderTotalIncludesTopOff_ConfirmAndSubmitPage();
	
	void verifySearchResultTable();

	void removeCurrentSelectedItem();

	void clickOnConfrimAndApplyCoupon();

	void verifyEmptyCouponSectionMessage();

	void verifySearchResultTableHavingTenSearchRsults(int i);

	void verifySearchResultTableWithAllFunctionality();

	void verifyRemovedCurrentSelectedItem();

	void clickOnCancelLinkonCouponModal();

	void createdatafromFreePickSelection();

	void validate_sfo_freepickItem_afterselection_SFOpage();

	void verifyItemUnselectedByRadioButton(String itemPosition);

	void verifyCurrentSelectionisUnsorted();

	void addSFOCoupounByNameAndCouponNumber(String studentName, String CouponNumber);

	void enterItemInmakeYourSelectionSection(Configuration data, String itemID);

	void verifyHideLinkFunctionality();

	void applyDollarToSpendCouponWithTopOff(Configuration testData);

	void verifyMakeYourSelectionSection();

	void verifyApplyButtonState();

	void addmultipleCoupon(Configuration data, int i);

	void addInvalidSFOCoupoun(Configuration testData);

	void verifyApplyCouponButtonInActive();

	void clickApplyOnCouponModal();

	void enterCouponForStudent(String value);

	void enterStudentNameOnCouponModal(String value);

	void verifyMaxCharLimitForStudentName(String string);

	void editFreePickCouponOnParent(Configuration testData, String couponIndex);
	
	void MakeSelectionWindow_SelectSpecificItem(Configuration testData, double couponprice, double couponprice_limit);
	
	void MakeSelectionWindow_SelectSpecificItem_Apply(Configuration testData, double couponprice, double couponprice_limit);

	void MakeSelectionWindow_Search_WithSpecificTerm(Configuration testData);
	
	void MakeSelectionWindow_NoResultItem_ValidationMessage();
	
	void MakeSelectionWindow_TopOffAmtPresent_Message();
	
	void MakeSelectionWindow_TopOffAmtNotPresent_Message();

	void verifyOrderTotalIncludesTopOff_ConfirmationPage();

	void MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel();
	
	void verifyManualFreePickItemsPriceWithInCouponAmount(double ManualFreePickTier1CouponAmt, double ManualFreePickTier2CouponAmt);

	void verifyManualFreePickDetails_ConfirmSubmitPage(String couponnumber);
	
	void MakeSelectionWindow_DeleteSelectedItem();
	
	void getYourCurrentSelectionSection_FreePick();
	
	void verifyYourCurrentSelectionSection_FreePickCoupon();

	void verifyYourCurrentSelectionSection_DTS();

	WebElement getdtspaginate2();

	void MakeSelectionWindow_DTSSelectItem();
	
	void CSR_verify_ConfirmSubmit_btn_disabled_in_FreeItem_modal_window();

	void MakeSelectionWindow_dts_enterquantity(Configuration testData);

	void verifyResultsforParticularSearch_FreePickCoupon(String couponsearch);

	void MakeSelectionWindow_Search_WithSpecificTerm(String item);

	void verifyResultforParticularSearch_DTSModal(String couponsearch);

	void verifyCouponModalNotdisplayed();

	void click_Cancel_closethefreepick_modal();

	void click_close_closethefreepick_modal();

	void validate_sfopage_freepick_coupon_display();

	void validate_sfopage_freepick_coupon_error();

	void validate_sfopage_freepick_coupon_code_hyperlink();



}