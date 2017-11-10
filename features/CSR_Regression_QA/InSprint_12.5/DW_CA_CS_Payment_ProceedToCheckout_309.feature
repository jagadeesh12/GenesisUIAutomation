@Perf200
Feature: Payment - Proceed to Checkout
	This feature is to validate the Payment - Proceed to Checkout scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site		
  

@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@1
Scenario Outline:Continue Checkout button enable in Payment page when CSR selects Checks as payment:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	And CSR enters [PO Number]
	Then Continue Checkout button is enabled in the footer region of the page

Examples: 
	| UsingData       						|
	| QA_CSR_Payment_ContinueCheckout_Enabled	|
	

@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@2
Scenario Outline:Confirm and Submit page displays when CSR clicks on Continue Checkout button in Payment page:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	When CSR clicks on [Continue Checkout] button in Payment page
	Then [Confirm & Submit] page displays

Examples: 
	| UsingData       					|
	| QA_CSR_Confirm_Submit_page_displays	|

	
@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@3
Scenario Outline:Saved Credit Card displays in the list when CSR selects Credit Card as Payment in Payment page:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Credit Card as payment
	Then Saved Credit Card displays in the list

Examples: 
	| UsingData       				|
	| QA_CSR_Saved_CreditCard_displays	|
	
	
@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@4
Scenario Outline:Saved Credit Card information displays correctly when CSR selects Saved Credit Card as Payment in Payment page:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	When CSR selects saved Credit Card
	Then Credit Card information displays correctly

Examples: 
	| UsingData       								|
	| QA_CSR_Saved_CreditCard_info_displays_correctly	|	
	
	