Feature: Redemptions & Rewards - Rewards Module – Dollars to Spend Updated
	This feature is to validate the Redemptions & Rewards - Rewards Module – Dollars to Spend Updated scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_DTS-Updated 
@DWCACSR-187 
@Priority1 
@1
Scenario Outline:Rewards section when items selected without top-off on DTS modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button 
	And CSR clicks on grade level dropdown 
	And CSR selects items less than or equal to coupon amount 
	When CSR clicks Confirm Selection button 
	Then Redemptions & Rewards page displays with DTS reward section displaying Spent: '$(total price of selected items) | (no. of Items selected)' 
	And Edit link displayed next to the Qty 
	And there is no top-off message displays 
Examples: 
	| usingdata                        		|
	| CSR_gets_DTS_with_minimum_amount_1 	|		
		
		
@Redemptions&Rewards_DTS-Updated 
@DWCACSR-187 
@Priority1 
@2
Scenario Outline:Rewards section when items selected with top-off on DTS modal:[<UsingData>] 
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button 
	And CSR clicks on grade level dropdown 
	And CSR selects items greater than or equal to coupon amount 
	When CSR clicks Confirm Selection button 
	Then Redemptions & Rewards page displays with DTS reward section displaying 'You Pay (after savings): (total price of the items selected – coupon amount) after taxes | No. of items' 
	And Edit link displayed next to the Qty 
	And top-off message "The amount "You pay (after savings)" on any items purchased with Dollars To Spend includes applicable taxes and will be added to your Student Clubs Amount Owing above."displays 
Examples: 
	| usingdata                        		|
	| CSR_gets_DTS_with_minimum_amount_2 	|
		
			
@Redemptions&Rewards_DTS-Updated 
@DWCACSR-187 
@Priority1 
@3 
Scenario Outline:Top-off amount added to Student clubs amount owing:[<UsingData>] 
		
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button 
	And CSR clicks on grade level dropdown 
	And CSR selects items greater than or equal to coupon amount 
	When CSR clicks Confirm Selection button 
	Then Redemptions & Rewards page displays with top-off amount added to Student clubs Amount owing and also the total on blue bar which are the after tax amount 
	
Examples: 
	| usingdata                        		|
	| CSR_gets_DTS_with_minimum_amount_3 	|
		
		
@Redemptions&Rewards_DTS-Updated 
@DWCACSR-187 
@Priority1 
@4 
Scenario Outline:CSR delete all selections and click on close on Edit mode:[<UsingData>] 
			
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button 
	And CSR selects items 
	And CSR clicks Confirm Selection button 
	And CSR clicks Edit 
	When CSR deletes all the items from current selection section 
	And CSR closes the modal 
	Then the selections are not deleted and it goes back to its previous state 
	
Examples: 
	| usingdata                       	 |
	| CSR_gets_DTS_with_minimum_amount_4 |
		
					
@Redemptions&Rewards_DTS-Updated 
@DWCACSR-187 
@Priority1 
@5 
Scenario Outline:CSR edits selections on DTS modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button 
	And CSR selects items 
	And CSR clicks Confirm Selection button 
	And CSR clicks Edit 
	When CSR selects more items or replaces with new items 
	And CSR clicks on Confirm & Apply 
	Then the new selections are saved and totals are updated accordingly 
	
Examples: 
	| usingdata                    		    |
	| CSR_gets_DTS_with_minimum_amount_5 	|
		
		
      