package com.dw.automation.sections.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.sections.IAddToWishListSection;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.Section;

public class AddToWishListSection extends Section implements IAddToWishListSection {

	@FindBy(locator = "dw.product.addtowishlist.lbl.title")
	private WebElement lblAddToWishListTitle;

	@FindBy(locator = "dw.product.addtowishlist.recommendations.chk.students")
	private WebElement chkRecommendationsStudents;

	@FindBy(locator = "dw.product.addtowishlist.recommendations.chk.classroomwishlist")
	private WebElement chkRecommendationsClassRoomWishList;

	@FindBy(locator = "dw.product.addtowishlist.recommendations.chk.saveforlater")
	private WebElement chkRecommendationsSaveForLater;

	@FindBy(locator = "dw.product.addtowishlist.recommendations.txt.students")
	private WebElement txtRecommendationsStudents;

	@FindBy(locator = "dw.product.addtowishlist.recommendations.lnk.close")
	private WebElement lnkRecommendationsClose;

	public WebElement getLblAddToWishListTitle() {
		return lblAddToWishListTitle;
	}

	public WebElement getChkRecommendationsStudents() {
		return chkRecommendationsStudents;
	}

	public WebElement getChkRecommendationsClassRoomWishList() {
		return chkRecommendationsClassRoomWishList;
	}

	public WebElement getChkRecommendationsSaveForLater() {
		return chkRecommendationsSaveForLater;
	}

	public WebElement getTxtRecommendationsStudents() {
		return txtRecommendationsStudents;
	}

	public WebElement getLnkRecommendationsClose() {
		return lnkRecommendationsClose;
	}

	public AddToWishListSection(By by) {
		super(by);
	}

	@Override
	public void clickOnRecommendation(String option) {
		if ((option.equalsIgnoreCase("selects")
				&& !getChkRecommendationsStudents().isSelected())
				|| (option.equalsIgnoreCase("deselects")
						&& getChkRecommendationsStudents().isSelected())) {
			SCHUtils.clickUsingJavaScript(getChkRecommendationsStudents());
		}
		// getChkRecommendationsStudents().click();
	}

	@Override
	public void clickOnCloseBtn() {
		// if (SCHUtils.isPresent(getLnkRecommendationsClose())) {
		SCHUtils.clickUsingJavaScript(getLnkRecommendationsClose());
		// getLnkRecommendationsClose().click();
		// }
	}

	@Override
	public void clickOnWishList(String option) {
		if ((option.equalsIgnoreCase("selects")
				&& !getChkRecommendationsClassRoomWishList().isSelected())
				|| (option.equalsIgnoreCase("deselects")
						&& getChkRecommendationsClassRoomWishList().isSelected())) {
			SCHUtils.clickUsingJavaScript(getChkRecommendationsClassRoomWishList());
		}
		// getChkRecommendationsClassRoomWishList().click();
	}
}
