package com.dw.automation.beans;

import org.apache.commons.configuration.Configuration;

public class UserProfileBean {

	private String name;
	private String email;
	private String phone;
	private String school;
	private String address;
	private String city;
	private String zip;
	private String childTeacher;
	private String childName;
	private String childGrade;
	private String cac;
	private String gradeOrSpeciality;
	private Configuration parent;

	private Configuration teacher_cc;

	private Configuration parent_cc;

	public Configuration getParent() {
		return parent;
	}

	public void setParent(Configuration parent) {
		this.parent = parent;
	}

	public Configuration getTeacher_cc() {
		return teacher_cc;
	}
	
	public String getGradeOrSpeciality() {
		return gradeOrSpeciality;
	}

	public void setTeacher_cc(Configuration teacher_cc) {
		this.teacher_cc = teacher_cc;
	}

	public Configuration getParent_cc() {

		return parent_cc;

	}

	public void setParent_cc(Configuration parent_cc) {

		this.parent_cc = parent_cc;

	}
	public String getCac() {
		return cac;
	}

	public void setCac(String cac) {
		this.cac = cac;
	}

	public String getChildGrade() {
		return childGrade;
	}

	public void setChildGrade(String childGrade) {
		this.childGrade = childGrade;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getChildTeacher() {
		return childTeacher;
	}

	public void setChildTeacher(String childTeacher) {
		this.childTeacher = childTeacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "UserProfileBean [name=" + name + ", email=" + email + ", phone=" + phone
				+ ", school=" + school + ", address=" + address + ", city=" + city
				+ ", zip=" + zip + ", childTeacher=" + childTeacher + ", childName="
				+ childName + ", childGrade=" + childGrade + "]";
	}

}
