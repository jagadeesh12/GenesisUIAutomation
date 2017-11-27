package com.dw.api.automation.steps;

import javax.ws.rs.core.NewCookie;

import com.dw.api.automation.libs.CertificateHandle;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateMPNid {
	
	NewCookie cook=null;
	LoginPost lgoin=new LoginPost();
	Get get=new Get();
	
	
	
	
	@Given("^Login to Application$")
    public void login_to_application()  {
		
	try {
		CertificateHandle.IgnoreSSLClient();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String posturl="https://test.redington.market/api/v1/auth/signIn";
	String postparm="{\"username\":\"pm6.qa@mailinator.com\",\"password\":\"Pass@123\"}";
	NewCookie cook=lgoin.loginGetPostByJersey(posturl, postparm);
	System.out.println("Cookie as Token paramter="+cook);
	
    }

    @When("^Enter MPN id$")
    public void enter_mpn_id() {
    
    	String posturl3="https://test.redington.market/api/v1/partnerEntity/verifyMPN/99145";
    	get.getRestServiceMethod(posturl3, cook);
    }

    @Then("^MPN id is validated$")
    public void mpn_id_is_validated()  {
       System.out.println("Done");
    }

}
