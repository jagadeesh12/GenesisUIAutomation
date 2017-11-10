package com.dw.automation.pages.impl;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.lang.StringUtils;
import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.ITeachersDeskPage;
import com.dw.automation.sections.ICalendarSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.DMClient;
import com.dw.automation.support.DWClient;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

public class TeachersDeskPage extends BaseTestPage<TeachersHomePage>
		implements
			ITeachersDeskPage {

	public TeachersDeskPage() {
	}

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.lbl.parentonlinetxt")
	private WebElement lblParentOnlineText;

	public WebElement getLblParentOnlineText() {
		return lblParentOnlineText;
	}

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.editdialog.lbl.salutation")
	private WebElement lblSalutationEditOnlineNoteParent;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.editdialog.lbl.lastname")
	private WebElement lblLastNameEditOnlineNoteParent;

	@FindBy(locator = "dw.teachers.desk.yourorders.studentonlineorder.bouncing.alert.lbl.message")
	private WebElement lblMessageBouncingAlert;

	public WebElement getLblMessageBouncingAlert() {
		return lblMessageBouncingAlert;
	}

	@FindBy(locator = "dw.teachers.desk.yourorders.studentonlineorder.bouncing.alert")
	private WebElement bouncingAlert;

	public WebElement getBouncingAlert() {
		return bouncingAlert;
	}

	@FindBy(locator = "dw.teachers.desk.yourorders.studentonlineorder.bouncing.alert.close")
	private WebElement iconCloseBouncingAlert;

	public WebElement getIconCloseBouncingAlert() {
		return iconCloseBouncingAlert;
	}

	public WebElement getLblSalutationEditOnlineNoteParent() {
		return lblSalutationEditOnlineNoteParent;
	}

	public WebElement getLblLastNameEditOnlineNoteParent() {
		return lblLastNameEditOnlineNoteParent;
	}

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.edit.dialog")
	private WebElement dialogEditOnlineNoteParent;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.editdialog.title")
	private WebElement lblTitleEditOnlineNoteParent;

	@FindBy(locator = "dw.teacher.desk.parentordering.onlinenotetoparent.editdialog.lbl.msgarealimit")
	private WebElement lblMsgLimitEditOnlineNoteParent;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.editdialog.edttxt.message")
	private WebElement edtTxtMessageEditOnlineNoteParent;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.editdialog.btn.cancel")
	private WebElement btnCancelEditOnlineNoteParent;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.editdialog.btn.save")
	private WebElement btnSaveEditOnlineNoteParent;

	@FindBy(locator = "dw.teacher.search.item.recommend.button")
	private WebElement btnRecommend;

	@FindBy(locator = "dw.teacher.search.item.wishlist.button")
	private WebElement btnWishlist;

	@FindBy(locator = "dw.teacher.item.wishlist.dialogbox.checkbox.recommend")
	private WebElement selectrecommendchekbox;

	@FindBy(locator = "dw.teacher.item.wishlist.dialogbox.checkbox.wishlist")
	private WebElement selectwishlistcheckbox;

	@FindBy(locator = "dw.teacher.item.wishlist.dialogbox.checkbox.saveforlater")
	private WebElement selectsaveforlatercheckbox;

	@FindBy(locator = "dw.teacer.item.section.box")
	private WebElement sectionbox;

	public WebElement getDialogEditOnlineNoteParent() {
		return dialogEditOnlineNoteParent;
	}

	public WebElement getLblTitleEditOnlineNoteParent() {
		return lblTitleEditOnlineNoteParent;
	}

	public WebElement getLblMsgLimitEditOnlineNoteParent() {
		return lblMsgLimitEditOnlineNoteParent;
	}

	public WebElement getEdtTxtMessageEditOnlineNoteParent() {
		return edtTxtMessageEditOnlineNoteParent;
	}

	public WebElement getBtnCancelEditOnlineNoteParent() {
		return btnCancelEditOnlineNoteParent;
	}

	public WebElement getBtnSaveEditOnlineNoteParent() {
		return btnSaveEditOnlineNoteParent;
	}

	public WebElement getBtnRecommend() {
		return btnRecommend;
	}
	public WebElement getBtnWishlist() {
		return btnWishlist;
	}
	public WebElement getRecommendcheckBox() {
		return selectrecommendchekbox;
	}
	public WebElement getSectionBox() {
		return sectionbox;
	}
	public WebElement getWishListCheckBox() {
		return selectwishlistcheckbox;
	}
	public WebElement getSaveforLaterCheckBox() {
		return selectsaveforlatercheckbox;
	}
	@FindBy(locator = "dw.teachers.desk.teachersprofile.img.teachericon")
	private WebElement imgTeacherIcon;

	@FindBy(locator = "dw.teachers.desk.teachersprofile.lbl.applestatus")
	private WebElement lblAppleStatus;

	public WebElement getLblAppleStatus() {
		return lblAppleStatus;
	}

	@FindBy(locator = "dw.teachers.desk.teacherprofile.lbl.gradestaught")
	private List<WebElement> lblGradesTaught;

	@Override
	public List<WebElement> getLblGradesTaught() {
		return lblGradesTaught;
	}

	@FindBy(locator = "dw.teachers.desk.teacherprofile.lbl.profilename")
	private WebElement lblTeacherName;

	@FindBy(locator = "dw.teachers.desk.teacherprofile.lbl.firstname")
	private WebElement lblTeachersFirstName;

	public WebElement getImgTeacherIcon() {
		return imgTeacherIcon;
	}

	public WebElement getLblTeacherName() {
		return lblTeacherName;
	}

	public WebElement getLblTeachersFirstName() {
		return lblTeachersFirstName;
	}

	@FindBy(locator = "dw.teachers.desk.welcome.lbl.username")
	private WebElement lblUserName;

	@FindBy(locator = "dw.teachers.desk.lbl.teacherprofile")
	private WebElement lblTeacherprofile;

	@FindBy(locator = "dw.teachers.desk.parentordering.classactivation.lbl.code")
	private WebElement lblClassActivationCode;

	@FindBy(locator = "dw.teachers.desk.parentordering.classactivationcode.lnk.share")
	private WebElement lnkShareCAC;

	@FindBy(locator = "dw.trachers.desk.parentordering.classactivationcode.lnk.printlabel")
	private WebElement lnkPrintLabel;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.lnk.edit")
	private WebElement lnkOnlineNoteEdit;

	@FindBy(locator = "dw.teachers.desk.parentordering.onlinenotetoparent.lnk.preview")
	private WebElement lnkOnlineNotePreview;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettertoparent.lnk.view")
	private WebElement lnkSendLetterView;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettertoparent.lnk.edit")
	private WebElement lnkSendLetterEdit;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.editduedate")
	private WebElement lblEditDueDate;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.sendreminder")
	private WebElement lnkSendDueDateRemainder;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.sendreminder.model.attachcheckbox")
	private WebElement chkBoxReminderModelWishList;

	public WebElement getChkBoxReminderModelWishList() {
		return chkBoxReminderModelWishList;
	}

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.sendreminder.model.download")
	private WebElement lnkReminderModelDownload;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.sendreminder.model.print")
	private WebElement lnkReminderModelPrint;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.sendreminder.model.email")
	private WebElement lnkReminderModelEmail;

	public WebElement getLnkReminderModelDownload() {
		return lnkReminderModelDownload;
	}

	public WebElement getLnkReminderModelPrint() {
		return lnkReminderModelPrint;
	}

	public WebElement getLnkReminderModelEmail() {
		return lnkReminderModelEmail;
	}

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lbl.sendreminder.model.lettercopy")
	private WebElement lblReminderModelLetterCopy;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lbl.sendreminder.model.letterlist")
	private WebElement lblReminderModelLetterList;

	public WebElement getLblReminderModelLetterCopy() {
		return lblReminderModelLetterCopy;
	}

	public WebElement getLblReminderModelLetterList() {
		return lblReminderModelLetterList;
	}

	@FindBy(locator = "dw.teachers.desk.lbl.yourorder")
	private WebElement lblYourOrder;

	@FindBy(locator = "dw.teachers.desk.yourorders.submityourorder.lbl.date")
	private WebElement lblSubmitOrderDate;

	@FindBy(locator = "dw.teachers.desk.yourorders.submityourorder.lnk.aprilrewards")
	private WebElement lnkAprilRewards;

	@FindBy(locator = "dw.teachers.desk.yourorders.studentonlineorder.lbl.noofstudent")
	private WebElement lblStudentOnlineorder;

	@FindBy(locator = "dw.teachers.desk.yourorders.studentonlineorder.lbl.SOO")
	private WebElement lblSOO;

	public WebElement getLblSOO() {
		return lblSOO;
	}

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.lnk.startordersnow")
	private WebElement lnkStartOrdernow;

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.classroaster.lnk.manage")
	private WebElement lnkManageClassRoaster;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.lnk.makerecommendations")
	private WebElement lnkMakeRecommendations;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.makerecommendations.lbl.header")
	private WebElement lblMakeRecommendationsHeader;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.makerecommendations.lbl.totalitems")
	private WebElement lblMakerecommendationsTotalItems;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.lnk.addtowishlist")
	private WebElement lnkAddToWishList;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.addtowishlist.lbl.header")
	private WebElement lblAddToWishListHeader;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.addtowishlist.lbl.totalitems")
	private WebElement lblAddToWishListTotalItems;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.lnk.saveforlater")
	private WebElement lnkSaveForLater;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.saveforlater.lbl.header")
	private WebElement lblSaveForLaterHeader;

	@FindBy(locator = "dw.teachers.desk.recommendationsandwishlist.saveforlater.lbl.totalitems")
	private WebElement lblSaveForLaterTotalItems;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.drp.profiletitle")
	private WebElement drpEditOnlineNoteProfileTitle;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.txt.lastname")
	private WebElement txtEditOnlineNoteLastName;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.txt.parentmessage")
	private WebElement txtEditOnlineNoteParentMessage;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.btn.save")
	private WebElement btnEditOnlineNoteSave;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.btn.cancel")
	private WebElement btnEditOnlineNoteCancel;

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.classroaster.manage.txt.studentname")
	private WebElement txtOderStatusStudentName;

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.classroaster.manage.btn.add")
	private WebElement btnOrderStatusAdd;

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.classroaster.manage.lnk.save")
	private WebElement lnkOrderStatusSave;

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.classroaster.manage.lnk.edit")
	private WebElement lnkOrderStatusEdit;

	@FindBy(locator = "dw.teachers.desk.yourorders.orderstatus.classroaster.manage.studentname.lnk.clear")
	private WebElement lnkOrderStatusClear;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettertoparent.view.drp.language")
	private WebElement drpSendLetterLanguage;

	@FindBy(locator = "dw.teachers.desk.share.classactivationcode.lbl.code")
	private WebElement lblShareCACCode;

	@FindBy(locator = "dw.teachers.desk.share.classactivationcode.txt.codeemail")
	private WebElement txtShareCACEmail;

	@FindBy(locator = "dw.teachers.desk.share.classactivationcode.lbl.emailhelp")
	private WebElement lblShareCACEmailHelp;

	@FindBy(locator = "dw.teachers.desk.share.classactivationcode.lnk.bannerone")
	private WebElement lnkShareCACBannerOne;

	@FindBy(locator = "dw.teachers.desk.share.classactivationcode.lnk.bannertwo")
	private WebElement lnkShareCACBannerTwo;

	@FindBy(locator = "dw.teachers.desk.print.classactivationcode.lbl.printlabels")
	private WebElement lblPrintCACPrintLabels;

	@FindBy(locator = "dw.teachers.desk.print.classactivationcode.btn.download")
	private WebElement btnPrintCACDownload;

	@FindBy(locator = "dw.teachers.desk.print.classactivationcode.lnk.facebook")
	private WebElement lnkPrintCACFacebook;

	@FindBy(locator = "dw.teachers.desk.print.classactivationcode.lnk.pinterest")
	private WebElement lnkPrintCACPininterest;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.lbl.title")
	private WebElement lblLetterOrRemainderTitle;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.edit")
	private WebElement lnkLetterOrRemainderEdit;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.restoredefaultmessage")
	private WebElement lnkLetterOrRemainderRestoreDefaultMsg;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.classactivation.lbl.code")
	private WebElement lblLetterOrRemainderCACCode;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.lbl.orderduedate")
	private WebElement lblLetterOrRemainderOrderDueDate;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lbl.lettertext")
	private WebElement lblParentLetterText;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.save")
	private WebElement lnkLetterOrRemainderSave;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.chk.attachclassroomwishlist")
	private WebElement chkParentLetterAttachClassRoomWishList;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.download")
	private WebElement lnkLetterOrRemainderDownload;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.print")
	private WebElement lnkLetterOrRemainderPrint;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.email")
	private WebElement lnkLetterOrRemainderEmail;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.facebook")
	private WebElement lnkLetterOrRemainderFacebook;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.pinterest")
	private WebElement lnkLetterOrRemainderPinterest;

	@FindBy(locator = "dw.teachers.desk.parentordering.sendlettervieworreminder.parentletter.lnk.close")
	private WebElement lnkLetterOrRemainderClose;

	@FindBy(locator = "dw.teachers.desk.parentordering.orderduedateforparents.lnk.setduedate")
	private WebElement lblSetDueDate;

	@FindBy(locator = "dw.teachers.desk.popup.lnk.close")
	private WebElement lnkCloseIcon;

	@FindBy(locator = "dw.teachers.desk.parentordering.lnk.setduedate")
	private WebElement lnkSetDueDate;

	@FindBy(locator = "dw.teachers.desk.parentordering.lbl.duedate")
	private WebElement lblDueDate;

	@FindBy(locator = "dw.teachers.desk.parentordering.section.calender")
	private WebElement calenderSection;

	@FindBy(locator = "dw.teachers.desk.yourorders.lbl.orderstatus.lbl.ordernumber")
	private WebElement lblOrderNumber;

	@FindBy(locator = "dw.teachers.desk.yourorders.lbl.orderstatus.lbl.dateoforder")
	private WebElement lblDateOfOrder;

	@FindBy(locator = "dw.teachers.desk.yourorders.lbl.orderstatus.lbl.status")
	private WebElement lblStatusOfOrder;

	@FindBy(locator = "dw.teachers.desk.yourorders.lbl.orderstatus.lnk.view")
	private WebElement lnkView;

	@FindBy(locator = "dw.teachers.desk.share.classactivationcode.section.sharecac")
	private WebElement shareCACSection;

	@FindBy(locator = "dw.teachers.desk.img.avatarimg")
	private WebElement imgAvatarImg;

	@FindBy(locator = "dw.teachers.desk.avatarimg.lbl.imagelist")
	private List<WebElement> lstAvatarImageList;

	@FindBy(locator = "dw.teachers.desk.avatarimg.btn.update")
	private WebElement btnUpdateAvatarImg;

	@FindBy(locator = "dw.teachers.desk.img.appleicon")
	private WebElement imgAppleIcon;

	@FindBy(locator = "dw.teachers.desk.lnk.applestatus")
	private WebElement lnkAppleStatus;

	@FindBy(locator = "dw.teachers.desk.applestatus.section.applestatusmodal")
	private WebElement sectionAppleStatusModal;

	@FindBy(locator = "dw.teachers.desk.avatarimg.lnk.imagelist")
	private List<WebElement> lnkListImageList;

	@FindBy(locator = "dw.teachers.desk.lst.teachergradeorspeciality")
	private List<WebElement> lstGradeOrSpeciality;

	public List<WebElement> getLstGradeOrSpeciality() {
		return lstGradeOrSpeciality;
	}

	public List<WebElement> getLnkListImageList() {
		return lnkListImageList;
	}

	public WebElement getSectionAppleStatusModal() {
		return sectionAppleStatusModal;
	}

	public WebElement getLnkAppleStatus() {
		return lnkAppleStatus;
	}

	public WebElement getImgAppleIcon() {
		return imgAppleIcon;
	}

	public WebElement getLblMakeRecommendationsHeader() {
		return lblMakeRecommendationsHeader;
	}

	public WebElement getLblAddToWishListHeader() {
		return lblAddToWishListHeader;
	}

	public WebElement getLblSaveForLaterHeader() {
		return lblSaveForLaterHeader;
	}

	public WebElement getBtnUpdateAvatarImg() {
		return btnUpdateAvatarImg;
	}

	public List<WebElement> getLstAvatarImageList() {
		return lstAvatarImageList;
	}

	public WebElement getImgAvatarImg() {
		return imgAvatarImg;
	}

	public WebElement getShareCACSection() {
		return shareCACSection;
	}

	public WebElement getLnkView() {
		return lnkView;
	}

	public WebElement getLblStatusOfOrder() {
		return lblStatusOfOrder;
	}

	public WebElement getLblDateOfOrder() {
		return lblDateOfOrder;
	}

	public WebElement getLblOrderNumber() {
		return lblOrderNumber;
	}

	public WebElement getCalenderSection() {
		return calenderSection;
	}

	public WebElement getLblDueDate() {
		return lblDueDate;
	}

	public WebElement getLnkSetDueDate() {
		return lnkSetDueDate;
	}

	public WebElement getTxtSendReminderDownloadLetter(String text) {
		return SCHUtils.findElement(
				"dw.teachers.desk.parentordering.orderduedateforparents.lnk.sendreminder.model.download.letter.text",
				text);
	}

	@FindBy(locator = "dw.teachers.desk.cacpopup.close")
	private WebElement lnkCloseIconCACPopUp;

	@FindBy(locator = "dw.teachers.desk.lbl.recommendation")
	private WebElement lblRecommondation;

	@FindBy(locator = "dw.teachers.desk.lbl.manageparentordering")
	private WebElement lblManageParentOrdering;

	@FindBy(locator = "dw.teachers.desk.applemodal.lbl.greenappletext")
	private WebElement lblGreenAppleText;

	@FindBy(locator = "dw.teachers.desk.applemodal.lbl.redappletext")
	private WebElement lblRedAppleText;

	@FindBy(locator = "dw.teachers.desk.applemodal.lbl.goldappletext")
	private WebElement lblGoldAppleText;

	@FindBy(locator = "dw.teachers.desk.applemodal.lbl.youryeartodatespent")
	private WebElement lblYourYearToDateSpent;

	@FindBy(locator = "dw.teachers.desk.applemodal.lbl.applestatusname")
	private WebElement lblAppleStatusName;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.lbl.headermessage")
	private WebElement lblOnlineNoteHeaderMessage;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.lbl.bottommessage")
	private WebElement lblOnlineNoteBottomMessage;

	@FindBy(locator = "dw.teachers.desk.onlinenotetoparent.editonlinenote.lbl.textcount")
	private WebElement lblTextCount;

	public WebElement getLblTextCount() {
		return lblTextCount;
	}

	public WebElement getLblOnlineNoteHeaderMessage() {
		return lblOnlineNoteHeaderMessage;
	}

	public WebElement getLblOnlineNoteBottomMessage() {
		return lblOnlineNoteBottomMessage;
	}

	public WebElement getLblAppleStatusName() {
		return lblAppleStatusName;
	}

	public WebElement getLblYourYearToDateSpent() {
		return lblYourYearToDateSpent;
	}

	public WebElement getLblRedAppleText() {
		return lblRedAppleText;
	}

	public WebElement getLblGoldAppleText() {
		return lblGoldAppleText;
	}

	public WebElement getLblGreenAppleText() {
		return lblGreenAppleText;
	}

	public WebElement getLblRecommondation() {
		return lblRecommondation;
	}

	public WebElement getLblManageParentOrdering() {
		return lblManageParentOrdering;
	}

	public WebElement getLnkCloseIconCACPopUp() {
		return lnkCloseIconCACPopUp;
	}

	public WebElement getLnkCloseIcon() {
		return lnkCloseIcon;
	}

	public void setLnkCloseIcon(WebElement lnkCloseIcon) {
		this.lnkCloseIcon = lnkCloseIcon;
	}

	public WebElement getLblSetDueDate() {
		return lblSetDueDate;
	}

	public WebElement getLblUserName() {
		return lblUserName;
	}

	public WebElement getLblTeacherprofile() {
		return lblTeacherprofile;
	}

	public WebElement getLblClassActivationCode() {
		return lblClassActivationCode;
	}

	public WebElement getLnkShareCAC() {
		return lnkShareCAC;
	}

	public WebElement getLnkPrintLabel() {
		return lnkPrintLabel;
	}

	public WebElement getLnkOnlineNoteEdit() {
		return lnkOnlineNoteEdit;
	}

	public WebElement getLnkOnlineNotePreview() {
		return lnkOnlineNotePreview;
	}

	public WebElement getLnkSendLetterView() {
		return lnkSendLetterView;
	}

	public WebElement getLnkSendLetterEdit() {
		return lnkSendLetterEdit;
	}

	public WebElement getLblEditDueDate() {
		return lblEditDueDate;
	}

	public WebElement getLnkSendDueDateRemainder() {
		return lnkSendDueDateRemainder;
	}

	public WebElement getLblYourOrder() {
		return lblYourOrder;
	}

	public WebElement getLblSubmitOrderDate() {
		return lblSubmitOrderDate;
	}

	public WebElement getLnkAprilRewards() {
		return lnkAprilRewards;
	}

	public WebElement getLblStudentOnlineorder() {
		return lblStudentOnlineorder;
	}

	public WebElement getLnkStartOrdernow() {
		return lnkStartOrdernow;
	}

	public WebElement getLnkManageClassRoaster() {
		return lnkManageClassRoaster;
	}

	public WebElement getLnkMakeRecommendations() {
		return lnkMakeRecommendations;
	}

	public WebElement getLblMakerecommendationsTotalItems() {
		return lblMakerecommendationsTotalItems;
	}

	public WebElement getLnkAddToWishList() {
		return lnkAddToWishList;
	}

	public WebElement getLblAddToWishListTotalItems() {
		return lblAddToWishListTotalItems;
	}

	public WebElement getLnkSaveForLater() {
		return lnkSaveForLater;
	}

	public WebElement getLblSaveForLaterTotalItems() {
		return lblSaveForLaterTotalItems;
	}

	public WebElement getDrpEditOnlineNoteProfileTitle() {
		return drpEditOnlineNoteProfileTitle;
	}

	public WebElement getTxtEditOnlineNoteLastName() {
		return txtEditOnlineNoteLastName;
	}

	public WebElement getTxtEditOnlineNoteParentMessage() {
		return txtEditOnlineNoteParentMessage;
	}

	public WebElement getBtnEditOnlineNoteSave() {
		return btnEditOnlineNoteSave;
	}

	public WebElement getBtnEditOnlineNoteCancel() {
		return btnEditOnlineNoteCancel;
	}

	public WebElement getTxtOderStatusStudentName() {
		return txtOderStatusStudentName;
	}

	public WebElement getBtnOrderStatusAdd() {
		return btnOrderStatusAdd;
	}

	public WebElement getLnkOrderStatusSave() {
		return lnkOrderStatusSave;
	}

	public WebElement getLnkOrderStatusEdit() {
		return lnkOrderStatusEdit;
	}

	public WebElement getLnkOrderStatusClear() {
		return lnkOrderStatusClear;
	}

	public WebElement getDrpSendLetterLanguage() {
		return drpSendLetterLanguage;
	}

	public WebElement getLblShareCACCode() {
		return lblShareCACCode;
	}

	public WebElement getTxtShareCACEmail() {
		return txtShareCACEmail;
	}

	public WebElement getLblShareCACEmailHelp() {
		return lblShareCACEmailHelp;
	}

	public WebElement getLnkShareCACBannerOne() {
		return lnkShareCACBannerOne;
	}

	public WebElement getLnkShareCACBannerTwo() {
		return lnkShareCACBannerTwo;
	}

	public WebElement getLblPrintCACPrintLabels() {
		return lblPrintCACPrintLabels;
	}

	public WebElement getBtnPrintCACDownload() {
		return btnPrintCACDownload;
	}

	public WebElement getLnkPrintCACFacebook() {
		return lnkPrintCACFacebook;
	}

	public WebElement getLnkPrintCACPininterest() {
		return lnkPrintCACPininterest;
	}

	public WebElement getLblLetterOrRemainderTitle() {
		return lblLetterOrRemainderTitle;
	}

	public WebElement getLnkLetterOrRemainderEdit() {
		return lnkLetterOrRemainderEdit;
	}

	public WebElement getLnkLetterOrRemainderRestoreDefaultMsg() {
		return lnkLetterOrRemainderRestoreDefaultMsg;
	}

	public WebElement getLblLetterOrRemainderCACCode() {
		return lblLetterOrRemainderCACCode;
	}

	public WebElement getLblLetterOrRemainderOrderDueDate() {
		return lblLetterOrRemainderOrderDueDate;
	}

	public WebElement getLblParentLetterText() {
		return lblParentLetterText;
	}

	public WebElement getLnkLetterOrRemainderSave() {
		return lnkLetterOrRemainderSave;
	}

	public WebElement getChkParentLetterAttachClassRoomWishList() {
		return chkParentLetterAttachClassRoomWishList;
	}

	public WebElement getLnkLetterOrRemainderDownload() {
		return lnkLetterOrRemainderDownload;
	}

	public WebElement getLnkLetterOrRemainderPrint() {
		return lnkLetterOrRemainderPrint;
	}

	public WebElement getLnkLetterOrRemainderEmail() {
		return lnkLetterOrRemainderEmail;
	}

	public WebElement getLnkLetterOrRemainderFacebook() {
		return lnkLetterOrRemainderFacebook;
	}

	public WebElement getLnkLetterOrRemainderPinterest() {
		return lnkLetterOrRemainderPinterest;
	}

	public WebElement getLnkLetterOrRemainderClose() {
		return lnkLetterOrRemainderClose;
	}

	@Override
	public void openPage() {
		// Code to navigate to Teachers Desk Page
	}

	@Override
	protected void initParent() {
		parent = new TeachersHomePage();
	}

	@Override
	public boolean isPageActive() {
		return false;
	}

	@Override
	public void launchPage() {
		openPage();
	}

	@Override
	public void waitForPageLoad() {
		new TeachersDeskPage();
		WaitUtils.waitForDisplayed(getLblUserName());
	}

	@Override
	public ICalendarSection getCalendarSection() {
		return SectionFactory.getFactory()
				.getICalendarSection(By.id("ui-datepicker-div"));
	}

	@Override
	public void verifyTeacherInfoBar() {
		AssertUtils.assertDisplayed(getImgTeacherIcon());
		AssertUtils.assertDisplayed(getLblTeacherName());
		AssertUtils.assertDisplayed(getLblTeachersFirstName());
		AssertUtils.assertDisplayed(getLblTeacherprofile());
		Assert.assertTrue(getLblGradesTaught().size() > 0,
				"No grades taught available in teacher profile");
	}

	@Override
	public void updateOnlineNoteToParents() {
		PauseUtil.pause(14000);
		getLnkOnlineNoteEdit().click();
		PauseUtil.pause(4000);
		Assert.assertTrue(getLblTitleEditOnlineNoteParent().getText()
				.equalsIgnoreCase(ConstantUtils.EDIT_ONLINE_NOTE_TO_PARENT_DIALOG_TITLE));
		Assert.assertTrue(getLblSalutationEditOnlineNoteParent().getText()
				.equalsIgnoreCase(getTestBase().getTestData().getString("salutation")));
		// Assert.assertTrue(getLblLastNameEditOnlineNoteParent().getAttribute("value")
		// .equalsIgnoreCase(getTestBase().getTestData().getString("lastname")));
		SCHUtils.clickUsingJavaScript(getLblLastNameEditOnlineNoteParent());
		getLblLastNameEditOnlineNoteParent().clear();
		getLblLastNameEditOnlineNoteParent().sendKeys("lastname");
		getLblLastNameEditOnlineNoteParent().clear();
		getLblLastNameEditOnlineNoteParent()
				.sendKeys(getTestBase().getTestData().getString("lastname"));
		Assert.assertTrue(getLblMsgLimitEditOnlineNoteParent().getText()
				.contains(ConstantUtils.EDIT_ONLINE_NOTE_TO_PARENT_DIALOG_MAX_MSG_LIMIT));
		Assert.assertTrue(getEdtTxtMessageEditOnlineNoteParent().getAttribute("maxlength")
				.equalsIgnoreCase("150"));
		getEdtTxtMessageEditOnlineNoteParent().clear();
		getEdtTxtMessageEditOnlineNoteParent()
				.sendKeys(getTestBase().getTestData().getString("message"));
		getBtnSaveEditOnlineNoteParent().click();
	}

	public static void main(String[] args) {
		DMClient client = new DMClient();
		String str = null;
		str = client.getUser("teacher@teacher.in");
		System.out.println(str);
		JSONArray j = new JSONArray(str);
		String lastName =
				j.getJSONObject(0).getJSONObject("basicProfile").getString("lastName");
		String title =
				j.getJSONObject(0).getJSONObject("basicProfile").getString("title");
		String firstName =
				j.getJSONObject(0).getJSONObject("basicProfile").getString("firstName");
		String phone = j.getJSONObject(0).getJSONObject("basicProfile")
				.getJSONObject("phones").getJSONObject("home").getString("phoneNumber");
		System.out.println(phone);
		if (!phone.equalsIgnoreCase("") || phone != null) {
			String hardcoded = "565-656-5656";
			System.out.println(phone.substring(0, 3) + "-" + phone.substring(3, 6) + "-"
					+ phone.substring(7));
			boolean var = hardcoded.contains(phone.substring(0, 3) + "-"
					+ phone.substring(3, 6) + "-" + phone.substring(7));
			System.out.println(var);
		}
		System.out.println(lastName);
		System.out.println(title);
		System.out.println(firstName);
	}

	@Override
	public void verifyEditFunctionalityOnlineNoteToParent() {
		waitForPageLoad();
		PauseUtil.pause(10000);
		SCHUtils.clickUsingJavaScript(getLnkOnlineNoteEdit());
		SCHUtils.waitForLoaderToDismiss();
		// getLnkOnlineNoteEdit().click();
		PauseUtil.pause(4000);
		PauseUtil.waitForAjaxToComplete(5000);
		Assert.assertTrue(getLblTitleEditOnlineNoteParent().getText()
				.equalsIgnoreCase(ConstantUtils.EDIT_ONLINE_NOTE_TO_PARENT_DIALOG_TITLE));

		if (TestBaseProvider.getTestBase().getContext()
				.getProperty("tdm.userid") != null) {
			DMClient client = new DMClient();
			String str = null;
			str = client.getUser(TestBaseProvider.getTestBase().getTestData()
					.getString("tdm.userid").trim());
			JSONArray j = new JSONArray(str);
			String lastName = j.getJSONObject(0).getJSONObject("basicProfile")
					.getString("lastName");
			String title =
					j.getJSONObject(0).getJSONObject("basicProfile").getString("title");
			// String firstName =
			// j.getJSONObject(0).getJSONObject("basicProfile").getString("firstName");

			Assert.assertTrue(getLblSalutationEditOnlineNoteParent().getText()
					.toLowerCase().contains(title.toLowerCase()));
			Assert.assertTrue(getLblLastNameEditOnlineNoteParent().getAttribute("value")
					.contains(lastName));
			SCHUtils.clickUsingJavaScript(getLblLastNameEditOnlineNoteParent());
			getLblLastNameEditOnlineNoteParent().clear();
			getLblLastNameEditOnlineNoteParent().sendKeys("lastname");
			getLblLastNameEditOnlineNoteParent().clear();
			getLblLastNameEditOnlineNoteParent().sendKeys(lastName);
		}		Assert.assertTrue(getLblMsgLimitEditOnlineNoteParent().getText()
				.contains(ConstantUtils.EDIT_ONLINE_NOTE_TO_PARENT_DIALOG_MAX_MSG_LIMIT));
		Assert.assertTrue(getEdtTxtMessageEditOnlineNoteParent().getAttribute("maxlength")
				.equalsIgnoreCase("150"));
		getEdtTxtMessageEditOnlineNoteParent().clear();
		getEdtTxtMessageEditOnlineNoteParent()
				.sendKeys(getTestBase().getTestData().getString("message"));
		AssertUtils.assertDisplayed(getBtnCancelEditOnlineNoteParent());
		getBtnSaveEditOnlineNoteParent().click();
	}

	@Override
	public void verifyPreviewFunctionalityOnlineNoteToParent() {
		AssertUtils.assertDisplayed(getLnkOnlineNotePreview());
		String oldhandle = getDriver().getWindowHandle();
		getLnkOnlineNotePreview().click();
		new TeachersDeskPage();
		PauseUtil.pause(5000);
		for (String handle : getDriver().getWindowHandles()) {
			if (!handle.equals(oldhandle)) {
				getDriver().switchTo().window(handle);
				break;
			}
		}
		getDriver().manage().window().maximize();

	}

	@Override
	public void verifyCancelOnlineNoteToParent() {
		PauseUtil.pause(5000);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(getLnkOnlineNoteEdit()).clickAndHold().build().perform();
		// SCHUtils.clickUsingJavaScript(getLnkOnlineNoteEdit());
		// getLnkOnlineNoteEdit().click();
		System.out.println("click - 1 time");
		try {
			Actions action = new Actions(getDriver());
			action.moveToElement(getLnkOnlineNoteEdit()).click().build().perform();
			SCHUtils.clickUsingJavaScript(getLnkOnlineNoteEdit());
			System.out.println("click - 2 time in try");
		} catch (Exception e) {
		}
		// getLnkOnlineNoteEdit().click();
		PauseUtil.pause(4000);
		String note = getEdtTxtMessageEditOnlineNoteParent().getText();
		getEdtTxtMessageEditOnlineNoteParent().clear();
		SCHUtils.clickUsingJavaScript(getBtnCancelEditOnlineNoteParent());
		// getBtnCancelEditOnlineNoteParent().click();
		PauseUtil.pause(5000);
		if (!note.equalsIgnoreCase("") || note != null) {
			Assert.assertTrue(
					getLblParentOnlineText().getText().trim().equalsIgnoreCase(note));
		}
	}

	@Override
	public void verifyUpdatedMessageOnlinenoteToParent() {
		PauseUtil.pause(4000);
		Assert.assertTrue(getLblParentOnlineText().getText().trim()
				.equalsIgnoreCase(getTestBase().getTestData().getString("message")));
	}

	@Override
	public void verifySOOSection() {
		AssertUtils.assertDisplayed(getLblSOO());
		AssertUtils.assertDisplayed(getLblStudentOnlineorder());
		Assert.assertTrue(
				Integer.valueOf(getLblStudentOnlineorder().getText().trim()) >= 0,
				"There is no number of SOO order found");
	}

	@Override
	public void verifyAppleStatus() {
		AssertUtils.assertDisplayed(getLblAppleStatus());
	}

	@Override
	public void selectSendReminder() {
		PauseUtil.waitForAjaxToComplete(10);
		Assert.assertTrue(getLnkSendDueDateRemainder().isDisplayed());
		getLnkSendDueDateRemainder().click();
	}

	@Override
	public void verifyCACAndDueDate() {
		AssertUtils.assertDisplayed(getLblClassActivationCode());
		Assert.assertTrue(!getLblClassActivationCode().getTagName().contains("input"));
		AssertUtils.assertDisplayed(getLblDueDate());
		getLnkSetDueDate().click();
		AssertUtils.assertDisplayed(getCalenderSection());

	}

	@Override
	public void verifyDueDateSection() {
		AssertUtils.assertDisplayed(getLblDueDate());
		getLnkSetDueDate().click();
		AssertUtils.assertDisplayed(getCalenderSection());
		ICalendarSection calendarSection =
				SectionFactory.getFactory().getICalendarSection(LocatorUtils
						.getBy("dw.teachers.desk.parentordering.section.calender"));
		/*
		 * calendarSection.selectDateOnCalender(
		 * TestBaseProvider.getTestBase().getTestData().getString("date"),
		 * TestBaseProvider.getTestBase().getTestData().getString("month"),
		 * TestBaseProvider.getTestBase().getTestData().getString("year"));
		 */

		calendarSection.selectDayOnCalender();
		Assert.assertFalse(SCHUtils.isPresent(getCalenderSection()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.date",
				getLblDueDate().getText());
	}

	@Override
	public void verifyPreviewParentMessage() {

		String oldWindow = getDriver().getWindowHandle();

		WaitUtils.waitForDisplayed(getLnkOnlineNotePreview());
		getLnkOnlineNotePreview().click();
		PauseUtil.pause(2000);
		if (getDriver().getWindowHandles().size() > 1) {
			for (String window : getDriver().getWindowHandles()) {
				if (!oldWindow.equalsIgnoreCase(window)) {
					getDriver().switchTo().window(window);
				}
			}
		}

		PauseUtil.pause(2000);

	}

	@Override
	public void clickShareCACLink() {
		getTestBase().getContext().setProperty("testexecution.teachersdesk.cac",
				getLblClassActivationCode().getText());
		WaitUtils.waitForDisplayed(getLnkShareCAC());
		getLnkShareCAC().click();
	}

	@Override
	public void verifyShareCACModal() {
		PauseUtil.pause(3000);
		WaitUtils.waitForDisplayed(getShareCACSection());
		AssertUtils.assertDisplayed(getShareCACSection());

		AssertUtils.assertDisplayed(getTxtShareCACEmail());
		AssertUtils.assertAttributeMatches(getTxtShareCACEmail(), "value",
				Matchers.containsString((String) TestBaseProvider.getTestBase()
						.getContext().getProperty("testexecution.teachersdesk.cac")));

	}

	@Override
	public void removeURLOnShareCACModal() {
		getTxtShareCACEmail().sendKeys(" ");
		PauseUtil.pause(2000);
		getLnkLetterOrRemainderClose().click();
	}
	@Override
	public void verifyPage() {
		if (SCHUtils.isPresent(getLnkCloseIcon())) {
			new TeachersDeskPage();
			if (SCHUtils.isPresent(getLnkCloseIcon())) {
				getLnkCloseIcon().click();
			}
		}
		waitForPageLoad();
		AssertUtils.assertDisplayed(getLblUserName());
		AssertUtils.assertDisplayed(getLblTeacherprofile());
	}

	@Override
	public void verifyMakeRecommendationAndWishlistSection() {
		Configuration data = getTestBase().getTestData();
		AssertUtils.assertDisplayed(getLnkAddToWishList());
		AssertUtils.assertDisplayed(getLblAddToWishListTotalItems());
		AssertUtils.assertTextMatches(getLblAddToWishListHeader(), Matchers
				.containsString(ConstantUtils.TEACHER_DESK_ADDTOWISHLIST_ITEM_HEADER));
		AssertUtils.assertDisplayed(getLnkMakeRecommendations());
		AssertUtils.assertDisplayed(getLblMakerecommendationsTotalItems());
		AssertUtils.assertTextMatches(getLblMakeRecommendationsHeader(), Matchers
				.containsString(ConstantUtils.TEACHER_DESK_RECOMMENDATIONS_ITEM_HEADER));
		getTestBase().getContext().setProperty("testexecution.recommndation.items.count",
				getLblMakerecommendationsTotalItems().getText().split(" ")[0].trim());
		getTestBase().getContext().setProperty("testexecution.wishlist.items.count",
				getLblAddToWishListTotalItems().getText().split(" ")[0].trim());
		if (data.containsKey("saveforlater")
				&& data.getString("saveforlater").equals("true")) {
			AssertUtils.assertDisplayed(getLnkSaveForLater());
			AssertUtils.assertDisplayed(getLblSaveForLaterTotalItems());
			AssertUtils.assertTextMatches(getLblSaveForLaterHeader(), Matchers
					.containsString(ConstantUtils.TEACHER_DESK_SAVEFORLATER_ITEM_HEADER));
			getTestBase().getContext().setProperty(
					"testexecution.saveforlater.items.count",
					getLblSaveForLaterTotalItems().getText().split(" ")[0].trim());
		} else {
			Assert.assertFalse(SCHUtils.isPresent(getLnkSaveForLater()),
					"SaveForLater Link is displayed");
			Assert.assertFalse(SCHUtils.isPresent(getLblSaveForLaterTotalItems()),
					"SaveForLater Items are displayed");
		}
	}

	@Override
	public void clickOnLink(Object link) {
		if (link instanceof String) {
			if (((String) link).equalsIgnoreCase("Make Recommendation")) {
				// getLnkMakeRecommendations().click();
				SCHUtils.clickUsingJavaScript(getLnkMakeRecommendations());
			} else if (((String) link).equalsIgnoreCase("Add To Wish List")) {
				getLnkAddToWishList().click();
			} else if (((String) link).equalsIgnoreCase("Save For Later")) {
				getLnkSaveForLater().click();
			}
		}
		PauseUtil.pause(5000);
	}

	@Override
	public void verifyUserProfileInfo() {
		UserProfileBean profileBean = (UserProfileBean) getTestBase().getContext()
				.getProperty("testexecution.userProfileBean");
		profileBean.getName();
		PauseUtil.pause(3000);
		Assert.assertTrue(profileBean.getName().toUpperCase()
				.contains(getLblUserName().getText().toUpperCase().split(" ")[1])
				&& profileBean.getName().toUpperCase().contains(
						getLblUserName().getText().toUpperCase().split(" ")[0]));
		AssertUtils.assertDisplayed(getImgAvatarImg());
		AssertUtils.assertDisplayed(getLblTeacherprofile());

	}

	@Override
	public void validateSelectionOfAvatarImage() {
		AssertUtils.assertDisplayed(getImgAvatarImg());
		String imgUrl;
		imgUrl = getImgAvatarImg().getAttribute("src");
		getImgAvatarImg().click();
		PauseUtil.pause(8000);
		WaitUtils.waitForDisplayed(getLstAvatarImageList().get(0));
		List<WebElement> imgList = getLstAvatarImageList();
		List<WebElement> imgLinkList = getLnkListImageList();
		for (int i = 0; i < imgList.size(); i++) {
			if (imgList.get(i).getAttribute("src").contains(imgUrl)) {
				Assert.assertTrue(imgLinkList.get(i).getAttribute("class").toString()
						.contains("highlight"));
				if (!(i == 0)) {
					imgUrl = imgList.get(i - 1).getAttribute("src");
					imgList.get(i - 1).click();
				} else {
					if (!(i == 12)) {
						imgUrl = imgList.get(i + 1).getAttribute("src");
						imgList.get(i + 1).click();
					} else {
						imgUrl = imgList.get(i - 1).getAttribute("src");
						imgList.get(i - 1).click();
					}

				}

				break;
			}

		}

		PauseUtil.pause(8000);
		SCHUtils.clickUsingJavaScript(getBtnUpdateAvatarImg());
		AssertUtils.assertAttributeMatches(getImgAvatarImg(), "src",
				Matchers.containsString(imgUrl));

	}

	@Override
	public void verifyTeachersRole() {
		List<WebElement> gradeOrSpecialityList = getLstGradeOrSpeciality();

		UserProfileBean profileBean = (UserProfileBean) getTestBase().getContext()
				.getProperty("testexecution.userProfileBean");
		System.out.println("user gets information" + profileBean);
		PauseUtil.pause(1000);
		for (int i = 0; i < gradeOrSpecialityList.size(); i++) {

			Assert.assertTrue(
					profileBean.getGradeOrSpeciality().contains(gradeOrSpecialityList
							.get(i).getText().replace("Teacher", "").trim()));

		}
	}

	@Override
	public void verifyAppleStatusInfoAndModal(Configuration data) {
		if (data.getString("appleusertest").equalsIgnoreCase("yes")
				&& !(data.getString("appleusertest") == null)) {
			AssertUtils.assertDisplayed(getImgAppleIcon());
			AssertUtils.assertDisplayed(getLnkAppleStatus());
			getLnkAppleStatus().click();
			PauseUtil.pause(2000);
			AssertUtils.assertDisplayed(getSectionAppleStatusModal());
			getLnkLetterOrRemainderClose().click();
			AssertUtils.assertDisplayed(getLblTeacherprofile());

		}
	}

	@Override
	public void sendMessageToParent(Configuration data) {
		WaitUtils.waitForDisplayed(getLnkOnlineNoteEdit());
		getLnkOnlineNoteEdit().click();
		WaitUtils.waitForDisplayed(getTxtEditOnlineNoteParentMessage());
		getTxtEditOnlineNoteParentMessage().clear();
		getTxtEditOnlineNoteParentMessage().sendKeys(data.getString("oldmessage"));
		getTestBase().getContext().setProperty("testexecution.message",
				data.getString("oldmessage"));
		SCHUtils.clickUsingJavaScript(getBtnEditOnlineNoteSave());

	}

	@Override
	public void editParentMessage(Configuration data) {
		WaitUtils.waitForDisplayed(getLnkOnlineNoteEdit());
		getLnkOnlineNoteEdit().click();
		WaitUtils.waitForDisplayed(getTxtEditOnlineNoteParentMessage());
		getTxtEditOnlineNoteParentMessage().clear();
		getTxtEditOnlineNoteParentMessage().sendKeys(data.getString("newmessage"));
		getTestBase().getContext().setProperty("testexecution.message",
				data.getString("newmessage"));
		SCHUtils.clickUsingJavaScript(getBtnEditOnlineNoteSave());

	}

	@Override
	public void clickOnShareCAC() {
		PauseUtil.pause(2000);
		getLnkShareCAC().click();
	}

	@Override
	public void verifyShareCACModel() {
		Assert.assertTrue(getLblClassActivationCode().getText().trim().length() == 5);
		AssertUtils.assertDisplayed(getLblClassActivationCode());
		AssertUtils.assertDisplayed(getLblShareCACEmailHelp());
		AssertUtils.assertDisplayed(getLnkShareCACBannerOne());
		AssertUtils.assertDisplayed(getLnkShareCACBannerTwo());
		AssertUtils.assertDisplayed(getTxtShareCACEmail());
		AssertUtils.assertDisplayed(getLnkCloseIconCACPopUp());
		String asset = DWClient.getAsset("teacher-desk-share-activation-code");
		String asset1 = DWClient.getAsset("share-activation-code-banner");
		// System.out.println(" asset =======> " + asset);
		// System.out.println(" asset =======> " + asset1);
		Assert.assertTrue(asset.trim().length() > 0);
		Assert.assertTrue(asset1.trim().length() > 0);
	}

	@Override
	public void clickOnCACClose() {
		PauseUtil.pause(5000);
		getLnkCloseIconCACPopUp().click();;
	}

	@Override
	public void verifyTeacherDeskPage() {
		AssertUtils.assertDisplayed(getLblYourOrder());
		AssertUtils.assertDisplayed(getLblRecommondation());
		AssertUtils.assertDisplayed(getLblManageParentOrdering());
	}

	@Override
	public void clickOnEditMessageToParents() {
		PauseUtil.pause(5000);
		getLnkOnlineNoteEdit().click();
	}

	@Override
	public void verifyScreenForMessageToParent() {
		PauseUtil.pause(5000);
		AssertUtils.assertDisplayed(getTxtEditOnlineNoteLastName());
		AssertUtils.assertDisplayed(getTxtEditOnlineNoteParentMessage());
		String strUtil = "a";
		strUtil = StringUtils.repeat(strUtil, 151);
		getTxtEditOnlineNoteParentMessage().sendKeys(strUtil);
		AssertUtils.assertDisplayed(getBtnEditOnlineNoteSave());
		AssertUtils.assertDisplayed(getBtnEditOnlineNoteCancel());
	}

	@Override
	public void clickOnEditMessageSave() {
		getBtnEditOnlineNoteSave().click();
	}

	@Override
	public void clickOnPreviewNoteToParent() {
		getLnkOnlineNotePreview().click();

	}

	@Override
	public void verifyNewBrowserWindow() {
		String oldhandle = getDriver().getWindowHandle();
		for (String handle : getDriver().getWindowHandles()) {
			if (!handle.equals(oldhandle)) {
				getDriver().switchTo().window(handle);
				break;
			}
		}
		getDriver().manage().window().maximize();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AssertUtils.assertDisplayed(getLblTitleEditOnlineNoteParent());
		getDriver().switchTo().window(oldhandle);

	}

	@Override
	public void verifySendReminderModel() {
		Assert.assertTrue(getLnkReminderModelDownload().isDisplayed());
		Assert.assertTrue(getLnkReminderModelEmail().isDisplayed());
		Assert.assertTrue(getLnkReminderModelPrint().isDisplayed());
	}

	@Override
	public void verifyAttachedClasroomWishList() {
		PauseUtil.pause(2000);
		// WaitUtils.waitForDisplayed(getChkBoxReminderModelWishList());
		SCHUtils.isPresent(getChkBoxReminderModelWishList());
		// Assert.assertTrue(getChkBoxReminderModelWishList().isDisplayed());
		// getChkBoxReminderModelWishList().click();
	}

	@Override
	public void selectAttachedClasroomWishList() {
		getChkBoxReminderModelWishList().click();
	}

	@Override
	public void verifyAppleStatusInfoForContentAsset() {
		PauseUtil.pause(2000);
		getLnkAppleStatus().click();
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getSectionAppleStatusModal());

		Double greenAppleAmount = SCHUtils.getPriceWithOutCurrency(
				getLblGreenAppleText().getText().split("\\$")[1]);
		Double redAppleAmount = SCHUtils
				.getPriceWithOutCurrency(getLblRedAppleText().getText().split("\\$")[1]);
		Double goldAappleAmount = SCHUtils
				.getPriceWithOutCurrency(getLblGoldAppleText().getText().split("\\$")[1]);
		System.out.println("text---greeen" + greenAppleAmount + "red" + redAppleAmount
				+ "gold" + goldAappleAmount);
		Double yourYearToSpentAmount =
				SCHUtils.getPriceWithOutCurrency(getLblYourYearToDateSpent().getText());

		System.out.println("yourYearToSpentAmount");
		if (greenAppleAmount < yourYearToSpentAmount
				&& yourYearToSpentAmount < redAppleAmount) {
			AssertUtils.assertTextMatches(getLblAppleStatusName(),
					Matchers.containsString("Green"));
		} else if (redAppleAmount < yourYearToSpentAmount
				&& yourYearToSpentAmount < goldAappleAmount) {
			System.out.println("In......");
			AssertUtils.assertTextMatches(getLblAppleStatusName(),
					Matchers.containsString("Red"));
		} else if (yourYearToSpentAmount > goldAappleAmount) {
			AssertUtils.assertTextMatches(getLblAppleStatusName(),
					Matchers.containsString("Golden"));
		} else {
			System.out.println("Amount doesn't matches");
		}
		String asset = DWClient.getAsset("apple-rewards-spend");
		Assert.assertTrue(asset.contains("When Your Class Orders for the Year Total"));

		getLnkLetterOrRemainderClose().click();
	}

	@Override
	public void verifySendMessageToParentForContentAsset(Configuration data) {
		String priviousmessage = getLblParentOnlineText().getText().toString();
		WaitUtils.waitForDisplayed(getLnkOnlineNoteEdit());
		getLnkOnlineNoteEdit().click();

		String headerMessage = DWClient.getAsset("teacher-desk-parent-message-top");
		String bottomMessage = DWClient.getAsset("teacher-desk-parent-message-bottom");

		Assert.assertTrue(
				headerMessage.contains(getLblOnlineNoteHeaderMessage().getText()));

		Assert.assertTrue(
				bottomMessage.contains(getLblOnlineNoteBottomMessage().getText().trim()));

		UserProfileBean profileBean = (UserProfileBean) getTestBase().getContext()
				.getProperty("testexecution.userProfileBean");
		String name = profileBean.getName();
		AssertUtils.assertTextMatches(getLblSalutationEditOnlineNoteParent(),
				Matchers.containsString(name.split(" ")[0]));
		String[] names = name.split(" ");

		AssertUtils.assertAttributeMatches(getLblLastNameEditOnlineNoteParent(), "value",
				Matchers.containsString(name.split(" ")[names.length - 1]));
		Assert.assertTrue(
				getLblLastNameEditOnlineNoteParent().getTagName().contains("input"));

		AssertUtils.assertDisplayed(getLblMsgLimitEditOnlineNoteParent());

		String strUtil = "a";
		strUtil = StringUtils.repeat(strUtil, 150);
		getTxtEditOnlineNoteParentMessage().clear();
		for (int i = 0; i < strUtil.length(); i++) {
			getTxtEditOnlineNoteParentMessage().sendKeys(strUtil.substring(i, i + 1));
			AssertUtils.assertTextMatches(getLblTextCount(),
					Matchers.containsString(String.valueOf(150 - (i + 1))));

		}

		String strUtil1 = "b";
		strUtil1 = StringUtils.repeat(strUtil1, 155);
		getTxtEditOnlineNoteParentMessage().clear();
		getTxtEditOnlineNoteParentMessage().sendKeys(strUtil1);
		PauseUtil.pause(2000);

		Assert.assertTrue(
				!(getTxtEditOnlineNoteParentMessage().getText().length() > 150));

		getBtnCancelEditOnlineNoteParent().click();

		PauseUtil.pause(2000);

		AssertUtils.assertTextMatches(getLblParentOnlineText(),
				Matchers.containsString(priviousmessage));

		getLnkOnlineNoteEdit().click();

		PauseUtil.pause(2000);
		getTxtEditOnlineNoteParentMessage().clear();
		getTxtEditOnlineNoteParentMessage()
				.sendKeys(data.getString("messageToBeVerified"));

		getBtnSaveEditOnlineNoteParent().click();
		AssertUtils.assertTextMatches(getLblParentOnlineText(),
				Matchers.containsString(data.getString("messageToBeVerified")));

	}

	public void clickOnEditDateLink() {

		if (SCHUtils.isPresent(getLnkCloseIcon())) {

			getLnkCloseIcon().click();
		}
		waitForPageLoad();
		WaitUtils.waitForDisplayed(getLblEditDueDate());
		SCHUtils.clickUsingJavaScript(getLblEditDueDate());

	}

	@Override
	public void selectRecommendandWishLictItem() {
		WaitUtils.waitForDisplayed(getBtnRecommend());
		// SCHUtils.mouseHoverOnElement(getBtnRecommend());
		SCHUtils.clickUsingJavaScript(getBtnRecommend());
		// getBtnRecommend().click();
		PauseUtil.pause(5000);
		WaitUtils.waitForDisplayed(getSectionBox());
		SCHUtils.clickUsingJavaScript(getRecommendcheckBox());
		PauseUtil.pause(5000);
		SCHUtils.clickUsingJavaScript(getWishListCheckBox());
		SCHUtils.clickUsingJavaScript(getSaveforLaterCheckBox());
	}

	@Override
	public void selectViewOrderStatus() {
		WaitUtils.waitForDisplayed(getLnkView());
		getLnkView().click();
	}

	@Override
	public void verifyBouncingAlert() {
		WaitUtils.waitForDisplayed(getLblMessageBouncingAlert());
		AssertUtils.assertTextMatches(getLblMessageBouncingAlert(),
				Matchers.containsString(ConstantUtils.BOUNCING_ALERT_TEXT));
	}

	@Override
	public void closeBouncingAlert() {
		WaitUtils.waitForDisplayed(getIconCloseBouncingAlert());
		getIconCloseBouncingAlert().click();
	}

	@Override
	public void selectViewForSendLetterToParent() {
		getLnkSendLetterView().click();
	}

	@Override
	public void clickOnDownload() {
		getLnkLetterOrRemainderDownload().click();
	}

	@Override
	public void clickOnPrint() {
		getLnkLetterOrRemainderPrint().click();
	}

	@Override
	public void clickOnEmail() {
		getLnkReminderModelEmail().click();
	}

	@Override
	public void closeSendToLetterViewPopUp() {
		SCHUtils.clickUsingJavaScript(getLnkLetterOrRemainderClose());
	}

	@Override
	public void selectSendRemainderLink() {
		new TeachersDeskPage();
		PauseUtil.pause(5000);
		Actions action = new Actions(getDriver());
		action.moveToElement(getLnkSendDueDateRemainder()).clickAndHold().build()
				.perform();
		try {
			Actions actions = new Actions(getDriver());
			actions.moveToElement(getLnkSendDueDateRemainder()).build().perform();
			SCHUtils.clickUsingJavaScript(getLnkSendDueDateRemainder());
		} catch (Exception e) {
		}
		// getLnkSendDueDateRemainder().click();
	}

	@Override
	public void verifyMakeRecommendationAndWishlistSectionForNoItem() {
		AssertUtils.assertDisplayed(getLnkAddToWishList());
		AssertUtils.assertTextMatches(getLblAddToWishListHeader(), Matchers
				.containsString(ConstantUtils.TEACHER_DESK_NO_ADDTOWISHLIST_ITEM_HEADER));

		AssertUtils.assertDisplayed(getLnkMakeRecommendations());
		AssertUtils.assertTextMatches(getLblMakeRecommendationsHeader(),
				Matchers.containsString(
						ConstantUtils.TEACHER_DESK_NO_RECOMMENDATIONS_ITEM_HEADER));
		getTestBase().getContext().setProperty("testexecution.recommndation.items.count",
				0);
		getTestBase().getContext().setProperty("testexecution.wishlist.items.count", 0);
		Assert.assertFalse(SCHUtils.isPresent(getLblSaveForLaterHeader()),
				"SaveForLater Link is displayed");
		Assert.assertFalse(SCHUtils.isPresent(getLblSaveForLaterHeader()),
				"SaveForLater Header is displayed");
	}

	
}
