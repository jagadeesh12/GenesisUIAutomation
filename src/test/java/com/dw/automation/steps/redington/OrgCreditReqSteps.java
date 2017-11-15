package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.OrgCreateAndApprovePage;
import com.dw.automation.pages.OrgCreditReqPage;

import cucumber.api.java.en.Then;

public class OrgCreditReqSteps {
	OrgCreditReqPage ocp = getFactory().getOrgCreditreqImpl();
	public String domainName;
	@Then("^I apply for partner organization credit request$")
	public void i_apply_for_partner_organization_credit_request() throws Throwable {
		domainName = OrgCreateAndApproveSteps.getEntityName();
		ocp.applyForCredit(domainName);
	}

	@Then("^I approve the credit request$")
	public void i_approve_the_credit_request() throws Throwable {
		ocp.creditRequestBAM(domainName);
	}

	@Then("^I verify that the organization credit request is approved$")
	public void i_verify_that_the_organization_credit_request_is_approved() throws Throwable {

	}
}
