package com.dw.automation.pages;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

import com.dw.automation.sections.ICalendarSection;

public interface ITeachersDeskPage {

	ICalendarSection getCalendarSection();

	void launchPage();

	void waitForPageLoad();

	void clickOnShareCAC();

	void verifyShareCACModel();

	void clickOnCACClose();

	void verifyTeacherDeskPage();

	void clickOnEditMessageToParents();

	void verifyScreenForMessageToParent();

	void clickOnEditMessageSave();

	void clickOnPreviewNoteToParent();

	void verifyNewBrowserWindow();

	void verifyTeacherInfoBar();

	void updateOnlineNoteToParents();

	void verifyUpdatedMessageOnlinenoteToParent();

	void verifyAppleStatus();

	List<WebElement> getLblGradesTaught();

	void verifySOOSection();

	void verifyCACAndDueDate();

	void verifyPreviewParentMessage();

	void clickShareCACLink();

	void verifyShareCACModal();

	void removeURLOnShareCACModal();

	void verifyPage();

	void verifyMakeRecommendationAndWishlistSection();

	void clickOnLink(Object link);
	void verifyUserProfileInfo();

	void verifyEditFunctionalityOnlineNoteToParent();

	void verifyPreviewFunctionalityOnlineNoteToParent();

	void verifyCancelOnlineNoteToParent();
	void validateSelectionOfAvatarImage();

	void verifyTeachersRole();

	void verifyAppleStatusInfoAndModal(Configuration data);

	void sendMessageToParent(Configuration data);

	void editParentMessage(Configuration data);

	void verifyAppleStatusInfoForContentAsset();

	void verifySendMessageToParentForContentAsset(Configuration data);

	void selectSendReminder();

	void verifySendReminderModel();

	void verifyAttachedClasroomWishList();

	void selectAttachedClasroomWishList();

	void selectRecommendandWishLictItem();

	void verifyDueDateSection();

	void selectViewOrderStatus();

	void verifyBouncingAlert();

	void closeBouncingAlert();

	void selectViewForSendLetterToParent();

	void clickOnDownload();

	void clickOnPrint();

	void clickOnEmail();

	void closeSendToLetterViewPopUp();

	void selectSendRemainderLink();

	void verifyMakeRecommendationAndWishlistSectionForNoItem();
	
}
