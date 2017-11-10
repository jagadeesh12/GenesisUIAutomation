Feature: Redemptions & Rewards - Coupon Module – Modal - Search Results - Pagination
	This feature is to validate the Redemptions & Rewards - Coupon Module – Modal - Search Results - Pagination scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
		| Perf_QA_CSR_searches_for_items_1 |
		

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
		| Perf_QA_CSR_searches_for_items_2 |
		
		     