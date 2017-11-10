Feature: Review Cart - Step Header
	This feature is to validate the Review Cart - Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@ReviewCart-StepHeader
@DWCACSR-157
@Priority1
@1
Scenario Outline:Review Cart tab highlights when CSR enters into the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR navigates to Review Cart Page
	Then [Review Cart] tab should be highlighted
	
Examples:
  | UsingData                  	|
  | ReviewCart_tab_highlights	|		
  

@ReviewCart-StepHeader
@DWCACSR-157
@Priority1
@2
Scenario Outline:Number of the Review Cart page displays in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR navigates to Review Cart Page
	Then the step header number for the page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  		|
  | Number_for_the_ReviewCart_tab	|		
            