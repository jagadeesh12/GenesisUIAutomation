@CouponModify
Feature: Manual-FreeShipping
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

                                   

@Golden
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Teacher Club orders to receive free shipping:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
  And teacher adds Teacher Exclusives item to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Golden:Teacher_FREEshipping_with_coupon|
	

@Golden
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher cannot apply Free Shipping coupon on a cart which does not meet minimum amount:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
  And teacher navigates to YTO page
  And teacher adds YTO items to cart which does not qualify for manual free shipping coupon
  And teacher navigates to [Review Cart] page
  And teacher navigates to [Redemptions & Rewards] page
	When teacher applies [Free Shipping Coupon]
  Then teacher sees error message for order amount not meeting for Free Shipping
	
	Examples: 
	|UsingData|
	|QA:Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold_Coupon|
	
	
	
	
	
#########################       SHIPPING PRIORITY1 SCENARIOS             #######################################


@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher is charged GST on the shipping fee against 'AB' Province in Coupons and Rewards page:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO item for Paid Shipping
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then [Shipping Fee] displays in Shipping & Handling blue header
	And Shipping Handling, GST and Shipping & Handling Total displays in Shipping & Handling section

Examples:
  |UsingData|
  | QA:Teacher_charged_taxes_on_shipping_fee_basedon_province_AB |
	
	
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	#And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher adds YTO item for Free Shipping
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher receives FREE shipping
	When teacher enters amount in [student paper dollar] resulting in cart total fall below [shipping threshold]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_StudentPaperCoupon_FREEshipping_greaterthan_Shipping_Threshold|
	
	
	
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	#And teacher adds Teacher Exclusives item to cart with [minumum amount] for manual free shipping coupon
	And teacher adds Teacher Exclusives item for Free Shipping
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	And teacher receives FREE shipping
	When teacher enters amount in [teacher Bonus dollar] resulting in cart total fall below [shipping threshold]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_charged_ShippingFee_TeacherBonusRedemptions|
	
	
	
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	#And teacher adds Teacher Exclusives item to cart with [minumum amount] for manual free shipping coupon
	And teacher adds Teacher Exclusives item for Free Shipping
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	And teacher receives FREE shipping
	When teacher enters amount in [teacher paper dollar] resulting in cart total fall below [shipping threshold]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_charged_ShippingFee_TeacherPaperRedemptions|
	


@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Student Club orders to receive free shipping:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_StudentItems_FREEshipping_with_coupon|
	
	
	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can Apply coupon on Teacher and Student Club orders to receive free shipping:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO and Teacher Exclusives items to cart with [minumum amount] for manual free shipping coupon
	#And teacher adds YTO and Teacher Exclusives items for Free Shipping
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_StudentTeacherItems_FREEshipping_with_coupon|
	
	

	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher enters amount in [Student Bonus dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_applies_StudentBonusRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher enters amount in [Student paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_applies_StudentPaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can apply Free Shipping coupon if redemptions from Student Bonus and paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher enters amount in [Student Bonus dollar] and [student paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_applies_StudentBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds Teacher Exclusives item to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher enters amount in [Teacher Bonus dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_applies_TeacherBonusRedemptions_charged_ShippingFee_Coupon|
	
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds Teacher Exclusives item to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher enters amount in [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_applies_TeacherPaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can apply Free Shipping coupon if redemptions from Teacher Bonus and paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds Teacher Exclusives item to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher enters amount in [Teacher Bonus dollar] and [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
  Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|QA:Teacher_applies_TeacherBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher click on delete and No option does not delete the coupon:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies [Free Shipping Coupon]
	When teacher clicks on Delete coupon and selects NO
	Then coupon is not deleted
	And teacher still has FREE shipping

Examples: 
|UsingData|
|QA:Teacher_FREEshipping_DeleteNo_with_coupon|




@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher cannot apply already redeemed coupon:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies [Free Shipping Coupon]
	When teacher tries to apply same [Free Shipping Coupon]
	Then teacher sees error message for using same coupon2
	
	Examples: 
	|UsingData|
	|QA:Teacher_FREEshipping_SameCoupon_with_coupon|
	
	
	
#########################       SHIPPING PRIORITY2 SCENARIOS             #######################################	
	
	
@Manual-FreeShipping
@Priority2	
Scenario Outline:Teacher applies Shipping coupon and deletes items from cart making cart non-qualifying results in coupon being removed:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO and Teacher Exclusives items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher does not receive free Shipping
	And teacher applies [Free Shipping Coupon]
	And teacher receives FREE shipping
	And teacher navigates to Review Your cart page from Coupons & Rewards page
	When teacher delete items from cart resulting in cart total fall below [shipping threshold]
	And teacher navigates to coupons & Rewards page
	Then teacher does not receive free Shipping
	
Examples:
  | UsingData                          	  	 |
  | QA:Teacher_deletes_items_from_cart_ManualShippingCoupon |
  
  
  
  
@Manual-FreeShipping
@Priority2	
Scenario Outline:Teacher can apply a deleted coupon again:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount] for manual free shipping coupon
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies [Free Shipping Coupon]
	And teacher clicks on Delete coupon and selects YES
	When teacher tries to apply same [Free Shipping Coupon]
	Then teacher receives FREE shipping
	
	
Examples:
  | UsingData                          	  	 |
  | QA:Teacher_deletes_Coupon_AddsCoupon_ManualShippingCoupon |
  
  
  
  
  
  
############################			PRIORITY 3 SCENARIOS 			#####################################################################


@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher cannot apply Free Shipping coupon on a Free shipping cart:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO item for Free Shipping
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher receives FREE shipping
	When teacher applies [Free Shipping Coupon]
	Then teacher sees error message “Shipping for your order is already FREE! This coupon code cannot be applied.”

Examples: 
|UsingData|
|QA:Teacher_FREEshipping_AlreadyFreeShipping_with_coupon|


