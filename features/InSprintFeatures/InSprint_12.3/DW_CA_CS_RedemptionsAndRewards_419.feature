Feature: Redemptions & Rewards - Coupon Module – UPDATED
	This feature is to validate the Redemptions & Rewards - Coupon Module – UPDATED scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_FreePick 
@DWCACSR-419
@Priority1 
@1 
Scenario Outline:Edit state of Freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	And CSR clicks on grade level dropdown
	And CSR confirms selections on Freepick modal
	When CSR clicks on Edit link
	Then the CSR will be presented with the ‘Make Your Selection’ modal window minus any search results
	And the ‘Your Current Selection’ table with the previously selected item displays
	And the button labeled ‘CONFIRM & APPLY’ in a disabled state
Examples: 
	| UsingData                            |
	| CSR_gets_Freepick_with_minimum_amount|
		
             