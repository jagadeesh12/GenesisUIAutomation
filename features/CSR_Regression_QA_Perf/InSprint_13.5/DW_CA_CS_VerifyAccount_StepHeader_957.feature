Feature: Verify Account - Step Header
	This feature is to validate the Verify Account - Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@VerifyAccount_StepHeader
@DWCACSR-957
@Priority1
@1
Scenario Outline:Verify Account tab highlights in the step indicator when CSR enters into the Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on Teacher's Name in Search Results
    Then [Verify Account] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               					|
  | Perf_QA_SearchResults_Verify_Account_tab_highlights	|		
  

@VerifyAccount_StepHeader
@DWCACSR-957
@Priority1
@2
Scenario Outline:Number of the VERIFY ACCOUNT page displays correctly in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on Teacher's Name in Search Results
	Then the step header number for the [Verify Account] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  						|
  | Perf_QA_SearchResults_Number_for_the_Verify_Account_tab	|	
  
  
           