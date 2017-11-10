Feature: Free Pick
	This feature is to validate the Free Pick scenarios

 
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
		| QA_Teacher_DeleteCallout_1	|
		

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
	| QA_Teacher_DeleteCallout_2	|
	
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@1 
Scenario Outline:Correct Item, item title, price, Flyer are displayed on selecting an item from Search Results on free pick modal:[<UsingData>] 

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
	Then correct Item#, item title, price, Flyer are displayed 
	
Examples: 
	| UsingData                      |
	| QA_CSR_Freepickmodal              |
		

@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@2
Scenario Outline:CSR can view the expanded table row of an item on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	And CSR searches for a term 
	When CSR clicks on an item title
	Then expanded table row of the item displays 
	And a thumbnail image representative of the particular item being engaged (uploaded to Business Manager 
#	And a label representative of the title of the actual Item 
#	And a label representative of the line item number for the flyer where the image was published e.g. 96 
#	And a label ‘Grade’ with another label beside it representative of the Grade Level range 
#	And a label ‘Ages’ with another label beside it representative of the audience Age range in which the item is suitable 
#	And a label representative of the applicable age range e.g. N- N 
#	And a paragraph of text describing the item 
#	And a hyperlink labeled ‘Hide Detail’ 
Examples: 
	| UsingData                      |
	| QA_CSR_Freepick_Itemdescription   |
		
       
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@3
Scenario Outline:CSR can hide the expanded table row of an item on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	And CSR searches for a term
	And CSR clicks on an item title
	When CSR clicks on Hide Detail link
	Then the expanded view of the item is hidden
Examples: 
	| UsingData                       |
	| QA_CSR_frepick_ExpandedView        |
		
                
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@4
Scenario Outline:CSR selects an item by searching for a qualifying item Title_2:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	And CSR searches for a [search term] 
	When CSR selects an item from the search results
	Then selected item title displays correctly in Current Selection section
Examples: 
	| UsingData                                        |
	| QA_CSR_Freepick_with_minimum_amount_Search_ItemTitle|
	
	
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@5
Scenario Outline:CSR selects an item by searching for a qualifying item Keyword_2:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	And CSR searches for a [search term] 
	When CSR selects an item from the search results
	Then selected item number displays correctly in Current Selection section for FreeItem
Examples: 
	| UsingData                                        |
#	| CSR_Freepick_with_minimum_amount_Search_Author   |
	| QA_CSR_Freepick_with_minimum_amount_Search_Keyword  |
		
      
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@6
Scenario Outline:CSR cannot Search for expired item on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	When CSR searches for [expired item] in Make Selection window 
	Then CSR sees a validation message for expired item search 
Examples: 
	| UsingData                        		|
	| QA_FreePick_CSR_searches_for_expireditem |
		
      
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@7
Scenario Outline:CSR does not find any results when Searched for a term with no results on Freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	When CSR searches for a term with no results 
	Then CSR sees no search results message
	
Examples: 
	| UsingData                      			|
	| QA_FreePick_CSR_searches_for_noresultsterm 	|
		
      
@Redemptions&Rewards_FreePick
@DWCACSR-415
@Priority1 
@8
Scenario Outline:CSR cannot Search for teacher club items on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	When CSR searches for teacher club items
	Then CSR sees no search results message
Examples: 
	| UsingData          			               	|
	| QA_FreePick_CSR_searches_for_teacherclubitems	|
		

@Redemptions&Rewards_FreePick 
@DWCACSR-416 
@Priority1 
@1 
Scenario Outline: Prev link when CSR is on the first page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	When CSR searches for a term
	Then 'Prev' link is disabled in first page of search results
	Examples: 
		| UsingData              |
		| QA_CSR_searches_for_items_1 |
		

@Redemptions&Rewards_FreePick 
@DWCACSR-416 
@Priority1 
@2 
Scenario Outline:Next link when CSR is on the last page on freepick modal:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies freepick coupon
	And CSR searches for a term
	When CSR is on the last page results
	Then 'Next' link is disabled in last page of search results
	Examples: 
		| UsingData              |
		| QA_CSR_searches_for_items_2 |
		
		     
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
	| QA_CSR_Freepickmodal_delete_from_selection   |
	
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
	| QA_CSR_gets_Freepick_with_minimum_amount|
		
          	
	                                  	