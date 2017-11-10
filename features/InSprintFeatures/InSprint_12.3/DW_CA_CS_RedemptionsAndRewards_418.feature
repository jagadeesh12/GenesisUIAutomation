Feature: Redemptions & Rewards - Coupon Module – Modal - Your Current Selection - Delete an Item
	This feature is to validate the Redemptions & Rewards - Coupon Module – Modal - Your Current Selection - Delete an Item scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_FreePick 
@DWCACSR-418
@Priority1 
@1 
Scenario Outline:CSR deletes items from current selection section on freepick modal:[<UsingData>] 

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
	When CSR clicks on X to delete the item from current selection section
	Then that item and the entire ‘Your Current Selection’ table is removed from the CSR’s screen
	And the CHECKED button for that item from the ‘Search Results’ table reverts to its default radio button state
	
Examples: 
	| UsingData            						|
	| CSR_Freepickmodal_delete_from_selection   |
		
       