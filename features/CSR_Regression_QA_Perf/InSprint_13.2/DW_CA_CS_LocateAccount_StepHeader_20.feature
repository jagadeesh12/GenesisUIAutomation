Feature: Locate Account - Step Header
	This feature is to validate the Locate Account - Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@LocateAccount_StepHeader
@DWCACSR-20
@Priority1
@1
Scenario Outline:Locate Account tab highlights in the step indicator when CSR enters into the Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
    Then [Locate Account] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               		|
  | Perf_QA_Locate_Account_tab_highlights	|		
  

@LocateAccount_StepHeader
@DWCACSR-20
@Priority1
@2
Scenario Outline:Number of the LOCATE ACCOUNT page displays correctly in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then the step header number for the [Locate Account] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  			|
  | Perf_QA_Number_for_the_Locate_Account_tab	|	
  
  
           