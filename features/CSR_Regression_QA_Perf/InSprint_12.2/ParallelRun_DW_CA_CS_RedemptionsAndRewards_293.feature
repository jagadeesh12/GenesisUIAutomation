Feature: Redemptions & Rewards - Rewards Module - Qualifications - Dollars to Spend
	This feature is to validate the Redemptions & Rewards - Rewards Module - Qualifications - Dollars to Spend scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
	| Perf_QA_Teacher_DTS_with_minimum_amount_1 |
       
       
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
	| Perf_QA_Teacher_DTS_without_minimum_amount |    
       

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
   | Perf_QA_Teacher_DTS_with_minimum amount_couponamount |
       
       
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
   | Perf_QA_Teacher_DTS_with_minimum_amount_2 |
       
 