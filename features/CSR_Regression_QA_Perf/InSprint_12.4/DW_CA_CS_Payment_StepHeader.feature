@Perf200
Feature: PAYMENT - Step Header
	This feature is to validate the Payment - Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@Payment_StepHeader
@DWCACSR-301
@Priority1
@1
Scenario Outline:PAYMENT tab highlights in the step indicator when CSR enters into the Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
    Then [PAYMENT] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               |
  | Perf_QA_Payment_tab_highlights	|		
  

@Payment_StepHeader
@DWCACSR-301
@Priority1
@2
Scenario Outline:Number of the PAYMENT page displays in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
	Then the step header number for the [PAYMENT] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  	|
  | Perf_QA_Number_for_the_Payment_tab	|	
  
  
            