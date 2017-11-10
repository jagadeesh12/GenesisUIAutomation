Feature: Login and Logout
	Test the logging in and logging out of PROD
	
Background:
	Given teacher open rco-scholastic web site

Scenario Outline: Redo submitted and deleted orders:[<UsingData>] 

	Given parents login, add items and submit orders on the PCOD site

Examples:
|UsingData|
||