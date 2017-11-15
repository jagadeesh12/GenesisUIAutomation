package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.OrgCreateAndApprovePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.dw.automation.pages.CustomerCreateAndApprovePage;
public class CustomerCreateAndApprove {
	
	CustomerCreateAndApprovePage cca = getFactory().getCustCreateAndApprovePage();
	String domainName;
	String status;
	@When("^I go to Customer Page$")
	public void i_go_to_Customer_Page() throws Throwable {
		cca.goToCustomerPage();
	}

	@Then("^I create an Customer$")
	public void i_create_an_Customer() throws Throwable {
		domainName = cca.createCustomer();
	}

	@Then("^I approve the customer$")
	public void i_approve_the_customer() throws Throwable {
		
		status = "Approve";
		cca.bamApproveCustomer(domainName,status);
	}

	@Then("^I verify that the customer is approved$")
	public void i_verify_that_the_customer_is_approved() throws Throwable {
		//domainName = "www.Pm12345681.com";
		status = "Approve";
		cca.customerStatus(domainName,status);
	}
	
	@Given("^I reject the customer$")
	public void i_reject_the_customer() throws Throwable {
		status = "Reject";
		cca.bamApproveCustomer(domainName,status);
	}

	@Given("^I verify that the customer is rejected$")
	public void i_verify_that_the_customer_is_rejected() throws Throwable {
		status = "Reject";
		cca.customerStatus(domainName,status);
	}

}
