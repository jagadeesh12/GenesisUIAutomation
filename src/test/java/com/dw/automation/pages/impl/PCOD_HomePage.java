package com.dw.automation.pages.impl;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.dw.automation.pages.PCOD_ILoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.pages.PCOD_IHomePage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

import bsh.org.objectweb.asm.Constants;
import org.testng.annotations.Test;

import static com.dw.automation.pages.base.PageFactory.getFactory;

public class PCOD_HomePage extends BaseTestPage<TestPage> implements PCOD_IHomePage {
    ProfilePage profilepage = new ProfilePage();

    @FindBy(locator = "dw.pcod.homepage.txt.itemnumber")
    private WebElement txtitemnumberhomepage;

    @FindBy(locator = "dw.pcod.homepage.txt.itemnumber")
    private List<WebElement> sizetxtitemnumberhomepage;

    @FindBy(locator = "dw.pcod.home.myacc")
    private List<WebElement> sizedrpdownMyaccount;


    @FindBy(locator = "dw.pcod.home.myacc")
    private WebElement homepage_Myacc;

    @FindBy(locator = "dw.pcod.home.myacc.logout")
    private WebElement homepage_Myacc_logout;

    @FindBy(locator = "dw.pcod.profile.addchild.cancel")
    private WebElement buttonCancel_addchild;

    @FindBy(locator = "dw.pcod.profile.addchild.icon2Cancel")
    private WebElement iconToClose_addchild;


    @FindBy(locator = "dw.pcod.profile.childAdded")
    private List<WebElement> pcodMyProfile_childname;


    @FindBy(locator = "dw.pcod.homepage.myacc.myprofile.addchild")
    private WebElement myprofileAddchild;


    @FindBy(locator = "dw.pcod.home.myacc.profilepage")
    private WebElement myprofilePage;

    @FindBy(locator = "dw.pcod.home.myacc.Profile")
    private WebElement selectProfile_Myacc;


    @FindBy(locator = "dw.pcod.homepage.btn.addtocart")
    private WebElement btnaddtocarthomepage;

    @FindBy(locator = "dw.pcod.homepage.btn.addtocart.disabled")
    private WebElement btnaddtocartdisabledhomepage;

    @FindBy(locator = "dw.pcod.homepage.drpdown.childinteacherclass")
    private WebElement drpdownchildinteacherclasshomepage;

    @FindBy(locator = "dw.pcod.homepage.lnk.addachild")
    private WebElement lnkaddachildhomepage;

    @FindBy(locator = "dw.pcod.homepage.addachild.btn.save.disabled")
    private WebElement btnsaveaddachildhomepagedisabled;

    @FindBy(locator = "dw.pcod.homepage.addachild.btn.save")
    private WebElement btnsaveaddachildhomepage;

    @FindBy(locator = "dw.pcod.homepage.addachild.btn.cancel.enabled")
    private WebElement btncanceladdachildhomepageenabled;

    @FindBy(locator = "dw.pcod.homepage.addachild.btn.cancel")
    private WebElement btncanceladdachildhomepage;

    @FindBy(locator = "dw.pcod.homepage.addachild.btn.submit.disabled")
    private List<WebElement> btnsubmitaddachildhomepagedisabled;

    @FindBy(locator = "dw.pcod.homepage.addachild.txt.connecttoateacher")
    private WebElement txtconnecttoateacheraddachildhomepage;

    @FindBy(locator = "dw.pcod.homepage.addachild.btn.submit")
    private WebElement btnsubmitaddachildhomepage;

    @FindBy(locator = "dw.pcod.homepage.myaccount.mychildren.section")
    private WebElement sectionmychildrenmyaccountpage;

    @FindBy(locator = "dw.pcod.homepage.addachild.connecttoateacher.section")
    private WebElement sectionconnecttoateacheraddachildwindow;

    @FindBy(locator = "dw.pcod.pdppage.btn.addtocart")
    private WebElement btnaddtocartpdppage;

    @FindBy(locator = "dw.pcod.homepage.lbl.selectedchild")
    private WebElement lblselectedchildparenthomepage;

    @FindBy(locator = "dw.pcod.searchresults.firsttime.title")
    private WebElement titleitem1searchresultspage;

    @FindBy(locator = "dw.pcod.teacherdesk.link")
    private WebElement teacherDeskLink;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.link")
    private WebElement teacherDesk_onlineNotes_Link;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.message.textbox")
    private WebElement teacherDesk_onlineNotes_edit_modal_message_txtbox;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.name.textbox")
    private WebElement teacherDesk_onlineNotes_edit_modal_name_txtbox;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.message.character.count")
    private WebElement teacherDesk_onlineNotes_edit_modal_message_character_count;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.save.button")
    private WebElement teacherDesk_onlineNotes_edit_modal_save_button;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.save.button")
    private List<WebElement> sizeteacherDesk_onlineNotes_edit_modal_save_button;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.cancel.button")
    private WebElement teacherDesk_onlineNotes_edit_modal_cancel_button;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.edit.modal.close.button")
    private WebElement teacherDesk_onlineNotes_edit_modal_close_button;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.salutation.section")
    private WebElement teacherDesk_onlineNotes_salutation_section;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.salutation.section.name")
    private WebElement teacherDesk_onlineNotes_salutation_sectionname;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.salutation.section.header")
    private WebElement teacherDesk_onlineNotes_salutation_sectionheader;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.content.section")
    private WebElement teacherDesk_onlineNotes_content_section;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.modal")
    private WebElement teacherDesk_onlineNotes_modal;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.modal.salutation.dropdown")
    private WebElement teacherDesk_onlineNotes_edit_modal_salutation_drpdown;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.salutation.section.notewithname")
    private WebElement OnlineNotesSalutationSectionNotewithName;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.modal.salutation.dropdown.lst")
    private WebElement teacherDesk_onlinenotes_modal_salutation_drpdown_lst;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.modal.salutation.dropdown.list")
    private WebElement teacherDesk_onlinenotes_modal_salutation_drpdown_list;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.modal.salutation.dropdown.list")
    private List<WebElement> sizeteacherDesk_onlinenotes_modal_salutation_drpdown_list;

    @FindBy(locator = "dw.pcod.teacherdesk.onlinenotes.modal.salutation.dropdown.lst")
    private List<WebElement> teacherDesk_onlineNotes_edit_modal_salutation_drpdown_lst;

    @FindBy(locator = "dw.pcod.language.toggle.link")
    private WebElement PCOD_language_toggle;

    @FindBy(locator = "dw.pcod.teacherdesk.calendar.alldatecell")
    private List<WebElement> alldatescellfromCalendar;

    @FindBy(locator = "dw.pcod.teacherdesk.duedate")
    private List<WebElement> PCOD_teacherDesk_dueDate;

    @FindBy(locator = "dw.pcod.teacherdesk.selectedduedate.lbl")
    private WebElement teacherDesk_selectedDueDate_lbl;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.link")
    private WebElement teacherDesk_setDueDate_EDIT_link;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.modal")
    private WebElement teacherDesk_setDueDate_EDIT_modal;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.modal.prevmonth.button")
    private WebElement teacherDesk_setDueDate_EDIT_prev_month_button;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.modal.currentmonth.lbl")
    private WebElement teacherDesk_setDueDate_EDIT_current_month_lbl;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.modal.currentyear.lbl")
    private WebElement teacherDesk_setDueDate_EDIT_current_year_lbl;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.modal.calendar.table")
    private List<WebElement> teacherDesk_setDueDate_EDIT_Calendar_Table;

    @FindBy(locator = "dw.pcod.teacherdesk.setedduedate.edit.modal.calendar.table.day.list")
    private List<WebElement> teacherDesk_setDueDate_EDIT_Calendar_Day_List;

    @FindBy(locator = "dw.pcod.teacherdesk.calendar.nextMonth.link")
    private WebElement teacherDeskCalendarNextmonth;

    @FindBy(locator = "dw.pcod.teacherdesk.sendreminder.link")
    private WebElement teacherDesk_sendReminder_link;

    @FindBy(locator = "dw.pcod.teacherdesk.sendreminder.edit.modal")
    private WebElement teacherDesk_sendReminder_EDIT_link;

    @FindBy(locator = "dw.pcod.profile.section")
    private List<WebElement> myAccount_profile_seciton;

    @FindBy(locator = "dw.pcod.profile.section.secondary.header")
    private WebElement myAccount_profile_secondary_header;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.information.lbl")
    private List<WebElement> myAccount_profile_firstChild_information;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.message.lbl")
    private List<WebElement> myAccount_profile_firstChild_message;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.lbl")
    private WebElement myAccount_profile_firstChild_lbl;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.plussign")
    private WebElement myAccount_profile_firstChild_plussign;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.name.lbl")
    private WebElement myAccount_profile_firstChild_name;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.grade.lbl")
    private WebElement myAccount_profile_firstChild_grade;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.teacher.lbl")
    private WebElement myAccount_profile_firstChild_teacher_lbl;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.teacher.name.lbl")
    private WebElement myAccount_profile_firstChild_teacher_name;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.teacher.schoolname.lbl")
    private WebElement myAccount_profile_firstChild_teacher_schoolname;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.teacher.schooladdress.lbl")
    private WebElement myAccount_profile_firstChild_teacher_schooladdress;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.edit.link")
    private WebElement myAccount_profile_firstChild_EDIT_lnk;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.remove.link")
    private WebElement myAccount_profile_firstChild_REMOVE_lnk;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.remove.modal")
    private WebElement myAccount_profile_firstChild_remove_modal;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.remove.message")
    private WebElement myAccount_profile_firstChild_remove_msg;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.remove.YES.button")
    private WebElement myAccount_profile_firstChild_remove_YES_button;

    @FindBy(locator = "dw.pcod.profile.section.firstchild.remove.NO.button")
    private WebElement myAccount_profile_firstChild_remove_NO_button;

    @FindBy(locator = "dw.pcod.homepage.icon.link")
    private WebElement pcod_homepage_icon_link;

    @FindBy(locator = "dw.pcod.homepage.child.dropdown.selectedchild")
    private List<WebElement> pcod_homepage_selectedchild_drpdwn;

    @FindBy(locator = "dw.pcod.homepage.child.dropdown.arrowforlist")
    private List<WebElement> homepage_childlist_arrowClick;


    @FindBy(locator = "dw.pcod.homepage.child.dropdown.notconnectedtoteacher.link")
    private WebElement pcod_homepage_childdrpdown_notconnectedtoteacher_link;

    @FindBy(locator = "dw.pcod.homepage.child.dropdown")
    private WebElement pcod_homepage_childdrpdown;

    @FindBy(locator = "dw.pcod.home.page.parenthomepage")
    private WebElement pcod_homepage;

    @FindBy(locator = "dw.pcod.homepage.child.dropdown.notconnectedtoteacher.childfirstname")
    private WebElement pcod_homepage_childdrpdown_notconnectedtoteacher_childFirstName;

    @FindBy(locator = "dw.pcod.homepage.child.dropdown.list")
    private List<WebElement> pcod_homepage_childdrpdown_list;

    @FindBy(locator = "dw.pcod.myprofile.childadded.list")
    private List<WebElement> pcod_myprofile_allchildname;

    @FindBy(locator = "dw.pcodMyProfile.nameofchild.text")
    private WebElement pcodMyProfile_nameofchild_text;

    @FindBy(locator = "dw.pcodMyProfile.editlink")
    private WebElement pcodMyProfile_linkEdit;


    @FindBy(locator = "dw.pcodmyProfile.clickplus")
    private WebElement pcodmyProfileclickplus;

    @FindBy(locator = "dw.pcodmyProfile.deletechildpopup.Yesbutton")
    private WebElement pcodmyProfiledeletechildpopup_Yesbutton_Click;


    @FindBy(locator = "dw.pcodmyProfileChildname.deletelink")
    private WebElement pcodmyProfileChildname_deletelink;
    ;


    @FindBy(locator = "dw.pcod.profile.mychildren.list")
    private WebElement pcod_profile_mychildren_list;


    public WebElement getProfileMyChildrenList() {
        return pcod_profile_mychildren_list;
    }

    public List<WebElement> getChildDropdownList() {
        return pcod_homepage_childdrpdown_list;
    }

    public List<WebElement> getpcodMyProfile_allChildNames() {
        return pcod_myprofile_allchildname;
    }

    public WebElement getpcodMyProfile_linkEdit() {
        return pcodMyProfile_linkEdit;
    }


    public WebElement getpcodMyProfile_nameofchild_text() {
        return pcodMyProfile_nameofchild_text;
    }

    public WebElement getpcodmyProfileclickplus() {
        return pcodmyProfileclickplus;
    }

    public WebElement getpcodmyProfiledeletechildpopup_Yesbutton_Click() {
        return pcodmyProfiledeletechildpopup_Yesbutton_Click;
    }


    public WebElement getpcodmyProfileChildname_deletelink() {
        return pcodmyProfileChildname_deletelink;
    }


    public WebElement getChildNotconnectedToTeacherChildFirstName() {
        return pcod_homepage_childdrpdown_notconnectedtoteacher_childFirstName;
    }

    public WebElement getPCODHomepage() {
        return pcod_homepage;
    }

    public WebElement getChildDropDown() {
        return pcod_homepage_childdrpdown;
    }

    public WebElement getChildNotconnectedToTeacherLinkHomepage() {
        return pcod_homepage_childdrpdown_notconnectedtoteacher_link;
    }

    public WebElement getFirstChildRemoveTooltipModal() {
        return myAccount_profile_firstChild_remove_modal;
    }

    public WebElement getFirstChildRemoveTooltipMessage() {
        return myAccount_profile_firstChild_remove_msg;
    }

    public WebElement getFirstChildRemoveTooltipYESbutton() {
        return myAccount_profile_firstChild_remove_YES_button;
    }

    public WebElement getFirstChildRemoveTooltipNObutton() {
        return myAccount_profile_firstChild_remove_NO_button;
    }

    public WebElement getHomePageIconLink() {
        return pcod_homepage_icon_link;
    }

    public List<WebElement> getSelectedChildHomepageDropdown() {
        return pcod_homepage_selectedchild_drpdwn;
    }

    public List<WebElement> gethomepage_childlist_arrowClick() {
        return homepage_childlist_arrowClick;
    }

    public void pcod_firstChild_Click_remove_link() {
        getFirstChildRemovelink().click();
    }

    public List<WebElement> getMyAccountProfileSection() {
        return myAccount_profile_seciton;
    }

    public WebElement getProfileSecondarySectionHeader() {
        return myAccount_profile_secondary_header;
    }

    public List<WebElement> getFirstChildInfoLabel() {
        return myAccount_profile_firstChild_information;
    }

    public List<WebElement> getChildMessage() {
        return myAccount_profile_firstChild_message;
    }

    public WebElement getFirstChildPlusSign() {
        return myAccount_profile_firstChild_plussign;
    }

    public WebElement getFirstChildLabel() {
        return myAccount_profile_firstChild_lbl;
    }

    public WebElement getFirstChildNamelbl() {
        return myAccount_profile_firstChild_name;
    }

    public WebElement getFirstChildGradelbl() {
        return myAccount_profile_firstChild_grade;
    }

    public WebElement getFirstChildTeacherLabel() {
        return myAccount_profile_firstChild_teacher_lbl;
    }

    public WebElement getFirstChildTeacherNamelbl() {
        return myAccount_profile_firstChild_teacher_name;
    }

    public WebElement getFirstChildTeacherSchoolNamelbl() {
        return myAccount_profile_firstChild_teacher_schoolname;
    }

    public WebElement getFirstChildTeacherSchoolAddresslbl() {
        return myAccount_profile_firstChild_teacher_schooladdress;
    }

    public WebElement getFirstChildEditlink() {
        return myAccount_profile_firstChild_EDIT_lnk;
    }

    public WebElement getFirstChildRemovelink() {
        return myAccount_profile_firstChild_REMOVE_lnk;
    }

    public List<WebElement> getDueDate() {
        return PCOD_teacherDesk_dueDate;
    }

    public WebElement getSelectedDueDate() {
        return teacherDesk_selectedDueDate_lbl;
    }

    public WebElement getDueDateEditLink() {
        return teacherDesk_setDueDate_EDIT_link;
    }

    public List<WebElement> getDueDateCalendar() {
        return teacherDesk_setDueDate_EDIT_Calendar_Table;
    }

    public WebElement getPreviousMonthButton() {
        return teacherDesk_setDueDate_EDIT_prev_month_button;
    }

    public WebElement getCalendarCurrentMonth() {
        return teacherDesk_setDueDate_EDIT_current_month_lbl;
    }

    public WebElement getCalendarCurrentYear() {
        return teacherDesk_setDueDate_EDIT_current_year_lbl;
    }

    public List<WebElement> getCalendar_CurrentMonth_Days_List() {
        return teacherDesk_setDueDate_EDIT_Calendar_Day_List;
    }

    public WebElement getTeacherDeskCalendarNextmonth() {
        return teacherDeskCalendarNextmonth;
    }

    public WebElement getSendReminderLink() {
        return teacherDesk_sendReminder_link;
    }

    public WebElement getSendReminderModal() {
        return teacherDesk_sendReminder_EDIT_link;
    }

    public WebElement getLanguageToggle() {
        return PCOD_language_toggle;
    }

    public List<WebElement> getalldatesfromCalendar() {
        return alldatescellfromCalendar;
    }


    public WebElement getTeacherDeskLink() {
        return teacherDeskLink;
    }

    public WebElement getOnlineNotesEditLink() {
        return teacherDesk_onlineNotes_Link;
    }

    public WebElement getOnlineNotesModalMessageField() {
        return teacherDesk_onlineNotes_edit_modal_message_txtbox;
    }

    public WebElement getOnlineNotesModalNameField() {
        return teacherDesk_onlineNotes_edit_modal_name_txtbox;
    }

    public WebElement getOnlineNotesModalMessageFieldCharacterCount() {
        return teacherDesk_onlineNotes_edit_modal_message_character_count;
    }

    public WebElement getOnlineNotesModalSAVEbutton() {
        return teacherDesk_onlineNotes_edit_modal_save_button;
    }

    public List<WebElement> sizeOnlineNotesModalSAVEbutton() {
        return sizeteacherDesk_onlineNotes_edit_modal_save_button;
    }

    public WebElement getOnlineNotesModalsalutationdropdown() {
        return teacherDesk_onlineNotes_edit_modal_salutation_drpdown;
    }

    public WebElement getOnlineNotesSalutationSectionNotewithName() {
        return OnlineNotesSalutationSectionNotewithName;
    }

    public WebElement getOnlineNotesSalutationSection() {
        return teacherDesk_onlineNotes_salutation_section;
    }

    public WebElement getOnlineNotesSalutationSectionname() {
        return teacherDesk_onlineNotes_salutation_sectionname;
    }

    public WebElement getteacherDesk_onlineNotes_salutation_sectionheader() {
        return teacherDesk_onlineNotes_salutation_sectionheader;
    }

    public WebElement getOnlineNotesContentSection() {
        return teacherDesk_onlineNotes_content_section;
    }

    public WebElement getOnlineNotesModalCANCELbutton() {
        return teacherDesk_onlineNotes_edit_modal_cancel_button;
    }

    public WebElement getOnlineNotesModalCLOSEbutton() {
        return teacherDesk_onlineNotes_edit_modal_close_button;
    }

    public WebElement getOnlineNotesModal() {
        return teacherDesk_onlineNotes_modal;
    }

    public List<WebElement> getOnlineNotesModalsalutationdropdown_List() {
        return teacherDesk_onlineNotes_edit_modal_salutation_drpdown_lst;
    }

    public WebElement getteacherDesk_onlinenotes_modal_salutation_drpdown_lst() {
        return teacherDesk_onlinenotes_modal_salutation_drpdown_lst;
    }

    public WebElement getteacherDesk_onlinenotes_modal_salutation_drpdown_list() {
        return teacherDesk_onlinenotes_modal_salutation_drpdown_list;
    }

    public List<WebElement> sizeteacherDesk_onlinenotes_modal_salutation_drpdown_list() {
        return sizeteacherDesk_onlinenotes_modal_salutation_drpdown_list;
    }

    public WebElement gettxtitemnumberhomepage() {
        return txtitemnumberhomepage;
    }

    public List<WebElement> sizetxtitemnumberhomepage() {
        return sizetxtitemnumberhomepage;
    }

    public List<WebElement> sizedrpdownMyaccount() {
        return sizedrpdownMyaccount;
    }

    public WebElement getHomepage_Myacc() {
        return homepage_Myacc;
    }

    public WebElement gethomepage_Myacc_logout() {
        return homepage_Myacc_logout;
    }

    public List<WebElement> getpcodMyProfile_childname() {
        return pcodMyProfile_childname;
    }

    public WebElement getbuttonCancel_addchild() {
        return buttonCancel_addchild;
    }

    public WebElement geticonToClose_addChild() {
        return iconToClose_addchild;
    }

    public WebElement getmyprofileAddchild() {
        return myprofileAddchild;
    }

    public WebElement getmyprofilePage() {
        return myprofilePage;
    }

    public WebElement getselectProfile_Myacc() {
        return selectProfile_Myacc;
    }

    public WebElement getbtnaddtocarthomepage() {
        return btnaddtocarthomepage;
    }

    public WebElement getbtnaddtocartdisabledhomepage() {
        return btnaddtocartdisabledhomepage;
    }

    public WebElement getdrpdownchildinteacherclasshomepage() {
        return drpdownchildinteacherclasshomepage;
    }

    public WebElement getlnkaddachildhomepage() {
        return lnkaddachildhomepage;
    }

    public WebElement getbtnsaveaddachildhomepagedisabled() {
        return btnsaveaddachildhomepagedisabled;
    }

    public WebElement getbtnsaveaddachildhomepage() {
        return btnsaveaddachildhomepage;
    }

    public WebElement getbtncanceladdachildhomepageenabled() {
        return btncanceladdachildhomepageenabled;
    }

    public WebElement getbtncanceladdachildhomepage() {
        return btncanceladdachildhomepage;
    }

    public WebElement gettxtconnecttoateacheraddachildhomepage() {
        return txtconnecttoateacheraddachildhomepage;
    }

    public List<WebElement> sizebtnsubmitaddachildhomepagedisabled() {
        return btnsubmitaddachildhomepagedisabled;
    }

    public WebElement getbtnsubmitaddachildhomepage() {
        return btnsubmitaddachildhomepage;
    }

    public WebElement getsectionmychildrenmyaccountpage() {
        return sectionmychildrenmyaccountpage;
    }

    public WebElement getsectionconnecttoateacheraddachildwindow() {
        return sectionconnecttoateacheraddachildwindow;
    }

    public WebElement getbtnaddtocartpdppage() {
        return btnaddtocartpdppage;
    }


    public WebElement getlblselectedchildparenthomepage() {
        return lblselectedchildparenthomepage;
    }

    public WebElement gettitleitem1searchresultspage() {
        return titleitem1searchresultspage;
    }


    @Override
    public void verify_element_textlimit(WebElement element, String expected_value) {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        String actual_value = element.getAttribute("value");
        int value = actual_value.length();
        String exp_value1 = expected_value;
        int exp_value = Integer.parseInt(exp_value1);
        if (value > exp_value) {
            Assert.fail("Able to enter more than" + exp_value + "characters in the field");
        }
    }

    @Override
    public void openPage() {
        PCOD_LoginPage pcodlogpage = new PCOD_LoginPage();
        if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equals("Android")) {
            PauseUtil.pause(10000);
            WebElement el = TestBaseProvider.getTestBase().getDriver()
                    .findElement(By.xpath("//button[@title='Close']"));
            PauseUtil.pause(15000);
            if (el.isDisplayed()) {
                el.click();
                WaitUtils.waitForEnabled(pcodlogpage.getTxtUsername());
            }
        }

    }

    @Override
    public void pcod_get_text_saved_contains(WebElement element) {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String exp_child_firstname = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_firstname").toString();
        String act_child_firstname = element.getText();
        System.out.println("values are :" + act_child_firstname);

        if (!act_child_firstname.contains(exp_child_firstname)) {
            Assert.fail("Application Issue." + exp_child_firstname + " is not present");
        }
    }


    @Override
    public void pcod_verify_searcheditem_pdppage(WebElement element) {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String exp_itemtitle = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.searchresultspage.item.title").toString();
        String act_itemtitle = element.getText();
        System.out.println("values are :" + act_itemtitle);

        if (!act_itemtitle.contains(exp_itemtitle)) {
            Assert.fail("Application Issue." + exp_itemtitle + " is not present");
        }
    }


    @Override
    public void pcod_verify_parenthomepage() {

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Assert.assertEquals(sizetxtitemnumberhomepage().size() > 0, true);
    }

    @Override
    public void pcod_clickMyAcc_Profile() {
        getHomepage_Myacc().click();
        if (sizedrpdownMyaccount().size() > 0) {
            //System.out.println("my acc if condition"+sizedrpdownMyaccount.size());
            getselectProfile_Myacc().click();
            //System.out.println("after click Profile");
        } else {
            Assert.fail("MyAccount not displayed.");
        }
    }

    @Override
    public void pcod_logout() {


        PauseUtil.pause(4000);
        if (sizedrpdownMyaccount().size() != 0) {
            getHomepage_Myacc().click();
            PauseUtil.pause(1500);
            gethomepage_Myacc_logout().click();
            PauseUtil.pause(2500);
        }
    }


    @Override
    public void pcod_myprofile_addchild() {
        getHomepage_Myacc().click();
        if (!getmyprofilePage().getText().equals("My Reading Club Account")) {
            Assert.fail("My Profile Page is not displayed");
        }
        getmyprofileAddchild().click();
    }

    @Override
    public void pcod_myprofile_verifychildadded() {
        List<WebElement> table1 = getpcodMyProfile_childname();

        int totalNo = table1.size();
        System.out.println(totalNo);
        /*for(WebElement t1:table1){
            System.out.println("values child name"+t1.getText());
            System.out.println("Value to Match"+table1.get(totalNo-1).getText());
        }*/
        String exp = table1.get(totalNo - 2).getText();
        if (!exp.contains(TestBaseProvider.getTestBase().getTestData().getString("child_firstname"))) {
            Assert.fail("Please check,Child name is not saved");
        }
    }


    @Override
    public void pcod_Click_Cancel_AddChild() {
        getbuttonCancel_addchild().click();
        System.out.println("<<<<<<<<<cancel button clicked>>>>>>>>>>");
    }

    @Override
    public void pcod_Click_CloseIcon_AddChild() {
        //getbuttonCancel_addchild().click();
        geticonToClose_addChild().click();
        System.out.println("<<<<<<<<<CLOSE ICON clicked>>>>>>>>>>");
    }


    @Override
    public void pcod_verify_Profile() {
        if (!getmyprofilePage().getText().equals("My Reading Club Account")) {
            Assert.fail("My Profile Page is not displayed");
        }
    }

    @Override
    public void pcod_myprofile_verifychild1added() {
        List<WebElement> table1 = getpcodMyProfile_childname();

        int totalNo = table1.size();
        System.out.println(totalNo);
        /*for(WebElement t1:table1){
            System.out.println("values child name"+t1.getText());
            System.out.println("Value to Match"+table1.get(totalNo-1).getText());
        }*/
        String exp = table1.get(totalNo - 3).getText();
        if (!exp.contains(TestBaseProvider.getTestBase().getTestData().getString("child_firstname"))) {
            Assert.fail("Please check,Child name is not saved");
        }
    }

    @Override
    public void pcod_myprofile_verifychild2added() {
        List<WebElement> table1 = getpcodMyProfile_childname();

        int totalNo = table1.size();
        System.out.println(totalNo);
        for (WebElement t1 : table1) {
            System.out.println("values child name" + t1.getText());
            System.out.println("Value to Match" + table1.get(totalNo - 2).getText());
        }
        String exp = table1.get(totalNo - 2).getText();
        if (!exp.contains(TestBaseProvider.getTestBase().getTestData().getString("firstname"))) {
            Assert.fail("Please check,Child name is not saved");
        }
    }

    @Override
    public void pcod_myprofile_updatechildInfo() {

        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_enteralldata_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("updatedchildfirstname"),
                TestBaseProvider.getTestBase().getTestData().getString("updatedchildlastname")
        );
        PauseUtil.pause(2500);

       /* PCOD_LoginPage pcoologinPage = new PCOD_LoginPage();
        SCHUtils.clickUsingJavaScript(pcoologinPage.getbuttonAddchildSave());*/

    }


    public void pcod_Click_Teacher_Desk_link() {
        SCHUtils.clickUsingJavaScript(getTeacherDeskLink());
    }

    public void pcod_Click_Online_Notes_edit_link() {
        getOnlineNotesEditLink().click();

    }

    public void pcod_enter_characters_in_online_notes_message_field() {
        getOnlineNotesModalMessageField().click();
        getOnlineNotesModalMessageField().clear();

        getOnlineNotesModalMessageField().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("onlinenotemsg"));

    }

    public void pcod_character_count_is_zero() {
        String exp_result = "0";
        String act_result = getOnlineNotesModalMessageFieldCharacterCount().getText();

        Assert.assertEquals(act_result, exp_result, "The character count is not zero");
    }

    public void pcod_no_more_characters_accepted_in_online_notes_message_field() {
        getOnlineNotesModalMessageField().click();
        getOnlineNotesModalMessageField().sendKeys();

        String exp_result = ConstantUtils.ONLINENOTESMSG_EXACT150;
        String act_result = getOnlineNotesModalMessageField().getAttribute("value");

        Assert.assertEquals(act_result, exp_result, "The Online Notes message textbox accepts more than 150 charcaters");
    }

    public void pcod_remove_default_online_notes() {
        getOnlineNotesModalMessageField().click();
        getOnlineNotesModalMessageField().clear();
    }

    public void pcod_Click_online_notes_SAVE_button() {

        try {
            SCHUtils.clickUsingJavaScript(getOnlineNotesModalSAVEbutton());
        } catch (Exception e) {
            e.printStackTrace();
            TestBaseProvider.getTestBase().getDriver().findElement
                    (By.xpath("//div[@class='registration-body thanks parent-teacher']//button[@value='Save']")).click();
        }

    }

    public void pcod_still_see_default_message() {
        String exp_result = ConstantUtils.ONLINENOTEMSG_DEFAULT;
        String act_result = getOnlineNotesModalMessageField().getAttribute("value");

        Assert.assertEquals(act_result, exp_result, "The default Online Notes message is not displayed");
    }

    public void pcod_enter_characters_in_Online_Notes_name_field() {

        getOnlineNotesModalNameField().click();
        getOnlineNotesModalNameField().clear();
        getOnlineNotesModalNameField().sendKeys(ConstantUtils.ONLINENOTE_NAME_MORETHAN30);
    }

    public void pcod_edit_salutation_name_Online_Notes() {

        if (getteacherDesk_onlinenotes_modal_salutation_drpdown_lst().getText().equals("Mr.")) {
            SCHUtils.selectOptionsByVisibleText(getteacherDesk_onlinenotes_modal_salutation_drpdown_list(), "Mrs.");
        } else {
            SCHUtils.selectOptionsByVisibleText(getteacherDesk_onlinenotes_modal_salutation_drpdown_list(), "Mr.");
        }
        PauseUtil.pause(2500);
        getOnlineNotesModalNameField().click();
        getOnlineNotesModalNameField().clear();
        getOnlineNotesModalNameField().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("onlinenotename"));
        String onlinenotename = getOnlineNotesModalNameField().getAttribute("value");
        TestBaseProvider.getTestBase().getContext().setProperty("onlinenote.name", onlinenotename);
        String onlinenotesal = getteacherDesk_onlinenotes_modal_salutation_drpdown_lst().getText();
        TestBaseProvider.getTestBase().getContext().setProperty("onlinenote.salutation", onlinenotesal);
        System.out.println("salutation after selecting:" + onlinenotesal);
    }

    public void pcod_edited_salutation_name_saved_Online_Notes() {
        String actual_onlinenote_salutation_name = getOnlineNotesSalutationSectionname().getText();

        String expected_onlinenote_salutation = TestBaseProvider.getTestBase().getContext().getProperty
                ("onlinenote.salutation").toString().trim();
        String expected_onlinenote_name = TestBaseProvider.getTestBase().getContext().getProperty
                ("onlinenote.name").toString().trim();
        String expected_onlinenote_salutation_name = expected_onlinenote_salutation + " " + expected_onlinenote_name;
        System.out.println("expected onlinenote salutaion and name is:" + expected_onlinenote_salutation_name);

        Assert.assertEquals(actual_onlinenote_salutation_name, expected_onlinenote_salutation_name,
                "The saved salutation and name are not the same");
    }

    public void pcod_salutation_section_is_displayed() {
        try {
            getteacherDesk_onlineNotes_salutation_sectionheader().isDisplayed();
            System.out.println("The salutation section is displayed");

            String exp_onlinenotesection_header = "Online Note to Parents";
            String exp_onlinenotesection_notewithname = "A Note from Mr. Obama";
            String act_onlinenotesection_header = getteacherDesk_onlineNotes_salutation_sectionheader().getText().trim().replaceAll("\nHelp", "");
            String act_onlinenotesection_notewithname = getOnlineNotesSalutationSectionNotewithName().getText();


            if (!act_onlinenotesection_header.contains(exp_onlinenotesection_header)) {
                Assert.fail("The salutation section header is incorrect");
            }
            /*Assert.assertEquals(act_onlinenotesection_header, exp_onlinenotesection_header,
                    "The salutation section header is incorrect");*/
            Assert.assertEquals(act_onlinenotesection_notewithname, exp_onlinenotesection_notewithname,
                    "The salutation section name with note is incorrect");

        } catch (Exception e) {
            Assert.fail("The salutation section is not displayed");
        }

    }

    public void pcod_edit_link_is_displayed() {
        try {
            getOnlineNotesEditLink().isDisplayed();
            System.out.println("The edit link is displayed");
        } catch (Exception e) {
            Assert.fail("The edit link is not displayed");
        }


    }

    public void pcod_edited_content_saved() {
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("onlinenotemsg");
        String act_result = getOnlineNotesContentSection().getText();

        Assert.assertEquals(act_result, exp_result, "The online notes content is not the same");
    }

    public void pcod_Online_Notes_modal_closes() {

        WebDriver driver = TestBaseProvider.getTestBase().getDriver();
        driver.navigate().refresh();
        PauseUtil.pause(8000);
        if (sizeOnlineNotesModalSAVEbutton().size() != 0) {
            Assert.fail("The online note modal is displayed");
        }

    }

    public void pcod_Click_Online_Notes_CANCEL_button() {
        getOnlineNotesModalCANCELbutton().click();
    }

    public void pcod_edited_content_not_saved() {
        String exp_result = ConstantUtils.ONLINENOTEMSG_DEFAULT;
        String act_result = getOnlineNotesContentSection().getText();

        Assert.assertEquals(act_result, exp_result, "The online notes content has been saved");
    }

    public void pcod_Click_Online_Notes_CLOSE_button() {
        getOnlineNotesModalCLOSEbutton().click();
    }

    public void pcod_Click_Online_Notes_salutation_dropdown() {
        getOnlineNotesModalsalutationdropdown().click();

    }

    public void pcod_verify_all_the_salutations_are_present_in_the_Online_Notes_salutation_dropdown() {

        //List<String> salutationArr = Arrays.asList("Select Title","Mrs.", "Miss", "Ms", "Mr.", "Sr.", "Br.", "Fr.", "Mme.", "Mlle.", "M.", "Other/Autre");
        String exp_salutations[] = {"Select Title", "Mrs.", "Miss", "Ms", "Mr.", "Sr.", "Br.", "Fr.", "Mme.", "Mlle.", "M.", "Other/Autre"};
        String act_salutations = getteacherDesk_onlinenotes_modal_salutation_drpdown_list().getText();
        //for(WebElement salutation:sizeteacherDesk_onlinenotes_modal_salutation_drpdown_list()){
        System.out.println("List of salutations are------>>>>>: " + act_salutations);
        for (int i = 0; i < exp_salutations.length; i++) {
            if (!act_salutations.contains(exp_salutations[i])) {
                Assert.fail("Salutation i.e." + exp_salutations[i] + " is not present in dropdown");
            }
            //}
        }


    }

    ///////////////////////////////////0cnoincoieiwnoicnoncoencoiewn
    public void pcod_due_date_is_blank() {
        //String exp_result = "";
        if (getDueDate().size() > 0) {
            Assert.fail("New Teacher Accnt should not have Due Date");
        }


    }

    public void pcod_Click_due_date_edit_link() {
        getDueDateEditLink().click();
    }

    public void pcod_due_date_calendar_displays() {
        SCHUtils.waitForElementToBeDisplayed(getDueDateCalendar().get(0), 2000);

        if ((getDueDateCalendar().size() > 0)) {
            System.out.println("The due date calendar is displayed");
        } else {
            Assert.fail("Calendar expected and is not displayed");
        }
    }

    public void pcod_calendar_current_month_is_default_month() {
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Calendar now = Calendar.getInstance();

        int current_year = now.get(Calendar.YEAR);
        int current_month = now.get(Calendar.MONTH);

        String act_month = getCalendarCurrentMonth().getText().trim().toLowerCase();
        String exp_month = months[current_month].toLowerCase();

        Assert.assertEquals(act_month, exp_month, "The current month is not the same as the system");
		
		/*String act_year = getCalendarCurrentYear().getText();
		String exp_year = Integer.toString(current_year);

		Assert.assertEquals(act_year, exp_year, "The current year is not the same as the system");*/
    }

    public void pcod_past_months_cannot_be_selected() {
        try {
            getPreviousMonthButton().click();
            Assert.fail("Can go to the previous month!");
        } catch (Exception e) {
            System.out.println("Cannot go to the previous month!");
        }
    }

    ///TO-DO
    public void pcod_past_dates_in_current_month_unselectable() {
        Calendar now = Calendar.getInstance();
        int current_day = now.get(Calendar.DAY_OF_MONTH);

        getCalendar_CurrentMonth_Days_List();

    }

    ///TO-DO
    public void pcod_future_dates_in_current_month_selectable() {
        Calendar now = Calendar.getInstance();
        int current_day = now.get(Calendar.DAY_OF_MONTH);

        getCalendar_CurrentMonth_Days_List();

    }

    ///TO-DO
    public void pcod_select_due_date() {
		/*Calendar now = Calendar.getInstance();
		int current_day = now.get(Calendar.DAY_OF_MONTH);
		
		getCalendar_CurrentMonth_Days_List();*/

        getTeacherDeskCalendarNextmonth().click();
        selectdatefromCalendar_Teacherdesk();


    }

    private void selectdatefromCalendar_Teacherdesk() {
        getalldatesfromCalendar();
        for (WebElement celldate : getalldatesfromCalendar()) {
            try {
                String getcellRead = celldate.getText();
                if (!(getcellRead.equals(null) | getcellRead.equals(""))) {
                    System.out.println("DATE$$$$$A" + celldate.getText());
                    celldate.click();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void pcod_selected_date_is_displayed() {
        String act_result = getSelectedDueDate().getText();

        if ((act_result.equals(null) | act_result.equals(""))) {
            Assert.fail("Due Date is not Set");
        }
    }

    ///TO-DO SS -Implementation pending
    public void pcod_selected_due_date_highlighted(String color) {
        String act_color = getSelectedDueDate().getText();
        String exp_color = color;

        //  Assert.assertEquals(act_color, exp_color, "The selected due date color is not " + color);
    }

    public void pcod_Click_send_reminder_link() {
        getSendReminderLink().click();
    }

    public void pcod_send_reminder_modal_is_displayed() {
        try {
            getSendReminderModal().isDisplayed();
            System.out.println("The send reminder is displayed!");
        } catch (Exception e) {
            Assert.fail("The send reminder modal is not displayed!");
        }
    }

    public void pcod_Click_French_toggle() {
        String pageTitle1 = "Homepage | Scholastic Reading Club Canada";
        if (TestBaseProvider.getTestBase().getDriver().getTitle().equals(pageTitle1)) {
            getLanguageToggle().click();
        }


    }

    public void pcod_selected_date_displays_in_French() {
        String exp_date_FRENCH = "";
        String act_date_FRENCH = getSelectedDueDate().getText();
		
		/*if(act_date_FRENCH == ""){
			pcod_Click_due_date_edit_link();
			pcod_select_due_date();
			act_date_FRENCH = getSelectedDueDate().getText();
		}
		
		Assert.assertEquals(act_date_FRENCH, exp_date_FRENCH, "The selected due date is not in French!");*/
    }

    //############################################# DWCAPCOD - 82 #######################################################
//	public void pcod_MyAccount_page_displayed() {
//		try{
//			getMyAccountPage().isDisplayed();
//			System.out.println("My Account Page is displayed");
//		}catch(Exception e){
//			Assert.fail("My Account Page is not displayed");
//		}
//		
//	}

    public void pcod_Profile_section_displayed() {

        if (getMyAccountProfileSection().size() > 0) {
            System.out.println("The Profile section in My Account is displayed");
        } else {
            Assert.fail("My Profile Section is not Displayed");
        }

    }

    public void pcod_secondary_section_header_displays() {

        String act_value = getProfileSecondarySectionHeader().getText().trim().toUpperCase();
        Assert.assertEquals(act_value, "MY CHILDREN");


    }

    public void pcod_no_message_displays_noChild() {
        PauseUtil.pause(1000);
        if (getChildMessage().size() > 1) {
            Assert.fail("Child Name should not be displayed for this Parent");
        }


    }

    public void pcod_Add_a_Child_hyperlink_displayed() {
        try {
            getmyprofileAddchild().isDisplayed();
            System.out.println("Add a Child link is displayed");
        } catch (Exception e) {
            Assert.fail("Add a Child link is not displayed");
        }

    }

    public void pcod_ChildFirstName_TeacherName_plusSign_displays_firstChild() {

        if (getFirstChildInfoLabel().size() < 2 || getFirstChildInfoLabel().size() > 2) {
            Assert.fail("Child Name is not displayed OR There are more than one Child to the parent account");
        }

        try {
            getFirstChildPlusSign().isDisplayed();
            System.out.println("'+' is displayed for first child");
        } catch (Exception e) {
            Assert.fail("'+' is not displayed for first child");
        }

    }

    public void pcod_Click_plus_sign_firstChild() {
        getFirstChildPlusSign().click();
    }

    public void pcod_firstChild_label_displays() {
        String exp_value = "your child:";
        String act_value = getFirstChildLabel().getText().toLowerCase().trim();

        Assert.assertEquals(act_value, exp_value, "The child's label is not displaying correct value");
    }

    public void pcod_firstChild_name_displays() {

        try {
            String act_value = getFirstChildNamelbl().getText().trim();

            if (act_value.equals(null) || act_value.equals("")) {
                Assert.fail("Child Name is not displayed");
            }

        } catch (Exception e) {
            Assert.fail("Child Name is not displayed");
            e.printStackTrace();

        }


    }

    public void pcod_firstChild_grade_displays() {
        String exp_value = TestBaseProvider.getTestBase().getTestData().getString("grade");
        String act_value = getFirstChildGradelbl().getText().trim().toLowerCase();
        System.out.println("ACT_VALUE" + act_value);
        Assert.assertEquals(act_value, exp_value, "The child's grade is not correct");
    }

    public void pcod_firstChild_teacher_label_displays() {

        try {
            String act_value = getFirstChildTeacherLabel().getText().toLowerCase();
            System.out.println("122222222222" + act_value);
            if (act_value.equals(null) || act_value.isEmpty()) {
                Assert.fail("Lable Your Child Teacher not displayed");
            } else {
                if (!act_value.equals("your child:")) {
                    Assert.fail("Label Your Child Missing");
                }
            }
        } catch (Exception e) {
            Assert.fail("Label Your Child Teacher not displayed");
            e.printStackTrace();
        }


    }

    public void pcod_firstChild_teacherName_displays() {

        try {
            String act_value = getFirstChildTeacherNamelbl().getText();
            System.out.println("111@@@@@@@" + act_value);

            if (act_value.equals(null) || act_value.isEmpty()) {
                Assert.fail("Child Name not displayed");
            }
        } catch (Exception e) {
            Assert.fail("Child Name not displayed");
            e.printStackTrace();
        }


    }

    public void pcod_firstChild_teacherSchoolName_displays() {

        try {
            String act_value = getFirstChildTeacherSchoolNamelbl().getText();

            if (act_value.equals(null) || act_value.isEmpty()) {
                Assert.fail("Teacher School Name is not displayed");
            }
        } catch (Exception e) {
            Assert.fail("Teacher School Name is not displayed");
            e.printStackTrace();
        }


    }

    public void pcod_firstChild_teacherSchoolAddress_displays() {

        try {
            String act_value = getFirstChildTeacherSchoolAddresslbl().getText();
            if (act_value.equals(null) || act_value.isEmpty()) {
                Assert.fail("Check School address");
            }
        } catch (Exception e) {
            Assert.fail("Check School address");
            e.printStackTrace();
        }


    }

    public void pcod_Edit_link_displays() {
        try {
            getFirstChildEditlink().isDisplayed();
            System.out.println("EDIT link is displayed for first child");
        } catch (Exception e) {
            Assert.fail("EDIT link is not displayed for first child");
        }
    }

    public void pcod_Remove_link_displays() {
        try {
            getFirstChildRemovelink().isDisplayed();
            System.out.println("REMOVE link is displayed for first child");
        } catch (Exception e) {
            Assert.fail("REMOVE link is not displayed for first child");
        }
    }

    public void pcod_ChildFirstName_plusSign_displays_firstChild() {

        try {
            getFirstChildPlusSign().isDisplayed();
            System.out.println("'+' is displayed for first child");
        } catch (Exception e) {
            Assert.fail("'+' is not displayed for first child");
        }
    }

    //############################################# DWCAPCOD - 65 #######################################################
    public void pcod_firstChild_remove_tooltip_appears() {
        try {
            getFirstChildRemoveTooltipModal().isDisplayed();
            System.out.println("Remove tootltip is displayed after remove link is clicked");
        } catch (Exception e) {
            Assert.fail("Remove tootltip is not displayed after remove link is clicked");
        }

    }

    public void pcod_verify_tooltip_message_and_buttons() {
        String act_tooltipMsg = getFirstChildRemoveTooltipMessage().getText().trim();
        String exp_tooltipMsg = "Are you sure you want to remove this child from your account?";

        Assert.assertEquals(act_tooltipMsg, exp_tooltipMsg, "The remove tooltip message is not correct");

        try {
            getFirstChildRemoveTooltipYESbutton().isDisplayed();
            System.out.println("The remove tooltip 'YES' button is displayed");
        } catch (Exception e) {
            Assert.fail("The remove tooltip 'YES' button is not displayed");
        }

        try {
            getFirstChildRemoveTooltipNObutton().isDisplayed();
            System.out.println("The remove tooltip 'NO' button is displayed");
        } catch (Exception e) {
            Assert.fail("The remove tooltip 'NO' button is not displayed");
        }
    }

    public void pcod_firstChild_Click_YES_button_remove_link() {
        getFirstChildRemoveTooltipYESbutton().click();
    }

    public void pcod_firstChild_Click_NO_button_remove_link() {
        getFirstChildRemoveTooltipNObutton().click();
    }

    public void pcod_firstChild_information_removed() {
        try {
            int val = getFirstChildInfoLabel().size();

            if (val > 1) {
                Assert.fail("The child's information is not removed");
            }

        } catch (Exception e) {
            System.out.println("The child's information is removed");
        }

    }

    public void pcod_Click_homepage_icon() {
        SCHUtils.clickUsingJavaScript(getHomePageIconLink());

        // pcod_verify_PCOD_homepae_displays();
    }

    public void pcod_verify_Child_not_exist_in_homepage_dropdown() {

        try {
            SCHUtils.waitForElementToBeDisplayed(gethomepage_childlist_arrowClick().get(0), 2000);
            gethomepage_childlist_arrowClick().get(0).click();
            boolean display = getSelectedChildHomepageDropdown().size() > 0;
            if (!display) {
                Assert.fail("Child name should not be displayed");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void pcod_verify_Child_exists_in_homepage_dropdown() {

        try {
            boolean display = getSelectedChildHomepageDropdown().size() > 0;
            if (display) {
                Assert.assertEquals(true, true, "Child Name Present");
            } else {
                String cname = getSelectedChildHomepageDropdown().get(0).getText().trim().toLowerCase();
                if (cname.isEmpty() || cname.equals(null)) {
                    Assert.fail("Student  name not retrieved from UI");
                }
            }
        } catch (Exception e) {
            Assert.fail("Child name should be displayed");
            e.printStackTrace();

        }
    }

    public boolean pcod_check_child_not_connected_to_teacher_homepage() {

        try {
            try {
                getChildDropDown().click();
            } catch (Exception e) {
                System.out.println("No child dropdown available on the homepage(Possibly child with no connected teacher is the only option(s))");
            }

            getChildNotconnectedToTeacherLinkHomepage().isDisplayed();
            System.out.println("A child not connected to teacher is available");
            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname_Homepage", String.valueOf
                    (getChildNotconnectedToTeacherChildFirstName().getText()));

            getChildNotconnectedToTeacherLinkHomepage().click();

        } catch (Exception e) {

            System.out.println("There are no children connected to a teacher. Creating one child not connected to teacher...");

            getlnkaddachildhomepage().click();

            return false;
        }

        return true;
    }

    public void pcod_select_child_not_connected_to_teacher_homepage() {
        try {
            getChildDropDown().click();
        } catch (Exception e) {
            System.out.println("No child dropdown available on the homepage(Possibly child with no connected teacher is the only option(s))");
        }

        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname_Homepage", String.valueOf
                (getChildNotconnectedToTeacherChildFirstName().getText()));

        getChildNotconnectedToTeacherLinkHomepage().click();
    }

    public void pcod_verify_PCOD_homepae_displays() {
        try {
            getPCODHomepage().isDisplayed();
            System.out.println("PCOD Homepage is displayed");
        } catch (Exception e) {
            Assert.fail("PCOD Homepage is not displayed");
            e.printStackTrace();
        }
    }


    public void pcod_childFirstName_TeacherName_display_in_dropdown_homepage() {
        String getChildFirstName = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_firstname_Homepage").toString();
        String getTeacherSalutation = TestBaseProvider.getTestBase().getTestData().getString("TeacherSalutation");
        String getTeacherLastname = TestBaseProvider.getTestBase().getTestData().getString("TeacherLastname");

        String exp_result = getChildFirstName + " in " + getTeacherSalutation + " " + getTeacherLastname + "'s Class";
        exp_result = exp_result.toLowerCase();

        String act_result = "";
         System.out.println(getChildDropdownList().size());
        for (WebElement element : getChildDropdownList()) {
            act_result = element.getAttribute("innerText").trim().toLowerCase();
           
            if (exp_result.equals(act_result)) {
                System.out.println("<<<<<<<<<<< GOT IT! The matching statement is found: " + act_result);
                return;
            } else {
                System.out.println("<<<<<<<<<<< NOT IT!: " + act_result);
            }
        }

        Assert.fail("No matching statement is found for: " + exp_result);
    }

    public void pcod_childFirstName_TeacherName_display_in_myChildrenSection_myAccount() {
        String getChildFirstName = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_firstname_Homepage").toString();
        String getTeacherSalutation = TestBaseProvider.getTestBase().getTestData().getString("TeacherSalutation").replaceAll("\\.", "");
        String getTeacherLastname = TestBaseProvider.getTestBase().getTestData().getString("TeacherLastname");

        String exp_result = getChildFirstName + " in " + getTeacherSalutation + " " + getTeacherLastname + "'s Class";
        exp_result = exp_result.toLowerCase();

        String act_result = "";
        List<WebElement> childrenList = getProfileMyChildrenList().findElements(By.xpath("//p[@class='name']"));

        for (WebElement element : childrenList) {
            act_result = element.getAttribute("innerText").trim().toLowerCase();

            if (exp_result.equals(act_result)) {
                System.out.println("<<<<<<<<<<< GOT IT! The matching statement is found in My Account: " + act_result);
                return;
            } else {
                System.out.println("<<<<<<<<<<< NOT IT!: " + act_result);
            }
        }

        Assert.fail("No matching statement is found for: " + exp_result);
    }

    public void pcod_click_Save_connectToTeacher(WebElement saveConnecttoTeacher) {
        saveConnecttoTeacher.click();
    }

    @Override
    public void pcod_myAccount_deleteAllChild() {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        int childnamepresent = getpcodMyProfile_allChildNames().size();

        for (int i = 0; i <= childnamepresent; i++) {
            String childName = getpcodMyProfile_nameofchild_text().getText();
            System.out.println("*************NAME OF THE CHILE ADDED*************" + childName);

            if (childName.equals("Add a Child")) {
                getmyprofileAddchild().click();
                PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
                loginPg.pcod_enteralldata_addachild(
                        TestBaseProvider.getTestBase().getTestData().getString("childfirstname"),
                        TestBaseProvider.getTestBase().getTestData().getString("childlastname")
                );
                PauseUtil.pause(2500);
                PCOD_LoginPage pcoologinPage = new PCOD_LoginPage();
                SCHUtils.clickUsingJavaScript(pcoologinPage.getbuttonAddchildSave());
                TestBaseProvider.getTestBase().getDriver().navigate().refresh();
                break;


            } else {
                getpcodmyProfileclickplus().click();
                getpcodmyProfileChildname_deletelink().click();
                getpcodmyProfiledeletechildpopup_Yesbutton_Click().click();
                TestBaseProvider.getTestBase().getDriver().navigate().refresh();
            }


        }


    }


    @Override
    public void pcod_editChildName() {
        getpcodMyProfile_linkEdit().click();
    }

    @Override
    public void pcod_myprofile_verifychildaddedName() {
        String oputName = getpcodMyProfile_nameofchild_text().getText();
        if (!(oputName.contains(TestBaseProvider.getTestBase().getTestData().getString(
                "updatedchildfirstname")))) {
            Assert.fail("Child Name is not as per updated name");
        }

    }

    @FindBy(locator = "dw.pcod.teacherdesk.SOO.message1")
    private WebElement tcod_teacherdesk_SOO_message1;

    @FindBy(locator = "dw.pcod.teacherdesk.SOO.message2withcount")
    private WebElement tcod_teacherdesk_SOO_message2withcount;

    @FindBy(locator = "dw.pcod.teacherdesk.SOO.order.count")
    private WebElement tcod_SOO_order_count;

    public WebElement getTeacherDeskSOOMessage1() {
        return tcod_teacherdesk_SOO_message1;
    }

    public WebElement getTeacherDeskSOOMessage2withCount() {
        return tcod_teacherdesk_SOO_message2withcount;
    }

    public WebElement getTeacherDeskSOOCount() {
        return tcod_SOO_order_count;
    }

    @Override
    public void verify_message_displayed_for_SOO_orders_teacherDesk() {
        String exp_count = TestBaseProvider.getTestBase().getTestData().getString("orderAmtSOO");
        String msg = ConstantUtils.TEACHERDESKSOOMESSAGE;

        String exp_msg = msg + " " + exp_count;

        String act_msg1 = getTeacherDeskSOOMessage1().getText().trim();
        String act_msg2withcount = getTeacherDeskSOOMessage2withCount().getAttribute("innerText");

        String act_msg = act_msg1 + " " + act_msg2withcount;

        Assert.assertEquals(act_msg, exp_msg, "The message displayed is incorrect.");
    }

    public void pcod_myAccount_deleteAllChildren() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        int childnamepresent = getpcodMyProfile_allChildNames().size();

        for (int i = 2; i < childnamepresent; i++) {
            String childName = getpcodMyProfile_nameofchild_text().getText();
            System.out.println("*************NAME OF THE CHILD TO BE REMOVED*************" + childName);

            getpcodmyProfileclickplus().click();
            getpcodmyProfileChildname_deletelink().click();
            getpcodmyProfiledeletechildpopup_Yesbutton_Click().click();

        }
    }


    @Override
	public void pcod_profile_addchildClickPlus(){
    	SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        getpcodmyProfileclickplus().click();

    }

    @Override
     public void pcod_profile_addChild_linkEditClick(){
    	SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        
         getpcodMyProfile_linkEdit().click();     }


    @Override
    public void verifyName_Email_MobileNumberisDisplayed() {
        //PCOD_HomePage pcod_homePage = new PCOD_HomePage();
        getProfilePage_Labels_underprofileSection(
                TestBaseProvider.getTestBase().getTestData().getString("Label1"),
                TestBaseProvider.getTestBase().getTestData().getString("Label2"),
                TestBaseProvider.getTestBase().getTestData().getString("Label3"));
        getProfilePage_values_underprofileSection(
                TestBaseProvider.getTestBase().getTestData().getString("ParentName"),
                TestBaseProvider.getTestBase().getTestData().getString("ParentEmail"),
                TestBaseProvider.getTestBase().getTestData().getString("ParentMobile"));
    }

    //############################################# DWCAPCOD - 67 #######################################################
    @FindBy(locator = "dw.pcod.profile.payment.billing.saved.credit.cards")
    private List<WebElement> pcod_profile_payment_savedcreditcards;

    @FindBy(locator = "dw.pcod.profile.payment.billing.remove.credit.card1")
    private WebElement pcod_profile_payment_removeCard1;

    @FindBy(locator = "dw.pcod.profile.payment.billing.remove.credit.card.yes.button")
    private WebElement pcod_profile_payment_removeCard_YES_button;

    @FindBy(locator = "dw.pcod.profile.payment.billing.saved.card1.information")
    private WebElement pcod_profile_payment_savedCard1_information;

    @FindBy(locator = "dw.pcod.profile.payment.billing.saved.card1.expiration.date")
    private WebElement pcod_profile_payment_savedCard1_expiration_date;

    @FindBy(locator = "dw.pcod.profile.payment.billing.remove.credit.card.no.button")
    private WebElement pcod_profile_payment_removeCard_NO_button;

    @FindBy(locator = "dw.pcod.profile.payment.billing.saved.card1.edit.link")
    private WebElement pcod_profile_payment_savedCard1_edit_link;

    @FindBy(locator = "dw.pcod.profile.payment.billing.edit.card.save.button")
    private WebElement pcod_profile_payment_editCard_SAVE_button;

    @FindBy(locator = "dw.pcod.profile.payment.billing.add.edit.card.error")
    private WebElement pcod_profile_payment_edit_add_card_error;

    @FindBy(locator = "dw.pcod.profile.payment.billing.remove.credit.card.msg")
    private WebElement pcod_profile_payment_removecard_message;

    @FindBy(locator = "dw.pcod.profile.payment.billing.add.more.than.three.card.tooltip.msg")
    private WebElement pcod_profile_payment_add_more_than_three_cards_message;

    @FindBy(locator = "dw.pcod.profile.payment.billing.edit.card.cancel.button")
    private WebElement pcod_profile_payment_edit_cancel_button;

    @FindBy(locator = "dw.pcod.profile.password.edit")
    private WebElement pcod_profile_password_editlink;

    @FindBy(locator = "dw.pcod.profile.editpassword.newpassword.inputfield")
    private WebElement pcod_profile_password_edit_newpasswordfield;

    @FindBy(locator = "dw.pcod.profile.editpassword.confirmnewpassword.inputfield")
    private WebElement pcod_profile_password_edit_confirmpasswordfield;

    @FindBy(locator = "dw.pcod.profile.editpassword.hide.link")
    private WebElement pcod_profile_password_edit_hidelink;

    @FindBy(locator = "dw.pcod.profile.editpassword.show.link")
    private WebElement pcod_profile_password_edit_showlink;

    @FindBy(locator = "dw.pcod.profile.editpassword.modal")
    private List <WebElement> getpcod_profile_editpassword_modal;

    @FindBy(locator = "dw.pcod.profile.passwordDispalye.hidden")
    private List <WebElement>  getpcod_password_hiddenText;


    @FindBy(locator = "dw.pcod.profile.editpassword.save.btn")
    private WebElement pcod_profile_password_edit_savebtn;

    @FindBy(locator = "dw.pcod.profile.editpassword.modal")
    private List<WebElement> pcod_profile_profile_editpassword_modal;

    @FindBy(locator = "dw.pcod.profile.Labels")
    private List<WebElement> elemetLabels;

    @FindBy(locator = "dw.pcod.profile.labelValues")
    private List<WebElement> elementlabelvalue;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal")
    private WebElement getEditProfileModal;

    @FindBy(locator = "dw.pcod.profile.elemetsPreferences")
    private List<WebElement> elementunderPreference;

    @FindBy(locator = "dw.pcod.profile.elemetsforCommuncation")
    private List<WebElement> elementforCommuncation;

    @FindBy(locator = "dw.pcod.profile.Header.communication")
    private List<WebElement> elemetnforHeaderCommunication;

    @FindBy(locator = "dw.pcod.profile.Header.PromoEmail")
    private List<WebElement> elemetnforHeaderPromoEmail;

    @FindBy(locator = "dw.pcod.profile.elementforPromoEmail")
    private List<WebElement> getelementforPromoEmail;

    @FindBy(locator = "dw.pcod.profile.elementPrivacy")
    private List<WebElement> getPrivacyElement;

    @FindBy(locator = "dw.pcod.profile.privacyOptiondisplay")
    private List<WebElement> getPrivacyoptionDisplay;


    public WebElement getEditProfileModal() {
        return getEditProfileModal;
    }

    public List<WebElement> pcod_profile_profile_editpassword_modal() {
        return pcod_profile_profile_editpassword_modal;
    }

    public WebElement getpcod_profile_password_editlink() {
        return pcod_profile_password_editlink;
    }

    public WebElement getpcod_profile_password_edit_newpasswordfield() {
        return pcod_profile_password_edit_newpasswordfield;
    }

    public WebElement getpcod_profile_password_edit_confirmpasswordfield() {
        return pcod_profile_password_edit_confirmpasswordfield;
    }

    public WebElement getpcod_profile_password_edit_hidelink() {
        return pcod_profile_password_edit_hidelink;
    }

    public WebElement getpcod_profile_password_edit_showlink() {
        return pcod_profile_password_edit_showlink;
    }

    public List <WebElement>  getpcod_profile_editpassword_modal() {
        return  getpcod_profile_editpassword_modal;
    }

    public List <WebElement>  getpcod_password_hiddenText() {
        return  getpcod_password_hiddenText;
    }

    public WebElement getpcod_profile_password_edit_savebtn() {
        return pcod_profile_password_edit_savebtn;
    }

    public WebElement getProfilePaymentEditCancelButton() {
        return pcod_profile_payment_edit_cancel_button;
    }

    public WebElement getProfilePaymentAddMoreThanThreeCardsMessage() {
        return pcod_profile_payment_add_more_than_three_cards_message;
    }

    public WebElement getProfilePaymentRemoveCardMessage() {
        return pcod_profile_payment_removecard_message;
    }

    public WebElement getProfilePaymentEditAddCardError() {
        return pcod_profile_payment_edit_add_card_error;
    }

    public WebElement getProfilePaymentEditCardSAVEButton() {
        return pcod_profile_payment_editCard_SAVE_button;
    }

    public WebElement getProfilePaymentSavedCard1EditLink() {
        return pcod_profile_payment_savedCard1_edit_link;
    }

    public WebElement getProfilePaymentRemoveCardNOButton() {
        return pcod_profile_payment_removeCard_NO_button;
    }

    public WebElement getProfilePaymentSavedCard1ExpDate() {
        return pcod_profile_payment_savedCard1_expiration_date;
    }

    public WebElement getProfilePaymentSavedCard1Information() {
        return pcod_profile_payment_savedCard1_information;
    }

    public WebElement getProfilePaymentRemoveCardYESButton() {
        return pcod_profile_payment_removeCard_YES_button;
    }

    public WebElement getProfilePaymentRemoveCard1() {
        return pcod_profile_payment_removeCard1;
    }

    public List<WebElement> getProfilePaymentSavedCreditCards() {
        return pcod_profile_payment_savedcreditcards;
    }

    public List<WebElement> getelemetLabels() {
        return elemetLabels;
    }

    public List<WebElement> getelementlabelvalue() {
        return elementlabelvalue;
    }

    public List<WebElement> getallelementunderPrefernces() {
        return elementunderPreference;
    }

    public List<WebElement> getelemetnforHeaderCommunication() {
        return elemetnforHeaderCommunication;
    }

    public List<WebElement> getelemetnforHeaderPromoEmail() {
        return elemetnforHeaderPromoEmail;
    }

    public List<WebElement> getelementforCommuncation() {
        return elementforCommuncation;
    }

    public List<WebElement> getelementforPromoEmail() {
        return getelementforPromoEmail;
    }

    public List<WebElement> getPrivacyElement() {
        return getPrivacyElement;
    }

    public List<WebElement>  getPrivacyoptionDisplay() {
        return  getPrivacyoptionDisplay;
    }



    public void pcod_check_remove_and_add_a_saved_card_on_account() {
        pcod_remove_saved_credit_cards_profile_page();

        PauseUtil.pause(2500);

        profilepage.addCreditCardProfilePage(TestBaseProvider.getTestBase().getTestData());

        System.out.println("A saved credit card is on this account");
    }

    public void pcod_click_remove_link_on_saved_credit_card() {
        PauseUtil.pause(2500);

        getProfilePaymentRemoveCard1().click();
    }

    public void pcod_verify_savedcard_information_profile_page() {
        String cardtype = TestBaseProvider.getTestBase().getTestData().getString("cardtype");
        String cardnumber = TestBaseProvider.getTestBase().getTestData().getString("cardnumber");

        String exp_msg = cardtype + " Ending In " + cardnumber.substring(cardnumber.length() - 4);
        String act_msg = getProfilePaymentSavedCard1Information().getAttribute("innerText").trim();

        Assert.assertEquals(act_msg, exp_msg, "The saved card's information is not correct.");
    }

    public void pcod_verify_savedcard_expiration_date_profile_page() {
        String expmonth = TestBaseProvider.getTestBase().getTestData().getString("expmonth");
        String expyear = TestBaseProvider.getTestBase().getTestData().getString("expyear");

        String exp_msg = "EXP: " + expmonth + "/" + expyear.substring(expyear.length() - 2);
        String act_msg = getProfilePaymentSavedCard1ExpDate().getText().trim();

        Assert.assertEquals(act_msg, exp_msg, "The saved card's expiration date is not correct.");
    }

    public void pcod_remove_saved_credit_cards_profile_page() {
        PauseUtil.pause(2500);

        int numSavedCards = getProfilePaymentSavedCreditCards().size();
        System.out.println("There are " + numSavedCards + " saved credit cards on this account");

        if (numSavedCards > 0) {
            System.out.println("Removing saved credit cards.....");
            for (int i = 0; i < numSavedCards; i++) {
                PauseUtil.pause(2500);
                getProfilePaymentRemoveCard1().click();

                PauseUtil.pause(2500);
                getProfilePaymentRemoveCardYESButton().click();
            }

        }

    }

    public void pcod_click_edit_link_on_saved_credit_card() {
        PauseUtil.pause(2500);

        getProfilePaymentSavedCard1EditLink().click();
    }

    public void pcod_click_save_edit_card_profile_page() {
        PauseUtil.pause(2500);

        //SCHUtils.clickUsingJavaScript(getProfilePaymentEditCardSAVEButton());
        getProfilePaymentEditCardSAVEButton().submit();
    }

    public void pcod_verify_error_message_isplays_payment_profile_page() {
        PauseUtil.pause(2500);

        try {
            getProfilePaymentEditAddCardError().isDisplayed();
            System.out.println("The error message is displayed");
        } catch (Exception e) {
            Assert.fail("The error message is not displayed");
        }
    }

    public void pcod_verify_removecard_tooltip_profile_page() {
        PauseUtil.pause(2500);

        String exp_msg = ConstantUtils.REMOVE_SAVEDCARD_MSG;
        String act_msg = getProfilePaymentRemoveCardMessage().getText();

        Assert.assertEquals(act_msg, exp_msg, "The message displayed on remove card tooltip is not correct");

        PauseUtil.pause(2500);
        try {
            getProfilePaymentRemoveCardYESButton().isDisplayed();
            getProfilePaymentRemoveCardNOButton().isDisplayed();
            System.out.println("The remove card tooltip's YES and NO buttons are displayed");
        } catch (Exception e) {
            Assert.fail("The remove card tooltip's YES and NO buttons are not displayed");
        }
    }

    public void pcod_add_max_saved_card_on_account() {
        PauseUtil.pause(2500);

        int numSavedCards = getProfilePaymentSavedCreditCards().size();
        System.out.println("There are " + numSavedCards + " saved credit cards on this account");

        if (numSavedCards < 3) {
            for (int i = numSavedCards; i < 3; i++) {
                PauseUtil.pause(2500);

                profilepage.addUniqueCreditCardProfilePage(TestBaseProvider.getTestBase().getTestData(), i);
            }
        }
    }

    public void pcod_verify_tooltip_meesgae_cannot_add_more_than_three_credit_card() {

        String act_msg = getProfilePaymentAddMoreThanThreeCardsMessage().getText().trim();
        String exp_msg = ConstantUtils.THREE_SAVEDCARD_LIMIT_MSG;

        Assert.assertEquals(act_msg, exp_msg, "The message for adding more than three cards is not correct");
    }

    public void pcod_verify_no_saved_credit_card_display_profile_page() {
        PauseUtil.pause(2500);

        int act_numSavedCards = getProfilePaymentSavedCreditCards().size();
        int exp_numSavedCards = 0;

        Assert.assertEquals(act_numSavedCards, exp_numSavedCards, "The number of saved credit card is incorrect");
    }

    public void exceptSOOdeleteAll() {
        TeachersHomePage teach_homepage = new TeachersHomePage();
        StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();

        String cart_val = teach_homepage.btn_mini_reviewCart().getText();
        System.out.println(cart_val + ">>><<<<<<<<");
        cart_val = cart_val.trim();
        int cart_val2 = Integer.parseInt(cart_val);
        System.out.println("################Cart Val is:" + cart_val2);

        if (cart_val2 != 0) {
            teach_homepage.btn_mini_reviewCart().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(3000);
            stud_page.doremoveSFOYTOitems();
        }
    }

    //############################################# DWCAPCOD - 51 #######################################################
    @FindBy(locator = "dw.pcod.profile.name.section.edit.link")
    private WebElement getProfilePageNameSectionEditLink;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.phone.number.textbox")
    private WebElement getProfilePageNameSectionEditModalPhoneNumberTxtbox;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.phone.number.error.message.tooltip")
    private WebElement getProfilePageNameSectionEditModalPhoneNumberErrMsgTooltip;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.phone.number.error.message.text")
    private WebElement getProfilePageNameSectionEditModalPhoneNumberErrMsgText;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.firstname.textbox")
    private WebElement getProfilePageNameSectionEditModalFirstNameTxtbox;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.lastname.textbox")
    private WebElement getProfilePageNameSectionEditModalLastNameTxtbox;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.email.textbox")
    private WebElement getProfilePageNameSectionEditModalEmailTxtbox;

    @FindBy(locator = "dw.pcod.profile.name.section.name.textbox")
    private WebElement getProfilePageNameSectionName;

    @FindBy(locator = "dw.pcod.profile.name.section.email.textbox")
    private WebElement getProfilePageNameSectionEmail;

    @FindBy(locator = "dw.pcod.profile.name.section.phone.textbox")
    private WebElement getProfilePageNameSectionPhone;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.save.button")
    private WebElement getProfilePageNameSectionEditModalSaveButton;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.email.error.message.tooltip")
    private WebElement getProfilePageNameSectionEditModalEmailErrMsgTooltip;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.email.error.message.text")
    private WebElement getProfilePageNameSectionEditModalEmailErrMsgText;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.firstname.error.message.text")
    private WebElement getProfilePageNameSectionEditModalFirstNameErrMsgText;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.lastname.error.message.text")
    private WebElement getProfilePageNameSectionEditModalLastNameErrMsgText;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.duplicate.email.error.message.text")
    private WebElement getProfilePageNameSectionEditModalDuplicateEmailErrMsgText;

    @FindBy(locator = "dw.pcod.home.myacc.SignOut")
    private WebElement getProfilePageSignOut;

    @FindBy(locator = "dw.pcod.profile.name.section.edit.modal.close.button")
    private WebElement getProfilePageNameSectionEditModalCloseButton;

    public WebElement getProfilePageNameSectionEditModalCloseButton() {
        return getProfilePageNameSectionEditModalCloseButton;
    }

    public WebElement getProfilePageSignOut() {
        return getProfilePageSignOut;
    }

    public WebElement getProfilePageNameSectionEditModalDuplicateEmailErrMsgText() {
        return getProfilePageNameSectionEditModalDuplicateEmailErrMsgText;
    }

    public WebElement getProfilePageNameSectionEditModalLastNameErrMsgText() {
        return getProfilePageNameSectionEditModalLastNameErrMsgText;
    }

    public WebElement getProfilePageNameSectionEditModalFirstNameErrMsgText() {
        return getProfilePageNameSectionEditModalFirstNameErrMsgText;
    }

    public WebElement getProfilePageNameSectionEditModalEmailErrMsgText() {
        return getProfilePageNameSectionEditModalEmailErrMsgText;
    }

    public WebElement getProfilePageNameSectionEditModalEmailErrMsgTooltip() {
        return getProfilePageNameSectionEditModalEmailErrMsgTooltip;
    }

    public WebElement getProfilePageNameSectionEditModalSaveButton() {
        return getProfilePageNameSectionEditModalSaveButton;
    }

    public WebElement getProfilePageNameSectionPhone() {
        return getProfilePageNameSectionPhone;
    }

    public WebElement getProfilePageNameSectionEmail() {
        return getProfilePageNameSectionEmail;
    }

    public WebElement getProfilePageNameSectionName() {
        return getProfilePageNameSectionName;
    }

    public WebElement getProfilePageNameSectionEditModalFirstNameTxtbox() {
        return getProfilePageNameSectionEditModalFirstNameTxtbox;
    }

    public WebElement getProfilePageNameSectionEditModalLastNameTxtbox() {
        return getProfilePageNameSectionEditModalLastNameTxtbox;
    }

    public WebElement getProfilePageNameSectionEditModalEmailTxtbox() {
        return getProfilePageNameSectionEditModalEmailTxtbox;
    }

    public WebElement getProfilePageNameSectionEditModalPhoneNumberErrMsgText() {
        return getProfilePageNameSectionEditModalPhoneNumberErrMsgText;
    }

    public WebElement getProfilePageNameSectionEditModalPhoneNumberErrMsgTooltip() {
        return getProfilePageNameSectionEditModalPhoneNumberErrMsgTooltip;
    }

    public WebElement getProfilePageNameSectionEditModalPhoneNumberTxtbox() {
        return getProfilePageNameSectionEditModalPhoneNumberTxtbox;
    }

    public WebElement getProfilePageNameSectionEditLink() {
        return getProfilePageNameSectionEditLink;
    }

    public void pcod_click_edit_link_name_section_Profile_page() {
        PauseUtil.pause(2500);

        getProfilePageNameSectionEditLink().click();
    }

    public void pcod_enter_phone_number_edit_profile_modal() {
        PauseUtil.pause(2500);

        String phone = TestBaseProvider.getTestBase().getTestData().getString("phonenumber");

        getProfilePageNameSectionEditModalPhoneNumberTxtbox().click();
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().clear();

        PauseUtil.pause(1000);
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().sendKeys(phone);
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().sendKeys(Keys.TAB);
    }

    public void pcod_verify_error_message_tooltip_invalid_phone_number_displays() {
        PauseUtil.pause(2500);

        try {
            getProfilePageNameSectionEditModalPhoneNumberErrMsgTooltip().isDisplayed();
            System.out.println("Invalid phone number error message tooltip is displayed");
        } catch (Exception e) {
            Assert.fail("Invalid phone number error message tooltip is not displayed");
        }
    }

    public void pcod_verify_error_message_text_invalid_phone_number() {
        PauseUtil.pause(2500);

        String act_msg = getProfilePageNameSectionEditModalPhoneNumberErrMsgText().getText().trim();
        String exp_msg = ConstantUtils.INVALID_PHONENUMBER_ERROR_MSG;

        Assert.assertEquals(act_msg, exp_msg, "The error message for invalid phone number is incorrect");
    }

    public void pcod_edit_profile_information_EMAIL_Profile_page() {
        PauseUtil.pause(2500);

        String email = TestBaseProvider.getTestBase().getTestData().getString("email");

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalEmailTxtbox().click();
        getProfilePageNameSectionEditModalEmailTxtbox().clear();
        getProfilePageNameSectionEditModalEmailTxtbox().sendKeys(email);
        getProfilePageNameSectionEditModalEmailTxtbox().sendKeys(Keys.TAB);

    }

    public void pcod_edit_profile_information_FIRSTNAME_Profile_page() {
        PauseUtil.pause(2500);

        String firstname = TestBaseProvider.getTestBase().getTestData().getString("firstname");

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalFirstNameTxtbox().click();
        getProfilePageNameSectionEditModalFirstNameTxtbox().clear();
        getProfilePageNameSectionEditModalFirstNameTxtbox().sendKeys(firstname);
        getProfilePageNameSectionEditModalFirstNameTxtbox().sendKeys(Keys.TAB);

    }

    public void pcod_edit_profile_information_LASTNAME_Profile_page() {
        PauseUtil.pause(2500);

        String lastname = TestBaseProvider.getTestBase().getTestData().getString("lastname");

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalLastNameTxtbox().click();
        getProfilePageNameSectionEditModalLastNameTxtbox().clear();
        getProfilePageNameSectionEditModalLastNameTxtbox().sendKeys(lastname);
        getProfilePageNameSectionEditModalLastNameTxtbox().sendKeys(Keys.TAB);

    }

    public void pcod_edit_profile_information_PHONENUMBER_Profile_page() {
        PauseUtil.pause(2500);

        String phone = TestBaseProvider.getTestBase().getTestData().getString("phonenumber");

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().click();
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().clear();
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().sendKeys(phone);
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().sendKeys(Keys.TAB);

    }

    public void pcod_verify_edit_information_not_saved_Profile_page() {
        PauseUtil.pause(2500);

        String firstname = TestBaseProvider.getTestBase().getTestData().getString("firstname");
        String lastname = TestBaseProvider.getTestBase().getTestData().getString("lastname");
        String email = TestBaseProvider.getTestBase().getTestData().getString("email");
        String phone = TestBaseProvider.getTestBase().getTestData().getString("phonenumber");

        if ((firstname != "") && (lastname != "")) {
            PauseUtil.pause(2500);

            String exp_name = firstname + " " + lastname;
            String act_name = getProfilePageNameSectionName().getText().trim();

            Assert.assertNotEquals(act_name, exp_name, "The displayed name was saved");
        }

        if (email != "") {
            PauseUtil.pause(2500);

            String act_email = getProfilePageNameSectionEmail().getText().trim();

            Assert.assertNotEquals(act_email, email, "The displayed email was saved");
        }

        if (phone != "") {
            PauseUtil.pause(2500);

            String act_phone = getProfilePageNameSectionPhone().getText().trim().replaceAll("-", "");

            Assert.assertNotEquals(act_phone, phone, "The displayed phone number was saved");
        }

    }

    public void pcod_verify_edit_information_are_saved_Profile_page() {
        PauseUtil.pause(2500);

        String firstname = TestBaseProvider.getTestBase().getTestData().getString("firstname");
        String lastname = TestBaseProvider.getTestBase().getTestData().getString("lastname");
        String email = TestBaseProvider.getTestBase().getTestData().getString("email");
        String phone = TestBaseProvider.getTestBase().getTestData().getString("phonenumber");

        if ((firstname != "") && (lastname != "")) {
            PauseUtil.pause(2500);

            String exp_name = firstname + " " + lastname;
            String act_name = getProfilePageNameSectionName().getText().trim();

            Assert.assertEquals(act_name, exp_name, "The displayed name was not saved");
        }

        if (email != "") {
            PauseUtil.pause(2500);

            String act_email = getProfilePageNameSectionEmail().getText().trim();

            Assert.assertEquals(act_email, email, "The displayed email was not saved");
        }

        if (phone != "") {
            PauseUtil.pause(2500);

            String act_phone = getProfilePageNameSectionPhone().getText().trim().replaceAll("-", "");

            Assert.assertEquals(act_phone, phone, "The displayed phone number was not saved");
        }

    }

    public void pcod_click_save_edit_modal_Profile_page() {
        PauseUtil.pause(2500);

        getProfilePageNameSectionEditModalSaveButton().click();
    }

    public void pcod_verify_character_limits_for_textfield(String field) {
        PauseUtil.pause(2500);

        String firstname = TestBaseProvider.getTestBase().getTestData().getString("firstname");
        String lastname = TestBaseProvider.getTestBase().getTestData().getString("lastname");
        String email = TestBaseProvider.getTestBase().getTestData().getString("email");
        String phone = TestBaseProvider.getTestBase().getTestData().getString("phonenumber");

        if (field == "Name") {
            PauseUtil.pause(2500);

            String act_firstname = getProfilePageNameSectionEditModalFirstNameTxtbox().getAttribute("value");
            String act_lastname = getProfilePageNameSectionEditModalLastNameTxtbox().getAttribute("value");

            Assert.assertNotEquals(act_firstname, firstname, "The displayed first name is the same");
            Assert.assertNotEquals(act_lastname, lastname, "The displayed last name is the same");
        }

        if (field == "Email") {
            PauseUtil.pause(2500);

            String act_email = getProfilePageNameSectionEditModalEmailTxtbox().getAttribute("value");

            Assert.assertNotEquals(act_email, email, "The displayed email is the same");
        }

        if (field == "Phone Number") {
            PauseUtil.pause(2500);

            String act_phone = getProfilePageNameSectionEditModalPhoneNumberTxtbox().getAttribute("value");

            Assert.assertNotEquals(act_phone, phone, "The displayed phone number is the same");
        }
    }

    public void pcod_verify_error_message_tooltip_invalid_email_displays() {
        PauseUtil.pause(2500);

        try {
            getProfilePageNameSectionEditModalEmailErrMsgTooltip().isDisplayed();
            System.out.println("Invalid email error message tooltip is displayed");
        } catch (Exception e) {
            Assert.fail("Invalid email error message tooltip is not displayed");
        }
    }

    public void pcod_verify_error_message_text_invalid_email() {
        PauseUtil.pause(2500);

        String act_msg = getProfilePageNameSectionEditModalEmailErrMsgText().getText().trim();
        String exp_msg = ConstantUtils.INVALIDEMAILIDMESSAGE;

        Assert.assertEquals(act_msg, exp_msg, "The error message for invalid email is incorrect");
    }

    public void pcod_verify_and_set_phone_number_empty() {
        PauseUtil.pause(2500);

        String act_phone = getProfilePageNameSectionEditModalPhoneNumberTxtbox().getAttribute("value");

        if (act_phone != "") {
            System.out.println("Phone number is not empty. Clearing phone number...");
            getProfilePageNameSectionEditModalPhoneNumberTxtbox().clear();
            getProfilePageNameSectionEditModalLastNameTxtbox().sendKeys(Keys.TAB);
        } else {
            System.out.println("Phone number is empty.");
        }

    }

    public void pcod_verify_save_button_enabled_edit_profile_modal() {
        PauseUtil.pause(2500);

        boolean isButtonEnabled = getProfilePageNameSectionEditModalSaveButton().isEnabled();

        Assert.assertTrue(isButtonEnabled, "The save button is disabled.");
    }

    public void pcod_enter_info_in_specific_field_edit_profile_modal(String field) {
        PauseUtil.pause(2500);

        if (field.equalsIgnoreCase("First Name")) {

            pcod_edit_profile_information_FIRSTNAME_Profile_page();

        } else if (field.equalsIgnoreCase("Last Name")) {

            pcod_edit_profile_information_LASTNAME_Profile_page();

        } else if (field.equalsIgnoreCase("Email")) {

            pcod_edit_profile_information_EMAIL_Profile_page();

        } else if (field.equalsIgnoreCase("Phone")) {

            pcod_edit_profile_information_PHONENUMBER_Profile_page();

        }
    }


    public void pcod_verify_specific_error_msg_edit_profile_modal(String field) {
        PauseUtil.pause(2500);

        if (field == "First Name") {
            PauseUtil.pause(2500);
            String act_text = getProfilePageNameSectionEditModalFirstNameErrMsgText().getText().trim();
            String exp_text = ConstantUtils.INVALID_FIRSTNAME_ERROR_MSG;

            Assert.assertEquals(act_text, exp_text, "The first name error message is incorrect");

        } else if (field == "Last Name") {
            PauseUtil.pause(2500);

            String act_text = getProfilePageNameSectionEditModalLastNameErrMsgText().getText().trim();
            String exp_text = ConstantUtils.INVALID_LASTNAME_ERROR_MSG;

            Assert.assertEquals(act_text, exp_text, "The last name error message is incorrect");

        } else if (field == "Email") {
            PauseUtil.pause(2500);

        } else if (field == "Phone") {
            PauseUtil.pause(2500);

        }
    }

    public void pcod_verify_duplicate_email_error_msg_Profile_page() {
        PauseUtil.pause(2500);

        String act_text = getProfilePageNameSectionEditModalDuplicateEmailErrMsgText().getText().trim();
        String exp_text = ConstantUtils.DUPLICATEMAILERRMSG_MYPROFILE;

        Assert.assertEquals(act_text, exp_text, "The duplicate email error message is incorrect");
    }

    public void pcod_edit_password_Profile_page() {
        PauseUtil.pause(2500);
        getpcod_profile_password_editlink().click();

        PauseUtil.pause(2500);
        getpcod_profile_password_edit_newpasswordfield().sendKeys(
                TestBaseProvider.getTestBase().getTestData().getString("password2"));
        PauseUtil.pause(1500);
        getpcod_profile_password_edit_confirmpasswordfield().sendKeys(
                TestBaseProvider.getTestBase().getTestData().getString("password2"));
        getpcod_profile_password_edit_confirmpasswordfield().sendKeys(Keys.TAB);

    }

    public void pcod_click_save_edit_password_modal_Profile_page() {
        PauseUtil.pause(2500);
        getpcod_profile_password_edit_savebtn().click();
    }

    public void pcod_clickMyAcc_SignOut() {
        getHomepage_Myacc().click();
        if (sizedrpdownMyaccount().size() > 0) {
            //System.out.println("my acc if condition"+sizedrpdownMyaccount.size());
            getProfilePageSignOut().click();
            //System.out.println("after click Profile");
        } else {
            Assert.fail("MyAccount not displayed.");
        }
    }

    public void pcod_verify_save_button_disabled_edit_profile_modal() {
        PauseUtil.pause(2500);

        boolean isButtonEnabled = getProfilePageNameSectionEditModalSaveButton().isEnabled();

        Assert.assertFalse(isButtonEnabled, "The save button is enabled.");
    }

    public void pcod_restore_default_information() {
        PauseUtil.pause(2500);
        getProfilePageNameSectionEditLink().click();

        PauseUtil.pause(2500);
        String firstname = "test";
        String lastname = "test";
        String email = TestBaseProvider.getTestBase().getTestData().getString("acc_no");
        String phone = "5558980912";


        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalFirstNameTxtbox().click();
        getProfilePageNameSectionEditModalFirstNameTxtbox().clear();
        getProfilePageNameSectionEditModalFirstNameTxtbox().sendKeys(firstname);
        getProfilePageNameSectionEditModalFirstNameTxtbox().sendKeys(Keys.TAB);

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalLastNameTxtbox().click();
        getProfilePageNameSectionEditModalLastNameTxtbox().clear();
        getProfilePageNameSectionEditModalLastNameTxtbox().sendKeys(lastname);
        getProfilePageNameSectionEditModalLastNameTxtbox().sendKeys(Keys.TAB);

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalEmailTxtbox().click();
        getProfilePageNameSectionEditModalEmailTxtbox().clear();
        getProfilePageNameSectionEditModalEmailTxtbox().sendKeys(email);
        getProfilePageNameSectionEditModalEmailTxtbox().sendKeys(Keys.TAB);

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().click();
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().clear();
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().sendKeys(phone);
        getProfilePageNameSectionEditModalPhoneNumberTxtbox().sendKeys(Keys.TAB);

        PauseUtil.pause(2500);
        getProfilePageNameSectionEditModalSaveButton().click();
    }

    public void pcod_restore_default_password() {
        PauseUtil.pause(2500);
        getpcod_profile_password_editlink().click();

        PauseUtil.pause(2500);
        getpcod_profile_password_edit_newpasswordfield().sendKeys(
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
        getpcod_profile_password_edit_confirmpasswordfield().sendKeys(
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        getpcod_profile_password_edit_confirmpasswordfield().sendKeys(Keys.TAB);

        PauseUtil.pause(2500);
        getpcod_profile_password_edit_savebtn().click();
    }

    public void getProfilePage_Labels_underprofileSection(String label1, String label2, String label3) {
        if (label1.equalsIgnoreCase("name")) {
            String scriptlabel = getelemetLabels().get(0).getText();
            Assert.assertEquals(scriptlabel, label1, "Name field is displayed");
        } else if (label2.equalsIgnoreCase("email")) {
            String scriptlabel = getelemetLabels().get(1)
                    .getText();
            Assert.assertEquals(scriptlabel, label2, "Email field is displayed");
        } else if (label3.equalsIgnoreCase("mobile")) {
            String scriptlabel = getelemetLabels().get(2).getText();
            Assert.assertEquals(scriptlabel, label3, "Mobile field is displayed");

        }


    }

    public void getProfilePage_values_underprofileSection(String section1, String section2, String section3) {
        if (section1.equalsIgnoreCase("ParentName")) {
            String scriptlabelVal = getelemetLabels().get(0).getText();
            Assert.assertEquals(scriptlabelVal, section1, "Parent Name validation fail");
        } else if (section2.equalsIgnoreCase("ParentEmail")) {
            String scriptlabelVal = getelemetLabels().get(1).getText();
            Assert.assertEquals(scriptlabelVal, section2, "Parent Email validation fail");
        } else if (section3.equalsIgnoreCase("ParentMobile")) {
            String scriptlabelVal = getelemetLabels().get(2).getText();
            Assert.assertEquals(scriptlabelVal, section3, "Parent Mobile validation fail");

        }


    }

    public void pcod_click_on_Close_button_edit_profile_modal() {
        PauseUtil.pause(2500);

        getProfilePageNameSectionEditModalCloseButton().click();
    }

    public void pcod_verify_edit_profile_modal_not_displayed_Profile_page() {
        PauseUtil.pause(2500);

        try {
            getEditProfileModal().isDisplayed();
            Assert.fail("The Edit Profile modal is displayed");
        } catch (Exception e) {
            System.out.println("The Edit Profile modal is not displayed");
        }
		/*String act_displayval = .getCssValue("display");
		String exp_displayval = "none";
		
		Assert.assertEquals(act_displayval, exp_displayval, "The Edit Profile modal is displayed");*/

    }

    public void verifyPrefrences() {
        if ((getallelementunderPrefernces().size() != 0) &&
                getallelementunderPrefernces().get(0).isDisplayed()) {

        }else{
            Assert.fail("Preferences Header is not displayed");

        }
    }


    public void verifyCommunicationSelected(String flag) {

        if (flag.equalsIgnoreCase("Yes")) {
            if (getelemetnforHeaderCommunication().size() != 0) {
                System.out.println("header Communication is displayed");
                if (getelementforCommuncation().size() == 0) {

                    Assert.fail("Communication Selected By teacher is not displayed");
                }
            } else {
                Assert.fail("Communication Header is not displayed");
            }
        }

        if (flag.equalsIgnoreCase("No")) {
            if (getelemetnforHeaderCommunication().size() != 0) {
                if (getelementforCommuncation().size() > 0) {
                    Assert.fail("Communication & Incentive should not be selected");
                }
            } else {
                Assert.fail("Communication Header is not displayed");
            }
        }
    }


    public void verifyPromoEmailSelected(String flag) {
        if (flag.equalsIgnoreCase("yes")) {
            if (getelemetnforHeaderPromoEmail().size() != 0) {
                if (getelementforPromoEmail().size() == 0) {
                    Assert.fail("Receive Promo email is not displayed");
                }
            } else {
                Assert.fail("PromoEmail Header is not displayed");
            }
        }
        if (flag.equalsIgnoreCase("No")) {
            if (getelemetnforHeaderCommunication().size() != 0) {
                if (getelementforCommuncation().size() > 0) {
                    Assert.fail("Communication & Incentive should not be selected");
                }
            } else {
                Assert.fail("Communication Header is not displayed");
            }
        }

    }

    public void verifyPrivacy(){
        if((getPrivacyElement().size()!=0) && (getPrivacyElement().get(0).isDisplayed())){

            if((getPrivacyoptionDisplay().size()!=0) && (getPrivacyoptionDisplay().get(0).isDisplayed())){

            }
        }else{
            Assert.fail("Privacy Does Not Display");
        }

    }


    public void verifyEditPasswordmodal()
    {
        SCHUtils.waitForElementToBeDisplayed(getpcod_profile_editpassword_modal().get(0),2000);
        if((getpcod_profile_editpassword_modal().size()!=0 )&&(getpcod_profile_editpassword_modal().get(0).isDisplayed())){

        }else{
            Assert.fail("Password Modal is not displayed");
        }
    }


    public void pcodProfile_password_display_hidden(){
       if((getpcod_password_hiddenText().size()!=0) && getpcod_password_hiddenText().get(0).isDisplayed()){
           if(getpcod_password_hiddenText().get(0).getText().contains("*")){

           }else{
               Assert.fail("Password is not displayed in ******");
           }
        }
    }


    }

