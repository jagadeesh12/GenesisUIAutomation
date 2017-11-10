package com.dw.automation.pages;

import org.openqa.selenium.WebElement;

public interface PCOD_IHomePage {
	

	void pcod_get_text_saved_contains(WebElement element);

	void verify_element_textlimit(WebElement element, String expected_value);

	void pcod_verify_searcheditem_pdppage(WebElement element);

	void pcod_verify_parenthomepage();

    void pcod_clickMyAcc_Profile();

    void pcod_myprofile_addchild();

    void pcod_myprofile_verifychildadded();

    void pcod_myprofile_verifychild1added();

     void pcod_Click_Cancel_AddChild();
    void pcod_Click_CloseIcon_AddChild();

    void pcod_verify_Profile();
    void pcod_myprofile_verifychild2added();

	void pcod_logout();

    void pcod_myAccount_deleteAllChild();

	void pcod_editChildName();

    void pcod_myprofile_updatechildInfo();

    void pcod_myprofile_verifychildaddedName();

	void verify_message_displayed_for_SOO_orders_teacherDesk();

	void pcod_profile_addchildClickPlus();

    void pcod_profile_addChild_linkEditClick();

    void verifyName_Email_MobileNumberisDisplayed();


	

}
