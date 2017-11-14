package com.dw.automation.pages;

public interface OrgCreateAndApprovePage {

	void goToOrgPage();

	String fillOrgForm();

	void loginApplicationAsBAM();

	void approveOrg(String domainName, String status);

	void approveOrgAsCA(String domainName, String status);

	void verifyOrg(String domainName, String status);

	void loginApplicationAsCA();

}
