package com.dw.automation.pages;

public interface CustomerCreateAndApprovePage {

	void goToCustomerPage();

	String createCustomer();

	void bamApproveCustomer(String domainName, String status);

	void customerStatus(String domainName, String status);

	void updateCustSpendLimit(String domainName);

	void approveCaSpendLimit(String status);

	void verifyCustCreditStatus(String status);

}
