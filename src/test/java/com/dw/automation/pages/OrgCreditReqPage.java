package com.dw.automation.pages;

public interface OrgCreditReqPage {

	void applyForCredit(String domainName);

	void creditRequest(String domainName, String status);

	void verifyCreditReqStatus(String domainName, String status);

}
