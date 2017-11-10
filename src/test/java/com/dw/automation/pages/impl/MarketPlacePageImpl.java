package com.dw.automation.pages.impl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.MarketPlacePage;
import com.dw.automation.support.PauseUtil;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

public class MarketPlacePageImpl extends BaseTestPage<TestPage> implements MarketPlacePage{
	PartnerUserPageImpl pupi = new PartnerUserPageImpl();
	
	@FindBy(locator = "rd.pm.homepage.txtbox.search")
	private WebElement searchTxtBox;
	
	@FindBy(locator = "rd.pm.homepage.btn.search")
	private WebElement searchBtn;
	
	@FindBy(locator = "rd.pm.orderspage.btn.buy")
	private WebElement buyBtn;
	
	@FindBy(locator = "rd.pm.orderspage.btn.addToBasket")
	private WebElement addToBasketBtn;
	
	
	@FindBy(locator = "rd.pm.orderspage.popup.orderPlacementMsg")
	private WebElement orderPlacementMsgConfirmation;
	
	@FindBy(locator = "rd.pm.orderspage.popup.closeBtn")
	private WebElement popUpCloseBtn;
	
	@FindBy(locator = "rd.pm.orderspage.basket.icon")
	private WebElement basketOptionIcon;
	
	
	@FindBy(locator = "rd.pm.orderspage.basket.option.viewAll")
	private WebElement viewAllOption;
	
	
	@FindBy(locator = "rd.pm.basketpage.productlist.productName")
	private WebElement productNameTxt;
	
	
	@FindBy(locator = "rd.pm.basketpage.selectbox.customer")
	private WebElement customerSelectDrpDwn;
	
	
	@FindBy(locator = "rd.pm.basketpage.btn.placeOrder")
	private WebElement placeOrderBtn;
	
	@FindBy(locator = "rd.pm.basketpage.popup.errormsg")
	private WebElement errorMsgPopUp;
	
	
	public WebElement geterrorMsgPopUp() {
		return errorMsgPopUp;
	}	
	
	public WebElement getplaceOrderBtn() {
		return placeOrderBtn;
	}	
	
	public WebElement getcustomerSelectDrpDwn() {
		return customerSelectDrpDwn;
	}	
	
	public WebElement getproductNameTxt() {
		return productNameTxt;
	}	
	
	
	public WebElement getviewAllOption() {
		return viewAllOption;
	}	
	
	public WebElement getpopUpCloseBtn() {
		return popUpCloseBtn;
	}	
	
	public WebElement getorderPlacementMsgConfirmation() {
		return orderPlacementMsgConfirmation;
	}	
	
	public WebElement getaddToBasketBtn() {
		return addToBasketBtn;
	}	
	
	public WebElement getbuyBtn() {
		return buyBtn;
	}	
	
	public WebElement getsearchBtn() {
		return searchBtn;
	}	
	
	public WebElement getsearchTxtBox() {
		return searchTxtBox;
	}	
	
	WrapperFunctions wf = new WrapperFunctions();
	
	@Override
	public void loginApplicationAsPM() {
		System.out.println("Order Placement started.");
		String username = TestBaseProvider.getTestBase().getTestData().getString("userid");
		String password = TestBaseProvider.getTestBase().getTestData().getString("password");
		pupi.login(username,password);
        PauseUtil.waitForAjaxToComplete(4000);

	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	
	public void addProductToCart() {
		
		PauseUtil.waitTillDisappear(pupi.getloadinImg(), 80);
		getsearchTxtBox().sendKeys("Office 365");
		wf.click_element(getsearchBtn());
		PauseUtil.waitTillDisappear(pupi.getloadinImg(), 80);
		
	}

}
