package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;

public interface IStudentOnlineOrdersCartSection {

	int getNumberOfStudents();

	void fillSOOProductBean();

	void removeSOOItemsFromStudentTable(Configuration data, String confirmationStatus);

	void verifyUpdatedRecordsAfterRemoval(Configuration testData);

	void verifyItemsOnSOOCart();

	void verifySOOFunctionalities();

	void clickOnAnySOOItem();

	void verifyExpandedInfo();
}
