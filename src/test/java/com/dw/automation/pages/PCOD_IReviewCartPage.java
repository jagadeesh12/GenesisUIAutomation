package com.dw.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface PCOD_IReviewCartPage {

	void verify_item1_totalprice_reviewcartpage();

	void verify_item1_ordertotal_reviewcartpage();

	void verify_item1_totalitems_reviewcartpage();

	void edit_item_qty1_clickoutside_in_reviewcartPage(String value);

	void click_paginationlinks_freepick_modalwindow();

	void result_paginationlinks_freepick_modalwindow(String actualresult);

	void verify_Teacher_catalogue_is_not_displayed_in_Modal_window_dropDown();

	void Verify_reassignedChild_items_reviewcart(WebElement element);

	void verify_childs_childdropdown_reviewcart(WebElement dropdown);

	void Verify_defaultChild_items_reviewcart(List<WebElement> elementsize, WebElement element);

	void navigate_from_shoppingcart_to_submitorderpage();

	void calculate_items_taxes_shoppingcart(List<WebElement> item1size, WebElement item1, WebElement qty1,
			List<WebElement> item2size, WebElement item2, WebElement qty2, List<WebElement> item3size, WebElement item3,
			WebElement qty3, List<WebElement> item4size, WebElement item4, WebElement qty4);

	void calculate_2items_taxes_shoppingcart(List<WebElement> item1size, WebElement item1, WebElement qty1,
			List<WebElement> item2size, WebElement item2, WebElement qty2);

	void calculate_4items_taxes_shoppingcart(List<WebElement> item1size, WebElement item1, WebElement qty1,
			List<WebElement> item2size, WebElement item2, WebElement qty2, List<WebElement> item3size, WebElement item3,
			WebElement qty3, List<WebElement> item4size, WebElement item4, WebElement qty4);
	
    void remove_FREEPICK_coupon();

    void verify_MakeSelection_Modal_FreePick();

    void verify_popup_removeFreeitem ();

	void Verify_defaultchildnames_FreePick_items_reviewcart();

	void ReassignChild2_FreePick_items_reviewcart();

	void Verify_reassigned_childnames_FreePick_items_reviewcart();
	
    void clickNOdeletecouponModal();

    void frepickItemnotremoved();

    void verify_freepickItemdeleted();

    void verify_freeItemRemoved();


	void ReassignChild1_FreePick_items_reviewcart();

	void verify_freepick_items_reviewcart();

	void verify_freepick_itemdetails_reviewcartpage();

	void verify_freepick_itemelements_reviewcartpage();

	void verify_FREEPICKRemoved_whenItemsDeleted();
	
	
	

    void reveiwpageUpdateqty(String cartValue);

    void reviewcartpage_Tabfromqty();

    void reviewcartpage_clickButton_continueChkout();

    void click_reduceitemqty();

    void getItemqtycount();

    void click_edit_FREEPICK();

    void veirfy_editFreePick_itemselected();

    void editFreePick_selectGrade();

    void editFreePick_selectItem();

    void verifyItem_editFreePick_shoppingCart();

    void deleteFreeitem_FreePick();

    void click_Cancel_FreePick_CurrentSelection();

    void editFreePick_Modal_Cancel_NotDisplayed();

    void PCOD_ReviewCart_Addchild_SectionClick();



}
