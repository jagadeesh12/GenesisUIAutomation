Feature: LoginPage - RCO Authentication - Account Activation Modal - Add hyperlink to Forgotten Credentials workflow
	This feature is to validate the LoginPage : Teacher - RCO Authentication scenarios

 
Background: 
	Given teacher open rco-scholastic web site


@LoginPage
@Priority1
@SCSCOD-6316
@Sprint-14.4
@1
Scenario Outline:Teacher sees Forgot your Account Number or Email Address hyper link in Activate Your Account window:[<UsingData>]
	
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	Then teacher is navigated to 'Activate Your Account' window
	And teacher sees 'Forgot your Account Number or Email Address?' hyper link below email address field
	
Examples:
  | UsingData 																|
  | InSprint14.4:TCOD:Forgot_Your_Account_Number_Or_Email_Address_hyperlink	|
  

@LoginPage
@Priority1
@SCSCOD-6316
@Sprint-14.4
@2
Scenario Outline:Teacher leaves any one of the fields as blank in Activate Your Account window:[<UsingData>]
	
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	And teacher is navigated to 'Activate Your Account' window
	When teacher enters valid account number leaving email field as blank
	Then NEXT button is disabled
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:Forgot_Your_Account_Number_Or_Email_Address_hyperlink_BlankFields	|
  
  
@LoginPage
@Priority1
@SCSCOD-6316
@Sprint-14.4
@3
Scenario Outline:Teacher leaves any one of the fields as blank in Activate Your Account window_2:[<UsingData>]
	
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	And teacher is navigated to 'Activate Your Account' window
	When teacher enters email field leaving account number as blank
	And NEXT button is disabled
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:Forgot_Your_Account_Number_Or_Email_Address_hyperlink_BlankFields_2	|  
  
 
@LoginPage
@Priority1
@SCSCOD-6316
@Sprint-14.4
@4
@123
Scenario Outline:Teacher clicks on '?' icon for Account number field in Activate Your Account window:[<UsingData>]
	
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	And teacher is navigated to 'Activate Your Account' window
	When teacher clicks on '?' icon of Account number field
	Then teacher sees 'Your account number can be found on the top right corner of your packing slip.' window message
	When teacher clicks on '?' icon of email field
	And teacher sees 'Enter the email address associated with your account number.' message
	
Examples:
  | UsingData 																|
  | InSprint14.4:TCOD:Forgot_Your_Account_Number_Or_Email_Address_IconInfo	|  
  
 