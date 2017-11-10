Feature: LoginPage : Teacher - RCO Authentication - Account Activation Fail Modal - Add hyperlink to Forgotten Credentials workflow
	This feature is to validate the LoginPage : Teacher - RCO Authentication scenarios

 
Background: 
	Given teacher open rco-scholastic web site


@LoginPage
@Priority1
@SCSCOD-6317
@Sprint-14.4
@1
Scenario Outline:Teacher provides invalid account number through Account Activation process:[<UsingData>]
	
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	When teacher provides invalid account number
	And valid email address and clicks on NEXT button
	Then teacher is presented with Account Activation fail modal
	And modal header as 'Account Not found'
	And teacher sees 'Forgot your Account Number or Email Address?' hyper link
	And close icon at top right corner of the modal window
	And BACK button enabled by default
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:AccountActivationFlow_IncorrectAccountNumber	|
  

@LoginPage
@Priority1
@SCSCOD-6317
@Sprint-14.4
@2
Scenario Outline:Teacher provides invalid email address through Account Activation process:[<UsingData>]
	
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	When teacher provides valid account number
	And invalid email address and clicks on NEXT button
	Then teacher is presented with Account Activation fail modal
	And modal header as 'Email Not Match'
	And teacher sees 'Forgot your Account Number or Email Address?' hyper link
	And close icon at top right corner of the modal window
	And BACK button enabled by default
	
Examples:
  | UsingData 														|
  | InSprint14.4:TCOD:AccountActivationFlow_IncorrectEmailAddress	|
  
 
@LoginPage
@Priority1
@SCSCOD-6317
@Sprint-14.4
@3
Scenario Outline:Teacher clicks on BACK button through 'Activate Your Account' flow:[<UsingData>]
	
	#Given teacher prints the data from Excel
	Given teacher has valid reading clubs account but not enabled
	And teacher navigates to the Canada Reading Clubs site
	And teacher clicks on 'Activate Your Account' option
	And teacher provides either invalid account number or email address and clicks on NEXT button
	When teacher clicks on BACK button
	Then teacher is navigated back to 'Activate Your Account' window
	
Examples:
  | UsingData 											|
  | InSprint14.4:TCOD:AccountActivationFlow_BackButton	|
    

@LoginPage
@Priority1
@SCSCOD-6317
@Sprint-14.4
@4
Scenario Outline:Teacher clicks on BACK button through 'Activate Your Account' flow2:[<UsingData>]
	
	Given teacher prints the data from Excel
	
Examples:
  | UsingData 											|
  | InSprint14.4:TCOD:AccountActivationFlow_BackButton	|
  
  
@LoginPage
@Priority1
@SCSCOD-6317
@Sprint-14.4
@5
Scenario Outline:Teacher clicks on BACK button through 'Activate Your Account' flow3:[<UsingData>]
	
	Given teacher prints the data from Excel
	
Examples:
  | UsingData 											|
  | InSprint14.4:TCOD:AccountActivationFlow_BackButton	|  
    
 