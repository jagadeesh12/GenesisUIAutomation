package com.dw.automation.pages.impl.desktop;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.pages.ICouponsandRewards;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestPage;

public class CouponsandRewardsPage extends BaseTestPage<TestPage> implements ICouponsandRewards {

	@FindBy(locator = "dw.teacher.coupon.manual.input")
	private WebElement inputCouponCode;

	@FindBy(locator = "dw.teacher.coupon.manual.input")
	private WebElement couponCodeApplyButton;

	@FindBy(locator = "dw.teacher.coupon.bonus.txt.css")
	private WebElement txtBonusFlatDollars;

	@FindBy(locator = "dw.teacher.coupon.bonus.number.css")
	private WebElement txtBonusFlatCouponNumber;
	
	@FindBy(locator="txtupsellMessageShippingpage")
	private WebElement txtupsellShippingHandlingMessage;
	
	@FindBy(locator ="txtupsellShippingHandlingElement")
	private List<WebElement> elementUpsellShippingMessage;	
	
	@FindBy(locator="couponpage.button.backtoshop")
	private WebElement backButtonCouponPage;
		
    public WebElement getTxtBonusFlatDollars() {
		return txtBonusFlatDollars;
	}

	public WebElement getinputCouponCodeTextField() {
		return inputCouponCode;
	}
	
	public WebElement getCouponCodeApplyButton() {
		return couponCodeApplyButton;
	}
	
	public WebElement getbackButtonCouponPage(){
		return backButtonCouponPage;
	}
	
	@Override
	public void enterCouponCode() {
		getinputCouponCodeTextField().sendKeys("test");
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
	}

	@Override
	public void clickonCouponCodeApplyButton() {
		getCouponCodeApplyButton().click();
	}

	@Override
	public void verifyTeacherReceivesFlatBonusDollars() {
		PauseUtil.pause(3000);
		String txtBonusFlatDollars = getTxtBonusFlatDollars().getText();
		Assert.assertEquals(txtBonusFlatDollars, ConstantUtils.BONUS_FLAT_DOLLARS_TEXT);
	}

	@Override
	public void verifyTeacherBonusFlatCouponNumber() {
		Assert.assertEquals(getTxtBonusCouponNumber().getText(), ConstantUtils.BONUS_FLAT_COUPON_NUMBER);
	}
	
	public List<WebElement> getelementUpsellShippingMessage(){
		return elementUpsellShippingMessage;
	}
	
	
	public WebElement getTxtupsellShippingHandlingMessage(){
		return txtupsellShippingHandlingMessage;
	}
	
	public WebElement getTxtBonusCouponNumber() {
		return txtBonusFlatCouponNumber;
	}
	
	@Override
	public void verifyShippingHandlingUpsellMessage() {
		AssertUtils.assertDisplayed(txtupsellShippingHandlingMessage);
		Assert.assertTrue(ConstantUtils.shippingUpsellMessage
				.equalsIgnoreCase(txtupsellShippingHandlingMessage.getText()),
				"Shipping Upsell Message is not displayed or not as per the expected value");
	}

	@Override
	public void verifyShippingHandlingUpsellMessageNotDisplayed() {
		Assert.assertTrue(elementUpsellShippingMessage.size() == 0,
				"Upsell Message should not be displayed for Free Shipping");
	}

	@Override
	public void clickonBacktoShopButton() {
		getbackButtonCouponPage().click();
	}
}
