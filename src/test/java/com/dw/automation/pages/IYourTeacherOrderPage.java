package com.dw.automation.pages;

import org.apache.commons.configuration.Configuration;

import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.IProductOrderTableSection;

public interface IYourTeacherOrderPage {
	IProductOrderSummarySection getProductOrderSummarySection();

	IProductOrderTableSection getProductOrderTableSection();

	void fillYourTeacherOrder(String itemid);

	void verifyYTOInstructionPage();

	void goTOYTOPage(String option);

	void verifyDefaultYTOPage();

	void flyerdisable();

	void verifyItemEntryBanner();

	void clickOnByItemLink();

	void verifyHighesrGradeCurrentMonthDisplay(Configuration configuration);

	void verifyFunctionalityOfYTO();

	void clickOnByFlyerLink();

	void verifyYTOPage();

	void selectsflyerandmonthdifferent(Configuration testData);

	void clickOnSave();

	void verifySavedText();

	void verifyItemDetails();

	void clickOnItem(Configuration data);

	void verifyUpdatedRecordsAfterRemoval(Configuration testData);

	void verifyByItemNoTabSelected();

	void verifyItemInfoOnByFlyerAndItemPage(Configuration data);

	void clickOnReviewCart();

	void verifyFirstItemAdd(String itemid);

	void verifyFirstItemOfList(String itemid);

	void verifyQuickViewModel();

	void clickOnSeeFullDetails();

	void verifyItemAddedByItem(Configuration data);

	void editProductQuantityOnOrderTableOnYTO(Configuration testData);

	void verifyGradeSelection(Configuration data);

	void verifyMonthSelection(Configuration testData);

	void verifyCurrentAndPreviousMonthSelection(Configuration testData);

	void verifyFlyerNavigation(Configuration testData);

	void PurchaseItemWithBonusPoint();

	void verifyBonusAndEarnedPointsCalculations(String bonuspts);

	void verifyMonthFlyerFunctionality();

	void verifyDownloadLinks();

	void clickOnDigitalFlyer();

	void selectsViewOrderForm();

	void selectsflyergrade(Configuration testData);

	void clickCurrentMonthFlyer();

	void clickPriviousMonthFlyer();

	void verifyDigitalFlyer();

	void verifyOrderFormView();

	void clickOnSpecialCategoryTab();

	void verifyDefaultFlyerDigitalVersion(Configuration data);

	void hoverOnDigitalFlyerAndClick();

	void waitForLoaderToDismiss();

	void verifyOrderFormForSelectedGrade(Configuration testData);

	void verifySelectedGradeAndCurrentMonth(Configuration testData);

	void clickOnTeacherPageLink();

	void verifyNewWindowWithPDF();

	void verifyItemtoPdp();

	void clickOnDownloadFlyerLink();

	void verifyPaginationArrowsNavigation();

	void verifyQuickLookModelNotDisplayed();

	void verifymultipleFlyerItemOnPDP();

	void verifyYTOUI();

	void verifyBookTrustMessage();

	void verifyYTOtabActive();

	void verifyYTOtabInActive();

	void verifyMonthCount();

	void verifyPrevNextArrow();

	void verifyExpiryAndDiffrentMonth();

	void verifyBrowserCompatibilityContentAsset();

	void verifyActiveOrInActiveFlyer();
}