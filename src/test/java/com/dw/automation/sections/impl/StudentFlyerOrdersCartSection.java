package com.dw.automation.sections.impl;

import java.util.ArrayList;
import java.util.Collections;
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
import com.dw.automation.sections.IStudentFlyerOrdersCartSection;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.WaitUtils;

public class StudentFlyerOrdersCartSection extends Section
		implements
			IStudentFlyerOrdersCartSection {

	@FindBy(locator = "dw.studentflyerorders.lst.studentname")
	private List<WebElement> lstStudentName;

	@FindBy(locator = "dw.reviewcart.updating.account.popup.btn.close")
	private WebElement btnPopupClose;

	@FindBy(locator = "dw.reviewcart.sfo.img.firstremoveicon")
	private WebElement imgFirstRemoveIcon;

	private List<WebElement> lstItemId;

	private List<WebElement> lstItemName;

	private WebElement lblItemId;

	private WebElement lblItemName;

	private WebElement lblFlyer;

	private WebElement lblCoupon;

	private WebElement lblItemPrice;

	private WebElement txtItemQuantity;

	private WebElement imgRemoveIcon;

	@FindBy(locator = "dw.studentflyerorder.section.studentflyerorder")
	private WebElement studentFlyerOrderSection;

	@FindBy(locator = "dw.studentflyerorders.header.lbl.itemid")
	private WebElement lblHeaderItemId;

	@FindBy(locator = "dw.studentflyerorders.header.lbl.title")
	private WebElement lblHeaderTitle;

	@FindBy(locator = "dw.studentflyerorders.header.lbl.flyer")
	private WebElement lblHeaderFlyer;

	@FindBy(locator = "dw.studentflyerorders.header.lbl.coupon")
	private WebElement lblHeaderCoupon;

	@FindBy(locator = "dw.studentflyerorders.header.lbl.price")
	private WebElement lblHeaderPrice;

	@FindBy(locator = "dw.studentflyerorders.header.lbl.itemquantity")
	private WebElement lblHeaderQuantity;

	@FindBy(locator = "dw.studentflyerorders.lst.subtotalprice")
	private List<WebElement> lstSubTotalPrice;

	@FindBy(locator = "dw.studentflyerorders.lst.subtotalquantity")
	private List<WebElement> lstSubTotalQuantity;

	@FindBy(locator = "dw.studentflyerorders.expandinfo.lbl.collapsedinfo")
	private WebElement lblCollapsedInfo;

	@FindBy(locator = "dw.studentflyerorders.expandinfo.lbl.expandedinfo")
	private WebElement lblExpandedInfo;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.btn.minus")
	private WebElement btnMinusOrPlus;
	@FindBy(locator = "dw.reviewcart.remove.btn.yes")
	private WebElement btnRemoveYes;

	@FindBy(locator = "dw.reviewcart.orderconfirmation.lbl.totalzeroitem")
	private WebElement lblTotalZeroItem;
	@FindBy(locator = "dw.reviewcart.remove.btn.no")
	private WebElement btnRemoveNo;
	public List<WebElement> getLstStudentName() {
		return lstStudentName;
	}

	@Override
	public WebElement getBtnPopupClose() {
		return btnPopupClose;
	}

	public List<WebElement> getLstItemId(String studentName) {
		lstItemId =
				SCHUtils.findElements("dw.studentflyerorders.lst.itemid", studentName);
		return lstItemId;
	}

	public List<WebElement> getLstItemName(String studentName) {
		lstItemName =
				SCHUtils.findElements("dw.studentflyerorders.lst.itemname", studentName);
		return lstItemName;
	}

	public WebElement getLblItemId(String itemName, String studentName) {
		lblItemId = SCHUtils.findElement("dw.studentflyerorders.lbl.itemid", itemName,
				studentName);
		return lblItemId;
	}

	public WebElement getLblItemName(String itemId, String studentName) {
		lblItemName = SCHUtils.findElement("dw.studentflyerorders.lbl.itemname", itemId,
				studentName);
		return lblItemName;
	}

	public WebElement getLblFlyer(String itemId, String studentName) {
		lblFlyer = SCHUtils.findElement("dw.studentflyerorders.lbl.flyer", itemId,
				studentName);
		return lblFlyer;
	}

	public WebElement getLblCoupon(String itemId, String studentName) {
		lblCoupon = SCHUtils.findElement("dw.studentflyerorders.lbl.coupon", itemId,
				studentName);
		return lblCoupon;
	}

	public WebElement getLblItemPrice(String itemId, String studentName) {
		lblItemPrice = SCHUtils.findElement("dw.studentflyerorders.lbl.itemprice", itemId,
				studentName);
		return lblItemPrice;
	}

	public WebElement getTxtItemQuantity(String itemId, String studentName) {
		txtItemQuantity = SCHUtils.findElement("dw.studentflyerorders.txt.itemquantity",
				itemId, studentName);
		return txtItemQuantity;
	}

	public WebElement getImgRemoveIcon(String itemId, String studentName) {
		imgRemoveIcon = SCHUtils.findElement("dw.studentflyerorders.img.removeicon",
				itemId, studentName);
		return imgRemoveIcon;
	}

	public WebElement getStudentFlyerOrderSection() {
		return studentFlyerOrderSection;
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

	public WebElement getLblHeaderCoupon() {
		return lblHeaderCoupon;
	}

	public WebElement getLblHeaderPrice() {
		return lblHeaderPrice;
	}

	public WebElement getLblHeaderQuantity() {
		return lblHeaderQuantity;
	}

	public List<WebElement> getLstSubTotalPrice() {
		return lstSubTotalPrice;
	}

	public List<WebElement> getLstSubTotalQuantity() {
		return lstSubTotalQuantity;
	}

	public StudentFlyerOrdersCartSection(By by) {
		super(by);
	}

	public StudentFlyerOrdersCartSection(String locator) {
		super(LocatorUtils.getBy(locator));
	}

	public WebElement getLblCollapsedInfo() {
		return lblCollapsedInfo;
	}

	public WebElement getLblExpandedInfo() {
		return lblExpandedInfo;
	}

	public WebElement getBtnMinusOrPlus() {
		return btnMinusOrPlus;
	}

	/**
	 * This Method Verify Items on SFO Cart
	 * 
	 * @param studentName
	 *            , itemID
	 */
	@Override
	public void verifyItemsOnSFOCart() {
		if (SCHUtils.isPresent(getBtnPopupClose())) {
			try {
				getBtnPopupClose().click();
			} catch (Exception e) {
				System.out.println("Popup close button was not visible");
			}
		}
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		for (String key : SFOProducts.keySet()) {
			ProductInfoBean details = SFOProducts.get(key);
			AssertUtils.assertDisplayed(
					getLblItemId(details.getItemNumber(), details.getStudentName()));
			AssertUtils.assertTextMatches(
					getLblItemId(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getItemNumber()));
			// AssertUtils.assertTextMatches(
			// getLblItemName(details.getItemNumber(),
			// details.getStudentName()),
			// Matchers.containsString(details.getItemTitle()));
			AssertUtils.assertTextMatches(
					getLblItemPrice(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getPrice()));
			AssertUtils.assertTextMatches(
					getLblFlyer(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getFlyer()));

			try {
				Assert.assertTrue(getTxtItemQuantity(details.getItemNumber(),
						details.getStudentName()).getAttribute("value")
								.contains(details.getQuantity()));
			} catch (Exception e) {
				Assert.assertTrue(getTxtItemQuantity(details.getItemNumber(),
						details.getStudentName()).getText()
								.contains(details.getQuantity()));
			}
		}
	}

	public void verifySFOSubToalMatchesTotal() {
		Double totalprice = 0.0;
		int totalquantity = 0;
		List<WebElement> lstsubtotalprice = getLstSubTotalPrice();
		List<WebElement> lstsubtotalquantity = getLstSubTotalQuantity();
		for (int i = 0; i < lstsubtotalprice.size(); i++) {
			totalprice +=
					SCHUtils.getPriceWithOutCurrency((lstsubtotalprice.get(i).getText()));
			totalquantity += Integer.parseInt(lstsubtotalquantity.get(i).getText());
		}
		CartPage cartPage = new CartPage();
		Assert.assertEquals(totalprice, SCHUtils.getPriceWithOutCurrency(
				cartPage.getLblStudentFlyerOrderTotalPrice().getText()));
		Assert.assertEquals(String.valueOf(totalquantity),
				cartPage.getLblStudentFlyerOrderTotalQuantity().getText());
	}

	public void verifySFOHeader() {
		AssertUtils.assertDisplayed(getLblHeaderItemId());
		AssertUtils.assertDisplayed(getLblHeaderTitle());
		AssertUtils.assertDisplayed(getLblHeaderFlyer());
		AssertUtils.assertDisplayed(getLblHeaderCoupon());
		AssertUtils.assertDisplayed(getLblHeaderPrice());
		AssertUtils.assertDisplayed(getLblHeaderQuantity());

	}

	@Override
	public void verifySFOFunctionalities() {
		AssertUtils.assertDisplayed(getStudentFlyerOrderSection());
		CartPage cartPage = new CartPage();
		AssertUtils.assertDisplayed(cartPage.getBtnStudentFlyerOrderAdd());
		verifyExpandAndCollapseFunctionality();
		verifySFOHeader();
		Assert.assertEquals(getLstStudentName().size() > 0, true);
		Assert.assertEquals(getLstStudentName().size(), getLstSubTotalPrice().size());
		Assert.assertEquals(getLstStudentName().size(), getLstSubTotalQuantity().size());
		verifyStudentNamesAscOrder();
		verifySFOSubToalMatchesTotal();

	}

	private void verifyExpandAndCollapseFunctionality() {
		getBtnMinusOrPlus().click();
		PauseUtil.waitForAjaxToComplete(30000);
		getBtnMinusOrPlus().click();
	}

	@Override
	public void verifyItemsQuantityOnCart() {
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		for (String key : SFOProducts.keySet()) {
			ProductInfoBean details = SFOProducts.get(key);
			try {
				Assert.assertTrue(getTxtItemQuantity(details.getItemNumber(),
						details.getStudentName()).getAttribute("value")
								.contains(details.getQuantity()));

			} catch (Exception e) {
				Assert.assertTrue(getTxtItemQuantity(details.getItemNumber(),
						details.getStudentName()).getText()
								.contains(details.getQuantity()));
			}

		}
	}

	@Override
	public int getTotalStudentOnSFOPage() {

		Set studentName = new Set();
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();

		for (String key : SFOProducts.keySet()) {
			studentName.add(SFOProducts.get(key).getStudentName());
		}

		return studentName.getSize();
	}

	public void verifyStudentNamesAscOrder() {
		List<String> studentNames = new ArrayList<String>();
		for (WebElement ele : getLstStudentName()) {
			studentNames.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(studentNames);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(studentNames),
				"Student list is not in alphabetical order");
	}

	@Override
	public void removeAllSfoItems() {
		while (SCHUtils.isPresent((imgFirstRemoveIcon))) {
			imgFirstRemoveIcon.click();
			PauseUtil.waitForAjaxToComplete(2000);
			WaitUtils.waitForEnabled((btnRemoveYes));
			btnRemoveYes.click();
			PauseUtil.waitForAjaxToComplete(2000);
		}
	}

	@Override
	public void updateQuantity(Configuration data) {

		String studentName =
				SCHUtils.getArrayFromStringData(data.getString("studentname"))[0];

		String itemId = SCHUtils.getArrayFromStringData(data.getString("itemid"))[0];
		String quantity = data.getString("quantity");
		getTxtItemQuantity(itemId, studentName).sendKeys(quantity);
		PauseUtil.waitForAjaxToComplete(1000);
		getLblFlyer(itemId, studentName).click();
		PauseUtil.waitForAjaxToComplete(2000);

		ProductInfoBean bean =
				SCHUtils.getSFOProductByIDAndStudentName(itemId + studentName);
		bean.setQuantity(getTxtItemQuantity(itemId, studentName).getAttribute("value"));

		SCHUtils.addSFOProductItem(bean);

	}

	@Override
	public void verifyCouponsIsNotEditedOnSfoCart() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2000);
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		for (String key : SFOProducts.keySet()) {
			ProductInfoBean details = SFOProducts.get(key);
			System.out.println("Coupon key................" + key);
			System.out.println("Coupond Information....." + details);
			if (!details.getCoupon().isEmpty()) {
				Assert.assertTrue(getTxtItemQuantity(details.getItemNumber(),
						details.getStudentName()).getText()
								.contains(details.getQuantity()));
				Assert.assertTrue(
						getLblCoupon(details.getItemNumber(), details.getStudentName())
								.getText().contains(details.getCoupon()));
				Assert.assertTrue(
						getLblCoupon(details.getItemNumber(), details.getStudentName())
								.getTagName().equalsIgnoreCase("td"),
						"Coupnos nuber is displayed in anchor tag so it is editable");

			}
		}

	}
	@Override
	public void expandItemInfo(String itemName, String studentName) {
		getLblItemId(itemName, studentName).click();
	}
}
