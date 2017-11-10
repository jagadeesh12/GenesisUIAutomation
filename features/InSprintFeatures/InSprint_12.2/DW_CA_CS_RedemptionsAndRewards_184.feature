Feature: Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Search Results
	This feature is to validate the Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Search Results scenarios

 
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
	| CSR_gets_DTS_with_minimum_amount_1 |		
  

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
	| CSR_gets_DTS_with_minimum_amount_21 |
       
       
       
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
	| CSR_gets_DTS_with_minimum_amount_3 |
		
                
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
	| CSR_gets_DTS_with_minimum_amount_4 |
                      

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
	| CSR_DTS_with_minimum_amount_Search_ItemTitle 	|
		

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
	| CSR_DTS_with_minimum_amount_Search_Keyword 	|
#	| CSR_DTS_with_minimum_amount_Search_Author 	|
	
		
		
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
	| CSR_searches_for_expireditem |
		
      
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
	| CSR_searches_for_noresultsterm |
           

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
	| CSR_searches_for_teacherclubitems |
		
      