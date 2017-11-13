package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.OrgCreateAndApprovePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgCreateAndApproveSteps {
	OrgCreateAndApprovePage oca = getFactory().getOrgCreateAndApprovePage();
	public String domainName;
	@When("^I go to Organization Page$")
	public void i_go_to_Organization_Page() throws Throwable {
		oca.goToOrgPage();
	}

	@Then("^I onboard an Organization$")
	public void i_onboard_an_Organization() throws Throwable {
		domainName = oca.fillOrgForm();
		System.out.println("DOMAIN NAME"+domainName);
	}
	
	@Then("^I launch the application as a BAM$")
	public void i_launch_the_application_as_a_BAM() throws Throwable {
		oca.loginApplicationAsBAM();
	}

	@Then("^I approve the organization$")
	public void i_approve_the_organization() throws Throwable {
		oca.approveOrg(domainName);
	}

}
