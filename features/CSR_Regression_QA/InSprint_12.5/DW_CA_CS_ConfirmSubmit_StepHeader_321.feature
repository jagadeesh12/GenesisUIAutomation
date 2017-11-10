@Perf200
Feature: Confirm & Submit - Step Header
	This feature is to validate the Confirm & Submit - Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@Confirm&Submit_StepHeader
@DWCACSR-321
@Priority1
@1
Scenario Outline:Confirm and Submit tab highlights in the step indicator when CSR enters into the Confirm and Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
    When CSR clicks on [Continue Checkout] button in Payment page
    Then [Confirm and Submit] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               			|
  | QA_Confirm_and_Submit_tab_highlights	|		
  

@Confirm&Submit_StepHeader
@DWCACSR-321
@Priority1
@2
Scenario Outline:Number of the CONFIRM and SUBMIT page displays correctly in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
    When CSR clicks on [Continue Checkout] button in Payment page
	Then the step header number for the [Confirm and Submit] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  				|
  | QA_Number_for_the_Confirm_and_Submit_tab	|	
  
  
            