Feature: LoginPage : All Users - RCO Authentication - Forgotten Credentials - Forgot Account Number or Email modal
	This feature is to validate the LoginPage : Forgot Account Number or Email modal scenarios

 
Background: 
	Given teacher open rco-scholastic web site


@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@1
Scenario Outline:Teacher enters email address with multiple '@' sign on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters email address with multiple '@' sign in account number/email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays
	And account number email field is highlighted in yellow
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_Email_Multiple@Signs	|
  

@LoginPage
@Priority1
@SCSCOD-6321
@Sprint-14.4
@2
Scenario Outline:Enter valid data in all fields and does not enter only First Name on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters valid data in all the fields except First Name field
	Then CONTINUE button is disabled
	
Examples:
  | UsingData 																|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_EnterAllData_ExceptFirstName	|
  

@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@3
Scenario Outline:Teacher enters email address with multiple dots on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters email address with multiple dots in account number/email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays
	And account number email field is highlighted in yellow
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_Email_MultipleDots	|
  

@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@4
Scenario Outline:Enter more than 30 characters in Last Name field on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters more than 30 characters in Last name field
	Then Last name field should not accept more than 30 characters
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_LastName30characters	|
  

@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@5
Scenario Outline:Teacher enters email address with multiple dots and invalid top level domain on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters email address with multiple dots and invalid top level doamain in account number email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays
	And account number email field is highlighted in yellow
	
Examples:
  | UsingData 																			|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_Email_MultipleDots_InvalidTopLevelDoamin	|
  

#@LoginPage
#@Priority2
#@SCSCOD-6321
#@Sprint-14.4
#@6
#Scenario Outline:Enter special characters except “'” in Last Name field on the Forgot Password modal/page:[<UsingData>]
#	
#	Given teacher has valid reading clubs account
#	And teacher navigates to the Canada Reading Clubs site
#	And teacher clicks on 'Forgot your login information?' link
#	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
#	When teacher enters any special character other than “'” in Last Name field
#	Then the special characters are ignored
#	
#Examples:
#  | UsingData 																|
#  | InSprint14.4:TCOD:ForgotPasswordModalPage_LastName_Specialcharacters	|
    
    
#@LoginPage
#@Priority2
#@SCSCOD-6321
#@Sprint-14.4
#@7
#Scenario Outline:Enter email or account number but enters other details on the Forgot Password modal/page:[<UsingData>]
#	
#	Given teacher has valid reading clubs account
#	And teacher navigates to the Canada Reading Clubs site
#	And teacher clicks on 'Forgot your login information?' link
#	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
#	When teacher enters first name and last name
#	And clicks on account number/email address field but leave it blank and click outside
#	Then tool tip error message “Please provide your account number or account email.” displays
#	And email address field is highlighted in yellow
#	
#Examples:
#  | UsingData 														|
#  | InSprint14.4:TCOD:ForgotPasswordModalPage_BlankAccount_Email	|
    
    
@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@8
Scenario Outline:Last Name field is highlighted in red if clicked inside the first name field and clicks outside without entering any data on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher clicks inside last name field and does not enter any data
	And clicks inside First Name field
	Then Last Name field is highlighted in Yellow bordered with red color
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_LastName_Empty	|
    
 
@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@9
Scenario Outline:Enter 2 characters in First name and Last name on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters 2 characters in both first name and last name fields
	Then Continue button is enabled
	
Examples:
  | UsingData 																|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_2Chars_ContinueBtn_Enabled	|
    

@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@10
Scenario Outline:Enters only 1 character in Last Name field on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters only one character in last name field
	And clicks outside or inside first name field
	Then Last Name field is highlighted in Yellow bordered with red color
	And tool tip message 'Please enter at least 2 characters.' displays for Last Name field
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_LastName_SingleChar	|
    

@LoginPage
@Priority1
@SCSCOD-6321
@Sprint-14.4
@11
@Manual
Scenario Outline:Teacher clicks "Forgot your Account Number or Email Address?" link present on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	Then teacher is navigated to the Forgot Account Number or Email Address modal/page of the Forgotten Credentials workflow
	And title as “Forgot your login information?”
	And modal sub-title as “Forgot Account Number or Email Address”
	And modal message as “Enter the following information to help us locate your account number or email address.”
	And text field with label as “FIRST NAME”
	And text field with label as “LAST NAME”
	And red asterisk (*) on left hand side of both first name and last name fields
	And text field with label as “ACCOUNT NUMBER/EMAIL”
	And label as "Fields marked with an asterisk (*) are required." is displayed under Account number/email field
	And CONTINUE button deactivated by default
	And close icon to the top right hand side of modal window
	
Examples:
  | UsingData 					|
  | InSprint14.4:TCOD:Manual:	|
    

@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@12
Scenario Outline:Enters 2 characters in Last Name field on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters two characters in last name field
	And clicks outside or inside first name field
	Then no error message displays for Last Name field
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_LastName_TwoChar	|
       
       
@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@13
Scenario Outline:Enter more than 30 characters in First Name field on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters more than 30 characters in First name field
	Then First name field should not accept more than 30 characters
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_FirstName30characters	|
     
     
@LoginPage
@Priority1
@SCSCOD-6321
@Sprint-14.4
@14
Scenario Outline:Enter valid data in all fields and does not enter only Last Name on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters valid data in all the fields except Last Name field
	Then CONTINUE button is disabled
	
Examples:
  | UsingData 																|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_EnterAllData_ExceptLastName	|


#@LoginPage
#@Priority2
#@SCSCOD-6321
#@Sprint-14.4
#@15
#Scenario Outline:Enter special characters except “'” in First Name field on the Forgot Password modal/page:[<UsingData>]
#	
#	Given teacher has valid reading clubs account
#	And teacher navigates to the Canada Reading Clubs site
#	And teacher clicks on 'Forgot your login information?' link
#	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
#	When Parent enters any special character other than single quote in First Name field
#	Then the special characters are ignored
#	
#Examples:
#  | UsingData 																|
#  | InSprint14.4:TCOD:ForgotPasswordModalPage_FirstName_Specialcharacters	|


@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@16
Scenario Outline:Enter email address without domain on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters email address without domain in account number/email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays
	And account number email field is highlighted in yellow
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_Email_MissingDomain	|


@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@17
Scenario Outline:First Name field is highlighted in red if clicked inside the first name field and clicks outside without entering any data on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher clicks inside first name field and does not enter any data
	And clicks inside of Last Name field
	Then First Name field is highlighted in Yellow bordered with red color
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_FirstName_Empty	|


@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@18
Scenario Outline:Enter email address without dot on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters email address without dot in account number/email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays
	And account number email field is highlighted in yellow
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_Email_MissingDot	|


@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@19
Scenario Outline:Enters only 1 character in First Name field on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters only one character in first name field
	And clicks outside or inside of last name field
	Then First Name field is highlighted in Yellow bordered with red color
	And tool tip message 'Please enter at least 2 characters.' displays for First Name field
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_FirstName_SingleChar	|
  
  
@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@20
Scenario Outline:Teacher enters email address without top level domain on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	When teacher enters email address without top level domain in account number/email field and click outside
	Then tool tip error message 'Please enter a valid email address.' displays
	And account number email field is highlighted in yellow
	
Examples:
  | UsingData 																|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_Email_MissingTopLevelDomain	|
  

@LoginPage
@Priority2
@SCSCOD-6321
@Sprint-14.4
@21
Scenario Outline:Enters 2 characters in First Name field on the Forgot Password modal/page:[<UsingData>]
	
	Given teacher has valid reading clubs account
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Forgot your login information?' link
	And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
	And teacher enters two characters in first name field
	When clicks outside or inside of last name field
	Then no error message displays for First Name field
	
Examples:
  | UsingData 													|
  | InSprint14.4:TCOD:ForgotPasswordModalPage_FirstName_TwoChar	|
  
                                            