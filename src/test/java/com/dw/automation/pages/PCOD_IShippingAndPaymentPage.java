package com.dw.automation.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface PCOD_IShippingAndPaymentPage {

	void verify_childinfo_shippingpage(Configuration testData);

	void verify_child2info_shippingpage(Configuration testData);

	void verify_child3info_shippingpage(Configuration testData);

	void verify_pcod_footersection();

	void verify_shippingpayment_details_remainsame();

	void pcod_addNewCreditCard(Configuration data) throws AWTException;

	void pcod_child2_teacherdetails(String child) throws IOException;

	void pcod_child1_teacherdetails(String child) throws IOException;

	void pcod_child3_teacherdetails(String child) throws IOException;

	void verify_itemwise_totalprice_paymentpage(List<WebElement> item1size, WebElement item1,
			List<WebElement> item2size, WebElement item2, List<WebElement> item3size, WebElement item3,
			List<WebElement> item4size, WebElement item4);

	void verify_items_subtotal_paymentpage(List<WebElement> item1size, WebElement item1, List<WebElement> item2size,
			WebElement item2, List<WebElement> item3size, WebElement item3, List<WebElement> item4size,
			WebElement item4, WebElement items_subtotal);

	void verify_items_totalamountdue_paymentpage(WebElement items_subtotal, WebElement items_tax_subtotal,
			WebElement items_totalamtdue);

	void verify_items_GST_taxes_shoppingcart(List<WebElement> item1size, WebElement item1, WebElement qty1,
			List<WebElement> item2size, WebElement item2, WebElement qty2, List<WebElement> item3size, WebElement item3,
			WebElement qty3, List<WebElement> item4size, WebElement item4, WebElement qty4);

	void verify_items_subtotal_tax_paymentpage(WebElement tax_subtotal);

	void verify_items_subtotal_tax_2Provinces_paymentpage(WebElement tax_subtotal);

	void verify_items_subtotal_tax_4Provinces_paymentpage(WebElement tax_subtotal);

	void pcod_addNewCreditCard_ExceptExpiryMonthYear(Configuration data) throws AWTException;

    void clickpcod_shippingpayment_saveCreditCard();

    void verifysavedCard_paymentpage(String savedcard);
    
    WebElement getsavedcardlist();

	void pcod_singlechild_teacherdetails(String child) throws IOException;

	void pcod_addNewCreditCard(Configuration data, int parentNumber) throws AWTException;


}
