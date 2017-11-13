package com.dw.automation.pages;

public interface OrgCreateAndApprovePage {

	void goToOrgPage();

	String fillOrgForm();

	void loginApplicationAsBAM();

	void approveOrg(String domainName);

}
