package com.dw.automation.sections.impl;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.WaitUtils;

public class HeaderSection extends Section implements IHeaderSection {
	private WebElement lnkHeaderLink;

	@FindBy(locator = "dw.header.logo.scholastic")
	private WebElement logoScholastic;

	@FindBy(locator = "dw.header.logo.scholasticreadingclub")
	private WebElement logoScholasticReadingClub;

	@FindBy(locator = "dw.header.navigationmenu.lnk.menuitem")
	private WebElement lnkMenuItem;

	@FindBy(locator = "dw.header.navigationmenu.lnk.username")
	private WebElement lnkUserName;

	@FindBy(locator = "dw.header.headersearch.txt.searchbox")
	private WebElement txtSearchBox;

	@FindBy(locator = "dw.header.headersearch.btn.searchitem")
	private WebElement btnSearchItem;

	@FindBy(locator = "dw.header.headerbonus.txt.bonusvalue")
	private WebElement txtBonusValue;

	@FindBy(locator = "dw.header.headerbonus.btn.bonuspointbank")
	private WebElement btnBonusPointBank;

	@FindBy(locator = "dw.header.headercart.txt.cartquantity")
	private WebElement txtCartQuantity;

	@FindBy(locator = "dw.header.headercart.btn.shoppingcarticon")
	private WebElement btnShoppingCartIcon;

	@FindBy(locator = "dw.header.logo.bookmarkme")
	private WebElement logoBookMarkMe;

	@FindBy(locator = "dw.header.active.top.category.tab.menu")
	private WebElement tabTopCategory;

	@FindBy(locator = "dw.header.active.sub.category.tab.menu")
	private WebElement tabSubCategory;

	@FindBy(locator = "dw.header.checkout.home.section.icon.home")
	private WebElement logoHomeIcon;

	public WebElement getLogoHomeIcon() {
		return logoHomeIcon;
	}

	public void setLogoHomeIcon(WebElement logoHomeIcon) {
		this.logoHomeIcon = logoHomeIcon;
	}

	public WebElement getTabTopCategory() {
		return tabTopCategory;
	}

	public WebElement getTabSubCategory() {
		return tabSubCategory;
	}

	public WebElement getLnkHeaderLink(String headerLink) {
		lnkHeaderLink = SCHUtils.findElement("dw.header.lnk.headerlink", headerLink);
		return lnkHeaderLink;
	}

	public WebElement getLogoScholastic() {
		return logoScholastic;
	}

	public WebElement getLogoScholasticReadingClub() {
		return logoScholasticReadingClub;
	}

	public WebElement getLnkMenuItem(String menuName) {
		return SCHUtils.findElement("dw.header.navigationmenu.lnk.menuitem", menuName);
	}

	public WebElement getLnkUserName() {
		return lnkUserName;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearchItem() {
		return btnSearchItem;
	}

	public WebElement getTxtBonusValue() {
		return txtBonusValue;
	}

	public WebElement getBtnBonusPointBank() {
		return btnBonusPointBank;
	}

	public WebElement getTxtCartQuantity() {
		return txtCartQuantity;
	}

	public WebElement getBtnShoppingCartIcon() {
		return btnShoppingCartIcon;
	}

	public WebElement getLogoBookMarkMe() {
		return logoBookMarkMe;
	}

	/**
	 * This Method Click on MiniCart Icon From Global Header
	 */
	@Override
	public void clickMiniCartIcon() {
		SCHUtils.clickUsingJavaScript(getBtnShoppingCartIcon());
	}

	/**
	 * This Method Is Use For Click on HomeIcon from global header
	 */
	@Override
	public void clickOnHomeIcon() {
		SCHUtils.clickUsingJavaScript(getLogoScholasticReadingClub());
	}

	/**
	 * This Method is used to get Cart Quantity from Global Header
	 *
	 * @return
	 */
	@Override
	public int getCartQuantity() {
		return Integer.parseInt(getTxtCartQuantity().getText());
	}

	public HeaderSection(By by) {
		super(by);
	}

	/**
	 * @return {it return total bonus point value from cart}
	 */
	@Override
	public String getBonusPointValue() {
		return getTxtBonusValue().getText();
	}

	/**
	 * This Method Click On Menu Name And Then Click On Sub Menu Name According
	 * to option provide
	 * if menuOption is not provide then it clicks only menu name
	 *
	 * @param menuName
	 *            {MYACCOUNT,MyLIST,SHOPASPARENT}
	 * @param menuOptions
	 */
	@Override
	public void clickOnMenuOptions(String menuName, String menuOptions) {

	  // PauseUtil.pause(4000);
	  SCHUtils.clickUsingJavaScript(SCHUtils.waitForElementToBeClickable(getLnkMenuItem(menuName), 60));
	  // getLnkMenuItem(menuName).click();
	  if (!menuOptions.isEmpty() && menuOptions != null) {
	   WaitUtils.waitForEnabled(getLnkHeaderLink(menuOptions));
	   SCHUtils.clickUsingJavaScript(SCHUtils.waitForElementToBeClickable(getLnkHeaderLink(menuOptions), 60));
	   // getLnkHeaderLink(menuOptions).click();
	  }

	 }

	@Override
	public void verifyHighlightedTab(Configuration testData) {
		if ("SFO".equalsIgnoreCase(testData.getString("highlighted"))) {
			AssertUtils.assertTextMatches(getTabTopCategory(),
					Matchers.containsString(ConstantUtils.ENTERORDER));
			AssertUtils.assertTextMatches(getTabTopCategory(),
					Matchers.containsString(ConstantUtils.SFO_SUBTITLE));
		}
	}

	@Override
	public void selectHomeIconFromCheckOut() {
		PauseUtil.pause(2000);
		getLogoHomeIcon().click();
	}

	@Override
	public void clickOnHomeIconRewardPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyHeaderTabs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyFoldedTab(String tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyMyAccountLink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifySearchBookText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyeBonusPointLink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGlobalNavigation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickOnMenuItem(String shopBookAndResources) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clicksOnHeaderLinkItem(String linkOrLogo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyDifferentPage(String linksOrlogo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyHeaderDisplyed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickOnMenu(String menuName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickOnSaveForLaterOfMyList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickOnClassRoomWishListOfMyList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifySwitchingAccountPopUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeSwitchingAccountPopUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickOnContinueToSwitchAccountPopup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickOnRecommendationOfMyList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VerifyHeaderAndSubHeaderLinks(String menuName, String[] subHeader) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyHoverAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifySubtabsTabsUnderEnterOrderTab(String enterorder, String sfoSubtitle) {
		// TODO Auto-generated method stub
		
	}

}
