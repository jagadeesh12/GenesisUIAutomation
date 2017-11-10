Feature: Locate Account - Search Results – Step Header
	This feature is to validate the Locate Account - Search Results – Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@LocateAccount_SearchResults_StepHeader
@DWCACSR-1523
@Priority1
@1
Scenario Outline:Locate Account tab highlights in the step indicator when CSR enters into the Locate Account Search Results page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
    Then [Locate Account] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               					|
  | SearchResults_Locate_Account_tab_highlights	|		
  

@LocateAccount_SearchResults_StepHeader
@DWCACSR-1523
@Priority1
@2
Scenario Outline:Number of the LOCATE ACCOUNT page displays correctly in a bubble containing step header in a Search Results:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then the step header number for the [Locate Account] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  						|
  | SearchResults_Number_for_the_Locate_Account_tab	|	
  
  
         