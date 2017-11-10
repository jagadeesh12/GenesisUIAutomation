Feature: Redemptions & Rewards - Coupon Module – Delete Coupon
	This feature is to validate the Redemptions & Rewards - Coupon Module – Delete Coupon scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_FreePick 
@DWCACSR-414 
@Priority1 
@1 
Scenario Outline:Delete coupon code clicking option 'No':[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters Free pick flat coupon code
	#And CSR selects a free pick item
	And CSR clicks on X icon
	When CSR clicks on 'No'
	Then delete callout message disappears
	And the coupon is retained in cart and selections are retained
	
	Examples: 
		| UsingData              	|
		| Perf_QA_Teacher_DeleteCallout_1	|
		

@Redemptions&Rewards_FreePick 
@DWCACSR-414 
@Priority1 
@2 
Scenario Outline:Delete coupon code clicking option 'Yes':[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters Free pick flat coupon code
	#And CSR selects a free pick item
	And CSR clicks on X icon
	When CSR clicks on 'Yes'
	Then delete callout message not displayed
	And the coupon is removed from cart
	And Coupons Applied section disappears

Examples: 
	| UsingData          		|
	| Perf_QA_Teacher_DeleteCallout_2	|
	
	