package com.dw.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface PCOD_ISubmitYourOrderPage {

	void pcod_verify_submityourorderpage_stepheader();

	void pcod_verify_element_highlighted(WebElement element);

	void pcod_verify_element_notclickbale(List<WebElement> element);

    void clickheaderpayment();

    void clicksubmitOrder_SubmitOrderPage();

    WebElement getpagetitleconfirmSubmit();

    WebElement getButtonsubmitOrder();

    void verifypagetitleOrderconfirmationpage();

    WebElement getpagetitleorderconfirmationpage();

	void verifycontentassetOrderconfirmationpage();

	void verifyordernumberOrderconfirmationpage();

	void verifyhomeicon_confirmationpage();

	void verify_childname_teachername_orderdetail();

	void verify_totalqty_submitorder_orderdetail();

	void verify_alldata_iteminformation_submitpage();

	void verify_alldata_freeiteminformation_submitpage();

	void verify_alldata_iteminformation_1item_2freeitems_submitpage();

	void pcod_confirmpage_logout();
}
