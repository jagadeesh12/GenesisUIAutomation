package com.dw.automation.sections.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.sections.IFooterSection;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.Section;

public class FooterSection extends Section implements IFooterSection {

	@FindBy(locator = "dw.footer.forteachers.lnk.footeritem")
	private WebElement lnkForTeachersFooterItem;

	@FindBy(locator = "dw.footer.contactus.lst.skypelinks")
	private List<WebElement> lstContactUsSkypelinks;

	@FindBy(locator = "dw.footer.contactus.lnk.scholasticmailaddress")
	private WebElement lnkContactUsScholasticEmailAddress;

	@FindBy(locator = "dw.footer.contactus.lbl.contacttimetext")
	private WebElement lblContactUsContactTimeText;

	@FindBy(locator = "dw.footer.followus.lnk.facebookicon")
	private WebElement lnkFollowUsFacebookIcon;

	@FindBy(locator = "dw.footer.followus.lnk.twittericon")
	private WebElement lnkFollowUsTwitterIcon;

	@FindBy(locator = "dw.footer.followus.lnk.tumblricon")
	private WebElement lnkFollowUsTumblrIcon;

	@FindBy(locator = "dw.footer.followus.lnk.googleplusicon")
	private WebElement lnkFollowUsGooglePlusIcon;

	@FindBy(locator = "dw.footer.followus.lnk.pinteresticon")
	private WebElement lnkFollowUsIcon;

	@FindBy(locator = "dw.footer.followus.lnk.instagramicon")
	private WebElement lnkFollowUsInstagramIcon;

	@FindBy(locator = "dw.footer.followus.lnk.bookbox")
	private WebElement lnkFollowUsBookBox;

	private WebElement lnkContestAndProgramFooterItem;
	private WebElement lnkAccoutInformationFooterItem;
	private WebElement lnkFooterHeading;

	public WebElement getLnkFooterHeading(String link) {
		lnkFooterHeading = SCHUtils.findElement("dw.footer.lnk.footerheading", link);
		return lnkFooterHeading;
	}

	public WebElement getLnkForTeachersFooterItem() {
		return lnkForTeachersFooterItem;
	}

	public WebElement getLnkContestAndProgramFooterItem(String link) {

		lnkContestAndProgramFooterItem =
				SCHUtils.findElement("lnkContestAndProgramFooterItem", link);
		return lnkContestAndProgramFooterItem;
	}

	public WebElement getLnkAccoutInformationFooterItem(String link) {
		lnkAccoutInformationFooterItem =
				SCHUtils.findElement("dw.footer.accountinformation.lnk.footeritem", link);
		return lnkAccoutInformationFooterItem;
	}

	public List<WebElement> getLstContactUsSkypelinks() {
		return lstContactUsSkypelinks;
	}

	public WebElement getLnkContactUsScholasticEmailAddress() {
		return lnkContactUsScholasticEmailAddress;
	}

	public WebElement getLblContactUsContactTimeText() {
		return lblContactUsContactTimeText;
	}

	public WebElement getLnkFollowUsFacebookIcon() {
		return lnkFollowUsFacebookIcon;
	}

	public WebElement getLnkFollowUsTwitterIcon() {
		return lnkFollowUsTwitterIcon;
	}

	public WebElement getLnkFollowUsTumblrIcon() {
		return lnkFollowUsTumblrIcon;
	}

	public WebElement getLnkFollowUsGooglePlusIcon() {
		return lnkFollowUsGooglePlusIcon;
	}

	public WebElement getLnkFollowUsIcon() {
		return lnkFollowUsIcon;
	}

	public WebElement getLnkFollowUsInstagramIcon() {
		return lnkFollowUsInstagramIcon;
	}

	public WebElement getLnkFollowUsBookBox() {
		return lnkFollowUsBookBox;
	}

	public FooterSection(By by) {
		super(by);
	}

}
