Feature: Dollars To Spend
	This feature is to validate the Dollars To Spend scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@Manual
@1
Scenario Outline:Correct Item, item title, price, Flyer are displayed on selecting an item from Search Results:[<UsingData>]
	
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
	When CSR selects an item
	#Then correct Item#, item title, price, Flyer are displayed
	
Examples: 
	| UsingData                        |
	| Dev35_CSR_gets_DTS_with_minimum_amount_1 |		
  

@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@2
Scenario Outline:CSR can view the expanded table row of an item on DTS modal:[<UsingData>]
	
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
	When CSR clicks on an item title/Item#
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
	| UsingData                        	|
	| Dev35_CSR_gets_DTS_with_minimum_amount_21 |
       
       
       
@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@3
Scenario Outline:CSR can hide the expanded table row of an item on DTS modal:[<UsingData>]
	
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
	And CSR clicks on an item title/Item# 
	When CSR clicks on Hide Detail link
	Then the expanded view of the item is hidden
Examples: 
	| UsingData                        |
	| Dev35_CSR_gets_DTS_with_minimum_amount_3 |
		
                
@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@4
Scenario Outline:CSR can view the no. of search results on Dollars to Spend modal:[<UsingData>]
	
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
	Then CSR is presented with range of search result items currently being viewed e.g. 11 – 20 of <TOTAL> Results
	And CSR is presented with the total number of items found in the Search Results list
Examples: 
	| UsingData                        |
	| Dev35_CSR_gets_DTS_with_minimum_amount_4 |
                      

@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@5
Scenario Outline:CSR selects an item by searching for a qualifying item title:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button
	And CSR searches for a [search term]
	When CSR selects an item from the results
	Then selected item title displays correctly in Current Selection section
Examples: 
	| UsingData                                   	|
	| Dev35_CSR_DTS_with_minimum_amount_Search_ItemTitle 	|
		

@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@6
Scenario Outline:CSR selects an item by searching for a qualifying item number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button
	And CSR searches for a [search term]
	When CSR selects an item from the results
	Then selected item number displays correctly in Current Selection section
Examples: 
	| UsingData                                   	|
	| Dev35_CSR_DTS_with_minimum_amount_Search_Keyword 	|
#	| Dev35_CSR_DTS_with_minimum_amount_Search_Author 	|
	
		
		
@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@7
Scenario Outline:CSR cannot Search for expired item on Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button
	When CSR searches for [expired item] in Make Selection window
	Then CSR sees a validation message for expired item search
Examples: 
	| UsingData                    |
	| Dev35_CSR_searches_for_expireditem |
		
      
@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@8
Scenario Outline:CSR does not find any results when Searched for a term with no results on Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button
	When CSR searches for a term with no results
	Then CSR sees no results message
Examples: 
	| UsingData                      |
	| Dev35_CSR_searches_for_noresultsterm |
           

@Redemptions&Rewards_DTS_SearchResults
@DWCACSR-184
@Priority1
@9
Scenario Outline:CSR cannot Search for teacher club items on Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion 
	And CSR clicks on [MAKE SELECTION] button
	When CSR searches for teacher club items
	Then CSR sees no results message 
Examples: 
	| UsingData                         |
	| Dev35_CSR_searches_for_teacherclubitems |
		
     
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
  | Dev35_CSR_searches_for_items	|		
   
   
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
  | Dev35_CSR_searches_for_items_23	|		
   
   
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
  | Dev35_CSR_gets_DTS_with_minimum_amount	|		
   
   
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
  | Dev35_CSR_gets_DTS_with_minimum_amount_2	|				
   
 
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
  | Dev35_CSR_searches_for_items_3	|		
   

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
  | Dev35_CSR_searches_for_items_4	|		
   

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
  | Dev35_CSR_searches_for_items_5	|
  
  
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
  | Dev35_CallOut_msg_to_delete_item_Redemptions_Rewards	|	
   
   
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
  | Dev35_CSR_selects_NO_CallOut_msg_to_delete_item_Redemptions_Rewards	|	
   

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
  | Dev35_CSR_selects_YES_CallOut_msg_to_delete_item_Redemptions_Rewards	|	
   

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
  | Dev35_Updated_amt_displays_correctly_Redemptions_Rewards	|
   

@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@1
Scenario Outline:CSR is charged GST & PST for applicable provinces on top-off amount when only one item is selected from DTS modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 									|
  | Dev35_CSR_StudentItems_TopOff_GST_PST_Province_BC	|		
  

@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@2
Scenario Outline:CSR is charged GST & QST for applicable provinces on top-off amount when only one item is selected from DTS modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 									|
  | Dev35_CSR_StudentItems_TopOff_GST_QST_Province_QC	|		
  

@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@3
Scenario Outline:CSR is charged HST for applicable provinces on top-off amount when only one item is selected from DTS modal_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_HST_Province_NL	|	
	

@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@3
Scenario Outline:CSR is charged HST for applicable provinces on top-off amount when only one item is selected from DTS modal_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_HST_Province_NB	|	
	
  	
  	
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@3
Scenario Outline:CSR is charged HST for applicable provinces on top-off amount when only one item is selected from DTS modal_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_HST_Province_NS	|	
	
  	
  	
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@3
Scenario Outline:CSR is charged HST for applicable provinces on top-off amount when only one item is selected from DTS modal_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_HST_Province_ON	|	
	
  	
  	
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@3
Scenario Outline:CSR is charged HST for applicable provinces on top-off amount when only one item is selected from DTS modal_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_HST_Province_PE	|	
  	  	  	  	
  	  	
  
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from DTS modal_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_GST_Province_AB	|	


@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from DTS modal_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|	
  | Dev35_CSR_StudentItems_TopOff_GST_Province_MB	|	

  	
  	
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from DTS modal_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_GST_Province_NT	|	

  	
  	
 @Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from DTS modal_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|	
  | Dev35_CSR_StudentItems_TopOff_GST_Province_NU	|	

  	
  	
 @Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from DTS modal_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_GST_Province_SK	|
  	
  	
  	
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from DTS modal_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | Dev35_CSR_StudentItems_TopOff_GST_Province_YT	|
  	  	 	 	  	
  	   
   
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@5
Scenario Outline:CSR is not charged on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total 
	
Examples:
  | UsingData 									|
  | Dev35_CSR_StudentItems_noTax_TopOff_GST_Province	|   
  
  
@Redemptions&Rewards_DTS_RewardsModule
@DWCACSR-293
@Priority1
@1
Scenario Outline:CSR views Dollars to Spend automatic promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then CSR views Dollars to Spend promotion with Make Selection button in the same line

Examples: 
	| UsingData                       |
	| Dev35_Teacher_DTS_with_minimum_amount_1 |
       
       
@Redemptions&Rewards_DTS_RewardsModule
@DWCACSR-293
@Priority1
@2
Scenario Outline:CSR does not see Dollars to spend promotion on a cart which does not meet minimum amount:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart less than the minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	Then CSR does not see the Dollars to Spend promotion
Examples: 
	| UsingData                          |
	| Dev35_Teacher_DTS_without_minimum_amount |    
       

@Redemptions&Rewards_DTS_RewardsModule
@DWCACSR-293
@Priority1
@3
Scenario Outline:Dollars to Spend promotion removed on deleting items from cart making cart non-qualifying:[<UsingData>]
	
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
	And CSR selects an item that is greater than the [coupon amount]
	And CSR clicks Confirm Selection button
	And CSR navigates to [Review Cart] page from [Rewards & Coupons] page
	When CSR removes few items from cart such that it falls below [minimum amount]
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then CSR does not receive Dollars to Spend promotion
Examples:
   | UsingData                                    |
   | Dev35_Teacher_DTS_with_minimum amount_couponamount |
       
       
@Redemptions&Rewards_DTS_RewardsModule
@DWCACSR-293
@Priority1
@4
Scenario Outline:CSR does not see Dollars to Spend promotion on cart with Teacher catalogs:[<UsingData>]
	
    Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	Then CSR does not see the Dollars to Spend promotion 
Examples:
   | UsingData                       |
   | Dev35_Teacher_DTS_with_minimum_amount_2 |
       
@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@1
Scenario Outline:DTS message and MAKE SELECTION button displays in Redemptions and Rewards page when CSR adds minimum amount to the cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then DTS message section and MAKE SELECTION button should be displayed
	
Examples:
  | UsingData 											|
  | Dev35_DTS_msg_Selection_btn_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@2
Scenario Outline:DTS modal window, header label and title of the modal window displays when CSR clicks on MAKE SELECTION button in Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [MAKE SELECTION] button
    Then DTS modal window should be displayed
    #And header label and title of the modal window should be displayed
    
Examples:
  | UsingData 												|
  | Dev35_DTS_header_title_section_displays_Redemptions_Rewards	|		
   
   
@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@3
Scenario Outline:Value of the amount of DTS within the header displays when CSR clicks on MAKE SELECTION button in Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [MAKE SELECTION] button
    Then value of the amount of DTS within the header should be shown correctly as per the Rewards section
	
Examples:
  | UsingData 												|
  | Dev35_DTS_header_value_displays_correctly_Redemptions_Rewards	|		
 

 
@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@5
Scenario Outline:close button labeled 'X' displays in the top right position of the modal window when CSR clicks on MAKE SELECTION button in Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [MAKE SELECTION] button
    Then the close button should be displayed in the top right position of the modal window
	
Examples:
  | UsingData 											|
  | Dev35_Close_btn_displays_in_modal_wnd_Redemptions_Rewards	|		


@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@6
Scenario Outline:Redemptions and Rewards page displays when CSR clicks on close button in DTS modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on [MAKE SELECTION] button
    When CSR clicks on close button in DTS modal window
    #Then modal window should be disappered
    Then [Redemptions & Rewards] page should be displayed
	
Examples:
  | UsingData 											|
  | Dev35_Close_btn_displays_in_modal_wnd_Redemptions_Rewards	|		
 
 