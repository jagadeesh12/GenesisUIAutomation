@CouponModify
Feature: Auto-FreeShipping
This feature is used to validate all scenarios


Background: 
Given teacher open rco-scholastic web site



#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            AUTO FREE SHIPPING                         ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################


@Golden
@Auto-FreeShipping
@Priority1
Scenario Outline:Free shipping for order total greater than or equal to Shipping threshold on Teacher and Student club orders:[<UsingData>]


Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Free Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then teacher receives FREE shipping

Examples: 
|UsingData|
|QA:Golden:Teacher_FREEshipping_greaterthan_Shipping_Threshold|



@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Paid shipping on a cart with order total less than the Shipping threshold on Teacher and Student club orders:[<UsingData>]


Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then teacher does not receive free Shipping

Examples: 
|UsingData|
|QA:Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold|




@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged GST & PST on the shipping fee:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, GST, PST and Shipping & Handling Total displays in Shipping & Handling section

Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_BC|



@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged GST & QST on the shipping fee:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, GST, QST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_QC|


@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NL' Province in Coupons and Rewards page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NL|


@Golden
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher is charged HST on the shipping fee against 'NS' Province in Coupons and Rewards page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NS|



@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NB' Province in Coupons and Rewards page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NB|



@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged HST on the shipping fee against 'ON' Province in Coupons and Rewards page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_ON|




@Golden
@Auto-FreeShipping	
@Priority1
Scenario Outline:Teacher is charged HST on the shipping fee against 'PE' Province in Coupons and Rewards page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
|UsingData|
|QA:Golden:Teacher_charged_taxes_onshippingfee_basedon_province_PE|




@Golden
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Free Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher receives FREE shipping
When teacher enters amount in [student bonus dollar] resulting in cart total fall below [shipping threshold]
Then teacher receives FREE shipping

Examples: 
|UsingData|
|QA:Golden:Teacher_FREEshipping_Redemption_lessthan_Shipping_Threshold|                                  


@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher is charged GST on shipping fee against 'AB' Province in Coupons and Rewards page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, GST and Shipping & Handling Total displays in Shipping & Handling section

Examples:
|UsingData|
| QA:Teacher_charged_taxes_onshippingfee_basedon_province_AB |	


@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receives Free Shipping if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Free Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher receives FREE shipping
When teacher enters amount in [student paper dollar] resulting in cart total fall below [shipping threshold]
Then teacher receives FREE shipping

Examples: 
|UsingData|
|QA:Teacher_StudentPaperCoupon_FREEshipping_greaterthan_Shipping_Threshold|



@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receives Free Shipping if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
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
Scenario Outline:Teacher still receives Free Shipping if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher adds Teacher Exclusives item for Free Shipping
And teacher navigates to [Review Cart] page from Search results page
When teacher navigates to [Redemptions & Rewards] page
And teacher receives FREE shipping
When teacher enters amount in [teacher paper dollar] resulting in cart total fall below [shipping threshold]
Then teacher receives FREE shipping

Examples: 
|UsingData|
|QA:Teacher_charged_ShippingFee_TeacherPaperRedemptions|



@Auto-FreeShipping
@Priority2
Scenario Outline:Teacher add more items to cart resulting in Free Shipping:[<UsingData>]


Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher does not receive free Shipping
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher adds items from cart resulting in cart total cross [shipping threshold]
And teacher navigates to [Redemptions & Rewards] page
Then teacher receives FREE shipping

Examples: 
|UsingData|
|QA:Teacher_AddMoreItems_ShippingFee_lessthan_Shipping_Threshold|



@Auto-FreeShipping
@Priority2
Scenario Outline:Teacher deletes items from cart resulting in paid shipping:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Free Shipping with item number
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher receives FREE shipping
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher deletes items from cart resulting in cart total fall below [shipping threshold]
And teacher navigates to [Redemptions & Rewards] page
Then teacher does not receive free Shipping

Examples: 
|UsingData|
|QA:Teacher_DeletesItems_FREEshipping_greaterthan_Shipping_Threshold|



##################################################12.4

@Sprint12.4
@Manual-FreeShipping
@Priority2
Scenario Outline:Free shipping coupon in cart,add items for free promo:[<UsingData>]
#Teacher applies Free shipping coupon and adds more items to cart making the cart qualifying for automatic free promotion:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Free Shipping
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher does not receive free Shipping
And teacher applies [Free Shipping Coupon]
And teacher receives FREE shipping
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher adds more items to cart meeting the [shipping threshold]
And teacher navigates to coupons & Rewards page
Then the FREE shipping coupon is automatically removed
And teacher receives FREE shipping
And teacher proceeds to checkout from coupons & rewards page and submit the order
And teacher is able to apply the free shipping coupon in next order

Examples:
|UsingData|
|QA:Teacher_RemovesShippingCoupon_UseInAnotherOrder|