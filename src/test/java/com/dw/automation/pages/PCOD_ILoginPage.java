package com.dw.automation.pages;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface PCOD_ILoginPage {
	
	void pcod_connect_to_your_teacher();

	WebElement getTxtUsername();
	
	WebElement getTxtPassword();

	void verify_connecttoteacher_cacfield(Configuration testData);

	void enterCACtNumber(String string);

	void mousehover_whatsthis_connecttoteacher();

	void verify_tooltip_whatsthis_connecttoteacher();

	void verify_connectbtn_connecttoteacher_disabled();

	void verify_connectbtn_connecttoteacher_enabled();

	void click_connectbtn_connecttoteacher();

	void verify_tooltip_incorrectcac_connecttoteacher();

	void pcod_backbtn_connect_to_your_teacher();

	void pcod_closeicon_connect_to_your_teacher();
	
	void about_reading_level_close_icon();

	void pcod_link_findyourteacher_connect_to_your_teacher();

	void pcod_drpdwn_province_connect_to_your_teacher();

	void pcod_select_province_connect_to_your_teacher(Configuration testData);

	void pcod_drpdwn_city_connect_to_your_teacher();

	void pcod_select_city_connect_to_your_teacher(Configuration testData);

	void verify_searchbtn_connecttoteacher_disabled();

	void verify_searchbtn_connecttoteacher_enabled();

	void pcod_verify_connect_to_your_teacher_model_windowstep1();

	void pcod_verify_connect_to_your_teacher_model_window_notpresent();

	void pcod_enterpostalcode_connecttoteacher(String string);

	void verify_connecttoteacher_postalcode_autoformatted(Configuration testData);

	void pcod_enterpostalcode_tabout_connecttoteacher(String string);

	void pcod_verify_validationMsg_Invalidpostalcode_connect_to_your_teacher();

	void pcod_verify_postalcode_placeholder_connect_to_your_teacher(Configuration testData);

	void pcod_searchbtn_connect_to_your_teacher();

	void pcod_verify_validationMsg_postalcode_notassociatedtoschool_connect_to_your_teacher();

	void pcod_verify_connect_to_your_teacher_model_windowstep0();

	void pcod_newsearchbtn_connect_to_your_teacher();

	void verify_all_provinces_connectyourteacher();

	void verify_all_cities_connectyourteacher();

	void pcod_select_school_connect_to_your_teacher(Configuration testData);

	void pcod_nextbtn_connect_to_your_teacher();

	void pcod_drpdwn_selectteacher_connect_to_your_teacher();

	void pcod_link_cantfindyourteacher_connect_to_your_teacher();

	void pcod_verify_validationMsg_noteacher_selectedschool_connect_to_your_teacher();

	void pcod_verify_connect_to_your_teacher_model_windowstep2();

	void verify_schoolname_connectyourteacher(Configuration testData);

	void verify_schooldetails1_connectyourteacher(Configuration testData);

	void verify_Yesbtn_connecttoteacher_enabled();

	void click_Nobtn_connecttoteacher();

	void verify_yourteachername_textfield_connecttoteacher_present();

	void click_thisisnotmyteacherlink_connecttoteacher();

	void click_createanaccount_connecttoteacher();

	void verify_createanaccount_window_connecttoteacher();

	void pcod_enterfirstname_createaccount(String string);

	void verify_createaccount_firstname(Configuration testData);

	void verify_createaccount_firstname_size();

	void pcod_clickslastname_createaccount();

	void verify_createaccount_firstname_emptyfield();

	void pcod_verify_validationMsg_firstname_lastname_createaccount();

	void verify_createaccount_firstname_saved(Configuration testData);

	void pcod_verify_validationMsg_firstname_lastname_createaccount_notpresent();

	void verify_createaccount_firstname_NotHighlighted();

	void pcod_enteralldata_createaccount(String firstname, String lastname, String email, String password, String mobnumber);

	void verify_continuebtn_createaccount_disabled();

	void pcod_enterlastname_createaccount(String string);

	void verify_createaccount_lastname_size(Configuration testData);

	void verify_createaccount_lastname(Configuration testData);

	void verify_createaccount_lastname_emptyfield();

	void pcod_clicksemail_createaccount();

	void verify_createaccount_lastname_saved(Configuration testData);

	void verify_createaccount_lastname_NotHighlighted();

	void pcod_enteremail_createaccount(String string);

	void pcod_verify_validationMsg_email_createaccount();

	void verify_createaccount_email_empty_incorrect_highlighted();

	void pcod_clicksphonenumber_createaccount();

	void pcod_clickspassword_createaccount();

	void pcod_enterpassword_createaccount(String string);

	void verify_createaccount_password_showdefault(Configuration testData);

	void pcod_verify_validationMsg_password_createaccount();

	void verify_createaccount_password_empty_incorrect_highlighted();

	void pcod_verify_correct_password_createaccount();

	void click_hidelink_createanaccount();

	void click_showlink_createanaccount();

	void verify_createaccount_password_hidden();

	void verify_createaccount_password_shown();

	void pcod_enterphonenumber_createaccount(String string);

	void pcod_verify_validationMsg_phonenumber_createaccount();

	void verify_createaccount_phonenumber_empty_incorrect_highlighted();

	void verify_continuebtn_createaccount_enabled();

	void pcod_enteralldata_langunselect_createaccount(String firstname, String lastname, String email, String password, String mobnumber);

	void select_language_createanaccount();

	void select_terms_createanaccount();

	void click_continuebtn_createaccount();

	void verify_addchildwindow_connecttoteacher_present();

	void verify_parentcreatedacccount_connecttoteacher();

	void verify_createanaccount_window_connecttoteacher_notpresent();

	void pcod_enteralldata_except_termspolicy_createaccount(String firstname, String lastname, String email, String password, String mobnumber);

	void pcod_enteralldata_exceptphonenumber_createaccount(String string, String string2, String string3,
			String string4);

	void pcod_enterfirstname_addachild(String firstname);

	void verify_addachild_firstname_size(Configuration testData);

	void verify_addachild_lastname_size(Configuration testData);

	void verify_field_incorrect_highlighted(WebElement element);

	void pcod_enterlastname_addachild(String string);

	void pcod_tabout_presentfield(WebElement gettxtaddachildlastname);

	void pcod_tooltip_validationmessage(String errmsg);

	void pcod_entervalue_textfield(WebElement gettxtaddachildlastname, String string);

	void verify_value_entered_NotHighlighted(WebElement element,
			List<WebElement> element1, String value);

	//void verify_value_entered_issaved(WebElement element, Configuration testData, String value, String fieldname);

	void pcod_enteralldata_addachild(String string, String string2);

	void verify_button_disabled(List<WebElement> element);

	void pcod_get_options_contains(WebElement element, String[] exp_values);

	void pcod_enteralldata_except_grade_addachild(String string, String string2);

	void verify_button_enabled(List<WebElement> element);

	void pcod_enteralldata_except_birthdetails_addachild(String string, String string2);

	void pcod_enteralldata_partial_birthdetails_addachild(String string, String string2);

	void pcod_addachild_saved_successfully();

	void enterAccountNumber_Email(String email);

	void enterPassword(String password);

	void pcod_enteralldata_addachild_homepage(String string, String string2, String string3);

	void pcod_get_text_notcontains(WebElement element, String value);

	void pcod_get_text_contains(WebElement element, String value);

	void verify_teachername_connectyourteacher(WebElement element, Configuration testData);

	void verify_schooldetails_connectyourteacher(WebElement element, Configuration testData);

	void verify_value_entered_issaved(WebElement element, String value, String fieldname);

	void verify_element_is_enabled(List<WebElement> element);

	void pcod_getvalue_equals(WebElement element, String value, String fieldname);

	void pcod_gettext_equals(WebElement element, String value, String fieldname);

	void pcod_get_text_itemprice_contains(WebElement element, String value);

	void pcod_verify_validationMsg_invalidcredentials();

	void verify_username_incorrect_highlighted(WebElement element);

	void verify_password_incorrect_highlighted(WebElement element);

	void pcod_getplaceholder_equals(WebElement element, String value, String fieldname);

	void parent_delete_freepick_coupon_shoppingcart();

	void verify_text_size(WebElement element, String value, String expvalue);

	void verify_currentpage_URL(String url);

	void verify_requiredfield_missed_highlighted(WebElement element, String value);


    void pcod_enteralldata_createaccount_withCAC(String firstname, String lastname, String email, String password, String mobnumber,String CAC);

    void pcod_enteralldata_createaccount_withFAT(String firstname, String lastname,String zipcode);

    void clickFATLink_addyourChild(String zipcode);

	void TCOD_enter_data_login_info_window();

	void TCOD_enter_AcNumOrEmail_in_login_info_window();

	void TCOD_enter_Lname_in_login_info_window();

	void TCOD_enter_Fname_in_login_info_window();

	void parent_create_account_one_child();

	void parent_create_account_two_childs();

	void verify_field_size(WebElement element, String value, String expvalue);

	void clickFATLink_connectToTeacher(String zip);
	
	void FAT_connectToTeacher_LoginPage(String postalcode, String schoolName, String teacherName);

	void clickFATLink_connectToTeacher_specificTeacher(String zip, String teacherAccNum);

	void specific_parent_create_account_one_child(int val);

	void pcod_enteralldata_addachild_homepage_child_lastname_blank(String string, String string2, String string3);

	void pcod_verify_validationMsg_no_teacher_registered();

	
}
