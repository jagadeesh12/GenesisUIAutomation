package com.dw.automation.pages;

import java.awt.AWTException;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

import com.dw.automation.sections.ICouponSection;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.IProductOrderTableSection;

public interface IStudentFlyerOrdersPage {

	IProductOrderTableSection getIProductOrderTableSection();

	IProductOrderSummarySection getIProductOrderSummarySection();

	ICouponSection getICouponSection();

	void waitForPageToload();
	
	void fillStudentFlyerOrder(String studentName, String itemQty);
	
	void fillTeacherCatalogueFlyerOrder(double itemprice, double itemprice_limit, String studentname, String itemQty);
	
	void fillStudentFlyerOrder_multiQuantiy_Promotions(double itemprice, double itemprice_limit, String studentName, String itemQty);
	
	void fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage(String updated_itemQty);

    void fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage1(String updated_itemQty);
	
	void fillStudent_TeacherFlyerOrder_ModifyQuantity_ReviewCartPage(String updated_itemQty);
	
	void fillStudentFlyerOrder_ModifyQuantity_StudentClubs_ReviewCartPage(String updated_itemQty);
	
	void fillStudentFlyerOrder_Eligible_Promotions(double itemprice, double itemprice_limit, String studentName, String itemQty);
	
	void fillStudentFlyerOrder_Eligible_Promotions_SecondTier(double itemprice, double itemprice_limit, String studentName, String secondtier_itemQty);
	
	void fillStudentFlyerOrder_Eligible_Promotions_SecondTier_ReviewCart(String secondtier_itemQty);
	
	void fillStudentFlyerOrder_Eligible_Promotions_FirstTier_ReviewCart(String itemQty);

    void fillStudentFlyerOrder_Eligible_Promotions(double itemprice, String studentName, String itemQty);
	
    void fillStudentFlyerOrder_Promotions(String studentName, String itemQty);

	void fillStudentFlyerOrder_NotEligible_Promotions(double itemprice, String studentName, String itemQty);
	
	void placeItems_GlobalSearch(String itemName, String itemQty);
	
	void placeItems_GlobalSearch_Teach_StudentItems(String itemName, String itemQty, String itemName2, String itemQty2);
	
	void placeItems_GlobalSearch_Teach2_StudentItem1(String itemName, String itemQty, String itemName2, String itemQty2,String itemName3, String itemQty3);

	void applyCoupons(String studentName, String coupons);

	void clickOnApplyCouponLink();

	void clickOnItemAddedOnStudentFlyerTable(Configuration data);

	void clickOnReviewCart();

	void reviewCartPageMiniPDPDisplays();

	void verifyItemNo_ReviewCartpage(String itemNo);

	void clickOnReviewOrderLink();

	void verifyStudentNameFieldFunctionality();

	void verifyDefaultValueOfStudentFlyerOrder();

	void validateAddButtonFuncationality(Configuration testData);

	void verifyItemTotalCountOnSFOTab();

	void verifyStudentFlyerOrderErrorMessage(String errorMessage);

	void verifyStudentOrderFieldinInStudentFlyerOrder();

	void verifyItemIdField(String itemNumber);

	void verifyStudentRoster(Configuration data);

	void verifyMaxCharLimitForStudentName(String studentName);

	void verifyUpdatedRecordsAfterRemoval(Configuration testData);

	void clickOnYTO();

	void clickOnSOO();

	void clickOnSFO();

	void verifyStudentNameInRoster(Configuration testData);

	void selectFromRoster();

	void verifySelectedRoster();

	void addscoupon(Configuration testData);

	void verifycouponConfirmation();

	void enterCoupon(Configuration testData);

	void verifySOOTabInActive();

	void verifyaddedcoupon(Configuration testData);

	void removeaddedfreeitem(Configuration testData);

	void verifyBlankCouponsEntryForm();

	void closeCoupanModalOnSFO();

	void fillSFOForm(String studentName, String Itemid);

	void verifyOrderTabs();

	void verifyStudentNameOnSfoCouponModal(String studentName);

	void verifyTabAndChildTabIsActive(String tabId, String childTabText);

	void fillStudentFlyerOrderWithSpecificField(String fieldName, Configuration data);

	void deleteAllItemOnModal();

	void EnterCouponAndSelectApplyOnSFOPage(Configuration testData);

	void enterStudentNameOnSFOPage(String string);

	void clickOnAddCouponLinkOnSFO();

	void verifyStudentNamePrepopulatedOnCouponModule(String studentName);

	void enterCouponInCouponModule(String couponNumber);

	void verifyApplyCouponButtonIsInActive();

	void clickOnApplyCouponButtonOnCouponModal();

	void verifyeSortedStudentList();

	void selectStudentName(String studName);

	void enterStudentNameAndItemNumberOnSFO(String studentName, String itemId);

	void verifyAddButtonIsActive();

	void clickOnAddButton(Configuration testData);

	void enterAndVerifyWrongItemErrorMessages(Configuration testData);

	void clickOnItemFromSFOOrderTable();

	void verifyItemsSortedInAscendingOrder();

	void verifyInvalidStudentNameErrorMessage();

	void verifyTeacherOnlyCouponErrorMessage();

	void verifyMaxTwentyAlphanumericCharForStudentNameField(String studentName,
			int maxSize);

	void verifyTabIsActive(String tabId);

	void enterItemOnSFO(String string);

	void verifyStudentNamePopullatedInStudentNameField(String string);

	void clickOnLblStudentNameOrderTable();

	void verifyStudentNameAscendingOrderSort();

	void verifyStudentNameDescendingOrderSort();

	void verifyItemsAscendingOrderSort();

	void verifyItemsDescendingOrderSort();

	void clickOnFlyerFromSFOOrderTable();

	void verifyFlyerDescendingOrderSort();

	void verifyFlyerAscendingOrderSort();

	void verifyDescriptionofItem(Configuration data);

	void verifyHideDetails(Configuration data);

	void verifyRecommendedButton();

	void verifyWishListButton();

	void verifyAddedDataOrderInSFOOrderTable(Configuration testData);

	void verifyAutosuggestionOnSFOFields(Configuration testData);

	void clickOnAddButtonAndVerifyUpdateToSavedButton(Configuration testData);

	void verfiyAutoSuggestionFunctionality(Configuration testData);

	void clickOnColumnFromSFOOrderTable(String columnName);

	void verifyTitleDescendingOrderSort();

	void verifyTitleAscendingOrderSort();

	void verifyPriceAscendingOrderSort();

	void verifyPriceDescendingOrderSort();

	void clickOnCouponSort();

	void verifyCouponsAscendingOrderSort();

	void verifyCouponsDescendingOrderSort();

	void clickOnItemTitle();

	void clickOnOrderTableHideDetail();

	void clickonAnotherItemOfOrderTable();

	void hidePreviousItemDetailInOrderTable();

	void verifyReviewSFOTitle();

	void verifyReviewCartbtnonReviewSFO();

	void verifyReviewOrderOnSFO();

	void verifyExistanceofPopUp();

	void verifyErrorMessageForCoupons(Configuration testData);

	void fillStudentFlyerOrder_items_SameMonth();

	void fillStudentFlyerOrder_items_Diff_Month();

	void add_items_from_diff_TeacherClubs();

	void Teacher_adds_items_from_different_Student_and_Teacher_clubs();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total();

	void Validation_of_Student_club_SubTotal_and_Total();

	void Validation_of_Teacher_club_SubTotal_and_Total();

	//void Validation_of_Teacher_club_SubTotal_and_Total_2();

	//void Validation_of_Student_club_SubTotal_and_Total_2();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_2();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_3();

	void Validation_of_Student_club_SubTotal_and_Total_3();

	void Validation_of_Teacher_club_SubTotal_and_Total_3();

	void Validation_of_Student_club_SubTotal_and_Total_2();

	void Validation_of_Teacher_Catalogues_SubTotal_and_Total();

	void Validation_of_Student_club_SubTotal_and_Total_4();

	void Validation_of_Teacher_Catalogues_SubTotal_and_Total_2();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_4();

	void Validation_of_no_taxes_are_charged_on_Student_and_Teacher_club_Subtotal_Total_amount();

	void edit_item_qty1_in_reviewcartPage();

	void edit_item_qty2_in_reviewcartPage();

	void edit_item_qty3_in_reviewcartPage();

	void edit_student1_name_field_in_reviewcartPage();

	void edit_student2_name_field_in_reviewcartPage();

	void edit_student3_name_field_in_reviewcartPage();

	void Teacher_adds_items_from_different_Student_and_Teacher_clubs_2();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_ConfirmSubmitPage();
	
	void Validation_of_Student_club_And_Teacher_Catalogues_Total_SubmittedPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_QST_ConfirmSubmitPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_HST_ConfirmSubmitPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_ConfirmSubmitPage();

	void Validation_of_no_taxes_are_charged_on_Student_and_Teacher_club_Subtotal_Total_amount_ConfirmSubmitPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_after_enter_BPoints_GST_ConfirmSubmitPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_PST_OrderRefPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_QST_OrderRefPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_HST_OrderRefPage();

	void Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_OrderRefPage();

	void Validation_of_no_taxes_are_charged_on_Student_and_Teacher_club_Subtotal_Total_amount_in_OrderRefPage();

	void fillStudentFlyerOrder_items();

	void Teacher_enters_StudentName_clicks_On_TickMark_StudentClub();

	void Verify_entered_student_name_field_in_StudentClub();

	void Validation_of_Student_club_Total_ShippingFee_GST_PST_OrderRefPage();

	void Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_QST_OrderRefPage();

	void Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_PST_OrderRefPage();

	void Validation_of_Student_club_Total_ShippingFee_GST_QST_OrderRefPage();

	void Validation_of_Student_club_Total_ShippingFee_HST_OrderRefPage();

	void Validation_of_Teacher_Catalogues_Total_ShippingFee_HST_OrderRefPage();

	void Validation_of_Student_club_Total_ShippingFee_GST_OrderRefPage();

	void Validation_of_Teacher_Catalogues_Total_ShippingFee_GST_OrderRefPage();

	void Validation_of_Student_club_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();

	void Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();

	void Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();

	void Validation_of_Student_club_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();

	void Validation_of_Student_club_Total_ShippingFee_HST_ConfirmSubmit_Page();

	void Validation_of_Teacher_Catalogues_Total_ShippingFee_HST_ConfirmSubmit_Page();

	void Validation_of_Student_club_Total_ShippingFee_GST_ConfirmSubmit_Page();

	void Validation_of_Teacher_Catalogues_Total_ShippingFee_GST_ConfirmSubmit_Page();

	void Teacher_clicks_On_Minus_btn_for_student_1_YTO();

	int Validation_of_item_qty_decreased_in_YTO_Page();

	void Validation_of_item_qty_decreased_in_ReviewCart_Page(int d);

	void Teacher_clicks_On_Plus_btn_for_student_1_YTO();

	void Validation_of_item_qty_increased_in_ReviewCart_Page(int value_act);

	int Validation_of_item_qty_increased_in_YTO_Page();

	void Teacher_enters_StudentName_and_hits_ENTER_StudentClub();

	boolean Validation_alternate_shipping_header_displayed_in_ConfirmSubmit_Page();

	boolean Validation_alternate_shipping_Address_field_displayed_in_ConfirmSubmit_Page();

	boolean Validation_the_TEXT_Alternate_Shipping_Address_displayed();

	void Validation_of_Amount_paid_by_Credit_Card_and_Cheques_ConfirmSubmit_Page();

	void Validation_of_Amount_paid_by_Credit_Card_ConfirmSubmit_Page();

	void Validation_of_Teacher_club_SubTotal_and_Total_3123();

	void user_navigates_to_Home_page_from_Order_ref_page();

	void fillStudentFlyerOrder_items_SameMonth_2();

	void Teacher_adds_items_from_single_flyer_Teacher_clubs();

	void fillStudentFlyerOrder_items_lessthan_req_amount();


	void clickSearchOnbGlobalSearchBar();

    void GlobalSearch(String itemName);

	void clickItemNoReviewCartPage(String itemNo);

	void displayedItemNoConfirmSubmitPage(String itemNo);

	void verifyItemNoPDPpage(String itemNo);

	void csr_verifyItemSourcePage();

	void csr_verifyItemSourceDialogueTitle();

	void csr_verifyItemSourceDialogue_closeIcon();

    void csr_verifyItemSourceDialogue_refNo();

    void csr_popupOrderConfirmationIsPresent();

    void GlobalSearchUniqueItemID(String itemNo);

	void verifyOnlyOneSearchResultDisplaysHomePage(String itemNo);

	void uniqueItemDisplayProductDetailPage(String bookTitle);

	void verifyReviewYourCartpageSingleItemShow(String bookTitle);
	
	void ResultsGreater_ViewAllLink(int prodcount);
	
	void ResultsLesser_ViewAllLink(int prodcount);
	
	void ClickViewAllLink();
	
	void CheckProductCountAfterClickViewAll();
	
	void verifyViewAllLinkNotPresent();

	void fillStudentFlyerOrder_items_SameMonth_for_to_reach_the_amt_nextTier();

	void user_deletes_item1_in_reviewCart();

	void user_deletes_item2_in_reviewCart();

	void user_deletes_item3_in_reviewCart();

	void verify_YTO_page_displayed();

	void clicks_on_EnterOrders_ReviewCartPage();

    void click_SFO();

    void verify_SFO_YTO_linksDisplayed();

    void verify_SFO_pageText();

    void verify_SFO_Page_title();

    void verify_SFO_Page_SFOTab();

    void verify_SFO_Page_YTOTab();

    void verifySFOPage();

	void validatedefaultSFOcouponmodal();

	void getsfo_coupon_labelstudentName_text();

	void getsfo_coupon_labelcoupon_text();

	void getsfo_coupon_ApplyButton_State();

	void getsfo_coupon_ApplyButton_State_disabled();

	void click_sfo_coupon_ApplyButton_State();

	void sfopage_appliedCoupondisplayed();

	void getsfocoupon_Sname_getError();

	void get_sfocoupon_modal_couponcode_getError();

	void get_sfocoupon_modal_couponcode_NoError();

	void get_sfocoupon_modal_couponcode_expiredcoupon_getError();

	void get_sfocoupon_modal_couponcode_redeemedcoupon_getError();

	void get_sfo_infolink_aboutEnterStudentname();

	void validate_sfo_studentname_infopopupmodal();

	void validate_sfo_studentname_infopopupmodal_closed();

	void validate_sfo_studentname_infopopupmodalMessage();

	void validate_sfo_studentname_infopopupmodalMessage_link();

    void verifySFOPage_labels_Display();

	void clicks_on_shop_Books_Resources_ReviewCartPage();

	void verify_page_shop_books_Flyers_displayed();

	void enters_Only_student_name_StudentClubs();

	void clicks_on_flyer_and_month();

	void clicks_on_First_item_in_a_Flyer();

	void clicks_on_SeeFullDetails_for_item();

	void navigate_to_back_from_currentPage();

	void verify_the_same_flyer_and_month_displayed();
	
	void verify_the_same_flyer_and_month_displayed1();

	void search_for_any_item();
	
	void Wait_for_invisibility_of_locator();

	void fillStudentFlyerOrder_items_Safari();

	void checkIteminPDP_clicked();

	void verifyReviewCartStudentTeacherClubTotalsLabel();

	void verifyConfirmSubmitStudentTeacherClubTotalsLabel();

	void Validation_of_shipping_Address_field_displayed_in_ConfirmSubmit_Page();

	void Validation_of_TGAT_coupon_info_diaplyed_in_Confirm_Submit_page();

	void CSR_selects_orderType_as_PhoneOrder();

	void validate_Verify_Account_Page_is_displayed();

	void Clicks_on_Continue_To_Order_Entry_in_VerifyAccountPage();

	void Clicks_on_Continue_To_verify_Account_in_LocateAccountPage();

	void validate_Order_Entry_Page_is_displayed();

	void validate_Order_Entry_tab_is_highlighted();

	void validate_Order_Entry_form_is_displayed();

	void verify_Proceed_To_Checkout_btn_is_displayed();

	void validate_locate_account_is_displayed();

	void validate_active_progress_tab();

	void validate_progresstabs_order();

	void verify_two_layers_displayed_in_Order_Entry_Page();

	void verify_two_tabs_displayed_in_first_layer_Order_Entry_Page();

	void verify_StudentsOrders_tab_disabled_in_first_layer_Order_Entry_Page();

	void verify_TeacherOrders_tab_selected_in_first_layer_Order_Entry_Page();

	void verify_default_forms_displayed_in_Second_layer_Order_Entry_Page();

	void verify_Flyer_Code_field_is_displayed_in_Order_Entry_Page();

	void verify_items_Entry_fields_is_displayed_in_Order_Entry_Page();

	void verify_Form_expansion_buttons_is_displayed_in_Order_Entry_Page();

	void verify_the_label_of_FLYER_CODE_in_Order_Entry_Page();
	
	void enteritemcodeQty();
	
	void clickProceedToCheckout();
	
	void verify_ReviewCartPageDiplayed();

	void verify_the_placeholder_text_in_FLYER_CODE_in_Order_Entry_Page();

	void CSR_enters_FLYER_CODE_in_Order_Entry_form();

	void verify_entered_FLYER_CODE_in_Order_Entry_form();

	void verify_the_header_of_first_column_entry_in_Order_Entry_from();

	void verify_the_header_of_second_column_entry_in_Order_Entry_from();

	void verify_the_header_of_third_column_entry_in_Order_Entry_from();

	void verify_Eight_rows_displayed_under_the_header_in_Item_Entry_layer_form();

	void verify_Three_text_boxes_in_each_row_displayed_under_the_header_in_Item_Entry_layer_form();

	void CSR_enters_Item_Number_in_Order_Entry_form();

	void Verify_the_Item_Number_in_Order_Entry_form();

	void CSR_enters_Paid_QTY_in_Order_Entry_form();

	void Verify_the_Paid_QTY_in_Order_Entry_form();

	void verify_Bonus_QTY_textboxes_disabled_Order_Entry_Page();

	void Form_expansion_button_form1_in_Order_Entry_Page();

	void verify_additional_8rows_displayed_in_Order_Entry_forms();

	void CSR_selects_the_last_textbox_in_form1_in_Order_Entry_Page();

	void CSR_perform_Tab_key_in_Order_Entry_Page();

	void verify_additional_8rows_displayed_when_perform_Tab_in_Order_Entry_forms();

	void csr_add_multiple_items_qty_orderentrypage();

    void csr_verify_TotalQty();

    void csr_add_mulitple_item_sameQty_differentflyer();

	void csr_update_multiple_items_qty_orderentrypage();
	
	void verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();

	void verify_School_Info_displayed_in_container2_in_CustProfile();

	void verify_Teacher_Ac_num_in_container3_in_CustProfile();

	void verify_CAC_info_displayed_in_container3_in_CustProfile();

	void verify_the_active_Teacher_status_in_container3_of_CustProfile();

	void verify_the_Inactive_Teacher_status_in_container3_of_CustProfile();

	void verify_the_Held_by_AR_Teacher_status_in_container3_of_CustProfile();

	void verify_the_PrePaid_Teacher_status_in_container3_of_CustProfile();

	void verify_the_Temporary_Hold_Teacher_status_in_container3_of_CustProfile();

	void CSR_enters_the_Ac_Num_and_select_in_Search_Results();

	void csr_Student_club_subtotalprice_qty();

	void csr_student_club_gst_pst();

	void csr_student_club_gst_qst();

	void csr_student_club_hst();

	void csr_student_club_gst();

	void csr_studentclub_teachercatalogues_notaxes();

	void csr_studentclub_total_posttax();

	void csr_studentclub_totalamt_owing_qty();

	void verify_the_label_of_BonusPoints_in_container4_of_CustProfile();

	void verify_the_BonusPoints_Amt_in_container4_of_CustProfile();

	void verify_BonusBank_Amt_is_zero_in_container4_of_CustProfile();

	void verify_BonusBank_Amt_is_correct_in_container4_of_CustProfile();

	void CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();

	void validate_Review_cart_tab_is_highlighted();

	void validate_Review_cart_page_Num_in_StepHeader_Bubble();

	void CSR_clicks_on_Proceed_To_Checkout_btn();

	void CSR_selects_ContinueCheckout_in_Rewards_page();

	void CSR_selects_ContinueCheckout_in_Payments_page();

	void CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();

	void verify_error_msg_for_Invalid_FlyerCode_OrderEntryPage();

	void CSR_enters_Item_Num_filed1_in_OrderEntryPage();

	void CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();

	void verify_error_msg_for_ItemNum_fld_OrderEntryPage();

	void CSR_enters_Item_Num_filed2_in_OrderEntryPage();

	void CSR_enters_Paid_Qty_filed2_in_OrderEntryPage();

	void verify_the_InvalidItem_nums_in_PopUp_in_OrderEntryPage();

	void verify_the_PopUp_for_InvalidItems_and_the_OK_button_in_OrderEntryPage();

	void verify_popUp_msg_with_YES_NO_btns_when_CSR_enters_3digits_in_Qty_fld_OrderEntryPage();

	void Browser_Close();

	void CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();

	void verify_Teacher_Cat_table_expanded_ReviewCartPage();

	void CSR_adds_mul_Student_clubs_items_to_cart_OrderEntryPage();

	void verify_Teacher_Cat_table_is_not_displayed_ReviewCartPage();

	void CSR_clicks_on_minus_btn_YTO_in_ReviewCartPage();

	void verify_YTO_table_is_hidden_in_ReviewCartPage();

	void CSR_clicks_on_Plus_btn_YTO_in_ReviewCartPage();

	void verify_the_added_items_header_order_in_ReviewCartPage();

	void verify_the_added_items_details_displayed_correctly_in_ReviewCartPage();

	void verify_the_items_list_is_in_ascending_order_in_ReviewCartPage();

	void CSR_adds_Teacher_cat_items_from_diff_flyers_to_cart_OrderEntryPage();

	void verify_Single_table_displays_with_all_items_under_TeacherCatalogues_in_ReviewCartPage();

	void additems_submitorder();

	void CSR_enters_Item_Num_filed3_in_OrderEntryPage();

	void CSR_enters_Paid_Qty_filed3_in_OrderEntryPage();

	void CSR_enters_Item_Num_filed4_in_OrderEntryPage();

	void CSR_enters_Paid_Qty_filed4_in_OrderEntryPage();

	void verify_error_msg_for_ItemQty_fld_OrderEntryPage();

	void verify_the_Flyout_with_BBank_rangeList();

	void Validation_of_CSR_Teacher_club_SubTotal_GST_QST_and_TotalOwing();

	void CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();

	void Validation_of_CSR_Teacher_club_SubTotal_GST_PST_and_TotalOwing();

	void Validation_of_CSR_Teacher_club_SubTotal_HST_and_TotalOwing();

	void Validation_of_CSR_Teacher_club_SubTotal_GST_and_TotalOwing();

	void Validation_of_no_taxes_are_charged_on_CSR_Teacher_club_Subtotal_Total_amount();

	void CSR_clicks_on_YES_in_Confirmation_PopUp_PaidQty();

	void CSR_clicks_on_NO_in_Confirmation_PopUp_PaidQty();

	void verify_Confirmation_PopUp_PaidQty();

	void verify_the_PopUp_for_InvalidItems_and_the_Continue_Cancel_buttons_in_OrderEntryPage();

	void verify_the_InvalidItem_nums_2_in_PopUp_in_OrderEntryPage();

	void verify_the_InvalidItem_nums_3_in_PopUp_in_OrderEntryPage();

	void Validation_of_callOut_msg_disappeares_PaidQty();

	void verify_the_InvalidItem_nums_3_4_in_PopUp_in_OrderEntryPage();

	void CSR_clicks_on_Continue_btn_Invalid_items_popup();

	void CSR_verify_ReviewCart_is_displayed();

	void CSR_verify_invalid_item_is_not_displayed_in_ReviewCartPage();

	void CSR_verify_valid_item_is_displayed_in_ReviewCartPage();

	void CSR_clicks_on_Cancel_btn_Invalid_items_popup();

	void verify_the_InvalidItem_PopUp_disappeared_OrderEntryPage();

	void CSR_verify_OrderEntry_page_is_displayed();

	void CSR_clicks_on_BonusBank_in_container4_of_CustProfile();

	void click_Elf();
	
	void click_Grade4And5();

	void verify_studentflyer_teacherpagedownloadlinks();

	void click_TeacherCatalogue();

	void click_studentflyer_downloadlink();

	void verify_pagetitle();

	void verify_BooksResources_page_displayed();

	void verify_TeachersDesk_page_displayed();

	void verify_AllFlyers_page_displayed();

	void CSR_clicks_on_OrderEntry_tab();

	void verify_item_nums_Qty_displays_correctly_OrderEntryPage();

	void CSR_enter_FlyerCode_And_click_on_ProceedToCheckout_OrderEntryPage();

	void CSR_verify_the_items_list_in_ReviewCart_page();

	void CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();

	void CSR_verify_CallOut_msg_and_YES_NO_btns_ReviewCartPage();

	void CSR_wait_for_3secs();

	void CSR_verify_the_label_of_ProceedToCheckout();

	void CSR_clicks_on_ProceedToCheckout_ReviewCartPage();

	void CSR_clicks_on_ProceedToCheckout_in_RewardsCoupons_popup_window();

	void CSR_changes_item_Qty_and_Tab_to_moveOut_ReviewCartPage();

	void CSR_verify_Rewards_Coupons_page_not_displayed();

	void CSR_validate_text_of_OrderEntryPage_header();

	void CSR_verify_the_blue_script_icon_displays_OrderEntryPage();

	void CSR_clicks_on_blue_script_icon_OrderEntryPage();

	void CSR_verify_OrderEntryScript_popup_displayed();

	void CSR_verify_close_btn_displays_in_OrderEntryScript_popup();

	void CSR_closes_the_OrderEntryScript_popup_window_OrderEntryPage();

	void CSR_clicks_on_NO_btn_in_Delete_popup_ReviewCartPage();

	void CSR_verify_delete_confirmation_popup_disappear();

	void CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();

	void CSR_verify_deleted_item_not_displayed_in_ReviewCartPage();

	void CSR_verify_label_of_TotalAmountOwing_in_ReviewCartPage();

	void CSR_verify_total_cost_of_all_items_displays_in_ReviewCartPage();

	void CSR_verify_Total_Qty_and_Items_displays_in_ReviewCartPage();

	void CSR_verify_hyperlink_of_BackToShop_in_ReviewCartPage();

	void CSR_clicks_on_hyperlink_BackToShop_in_ReviewCartPage();

	void CSR_verify_blue_script_icon_displays_in_ReviewCartPage();

	void CSR_clicks_on_blue_script_icon_in_ReviewCartPage();

	void CSR_clicks_on_close_btn_in_modal_window_in_ReviewCartPage();

	void CSR_verify_ReviewCartPage_displays();

	void CSR_verify_modal_window_text_in_ReviewCartPage();

	void CSR_verify_close_btn_displays_in_modal_window_ReviewCart_page();

	void CSR_verify_blue_script_icon_displays_in_RedemptionsRewards_Page();

	void CSR_clicks_on_blue_script_icon_in_RedemptionsRewards_Page();

	void CSR_verify_modal_window_text_in_RedemptionsRewards_Page();

	void CSR_verify_close_btn_displays_in_modal_window_RedemptionsRewards_Page();

	void CSR_clicks_on_close_btn_in_modal_window_in_RedemptionsRewards_Page();

	void CSR_validate_RedemptionsRewards_popup_displayed();

	void CSR_verify_ContinueCheckout_btn_enabled_RedemptionsRewardsPage();

	void CSR_validate_Rewards_And_Coupons_tab_is_highlighted();

	void CSR_validate_Rewards_And_Coupons_page_Num_in_StepHeader_Bubble();

	void CSR_validate_Rewards_And_Coupons_page_displayed();

	void verify_the_default_flyer_displayed();

	void verify_autoformatted_postalcode_Confirmsubmitpage(Configuration testData);

	void validate_Shipping_And_Payment_tab_is_highlighted();

	void verify_the_grade_flyer_month_displayed(Configuration testData);

	void verify_flyer_field_in_reviewcartPage(Configuration testData);

	void CSR_clicks_on_ReviewCart_tab();

	void verify_error_msg_for_missing_FlyerCode_OrderEntryPage();

	void verify_ContinueCheckout_btn_disabled_PaymentPage();

	void verify_alternate_shipping_section_displayed_PaymentPage();

	void CSR_validate_Payment_page_Num_in_StepHeader_Bubble();

	void CSR_verify_the_error_msg_displayed_when_coupon_not_qualify_ReviewCartPage();

	void CSR_verify_blue_script_icon_displays_in_Payment_Page();

	void CSR_clicks_on_blue_script_icon_in_Payment_Page();

	void CSR_verify_modal_window_text_in_Payment_Page();

	void CSR_verify_close_btn_displays_in_modal_window_Payment_Page();

	void CSR_validate_Payment_page_displayed();

	void CSR_clicks_on_close_btn_in_modal_window_in_Payment_Page();

	void verify_ContinueCheckout_btn_enabled_PaymentPage();

	void validate_Confirm_And_Submit_tab_is_highlighted();

	void CSR_verify_SavedCard_displayed_correct_in_PaymentPage();

	void CSR_validate_selected_SavedCard_info_displayed_correct_in_PaymentPage();

	void CSR_validate_Confirm_and_Submit_page_Num_in_StepHeader_Bubble();

	void CSR_verify_blue_script_icon_displays_in_ConfirmSubmit_Page();

	void CSR_clicks_on_blue_script_icon_in_ConfirmSubmit_Page();

	void CSR_verify_modal_window_text_in_ConfirmSubmit_Page();

	void CSR_verify_close_btn_displays_in_modal_window_ConfirmSubmit_Page();

	void CSR_clicks_on_close_btn_in_modal_window_in_ConfirmSubmit_Page();

	void CSR_validate_ConfirmSubmit_page_displayed();

	void CSR_verify_PO_Number_text_box_fld_displayed_in_PaymentPage();

	void validate_mailing_address_section_displayed_Payment_page();

	void validate_mailing_address_text_displayed_correct_Payment_page();

	void CSR_enters_PO_Number_in_PaymentPage();

	void CSR_verify_PO_Number_fld_accepts_entered_val_in_PaymentPage();

	void CSR_verify_PO_Number_fld_not_accept_entered_val_in_PaymentPage();

	void CSR_verify_Student_Clubs_table_Items_displayed();

	void CSR_verify_Student_Clubs_items_displays_in_a_separate_tables();

	void CSR_verify_Student_Clubs_items_displays_in_a_separate_row();

	void CSR_enters_PO_Number_directly_in_PaymentPage();

	void CSR_Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();

	void CSR_Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();

	void CSR_Validation_of_no_taxes_are_charged_on_Teacher_catalogues_Subtotal_Total_amount_ConfirmSubmitPage();

	void CSR_Validation_of_no_taxes_are_charged_on_Student_Clubs_Subtotal_Total_amount_ConfirmSubmitPage();

	void CSR_adds_mul_Student_Teacher_cat_items_from_diff_flyers_OrderEntryPage();

	void CSR_Validation_of_no_taxes_are_charged_on_Student_and_Teacher_Clubs_Subtotal_Total_amount_ConfirmSubmitPage();

	void CSR_enters_the_Ac_Num_and_clicks_on_Search();

	void CSR_verify_Start_a_New_Search_hyperlink_displayed_in_SearchResults_page();

	void CSR_clicks_on_Start_a_New_Search_hyperlink_in_SearchResults_page();

	void CSR_verify_Locate_Account_page_displayed();

	void CSR_selects_TeacheName_and_enters_field_and_clicks_on_Search_LocatePage();

	void CSR_validate_login_section_fields_displayed_LocateAccount_Page();

	void CSR_enters_the_Ac_Num_in_LocateAccount_page();

	void CSR_validate_the_Ac_num_field_accepts_entered_val_LocateAccount_page();

	void CSR_validate_the_Ac_num_field_mot_accept_entered_val_LocateAccount_page();

	void CSR_verify_Search_btn_disabled_in_LocateAccount_page();

	void CSR_verify_Blue_step_script_icon_displayed_in_LocateAccount_page();

	void CSR_clicks_on_Blue_step_script_icon_in_LocateAccount_page();

	void CSR_verify_modal_window_is_displayed_in_LocateAccount_page();

	void CSR_clicks_on_close_btn_modal_window_in_LocateAccount_page();

	void CSR_verify_close_btn_is_displayed_in_modal_window_LocateAccount_page();

	void validate_LocateAccount_tab_is_highlighted();

	void validate_Locate_Account_page_Num_in_StepHeader_Bubble();

	void CSR_verify_Blue_step_script_icon_displayed_in_SearchResults_page();

	void CSR_clicks_on_Blue_step_script_icon_in_SearchResults_page();

	void CSR_verify_modal_window_is_displayed_in_SearchResults_page();

	void CSR_verify_close_btn_is_displayed_in_modal_window_SearchResults_page();

	void CSR_verify_Search_Results_page_displayed();

	void CSR_verify_hyperlink_School_not_in_system_displayed_in_SearchResults_page();

	void CSR_clicks_on_hyperlink_School_not_in_system_in_SearchResults_page();

	void CSR_verify_modal_window_is_displayed_for_SchoolNotInSystem_SearchResults_page();

	void CSR_verify_paragraph_text_is_displayed_in_SchoolNotInSystem_modalWindow_SearchResults_page();

	void CSR_verify_close_btn_is_displayed_in_modal_window_of_SchoolNotInSystem_SearchResults_page();

	void CSR_verify_Account_Hold_Section_displayed_in_Payment_page();

	void CSR_verify_the_hdr_text_Account_Hold_Section_in_Payment_page();

	void CSR_verify_the_radio_btn1_with_text_for_Account_Hold_Section_in_Payment_page();

	void CSR_verify_the_radio_btn2_with_text_for_Account_Hold_Section_in_Payment_page();

	void CSR_verify_the_radio_btns_are_selected_in_Account_Hold_Section_in_Payment_page();

	void addmoreItemstoCartforFreeship();

	void edit_item_qty1_tabout_in_reviewcartPage(String value);

	void CSR_clicks_on_Province_dropDown_list_alternateShipping_section_Payment_page();

	void CSR_validate_the_Province_list_count_alternateShipping_section_Payment_page();

	void CSR_validate_the_Province_list_in_ascending_order_alternateShipping_section_Payment_page();

	void CSR_navigates_from_Submit_page_to_Payment_page();

	void CSR_verify_the_credit_card_lst_count_Payment_page();

	void CSR_clicks_on_Province_dropDown_list_BillingInfo_section_Payment_page();

	void CSR_validate_the_Province_list_count_BillingInfo_section_Payment_page();

	void CSR_validate_the_Province_list_in_ascending_order_BillingInfo_section_Payment_page();

	void CSR_selects_TeacheName_from_dropDown_LocatePage();

	void CSR_enters_Teacher_Fname_LocatePage();

	void CSR_enters_Teacher_Lname_LocatePage();

	void CSR_clicks_on_Search_btn_LocatePage();

	void CSR_validate_Lname_occurence_in_TeacherName_SearchResults_LocatePage();

	void CSR_validate_Fname_occurence_in_TeacherName_SearchResults_LocatePage();

	void CSR_selects_SchoolAddress_from_dropDown_LocatePage();

	void CSR_enters_SchoolName_in_LocatePage();

	void CSR_validate_SchoolName_fld_not_accept_morethan_70_in_LocatePage();

	void CSR_verify_correct_Ac_num_displayed_in_SearchResults_Page();

	void CSR_verify_Error_popUp_displayed_Locate_Page();

	void CSR_enters_the_Ac_Num_in_Locate_Account_page();

	void CSR_verify_Search_btn_enabled_in_LocateAccount_page();

	void CSR_validate_Teacher_Fname_not_accept_morethan_50_LocatePage();

	void CSR_validate_Teacher_Lname_not_accept_morethan_50_LocatePage();

	void CSR_verify_correct_SearchResults_Page_displayed();

	void CSR_selects_country_in_LocatePage();

	void CSR_enters_PostalCode_in_LocatePage();

	void CSR_selects_province_in_LocatePage();

	void CSR_selects_SchoolCity_in_LocatePage();

	void CSR_validate_SchoolAddress_results_search_results_page();

	void CSR_validate_TeacherName_results_search_results_page();

	void CSR_validate_SchoolAddress_results_without_schoolName_search_results_page();

	void CSR_validate_SchoolAddress_results_without_schoolName_PostalCode_search_results_page();

	void CSR_validate_SchoolAddress_shows_correct_search_results_page();

	void CSR_validate_SchoolAddress_shows_correct_search_results_page_2();

	void CSR_selects_first_schoolName_under_search_results_page();

	void CSR_verify_New_Search_and_School_listing_hyperlinks_displayed_in_search_results_page();

	void CSR_verify_Back_to_School_listing_hyperlink_not_display_in_search_results_page();

	void CSR_clicks_on_Back_to_School_listing_hyperlink_in_search_results_page();

	String CSR_gets_the_value_of_search_results_page();

	void CSR_verify_the_results_value_displayed_correct_come_form_BackToSchool_in_search_results_page(
			String exp_val);

	void CSR_verify_Add_a_Card_text_in_dropDown_in_PaymentPage();

	String CSR_selects_first_schoolName_and_get_it_under_search_results_page();

	void CSR_verify_the_School_Name_displays_correctly_2ndPage_search_results_page(
			String exp_text);

	String CSR_selects_first_schoolAddress_and_get_it_under_search_results_page();

	void CSR_validate_SName_occurence_in_SchoolName_SearchResults_LocatePage();

	void placeItems_GlobalSearch_3_items(String itemName, String itemQty, String itemName2, String itemQty2,
			String itemName3, String itemQty3);
	
	void CSR_selects_1st_radio_btn_in_Account_Hold_Section_in_Payment_page();

	void CSR_verify_Account_Hold_Section_and_radio_btns_not_display_in_Payment_page();

	void CSR_enters_US_PostalCode_in_LocatePage();

	void CSR_verify_US_PostalCode_fld_not_accept_morethan_10_in_LocatePage();

	void CSR_TabOut_on_US_PostalCode_in_LocatePage();

	void CSR_verify_popup_is_displayed_PostalCode_in_LocatePage();

	void CSR_selects_state_in_LocatePage();

	void CSR_validate_the_US_State_list_in_ascending_order_Locate_Account_page();

	void CSR_clicks_on_US_State_dropdown_list_in_LocatePage();

	void CSR_verify_the_popup_is_displayed_PO_num_fld_Payment_page();

	void CSR_verify_the_popup_text_PO_num_fld_Payment_page();

	void CSR_verify_the_popup_is_displayed_Board_SchoolNum_fld_Payment_page();

	void CSR_verify_the_popup_text_Board_SchoolNum_fld_Payment_page();

	void CSR_enters_text_Board_SchoolNum_in_Payment_page();

	void CSR_selects_SchoolAdrs_and_enters_Name_and_clicks_on_Search_LocatePage();

	void CSR_clicks_on_CanceOrder_link_in_Payment_page();

	void CSR_selects_YES_btn_for_CancelOrder_in_Payment_page();

	void CSR_verify_Order_Source_page_is_displayed();

	void CSR_selects_NO_btn_for_CancelOrder_in_Payment_page();

	void CSR_verify_cancel_order_callout_not_display();

	void CSR_clicks_on_Locate_account_tab();

	void CSR_verify_item_nums_Qty_not_display_in_OrderEntryPage();

	void CSR_enters_the_Ac_Num2_and_clicks_on_Search();

	void CSR_clicks_on_1st_teacher_name_in_Search_Results();

	void CSR_verify_items_not_display_in_ReviewCart_page();

	void CSR_selects_orderType_as_MailOrder();

	void CSR_selects_orderType_as_FaxOrder();

	void CSR_delete_all_items_in_ReviewCart_page();

	void user_deletes_1st_two_items_and_enter_0_for_3rd_in_reviewCart();

	void CSR_verify_PostalCode_fld_not_accept_morethan_7_chars_in_LocatePage();

	void CSR_TabOut_on_Canada_PostalCode_in_LocatePage();

	void CSR_clicks_on_Canada_Province_dropdown_list_in_LocatePage();

	void CSR_validate_the_Canada_Province_list_in_ascending_order_Locate_Account_page();

	void CSR_verify_error_msg_for_PostalCode_fld_OrderEntryPage();

	void CSR_verify_Purchase_Order_Number_fld_accepts_entered_val_in_PaymentPage();

	void CSR_enters_invalid_Purchase_Order_Number_in_PaymentPage();

	void CSR_verify_Purchase_Order_Number_fld_rejects_entered_val_in_PaymentPage();

	void CSR_verify_Account_Number_fld_accepts_entered_val_in_PaymentPage();

	void CSR_verify_Account_Number_fld_rejects_entered_val_in_PaymentPage();

	void CSR_selects_Purchase_Order_radio_btn_in_PaymentPage();

	void CSR_verify_other_radio_btns_not_selected_in_PaymentPage();

	void CSR_verify_default_radio_btn_is_PUB_in_PaymentPage();

	void CSR_selects_Purchase_Order_textbox_in_PaymentPage();

	void CSR_clicks_outside_Purchase_Order_textbox_in_PaymentPage();

	void CSR_sees_Purchase_Order_Error_Message_in_PaymentPage();

	void CSR_selects_Account_Number_textbox_in_PaymentPage();

	void CSR_clicks_outside_Account_Number_textbox_in_PaymentPage();

	void CSR_sees_Account_Number_Error_Message_in_PaymentPage();

	void CSR_sees_Board_School_Number_Error_Message_in_PaymentPage();

	void CSR_clicks_outside_Board_School_Number_textbox_in_PaymentPage();

	void CSR_selects_Board_School_Number_textbox_in_PaymentPage();

	void CSR_verify_Board_School_Number_fld_accepts_entered_val_in_PaymentPage();

	void CSR_verify_Board_School_Number_fld_rejects_entered_val_in_PaymentPage();

	void CSR_clicks_on_US_State_dropdown_list_in_Payment_Page();

	void CSR_validate_the_US_State_list_in_ascending_order_Payment_page();

	void CSR_verify_the_placeholder_for_US_State_dropdown_list_in_Payment_Page();

	void CSR_enters_AC_Number_in_PaymentPage();

	void CSR_enters_Board_School_Number_in_PaymentPage();

	void validate_VerifyAccount_tab_is_highlighted();

	void validate_Verify_Account_page_Num_in_StepHeader_Bubble();

	void CSR_verify_Blue_step_script_icon_displayed_in_VerifyAccount_page();

	void CSR_clicks_on_Blue_step_script_icon_in_VerifyAccount_page();

	void CSR_verify_modal_window_is_displayed_in_VerifyAccount_page();

	void CSR_verify_close_btn_is_displayed_in_modal_window_VerifyAccount_page();

	void CSR_clicks_on_close_btn_modal_window_in_VerifyAccount_page();

	void CSR_verify_VerifyAccount_page_displayed();

	void CSR_verify_modal_window_for_1st_time_teacher_not_display_in_VerifyAccount_page();

	void CSR_clicks_on_close_btn_modal_window_1st_time_teacher_in_VerifyAccount_page();

	void CSR_verify_modal_window_and_text_for_1st_teacher_is_displayed_in_VerifyAccount_page();

	void CSR_verify_close_btn_is_displayed_in_modal_window_1st_teacher_VerifyAccount_page();

	void CSR_verify_order_history_hdr_text_and_displayed_in_VerifyAccount_page();

	void CSR_verify_order_number_is_displayed_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_order_placed_date_is_displayed_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_order_type_phone_order_is_displayed_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_order_type_mail_order_is_displayed_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_order_type_fax_order_is_displayed_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_order_type_Online_is_displayed_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_order_status_Held_by_Accounting_in_OrderHistory_VerifyAccount_page();

	void CSR_verify_1st_year_teaching_status_YES_in_Additional_info_in_VerifyAccount_page();

	void CSR_verify_1st_year_teaching_status_NO_in_Additional_info_in_VerifyAccount_page();

	void CSR_verify_ROLE_section_displayed_and_the_header_in_VerifyAccount_page();

	void CSR_verify_selected_roles_are_displayed_in_ROLE_section_in_VerifyAccount_page();

	void CSR_verify_Grades_and_Students_fields_are_displayed_in_ROLE_section_in_VerifyAccount_page();

	void CSR_verify_grades_are_displayed_in_a_row_in_ROLE_section_in_VerifyAccount_page();

	void CSR_verify_SCHOOL_section_displayed_and_the_header_in_VerifyAccount_page();

	void CSR_verify_School_details_displayed_in_each_row_SCHOOL_section_Canada_in_VerifyAccount_page();

	void CSR_verify_School_details_displayed_in_each_row_SCHOOL_section_US_in_VerifyAccount_page();

	void CSR_enters_the_Ac_Num_and_select_TeacherName_in_Search_Results();

	void CSR_verify_content_text_for_1st_time_teacher_in_modal_window_VerifyAccount_page();

	void placeItems_GlobalSearch_4_items(String itemName, String itemQty, String itemName2, String itemQty2,
			String itemName3, String itemQty3, String itemName4, String itemQty4);

	void CSR_enters_Flyer_Code_not_mapped_to_US();

	void CSR_sees_error_notification_above_the_Flyer_Code();

	void CSR_sees_error_message_Flyer_Code();

	void CSR_clicks_Sign_Out();

	void CSR_sees_pending_items_on_Order_Entry_page();

	void CSR_clicks_on_flyer_hyperlink_Review_Cart();

	void CSR_cannot_click_flyer_hyperlink_Review_Cart();

	void CSR_sees_new_tab_item_details_ReviewCart();

	void CSR_clicks_item1_see_full_details_ReviewCart();

	void CSR_clicks_item1_num_ReviewCart();

	void CSR_verify_error_popUp_msg_disappeared_in_OrderEntryPage();

	void CSR_perform_TabOut_on_Board_SchoolNum_fld_PaymentPage();

	void CSR_perform_TabOut_on_AccountNum_fld_PaymentPage();

	void CSR_perform_TabOut_on_PONum_fld_PaymentPage();

	void CSR_verify_the_popup_error_msg_for_Board_SchoolNum_fld_Payment_page();

	void CSR_mouse_hover_on_1st_item_title_ReviewCart_page();

	void CSR_verify_CallOut_msg_is_displayed_on_mouse_hover_ReviewCart_page();

	void CSR_verify_Item_title_is_displayed_in_CallOut_msg_ReviewCart_page();

	void CSR_verify_Item_base_price_is_displayed_in_CallOut_msg_ReviewCart_page();

	void CSR_verify_tax_is_displayed_for_item_in_CallOut_msg_ReviewCart_page();

	void CSR_verify_Item_Total_price_is_displayed_in_CallOut_msg_ReviewCart_page();

	void CSR_validation_of_item_basePrice_GST_PST_Total_vals_ReviewCart_page();

	void CSR_validation_of_item_basePrice_GST_QST_Total_vals_ReviewCart_page();

	void CSR_validation_of_item_basePrice_HST_Total_vals_ReviewCart_page();

	void CSR_validation_of_item_basePrice_GST_Total_vals_ReviewCart_page();

	void CSR_validation_of_itemPrice_Total_vals_and_noTax_GST_PST_ReviewCart_page();

	void CSR_validation_of_itemPrice_Total_vals_and_noTax_GST_QST_ReviewCart_page();

	void CSR_clicks_update_account_button();

	void CSR_sees_inactive_account_status();

	void verify_CSR_Verify_Account_Page_is_displayed();

	void CSR_returns_to_Review_cart_page_using_stepheader();

	void CSR_increases_quantity_of_first_item_Review_Cart();

	void CSR_decreases_quantity_of_first_item_Review_Cart();

	void Teacher_adds_one_item_grade_2_second_month();

	void Teacher_adds_one_item_teacher_rewards_classroom_reward();

	void User_selects_back_to_shop_link();

	void User_selects_shopping_cart_link();

    void verify_popUp_InvalidItem_notDisplay();

    void sfo_teacherAdd_studentName_itemNo();

    void sfo_page_AddButton();

    void sfo_page_Name_Item_add_error();

    void sfo_page_Name_ItemNo_error();

    void sfo_teacherAdd_1studentName_1itemNo();

    void doadditemNo_StudentName(String sName1,String sName2,String itemNo1,String itemNo2);

	void doadditemNo_StudentName_QTY(String sName1,String sName2,String itemNo1,String itemNo2);

    void doadd_1itemNo_1StudentName(String sName1,String itemNo1);

    void sfo_grid_Display();

    void getsfo_table_header_name();

    void validate_sfo_table_itemdetails_Added();

    void validate_sfo_table_updated();

    void validate_sfo_page_ADDbutton();

    void click_sfo_page_ADDbutton();

    //void get_sfo_itemadded_grid();

    void validate_sfo_page_ADDbutton_Enabled();

    void getsfo_applyCoupontxt();

    void clicklink_sfoapplyCoupon();

	void verifySFOmodalisDisplayed();

	void verifySFOmodaltitle();

	void verifySFOmodalSubtitle();

	void verifySFOmodalcloseIcon();

	void clicktoCloseSFOCouponModal();

	void add_TeachercataloguesItems_from_YTO(double itemprice,
                           String studentname, String itemQty);

	void add_TeachercataloguesItems_from_YTO_with_price_limit(double itemprice,
                    double itemprice_limit, String studentname, String itemQty);

	void CSR_signOut_from_Application();

	void CSR_Cancel_the_order_and_select_YES();

	void CSR_verify_Order_Cancellation_modal_window_displays_and_title();

	void CSR_verify_Close_btn_displays_in_Order_Cancellation_modal_window();

	void CSR_clicks_on_Close_btn_in_Order_Cancellation_modal_window();

	void CSR_validate_the_paragraph_text_in_Order_Cancellation_modal_window();

	void CSR_verify_RESET_btn_displayed_in_OrderEntry_page();

	void CSR_verify_RESET_btn_disabled_byDefault_in_OrderEntry_page();

	void CSR_verify_RESET_btn_enabled_in_OrderEntry_page();

	void CSR_clicks_on_RESET_btn_in_OrderEntry_page();

	void CSR_verify_confirmation_callout_displayed_in_OrderEntry_page();

	void CSR_verify_the_text_confirmation_callout_and_YES_NO_btns_displayed_in_OrderEntry_page();

	void CSR_clicks_on_YES_btn_in_RESET_Confirmation_popup_OrderEntry_page();

	void CSR_clicks_on_NO_btn_in_RESET_Confirmation_popup_OrderEntry_page();

	void CSR_verify_confirmation_callout_msg_close_automatically_in_OrderEntry_page();

	void CSR_verify_the_entered_Flyer_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();

	void CSR_verify_the_entered_ItemNum_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();

	void CSR_verify_the_entered_ItemQTY_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();

	void CSR_verify_the_entered_Flyer_data_is_not_reset_when_CSR_clicks_on_RESET_NO_btn_in_OrderEntry_page();

	void CSR_verify_the_entered_ItemQTY_data_is_not_reset_when_CSR_clicks_on_RESET_NO_btn_in_OrderEntry_page();

	void CSR_verify_the_entered_ItemNum_data_is_not_reset_when_CSR_clicks_on_RESET_NO_btn_in_OrderEntry_page();

	void CSR_verify_the_item_num_fld_accept_6_characters_length();

	void CSR_verify_the_item_num_fld_not_accept_morethan_6_characters_length();

	void CSR_verify_the_Invalid_Items_modal_window_displayed_in_OrderEntryPage();

	void CSR_verify_the_Items_are_listed_in_modal_window_in_OrderEntryPage();

	void verify_Rewards_and_Redemption_page_is_displayed();

	void CSR_selects_redeem_your_coupon_hyperlink();

    void validate_get_sfo_invliadItemNO_error();

	void verify_sfo_freepick_couponmodal_applybtn_saved();

    void verify_sfo_input_couponbox_isDisabled();

    void verify_sfo_input_couponmodal_studentname_isEnabled();

    void verify_sfo_freepick_calloutMsg();

    void validate_get_sfo_invalidStudentName_error();

	void teacher_adds_SFO_item_for_single_student();

	void teacher_adds_SFO_item_for_single_studentXML();

	void getbacktoSFOsection();

	void getlinkEditCart();

	void teacher_clicks_on_ReviewCart_btn_in_SFO();

	void verify_SFO_section_displayed_in_ReviewCart_page();

	void verify_student_name_displays_correctly_in_SFO_section_in_ReviewCart_page();

	void verify_single_item_grouped_by_Student_name_SFO_in_ReviewCart_page();

	void verify_multiple_items_grouped_by_Student_name_SFO_in_ReviewCart_page();

	double item1_price_in_SFO_section_table1_in_ReviewCart_page();

	double item2_price_in_SFO_section_table1_in_ReviewCart_page();

	void validation_of_single_SFO_item_added_for_one_student_totals_GST_PST();

	void validation_of_multiple_SFO_items_added_for_one_student_totals_GST_PST();

	void teacher_adds_multiple_SFO_items_for_single_student();

	void teacher_adds_single_SFO_item_for_multiple_student();

	void verify_student_names_displays_correctly_in_SFO_section_in_ReviewCart_page();

	double item1_price_in_SFO_section_table2_in_ReviewCart_page();

	double item2_price_in_SFO_section_table2_in_ReviewCart_page();

	void validation_of_single_SFO_items_added_for_multiple_students_totals_GST_QST();

	void validation_of_single_SFO_items_added_for_multiple_students_totals_GST_PST();

	void validation_of_single_SFO_items_added_for_multiple_students_totals_HST();

	void validation_of_single_SFO_items_added_for_multiple_students_totals_GST();

	void No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_GST_QST();

	void No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_GST();

	void No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_HST();

	void No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_GST_PST();

	void teacher_adds_multiple_YTO_items_to_the_cart();

	void teacher_adds_single_YTO_item_to_the_cart();

	void teacher_add_single_yto_itemXML();

	void verify_YTO_section_displayed_in_ReviewCart_page();

	double item1_price_in_YTO_section_in_ReviewCart_page();

	double item2_price_in_YTO_section_in_ReviewCart_page();

	void validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_PST();

	void validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_QST();

	void validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_HST();

	void validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST();

	void No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_QST();

	void No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_PST();

	void No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_HST();

	void No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST();

	void teacher_adds_TE_items_to_cart_by_Search();

	void teacher_clicks_on_mini_ReviewCart_btn();

	void verify_TE_section_displayed_in_ReviewCart_page();

	double item1_price_in_TE_section_in_ReviewCart_page();

	double item2_price_in_TE_section_in_ReviewCart_page();

	void validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_PST();

	void validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_QST();

	void validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_HST();

	void validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST();

	void No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_QST();

	void No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_PST();

	void No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST();

	void No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_HST();

	void teacher_verify_YOU_ARE_EARNING_REWARDS_ON_fld_displayed_ReviewCart_page();

	void validation_of_SFO_YTO_Totals_ReviewCart_page_GST_PST();

	void validation_of_SFO_YTO_Totals_ReviewCart_page_GST_QST();

	void validation_of_SFO_YTO_Totals_ReviewCart_page_GST();

	void validation_of_SFO_YTO_Totals_ReviewCart_page_HST();

	void validation_of_SFO_YTO_TE_Totals_ReviewCart_page_GST_PST();

	void validation_of_SFO_YTO_TE_Totals_ReviewCart_page_GST_QST();

	void validation_of_SFO_YTO_TE_Totals_ReviewCart_page_HST();

	void validation_of_SFO_YTO_TE_Totals_ReviewCart_page_GST();

	void teacher_clicks_on_Continue_checkout_in_ReviewCart_page();

    void verify_sfo_freepick_errorMsg(String coupontype);

    void  verify_teacherDesk_Classlist();

	void verify_teacherDesk_linkManage();

	void click_teacherDesk_Manage();

	void verify_teacherDesk_classListmodal();

	void verify_title_classListmodal();

	void validate_teacherDesk_manageclassListmodal();

	void teacher_apply_a_FreePick_item_for_single_student_in_SFO_section();

	void teacher_search_and_select_a_FreePick_item_from_the_list_SFO_section();

	void validation_of_single_SFO_FreePick_item_added_for_one_student_totals_GST_PST();

	void validation_of_multiple_SFO_FreePick_items_added_for_multiple_students_totals_GST_PST();

	void teacher_apply_a_FreePick_item_2_for_single_student_in_SFO_section();

	void teacher_adds_SFO_item_for_Free_Shipping();

	void teacher_adds_SFO_item_for_Paid_Shipping();

	void teacher_adds_YTO_item_for_Free_Shipping();
	
	void teacher_adds_YTO_item_for_Free_Shipping_WithItemNumber();

	void teacher_adds_YTO_item_for_Paid_Shipping();

	void teacher_adds_TE_item_for_Free_Shipping();

	void teacher_adds_TE_item_for_Paid_Shipping();

	void teacher_adds_multiple_YTO_items_to_the_cart_for_free_shipping();

	void teacher_adds_YTO_item_NotMinimum();

	void teacher_adds_YTO_item_for_Free_ManualShipping();

	void teacher_adds_YTO_item_for_Paid_ManualShipping();

	void teacher_adds_TeacherExclusive_item_for_Free_ManualShipping();

	void teacher_adds_multiple_YTO_TeacherExclusives_items_to_the_cart_for_manualshipping_coupon();

	void teacher_adds_multiple_YTO_items();

	void teacher_adds_multiple_YTO_items_to_cart();

	void teacher_adds_multiple_YTO_items_to_cart_for_BonusFlat_tier1();

	void teacher_adds_multiple_SFO_items_multipleflyers_for_multiple_students();

	WebElement CSR_table_StudentClubs_items();

	WebElement getreviewcartstudentname();

	WebElement getsfohometable();

	void navigate_from_reviewcartpage_confirmandsubmitpage();

	List<WebElement> CSR_table_StudentClubs_items_list();

	void teacher_add_multiple_teacherExclusive_items_to_cart();

	WebElement readitemNo_PDPpage();

	void navigate_from_reviewcartpage_rewardsandredemptionspage();

	void navigate_from_paymentpage_to_confirmsubmitpage();

	void navigate_from_confirmsubmitpage_to_confirmationpage();

	void teacher_adds_multiple_SFO_items_multipleflyers_for_single_student();

	void teacher_adds_single_SFO_item_for_single_student_another_student();

	void click_btn_continuecheckout_inpaymentpage();

	void navigate_from_reviewcartpage_to_paymentpage();

	void teacher_adds_SFO_item_for_single_student_free_shipping();

	void teacher_search_select_freePick_item_from_the_list_sfo_section();

	void teacher_applies_freepick_item_for_single_student_in_sfo_section();

	void teacher_adds_sfo_item_for_single_student();

	void navigate_from_rewardspage_confirmandsubmitpage();

	void teacher_adds_single_YTO_item();

	void teacher_adds_single_YTO_item_from_xml();

	void CSR_adds_YTO_items_to_the_cart();

	void CSR_adds_Teacher_Exclusive_items_to_the_cart();

	void no_error_message_is_displayed_SFO_page();

	void teacher_applies_student_only_coupon_SFO_page();

	void teacher_applies_teacher_only_coupon_SFO_page();

	double navigate_from_reviewcartpage_rewardsandredemptionspage_get_SFO_Total_val();
	
	void teacher_adds_multiple_sfo_items_multipleflyers_for_multiple_students_xml();

	double navigate_from_reviewcartpage_rewardsandredemptionspage_get_YTO_Total_val();

	void Teacher_adds_multiple_YTO_items_to_cart();

	void teacher_select_first_FreePick_item_from_the_list_SFO_section();

	void verify_SFO_section_Apply_Button_State_Disable();

	void verify_ADD_button_state_disable_SFO_section();

	void verify_Student_name_popup_displayed_SFO_section();

	void verify_Student_name_popup_not_displayed_SFO_section();

	void sfo_teacher_enters_studentName_itemNo();

	void verify_ADD_button_state_enable_SFO_section();

	void verifySOOTitle();

	void clickOnSOOFromHomePage();

	void clickOnYTOFromHomePage();

	void verifyYTOTitle();

	void clickOnSFOFromHomePage();

	void verifySFOTitle();
	
	void placeItems_GlobalSearch_StoreInfo(String itemName, String itemQty);
	
	void parent_placing_2items_2childs(String itemName, String itemQty, String itemName2, String itemQty2);
	
	void tcod_select_minus_sign_SOO_section_reviewCart();

	void tcod_SOO_section_not_displayed_reviewCart();

	void tcod_minus_sign_changed_to_plus_sign_SOO_section_reviewCart();

	void tcod_select_plus_sign_SOO_section_reviewCart();

	void tcod_SOO_section_displayed_reviewCart();

	void tcod_plus_sign_changed_to_minus_sign_SOO_section_reviewCart();

	void tcod_verify_itemNumber_reviewCart_SOO(int childNumber);

	void tcod_verify_itemTitle_reviewCart_SOO(int childNumber);

	void tcod_verify_itemFlyer_reviewCart_SOO(int childNumber);

	void tcod_verify_itemPrice_reviewCart_SOO(int childNumber);

	void tcod_verify_itemQuantity_reviewCart_SOO(int childNumber);

	void tcod_verify_subTotal_reviewCart_SOO(int childNumber);

	void tcod_verify_GST_tax_total_reviewCart_SOO(int childNumber);

	void tcod_verify_PST_tax_total_reviewCart_SOO(int childNumber);

	void tcod_verify_overall_total_GST_PST_reviewCart_SOO(int childNumber);

	void tcod_verify_placed_date_reviewCart_SOO(int childNumber);

	void tcod_verify_no_order_msg_reviewCart_SOO(int childNumber);

	void tcod_verify_HST_tax_total_reviewCart_SOO(int childNumber);

	void tcod_verify_overall_total_HST_reviewCart_SOO(int childNumber);

	void tcod_verify_overall_total_GST_reviewCart_SOO(int childNumber);

	void tcod_verify_QST_tax_total_reviewCart_SOO(int childNumber);

	void tcod_verify_overall_total_GST_QST_reviewCart_SOO(int childNumber);
	
	void two_parents_placing_2items_2childs(String itemName, String itemQty, String itemName2, String itemQty2);
	
	void verify_search_bar_displays_TCODHomepgae();

	void tcod_verify_cumulative_total_reviewCart_SOO();

	void CSR_verify_error_msg_diaplayed_for_Account_Number_fld_in_PaymentPage();

	void CSR_verify_error_msg_diaplayed_for_Board_School_Number_fld_in_PaymentPage();

	void teacher_select_second_FreePick_item_from_the_list_SFO_section();

	void parent_placing_2orders_2items_2childs(String itemName, String itemQty, String itemName2, String itemQty2);

	void clickSOOhyperlink();

	void verifySOOpagedisplayed();

	void verify_TCOD_Review_Cart_displays();

	void tcod_verify_no_order_msg_reviewCart_SOO();

	void verify_TCOD_SOO_section_displays();

	void verifySFOFREEPICKcouponexpiredMessage();

	void verify_error_msg_displayed_for_invalid_SFO_coupon_in_modal_window();

	void CSR_verify_SOO_notification_not_displayed_ReviewCart_page();

	void CSR_verify_SOO_notification_displayed_ReviewCart_page();

	void CSR_verify_SOO_orders_chkbox_not_selected_ReviewCart_page();

	void CSR_verify_SOO_orders_chkbox_is_selected_ReviewCart_page();

	void CSR_verify_SOO_items_list_not_displayed_ReviewCart_page();

	void CSR_verify_SOO_items_list_is_displayed_ReviewCart_page();

	void CSR_selects_SOO_Include_Orders_chkbox_ReviewCart_page();

	void CSR_unselect_SOO_Include_Orders_chkbox_ReviewCart_page();

	void verify_items_count_in_minicart();

	void teacher_verify_SFO_page_displayed();

	void teacher_verify_SFO_FreePick_item_info();

	void teacher_clicks_on_HOME_button();

	void teacher_adds_teacherresourceitems_in_ytosection();

	void teacher_adds_classroomtitleitems_in_ytosection();

	void update_YTO_item_Qty_ReviewCart_page(String updated_itemQty);

	void teacher_adds_YTO_item_With_ItemNumber();

	void validate_teitem_errormessage_insfopage();

	void teacher_adds_teacherresourceitems_in_sfosection();
	
	void teacher_navigates_to_paymentpage_from_reviewcartpage();

	void sfopage_delete_SFOcoupon();

	void sfopage_delete_all();

	void doremoveSFOYTOitems();

	void teacher_adds_single_TE_item_to_cart_by_Search();

	void CSR_unchecks_SOO_order_section_Review_Cart();
	
	void CSR_enters_the_Ac_Num2_and_select_in_Search_Results();

	void csr_unselect_soo_includeorders_chkbox_reviewcart_page();

	void parenet_delete_all_items_in_ReviewCart();

	void applySFOFreePickCoupon();

	void teacher_navigates_to_paymentpage_from_reviewcartpage_selects_newcard() throws AWTException;

	void teacher_navigates_to_paymentpage_from_reviewcartpage_selects_savedcard() throws AWTException;

	void teacher_navigates_to_paymentpage_from_reviewcartpage_selects_combination_cheque_card() throws AWTException;
}
