package com.dw.automation.pages;

import org.apache.commons.configuration.Configuration;

import com.dw.automation.sections.IProductOrderSummarySection;

public interface IStudentOnlineOrdersPage {
	IProductOrderSummarySection getProductOrderSummarySection();

	void verifySOOOrders();

	void verifySOOPage();

	void fillSOOProductBean();

	void verifySOOTabActive();

	void verifyItemTotalCountOnSOOTab();

	void removeSOOItemsFromTable(Configuration data, String status);

	void verifyDeleteOptionModel();

	void removeFirstSOOItemFromTable();

	void verifySOOorderDetailHeader();

	void verifySOOorderDetail();

	void selectStudentOnlineOrdersFromEnterOrder();

	void verifyEnterOrdersTabActive();

	void verifyYourTeacherOrderOnTopAndBottom();

	void verifyItemNumberAndTitleClickable();

	void verifyStudentOnlineOrderSection();

	void displayOrderTotalPrice();

	void displayStudentNameAndDateOnlineOrderSection();

	void checkSubOrderTotal();

	void checkOrderFinalAmount();

	void checkItemSubQuentity();

	void checkItemTotalQuentity();

	void removeSOOItemByChildName(Configuration data);

	void verifydetailProductDescription();

	void verifyEmptySOOOrder();

	void verifynotaxesinsoopage();

}