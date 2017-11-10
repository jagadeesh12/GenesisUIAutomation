package com.dw.automation.beans;

public class ForgotAccountInfoBean {

	private String firstName;
	private String lastName;
	private String schoolZip;
	private String emailAddress;
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchoolZip() {
		return schoolZip;
	}

	public void setSchoolZip(String schoolZip) {
		this.schoolZip = schoolZip;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
