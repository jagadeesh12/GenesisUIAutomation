package com.dw.automation.pages;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.sections.ICouponSection;

public interface ICheckoutPage {

	void launchPage();

	void waitForPageLoad();

	boolean isPageActive();

	void addNewCreditCard(Configuration data) throws AWTException;
	
	void addNewCreditCard_SaveCart(Configuration data);

	void verifyRewardsAndCouponsPage();

	void verifyBlueChevron(String args);

	void selectInActiveTab(String args);

	WebElement getLblPageSubTitle();

	void verifyAppleIcon(Configuration data);

	void verifyAppleIconNotClickable(Configuration data);

	void clickChangeLinkOfPaypalSection();

	void verifyWalletSectionOfPaypal();

	void selectWalletOption(Configuration data);

	void verifyPaymetMethodUpdatedMsg();

	WebElement getBtnPayPalAgreeAndContinue();

	WebElement getBtnPayPalLogin();

	WebElement getTxtPayPalPassword();

	WebElement getTxtPayPalEmail();

	WebElement getFrmPayPalLogin();

	WebElement getBtnReturnToShop();

	WebElement getLblStepRewardsAndCoupons();

	WebElement getLblStepShippingAndPayment();

	WebElement getLblStepConfirmAndSubmit();

	ShippingAndPayment getShippingAndPaymentSection();

	ConfirmAndSubmitOrder getConfirmAndSubmitOrder();

	WebElement getLnkHome();

	ConfirmAndSubmitOrder getConfirmAndSubmitOrderSection();

	RewardsAndCoupons getRewardsAndCouponsSection();


	void verifyConfirmAndSubmitHeader();

	void clickOnEditLink();

	void clickOnCancelButton();

	void clickOnSaveButton();

	void verifyCardInformationUnchangedAndClickOnCancelButton();

	void verifyCardInformationChangedAndClickOnSaveButton();

	WebElement getBtnPayPalContinue();

	 ICouponSection getICouponSection();

	void addscoupon(Configuration testData, int i);
	
	void MakeSelectionWindow_SelectItem();
	
	void MakeSelectionWindow_SelectItemFreePick();
	
	void verifyApplyCouponButton_NotPresent();
	
	void verifyOrderTotalIncludesTopOff_CouponsAndRewardspage();
	
	void verifyOrderTotalIncludesTopOff_ConfirmAndSubmitPage();
	
	void verifyCouponsPagination();
	
	void verifyOrderTotalIncludesTopOff_ConfirmationPage();
	
	void verifyManualFreePickDetails_ConfirmSubmitPage(String couponnumber);
	
	void verifyManualFreePickDetails_ConfirmationPage(String couponnumber);
	
	void MakeSelectionWindow_SelectSpecificItem(Configuration testData, double couponprice, double couponprice_limit);
	
	void SelectItem_TopOff_DTS(Configuration testData, double topoff_dts);
	
	void MakeSelectionWindow_SelectSpecificItem_Apply(Configuration testData, double couponprice, double couponprice_limit);
	
	void MakeSelectionWindow_SelectMultipleItems(Configuration testData, double couponprice, double couponprice_limit);
	
	void MakeSelectionWindow_SelectGrade(Configuration testData);
	
	void MakeSelectionWindow_SelectDifferentGrade(Configuration testData);
	
	void MakeSelectionWindow_SelectDropDownGradeLevel();
	
	void MakeSelectionWindow_verifyListDropDownGradeLevel();
	
	void MakeSelectionWindow_verifyTeacherCatalogueInDropDownGradeLevel();
	
	void MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel();
	
	void MakeSelectionWindow_Search_WithSpecificTerm(Configuration testData);
	
	void MakeSelectionWindow_ExpiredItems_ValidationMessage();
	
	void MakeSelectionWindow_NoResultItem_ValidationMessage();
	
	void MakeSelectionWindow_TopOffAmtPresent_Message();
	
	void MakeSelectionWindow_TopOffAmtNotPresent_Message();
	
	void verifyYourCurrentSelectionSection();
	
	void verifyYourCurrentSelectionSection_FreePickCoupon();
	
	void getYourCurrentSelectionSection_FreePick();
	
	void verifyManualFreePickItemsPriceWithInCouponAmount(double ManualFreePickTier1CouponAmt, double ManualFreePickTier2CouponAmt);
	
	void getYourCurrentSelectionSection();
	
	void verifyResultforParticularSearch(String couponsearch);
	
	void verifyResultforParticularSearch_FreePickCoupon(String couponsearch);
	
	void clickCancelLinkOfPaypalSection();

	void clickOnCheckoutButton();
	
	void verifyInsufficientBPModel(Configuration testData);

	void clickOnGotoYourTeacherOrder();

	void verifyAgreementIdNotPresent(Configuration data);

	void updatePaypalWallet();

	void verifyBillingAgreementIdareSame(Configuration testData);

	void addDollarToSpentCouponWithTopOff(Configuration testData);

	void selectReturnToShop();

	void fillTxtCardNumber(String cardNumber, String securityCode);
	
	void fillTxtCardNumber();
	
	void unCheckPOP();

	void validateCardErrorMessage();

	void verifyTrustWavePopUpModal();

	void verifyItemListIsDisplayed(Map<String, ProductInfoBean> Products);

	void verifyContentAssetMessageOnConfirmAndSubmit();

	void verifyRecommandedItemsFunctionality();

	void verifyPrintButtonFunctionality();

	void verifyAppleStatusInfoOnConfirmAndSubmitPage();

	void handleSecurityCode(Configuration testData);
	void validateCreditCardFormError();

	void verifyConfirmatinInfo();
	void clickOnSendMetoPaypalCheckBox();

	void verifyOrderConfirmationPage();
	
	void verifyCheque_CreditPayement_ConfirmationPage();
	
	void verifyCheque_CreditPayement_SubmittedPage();
	
	void clickOnMakeSelectionButton();

	void verifyDollarToSpendSectionOnRewardsAndCoupons();

	void selectPlusMinusIconOnBonusPointSection(String iconName);

	void verifyBonusPointSectionCollapseOnScreen();

	void finalizeErrorCouponMessage();

	void clickOnCloseIcon();
	
	void clickOnCancel_CouponPopup();

	void verifyIncompleteSfoCouponModel();
	
	void verify_bonusperc_manualCoupon_presence();

	void clickOnAgreeAndContinuePaypal();

	void clickOnEditLinkOnDollarToSpendSection();
	
	void clickOnEditLinkOnFreePickCouponSection();

	void verifyClassroomTeacherInfo();
	
    void MakeSelectionWindow_DeleteSelectedItem();

	void navigatetoReviewYourCartPage();
	
	void navigateToPaymentsPage();

	void enter_amount_in_student_Bonus_Bank();

	void click_on_Apply_in_Students_section();

	void enter_amount_in_teacher_Bonus_Bank();

	void click_on_Apply_in_Teacher_section();

	void enter_amount_in_student_Paper_Bank();

	void enter_amount_in_teacher_Paper_Bank();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage();

	void Validation_of_Student_club_Total_in_RewardsCouponsPage();

	void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage();

	void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_gst_qst();

	void Validation_of_Student_club_Total_in_RewardsCouponsPage_gst_qst();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst_qst();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_hst();

	void Validation_of_Student_club_Total_in_RewardsCouponsPage_hst();

	void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_hst();

	void Validation_of_Student_club_Total_in_RewardsCouponsPage_gst();

	void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_gst();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst_hst();

	void edit_of_Student_Bonus_Bank_and_paper_coupons();

	void edit_of_Teacher_Bonus_Bank_and_paper_coupons();

	void Validation_of_updated_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage();

	void validation_of_Student_club_PostAmt_items_redemption_pop();

	void validation_of_Teacher_catalogues_PostAmt_items_redemption_pop();

	void validation_of_Student_and_Teacher_catalogues_Total_owing_amount();

	void navigateToPaymentsPage_2();

	void validation_of_StudentClub_Total_owing_amount_Payment_Page();

	void fillCCAndCheckAmount_PaymentPage();

	void validation_of_TeacherCatalogues_Total_owing_amount_Payment_Page();

	void navigateToPaymentsPage_3();

	double navigateToPaymentsPage_4();
	
	double teacher_navigate_to_payment_page();
	
	void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst();

	double Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage();
	
	double Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage_2();
	
	void Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage_Final(double value1, double value2);

	boolean Validation_alternate_shipping_displayed_in_PaymentsPage();

	void Select_Alternate_Shipping_Address_in_Payment_Page();
	
	void Select_Alternate_Shipping_Address_Enters_Postalcode_City_Province();
	
	void Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_City_Province();
	
	void Select_Alternate_Shipping_Address_Enters_Address1_City_Province();
	
	void Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_Province();
	
	void Select_Alternate_Shipping_Address_Enters_Address1_City_Postalcode();

	void validation_of_Rewards_earned_amount_message_CouponsRewardsPage();

	void validation_of_Submit_order_date_CouponsRewardsPage();

	void verify_Dollars_To_Spend_Section_displayed();

	void User_selects_Select_By_Grade();

	WebElement Selection_Grade_level_inPopUp_Coupons_Rewards();

	void verify_display_of_all_items_from_diff_Flyers_Selected_By_Grade();

	void Selects_an_item_from_Make_Selection_window();

	void validation_of_selected_item_Section_MakeYourSelection();

	void Selects_multiple_items_from_Make_Selection_window();

	double verify_Dollars_To_Spend_Section_displayed_and_get_Tot_amt();

	double Selects_an_item_from_Make_Selection_window_And_get_Exceeded_amt();

	void validation_of_GST_PST_are_charged_on_topOff_and_post_tax_topOff_amount(
			double TotAmt, double ExceededAmt);

	void validation_of_GST_QST_are_charged_on_topOff_and_post_tax_topOff_amount(
			double TotAmt, double ExceededAmt);

	void validation_of_HST_is_charged_on_topOff_and_post_tax_topOff_amount(
			double TotAmt, double ExceededAmt);

	void validation_of_GST_is_charged_on_topOff_and_post_tax_topOff_amount(
			double TotAmt, double ExceededAmt);

	double Selects_multiple_items_from_Make_Selection_window_And_get_Exceeded_amt();

	void validation_of_No_Taxes_is_charged_on_topOff_and_post_tax_topOff_amount(
			double TotAmt, double ExceededAmt);

	boolean verify_Dollars_To_Spend_Section_is_not_displayed();

	void apply_a_coupon_Rewards_page();

	void verify_FreeItem_displayed_in_Rewards_page();

	void verify_FreeItem_section_displayed_in_Payment_and_OrderRef_page();

	void verify_error_message_displayed_in_Rewards_page();

	void delete_the_FreeItem_RewardsPage();

	boolean verify_earned_BonusBank_amt_is_not_displayed_in_rewardsPage();

	boolean verify_Bonus_percentage_description_is_not_displayed_in_rewardsPage();

	void verify_the_percentage_recieved_in_Rewards_page_tier2();

	void verify_Bonus_percentage_description_is_displayed_in_rewardsPage();

	void verify_the_percentage_recieved_in_Rewards_page_tier1();

	double verify_the_percentage_recieved_in_Rewards_page_tier1_with_BonusPercentage();

	void verify_the_percentage_recieved_in_Rewards_page_tier1_after_deletes_the_Bonus_coupon(
			double earned_Amt);

	void verify_upseller_message_displayed_Rewards_page();

	void verify_Teacher_receives_FlatBonusDollars();
	
	void enter_amount_in_student_bonus_Bank_Equal_To_OrderTotal();
	
	void enter_amount_in_student_Bonus_Bank_Greater_Than_BonusBank_Amount();
	
	void enter_amount_in_student_Bonus_Bank_Greater_Than_StudentClubTotal_Amount();
	
	void enter_amount_in_student_Bonus_Bank_Equal_To_StudentClubTotal_Amount();
	
	void enter_amount_in_teacher_Bonus_Bank_Equal_To_TeacherClubTotal_Amount();
	
	void enter_amount_in_teacher_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount();
	
	void enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
	
	void enter_amount_in_student_Paper_Bank_Greater_Than_StudentClubTotal_Amount();
	
	void enter_amount_in_teacher_Bonus_Bank_Greater_Than_TeacherClubTotal_Amount();
	
	void enter_amount_in_teacher_Paper_Bank_Greater_Than_TeacherClubTotal_Amount();
	
	void enter_amount_in_teachers_Bonus_Bank_Greater_Than_BonusBank_Amount();
	
	void enter_amount_in_shipping_Bonus_Bank_Greater_Than_BonusBank_Amount();
	
	void enter_amount_in_shipping_Bonus_Bank_Equal_To_ShippingFee_Amount();
	
	void enter_amount_in_shipping_Paper_Bonus_Coupon_Equal_To_ShippingFee_Amount();
	
	void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_ShippingFee_Amount();
	
	void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Less_Than_ShippingFee_Amount();
	
	void enter_amount_in_student_Bonus_Bank_Paper_Bank_Greater_Than_StudentClubTotal_Amount();
	
	void enter_amount_in_teacher_Bonus_Bank_Paper_Bank_Greater_Than_TeacherClubTotal_Amount();
	
	void enter_amount_in_student_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
	
	void enter_amount_in_teacher_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount();
	
	void enter_amount_in_shipping_Bonus_Bank_Greater_Than_ShippingFee_Amount();
	
	void enter_amount_in_shipping_Paper_Bonus_Coupon_Greater_Than_ShippingFee_Amount();
	
	void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Greater_Than_ShippingFee_Amount();
	
	void check_StudentClubTotalToZero();
	
	void check_TeacherClubTotalToZero();
	
	void check_ShippingTotalToZero();
	
	void bonusbank_error_msg();
	
	void bonusbankAmount_error_msg();
	
	void teacher_can_Proceed_To_checkout();
	
	void teacher_check_Payment_disabled_checkout();
	
	void teacher_checkout_without_payment();
	
	void teacher_can_Proceed_To_paymentpage();
	
	void teacher_validate_noofitems_studtotals_paymentpage();
	
	void teacher_validate_noofitems_teachertotals_paymentpage();
	
	void teacher_validate_bonusbank_paperbonuscoupon_student_paymentpage();
	
	void teacher_validate_bonusbank_paperbonuscoupon_teacher_paymentpage();
	
	void teacher_validate_bonusbank_paperbonuscoupon_shipping_paymentpage();
	
	void teacher_validate_studtotals_paymentpage();
	
	void teacher_validate_teachertotals_paymentpage();
	
	void teacher_validate__shippingtotals_paymentpage();
	
	void teacher_validate_totalamtowing_paymentpage();

	boolean verify_FreePickCoupon_section_is_not_displayed_in_rewardsPage();

	void Selects_an_item_from_Free_Item_Modal_window();

	void clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();

	void verify_no_search_results_display_in_MakeYourSelection_window();

	void deletes_the_Selected_item_Modal_Selection_Window();

	void verify_ConfirmSubmit_button_disappear_Modal_Selection_Window();

	void closes_the_Modal_window();
	
	void cancel_freepick_selection();

	void verify_selected_items_are_saved_in_Modal_window();
	
	void verify_selected_items_are_notsaved_in_Modal_window();

	void verify_Teacher_catalogue_is_not_displayed_in_Modal_window_dropDown();

	void clicks_on_How_is_my_qualifying_order_tot_cal();

	void verify_explanation_of_qualifying_order_Total();
	
	void MakeSelectionWindow_SelectMultipleItems_ToMeet_Promotions(Configuration testData, double couponprice, double couponprice_limit);
	
    void user_verify_MyAccount_in_ConfirmationPage();
    
    String user_verify_TotalAmt_ConfirmationPage();
	
	void user_selects_MyAccount_in_ConfirmationPage();
	
	void user_selects_MyAccount_DropDown_in_ConfirmationPage();

	void user_selects_Logout_MyAccount_DropDown_in_ConfirmationPage();
	
	void user_selects_BillingAndPayment_MyAccount_DropDown_in_ConfirmationPage();
	
	void user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();

	void selectCreditOption_newCard();

	void teacher_Proceed_To_confirmSubmitPage_from_reviewCart();

	void verifyhomeIcon_ConfirmationPage();

	void verifyCheckoutLabel_ConfirmationPage();

	WebElement getCheckoutLabel_Confirmpage();

	void verifyCheckoutPhases_ConfirmationPage();

	List<WebElement> getCheckoutPhases_Confirmpage();

	void clickhomeIcon_ConfirmationPage();

	WebElement Rewards_earned_amount_message_CouponsRewards();

	void verifyRewardsText1_CouponsAndRewardsPage();

	void verifyRewardsText2_CouponsAndRewardsPage();

	void verifyRewardsText3_CouponsAndRewardsPage();

	void enter_amount_in_student_Bonus_Bank_Paper_Bank();

	void enter_amount_in_teacher_Bonus_Bank_Paper_Bank();

	void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon();

	void apply_TGAT_coupon_in_Rewards_page();

	void verify_TGAT_modal_window_displayed();

	void Teacher_enters_referring_teacher_details_TGAT_modal_window();

	void verify_Teacher_ac_details_displayed_Coupons_applied_section();

	void navigateToPaymentsPage_TGAT();

	void validate_error_message_which_not_meet_the_student_club_tot_value();

	void validate_error_message_for_invalid_customer_account_number();

	void validate_the_error_message_for_Invalide_cust_id();

	void Teacher_enters_referring_teacher_Fname_Lname_in_TGAT_modal_window();

	void validate_Submit_button_is_disabled_in_TGAT_modal_window();

	void Teacher_enters_referring_teacher_AcNum_Lname_in_TGAT_modal_window();

	void Teacher_enters_referring_teacher_AcNum_Fname_in_TGAT_modal_window();

	void apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher1();

	void apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher2();

	void validate_error_message_when_enter_TGAT_secondTime();

	void validate_error_message_when_enter_TGAT_secondTime_in_sameOrder();

	void validate_error_message_when_wrong_TGAT_coupon_enters();

	void validate_error_message_when_order_does_not_qualify_the_min_val();

	void verify_the_toolTip_for_TGAT_coupon_details();

	void close_the_TGAT_modal_window();

	void verify_the_error_msg_without_enter_TGAT_ac_details_and_proceed_checkout();

	void validate_error_message_when_enter_same_TGAT_coupon();

	void select_TGAT_delete_button_and_click_NO();

	void select_TGAT_delete_button_and_click_YES();

	void verify_TGAT_coupon_in_Coupons_Applied_section();

	void verify_TGAT_coupon_not_present_in_Coupons_Applied_section();

	void teacher_validate_Student_GST_PST_paymentpage();

	void teacher_validate_Teacher_GST_PST_paymentpage();

	void teacher_validate_Student_GST_QST_paymentpage();

	void teacher_validate_Teacher_GST_QST_paymentpage();

	void teacher_validate_Student_GST_paymentpage();

	void teacher_validate_Teacher_GST_paymentpage();

	void teacher_validate_Student_HST_paymentpage();

	void teacher_validate_Teacher_HST_paymentpage();

	void teacher_validate_Shipping_GST_PST_paymentpage();

	void teacher_validate_Shipping_GST_QST_paymentpage();
	
	void teacher_validate_Shipping_GST_paymentpage();

	void teacher_validate_Shipping_HST_paymentpage();

	void enter_amount_in_shipping_Bonus_Bank();

	void enter_amount_in_shipping_Paper_Bank();

	void click_on_Apply_in_Shipping_section();

	void teacher_validate_shippingtotals_paymentpage();

	void verifyFreeShippingCharge_Paymentpage(String trim);

	void verifytaxlinesize_paymentpage();

	void teacher_validate_shipping_subtotal_paymentpage();

	void teacher_validate_teacher_subtotal_paymentpage();

	void teacher_validate_student_subtotal_paymentpage();

	double ReviewCart_Total_Amt_Owing();
	
	double ReviewCart_SubTotal_Amt();

	void verifycurrenttotalorderValue_rewardtable();

	void verifyhighlighedrowpopuprewardtable();

	void verify_Grade1_CallOutMsg_rewardsection_english();

	void verify_Grade3_CallOutMsg_rewardsection_english();

	void verify_Grade5_CallOutMsg_rewardsection_english();

	void verify_Grade7_CallOutMsg_rewardsection_english();

	void verify_Grade9_CallOutMsg_rewardsection_english();

	void verify_Grade11_CallOutMsg_rewardsection_english();

	void verify_Grade1_CallOutMsg_rewardsection_french();

	void verify_Grade3_CallOutMsg_rewardsection_french();

	void verifyYourCurrentSelectionSection_DTS();

	void click_dts_paginate2();

	void Label_Alternate_Shipping();

	void Select_Alternate_Shipping_Address_Checkbox();

	void teacher_enter_postalCode_Paymentpage_alternativeaddress()throws AWTException;

	void validate_province_alternativeshipping(Configuration data);

	void validate_provincefield_readonly();

	void clickhomeIcon_mainmenu();

	void CSR_Validation_of_Teacher_catalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Teacher_catalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Teacher_catalogues_HST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Teacher_catalogues_GST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_noTaxes_for_Teacher_catalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();

	void verify_QA_Incentive_field_taking_negative_value(Configuration testData);
	
	void CSR_Validation_of_noTaxes_for_Teacher_catalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_Clubs_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_Clubs_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_Clubs_HST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_Clubs_GST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_noTaxes_for_Student_Clubs_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_noTaxes_for_Student_Clubs_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_and_TeacherCatalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_and_TeacherCatalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_and_TeacherCatalogues_HST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_Student_and_TeacherCatalogues_GST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_noTaxes_for_Student_and_TeacherCatalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_Validation_of_noTaxes_for_Student_and_TeacherCatalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();

	void CSR_validate_StudentClubs_section_displayed_in_RewardsCouponsPage();

	void CSR_validate_TeacherCatalogues_section_displayed_in_RewardsCouponsPage();

	void CSR_validate_StudentClubs_section_is_not_displayed_in_RewardsCouponsPage();

	void CSR_validate_hdr_label_for_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_validate_Toggle_btn_displayed_for_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_StudentClubs_ItemsPrice_Qty_displayed_in_BlueHdr_RewardsCouponsPage();

	void CSR_verify_StudentClubs_section_expanded_RewardsCouponsPage();

	void CSR_verify_StudentClubs_section_Toggle_btn_displayed_as_Minus_RewardsCouponsPage();

	void CSR_clicks_on_StudentClubs_section_Toggle_btn_RewardsCouponsPage();

	void CSR_verify_StudentClubs_section_Toggle_btn_displayed_as_Plus_RewardsCouponsPage();

	void CSR_verify_SubTot_StudentClubs_label_in_RewardsCouponsPage();

	void CSR_verify_Tax_module_section_displayed_for_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_label_REDEEM_BONUS_COUPONS_and_CREDIT_NOTES_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_label_BonusBank_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_paragraph_is_displayed_for_BonusBank_fld_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_BonusBank_txtBox_and_dollar_label_displayed_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_validate_value_of_student_Bonus_Bank_Redemptions_Rewards_Page();

	void CSR_verify_label_PaperBonus_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_paragraph_is_displayed_for_PaperBonus_fld_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_PaperBonus_txtBox_and_dollar_label_displayed_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_validate_value_of_student_Paper_Bonus_Redemptions_Rewards_Page();

	void CSR_verify_label_APPLY_btn_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_label_Student_Clubs_Amt_Owing_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_flds_Student_Clubs_AmtOwing_TotalItems_in_StudentClubs_section_in_RewardsCouponsPage();

	void CSR_verify_label_of_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_label_of_Rewards_earned_Today_in_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_label_of_How_is_Qualifying_Order_in_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_TimeDate_fld_displayed_in_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_TimeDate_text_in_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_fld_How_is_my_Qualifying_Order_value_displayed_in_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_Qualifying_Amt_in_REWARDS_section_in_Redemptions_Rewards_Page();

	void CSR_verify_FreeItem_Promotion_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_label_FreeItem_Promotion_in_Redemptions_Rewards_Page();

	void CSR_verify_fld_FreeItem_Promotion_not_displayed_in_Redemptions_Rewards_Page();

	void CSR_validate_ShippingHandling_section_displayed_in_RewardsCouponsPage();

	void CSR_validate_Toggle_btn_displayed_for_ShippingHandling_section_in_RewardsCouponsPage();

	void CSR_validate_hdr_label_for_ShippingHandling_section_in_RewardsCouponsPage();

	void CSR_verify_ShippingHandling_charge_displayed_in_BlueHdr_RewardsCouponsPage();

	void CSR_verify_ShippingHandling_section_expanded_RewardsCouponsPage();

	void CSR_verify_label_ShippingHandling_price_is_FREE_in_Redemptions_Rewards_Page();

	void CSR_verify_ShippingHandling_section_Toggle_btn_displayed_as_Minus_RewardsCouponsPage();

	void CSR_clicks_on_ShippingHandling_section_Toggle_btn_RewardsCouponsPage();

	void CSR_verify_ShippingHandling_section_Toggle_btn_displayed_as_Plus_RewardsCouponsPage();

	void CSR_verify_ShippingHandling_label_in_RewardsCouponsPage();

	void CSR_verify_Tax_module_section_displayed_for_ShippingHandling_section_in_RewardsCouponsPage();

	void enter_amount_in_Shipping_Bonus_Bank();

	void CSR_validate_value_of_Shipping_Bonus_Bank_Redemptions_Rewards_Page();

	void enter_amount_in_Shipping_Paper_Bonus();

	void CSR_validate_value_of_Shipping_Paper_Bonus_Redemptions_Rewards_Page();

	void CSR_verify_StudentIncentives_field_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_StudentIncentives_textBox_field_displayed_in_Redemptions_Rewards_Page();

	void CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page();

	void CSR_verify_the_value_entered_in_StudentIncentives_textBox_in_Redemptions_Rewards_Page();

	void CSR_verify_the_spcailChars_And_alphabets_values_in_StudentIncentives_textBox_in_Redemptions_Rewards_Page();

	void CSR_verify_PopUp_for_exceeded_students_displayed_for_StudentIncentives_in_Redemptions_Rewards_Page();

	void CSR_verify_PopUp_for_exceeded_students_not_displayed_for_StudentIncentives_in_Redemptions_Rewards_Page();

	void CSR_verify_DTS_section_MakeSelection_fld_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_DTS_modal_window_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_DTS_amt_is_same_in_header_of_MakeSelection_modal_window_in_Redemptions_Rewards_Page();

	void CSR_verify_close_btn_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page();

	void CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page();

	void CSR_verify_deleted_item_not_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page();

	void CSR_delete_selected_item_from_DTS_window();

	void CSR_verify_TopOff_msg_disappeared_in_DTS_modal_window();

	void CSR_verify_updated_total_price_for_selected_items_displayed_in_DTS_modal_window();

	void CSR_verify_updated_RemainingToSpend_amt_displayed_in_DTS_modal_window();

	void CSR_Selects_another_item_from_Make_Selection_window();

	void CSR_verify_correct_TopOff_amt_displayed_in_DTS_modal_window();

	void CSR_verify_correct_YouHaveUsed_amt_displayed_in_DTS_modal_window();

	void CSR_clicks_on_CANCEL_btn_in_DTS_modal_window();

	void CSR_verify_selected_items_are_lost_in_DTS_modal_window();

	void CSR_verify_selected_items_are_saved_in_DTS_modal_window();

	void CSR_clicks_on_EDIT_btn_in_DTS_section_RedemptionsPage();

	void CSR_verify_the_Exceeded_amt_text_in_DTS_modalWindow();

	void CSR_unselects_the_selected_items_DTS_modal_window();

	void CSR_unselects_first_selected_item_from_list_DTS_modal_window();

	void CSR_clicks_on_btn_X_to_delete_item_DTS_window();

	void CSR_verify_callout_msg_to_delete_item_DTS_window();

	void CSR_verify_labels_for_YES_NO_to_delete_item_DTS_window();

	void CSR_clicks_on_NO_btn_to_delete_item_DTS_window();

	void CSR_clicks_on_YES_btn_to_delete_item_DTS_window();

	void CSR_verify_callout_msg_disappered_in_DTS_window();

	void CSR_validate_items_are_removed_in_DTS_modal_window();

	void CSR_verify_Prev_link_disabled_in_first_page_search_results();

	void CSR_navigate_to_last_page_in_search_results_DTS_modal_window();

	void CSR_verify_Next_link_disabled_in_last_page_search_results();

	void CSR_verify_DTS_promotion_not_displayed_RewardsPage();

	void CSR_navigates_from_RewardsPage_to_ReviewCart_Page();

	void CSR_clicks_on_item_title_DTS_window();

	void CSR_verify_table_is_expanded_when_clicks_on_item_DTS_window();

	void CSR_verify_thumbnail_image_displayed_when_clicks_on_item_DTS_window();

	void CSR_clicks_on_HideDetail_link_in_DTS_window();

	void CSR_verify_expanded_table_not_displayed_in_DTS_window();

	void CSR_verify_search_results_range_section_displayed_in_DTS_window();

	void CSR_verify_search_results_Tot_items_section_displayed_in_DTS_window();

	void CSR_verify_item_title_displays_correctly_in_DTS_window();

	void CSR_verify_item_num_displays_correctly_in_DTS_window();

	void CSR_verify_items_list_is_empty_in_DTS_modal_window();

	void check_applybtn_stud_teach_ship_sections();

	void check_editbtn_stud_sections();

	void check_editbtn_teach_sections();

	void check_editbtn_ship_sections();

	void check_skipbtn_stud_teach_ship_sections();

	void verify_autoformatted_postalcode(Configuration testData);

	void teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails() throws AWTException;

	void verify_placeholder_postalcode(Configuration testData);

	void teacher_proceedtocheckout_couponsrewardspage_submitorder();

	void verify_DTS_itemid_ConfirmSubmitPage();

	void MakeSelectionWindow_DTSSelectItem();

	void teacher_enter_correctpostalcode_paymentpage_alternativeaddress() throws AWTException;
	
	void CSR_verify_PopUp_msg_for_StudentIncentives_in_Redemptions_Rewards_Page();

	void CSR_clicks_on_EDIT_btn_for_coupon_fld_in_Redemptions_Rewards_Page();

	void CSR_verify_FreePick_modal_window_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_Selected_items_are_saved_in_FreePick_modal_window();

	void CSR_clicks_on_delete_btn_for_selected_item_FreePick_modalWindow();

	void CSR_verify_Selected_items_are_not_displayed_in_FreePick_modal_window();

	void CSR_verify_checked_btn_not_displayed_for_deleted_item_in_FreePick_modal_window();

	void CSR_clicks_on_entered_FreePick_coupon_fld();

	void CSR_apply_a_coupon_in_Rewards_page();

	void CSR_verify_EDIT_link_displayed_in_coupon_section_in_Rewards_page();

	void CSR_Selects_another_item_from_FreeItem_Selection_window();

	void CSR_verify_selected_item_info_correctly_in_FreeItem_YourSelection_window();

	void CSR_verify_selected_item_only_displayed_YourSelection_list_in_Redemptions_Rewards_Page();

	void CSR_clicks_on_item_title_FreePick_window();

	void CSR_verify_item_num_displays_correctly_in_FreePick_window();

	void CSR_clicks_on_NO_to_delete_coupon_in_Rewards_page_coupons_section();

	void CSR_verify_delete_CallOut_disappeared_in_Redemptions_Page();

	void CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();

	void CSR_clicks_on_YES_to_delete_coupon_in_Rewards_page_coupons_section();

	void CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();

	void CSR_verify_coupon_is_removed_from_cart_in_Redemptions_Page();

	void CSR_validate_error_message_for_invalid_couponCode_RewardsPage();

	void CSR_validate_error_message_for_already_entered_couponCode_RewardsPage();

	void CSR_validate_Apply_btn_enabled_in_RewardsPage();

	void CSR_enters_coupon_without_clicks_on_ApplyBtn_in_Rewards_page();

	void MakeSelectionWindow_dts_enterquantity(Configuration testData);

	void CSR_clicks_on_MakeSelection_in_RedemptionsPage();

	void CSR_enters_value_in_StudentIncentives_if_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_shipping_charge_is_not_free_in_Redemptions_page();

	void CSR_verify_shipping_charge_is_free_in_Redemptions_page();

	void validate_error_message_which_does_not_meet_the_min_cart_val();

	void validate_error_message_for_reenter_the_same_coupon();

	void verify_NoGrade_StudentIncentive_CallOutMsg_rewardsection_english();

	void verify_NoGrade_NoLanguage_StudentIncentive_CallOutMsg_rewardsection_english();

	void validate_cheques_payable_to_message_and_section_displayed_Payment_page();

	void enter_amount_in_student_Bonus_Bank_which_is_equal_to_StudentClub_Tot_amt();

	void enter_amount_in_teacher_Bonus_Bank_which_is_equal_to_TeacherCatalogue_Tot_amt();

	void enter_amount_in_shipping_Bonus_Bank_which_is_equal_to_ShippingCharge_Tot_amt();

	void verify_payment_options_are_not_displayed_and_disabled_PaymentPage();

	void CSR_verify_the_percentage_recieved_in_Rewards_page_tier1_with_BonusPercentage();

	void CSR_verify_error_popup_displayed_RedeemRewards_page();

	void CSR_verify_delete_CallOut_not_displayed_in_Redemptions_Page();

	void CSR_verify_shipping_charge_is_free_in_Redemptions_page_and_delete_appliedCoupon();

	void CSR_verify_BonusFlat_value_displayed_correctly_RedeemRewards_page();

	void CSR_verify_BonusFlat_amt_section_not_displayed_RedeemRewards_page();

	void CSR_verify_BonusFlat_Upsell_msg_displayed_RedeemRewards_page();

	void CSR_enters_PostalCode_PaymentPage();

	void CSR_verify_error_popup_not_displayed_Payment_page();

	void CSR_performs_TAB_key_Payment_Page();

	void CSR_verify_error_popup_displayed_Payment_page();

	void CSR_verify_correct_province_displayed_for_alternate_shipping_Payment_page();

	void CSR_verify_Province_dropdown_disabled_Payment_page();

	void CSR_verify_correct_province_displayed_for_more_states_alternate_shipping_Payment_page();

	void CSR_verify_Province_dropdown_enabled_Payment_page();

	void CSR_fills_alternateAddress_detail_Payment_page();
	
	void enterCreditCardInfo();
	
	void selectCreditCardExpirationYear();
	
	void validatecardyrsList();

	void MakeSelectionWindow_Search_WithSpecificTerm(String string);

	void verify_no_search_results_display_in_MakeYourSelection_window(
			String message);

	void verifyResultforParticularSearch_DTSModal(String couponsearch);

	void enter_redeemable_amount_in_Student_Club_bonus();

	void bonus_bank_reduced_by_redeemable_amount();

	void enter_redeemable_amount_in_Teacher_Catalogue_bonus();

	void enter_redeemable_amount_in_Shippinge_bonus();

	void csr_remove_amount_in_Student_Club_bonus();

	void csr_remove_amount_in_Teacher_Catalogue_bonus();

	void csr_remove_amount_in_Paid_Shipping_bonus();

	void bonus_bank_amount_is_the_same_as_before();

	void check_bonus_bank_amt(WebElement bonus_bank_amt_fld, WebElement bonus_coupon_EDIT_btn, WebElement get_coupon_apply_btn);

	void ToGetExcelData();

	void enter_unique_coupon_code_in_Redeem_Rewards_page();

	void Verify_applied_couon_is_added_and_shipping_charge_is_free_in_Redemptions_page();

	void BM_User_Creation();

	void BM_Password_set_for_BM_Users();

	void CSR_enters_coupon_in_coupon_textbox_field();

	void CSR_clicks_apply_button_on_coupon_textbox();

	void CSR_sees_shipping_as_free();

	void CSR_sees_coupon_in_coupon_layer();

	void CSR_does_not_see__free_shipping_message_Rewards_page();

	void Teacher_selects_redeem_coupon_hyperlink();

	void verify_Rewards_and_redemption_page_is_displayed();

	void Teacher_selects_YTO_option();

	void button_changed_validation_YTO_page(String arg1, String arg2);

	void By_Flyer_link_selected_by_default();

	void Teacher_enters_value_in_search_textbox();

	void Teacher_selects_search_button();

	void Teacher_clicks_hyperlink_next_to_item_number();

	void Teacher_goes_to_YTO_page();

	void Teacher_sees_active_grade_selected();

	void Teacher_sees_active_month_selected();

	void Teacher_clicks_the_Quick_Look_link();

	void Teacher_add_item_to_cart();

	void Teacher_goes_to_review_cart_via_the_mini_popup_on_PDP();

	void Teacher_select_flyer_hyperlink_on_added_item();

	void Teacher_sees_appropriate_book_resource_page();

	void Teacher_cannot_click_the_hyperlink_for_generic_online_items_PDP_QuickLook();

	void Teacher_cannot_click_the_hyperlink_for_generic_online_items_Review_Cart();

	void Teacher_hovers_the_category_hyperlink_next_to_item_number();

	void Teacher_selects_YTO_link_in_popup();

	void freepick_modal_confirmSelectionGrid();

	void freepickItemselected();

	void closeFreepickmodal_crossicon();

	void Teacher_selects_TeacherExclusive_link_in_popup();

	void Teacher_cannot_click_on_Generic_link();

	void Teacher_can_click_on_FLyer_link();

	void Teacher_can_click_on_Book_Resource_link();

	void Teacher_click_YTO_ByItem_link();

	void Teacher_add_items_to_cart_via_YTO_ByItem(boolean multipleItems);

	void Teacher_clicks_ADD_button_YTO_ByItem();

	void Teacher_edit_quantity_of_first_item_YTO_ByItem();

	void Teacher_sees_entered_quantity_first_item_YTO_ByItem();

	void Teacher_selects_X_icon_on_first_item_YTO_ByItem();

	void Teacher_selects_YES_on_delete_modal_first_item_YTO_ByItem();

	void Teacher_does_not_see_deleted_item_first_row_YTO_ByItem();

	void Teacher_sees_delete_modal_first_item_YTO_ByItem();

	void Teacher_does_not_see_table_under_YTO_ByItem_layer();

	void ADD_button_enabled_YTO_ByItem();

	void Teacher_sees_does_not_exist_error_msg_YTO_ByItem();

	void ItemNum_textbox_is_empty_YTO_ByItem();

	void ADD_button_disabled_YTO_ByItem();

	void Teacher_sees_entered_item_number_YTO_ByItem();

	void Teacher_does_not_see_entered_item_number_YTO_ByItem();

	void Teacher_sees_incorrect_error_msg_YTO_ByItem();

	void Teacher_sees_shopping_cart_updated_YTO_ByItem(int arg1);

	void Teacher_clicks_in_the_ItemNum_textbox_YTO_ByItem();

	void Teacher_sees_dropdown_menu_YTO_ByItem();

	void Teacher_sees_previously_added_item_in_dropdown_YTO_ByItem();

	void Teacher_sees_recent_added_item_YTO_ByItem();

	void Teacher_adds_previous_item_from_dropdown_YTO_ByItem();

	void Teacher_sees_item_from_dropdown_in_ItemNumtextbox_YTO_ByItem();

	void payment_cc_and_savedcreditcard();

	void payment_select_savedcreditcard();

	void passwordSet_in_BM_TCOD() throws InterruptedException;

	void CSR_selects_Reset_button();

	void CSR_selects_YES_on_Reset_modal();

	void CSR_sees_empty_bonus_bank_txtbox_YTO();

	void CSR_sees_empty_paper_coupons_txtbox_YTO();

	void CSR_does_not_see_coupons_in_Rewards_page();

	void CSR_sees_empty_bonus_bank_txtbox_Teacher_Exclusive();

	void CSR_sees_empty_paper_coupons_txtbox_Teacher_Exclusive();

	void CSR_sees_empty_bonus_bank_txtbox_Paid_Shipping();

	void CSR_sees_empty_paper_coupons_txtbox_Paid_Shipping();

	void CSR_selects_NO_on_Reset_modal();

	void CSR_sees_the_same_applied_bonus_bank_txtbox_YTO();

	void CSR_sees_the_same_applied_paper_coupons_txtbox_YTO();

	void CSR_sees_the_same_applied_bonus_bank_txtbox_Teacher_Exclusive();

	void CSR_sees_the_same_applied_paper_coupons_txtbox_Teacher_Exclusive();

	void CSR_sees_the_same_applied_bonus_bank_txtbox_Paid_Shipping();

	void CSR_sees_the_same_applied_paper_coupons_txtbox_Paid_Shipping();

	void CSR_sees_coupon_in_Rewards_section();

	double Selects_first_item_from_Make_Selection_window_And_get_Exceeded_amt();

	void Selects_first_item_from_Make_Selection_window();

	void BM_Password_reset_after_expiry_for_BM_users();

	void TCOD_delete_applied_coupon_Rewards_page();

	void verify_ManualFreePick_coupon_Details_ConfirmSubmitPage();

	void verify_selected_FreePick_item_info_Rewards_Page();

	void CSR_verify_Free_TeacherKit_Promotion_displayed_in_Redemptions_Rewards_Page();

	void CSR_verify_fld_Free_TeacherKit_Promotion_not_displayed_in_Redemptions_Rewards_Page();

	void CSR_selects_second_item_in_FreePick_window_Redemptions_Rewards_Page();

	void CSR_apply_a_same_coupon_Rewards_page();

	void verify_Searched_FreePick_Item_displayed_in_results_list();

	void apply_TGAT_coupon_second_time_in_Rewards_page();

	void verify_TGAT_couon_info_Coupons_applied_section();

	void navigatesfo_clickapplycoupon_entercoupon_applybutton();

	void verify_no_search_results_display_in_makeyourselection_window();

	void verify_rewardsPage_spellScholasticMsgdisplay();

	void teacher_verify_BonusFlat_desc_displayed();

	void CSR_verify_BonusFlat_amt_section_is_displayed_RedeemRewards_page();

	void teacher_enter_redemptions(String section);

	void verify_applied_coupon_is_displayed_in_coupons_section_Rewards_page();

	void CSR_selects_TGAT_delete_button_and_click_YES();

	void CSR_selects_TGAT_delete_button_and_click_NO();

	void updateParentSiteAttributesBM() throws InterruptedException;

	void bonus_flat_bonus_percentage_promotion_displays_Rewards_page();

	void free_item_promotion_displays_Rewards_page();

	void Spell_Scholastic_promotion_displays_Rewards_page();

	void student_incentive_promotion_displays_Rewards_page();

	void bonus_flat_bonus_percentage_promotion_not_displayed_Rewards_page();

	void apply_a_coupon_without_deleting_existing_coupons();

	void verify_free_pick_item_Confirm_Submit_page();

	void verify_SFO_free_pick_item_Confirm_Submit_page();

	void verify_coupon_list_section_is_displayed();

	void verify_payment_section_display_no_payment_Confirm_andSubmit();

	void verify_SOO_Paid_amount_is_zero_Order_Summary();

	void verify_bonus_rewards_displayed_Confirm_andSubmit();

	void verify_free_item_rewards_displayed_Confirm_andSubmit();

	void verify_spell_scholastic_displayed_Confirm_andSubmit();

	void verify_student_incentives_displayed_Confirm_andSubmit();

	void enter_number_students_student_incentives_Rewards_Page();

	void enter_entire_amount_with_bonus_bank_paper_coupon_TE();

	void enter_entire_amount_with_bonus_bank_paper_coupon_YTO();

	void enter_entire_amount_with_paper_coupon_SFO();

	void apply_a_BonusFlat_coupon_Rewards_page();

	void apply_a_BonusFlat_coupon_without_deleting_existing_coupons();




}
