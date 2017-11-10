package com.dw.automation.pages;

import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface ITeachersHomePage {

	void launchPage();

	void waitForPageLoad();

	void selectOptionFromTeacherHomePage(String option);

	void verifyUserName(String username);

	void verifyPage();

	void searchForItem(String item);

	void navigateToProfilePage();

	void clickOnReadingClub();

	WebElement getBtnTeacherHomeCloseIcon();

	WebElement getLnkEnterOrder();

	WebElement getLnkShopBookResources();

	WebElement getLnkTeacherDesk();

	WebElement getLblWelcomeText();

	WebElement getLblMarketingMsgTitle();
	
	WebElement getTutorial_DontShowAgain_Link();
	
	WebElement getYesGotoClassRoomOrders_Button();
	
	void clickOnTeacherCatalgoues();
	
	void clickOnClassroomRewardCataloguesFlyer();
	
	void ReadTeacherDetailsFromMyAccountPage();
	
	void ReadTeacherDetailsFromTeacherDesk();
	
	void ReadTeacherProfileName_MyAccount();

    void myProfilePage();
	
	void SelectOptionFromTeacherHomePage();

	void user_clicks_on_mini_Reviewcart();

	void verify_hold_status_msg_T_displayed_TeacherDesk();

	void verify_hold_status_msg_P_displayed_TeacherDesk();

	void verify_alert_message_displayed_TeacherDesk();

	void user_do_the_empty_cart();
	
	 void handleBack2SchoolPopup(String local);
	
	void teacher_check_expired_creditcard();
	
	void teacher_navigates_to_homepage_from_myaccountpage();

	void ReadOrderHistory_FirstOrder_MyAccount();

	void clickOrderView_MyAccountPage();

	List<WebElement> sizelnkEnterOrder();
	
	// Story SCSCOD-3919
		void verifySearchResultPage();
		
		void valdiate0searchPg();
		
		WebElement getimgMagGlass();
		
		WebElement get2searchBar();
		
		void search_with_sec_searchBar(String val);
		
		String getsecondSearchResultPg();

		void selectOptionFromTeacherHomePage_Driver(String option);

		void selectviewteacherdesk();

		void teacherdesk_view_orderdetailspage();

		void check_for_no_viewlink_teacherdeskpage();

		void check_for_nosubmit_noship_teacherdeskpage();

		void check_for_submit_noship_teacherdeskpage();

		void check_for_submit_ship_teacherdeskpage();

		void verify_orderrefno_teacherdesk_orderstatus();

		void verify_homepage();

		void select_sendRemider_fromNextdueDatesection();

		List<WebElement> sizemainmenulnkEnterOrder();

		List<WebElement> sizemainmenulnkbooksresources();

		List<WebElement> sizemainmenulnkallflyers();

		List<WebElement> sizemainmenulnkteacherdesk();

		void verify_globalmainmenu();

		WebElement getmainmenulnkEnterOrder();

		WebElement getmainmenulnkbooksresources();

		WebElement getmainmenulnkallflyers();

		WebElement getsizemainmenulnkteacherdesk();

		void selectOptionFromTeacherHomePage1(String option);

		void verify_pdp_longAndShortDescription();

		void verify_ordernumber_orderamount_orderhistorypage(Configuration testData);

		void click_viewdetails_orderhistory_MyAccountPage(Configuration testData);

		void click_edit_myprofile_myaccountpage();

		void enter_emailaddress_myprofile_myaccountpage(Configuration testData);

		void click_save_myprofile_myaccountpage();

		void verify_editprofile_myprofile_myaccountpage(Configuration testData);

		WebElement getflyerallflyersgradeelf();

		WebElement getflyerallflyerssplofferssploffers();

		WebElement getflyerallflyersfrenchclubdelecture();

		WebElement getflyerallflyerssplofferssploffers2();

		void YES_to_delete_item_in_ReviewCart_page();

		void verify_emailcase_myprofile_myaccountpage(Configuration testData);

		void clicks_View_Submit_link_TeachersDesk();

		void get_teacher_information(int association);

		void clicks_edit_button_on_Send_Letter_to_Parents_section();

		void restore_default_msg_language();

		void select_different_language_on_Send_Letter_to_Parents_modal_dropdown();

		void edit_letter_in_Send_Letter_to_Parents_modal();

		void click_save_button_in_Send_Letter_to_Parents_modal();

		void verify_edited_letter_is_saved();

		void click_view_on_Send_Letter_to_Parents_section();

		void click_restore_deafult_in_Send_Letter_to_Parents_modal();

		void verify_deafult_message_is_displayed();

		void click_close_button_on_Send_Letter_to_Parents_modal();

		void verify_Send_Letter_to_Parents_modal_not_displayed();

		void doLogout();

		void user_do_the_empty_soo_cart();

		void verify_letter_displays_in_selected_language();

		void click_download_on_Send_Letter_to_Parents_modal();

		void click_print_on_Send_Letter_to_Parents_modal();

		void click_facebook_icon_on_Send_Letter_to_Parents_modal();

		void verify_facebook_page_is_displayed();

		//String get_teacher_account_from_properties(int idx);

		//int get_starting_idx_from_properties();

		void teacher_deletes_first_SOO_item_in_Cart_page();

		void click_edit_link_view_mode_Send_Letter_to_Parents_modal();

		int get_starting_idx_from_properties(String dir);

		String get_teacher_account_from_properties(int idx, String dir);

		void teacher_clicks_edit_link_parent_site();

		void teacher_checks_parent_site_option();

		void teacher_edit_parent_site_modal_not_displayed();

		void teacher_selected_option_displays_parent_site_opted_in();

		void teacher_unchecks_parent_site_option();

		void teacher_clicks_save_parent_site_modal();

		void teacher_does_not_see_anything_parent_site_opted_out();

		void teacher_clicks_next_parent_site_launch_modal();

		void teacher_my_account_page_is_displayed();

		void teacher_edit_parent_site_modal_is_displayed();

		void teacher_checkbox_not_selected_edit_parent_site_modal();

		void teacher_checkbox_selected_edit_parent_site_modal();

	    void modalforSetDueDateReminder();

		void newbrowserTabforpdf();

	    void reminderLetterclickEdit();

	    void updatereminderLetter();

	    void savebuttononletterDuedateReminder();

	    void updatereminderLettersaved();

	    void restoredefault_remindLetter();

	    void defultletterdisplay();

		void handle_teacher_parent_Popup();

		void parent_clicks_on_ReviewCart_if_cart_has_items_and_delete();


}
