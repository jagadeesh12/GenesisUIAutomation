Feature: Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Your Current Selection - Delete Item
	This feature is to validate the Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Your Current Selection - Delete Item scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_DTS-DeleteItem
@DWCACSR-340
@Priority1
@1
Scenario Outline:Callout message displays 'Delete This Item' when CSR clicks on delete button for the selected item in DTS window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on [MAKE SELECTION] button
    And CSR selects a grade
	And CSR select the item such that the price of items selected is less than coupon amount
	When CSR clicks on button X to delete the selected item
	Then the callout message displays 'Delete This Item'
	And the buttons labeled 'YES' and 'NO'
	
Examples:
  | UsingData 										|
  | CallOut_msg_to_delete_item_Redemptions_Rewards	|	
   
   
@Redemptions&Rewards_DTS-DeleteItem
@DWCACSR-340
@Priority1
@2
Scenario Outline:Callout message disappers when CSR selects 'NO' to delete the item in DTS window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on [MAKE SELECTION] button
    And CSR selects a grade
	And CSR select the item such that the price of items selected is less than coupon amount
	And CSR clicks on button X to delete the selected item
	When CSR clicks on 'NO' button
	Then Callout message is disappers
	
Examples:
  | UsingData 														|
  | CSR_selects_NO_CallOut_msg_to_delete_item_Redemptions_Rewards	|	
   

@Redemptions&Rewards_DTS-DeleteItem
@DWCACSR-340
@Priority1
@3
Scenario Outline:Item is removed form the table when CSR selects 'YES' to delete the item in DTS window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on [MAKE SELECTION] button
    And CSR selects a grade
	And CSR select the item such that the price of items selected is less than coupon amount
	And CSR clicks on button X to delete the selected item
	When CSR clicks on 'YES' button
	Then the item is removed from the table
	
Examples:
  | UsingData 														|
  | CSR_selects_YES_CallOut_msg_to_delete_item_Redemptions_Rewards	|	
   

@Redemptions&Rewards_DTS-DeleteItem
@DWCACSR-340
@Priority1
@4
Scenario Outline:Updated amount displays correctly when CSR deletes the item from list in DTS window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on [MAKE SELECTION] button
    And CSR selects a grade
	And CSR selects items such that the price of items selected is more than the coupon amount
	And CSR clicks on button X to delete the selected item
	When CSR clicks on 'YES' button
	Then top-off message disappears from the current selection section
 	And updated 'You Have Used' amount displays which is the total price of the items selected
 	And updated 'Remaining to Spend' displays which is (coupon amount - total price of items selected) and is either 0 or a positive value
	
Examples:
  | UsingData 											|
  | Updated_amt_displays_correctly_Redemptions_Rewards	|
   
    