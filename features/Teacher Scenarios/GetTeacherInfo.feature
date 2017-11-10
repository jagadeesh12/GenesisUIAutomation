Feature: Get Teacher's Information
	Get the teacher's name, school address and school name
	
Scenario Outline: Get teacher name, school address and school name :[<UsingData>]
	Given teacher open rco-scholastic web site
	And teachers log in, and their profile information are stored in an Excel sheet
Examples:
|UsingData|
|TeacherScenarios:GetTeacherInfo|