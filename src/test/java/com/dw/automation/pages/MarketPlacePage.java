package com.dw.automation.pages;

public interface MarketPlacePage {
	void loginApplicationAsPM();

	void addProductToCart();

	void logout();

	void loginApplicationAsFM();

	String getOrderNumber();

	String order(String orderNumber, String status);

	String orderStatus(String orderNumber);

	void addBaseProducts();

	void addAddOnProducts();

	void provisionProducts();

	void goToApprovedProduct();

	
}
