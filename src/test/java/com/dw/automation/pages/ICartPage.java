package com.dw.automation.pages;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

import com.dw.automation.sections.ICouponSection;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.IStudentFlyerOrdersCartSection;
import com.dw.automation.sections.IStudentOnlineOrdersCartSection;
import com.dw.automation.sections.IYourTeacherOrdersCartSection;

public interface ICartPage {

	IStudentOnlineOrdersCartSection getStudentOnlineOrdersCartSection();

	IStudentFlyerOrdersCartSection getStudentFlyerOrdersCartSection();

	IYourTeacherOrdersCartSection getYourTeacherOrdersCartSection();

	IProductOrderSummarySection getProductOrderSummarySection();

	void verifyEmptyCartPage();

	void clickOnRedeemCoupon();

	void verifyCartItems();

	void verifyCartItemQuantity();

	void clickStudentFlyerOrderAddBtn();

	void removeAllItems();

	void verifyCartTotalAmountAndQuantity();

	void clickReturnToShopBtn();

	void clickProceedToCheckoutBtn();

	void verifyNoItemToReviewMessages();

	WebElement getCmpSOO();

	WebElement getLblCartTotalAmount();

	void clickYourTeacherOrderAddBtn();

	void navigatesToYTO();

	void removeSOOItems();

	void enterCouponAndClickApply(String CouponCode);

	void verifyWrongErrorMessage(String errorMessage);

	ICouponSection getICouponSection();

	void addscoupon(Configuration testData);

	void verifyParentCart();

	void removeSFOItem(Configuration data, String confirmationStatus);

	void clickOnRedeemCouponLink();

	void verifyPromotionalModal();

	void addscoupon(Configuration testData, int i);

	void verifyeBonusPointModelProceedToCheckOut();

	void selectAmountToDonate(String amount);

	void verifyHeader();

	void verifyFooter();

	void verifyCouponSection();

	void verifyBookTrustSection();

	void verifyeBookForTrustSection();

	void selectAmountToDonateOnTeacherCart(Configuration data, String amount);

	void waitForPageToload();

	void verifySOOItems();

	void verifySubOrderTotal();

	void verifySubQuentityTotal();

	void verifyItemTotalQuentity();

	void verifyOrderFinalAmount();

	void verifyBooktrustIsNotDisplayForEmptyCart();

	void verifyProceedToCheckoutButtonIsDisabled();

	void verifyCartTotalOnParentCart();

	void verifyParentCartWithAllFunctionalities();

	void verifyApplyButtonIsEnable();

	void enterCouponAgain(String CouponcodeAgain);

	void verifyEmptyReviewCartPage();

	void selectAmountToDonateOnParentCart(Configuration data, String amount);

	void verifyQuickViewModel();

	void verifyRecommondationModel();

	void closePromotionalModalReviewCartPage();

	void verifyEditableAppliedFreepickCoupon();

	void verifyEmptyCart();

	void verifyWishListCartItem();

	void verifyClassroomWishListItemOnReviewCartPage();
	
	void addBonusBankCoupon();
	
	void verifyFreePromotionShouldNotDisplay();
	void clickOnReviewCartButton();
	
	void clickOnRemoveCircle();
	
	void clickOnYesButton();
	
	void waitForRemoveCircle();

	void getBonusFlatText(String bonusFlat1, String bonusFlat2, String bonusFlat3,
                          double bonusflattier1, double bonusflattier2, double bonusflattier3,
                          double bonusflattier4);

	void getBonusFlatText();
	
	void getBonusFlatTextinConfirmandSubmitPage();
	
	void getBonusPercentageConfirmandSubmitPage();
	
	void getBonusPercentageConfirmationPage();
    void getBonusPercentageConfirmationPage1();
	
	void clickOnSubmitOrderPage();
	
	void verifyBonusFlatTextOnSubmittedPage();
	void verifyBonusFlatTextOnRewardsPage();
	void clickCartIcon_on_homepage();
	void verifyBonusFlatNotPresentinRewardsPage();
	
	void verifyBonusPercentageDescription();
	
	void verifyBonusPercentageRewardsPage(double bonuspercent);
	
	void enterExpiredCoupon();
	
	void verifyExpiredCouponErrorMessage();
	
	void verifyExpiredCouponErrorMessage(String bonuspercExpiredErrorMsg);
	
	void enterRedeemedCoupon();

	void clickOn_btnReviewCart();
	
	void verify_the_Grades_order_in_CartPage();

	void clickOn_ProceedToCheckoutBtn();

	boolean is_RewardsAndCouponsActive_dislayed();

	void verify_the_Grades_order_in_SubmitPage();

	void verify_the_Grades_order_in_Order_reference_page();

	void validate_the_modified_names_in_CartPage();

	void validate_the_modified_names_in_SubmitPage();

	void validate_the_modified_names_in_Order_reference_page();

	void Teacher_clicks_On_Plus_btn_for_student_1();

	void validate_the_updated_quantity_by_clicking_On_Plus_for_Student1();

	void validate_the_updated_quantity_by_clicking_On_Minus_for_Student1();

	void Teacher_clicks_On_Minus_btn_for_student_1();

	void verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page(double d);

	void Teacher_do_the_empty_saved_cart();

	void click_on_btn_SaveCart_for_Later();

	void Teacher_saves_the_cart();

	void Teacher_selects_saved_cart();

	void verify_the_Grades_order_in_SavedCartPage();

	void verify_items_are_grouped_by_student_and_teacher_Club_SavedCart_Pages();

	void verify_subTotal_of_student_and_teacher_Club_amount_SavedCart_Page();

	void Teacher_deletes_the_Saved_cart();

	void verify_deleted_saved_cart_is_not_shown();

	void selects_the_Manage_SavedCart();

	void restore_the_SavedCart();

	void Verify_savedCart_is_not_shown_in_the_SavedCart_list();

	void Teacher_clicks_On_Minus_until_becomes_to_0();

	void verify_the_items_are_not_listed_in_ReviewcartPage();

	void verify_items_are_grouped_by_teacher_Club_SavedCart_Page();

	void verify_subTotal_of_student_Club_amount_SavedCart_Page();

	void verify_subTotal_of_teacher_Catalogues_amount_SavedCart_Page();

	void Teacher_clicks_delete_and_NO_Saved_cart();

	void view_the_SavedCart();

	void verify_items_are_not_deleted_in_student_and_teacher_Club_SavedCart_Page();

	void verify_items_are_listed_in_student_and_teacher_Club_SavedCart_Page();

	void Teacher_clicks_delete_and_YES_Saved_cart();

	void verify_Manage_cart_items_are_not_listed_in_SavedCart_Page();

	void verify_header_MySavedCarts_displayed_in_SavedCart_Page();

	void Selects_Return_To_ManageSavedCart();

	void verify_Manage_Your_Savedcarts_list_displayed();

	void verifyExpiredCouponErrorMessage2();
	
	void saveCart(String cartName);
	
	WebElement getbuttonReview_cart();
	
	WebElement getbuttonSaveCart();
	
	WebElement getModalSaveCart();
	
	WebElement getbuttonYesSaveCart();

	WebElement getinputCartName();
	
	WebElement getbuttonSaveCartName();
	
	WebElement getlinkSavedCart();
			
	WebElement getSavedcartname_SavedCartModal();
	
	WebElement getlinkBooktitle_savedcartReviewpage();
	
	WebElement getlinkFullDetailBookdescription_savedcartReviewPage();
	
	WebElement getinputEnterquantity();
	
	WebElement getbuttonAddtoCart();
	
	WebElement getbuttonGoToCheckOut();
	
	WebElement getOrderQuantity_Cart();

	void verifyQuant();

	void verify_Present_PopUp_Rewards_Table();

	void verify_NotPresent_PopUp_Rewards_Table();

	void click_proceedtocheckout_popuprewardtable();

	void click_proceedtocheckout_bottom_popuprewardtable();

	void click_lnk_returntoshop_popuprewardtable();

	void verify_flyerpage_with_returntoshoplink();

	void login_sameaccount_verifyQty_autosave(String username, String password, boolean isRemember, String option);

	void verify_items_autosaved_yto(String itemQty);

	void getsubtotals_reviewcartpage(String section);

	void store_all_information_from_reviewcart_page(String section);

	void gettotals_reviewcartpage(String section);

	void getitems_reviewcartpage(String section);

	void gettaxes_reviewcartpage(String section);

	void getsubtotals_rewardspage(String section);

	void gettaxes_rewardspage(String section);

	void getitems_rewardspage(String section);

	void gettotals_rewardspage(String section);

	void verify_all_item_information_from_reviewcartpage_rewardspage(String section);

	void store_all_information_from_rewards_page(String section);

	void verify_rewardsearned_amount_in_rewardspage();

	void getitem_count_sfo_yto_soo_te_pages(String section);

	void verify_ordertotal_totalitems_in_paymentpage();

	void verify_FreeItem_promotions_not_display();

	void verify_FreeItem_promotion_is_displayed();

	void verify_totalamountdue_iszero_summarysection_confirmationpages();

	void verify_totalamountdue_summarysection_confirmationpages();

	void verify_summarysection_totals_confirmationpages();
	
}