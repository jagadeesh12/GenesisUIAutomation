@Perf200
Feature: Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Your Current Selection
	This feature is to validate the Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Your Current Selection scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@1
Scenario Outline:CSR deletes items from current selection section on DTS modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
 	And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
 	And CSR navigates to Order Entry Page
 	And CSR adds Student Clubs items to the cart with minimum amount
 	And CSR navigates to Review Cart page from Order Entry page
 	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
 	And CSR views Dollars to Spend promotion
 	And CSR clicks on [MAKE SELECTION] button
 	And CSR searches for a term
 	And CSR selects items such that the price of items selected is more than the coupon amount
 	When CSR deletes the items by clicking on X from current selection section such that the price of items selected is less than top-off amount
 	Then unselected items are removed from current selection section
 	And top-off message disappears from the current selection section
 	And updated 'You Have Used' amount displays which is the total price of the items selected
 	And updated 'Remaining to Spend' displays which is (coupon amount - total price of items selected) and is either 0 or a positive value
      
Examples:
  | UsingData 				|
  | QA_CSR_searches_for_items	|		
   
   
@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@2
Scenario Outline:CSR adds more items leading to top-off on DTS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR views Dollars to Spend promotion
    And CSR clicks on [MAKE SELECTION] button
    And CSR searches for a term
    When CSR selects items such that the price of items selected is less than or equal to the coupon amount
    And no top-off message is displayed
    When CSR selects another item leading to top-off
    Then top-off message displays with correct top-off amount
    And correct 'You Have Used' amount displays which is the total price of the items selected
         
Examples:
  | UsingData 					|
  | QA_CSR_searches_for_items_23	|		
   
   
@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@3
Scenario Outline:CSR clicks on CANCEL on DTS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR views Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	And teacher selects the multiple items from same grade in Make Selection window
	When CSR clicks CANCEL link
	Then DTS modal is closed with selections lost
	And Redemptions & Rewards page displays
          
Examples:
  | UsingData 							|
  | QA_CSR_gets_DTS_with_minimum_amount	|		
   
   
@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@4
Scenario Outline:CSR clicks on Confirm Selection on DTS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR views Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button 
	And CSR selects a grade
	And teacher selects the multiple items from same grade in Make Selection window
	When CSR clicks Confirm Selection button
	Then DTS modal is closed with selections saved
	And Redemptions & Rewards page displays
          
Examples:
  | UsingData 							|
  | QA_CSR_gets_DTS_with_minimum_amount_2	|				
   
 
@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@5
Scenario Outline:CSR views the current selections section as the items are added on DTS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR views Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of items selected is less than coupon amount
	#Then Current selection item displays with correct Item, title, Flyer, Price, Qty
	Then updated 'You Have Used' amount displays which is the total price of the items selected
 	And updated 'Remaining to Spend' displays which is (coupon amount - total price of items selected) and is either 0 or a positive value
         
Examples:
  | UsingData 					|
  | QA_CSR_searches_for_items_3	|		
   

@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@6
Scenario Outline:CSR views the top-off message on DTS modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of items selected is more than the coupon amount
	Then top-off message displays as '*Your current selection exceeds your amount of Dollars to Spend'

Examples:
  | UsingData 					|
  | QA_CSR_searches_for_items_4	|		
   

@Redemptions&Rewards_DTS-YourCurrentSelection
@DWCACSR-186
@Priority1
@7
Scenario Outline:CSR unselects items on DTS modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button 
	And CSR selects a grade
	And CSR select the item such that the price of items selected is more than the coupon amount
	When CSR unselects the item selection such that the price of items selected is less than top-off amount
	Then unselected items are removed from current selection section
	And top-off message disappears from the current selection section
	Then updated 'You Have Used' amount displays which is the total price of the items selected
 	And updated 'Remaining to Spend' displays which is (coupon amount - total price of items selected) and is either 0 or a positive value
        
Examples:
  | UsingData 					|
  | QA_CSR_searches_for_items_5	|		
                  