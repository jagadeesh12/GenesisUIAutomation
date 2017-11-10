Feature: Rewards and Coupons
	This feature is used to check the "Manual Free Shipping" scenario validation

 
Background: 
	Given teacher open rco-scholastic web site 

	
                                   
@Golden
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Teacher Club orders to receive free shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
    And teacher adds teacher club items to cart meeting the [Manual shipping threshold]
	And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Golden:Teacher_FREEshipping_with_coupon|
	
	
@Golden
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher cannot apply Free Shipping coupon on a cart which does not meet minimum amount:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
    And teacher adds Student club items to cart less than the [Manual shipping threshold]
	And teacher navigates to coupons & Rewards page
	When teacher applies [Free Shipping Coupon]
    Then teacher sees error message for order amount not meeting for Free Shipping
	
	Examples: 
	|UsingData|
	|Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold_Coupon|
	
	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Student Club orders to receive free shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student club items to cart less than the [Manual shipping threshold]
	And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_StudentItems_FREEshipping_with_coupon|
	

@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Teacher and Student Club orders to receive free shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
	And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_StudentTeacherItems_FREEshipping_with_coupon|
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Student Bonus dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_StudentBonusRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Student paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_StudentPaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Bonus and paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Student Bonus dollar] and [student paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_StudentBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Teacher Bonus dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_TeacherBonusRedemptions_charged_ShippingFee_Coupon|
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_TeacherPaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Bonus and paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Teacher Bonus dollar] and [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_TeacherBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher click on delete and No option does not delete the coupon:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher applies [Free Shipping Coupon]
When teacher clicks on Delete coupon
And teacher clicks on No option
Then coupon is not deleted
And teacher still has FREE shipping

Examples: 
|UsingData|
|Teacher_FREEshipping_DeleteNo_with_coupon|	


@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher cannot apply already redeemed coupon:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher applies [Free Shipping Coupon]
When teacher tries to apply same [Free Shipping Coupon]
Then teacher sees error message for using same coupon2
	
	Examples: 
	|UsingData|
	|Teacher_FREEshipping_SameCoupon_with_coupon|
	
	
	
#########################   PRIORITY2 ########################	
	
	
@Manual-FreeShipping
@Priority2	
Scenario Outline:Teacher applies Shipping coupon and deletes items from cart making cart non-qualifying resulting in coupon being removed:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher does not receive free Shipping
And teacher applies [Free Shipping Coupon]
And teacher receives FREE shipping
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher delete items from cart resulting in cart total fall below [shipping threshold]
And teacher navigates to coupons & Rewards page
Then teacher does not receive free Shipping
	
Examples:
  | UsingData                          	  	 |
  | Teacher_deletes_items_from_cart_ManualShippingCoupon |
  
  
@Manual-FreeShipping
@Priority2	
Scenario Outline:Teacher can apply a deleted coupon again:[<UsingData>]
	
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher applies [Free Shipping Coupon]
	And teacher clicks on Delete coupon
	And teacher clicks on Yes option
	When teacher tries to apply same [Free Shipping Coupon]
	Then teacher receives FREE shipping
	
Examples:
  | UsingData                          	  	 |
  | Teacher_deletes_Coupon_AddsCoupon_ManualShippingCoupon |
   
  
############################	PRIORITY 3 ########################


@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher cannot apply Free Shipping coupon on a Free shipping cart:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher adds Teacher items to cart equal to the [shipping threshold]
And teacher navigates to coupons & Rewards page
And teacher receives FREE shipping
When teacher applies [Free Shipping Coupon]
Then teacher sees error message “Shipping for your order is already FREE! This coupon code cannot be applied.”

Examples: 
|UsingData|
|BTS:Teacher_FREEshipping_SameCoupon_with_coupon|


@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher recieves Free shipping if the top-off from DTS makes the cart qualify for Free shipping:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher add items to cart less than the [shipping threshold] and equal to [minimum amount] for Dollars to Spend promotion
And teacher navigates to coupons & Rewards page
And [Shipping Fee] displays in Shipping & Handling blue header
And teacher clicks on Make Selection button
When teacher selects an item such that the top-off amount makes cart meet the [shipping threshold]
And teacher clicks on Confirm Selection button
Then teacher receives FREE shipping

Examples: 
|UsingData|
|BTS:Teacher_Receives_FREEshipping_TopoffAmt|


@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher can apply Free shipping coupon if the top-off from DTS makes the cart qualify for Free shipping:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher add items to cart less than the [manual shipping threshold] and equal to [minimum amount] for Dollars to Spend promotion
And teacher navigates to coupons & Rewards page
And [Shipping Fee] displays in Shipping & Handling blue header
And teacher clicks on Make Selection button
When teacher selects an item such that the top-off amount makes cart meet the [shipping threshold]
And teacher clicks on Confirm Selection button
When teacher applies [Free Shipping Coupon]
Then teacher receives FREE shipping

Examples: 
|UsingData|
|BTS:Teacher_Receives_FREEshipping_ManualCoupon_TopoffAmt|


