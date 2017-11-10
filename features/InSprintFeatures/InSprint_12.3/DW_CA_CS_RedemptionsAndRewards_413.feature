Feature: Redemptions & Rewards - Coupon Module – Apply Coupon Codes  & Validation
	This feature is to validate the Redemptions & Rewards - Coupon Module – Apply Coupon Codes  & Validation scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_FreeItem
@DWCACSR-413
@Priority1 
@1 
Scenario Outline:CSR enters invalid coupon code:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR enters invalid coupon code
	Then error message displays for invalid coupon code
Examples: 
	| UsingData                |
	| Teacher_Invalidcouponcode|
		
       
@Redemptions&Rewards_FreeItem
@DWCACSR-413
@Priority1 
@2
Scenario Outline:CSR enters already applied coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies valid coupon code
	When CSR enters the same coupon code again
	Then error message displays for already enterd coupon code
Examples: 
	| UsingData                |
	| Teacher_Appliedcouponcode|
       

@Redemptions&Rewards_FreeItem
@DWCACSR-413
@Priority1 
@3
Scenario Outline:Apply button active on entering 3 characters:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR enter minimum 3 characters in coupon text box
	Then Apply button becomes active
Examples: 
	| UsingData          |
	| Teacher_couponcode |
		
       