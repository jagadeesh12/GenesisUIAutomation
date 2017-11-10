Feature: Verify Account - First Time Teacher – Modal
	This feature is to validate the Verify Account - First Time Teacher – Modal scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@DWCACSR-76
@Priority1
@1
Scenario Outline:First time Teacher modal does not show up for an existing teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page for 1st time Teacher
	Then First time teacher modal does not show up
	
Examples:
  | UsingData 									|
  | Perf_QA_VerifyAccount_ExistingTeacher_NoModalWindow	|		
  

@VerifyAccount
@DWCACSR-76
@Priority1
@2
Scenario Outline:CSR can close the First time teacher modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page for 1st time Teacher
    When CSR clicks on Close icon (X) on the top right of the window
    Then Verify Account page displays
	
Examples:
  | UsingData 										|
  | Perf_QA_VerifyAccount_NewTeaching_ModalWindow_CloseIcon	|		
  

@VerifyAccount
@DWCACSR-76
@Priority1
@3
Scenario Outline:First time Teacher modal displays when CSR searches for a new teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page for 1st time Teacher
    Then a modal window displays with title 'Instructions for CSR'
	And a 'X' icon positioned to the top-right of the window displays
	And a paragraph of text within the main content area which states 'Welcome to Reading Club!'
	
Examples:
  | UsingData 								|
  | Perf_QA_VerifyAccount_NewTeaching_ModalWindow	|
  
  		
      