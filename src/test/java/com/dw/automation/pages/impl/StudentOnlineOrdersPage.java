package com.dw.automation.pages.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.IStudentOnlineOrdersPage;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

public class StudentOnlineOrdersPage extends BaseTestPage<StudentFlyerOrdersPage>
		implements
			IStudentOnlineOrdersPage {

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lnk.continuetoyouteacherorder")
	private WebElement lnkContinueToYouTeacherOrder;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lnk.gotocheckout")
	private WebElement lnkGoToCheckout;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lnk.backtostudentflyerorder")
	private WebElement lnkBackToStudentFlyerOrder;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lnk.yourteacherorder")
	private WebElement lnkYourTeacherOrder;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.btn.reviewcart")
	private WebElement btnReviewCart;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lst.studentname")
	private List<WebElement> lstStudentName;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lbl.title")
	private WebElement lblSOOTitle;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lst.dateoforder")
	private List<WebElement> lstDateOfOrder;
	
	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lst.dateoforder")
	private WebElement sooDateOfOrder;

	@FindBy(locator = "dw.teachers.home.enterorder.studentonlineorders.lbl.count")
	private WebElement lblSOOCount;

	@FindBy(locator = "dw.studentonlineorders.deletemodel.header")
	private WebElement lblSOODeleteHeader;

	@FindBy(locator = "dw.teachers.home.sos.header.itemNumber")
	private WebElement lblSOOHeaderItemName;

	@FindBy(locator = "dw.teachers.home.sos.header.itemTitle")
	private WebElement lblSOOHeaderItemTitle;

	@FindBy(locator = "dw.teachers.home.sos.header.itemFlyer")
	private WebElement lblSOOHeaderItemFlyer;

	@FindBy(locator = "dw.teachers.home.sos.header.itemPrice")
	private WebElement lblSOOHeaderItemPrice;

	@FindBy(locator = "dw.teachers.home.sos.header.itemQty")
	private WebElement lblSOOHeaderItemitemQty;

	@FindBy(locator = "dw.studentonlineorders.studentName")
	private List<WebElement> lblSOOStudentName;

	@FindBy(locator = "dw.studentonlineorders.orderDate")
	private List<WebElement> lblSOOOrderDate;

	@FindBy(locator = "dw.studentonlineorders.itemPrice")
	private List<WebElement> lblSOOItemPrice;

	@FindBy(locator = "dw.studentonlineorders.itemQty")
	private List<WebElement> lblSOOIitemQty;

	@FindBy(locator = "dw.studentonlineorders.itemNumber")
	private List<WebElement> lblSOOItemNumber;
	
	@FindBy(locator = "dw.studentonlineorders.item1Number")
	private List<WebElement> sizelblSOOItem1Number;
	
	@FindBy(locator = "dw.studentonlineorders.item1Number")
	private WebElement lblSOOItem1Number;

	@FindBy(locator = "dw.studentonlineorders.itemTitle")
	private List<WebElement> lblSOOItemTitle;
	
	@FindBy(locator = "dw.studentonlineorders.itemTitle")
	private WebElement lblSOOItem1Title;

	@FindBy(locator = "dw.parent.home.enterOrder.tab")
	private WebElement tabEnterOrder;

	@FindBy(locator = "dw.parent.home.enterOrder.studentOnlineOrder")
	private WebElement linkStudentOnlineOrder;

	@FindBy(locator = "dw.parent.home.enterOrder.tab.active")
	private WebElement tabEnterOrderActive;

	@FindBy(locator = "dw.parent.home.sos.yourTeacherOrderBottom")
	private WebElement linkYourTeacherOrderBottom;

	@FindBy(locator = "dw.parent.home.sos.yourTeacherOrderTop")
	private WebElement tabYourTeacherOrderTop;

	@FindBy(locator = "dw.studentonlineorders.itemQty")
	private List<WebElement> itemQty;

	@FindBy(locator = "dw.studentonlineorders.priceParItem")
	private List<WebElement> priceParItem;

	@FindBy(locator = "dw.studentonlineorders.flyerParItem")
	private List<WebElement> flyerParItem;

	@FindBy(locator = "dw.studentonlineorders.total")
	private List<WebElement> totalStudentonlineorders;

	@FindBy(locator = "dw.studentonlineorders.subtotal")
	private List<WebElement> subTotalOFtotalStudentonlineorders;

	@FindBy(locator = "dw.studentonlineorders.totalPrice")
	private WebElement totalPrice;

	@FindBy(locator = "dw.studentonlineorders.itemSubTotalQty")
	private List<WebElement> itemSubTotalQty;

	@FindBy(locator = "dw.studentonlineorders.totalTotalQty")
	private WebElement itemTotalQty;

	@FindBy(locator = "dw.studentonlineorders.productDetailSection")
	private WebElement itemProductDetailSection;
	
	@FindBy(locator = "dw.studentonlineorders.items.count")
	private List<WebElement> sizesooitemquantities;
	
	public List<WebElement> sizesooitemquantities() {
		return sizesooitemquantities;
	}

	public WebElement getLnkContinueToYouTeacherOrder() {
		return lnkContinueToYouTeacherOrder;
	}

	public WebElement getItemProductDetailSection() {
		return itemProductDetailSection;
	}

	public WebElement getLnkGoToCheckout() {
		return lnkGoToCheckout;
	}

	public WebElement getLnkBackToStudentFlyerOrder() {
		return lnkBackToStudentFlyerOrder;
	}

	public WebElement getLnkYourTeacherOrder() {
		return lnkYourTeacherOrder;
	}

	public WebElement getBtnReviewCart() {
		return btnReviewCart;
	}

	public List<WebElement> getLstStudentName() {
		return lstStudentName;
	}

	public WebElement getLblSOOTitle() {
		return lblSOOTitle;
	}

	public WebElement getLblSOOCount() {
		return lblSOOCount;
	}

	public WebElement getLblSOODeleteHeader() {
		return lblSOODeleteHeader;
	}

	public WebElement getLblSOOHeaderItemName() {
		return lblSOOHeaderItemName;
	}

	public WebElement getLblSOOHeaderItemTitle() {
		return lblSOOHeaderItemTitle;
	}

	public WebElement getLblSOOHeaderItemFlyer() {
		return lblSOOHeaderItemFlyer;
	}

	public WebElement getLblSOOHeaderItemPrice() {
		return lblSOOHeaderItemPrice;
	}

	public WebElement getLblSOOHeaderItemitemQty() {
		return lblSOOHeaderItemitemQty;
	}

	public List<WebElement> getLblSOOStudentName() {
		return lblSOOStudentName;
	}

	public List<WebElement> getLblSOOOrderDate() {
		return lblSOOOrderDate;
	}

	public List<WebElement> getLblSOOItemPrice() {
		return lblSOOItemPrice;
	}

	public List<WebElement> getLblSOOIitemQty() {
		return lblSOOIitemQty;
	}

	public List<WebElement> getLblSOOItemNumber() {
		return lblSOOItemNumber;
	}
	
	public List<WebElement> sizeLblSOOItem1Number() {
		return sizelblSOOItem1Number;
	}
	
	public WebElement getLblSOOItem1Number() {
		return lblSOOItem1Number;
	}

	public List<WebElement> getLblSOOItemTitle() {
		return lblSOOItemTitle;
	}
	
	public WebElement getLblSOOItem1Title() {
		return lblSOOItem1Title;
	}

	public WebElement getTabEnterOrder() {
		return tabEnterOrder;
	}

	public WebElement getLinkStudentOnlineOrder() {
		return linkStudentOnlineOrder;
	}

	public WebElement getTabEnterOrderActive() {
		return tabEnterOrderActive;
	}

	public WebElement getLinkYourTeacherOrderBottom() {
		return linkYourTeacherOrderBottom;
	}

	public WebElement getTabYourTeacherOrderTop() {
		return tabYourTeacherOrderTop;
	}

	public List<WebElement> getItemQty() {
		return itemQty;
	}

	public List<WebElement> getPriceParItem() {
		return priceParItem;
	}

	public List<WebElement> getFlyerParItem() {
		return flyerParItem;
	}

	public List<WebElement> getTotalStudentonlineorders() {
		return totalStudentonlineorders;
	}

	public List<WebElement> getSubTotalOFtotalStudentonlineorders() {
		return subTotalOFtotalStudentonlineorders;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public List<WebElement> getItemSubTotalQty() {
		return itemSubTotalQty;
	}

	public WebElement getItemTotalQty() {
		return itemTotalQty;
	}

	public List<WebElement> getLstItemId(String itemIndex, String studentName) {
		return SCHUtils.findElements(
				"dw.teachers.home.enterorder.studentonlineorders.lst.itemid", itemIndex,
				studentName);
	}

	public List<WebElement> getLstItemName(String studentName) {
		return SCHUtils.findElements(
				"dw.teachers.home.enterorder.studentonlineorders.lst.itemname",
				studentName);
	}

	public WebElement getLblItemId(String itemName, String studentName) {
		return SCHUtils.findElement(
				"dw.teachers.home.enterorder.studentonlineorders.lbl.itemid", itemName,
				studentName);
	}

	public WebElement getLblItemName(String itemId, String studentName) {

		return SCHUtils.findElement(
				"dw.teachers.home.enterorder.studentonlineorders.lbl.itemname", itemId,
				studentName);
	}

	public WebElement getLblFlyer(String itemId, String studentName) {

		return SCHUtils.findElement(
				"dw.teachers.home.enterorder.studentonlineorders.lbl.flyer", itemId,
				studentName);
	}

	public WebElement getLblItemPrice(String itemId, String studentName) {

		return SCHUtils.findElement(
				"dw.teachers.home.enterorder.studentonlineorders.lbl.itemprice", itemId,
				studentName);
	}

	public WebElement getLblItemQuantity(String itemId, String studentName) {
		return SCHUtils.findElement(
				"dw.teachers.home.enterorder.studentonlineorders.txt.itemquantity",
				itemId, studentName);
	}

	public WebElement getBtnDeleteSooByChildName(String childName) {
		return SCHUtils.findElement("dw.studentonlineorders.btn.deleteby.childname",
				childName);
	}

	public List<WebElement> getLstDateOfOrder() {
		return lstDateOfOrder;
	}
	
	public WebElement getsooDateOfOrder() {
		return sooDateOfOrder;
	}

	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.lbl.soo")
	private WebElement tabSOOlbl;

	public WebElement getTabSOOlbl() {
		return tabSOOlbl;
	}

	@FindBy(locator = "dw.studentonlineorders.lst.removeicon")
	private List<WebElement> lstRemoveIcon;

	@FindBy(locator = "dw.studentonlineorders.btn.delete")
	private WebElement btnDelete;

	@FindBy(locator = "dw.studentonlineorders.btn.donotdelete")
	private WebElement btnDoNotDelete;

	@FindBy(locator = "dw.studentonlineorders.deletemodel.closeicon")
	private WebElement iconCloseSooModel;
	
	@FindBy(locator = "dw.studentonlineorders.item1.lnk.seefulldetails")
	private WebElement lnksooseefulldetails;
	
	@FindBy(locator = "dw.studentonlineorders.item1.icon.star")
	private List<WebElement> iconsoostar;
	
	@FindBy(locator = "dw.studentonlineorders.item1.icon.heart")
	private List<WebElement> iconsooheart;
	
	@FindBy(locator = "dw.studentonlineorders.allitems.price")
	private List<WebElement> totalallitemssoopage;
	
	@FindBy(locator = "dw.studentonlineorders.allitems.subtotal")
	private List<WebElement> subtotalallitemssoopage;
	
	@FindBy(locator = "dw.studentonlineorders.removeicons")
	private List<WebElement> removeiconitemssoopage;
	
	@FindBy(locator = "dw.studentonlineorders.deletemodel")
	private WebElement deletemodalsoopage;
	
	@FindBy(locator = "dw.studentonlineorders.deletemodel.headermsg")
	private WebElement deletemodalsoopageheadermsg;
	
	public WebElement getdeletemodalsoopage() {
		return deletemodalsoopage;
	}
	
	public WebElement getdeletemodalsoopageheadermsg() {
		return deletemodalsoopageheadermsg;
	}
	
	public List<WebElement> sizeremoveiconitemssoopage() {
		return removeiconitemssoopage;
	}
	
	public List<WebElement> sizetotalallitemssoopage() {
		return totalallitemssoopage;
	}
	
	public List<WebElement> sizesubtotalallitemssoopage() {
		return subtotalallitemssoopage;
	}
	
	public List<WebElement> sizeiconsooheart() {
		return iconsooheart;
	}
	
	public List<WebElement> sizeiconsoostar() {
		return iconsoostar;
	}
	
	public WebElement getlnksooseefulldetails() {
		return lnksooseefulldetails;
	}

	public WebElement getIconCloseSooModel() {
		return iconCloseSooModel;
	}

	public List<WebElement> getLstRemoveIcon() {
		return lstRemoveIcon;
	}

	public WebElement getDeleteItemOption(String option) {
		return SCHUtils.findElement("dw.studentonlineorders.options.btn.deletereason",
				option);
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getBtnDoNotDelete() {
		return btnDoNotDelete;
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public IProductOrderSummarySection getProductOrderSummarySection() {
		return SectionFactory.getFactory()
				.getIProductOrderSummarySection(By.cssSelector(""));
	}

	@Override
	public void verifySOOPage() {
		AssertUtils.assertTextMatches(getLblSOOTitle(),
				Matchers.containsString(ConstantUtils.SOO_SUBTITLE));
	}

	@Override
	public void verifySOOOrders() {
		PauseUtil.waitForAjaxToComplete(1000);
		verifySOOPage();
		Assert.assertTrue(getLstStudentName().size() > 0, "user should have SOO orders");
	}

	@Override
	public void verifySOOTabActive() {

		AssertUtils.assertAttributeMatches(getTabSOOlbl(), "class",
				Matchers.containsString("active"));

	}

	@Override
	public void verifyItemTotalCountOnSOOTab() {
		PauseUtil.pause(3000);
		int totalItemsOnProductOrderTable = SCHUtils.getSOOOrderCount();
		if (totalItemsOnProductOrderTable != 0) {
			AssertUtils.assertTextMatches(getLblSOOCount(), Matchers
					.containsString(String.valueOf(totalItemsOnProductOrderTable)));
		}

	}

	@Override
	public void fillSOOProductBean() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> studentNames = getLstStudentName();
		for (int i = 0; i < studentNames.size(); i++) {
			ProductInfoBean productInfoBean = new ProductInfoBean();
			productInfoBean.setStudentName(studentNames.get(i).getText().toString());
			productInfoBean
					.setDateOfOrder(getLstDateOfOrder().get(i).getText().toString());
			for (int j = 0; j < getLstItemId(String.valueOf(i + 1),
					studentNames.get(i).getText()).size(); j++) {
				productInfoBean.setItemNumber(
						getLstItemId(String.valueOf(i + 1), studentNames.get(i).getText())
								.get(j).getText());

				productInfoBean.setItemTitle(
						getLstItemName(studentNames.get(i).getText()).get(j).getText());
				productInfoBean
						.setFlyer(getLblFlyer(
								getLstItemId(String.valueOf(i + 1),
										studentNames.get(i).getText()).get(j).getText(),
								studentNames.get(i).getText()).getText());
				productInfoBean
						.setPrice(getLblItemPrice(
								getLstItemId(String.valueOf(i + 1),
										studentNames.get(i).getText()).get(j).getText(),
								studentNames.get(i).getText()).getText());
				productInfoBean
						.setQuantity(getLblItemQuantity(
								getLstItemId(String.valueOf(i + 1),
										studentNames.get(i).getText()).get(j).getText(),
								studentNames.get(i).getText()).getText());
				SCHUtils.addSOOProductItem(i + "." + j, productInfoBean);
			}
		}
	}

	@Override
	public void removeFirstSOOItemFromTable() {
		PauseUtil.pause(3000);
		List<WebElement> removeIcon = getLstRemoveIcon();
		removeIcon.get(0).click();

	}

	@Override
	public void verifyDeleteOptionModel() {
		AssertUtils.assertTextMatches(getdeletemodalsoopage(),
				Matchers.containsString(ConstantUtils.SOO_DELETE_OPTION_HEADER));
		String soodeletemodal_headermsg = getdeletemodalsoopageheadermsg().getText().trim();
		System.out.println("soo page delete modal header msg:"+soodeletemodal_headermsg);
		Assert.assertEquals(soodeletemodal_headermsg, ConstantUtils.SOO_DELETE_OPTION_HEADER_MSG);
		System.out.println("actual soo page delete modal header msg:"+ConstantUtils.SOO_DELETE_OPTION_HEADER_MSG);
		AssertUtils.assertTextMatches(getdeletemodalsoopage(),
				Matchers.containsString(ConstantUtils.SOO_DELETE_OPTION_SUBHEADER));
		
		String deleteOption[] = {"This isn't my student.", "This order is incorrect - the parent asked me to delete it.",
				"Other."};
		for(int i=0;i<deleteOption.length;i++){
			if(!getdeletemodalsoopage().getText().contains(deleteOption[i])){
				Assert.fail("Delete options is incorrect i.e."+deleteOption[i]);
			}
		}

		AssertUtils.assertDisplayed(getBtnDoNotDelete());
		AssertUtils.assertDisplayed(getBtnDelete());
		AssertUtils.assertDisplayed(getIconCloseSooModel());
		AssertUtils.assertEnabled(getBtnDoNotDelete());
		AssertUtils.assertDisabled(getBtnDelete());
	}

	@Override
	public void removeSOOItemsFromTable(Configuration data, String confirmationStatus) {

		String keyValue = data.getString("keytoremoveSOO");

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			PauseUtil.pause(4000);
			WaitUtils.waitForDisplayed(getDeleteItemOption(data.getString("option")));
			getDeleteItemOption(data.getString("option")).click();
			AssertUtils.assertEnabled(getBtnDelete());
			getBtnDelete().click();
			PauseUtil.pause(1000);
			SCHUtils.removeSOOProductItem(SCHUtils.getSOOProductByKeyValue(keyValue),
					keyValue);
		} else {
			getBtnDoNotDelete().click();
		}

	}

	@Override
	public void verifySOOorderDetailHeader() {
		AssertUtils.assertTextMatches(getLblSOOHeaderItemTitle(),
				Matchers.containsString(ConstantUtils.SOO_HEADER_TITLE));
		AssertUtils.assertTextMatches(getLblSOOHeaderItemName(),
				Matchers.containsString(ConstantUtils.SOO_HEADER_ITEM));
		AssertUtils.assertTextMatches(getLblSOOHeaderItemPrice(),
				Matchers.containsString(ConstantUtils.SOO_HEADER_PRICE));
		AssertUtils.assertTextMatches(getLblSOOHeaderItemFlyer(),
				Matchers.containsString(ConstantUtils.SOO_HEADER_FLYER));
		AssertUtils.assertTextMatches(getLblSOOHeaderItemitemQty(),
				Matchers.containsString(ConstantUtils.SOO_HEADER_QTY));
	}

	@Override
	public void verifySOOorderDetail() {

		AssertUtils.assertDisplayed(getLblSOOStudentName().get(0));

		AssertUtils.assertTextMatches(getLblSOOStudentName().get(0),
				Matchers.containsString(TestBaseProvider.getTestBase().getTestData()
						.getString("childname")));

		AssertUtils.assertTextMatches(getLblSOOIitemQty().get(0), Matchers.containsString(
				TestBaseProvider.getTestBase().getTestData().getString("quantity")));

		AssertUtils.assertTextMatches(getLblSOOItemPrice().get(0),
				Matchers.containsString(TestBaseProvider.getTestBase().getTestData()
						.getString("totalprice")));

		AssertUtils.assertDisplayed(getLblSOOOrderDate().get(0));
		AssertUtils.assertDisplayed(getLblSOOItemNumber().get(0));
		AssertUtils.assertDisplayed(getLblSOOItemTitle().get(0));

	}

	@Override
	public void selectStudentOnlineOrdersFromEnterOrder() {
		PauseUtil.pause(3000);
		SCHUtils.clickUsingJavaScript(getTabEnterOrder());

		getLinkStudentOnlineOrder().click();

		if (getTestBase().getContext()
				.getProperty(ConstantUtils.SOO_CART_PRODUCTS) == null) {
			IStudentOnlineOrdersPage studentOnlineOrdersPage =
					new StudentOnlineOrdersPage();
			studentOnlineOrdersPage.fillSOOProductBean();
		}
	}

	@Override
	public void verifyEnterOrdersTabActive() {
		if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equals("IOs")) {
			Assert.assertTrue(SCHUtils.isPresent(getTabEnterOrderActive()));
		} else {
			AssertUtils.assertAttributeMatches(getTabEnterOrderActive(), "class",
					Matchers.containsString("active"));
		}

	}

	@Override
	public void displayOrderTotalPrice() {
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getTotalPrice());
	}

	@Override
	public void verifyYourTeacherOrderOnTopAndBottom() {
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getTabYourTeacherOrderTop());
		AssertUtils.assertDisplayed(getLinkYourTeacherOrderBottom());
	}

	@Override
	public void verifyItemNumberAndTitleClickable() {
		PauseUtil.pause(2000);
		List<WebElement> itemNumber = getLblSOOItemNumber();
		for (WebElement webElement : itemNumber) {
			AssertUtils.assertDisplayed(webElement);
		}

		List<WebElement> itemTitle = getLblSOOItemTitle();
		for (WebElement webElement : itemTitle) {
			AssertUtils.assertDisplayed(webElement);
		}

	}

	@Override
	public void displayStudentNameAndDateOnlineOrderSection() {
		int totalOrder = getTotalStudentonlineorders().size();
		List<WebElement> studentName = getLblSOOStudentName();
		List<WebElement> orderDate = getLblSOOOrderDate();
		for (int i = 0; i < totalOrder; i++) {
			AssertUtils.assertDisplayed(studentName.get(i));
			AssertUtils.assertDisplayed(orderDate.get(i));
		}
	}

	@Override
	public void verifyStudentOnlineOrderSection() {
		PauseUtil.pause(5000);
		int totalOrder = getTotalStudentonlineorders().size();
		List<WebElement> totalItemSubQtyList = getItemSubTotalQty();
		List<WebElement> totalPriceList = getPriceParItem();
		List<WebElement> totalFlyerList = getFlyerParItem();
		List<WebElement> SubTotalList = getSubTotalOFtotalStudentonlineorders();

		for (int i = 0; i < totalOrder; i++) {
			AssertUtils.assertDisplayed(totalItemSubQtyList.get(i));
			AssertUtils.assertDisplayed(totalPriceList.get(i));
			AssertUtils.assertDisplayed(totalFlyerList.get(i));
			AssertUtils.assertDisplayed(SubTotalList.get(i));
		}

	}

	@Override
	public void checkSubOrderTotal() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifySubOrderTotal();
	}

	@Override
	public void checkOrderFinalAmount() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyOrderFinalAmount();
	}

	@Override
	public void checkItemSubQuentity() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifySubQuentityTotal();
	}

	@Override
	public void checkItemTotalQuentity() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyItemTotalQuentity();

	}

	@Override
	public void removeSOOItemByChildName(Configuration data) {
		PauseUtil.waitForAjaxToComplete(3000);
		getBtnDeleteSooByChildName(data.getString("soochildtodelete").split(" ")[0])
				.click();
	}
	@Override
	public void verifydetailProductDescription() {

		// Verify Item Number is clickable and drawer is displayed

		getLblSOOItemTitle().get(0).click();
		AssertUtils.assertDisplayed(getItemProductDetailSection());
		getLblSOOItemTitle().get(0).click();
		AssertUtils.assertNotDisplayed(getItemProductDetailSection());
		if (getLblSOOItemTitle().size() > 1) {
			getLblSOOItemTitle().get(1).click();
			AssertUtils.assertNotDisplayed(getItemProductDetailSection());
		}

	}
	@Override
	public void verifyEmptySOOOrder() {
		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		AssertUtils.assertDisplayed(getLnkContinueToYouTeacherOrder());
		AssertUtils.assertDisplayed(getBtnReviewCart());
		AssertUtils.assertTextMatches(
				getDriver().findElement(By.cssSelector(".p-order-instruction")),
				Matchers.containsString("There are no Student Online Orders to review."));

	}
	
	@Override
		public void verifynotaxesinsoopage(){
			List<WebElement> soo_allchildtotal = sizetotalallitemssoopage();
			List<WebElement> soo_allchildsubtotal = sizesubtotalallitemssoopage();
	        
			for (int i = 0; i <soo_allchildtotal.size(); i++) {
				System.out.println("Totals are --->>>>>>>: "+soo_allchildtotal.get(i).getText());
					System.out.println("Totals with taxes are --->>>>>>>: "+soo_allchildsubtotal.get(i).getText());
					if (soo_allchildtotal.get(i).getText().equals(soo_allchildsubtotal.get(i).getText())){
						System.out.println("Amounts in SOO page are good");
					} else {
						Assert.fail("Taxes are present in SOO page");
					}	
			}
		}
}
