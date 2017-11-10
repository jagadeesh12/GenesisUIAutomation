Feature: LoginPage - RCO Authentication - Login - Using Email/Password in addition to Account Number/ Password
	This feature is to validate the LoginPage : Teacher - RCO Authentication scenarios

 
Background: 
	Given teacher open rco-scholastic web site


@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@1
Scenario Outline:Teacher enters non existing account number and password on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters non-existing account number in account number/email field and password
	And teacher clicks on login button
	Then tool tip error message displays for invalid credentials
	#And the AcNum or email address and password field is highlighted in yellow
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:Teacher_AccountLogin_InvalidAccountPassword	|
  
  
@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@2
Scenario Outline:Teacher enters valid email address and incorrect password on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters valid email address and incorrect password
	And teacher clicks on login button
	Then tool tip error message displays for invalid credentials
	#And the AcNum or email address and password field is highlighted in yellow
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:Teacher_AccountLogin_ValidEmailInValidPassword	|  
  

@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@3
Scenario Outline:Teacher enters email address without domain in email field on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters email address without domain in account number or email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays in Login page
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:Teacher_AccountLogin_Email_MissingDomain	|
  

@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@4
Scenario Outline:Teacher does not enter email or account number but enters password:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher does not enter account number but enters password in password field
	And teacher clicks on login button
	Then tool tip error message 'Please enter your account number or account email.' displays
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 											|
  | InSprint14.4:TCOD:Teacher_AccountLogin_BlankAccount	|
  
 
@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@5
Scenario Outline:Teacher does not enter Password but enters email or account number:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters account number but does not enter password in password field
	And teacher clicks on login button
	Then tool tip error message 'Please enter your password.' displays
	#And the Password field is highlighted in yellow color
	
Examples:
  | UsingData 												|
  | InSprint14.4:TCOD:Teacher_AccountLogin_BlankPassword	|
  
 
@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@6
Scenario Outline:Teacher enters valid email and password:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters valid email and password
	And teacher clicks on login button
	Then teacher Home page displays
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:Teacher_AccountLogin_ValidUserEmailPassword	|
  
  
@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@7
Scenario Outline:Teacher enters email address with multiple at the rate sign in email field on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters email address with multiple '@' sign in account number or email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays in Login page
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:Teacher_AccountLogin_Email_Multiple@Signs	|
  

@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@8
Scenario Outline:Teacher enters email address with multiple dots in email field on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters email address with multiple dots in account number or email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays in Login page
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:Teacher_AccountLogin_Email_MultipleDots	|
  

@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@9
Scenario Outline:Teacher enters email address with multiple dots and invalid top level domain in email field on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters email address with multiple dots and invalid top level doamain in account number or email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays in Login page
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 																		|
  | InSprint14.4:TCOD:Teacher_AccountLogin_Email_MultipleDots_InvalidTopLevelDoamin	|
 
  
@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@10
Scenario Outline:Teacher enters non-existing email address and password on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters non-existing email address in account number/email field and password
	And teacher clicks on login button
	Then tool tip error message displays for invalid credentials
	#And the AcNum or email address and password field is highlighted in yellow
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:Teacher_AccountLogin_InvalidEmailPassword	|
  

@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@11
Scenario Outline:Teacher enters email address without dot in email field on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters email address without dot in account number or email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays in Login page
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 												|
  | InSprint14.4:TCOD:Teacher_AccountLogin_Email_MissingDot	|
  

@LoginPage
@Priority1
@SCSCOD-6297
@Sprint-14.4
@12
Scenario Outline:Teacher enters email address without top level domain in email field on Login page:[<UsingData>]

	Given teacher has valid reading clubs account and navigates to login page
	When teacher enters email address without top level domain in account number or email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays in Login page
	#And account number or email field is highlighted in yellow
	
Examples:
  | UsingData 															|
  | InSprint14.4:TCOD:Teacher_AccountLogin_Email_MissingTopLevelDomain	|
  
          