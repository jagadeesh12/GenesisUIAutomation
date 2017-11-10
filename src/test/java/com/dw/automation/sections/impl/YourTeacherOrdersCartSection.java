package com.dw.automation.sections.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.impl.CartPage;
import com.dw.automation.sections.IYourTeacherOrdersCartSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

public class YourTeacherOrdersCartSection extends Section
		implements
			IYourTeacherOrdersCartSection {
	@FindBy(locator = "dw.yourteacherorder.lst.itemid")
	private List<WebElement> lstItemId;

	@FindBy(locator = "dw.yourteacherorder.lst.itemname")
	private List<WebElement> lstItemName;

	private WebElement lblItemId;

	private WebElement lblItemName;

	private WebElement lblFlyer;

	private WebElement lblItemPrice;

	private WebElement txtItemQuantity;

	private WebElement lblBonusPoint;

	private WebElement txtBonusQuantity;

	private WebElement imgRemoveIcon;

	@FindBy(locator = "dw.yourteacherorder.section.yourteacherorder")
	private WebElement yourTeacherOrderSection;

	@FindBy(locator = "dw.yourteacherorder.lbl.expandedinfo")
	private WebElement lblExpandedInfo;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.itemid")
	private WebElement lblHeaderItemId;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.title")
	private WebElement lblHeaderTitle;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.flyer")
	private WebElement lblHeaderFlyer;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.price")
	private WebElement lblHeaderPrice;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.bonuspoint")
	private WebElement lblHeaderBonusPoint;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.bonuspointquantity")
	private WebElement lblHeaderBonusPointQuantity;

	@FindBy(locator = "dw.yourteacherorder.lbl.totalprice")
	private WebElement lblTotalPrice;

	@FindBy(locator = "dw.yourteacherorder.lbl.totalquantity")
	private WebElement lblTotalQuantity;

	@FindBy(locator = "dw.yourteacherorder.lbl.totalbonuspoints")
	private WebElement lblTotalBonusPoints;

	@FindBy(locator = "dw.yourteacherorder.lbl.totalbonusquantity")
	private WebElement lblTotalBonusPointsQuantity;

	@FindBy(locator = "dw.yourteacherorder.header.lbl.itemquantity")
	private WebElement lblHeaderQuantity;

	@FindBy(locator = "dw.yourteacherorder.btn.minus")
	private WebElement btnMinus;

	@FindBy(locator = "dw.reviewcart.yto.img.remove")
	private WebElement imgFirstRemoveIcon;

	@FindBy(locator = "dw.reviewcart.remove.btn.yes")
	private WebElement btnRemoveYes;

	@FindBy(locator = "dw.reviewcart.remove.btn.no")
	private WebElement btnRemoveNo;

	@FindBy(locator = "dw.yourteacherorder.lst.removeicon")
	private List<WebElement> lstRemoveIcon;

	public WebElement getBtnRemoveNo() {
		return btnRemoveNo;
	}

	public List<WebElement> getLstRemoveIcon() {
		return lstRemoveIcon;
	}

	public List<WebElement> getLstItemId() {
		return lstItemId;
	}

	public List<WebElement> getLstItemName() {
		return lstItemName;
	}

	public WebElement getLblHeaderItemId() {
		return lblHeaderItemId;
	}

	public WebElement getLblHeaderTitle() {
		return lblHeaderTitle;
	}

	public WebElement getLblHeaderFlyer() {
		return lblHeaderFlyer;
	}

	public WebElement getLblHeaderPrice() {
		return lblHeaderPrice;
	}

	public WebElement getLblHeaderBonusPoint() {
		return lblHeaderBonusPoint;
	}

	public WebElement getLblHeaderBonusPointQuantity() {
		return lblHeaderBonusPointQuantity;
	}

	public WebElement getLblTotalPrice() {
		return lblTotalPrice;
	}

	public WebElement getLblTotalQuantity() {
		return lblTotalQuantity;
	}

	public WebElement getLblTotalBonusPoints() {
		return lblTotalBonusPoints;
	}

	public WebElement getLblTotalBonusPointsQuantity() {
		return lblTotalBonusPointsQuantity;
	}

	public WebElement getLblHeaderQuantity() {
		return lblHeaderQuantity;
	}

	public WebElement getLblItemId(String itemName) {
		lblItemId = SCHUtils.findElement("dw.yourteacherorder.lbl.itemid", itemName);
		return lblItemId;
	}

	public WebElement getLblItemName(String itemId) {
		lblItemName = SCHUtils.findElement("dw.yourteacherorder.lbl.itemname", itemId);
		return lblItemName;
	}

	public WebElement getLblFlyer(String itemId) {
		lblFlyer = SCHUtils.findElement("dw.yourteacherorder.lbl.flyer", itemId);
		return lblFlyer;
	}

	public WebElement getLblItemPrice(String itemId) {
		lblItemPrice = SCHUtils.findElement("dw.yourteacherorder.lbl.itemprice", itemId);
		return lblItemPrice;
	}

	public WebElement getTxtItemQuantity(String itemId) {
		txtItemQuantity =
				SCHUtils.findElement("dw.yourteacherorder.txt.itemquantity", itemId);
		return txtItemQuantity;
	}

	public WebElement getLblBonusPoint(String itemId) {
		lblBonusPoint =
				SCHUtils.findElement("dw.yourteacherorder.lbl.bonuspoint", itemId);
		return lblBonusPoint;
	}

	public WebElement getTxtBonusQuantity(String itemId) {
		txtBonusQuantity =
				SCHUtils.findElement("dw.yourteacherorder.txt.bonusquantity", itemId);
		return txtBonusQuantity;
	}

	public WebElement getImgRemoveIcon(String itemId) {
		imgRemoveIcon =
				SCHUtils.findElement("dw.yourteacherorder.img.removeicon", itemId);
		return imgRemoveIcon;
	}

	public WebElement getYourTeacherOrderSection() {
		return yourTeacherOrderSection;
	}

	public WebElement getLblExpandedInfo() {
		return lblExpandedInfo;
	}

	public YourTeacherOrdersCartSection(By by) {
		super(by);
	}

	public YourTeacherOrdersCartSection(String locator) {
		super(LocatorUtils.getBy(locator));
	}

	public WebElement getBtnMinus() {
		return btnMinus;
	}

	public WebElement getLblItemQuantity(String itemid) {
		return SCHUtils.findElement("dw.yourteacherorder.lbl.itemquantity", itemid);
	}

	@Override
	public void clickOnYTOItem(Configuration data) {
		if (data.getString("YTOitemname") != null) {
			getLblItemId(data.getString("YTOitemname")).click();
		} else {
			getLstItemName().get(0).click();
		}

		String itemDetails = getLblExpandedInfo().getText();
		AssertUtils.assertDisplayed(getLblExpandedInfo());
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.YTO_ITEMDETAILS_CART, itemDetails);

	}

	@Override
	public void verifyYTOHeader() {
		AssertUtils.assertDisplayed(getLblHeaderItemId());
		AssertUtils.assertDisplayed(getLblHeaderTitle());
		AssertUtils.assertDisplayed(getLblHeaderFlyer());
		AssertUtils.assertDisplayed(getLblHeaderPrice());
		AssertUtils.assertDisplayed(getLblHeaderQuantity());
		AssertUtils.assertDisplayed(getLblHeaderBonusPoint());
		AssertUtils.assertDisplayed(getLblHeaderBonusPointQuantity());
		AssertUtils.assertDisplayed(getBtnMinus());

	}

	@Override
	public void verifyYTOFunctionalities() {
		CartPage cartPage = new CartPage();
		AssertUtils.assertDisplayed(cartPage.getBtnYourTeacherOrderAdd());
		verifyYTOHeader();
		Assert.assertEquals(getLstItemName().size() > 0, true);
		verifyYTOTotal();

	}

	public void verifyYTOTotal() {
		Double totalprice = 0.0, price = 0.0;
		int totalquantity = 0;
		List<WebElement> studentNames = getLstItemId();
		for (int i = 0; i < studentNames.size(); i++) {
			price = SCHUtils.getPriceWithOutCurrency(
					getLblItemPrice(studentNames.get(i).getText()).getText());
			totalprice += price
					* Integer.parseInt(getTxtItemQuantity(studentNames.get(i).getText())
							.getAttribute("value"));
			totalquantity +=
					Integer.parseInt(getTxtItemQuantity(studentNames.get(i).getText())
							.getAttribute("value"));
		}
		CartPage cartPage = new CartPage();
		Assert.assertEquals(totalprice, SCHUtils.getPriceWithOutCurrency(
				cartPage.getLblYourTeacherOrderTotalPrice().getText()));
		Assert.assertEquals(String.valueOf(totalquantity),
				cartPage.getLblYourTeacherOrderTotalQuantity().getText());
	}
	@Override
	public void verifyItemsOnYTOCart() {
		PauseUtil.pause(5000);
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			ProductInfoBean details = YTOProducts.get(key);
			AssertUtils.assertDisplayed(getLblItemId(details.getItemNumber()));
			AssertUtils.assertTextMatches(getLblItemId(details.getItemNumber()),
					Matchers.containsString(details.getItemNumber()));
			// AssertUtils.assertTextMatches(getLblItemName(details.getItemNumber()),
			// Matchers.containsString(details.getItemTitle()));

			// Yto table displays unit price so no need to multiple it with
			// quantity
			// Double price = 0.0;
			//
			// if
			// (!getTxtItemQuantity(details.getItemNumber()).getAttribute("value")
			// .equals("0")) {
			// price =
			// (SCHUtils.getPriceWithOutCurrency(details.getPrice()))
			// * Double.parseDouble(getTxtItemQuantity(
			// details.getItemNumber()).getAttribute("value"));
			// }

			AssertUtils.assertTextMatches(getLblItemPrice(details.getItemNumber()),
					Matchers.containsString(String.valueOf(details.getPrice())));

			AssertUtils.assertAttributeMatches(
					getTxtItemQuantity(details.getItemNumber()), "value",
					Matchers.containsString(details.getQuantity()));

		}
	}
	@Override
	public void removeAllYTOItem() {
		while (SCHUtils.isPresent(imgFirstRemoveIcon)) {

			imgFirstRemoveIcon.click();
			PauseUtil.waitForAjaxToComplete(2000);
			WaitUtils.waitForEnabled(btnRemoveYes);
			// btnRemoveYes.click();
			SCHUtils.clickUsingJavaScript(btnRemoveYes);
			PauseUtil.waitForAjaxToComplete(2000);
		}
	}

	@Override
	public ProductInfoBean fillTeacherDonatedItemBean(String donatedItemId) {
		PauseUtil.pause(3000);
		SCHUtils.waitForLoaderToDismiss();
		ProductInfoBean itemBean = new ProductInfoBean();
		itemBean.setItemNumber(donatedItemId);
		itemBean.setItemTitle(getLblItemName(donatedItemId).getText());
		itemBean.setFlyer(getLblFlyer(donatedItemId).getText());
		itemBean.setPrice(getLblItemPrice(donatedItemId).getText());
		itemBean.setQuantity(getTxtItemQuantity(donatedItemId).getAttribute("value"));
		// Setting bonus point to "0" for NA
		itemBean.setBonusPoint("0");
		if (!donatedItemId.equalsIgnoreCase(ConstantUtils.FREE_BOOKTRUST_ITEMID)) {
			itemBean.setBonusPointQuantity(
					getTxtBonusQuantity(donatedItemId).getAttribute("value"));
		}
		return itemBean;

	}

	@Override
	public void removeYTOItemFromStudentTable(Configuration data,
			String confirmationStatus) {

		String keyValue = data.getString("keytoremoveYTO");
		String title = getLstItemName().get(Integer.parseInt(keyValue)).getText();

		WebElement removeIcon = getLstRemoveIcon().get(Integer.parseInt(keyValue));

		removeIcon.click();

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			PauseUtil.waitForAjaxToComplete(4000);
			WaitUtils.waitForEnabled(btnRemoveYes);
			// btnRemoveYes.click();
			SCHUtils.clickUsingJavaScript(btnRemoveYes);
			PauseUtil.waitForAjaxToComplete(2000);

			SCHUtils.removeYTOProductItem(SCHUtils.getYTOProductByItemId(title));

		} else {
			getBtnRemoveNo().click();
		}

	}

	@Override
	public void VerifyLastAddedItemOnFirstPosition() {
		AssertUtils.assertTextMatches(getLstItemName().get(0),
				Matchers.containsString(TestBaseProvider.getTestBase().getContext()
						.getString("testexecution.lastenteredYTOorder")));
	}

	@Override
	public void updateBonusPointQuantity(String itemName, String quantity) {
		List<WebElement> lstItem = getLstItemName();
		System.out.println("Total Size........" + lstItem.size());
		System.out.println("In.....");
		getTxtBonusQuantity(itemName).sendKeys(quantity);
		getLblHeaderTitle().click();

	}
}
