@Perf200
Feature: Redemptions & Rewards - Step Header
	This feature is to validate the Redemptions & Rewards - Step Header Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@Redemptions&Rewards_StepHeader
@DWCACSR-174
@Priority1
@1
Scenario Outline:Redemptions and Rewards tab highlights in the step indicator when CSR enters into the Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    #When CSR clicks on [Proceed To Checkout] in Rewards and Coupons popup window
    Then [Redemptions & Rewards] tab should be highlighted in the step indicator
	
Examples:
  | UsingData                  			|
  | Perf_QA_Redemptions_Rewards_tab_highlights	|		
  

@Redemptions&Rewards_StepHeader
@DWCACSR-174
@Priority1
@2
Scenario Outline:Number of the Redemptions and Rewards page displays in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    #When CSR clicks on [Proceed To Checkout] in Rewards and Coupons popup window
	Then the step header number for the [Redemptions & Rewards] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  				|
  | Perf_QA_Number_for_the_Redemptions_Rewards_tab	|	
  
  
            