package com.dw.automation.sections.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.base.PageFactory;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;

public class ProductOrderSummarySection extends Section
		implements
			IProductOrderSummarySection {

	@FindBy(locator = "dw.product.order.summary.lbl.totalbonuspoint.used")
	private WebElement lblTotalBonusPointUsed;

	@FindBy(locator = "dw.product.order.summary.lbl.totalbonuspoint.earned")
	private WebElement lblTotalBonusPointEarned;

	@FindBy(locator = "dw.product.order.summary.lbl.studentonlineordernumber")
	private WebElement lblStudentOnlineOrderNumber;

	@FindBy(locator = "dw.product.order.summary.lbl.studentonlineorderpaid")
	private WebElement lblStudentOnlineOrderPaid;

	@FindBy(locator = "dw.product.order.summary.lbl.studentflyerordersnum")
	private WebElement lblStudentFlyerOrdersnum;

	@FindBy(locator = "dw.product.order.summary.lbl.studentflyerorderpaid")
	private WebElement lblStudentFlyerOrderPaid;

	@FindBy(locator = "dw.product.order.summary.lbl.teacherordertotalprice")
	private WebElement lblTeacherOrderTotalPrice;

	@FindBy(locator = "dw.product.order.summary.lbl.teachertotalamountdue")
	private WebElement lblTeacherTotalAmountDue;

	public WebElement getLblTotalBonusPointUsed() {
		return lblTotalBonusPointUsed;
	}

	public WebElement getLblTotalBonusPointEarned() {
		return lblTotalBonusPointEarned;
	}

	public WebElement getLblStudentOnlineOrderNumber() {
		return lblStudentOnlineOrderNumber;
	}

	public WebElement getLblStudentOnlineOrderPaid() {
		return lblStudentOnlineOrderPaid;
	}

	public WebElement getLblStudentFlyerOrdersnum() {
		return lblStudentFlyerOrdersnum;
	}

	public WebElement getLblStudentFlyerOrderPaid() {
		return lblStudentFlyerOrderPaid;
	}

	public WebElement getLblTeacherOrderTotalPrice() {
		return lblTeacherOrderTotalPrice;
	}

	public WebElement getLblTeacherTotalAmountDue() {
		return lblTeacherTotalAmountDue;
	}

	public ProductOrderSummarySection(By by) {
		super(by);
	}

	@Override
	public void verifyOrderSummary(Configuration testData) {
		PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		ICartPage cartPage = PageFactory.getFactory().getICartPage();
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty(ConstantUtils.SOO_CART_PRODUCTS) == null
				&& SCHUtils.isPresent(cartPage.getCmpSOO())) {
			cartPage.getStudentOnlineOrdersCartSection().fillSOOProductBean();
		}
		//double SFOTotal = SCHUtils.getSFOOrderTotal();
		double YTOTotal = SCHUtils.getYTOOrderTotal();
		System.out.println("ORDER TOTAL IS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:"+YTOTotal);
		//double SOOTotal = SCHUtils.getSOOOrderTotal();
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.wishlistitemprice") != null) {
			double wishListTotal =
					Double.parseDouble(TestBaseProvider.getTestBase().getContext()
							.getProperty("testexecution.wishlistitemprice").toString());
			//SOOTotal += wishListTotal;
			//System.out.println("Total Price after adding wishlist item-" + SOOTotal);
		}
		AssertUtils.assertTextMatches(getLblTotalBonusPointUsed(),
				Matchers.containsString(String.valueOf(SCHUtils.getYTOBPTotal())));
		// we do not have bonus point calculation doc so can not perform this
		// validation
		/*
		 * AssertUtils.assertTextMatches(
		 * getLblTotalBonusPointEarned(),
		 * Matchers.equalToIgnoringCase(String.valueOf(SFOTotal + YTOTotal
		 * + SOOTotal)));
		 */
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.topoffamount") != null) {
			if (!(TestBaseProvider.getTestBase().getContext().getString("driver.name")
					.equals("IE")
					|| TestBaseProvider.getTestBase().getContext()
							.getString("driver.name").equals("IOs"))) {
				// TestBaseProvider.getTestBase().getDriver().navigate().refresh();
			}
			PauseUtil.pause(4000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(5000);
			System.out.println("inside condition with top-off amount");
			String topOffAmount = TestBaseProvider.getTestBase().getContext()
					.getProperty("testexecution.topoffamount").toString();
			System.out.println("top of=" + topOffAmount);
			AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
					Matchers.containsString(String.valueOf(
							YTOTotal + Integer.parseInt(topOffAmount))));
		} else {
			ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
			Double shippingCharge = 0.0;
			if (SCHUtils.isPresent(checkoutPage.getShippingAndPaymentSection()
					.getLblPaymentShipingcharge())) {
				shippingCharge = SCHUtils.getPriceWithOutCurrency(
						checkoutPage.getShippingAndPaymentSection()
								.getLblPaymentShipingcharge().getText());
			}
			// AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
			// Matchers.containsString(
			// String.valueOf(SFOTotal + YTOTotal + shippingCharge)));

			PauseUtil.pause(5000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(5000);
			if (!(TestBaseProvider.getTestBase().getContext().getString("driver.name")
					.equals("IE")
					|| TestBaseProvider.getTestBase().getContext()
							.getString("driver.name").equals("IOs"))) {
				// TestBaseProvider.getTestBase().getDriver().navigate().refresh();
			}

			AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
					Matchers.containsString(String.valueOf(YTOTotal)));

		}

		// AssertUtils.assertTextMatches(getLblTeacherOrderTotalPrice(),
		// Matchers.containsString(SCHUtils.getStandardPriceFormat(YTOTotal)));

		/*PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2000);
		AssertUtils.assertTextMatches(getLblStudentOnlineOrderPaid(),
				Matchers.containsString(SCHUtils.getStandardPriceFormat(SOOTotal)));
		Assert.assertEquals(SCHUtils.getSOOOrderCount(),
				Integer.parseInt(getLblStudentOnlineOrderNumber().getText()));

		AssertUtils.assertTextMatches(getLblStudentFlyerOrdersnum(),
				Matchers.containsString(String.valueOf(SCHUtils.getSFOStudentTotal())));
		AssertUtils.assertTextMatches(getLblStudentFlyerOrderPaid(),
				Matchers.containsString(SCHUtils.getStandardPriceFormat(SFOTotal)));*/

	}
	
	
	
	@Override
	public void verifyOrderTotalDue_RewardsCouponsPage(Configuration testData) {
		PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		ICartPage cartPage = PageFactory.getFactory().getICartPage();
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty(ConstantUtils.SOO_CART_PRODUCTS) == null
				&& SCHUtils.isPresent(cartPage.getCmpSOO())) {
			cartPage.getStudentOnlineOrdersCartSection().fillSOOProductBean();
		}
		//double SFOTotal = SCHUtils.getSFOOrderTotal();
		double YTOTotal = SCHUtils.getYTOOrderTotal();
		System.out.println("ORDER TOTAL IS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:"+YTOTotal);
		//double SOOTotal = SCHUtils.getSOOOrderTotal();
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.wishlistitemprice") != null) {
			double wishListTotal =
					Double.parseDouble(TestBaseProvider.getTestBase().getContext()
							.getProperty("testexecution.wishlistitemprice").toString());
			//SOOTotal += wishListTotal;
			//System.out.println("Total Price after adding wishlist item-" + SOOTotal);
		}
		AssertUtils.assertTextMatches(getLblTotalBonusPointUsed(),
				Matchers.containsString(String.valueOf(SCHUtils.getYTOBPTotal())));
		// we do not have bonus point calculation doc so can not perform this
		// validation
		/*
		 * AssertUtils.assertTextMatches(
		 * getLblTotalBonusPointEarned(),
		 * Matchers.equalToIgnoringCase(String.valueOf(SFOTotal + YTOTotal
		 * + SOOTotal)));
		 */
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.topoffamount") != null) {
			if (!(TestBaseProvider.getTestBase().getContext().getString("driver.name")
					.equals("IE")
					|| TestBaseProvider.getTestBase().getContext()
							.getString("driver.name").equals("IOs"))) {
				// TestBaseProvider.getTestBase().getDriver().navigate().refresh();
			}
			PauseUtil.pause(4000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(5000);
			System.out.println("inside condition with top-off amount");
			String topOffAmount = TestBaseProvider.getTestBase().getContext()
					.getProperty("testexecution.topoffamount").toString();
			System.out.println("top of=" + topOffAmount);
			AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
					Matchers.containsString(String.valueOf(
							YTOTotal + Integer.parseInt(topOffAmount))));
		} else {
			ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
			Double shippingCharge = 0.0;
			if (SCHUtils.isPresent(checkoutPage.getShippingAndPaymentSection()
					.getLblPaymentShipingcharge())) {
				shippingCharge = SCHUtils.getPriceWithOutCurrency(
						checkoutPage.getShippingAndPaymentSection()
								.getLblPaymentShipingcharge().getText());
			}
			// AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
			// Matchers.containsString(
			// String.valueOf(SFOTotal + YTOTotal + shippingCharge)));

			PauseUtil.pause(5000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(5000);
			if (!(TestBaseProvider.getTestBase().getContext().getString("driver.name")
					.equals("IE")
					|| TestBaseProvider.getTestBase().getContext()
							.getString("driver.name").equals("IOs"))) {
				// TestBaseProvider.getTestBase().getDriver().navigate().refresh();
			}

			AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
					Matchers.containsString(String.valueOf(YTOTotal)));

		}

		// AssertUtils.assertTextMatches(getLblTeacherOrderTotalPrice(),
		// Matchers.containsString(SCHUtils.getStandardPriceFormat(YTOTotal)));

		/*PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2000);
		AssertUtils.assertTextMatches(getLblStudentOnlineOrderPaid(),
				Matchers.containsString(SCHUtils.getStandardPriceFormat(SOOTotal)));
		Assert.assertEquals(SCHUtils.getSOOOrderCount(),
				Integer.parseInt(getLblStudentOnlineOrderNumber().getText()));

		AssertUtils.assertTextMatches(getLblStudentFlyerOrdersnum(),
				Matchers.containsString(String.valueOf(SCHUtils.getSFOStudentTotal())));
		AssertUtils.assertTextMatches(getLblStudentFlyerOrderPaid(),
				Matchers.containsString(SCHUtils.getStandardPriceFormat(SFOTotal)));*/

	}
	
	
	
	

	@Override
	public void verifySumOfEarnedAndBonusPoints(int bonusPoints) {

		Assert.assertTrue(
				bonusPoints == (Integer.parseInt(getLblTotalBonusPointEarned().getText())
						- Integer.parseInt(getLblTotalBonusPointUsed().getText())),
				"Bonus point bank points mismatch");

	}

	@Override
	public String getBonusPoints() {
		// System.out.println(" 133 " + getLblTotalBonusPointEarned());
		String str = getLblTotalBonusPointEarned().getText();
		return str;
	}

	@Override
	public void verifyEmptyCartTotal() {
		AssertUtils.assertTextMatches(getLblTotalBonusPointUsed(),
				Matchers.containsString("0"));
		AssertUtils.assertTextMatches(getLblTotalBonusPointEarned(),
				Matchers.containsString("0"));
		AssertUtils.assertTextMatches(getLblStudentOnlineOrderPaid(),
				Matchers.containsString("$0.00"));
		AssertUtils.assertTextMatches(getLblStudentFlyerOrderPaid(),
				Matchers.containsString("$0.00"));
		AssertUtils.assertTextMatches(getLblTeacherOrderTotalPrice(),
				Matchers.containsString("$0.00"));
		AssertUtils.assertTextMatches(getLblTeacherTotalAmountDue(),
				Matchers.containsString("$0.00"));
	}

	@Override
	public void verifyOrderSummaryUI() {
		AssertUtils.assertDisplayed(getLblTeacherTotalAmountDue());
		AssertUtils.assertDisplayed(getLblTeacherOrderTotalPrice());
		AssertUtils.assertDisplayed(getLblStudentFlyerOrderPaid());
		AssertUtils.assertDisplayed(getLblStudentOnlineOrderPaid());
		AssertUtils.assertDisplayed(getLblTotalBonusPointEarned());
		AssertUtils.assertDisplayed(getLblTotalBonusPointUsed());
		AssertUtils.assertDisplayed(getLblTeacherTotalAmountDue());
	}
}
