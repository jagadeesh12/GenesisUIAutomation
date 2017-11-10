package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;

public interface IHeaderSection {

	void clickMiniCartIcon();

	void clickOnHomeIcon();

	String getBonusPointValue();

	int getCartQuantity();

	void clickOnMenuOptions(String menuName, String menuOptions);

	void verifyHighlightedTab(Configuration configuration);

	void clickOnHomeIconRewardPage();

	void selectHomeIconFromCheckOut();

	void verifyHeaderTabs();

	void verifyFoldedTab(String tab);

	void verifyMyAccountLink();

	void verifySearchBookText();

	void verifyeBonusPointLink();

	void verifyGlobalNavigation();

	void clickOnMenuItem(String shopBookAndResources);

	void clicksOnHeaderLinkItem(String linkOrLogo);

	void verifyDifferentPage(String linksOrlogo);

	void verifyHeaderDisplyed();

	void clickOnMenu(String menuName);

	void clickOnSaveForLaterOfMyList();

	void clickOnClassRoomWishListOfMyList();

	void verifySwitchingAccountPopUp();

	void closeSwitchingAccountPopUp();
	void clickOnContinueToSwitchAccountPopup();

	void clickOnRecommendationOfMyList();

	void VerifyHeaderAndSubHeaderLinks(String menuName, String[] subHeader);

	void verifyHoverAction();

	void verifySubtabsTabsUnderEnterOrderTab(String enterorder, String sfoSubtitle);

}