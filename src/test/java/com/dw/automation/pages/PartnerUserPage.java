package com.dw.automation.pages;

public interface PartnerUserPage {

	void loginApplication();
	String fillPartnerUserForm();
	String fillFMUserForm();
	String gettingVerificationCode(String email);
	void launchMailApplication();
	String loginUserCredentials(String email, String verificationCode);
	String resetPassword(String verificationCode);
	void viewUserDetails(String email);
	void launchApplication();
}
