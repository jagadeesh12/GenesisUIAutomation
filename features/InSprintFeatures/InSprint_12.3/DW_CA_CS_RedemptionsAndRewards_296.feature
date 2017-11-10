Feature: Redemptions & Rewards - Coupon Module
	This feature is to validate the Redemptions & Rewards - Coupon Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_CouponModule
@DWCACSR-296
@Priority1
@1
@Manual
Scenario Outline:Display of coupon section on Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then CSR views coupons section with header "COUPONS", sub header "ENTER COUPON CODE" 
	And a text field with default text "E.G. 1H31" 
	And Apply button which is disabled 
Examples: 
	| UsingData              |
	| Teacher_Coupons_Section|
