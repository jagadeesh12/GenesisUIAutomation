Feature: Redemptions & Rewards - Proceed to Checkout
	This feature is to validate the Redemptions & Rewards - Proceed to Checkout scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_ProceedToCheckout
@DWCACSR-298
@Priority1 
@1 
Scenario Outline:CSR navigates to payment page by clicking continue checkout on redemptions & rewards page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enter no. of students in student incentive if applicable
	When CSR clicks on [Continue Checkout] in [Redemptions & Rewards] page
	Then Payment page displays with the information from Redemptions & Rewards page saved
    
Examples: 
	| usingdata           |
	| CSR_continueCheckout|
	
	
      