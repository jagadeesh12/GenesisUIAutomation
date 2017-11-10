Feature: Review Cart - Proceed to Checkout
	This feature is to validate the Review Cart - Proceed to Checkout scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart_ProceedToCheckout
@DWCACSR-194
@Priority1
@1
Scenario Outline:CSR is presented with a button labeled Proceed to Checkout positioned in the footer region of the 'Review Cart' page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with a button labeled [Proceed to Checkout] positioned in the footer region of the 'Review Cart' page
	
Examples:
  | UsingData 							|
  | Q_QA_CSR_sees_ProceedToCheckout_label	|			
  

@ReviewCart_ProceedToCheckout
@DWCACSR-194
@Priority1
@2
Scenario Outline:Rewards and Coupons page displays when CSR clicks on Proceed to Checkout in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then [Rewards & Coupons] page should be displayed
	
Examples:
  | UsingData 						|
  | Q_QA_CSR_sees_RewardsCoupons_page	|		
  
