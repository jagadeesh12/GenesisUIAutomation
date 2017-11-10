@Perf200
Feature: Payment - Page Framework
	This feature is to validate the Payment - Page Framework scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Payment_PageFramework
@DWCACSR-300
@Priority1
@1
Scenario Outline:Payment tab highlights when CSR clicks on Continue Checkout in Redeem and Rewards page:[<UsingData>]
	
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
  | UsingData 					|
  | Perf_QA_CSR_Payment_tab_highlights	|		
  

@Payment_PageFramework
@DWCACSR-300
@Priority1
@2
Scenario Outline:Continue Checkout button disabled in Payment page when CSR clicks on Continue Checkout in Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
    Then the button [Continue Checkout] should be disabled in the footer region of the page
	
Examples:
  | UsingData 						|
  | Perf_QA_CSR_Continue_Checkout_btn_disabled	|		
  

@Payment_PageFramework
@DWCACSR-300
@Priority1
@3
Scenario Outline:Payment method and alternate shipping address displays when CSR clicks on Continue Checkout in Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
    Then Unique method of Payment section displays
    And Alternate shipping address field section displays
	
Examples:
  | UsingData 							|
  | Perf_QA_CSR_Payment_method_Alternate_shipping	|		
  
