Feature: Sitewide – Abandon Shopping Cart
	This feature is to validate the Sitewide – Abandon Shopping Cart Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@AbandonShoppingCart
@DWCACSR-112
@Priority1
@1
Scenario Outline:CSR sees Order Source page when YES is selected on Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR clicks 'Cancel Order' hyperlink
	And CSR selects YES from callout
	Then CSR sees 'Order Source'page
	#And Order Cancellation modal stating the order is cancelled is shown
	#And all the items in the cart are removed
	
Examples:
  | UsingData               			|
  | QA_CancelOrder_Hyperlink_Payment_YES   |
 

@AbandonShoppingCart
@DWCACSR-112
@Priority1
@2
Scenario Outline:CSR sees Order Source page when YES is selected on Confirm and Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR navigates to [Confirm & Submit] page
	When CSR clicks 'Cancel Order' hyperlink
	And CSR selects YES from callout
	Then CSR sees 'Order Source'page
	#And Order Cancellation modal stating the order is cancelled is shown
	#And all the items in the cart are removed
	
Examples:
  | UsingData               				|
  | QA_CancelOrder_Hyperlink_ConfirmSubmit_YES |
 
 
@AbandonShoppingCart
@DWCACSR-112
@Priority1
@3
Scenario Outline:CSR do not see any changes when NO is selected on Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	When CSR clicks 'Cancel Order' hyperlink
	And CSR selects NO from callout
	Then CSR do not see Cancel Order callout
	And CSR is on the Order Entry page
	
Examples:
  | UsingData               			|
  | QA_CancelOrder_Hyperlink_OrderEntry_NO |
 

@AbandonShoppingCart
@DWCACSR-112
@Priority1
@4
Scenario Outline:CSR sees Order Source page when YES is selected on Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	When CSR clicks 'Cancel Order' hyperlink
	And CSR selects YES from callout
	Then CSR sees 'Order Source'page
	#And all the items in the cart are removed
	
Examples:
  | UsingData               				|
  | QA_CancelOrder_Hyperlink_OrderEntry_YES 	|
 

@AbandonShoppingCart
@DWCACSR-112
@Priority1
@5
Scenario Outline:CSR sees Order Source page when YES is selected on Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR clicks 'Cancel Order' hyperlink
	And CSR selects YES from callout
	Then CSR sees 'Order Source'page
	#And all the items in the cart are removed
	
Examples:
  | UsingData               				|
  | QA_CancelOrder_Hyperlink_ReviewCart_YES 	|
 

@AbandonShoppingCart
@DWCACSR-112
@Priority1
@6
Scenario Outline:Cancel Order callout not displayed when 3 seconds of inactivity passes:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	When CSR clicks 'Cancel Order' hyperlink
	And CSR waits 3 seconds
	Then CSR do not see Cancel Order callout
	
Examples:
  | UsingData               					|
  | QA_CancelOrder_Hyperlink_Clicked_NoActivity 	|
 

@AbandonShoppingCart
@DWCACSR-112
@Priority1
@7
Scenario Outline:CSR sees Order Source page when YES is selected on Rewards and Redemption page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR clicks 'Cancel Order' hyperlink
	And CSR selects YES from callout
	Then CSR sees 'Order Source'page
	#And all the items in the cart are removed
	
Examples:
  | UsingData               						|
  | QA_CancelOrder_Hyperlink_RewardsRedemption_YES 	|
        