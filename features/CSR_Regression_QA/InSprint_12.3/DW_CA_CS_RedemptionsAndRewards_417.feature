Feature: Redemptions & Rewards - Coupon Module – Modal - Your Current Selection
	This feature is to validate the Redemptions & Rewards - Coupon Module – Modal - Your Current Selection scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_FreePick 
@DWCACSR-417 
@Priority1 
@1
Scenario Outline: CSR clicks on CANCEL on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon 
	And CSR clicks on grade level dropdown 
	And CSR selects an item from the list
	When CSR clicks CANCEL link
	Then freepick modal is closed with selections lost
	And Redemptions & Rewards page displays 
Examples: 
	| UsingData                            		|
	| QA_CSR_gets_Freepick_with_minimum_amount_1	|
		

@Redemptions&Rewards_FreePick 
@DWCACSR-417
@Priority1 
@2
Scenario Outline:CSR clicks on Confirm Selection on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon 
	And CSR clicks on grade level dropdown 
	And CSR selects an item from the list
	When CSR clicks Confirm Selection button 
	Then freepick modal is closed with selections saved
	And Redemptions & Rewards page displays with the coupon code and Edit link
Examples: 
	| UsingData                            |
	| QA_CSR_gets_Freepick_with_minimum_amount_2|
		
              
@Redemptions&Rewards_FreePick 
@DWCACSR-417
@Priority1
@3
Scenario Outline:CSR views the current selections section as the item is added on freepick:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon 
	And CSR searches for a term 
	When CSR selects an item from the list
	Then Current selection item displays with correct Item, title, Flyer, Price, Qty
	
Examples: 
	| UsingData              |
	| QA_Free_CSR_searches_for_items_1 |     
		
		
@Redemptions&Rewards_FreePick 
@DWCACSR-417
@Priority1 
@4
Scenario Outline:CSR selects a different item on the freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon 
	And CSR searches for a term 
	And CSR selects an item from the list
	When CSR selects a different item on the freepick modal
	Then Current selection item displays with the recently selected item
	And only one item can be selected and the new selection is swapped by the previous selection
	
Examples: 
	| UsingData              |
	| QA_Free_CSR_searches_for_items_2 |
		
                             