Feature: Redemptions & Rewards: Coupon Module – Apply Coupons - Free Shipping
	This feature is to validate the Redemptions & Rewards: Coupon Module – Apply Coupons - Free Shipping scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

@Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can apply coupon on  a cart with qualifying minimum amount on Teacher Catalogue orders to receive free shipping:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR does not receive free Shipping
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_FREEshipping_with_coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can apply coupon on a cart with qualifying minimum amount on Student Club orders to receive free shipping:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR does not receive free Shipping
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_StudentItems_FREEshipping_with_coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can apply coupon on a cart with qualifying minimum amount on Teacher and Student Club orders to receive free shipping:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart meeting the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR does not receive free Shipping
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_StudentTeacherItems_FREEshipping_with_coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority2 
Scenario Outline:CSR applies Shipping coupon and deletes items from cart making cart non-qualifying resulting in coupon being removed:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR does not receive free Shipping
	And CSR applies [Free Shipping Coupon]
	And CSR receives FREE shipping
	And CSR navigates to Review Your cart page from Coupons & Rewards page
	When CSR deletes items from cart resulting in cart total fall below [shipping threshold]
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then CSR does not receive free Shipping

Examples: 
	| UsingData                          	  	 |
	| QA_CSR:Teacher_deletes_items_from_cart_ManualShippingCoupon |
	
	
@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR cannot apply Free Shipping coupon on a cart which does not meet minimum amount:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart less than the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR applies [Free Shipping Coupon]
	Then CSR sees error message for order amount not meeting for Free Shipping
	
Examples: 
	|UsingData|
	|QA_CSR:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold_Coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can still apply Free Shipping coupon if redemptions from Student Bonus and paper coupon makes the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in [Student Bonus dollar] and [student paper dollar] making cart total fall below [Manual shipping threshold]
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_applies_StudentBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can still apply Free Shipping coupon if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in [Student Bonus dollar] making cart total fall below [Manual shipping threshold]
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon
	
Examples: 
	|UsingData|
	|QA_CSR:Teacher_applies_StudentBonusRedemptions_charged_ShippingFee_Coupon|
	
	
@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can still apply Free Shipping coupon if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in [Student paper dollar] making cart total fall below [Manual shipping threshold]
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon
	
Examples: 
	|UsingData|
	|QA_CSR:Teacher_applies_StudentPaperRedemptions_charged_ShippingFee_Coupon|
	
	
@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can still apply Free Shipping coupon if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in [Teacher Bonus dollar] making cart total fall below [Manual shipping threshold]
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_applies_TeacherBonusRedemptions_charged_ShippingFee_Coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can still apply Free Shipping coupon if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon
	
Examples: 
	|UsingData|
	|QA_CSR:Teacher_applies_TeacherPaperRedemptions_charged_ShippingFee_Coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR can still apply Free Shipping coupon if redemptions from Teacher Bonus and paper coupon makes the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart meeting the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in [Teacher Bonus dollar] and [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When CSR applies [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon
	
Examples: 
	|UsingData|
	|QA_CSR:Teacher_applies_TeacherBonusandpaperRedemptions_charged_ShippingFee_Coupon|	

	

@ORPHAN @Automated @Manual_FreeShipping @Priority2
Scenario Outline: CSR can apply a deleted coupon again:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart meeting the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies [Free Shipping Coupon]
	And CSR clicks on Delete coupon and clicks on [YES] option
	When CSR tries to apply same [Free Shipping Coupon]
	Then CSR receives FREE shipping and deletes the applied coupon
	
Examples: 
	| UsingData                          	  	 |
	| QA_CSR:Teacher_deletes_Coupon_AddsCoupon_ManualShippingCoupon |
	
	
@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline:CSR click on delete and No option does not delete the coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart meeting the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies [Free Shipping Coupon]
	And CSR clicks on Delete coupon and clicks on [NO] option
	Then CSR still has FREE shipping
	And CSR receives FREE shipping and deletes the applied coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_FREEshipping_DeleteNo_with_coupon|
	

@ORPHAN @Automated @Manual_FreeShipping @Priority1 
Scenario Outline: CSR cannot apply already redeemed coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart meeting the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies [Free Shipping Coupon]
	When CSR tries to apply same [Free Shipping Coupon]
	Then CSR sees error message for using same coupon

Examples: 
	|UsingData|
	|QA_CSR:Teacher_FREEshipping_SameCoupon_with_coupon|
	
	
@ORPHAN @Automated @Manual_FreeShipping @Priority3 
Scenario Outline:CSR cannot apply Free Shipping coupon on a Free shipping cart:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart meeting the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR receives FREE shipping
	When CSR applies [Free Shipping Coupon]
	Then CSR sees error message 'Shipping for your order is already FREE! This coupon code cannot be applied.'
	
Examples: 
	|UsingData|
	|QA_CSR:Teacher_FREEshipping_SameCoupon_with_coupon_2|
	
      