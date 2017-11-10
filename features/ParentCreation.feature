Feature: Parent Creation
	Creating Parent with 1 child and 1 teacher
  
Scenario Outline: Get teacher name, school address and school name:[<UsingData>]

	Given teacher open rco-scholastic web site
	And teachers log in, and their profile information are stored in an Excel sheet
	
Examples:
|UsingData|
|TeacherScenarios:GetTeacherInfo|



Scenario Outline: Parent with 1 child and 1 teacher:[<UsingData>]

Given Parent opens scholastic reading clubs e-commerce site
And parent creates an account with one child
	
Examples:
|UsingData|
|PCOD:ParentCreation_1child_1teacher|



#Scenario Outline: Parent with with 2 childs and 1 teacher:[<UsingData>]
#
#And parent creates an account and navigate to Add a Child window
#And parent creates an account with two childs
#
#Examples:
#|UsingData|
#|PCOD:ParentCreation_2child_1teacher|