package com.dw.automation.pages.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.IYourTeacherOrderPage;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.IProductOrderTableSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.DWClient;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

public class YourTeacherOrderPage extends BaseTestPage<TestPage>
		implements
			IYourTeacherOrderPage {

	private WebElement lnkSelectGrade;

	private WebElement lnkSelectMonth;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lnk.byflyer")
	private WebElement lnkByFlyer;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lnk.byitem")
	private WebElement lnkByItem;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.selectedgrade")
	private WebElement lblSelectedGrade;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.selectedmonth")
	private WebElement lblSelectedMonth;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.expiry")
	private WebElement lblExpiry;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lnk.viewdigitalflyer")
	private WebElement lnkViewDigitalFlyer;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lnk.vieworderform")
	private WebElement lnkViewOrderForm;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.download.lnk.flyer")
	private WebElement lnkFlyer;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.download.lnk.teacherspage")
	private WebElement lnkDownloadTeachersPage;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lnk.studentonlineorder")
	private WebElement lnkStudentOnlineOrder;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.btn.save")
	private WebElement btnSave;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.btn.reviewcart")
	private WebElement btnReviewCart;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.ordersaved")
	private WebElement lblOrderSaved;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl")
	private WebElement lblYourTeacherOrder;

	@FindBy(locator = "dw.yourteacherorder.lst.firstitemadd.itemid")
	private WebElement firstItemAdd;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.title")
	private WebElement lblYTOTitle;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.txt.itemnumber")
	private WebElement lblEnterItem;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lst.gradelist")
	private List<WebElement> lstGradeList;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lst.monthlist")
	private List<WebElement> lstMonthList;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.img.crossgradeflyers")
	private List<WebElement> lstCrossGradeFlyers;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.img.loader")
	private WebElement imgLoader;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.emptyorders")
	private WebElement lblEmptyOrders;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.section.digitalflyer")
	private WebElement digitalFlyerSection;

	@FindBy(locator = "dw.teacher.home.enterorder.yourteacherorder.lbl.specialcategory")
	private WebElement lnkSpecialCategory;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.download")
	private WebElement lblDownload;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.flyerheader")
	private WebElement headerSelectedFlyer;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.section.digitalflyer.leftarrow")
	private WebElement digitalFlyerLeftArrow;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.flyerinfo.datelabel")
	private WebElement lblDate;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.topright.booktrustmessage.para")
	private WebElement bookTrustMessagePara;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.activetab")
	private WebElement YTOtabActive;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.topright.booktrustmessage.sfotablink")
	private WebElement bookTrustMessageSFOLink;
	public WebElement getYTOtabActive() {
		return YTOtabActive;
	}

	public WebElement getBookTrustMessagePara() {
		return bookTrustMessagePara;
	}

	public WebElement getBookTrustMessageSFOLink() {
		return bookTrustMessageSFOLink;
	}

	public WebElement getLblDate() {
		return lblDate;
	}

	public WebElement getDigitalFlyerLeftArrow() {
		return digitalFlyerLeftArrow;
	}

	public WebElement getDigitalFlyerRightArrow() {
		return digitalFlyerRightArrow;
	}

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.section.digitalflyer.rightarrow")
	private WebElement digitalFlyerRightArrow;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.section.digitalflyer.pagelabel")
	private WebElement lblPageName;

	public WebElement getLblPageName() {
		return lblPageName;
	}

	public WebElement getHeaderSelectedFlyer() {
		return headerSelectedFlyer;
	}

	public WebElement getLblDownload() {
		return lblDownload;
	}

	@FindBy(locator = "dw.yourteacherorder.lst.itemname")
	private List<WebElement> lstItemName;

	public WebElement getLblYourTeacherOrder() {
		return lblYourTeacherOrder;
	}

	public WebElement getLnkSpecialCategory() {
		return lnkSpecialCategory;
	}

	public WebElement getDigitalFlyerSection() {
		return digitalFlyerSection;
	}

	public WebElement getLblEmptyOrders() {
		return lblEmptyOrders;
	}

	public WebElement getLnkSelectGrade() {
		return lnkSelectGrade;
	}

	public WebElement getLnkSelectMonth() {
		return lnkSelectMonth;
	}

	public WebElement getImgLoader() {
		return imgLoader;
	}

	public List<WebElement> getLstCrossGradeFlyers() {
		return lstCrossGradeFlyers;
	}

	public void setLstCrossGradeFlyers(List<WebElement> lstCrossGradeFlyers) {
		this.lstCrossGradeFlyers = lstCrossGradeFlyers;
	}

	public WebElement getLblSeeFullDetails() {
		return lblSeeFullDetails;
	}

	public void setLblSeeFullDetails(WebElement lblSeeFullDetails) {
		this.lblSeeFullDetails = lblSeeFullDetails;
	}

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.expandedinfo.seefulldetail")
	private WebElement lblSeeFullDetails;

	public WebElement getLblYTOTitle() {
		return lblYTOTitle;
	}

	public WebElement getLblEnterItem() {
		return lblEnterItem;
	}

	public WebElement getBtnItemAdd() {
		return btnAdd;
	}

	public List<WebElement> getLstItemName() {
		return lstItemName;
	}

	public WebElement getLnkSelectGrade(String gradeName) {
		lnkSelectGrade = SCHUtils.findElement(
				"dw.teachers.home.enterorder.yourteacherorder.lnk.selectgrade",
				gradeName);
		return lnkSelectGrade;
	}

	public WebElement getLnkSelectMonth(String monthName) {
		lnkSelectMonth = SCHUtils.findElement(
				"dw.teachers.home.enterorder.yourteacherorder.lnk.selectmonth",
				monthName);
		return lnkSelectMonth;
	}

	public WebElement getLnkByFlyer() {
		return lnkByFlyer;
	}

	public WebElement getYourTeacherOrder() {
		return lblYourTeacherOrder;
	}

	public WebElement getLnkByItem() {
		return lnkByItem;
	}

	public WebElement getLblSelectedGrade() {
		return lblSelectedGrade;
	}

	public WebElement getLblSelectedMonth() {
		return lblSelectedMonth;
	}

	public WebElement getLblExpiry() {
		return lblExpiry;
	}

	public WebElement getLnkViewDigitalFlyer() {
		return lnkViewDigitalFlyer;
	}

	public WebElement getLnkViewOrderForm() {
		return lnkViewOrderForm;
	}

	public WebElement getLnkFlyer() {
		return lnkFlyer;
	}

	public WebElement getLnkDownloadTeachersPage() {
		return lnkDownloadTeachersPage;
	}

	public WebElement getLnkStudentOnlineOrder() {
		return lnkStudentOnlineOrder;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public WebElement getBtnReviewCart() {
		return btnReviewCart;
	}

	public WebElement getLblOrderSaved() {
		return lblOrderSaved;
	}

	public List<WebElement> getLstGradeList() {
		return lstGradeList;
	}

	public WebElement getFirstItemAdd() {
		return firstItemAdd;
	}

	public void setLstGradeList(List<WebElement> lstGradeList) {
		this.lstGradeList = lstGradeList;
	}

	public List<WebElement> getLstMonthList() {
		return lstMonthList;
	}

	public void setLstMonthList(List<WebElement> lstMonthList) {
		this.lstMonthList = lstMonthList;
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub

	}

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.instruction")
	private WebElement lblInstrictionNote;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.itemtext")
	private WebElement lblItemBannerText;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.btnarrow.byflyer")
	private WebElement btnArrowFlyer;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.btnarrow.byitem")
	private WebElement btnArrowItem;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.txt.itemnumber")
	private WebElement txtItemNumber;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.btn.add")
	private WebElement btnAdd;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lst.itemnumber")
	private List<WebElement> lstItemNumber;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.expandedinfo")
	private WebElement lblExpandedInfo;

	@FindBy(locator = "dw.teachers.home.enterorder.yourteacherorder.lbl.byitembluearrow")
	private WebElement lblByItemNoBlueArrow;

	@FindBy(locator = "dw.teacher.home.enterorder.yourteacherorder.images.nextarrow")
	private WebElement lnkNextImages;

	@FindBy(locator = "dw.teacher.home.enterorder.yourteacherorder.images.previousarrow")
	private WebElement lnkPrevImages;

	public WebElement getLnkPrevImages() {
		return lnkPrevImages;
	}

	public WebElement getLnkNextImages() {
		return lnkNextImages;
	}

	public WebElement getBtnArrowFlyer() {
		return btnArrowFlyer;
	}

	public WebElement getBtnArrowItem() {
		return btnArrowItem;
	}

	public WebElement getLblItemBannerText() {
		return lblItemBannerText;
	}

	public void setLblItemBannerText(WebElement lblItemBannerText) {
		this.lblItemBannerText = lblItemBannerText;
	}

	public WebElement getLblInstrictionNote() {
		return lblInstrictionNote;
	}

	public void setLblInstrictionNote(WebElement lblInstrictionNote) {
		this.lblInstrictionNote = lblInstrictionNote;
	}

	public WebElement getTxtItemNumber() {
		return txtItemNumber;
	}

	public WebElement getLblExpandedInfo() {
		return lblExpandedInfo;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public List<WebElement> getLstItemNumber() {
		return lstItemNumber;
	}

	public WebElement getLblByItemNoBlueArrow() {
		return lblByItemNoBlueArrow;
	}

	public WebElement getLnkItemId(String itemName) {

		return SCHUtils.findElement(
				"dw.teachers.home.enterorder.yourteacherorder.lnk.itemid", itemName);

	}

	@Override
	public void verifyYTOInstructionPage() {
		AssertUtils.assertTextMatches(getLblInstrictionNote(), Matchers.containsString(
				"Enter items for your classroom the usual way, BY FLYER, or the new way, BY ITEM #, using dollars or Bonus Points. You'll be asked to enter coupons at checkout."));
	}

	@Override
	public void verifyDefaultYTOPage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getLnkByFlyer());
	}

	@Override
	public void clickOnByItemLink() {
		PauseUtil.pause(4000);
		WaitUtils.waitForDisplayed(getLnkByItem());
		SCHUtils.clickUsingJavaScript(getLnkByItem());

	}

	@Override
	public void verifyItemEntryBanner() {
		AssertUtils.assertTextMatches(getLblItemBannerText(),
				Matchers.containsString("ENTER ITEM #"));
		AssertUtils.assertDisabled(getBtnAdd());

	}

	@Override
	public void verifyHighesrGradeCurrentMonthDisplay(Configuration data) {
		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);

		if (SCHUtils.isPresent(getImgLoader())) {
			WaitUtils.waitForNotDisplayed(getImgLoader());
		}

		Assert.assertTrue(
				getLblSelectedGrade().getText().toUpperCase()
						.equalsIgnoreCase(data.getString("grade")),
				"Default selected grade is not matching");
		Assert.assertTrue(
				getLblSelectedMonth().getText().equalsIgnoreCase(getCurrentMonth()),
				"Default selected month is not current month");

	}

	public static String getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat("MMMMM").format(cal.getTime());
	}

	@Override
	public void goTOYTOPage(String option) {
		Assert.assertEquals(getYourTeacherOrder().getText(), option);
		getYourTeacherOrder().click();
	}

	@Override
	public void fillYourTeacherOrder(String itemid) {

		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		String itemIdArray[] = SCHUtils.getArrayFromStringData(itemid);
		SCHUtils.scrollToView(getTxtItemNumber());
		AssertUtils.assertDisplayed(getTxtItemNumber());
		AssertUtils.assertDisplayed(getBtnAdd());
		for (String element : itemIdArray) {
			PauseUtil.waitForAjaxToComplete(2000);
			getTxtItemNumber().clear();
			getTxtItemNumber().sendKeys(element);
			getBtnAdd().click();
			PauseUtil.waitForAjaxToComplete(7000);
			SCHUtils.addYTOProductItem(
					getProductOrderTableSection().fillYTOProductBean(element));

			AssertUtils.assertTextMatches(getLstItemNumber().get(0),
					Matchers.containsString(element));
		}

	}

	@Override
	public void flyerdisable() {
		AssertUtils.assertDisplayed(getBtnArrowItem());
		AssertUtils.assertNotPresent((ExtendedElement) getBtnArrowFlyer());
	}

	@Override
	public void verifyFirstItemAdd(String itemid) {
		Assert.assertEquals(getFirstItemAdd().getText(), itemid);

	}

	@Override
	public void verifyFunctionalityOfYTO() {
		SCHUtils.waitForLoaderToDismiss();
		AssertUtils.assertDisplayed(getLstGradeList().get(0));
		AssertUtils.assertDisplayed(getLstMonthList().get(0));
		AssertUtils.assertDisplayed(getLblDownload());
		AssertUtils.assertDisplayed(getLnkFlyer());
		AssertUtils.assertDisplayed(getLnkDownloadTeachersPage());
		AssertUtils.assertDisplayed(getLnkViewDigitalFlyer());
	}

	@Override
	public void clickOnByFlyerLink() {
		getLnkByFlyer().click();
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
	}
	@Override
	public void verifyYTOPage() {
		AssertUtils.assertTextMatches(getLblYTOTitle(),
				Matchers.containsString(ConstantUtils.YTO_SUBTITLE));
	}

	@Override
	public IProductOrderSummarySection getProductOrderSummarySection() {
		return SectionFactory.getFactory().getIProductOrderSummarySection(
				LocatorUtils.getBy("dw.product.order.summary.cmp"));
	}

	@Override
	public IProductOrderTableSection getProductOrderTableSection() {
		return SectionFactory.getFactory().getIProductOrderTableSection(
				LocatorUtils.getBy("dw.product.ordertable.cmp"));
	}

	@Override
	public void selectsflyerandmonthdifferent(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(4000);
		List<WebElement> lstMonth = getLstMonthList();
		List<WebElement> lstGrade = getLstGradeList();
		if (lstMonth.get(0).equals(getLblSelectedMonth())) {
			lstMonth.get(1).click();
		} else {
			lstMonth.get(0).click();
		}
		PauseUtil.waitForAjaxToComplete(4000);
		for (int i = 0; i < lstGrade.size(); i++) {
			if (lstGrade.get(i).equals(getLblSelectedGrade())) {
				SCHUtils.clickUsingJavaScript(lstGrade.get(1));
			} else {
				SCHUtils.clickUsingJavaScript(lstGrade.get(i));
				break;
			}
		}

	}

	@Override
	public void clickCurrentMonthFlyer() {
		PauseUtil.waitForAjaxToComplete(4000);
		getLstCrossGradeFlyers().get(getLstCrossGradeFlyers().size() - 1).click();
	}

	@Override
	public void selectsflyergrade(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(4000);
		SCHUtils.waitForLoaderToDismiss();
		if (testData.getString("grade") != null) {
			getLnkSelectGrade(testData.getString("grade")).click();
		} else {
			getLnkSelectGrade(ConstantUtils.YTO_FLYER_NAME).click();
		}

	}

	@Override
	public void clickOnSave() {
		PauseUtil.waitForAjaxToComplete(2000);
		WaitUtils.waitForEnabled(getBtnSave());
		getBtnSave().click();
	}

	@Override
	public void verifySavedText() {
		WaitUtils.waitForDisplayed(getLblOrderSaved());
		AssertUtils.assertDisplayed(getLblOrderSaved());

	}

	@Override
	public void waitForLoaderToDismiss() {
		WaitUtils.waitForNotDisplayed(getImgLoader());
		PauseUtil.pause(3000);
	}

	@Override
	public void verifyItemDetails() {

		if (TestBaseProvider.getTestBase().getContext()
				.getProperty(ConstantUtils.YTO_ITEMDETAILS_CART) != null) {
			PauseUtil.waitForAjaxToComplete(2000);

			String[] text = TestBaseProvider.getTestBase().getContext()
					.getProperty(ConstantUtils.YTO_ITEMDETAILS_CART).toString()
					.split("\n");
			for (int i = 0; i < text.length - 2; i++) {

				AssertUtils.assertTextMatches(getLblExpandedInfo(),
						Matchers.containsString(text[i]));
			}

		}
	}

	@Override
	public void clickOnItem(Configuration data) {
		PauseUtil.waitForAjaxToComplete(2000);
		getLnkItemId(data.getString("YTOitemname")).click();
	}

	@Override
	public void verifyUpdatedRecordsAfterRemoval(Configuration data) {
		HashMap<String, ProductInfoBean> itemDeleted =
				SCHUtils.getYTORemovedProductItems();
		if (data.getString("itemtoberemovedid") != null) {
			String itemID = data.getString("itemtoberemovedid");
			if (!itemDeleted.containsKey(itemID)) {
				Assert.assertTrue(true, "Item is not deleted");
			}
		} else {

			HashMap<String, ProductInfoBean> productsList =
					SCHUtils.getYTORemovedProductItems();

			for (String key : productsList.keySet()) {
				ProductInfoBean details = productsList.get(key);
				AssertUtils.assertTextNotMatches(getLstItemName().get(0),
						Matchers.containsString(details.getItemTitle()));

			}
		}

	}

	@Override
	public void verifyByItemNoTabSelected() {
		verifyYTOPage();
		AssertUtils.assertDisplayed(getLblByItemNoBlueArrow());
	}

	@Override
	public void verifyItemInfoOnByFlyerAndItemPage(Configuration data) {
		PauseUtil.waitForAjaxToComplete(2000);
		getProductOrderTableSection().verifyItemAddedOnByFlyer(data);
		getLnkByItem().click();
		PauseUtil.waitForAjaxToComplete(3000);
		getProductOrderTableSection().verifyItemAddedOnByItem(data);
	}

	@Override
	public void clickOnReviewCart() {
		PauseUtil.waitForAjaxToComplete(3000);
		getBtnReviewCart().click();
	}

	@Override
	public void verifyFirstItemOfList(String itemid) {
		String[] itemId = itemid.split(",");
		getLstItemNumber().get(0).getText().contains(itemId[itemId.length - 1]);
	}

	@Override
	public void verifyQuickViewModel() {
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getLblExpandedInfo());
	}

	@Override
	public void clickOnSeeFullDetails() {
		getLblSeeFullDetails().click();
	}

	@Override
	public void verifyItemAddedByItem(Configuration data) {
		getProductOrderTableSection().verifyItemAddedOnByItem(data);
	}

	@Override
	public void editProductQuantityOnOrderTableOnYTO(Configuration testData) {
		String itemId = SCHUtils.getArrayFromStringData(testData.getString("itemid"))[0];
		String quantity = testData.getString("quantity");
		getProductOrderTableSection().updateQuantity(itemId, quantity);
	}

	@Override
	public void verifyGradeSelection(Configuration data) {

		PauseUtil.waitForAjaxToComplete(3000);
		getLnkSelectGrade(data.getString("gradetobeslected")).click();
		PauseUtil.waitForAjaxToComplete(3000);
		AssertUtils.assertAttributeMatches(getLnkSelectGrade(data.getString("grade")),
				"class", Matchers.containsString(""));
		getLnkSelectGrade(data.getString("grade")).click();

	}

	@Override
	public void verifyMonthSelection(Configuration data) {
		PauseUtil.waitForAjaxToComplete(3000);
		List<WebElement> lstMonth = getLstMonthList();
		if (data.getString("selectmonth") != null) {
			for (int i = 0; i < lstMonth.size(); i++) {
				if (lstMonth.get(i).getText()
						.equalsIgnoreCase(data.getString("selectmonth"))) {
					lstMonth.get(i).click();
					break;
				}
			}
		} else {
			if (lstMonth.get(0).equals(getLblSelectedMonth())) {
				lstMonth.get(1).click();
				AssertUtils.assertAttributeMatches(getLblSelectedMonth(), "class",
						Matchers.containsString(""));
			} else {
				lstMonth.get(0).click();
			}
		}

	}

	@Override
	public void verifyCurrentAndPreviousMonthSelection(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(3000);
		AssertUtils.assertDisplayed(getLstCrossGradeFlyers().get(0));
		List<WebElement> lstMonth = getLstMonthList();
		for (int i = 0; i < lstMonth.size(); i++) {
			if (!(lstMonth.get(0).equals(getLblSelectedMonth()))
					&& lstMonth.get(i).equals(getLblSelectedMonth())) {
				lstMonth.get(i - 1).click();
			} else if (lstMonth.get(0).equals(getLblSelectedMonth())) {
				lstMonth.get(1).click();
			}
		}
		AssertUtils.assertDisplayed(getLstCrossGradeFlyers().get(0));
	}

	@Override
	public void verifyFlyerNavigation(Configuration testData) {
		List<WebElement> lstFlyers = getLstCrossGradeFlyers();
		if (lstFlyers != null && lstFlyers.size() > 0) {
			for (int i = 0; i < lstFlyers.size(); i++) {
				WaitUtils.waitForNotDisplayed(getImgLoader());
				WaitUtils.waitForDisplayed(lstFlyers.get(i));
				AssertUtils.assertDisplayed(lstFlyers.get(i));
				lstFlyers.get(i).click();
				// Checking for only first 5 flyers because there is no
				// differentiation between flyers on screen and flyers which
				// needs to be scrolled to view
				if (i == 5) {
					break;
				}
			}
		}
	}

	@Override
	public void PurchaseItemWithBonusPoint() {
		getProductOrderTableSection().addNegativeBonusItemToCart();
	}

	@Override
	public void verifyBonusAndEarnedPointsCalculations(String bonusPt) {
		PauseUtil.waitForAjaxToComplete(5000);
		int bonusPoints = Integer.parseInt(bonusPt);
		getProductOrderSummarySection().verifySumOfEarnedAndBonusPoints(bonusPoints);
	}

	@Override
	public void verifyMonthFlyerFunctionality() {
		PauseUtil.waitForAjaxToComplete(5000);
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM");
		String currentMonth = simpleDateFormat.format(date);
		if (SCHUtils.isPresent(getLnkSelectMonth(currentMonth))) {
			AssertUtils.assertDisplayed(getLnkSelectMonth(currentMonth));
		} else {
			cal.roll(Calendar.MONTH, -1);
			date = cal.getTime();
			if (SCHUtils.isPresent(getLnkSelectMonth(simpleDateFormat.format(date)))) {
				AssertUtils.assertDisplayed(
						getLnkSelectMonth(simpleDateFormat.format(date)));
			} else {
				cal.roll(Calendar.MONTH, 2);
				date = cal.getTime();
				if (SCHUtils
						.isPresent(getLnkSelectMonth(simpleDateFormat.format(date)))) {
					AssertUtils.assertDisplayed(
							getLnkSelectMonth(simpleDateFormat.format(date)));
				}
			}
		}
	}

	@Override
	public void verifyDownloadLinks() {
		AssertUtils.assertDisplayed(getLnkFlyer());
		AssertUtils.assertDisplayed(getLnkDownloadTeachersPage());
	}

	@Override
	public void clickOnDigitalFlyer() {
		PauseUtil.pause(4000);
		if (SCHUtils.isPresent(getImgLoader())) {
			WaitUtils.waitForNotDisplayed(getImgLoader());
		}
		getLnkViewDigitalFlyer().click();
		PauseUtil.pause(5000);
	}

	@Override
	public void selectsViewOrderForm() {
		if (SCHUtils.isPresent(getImgLoader())) {
			WaitUtils.waitForNotDisplayed(getImgLoader());
		}
		getLnkViewOrderForm().click();
		PauseUtil.pause(5000);
	}

	@Override
	public void clickPriviousMonthFlyer() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(10000);
		if (SCHUtils.isPresent(getLblEmptyOrders())) {
			PauseUtil.waitForAjaxToComplete(4000);
			try {
				System.out.println("click previous month flyer");
				getLstCrossGradeFlyers().get(getLstCrossGradeFlyers().size() - 1).click();
			} catch (Exception e) {
				System.out.println("catch--- previous month flyer");
				// TODO: handle exception
			}

		}

	}

	@Override
	public void verifyDigitalFlyer() {
		PauseUtil.pause(3000);
		SCHUtils.waitForLoaderToDismiss();
		WaitUtils.waitForDisplayed(getDigitalFlyerSection());
		AssertUtils.assertDisplayed(getDigitalFlyerSection());
		AssertUtils.assertDisplayed(getLnkViewOrderForm());
		AssertUtils.assertDisplayed(getLblInstrictionNote());
		AssertUtils.assertTextMatches(getLblInstrictionNote(),
				Matchers.containsString(ConstantUtils.YTO_INSTRUCTION_TEXT));
		PauseUtil.pause(2000);
	}

	@Override
	public void verifyOrderFormView() {
		if (SCHUtils.isPresent(getImgLoader())) {
			WaitUtils.waitForNotDisplayed(getImgLoader());
		}
		getProductOrderTableSection().verifyFlyerItemAllHeaders();
		AssertUtils.assertDisplayed(getLnkViewDigitalFlyer());
		AssertUtils.assertDisplayed(getLblInstrictionNote());
		AssertUtils.assertTextMatches(getLblInstrictionNote(),
				Matchers.containsString(ConstantUtils.YTO_INSTRUCTION_TEXT));

	}

	@Override
	public void clickOnSpecialCategoryTab() {
		if (SCHUtils.isPresent(getImgLoader())) {
			WaitUtils.waitForNotDisplayed(getImgLoader());
		}
		AssertUtils.assertDisplayed(getLnkSpecialCategory());
		getLnkSpecialCategory().click();
	}

	@Override
	public void verifyDefaultFlyerDigitalVersion(Configuration data) {

		/*
		 * There are 3 iFrame in Digital Flyer Section
		 * iFrame 1 - This is main iframe in which whole digital section is
		 * displayed
		 * iFrame 2 - This iFrame contains header,footer and menu icon
		 * iFrame 3 - It contains right submenu , flyer name ,list of flyer
		 * images
		 * flyer
		 */
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		// Switch to mainIFrame
		WebDriver mainFrame = getDriver().switchTo().frame("mainFrame");
		WebDriver subFrame1 = null;
		// Switch to subIFrame-1
		if (!getTestBase().getContext().getString("driver.name")
				.equalsIgnoreCase("IOs")) {
			subFrame1 = mainFrame.switchTo().frame(0);
		}

		// Digital flyer section takes more time to load its contains
		PauseUtil.pause(4000);
		WebDriverWait wait = new WebDriverWait(getDriver(), 6000);
		SCHUtils.waitForLoaderToDismiss();

		// wait for header
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav")));
		if (getTestBase().getContext().getString("driver.name").equals("Chrome")) {
			SCHUtils.mouseHoverOnElement(getDriver().findElement(By.id("nav")));
			SCHUtils.clickUsingJavaScript(getDriver().findElement(By.id("nav")));
			WebElement menu = getDriver().findElement(By.cssSelector(".desktop"));
			// Header section is diplayed after hover
			SCHUtils.mouseHoverOnElement(menu);
			SCHUtils.clickUsingJavaScript(menu);
		} else {
			System.out.println("in other....");
			SCHUtils.scrollToView(getDriver().findElement(By.id("nav")));
			// SCHUtils.mouseHoverOnElement(getDriver().findElement(By.id("nav")));
			// SCHUtils.clickUsingJavaScript(getDriver().findElement(By.id("nav")));
			WebElement menu = getDriver().findElement(By.cssSelector(".desktop"));
			// Header section is diplayed after hover
			// SCHUtils.mouseHoverOnElement(menu);
			menu.click();
		}

		// get Flyer month from header
		WebElement title = getDriver().findElement(By.cssSelector("#issuenameLabel"));
		WaitUtils.waitForDisplayed(title);
		AssertUtils.assertDisplayed(title);
		System.out.println("Flyer Month->" + title.getText());

		// If you need to verify selected grade other than default then add
		// condition for that in this code

		// Verify selected month as current month
		AssertUtils.assertTextMatches(title, Matchers.containsString(getCurrentMonth()));

		// click on menu header and switch to inner iFrame
		WebElement menuIcon = getDriver().findElement(By.cssSelector(".menu #navBtn"));
		menuIcon.click();
		subFrame1.switchTo().frame(0);

		// get flyer Title
		WebElement digitalTitle =
				getDriver().findElement(By.cssSelector(".publicationName"));
		WaitUtils.waitForDisplayed(digitalTitle);
		System.out.println("Digital flyer title->" + digitalTitle.getText());
		// Verify teacher's default grade
		AssertUtils.assertTextMatches(digitalTitle,
				Matchers.equalToIgnoringCase(data.getString("grade")));

		// close right submenu

		WebElement closeMenu =
				getDriver().findElement(By.cssSelector("#closeNavMenuPopin"));
		WaitUtils.waitForDisplayed(closeMenu);
		closeMenu.click();
		PauseUtil.pause(6000);
		getDriver().switchTo().defaultContent();
	}

	@Override
	public void hoverOnDigitalFlyerAndClick() {
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		PauseUtil.pause(4000);
		// Switch to mainIFrame
		WebDriver mainFrame = getDriver().switchTo().frame("mainFrame");

		// Switch to subIFrame-1
		WebDriver subFrame1 = mainFrame.switchTo().frame(0);

		// Digital flyer section takes more time to load its contains
		PauseUtil.pause(4000);
		WebDriverWait wait = new WebDriverWait(getDriver(), 6000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav")));
		SCHUtils.waitForLoaderToDismiss();

		subFrame1.switchTo().frame(0);
		PauseUtil.pause(6000);
		// click on image section to get product details page of digital flyer
		WebElement images = getDriver().findElement(By.cssSelector("#magviewer"));
		WaitUtils.waitForDisplayed(images);
		images.click();
		PauseUtil.pause(3000);
		getDriver().switchTo().defaultContent();

	}

	@Override
	public void verifyOrderFormForSelectedGrade(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(4000);

		if (testData.getString("grade") != null) {
			Assert.assertTrue(
					getHeaderSelectedFlyer().getText().toLowerCase()
							.contains(testData.getString("grade").toLowerCase()),
					"Grade Flyer is not displayed ");
		} else {
			Assert.assertTrue(
					getHeaderSelectedFlyer().getText().toLowerCase()
							.contains(ConstantUtils.YTO_FLYER_NAME.toLowerCase()),
					"Grade Flyer is not displayed ");
		}
	}

	@Override
	public void verifySelectedGradeAndCurrentMonth(Configuration testData) {
		if (testData.getString("grade") != null) {
			Assert.assertTrue(
					getLblSelectedGrade().getText().toUpperCase()
							.equalsIgnoreCase(testData.getString("grade")),
					"Default selected grade is not matching");
		} else {
			Assert.assertTrue(
					getLblSelectedGrade().getText().toUpperCase()
							.equalsIgnoreCase(ConstantUtils.YTO_FLYER_NAME),
					"Default selected grade is not matching");
		}
		Assert.assertTrue(
				getLblSelectedMonth().getText().equalsIgnoreCase(getCurrentMonth()),
				"Default selected month is not current month");
	}

	@Override
	public void clickOnTeacherPageLink() {
		getLnkDownloadTeachersPage().click();
	}

	@Override
	public void verifyNewWindowWithPDF() {
		String parentHandle = getDriver().getWindowHandle();
		PauseUtil.pause(8000);
		for (String winHandle : getDriver().getWindowHandles()) {
			System.out.println(winHandle);
			getDriver().switchTo().window(winHandle);
		}
		Assert.assertTrue(getDriver().getCurrentUrl().contains(".pdf"));
		getDriver().switchTo().window(parentHandle);

	}

	@Override
	public void verifyItemtoPdp() {
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		System.out.println("element is visible" + getLstItemNumber().get(2).isEnabled());
		SCHUtils.clickUsingJavaScript(getLstItemNumber().get(2));
	}

	@Override
	public void verifymultipleFlyerItemOnPDP() {
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		System.out.println("element is visible" + getLstItemNumber().get(21).isEnabled());
		SCHUtils.clickUsingJavaScript(getLstItemNumber().get(21));
	}

	@Override
	public void clickOnDownloadFlyerLink() {
		PauseUtil.pause(2000);
		getLnkFlyer().click();
	}

	@Override
	public void verifyPaginationArrowsNavigation() {
		SCHUtils.waitForLoaderToDismiss();

		// Switch to mainIFrame
		WebDriver mainFrame = getDriver().switchTo().frame("mainFrame");

		// Switch to subIFrame-1
		// WebDriver subFrame1 = mainFrame.switchTo().frame(0);

		// Digital flyer section takes more time to load its contains
		PauseUtil.pause(4000);
		WebDriverWait wait = new WebDriverWait(getDriver(), 6000);
		SCHUtils.waitForLoaderToDismiss();

		// wait for header
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav")));
		SCHUtils.mouseHoverOnElement(getDriver().findElement(By.id("nav")));
		WebElement menu = getDriver().findElement(By.cssSelector(".desktop"));
		// Header section is diplayed after hover
		SCHUtils.mouseHoverOnElement(menu);
		SCHUtils.clickUsingJavaScript(menu);

		PauseUtil.pause(5000);
		SCHUtils.clickUsingJavaScript(getDigitalFlyerRightArrow());
		String str = getLblPageName().getText();
		SCHUtils.clickUsingJavaScript(getDigitalFlyerRightArrow());
		String str2 = getLblPageName().getText();
		Assert.assertFalse(str.equals(str2));
	}

	@Override
	public void verifyQuickLookModelNotDisplayed() {
		Assert.assertFalse(SCHUtils.isPresent(getLblExpandedInfo()));
	}

	@Override
	public void verifyYTOUI() {
		AssertUtils.assertDisplayed(getLnkByFlyer());
		AssertUtils.assertDisplayed(getLnkByItem());
		AssertUtils.assertDisplayed(getLblDate());
		String[] grades = {"Early Childhood", "Kindergarteners", "1st Graders",
				"2nd Graders", "3rd Graders", "4th Graders", "5th Graders",
				"6th Graders & Up", "Special Collections"};
		List lstNew = Arrays.asList(grades);
		List old = new ArrayList<>();
		for (int i = 0; i < getLstGradeList().size(); i++) {
			WebElement element = getLstGradeList().get(i);
			old.add(element.getText());
		}
		Assert.assertTrue(lstNew.equals(old));
		AssertUtils.assertDisplayed(getLnkByFlyer());

	}

	@Override
	public void verifyMonthCount() {
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		PauseUtil.pause(8000);
		if (getLstCrossGradeFlyers().size() > 8) {
			AssertUtils.assertDisplayed(getLnkNextImages());
		} else {
			AssertUtils.assertNotDisplayed(getLnkNextImages());
		}
		/*
		 * // getLnkSelectMonth("January")
		 * AssertUtils.assertNotDisplayed(getDriver().findElement(
		 * By.xpath("//ul[@id='grade-month-nav']//a[text()='January']")));
		 */
	}

	@Override
	public void verifyPrevNextArrow() {
		Assert.assertTrue(getLnkPrevImages().getAttribute("class").contains("inactive"),
				"Previouse Link is in inActive state");
		getLnkNextImages().click();
		PauseUtil.pause(4000);
		AssertUtils.assertDisplayed(getLnkPrevImages());
		getLnkPrevImages().click();
		if (getLstCrossGradeFlyers().size() > 8) {
			for (int i = 0; i < getLstCrossGradeFlyers().size() - 9; i++)
				getLnkNextImages().click();
		}
	}
	@Override
	public void verifyExpiryAndDiffrentMonth() {
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		List<WebElement> lstMonth = getLstMonthList();
		getLstMonthList().get(0).click();
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		AssertUtils.assertDisplayed(getLblExpiry());
		getLstMonthList().get(1).click();
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		AssertUtils.assertDisplayed(getLblExpiry());
	}
	@Override
	public void verifyBookTrustMessage() {
		AssertUtils.assertDisplayed(getBookTrustMessagePara());
		AssertUtils.assertDisplayed(getBookTrustMessageSFOLink());
		AssertUtils.assertTextMatches(getBookTrustMessagePara(), Matchers.containsString(
				"Book Trust Teachers: You must enter student orders on the"));
		AssertUtils.assertTextMatches(getBookTrustMessageSFOLink(),
				Matchers.containsString("Student Flyer Orders tab"));
	}

	@Override
	public void verifyBrowserCompatibilityContentAsset() {
		System.out
				.println(
						"Get Text" + getDriver()
								.findElement(By.cssSelector(
										".label.digimagcontent .content-asset"))
								.getText());
		System.out.println("Assets :"
				+ DWClient.getAssetAttribute("digimag-browser-message", "c_body"));
		AssertUtils.assertTextMatches(
				getDriver().findElement(
						By.cssSelector(".label.digimagcontent .content-asset")),
				Matchers.containsString(
						DWClient.getAssetAttribute("digimag-browser-message", "c_body")));

	}

	@Override
	public void verifyActiveOrInActiveFlyer() {
		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.WaitForAjax();
		SCHUtils.mouseHoverOnElement(getLstCrossGradeFlyers().get(0));
		AssertUtils.assertAttributeMatches(getDriver()
				.findElements(By.cssSelector("#grade-month-flyer-nav .flyer-item"))
				.get(0), "class", Matchers.containsString("active"));
	}
	@Override
	public void verifyYTOtabActive() {
		AssertUtils.assertAttributeMatches(getYTOtabActive(), "class",
				Matchers.containsString("active"));
	}

	@Override
	public void verifyYTOtabInActive() {
		AssertUtils.assertAttributeNotMatches(getYTOtabActive(), "class",
				Matchers.containsString("active"));
	}
}
