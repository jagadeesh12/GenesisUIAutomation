package com.dw.automation.sections.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.sections.IStudentOnlineOrdersCartSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

public class StudentOnlineOrdersCartSection extends Section
		implements
			IStudentOnlineOrdersCartSection {

	@FindBy(locator = "dw.studentonlineorders.lst.studentname")
	private List<WebElement> lstStudentName;

	@FindBy(locator = "dw.studentonlineorders.lst.dateoforder")
	private List<WebElement> lstDateOfOrder;

	private List<WebElement> lstItemId;

	private List<WebElement> lstItemName;

	private WebElement lblItemId;

	private WebElement lblItemName;

	private WebElement lblFlyer;

	private WebElement lblItemPrice;

	private WebElement lblItemQuantity;

	@FindBy(locator = "dw.studentonlineorders.lst.removeicon")
	private List<WebElement> lstRemoveIcon;

	@FindBy(locator = "dw.studentonlineorders.options.btn.other")
	private WebElement btnOptionsOther;

	@FindBy(locator = "dw.studentonlineorders.btn.delete")
	private WebElement btnDelete;

	@FindBy(locator = "dw.studentonlineorders.btn.donotdelete")
	private WebElement btnDoNotDelete;

	@FindBy(locator = "dw.studentonlineorders.cmp")
	private WebElement sectionStudentOnlineOrder;

	@FindBy(locator = "dw.studentonlineorders.header.lbl.itemid")
	private WebElement lblHeaderItemId;

	@FindBy(locator = "dw.studentonlineorders.header.lbl.title")
	private WebElement lblHeaderTitle;

	@FindBy(locator = "dw.studentonlineorders.header.lbl.flyer")
	private WebElement lblHeaderFlyer;

	@FindBy(locator = "dw.studentonlineorders.header.lbl.price")
	private WebElement lblHeaderPrice;

	@FindBy(locator = "dw.studentonlineorders.header.lbl.itemquantity")
	private WebElement lblHeaderQuantity;

	@FindBy(locator = "dw.studentonlineorders.lst.subtotalprice")
	private List<WebElement> lstSubTotalPrice;

	@FindBy(locator = "dw.studentonlineorders.lst.subtotalquantity")
	private List<WebElement> lstSubTotalQuantity;

	@FindBy(locator = "dw.studentonlineorders.lbl.totalprice")
	private WebElement lblTotalPrice;

	@FindBy(locator = "dw.studentonlineorders.lbl.totalquantity")
	private WebElement lblTotalQuantity;

	@FindBy(locator = "dw.studentonlineorder.btn.minus")
	private WebElement btnMinus;

	@FindBy(locator = "dw.studentonlineorder.lst.allitemids")
	private List<WebElement> lstAllItemIds;

	@FindBy(locator = "dw.studentonlineorder.lbl.expandedinfo")
	private WebElement lblExpandedInfo;

	public List<WebElement> getLstStudentName() {
		return lstStudentName;
	}

	public List<WebElement> getLstDateOfOrder() {
		return lstDateOfOrder;
	}

	public List<WebElement> getLstItemId(String index, String studentName) {
		lstItemId = SCHUtils.findElements("dw.studentonlineorders.lst.itemid", index,
				studentName);
		return lstItemId;
	}

	public List<WebElement> getLstItemName(String studentName) {
		lstItemName =
				SCHUtils.findElements("dw.studentonlineorders.lst.itemname", studentName);
		return lstItemName;
	}

	public WebElement getLblItemId(String itemName, String studentName) {
		lblItemId = SCHUtils.findElement("dw.studentonlineorders.lbl.itemid", itemName,
				studentName);
		return lblItemId;
	}

	public WebElement getLblItemName(String itemId, String studentName) {
		lblItemName = SCHUtils.findElement("dw.studentonlineorders.lbl.itemname", itemId,
				studentName);
		return lblItemName;
	}

	public WebElement getLblFlyer(String itemId, String studentName) {
		lblFlyer = SCHUtils.findElement("dw.studentonlineorders.lbl.flyer", itemId,
				studentName);
		return lblFlyer;
	}

	public WebElement getLblItemPrice(String itemId, String studentName) {
		lblItemPrice = SCHUtils.findElement("dw.studentonlineorders.lbl.itemprice",
				itemId, studentName);
		return lblItemPrice;
	}

	public WebElement getLblItemQuantity(String itemId, String studentName) {
		lblItemQuantity = SCHUtils.findElement("dw.studentonlineorders.txt.itemquantity",
				itemId, studentName);
		return lblItemQuantity;
	}

	public List<WebElement> getLblWishListItemRow(String wishListHeader) {
		return SCHUtils.findElements("dw.studentonlineorder.lbl.wishlist.row",
				wishListHeader);
	}

	public WebElement getLblWishListItemId(String wishListHeader, String index) {
		return SCHUtils.findElement("dw.studentonlineorder.lbl.wishlist.itemid",
				wishListHeader, index);
	}

	public WebElement getLblWishListItemTitle(String wishListHeader, String index) {
		return SCHUtils.findElement("dw.studentonlineorder.lbl.wishlist.title",
				wishListHeader, index);
	}

	public WebElement getLblWishListItemFlyer(String wishListHeader, String index) {
		return SCHUtils.findElement("dw.studentonlineorder.lbl.wishlist.flyer",
				wishListHeader, index);
	}

	public WebElement getLblWishListItemPrice(String wishListHeader, String index) {
		return SCHUtils.findElement("dw.studentonlineorder.lbl.wishlist.price",
				wishListHeader, index);
	}

	public WebElement getLblWishListItemQuantity(String wishListHeader, String index) {
		return SCHUtils.findElement("dw.studentonlineorder.lbl.wishlist.qty",
				wishListHeader, index);
	}

	public List<WebElement> getLstRemoveIcon() {
		return lstRemoveIcon;
	}

	public WebElement getBtnOptionsOther() {
		return btnOptionsOther;
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getBtnDoNotDelete() {
		return btnDoNotDelete;
	}

	public WebElement getSectionStudentOnlineOrder() {
		return sectionStudentOnlineOrder;
	}

	public StudentOnlineOrdersCartSection(By by) {
		super(by);
	}

	public StudentOnlineOrdersCartSection(String locator) {
		super(LocatorUtils.getBy(locator));
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

	public WebElement getLblHeaderQuantity() {
		return lblHeaderQuantity;
	}

	public List<WebElement> getLstSubTotalPrice() {
		return lstSubTotalPrice;
	}

	public List<WebElement> getLstSubTotalQuantity() {
		return lstSubTotalQuantity;
	}

	public WebElement getLblTotalPrice() {
		return lblTotalPrice;
	}

	public WebElement getLblTotalQuantity() {
		return lblTotalQuantity;
	}

	public WebElement getBtnMinus() {
		return btnMinus;
	}

	public List<WebElement> getLstAllItemIds() {
		return lstAllItemIds;
	}

	public WebElement getLblExpandedInfo() {
		return lblExpandedInfo;
	}

	@Override
	public int getNumberOfStudents() {
		return getLstStudentName().size();
	}

	/* this method is used to fill SOO bean on CartPage */
	@Override
	public void fillSOOProductBean() {
		PauseUtil.waitForAjaxToComplete(5000);
		SCHUtils.waitForLoaderToDismiss();
		List<WebElement> studentNames = getLstStudentName();

		for (int i = 0; i < studentNames.size(); i++) {
			/*
			 * Adding condition for wishlist item
			 */
			if (studentNames.get(i).getText()
					.equalsIgnoreCase(ConstantUtils.CART_PAGE_WISHLIST_HEADER)) {
				double wishListItemSize =
						getLblWishListItemRow(ConstantUtils.CART_PAGE_WISHLIST_HEADER)
								.size();
				System.out.println("WishList item size-" + wishListItemSize);
				int totalWishListPrice = 0;
				for (int k = 1; k <= wishListItemSize; k++) {
					double price =
							SCHUtils.getPriceWithOutCurrency(getLblWishListItemPrice(
									ConstantUtils.CART_PAGE_WISHLIST_HEADER,
									Integer.toString(k)).getText());
					System.out.println("Wishlist item-Price" + price);
					totalWishListPrice += price;
				}
				System.out.println("Total WishList Price=" + totalWishListPrice);
				TestBaseProvider.getTestBase().getContext().setProperty(
						"testexecution.wishlistitemprice", totalWishListPrice);

			} else {
				List<WebElement> itemIds = getLstItemId(String.valueOf(i + 1),
						studentNames.get(i).getText());
				for (int j = 0; j < itemIds.size(); j++) {
					ProductInfoBean productInfoBean = new ProductInfoBean();
					productInfoBean
							.setStudentName(studentNames.get(i).getText().toString());
					productInfoBean.setDateOfOrder(
							getLstDateOfOrder().get(i).getText().toString());
					productInfoBean.setItemNumber(getLstItemId(String.valueOf(i + 1),
							studentNames.get(i).getText()).get(j).getText());

					productInfoBean
							.setItemTitle(getLstItemName(studentNames.get(i).getText())
									.get(j).getText());
					productInfoBean.setFlyer(getLblFlyer(itemIds.get(j).getText(),
							studentNames.get(i).getText()).getText());
					productInfoBean.setPrice(getLblItemPrice(itemIds.get(j).getText(),
							studentNames.get(i).getText()).getText());
					productInfoBean
							.setQuantity(getLblItemQuantity(itemIds.get(j).getText(),
									studentNames.get(i).getText()).getText());
					System.out.println("Soo Filling information#######33.." + i + " . "
							+ j + "....." + productInfoBean);
					SCHUtils.addSOOProductItem(i + "." + j, productInfoBean);
				}
			}

		}
	}
	@Override
	public void removeSOOItemsFromStudentTable(Configuration data,
			String confirmationStatus) {

		String keyValue = data.getString("keytoremoveSOO");

		WebElement removeIcon = getLstRemoveIcon().get(Integer.parseInt(keyValue));

		removeIcon.click();

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			PauseUtil.waitForAjaxToComplete(4000);
			WaitUtils.waitForDisplayed(getBtnOptionsOther());
			getBtnOptionsOther().click();
			getBtnDelete().click();

			SCHUtils.removeSOOProductItem(SCHUtils.getSOOProductByKeyValue(keyValue),
					keyValue);

		} else {
			getBtnDoNotDelete().click();
		}
	}

	@Override
	public void verifyUpdatedRecordsAfterRemoval(Configuration data) {
		HashMap<String, ProductInfoBean> itemDeleted =
				SCHUtils.getSOORemovedProductItems();

		String keyValue = data.getString("keytoremoveSFO");
		for (String key : itemDeleted.keySet()) {
			if (itemDeleted
					.containsKey(key.substring(0, key.indexOf(".")).equals(keyValue))) {
				Assert.assertTrue(true, "Item is not deleted");
			}
		}
	}

	@Override
	public void verifyItemsOnSOOCart() {
		Map<String, ProductInfoBean> SOOProducts = SCHUtils.getSOOProductItems();

		// If parent order is placed order
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty(ConstantUtils.POSOO_CART_PRODUCTS) != null) {
			HashMap<String, ProductInfoBean> POMap = SCHUtils.getPOSOOMap();
			HashMap<String, ProductInfoBean> teacherPOMap =
					new HashMap<String, ProductInfoBean>();
			for (String key : POMap.keySet()) {
				if (key.split("\\.")[0].equalsIgnoreCase(
						((UserProfileBean) TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.userProfileBean"))
										.getName())) {
					teacherPOMap.put(key.split("\\.", 1)[1], POMap.get(key));
				}
			}
			SOOProducts = teacherPOMap;
		}

		for (String key : SOOProducts.keySet()) {
			ProductInfoBean details = SOOProducts.get(key);

			AssertUtils.assertDisplayed(
					getLblItemId(details.getItemNumber(), details.getStudentName()));
			AssertUtils.assertTextMatches(
					getLblItemId(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getItemNumber()));
			AssertUtils.assertTextMatches(
					getLblItemName(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getItemTitle()));

			AssertUtils.assertTextMatches(
					getLblFlyer(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getFlyer()));

			AssertUtils.assertTextMatches(
					getLblItemPrice(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getPrice()));

			AssertUtils.assertTextMatches(
					getLblItemQuantity(details.getItemNumber(), details.getStudentName()),
					Matchers.containsString(details.getQuantity()));

		}

	}

	private void verifySOOSubToalMatchesTotal() {
		Double totalprice = 0.0;
		int totalquantity = 0;
		List<WebElement> lstsubtotalprice = getLstSubTotalPrice();
		List<WebElement> lstsubtotalquantity = getLstSubTotalQuantity();
		for (int i = 0; i < lstsubtotalprice.size(); i++) {
			totalprice +=
					SCHUtils.getPriceWithOutCurrency((lstsubtotalprice.get(i).getText()));
			totalquantity += Integer.parseInt(lstsubtotalquantity.get(i).getText());
		}
		Assert.assertEquals(totalprice,
				SCHUtils.getPriceWithOutCurrency(getLblTotalPrice().getText()));
		Assert.assertEquals(totalquantity,
				Double.valueOf(getLblTotalQuantity().getText()).intValue());
	}

	private void verifySOOHeader() {
		AssertUtils.assertDisplayed(getLblHeaderItemId());
		AssertUtils.assertDisplayed(getLblHeaderTitle());
		// put if condition because on mobile flyer is not display
		if (TestBaseProvider.getTestBase().getContext().getString("platform")
				.contains("desktop")) {
			AssertUtils.assertDisplayed(getLblHeaderFlyer());
		}
		AssertUtils.assertDisplayed(getLblHeaderPrice());
		AssertUtils.assertDisplayed(getLblHeaderQuantity());
		AssertUtils.assertDisplayed(getBtnMinus());
	}

	@Override
	public void verifySOOFunctionalities() {
		PauseUtil.waitForAjaxToComplete(2000);
		if (SCHUtils.isPresent(getLblTotalPrice())) {
			verifySOOHeader();
			verifyStudentNamesAscOrder();
			Assert.assertEquals(getLstStudentName().size() > 0, true);
			Assert.assertEquals(getLstStudentName().size(), getLstSubTotalPrice().size());
			Assert.assertEquals(getLstStudentName().size(),
					getLstSubTotalQuantity().size());
			Assert.assertEquals(getLstStudentName().size(), getLstDateOfOrder().size());
			verifySOOSubToalMatchesTotal();
		}

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
	public void clickOnAnySOOItem() {
		if (SCHUtils.isPresent(getLblTotalPrice())) {
			SCHUtils.clickUsingJavaScript(getLstAllItemIds().get(0));
		}
	}

	@Override
	public void verifyExpandedInfo() {
		AssertUtils.assertDisplayed(getLblExpandedInfo());
	}
}
