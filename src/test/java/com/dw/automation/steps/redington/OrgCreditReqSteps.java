package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.OrgCreateAndApprovePage;
import com.dw.automation.pages.OrgCreditReqPage;
import com.dw.automation.pages.impl.PartnerUserPageImpl;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrgCreditReqSteps {
	OrgCreditReqPage ocp = getFactory().getOrgCreditreqImpl();
	public String domainName;
	public String status;
	@Then("^I apply for partner organization credit request$")
	public void i_apply_for_partner_organization_credit_request() throws Throwable {
		//domainName = OrgCreateAndApproveSteps.getEntityName();
		domainName = PartnerUserPageImpl.readXML("domain");
		ocp.applyForCredit(domainName);
	}

	@Then("^I approve the credit request$")
	public void i_approve_the_credit_request() throws Throwable {
		status = "Approve";
		ocp.creditRequest(domainName,status);
	}

	@Then("^I verify that the organization credit request is approved$")
	public void i_verify_that_the_organization_credit_request_is_approved() throws Throwable {
		status = "Approve";
		ocp.verifyCreditReqStatus(domainName,status);
	}
	
	@Given("^I go to Partner Organization Credit Request Page$")
	public void i_go_to_Partner_Organization_Credit_Request_Page() throws Throwable {
		
	}
	
	@Then("^I reject the credit request$")
	public void i_reject_the_credit_request() throws Throwable {
		status = "Reject";
		ocp.creditRequest(domainName,status);
	}

	@Then("^I verify that the organization credit request is rejected$")
	public void i_verify_that_the_organization_credit_request_is_rejected() throws Throwable {
		status = "Reject";
		ocp.verifyCreditReqStatus(domainName,status);
	}

}
