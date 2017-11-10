@Perf200
Feature: Redemptions & Rewards - Page Framework
	This feature is to validate the Redemptions & Rewards - Page Framework scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_PageFramework
@DWCACSR-173
@Priority1
@1
Scenario Outline:Rewards and Coupons tab highlights when CSR clicks on Peoceed To Checkout in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
	#Then Rewards and Coupons popup window should be displayed
	Then [Redemptions & Rewards] tab should be highlighted in the step indicator
	
Examples:
  | UsingData 								|
  | Perf_QA_CSR_sees_RewardsAndCoupons_popup_window	|		
  

@Redemptions&Rewards_PageFramework
@DWCACSR-173
@Priority1
@2
Scenario Outline:Continue Checkout button enable in Coupons page when CSR clicks on Peoceed To Checkout in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then the button [Continue Checkout] should be enabled in the footer region of the page
	
Examples:
  | UsingData 							|
  | Perf_QA_Redemptions_Rewards_tab_highlights	|		
  

