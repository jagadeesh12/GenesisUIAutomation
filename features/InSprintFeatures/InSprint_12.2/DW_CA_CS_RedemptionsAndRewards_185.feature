Feature: Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Search Results - Pagination
	This feature is to validate the Redemptions & Rewards - Rewards Module – Dollars to Spend Modal – Search Results - Pagination scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_DTS_SearchResultsPagination
@DWCACSR-185
@Priority1
@1
Scenario Outline:Prev link disabled when CSR is on the first page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	When CSR searches for a term
	Then 'Prev' link is disabled in first page of search results
	
Examples:
  | UsingData 								|
  | Prev_Link_disabled_in_Search_results	|		
  

@Redemptions&Rewards_DTS_SearchResultsPagination
@DWCACSR-185
@Priority1
@2
Scenario Outline:Next link is disabled when CSR is on the last page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR searches for a term
	When CSR is on the last page results
	Then 'Next' link is disabled in last page of search results
	
Examples:
  | UsingData 								|
  | Next_Link_disabled_in_Search_results	|		
  
