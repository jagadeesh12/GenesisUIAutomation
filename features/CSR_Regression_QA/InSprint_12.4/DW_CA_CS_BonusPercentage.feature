Feature: Redeem & Rewards : Bonus Percentage
	This feature is to validate the Redeem & Rewards : Bonus Percentage scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site		

	
@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority1 
Scenario Outline:CSR Predetermined percentage of Bonus Coupon Rewards dollars added to my Bonus Bank on applying coupon on Student Club order:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR applies [Bonus percentage coupon]
	Then CSR recieves percentage*carttotal/100 dollars
	And CSR sees the Bonus percentage description in Coupons section
	#And CSR navigates to Confirm & Submit page 
	#And CSR sees the Bonus percentage description in Coupons section 
	#And CSR clicks on Submit Order 
	#And CSR sees the Bonus percentage description in Coupons section 
	
Examples: 
	| UsingData                           		|
	| QA_CSR:Teacher_apply_Bonuspercentagecoupon 	|
		

@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority1 
Scenario Outline:CSR cannot apply Bonus Percentage coupon on a cart with Teacher catalogue orders:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR applies [Bonus percentage coupon] 
	Then CSR does not see the Bonus percentage description in Coupons section
	
Examples: 
	| UsingData                           		|
	| QA_CSR:Teacher_apply_Bonuspercentagecoupon_2 |
	

@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority1 
Scenario Outline:CSR cannot apply Bonus percentage coupon on a cart which does not meet minimum amount:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Club items to the cart less than the [minimum amount]
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR applies [Bonus percentage coupon] 
	Then CSR receives error message for order does not meet the coupon minimum value
	
Examples: 
	| UsingData                           		|
	| QA_CSR:Teacher_apply_Bonuspercentagecoupon_3 |
	

@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority2 
Scenario Outline:Bonus percentage coupon removed when CSR removes items making cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR applies [Bonus percentage coupon] 
	And CSR recieves percentage*carttotal/100 dollars
	When CSR deletes items from cart
	Then CSR does not see the Bonus percentage dollars received earlier
	
Examples: 
	| UsingData                           		|
	| QA_CSR:Teacher_apply_Bonuspercentagecoupon_4 |
	
	
@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority1 
Scenario Outline:CSR can view the Bonus percentage coupon information displayed on all checkout pages, email, Order Detail:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR applies [Bonus percentage coupon] 
	Then CSR sees the Bonus percentage description in Coupons section
	#And CSR navigate to payment page
	#And CSR selects checks as payment
	#And CSR clicks on "Continue checkout"
	#And CSR sees the Bonus percentage description in Confirm Submit page
	#And CSR submits the order

Examples: 
	|UsingData								|
	|QA_CSR:teacher_Bonus_Percentage_Desc_4	|
	

@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority1 
Scenario Outline: CSR cannot apply an expired coupon on any cart:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR applies [expired coupon]
	Then CSR recieves error message
	
Examples: 
	| UsingData                         	|
	| QA_CSR:Teacher_entered_expiredcouponcode |
	
	
@ORPHAN @Automated @CSR_BonusPercentageCoupon @Priority1 
Scenario Outline:CSR should not be able to apply Bonus Percentage coupon that is already redeemed:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR applies [redeemed coupon]
	Then CSR recieves error message
	
Examples: 
	| UsingData                          		|
	| QA_CSR:Teacher_entered_redeemedcouponcode 	|
	

@ORPHAN @Automated @CouponsAndRewards @CSR_BonusPercentageCoupon @Priority3 
Scenario Outline:CSR can apply Bonus percentage coupon if top-off from DTS makes cart qualify for Bonus percentage coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount for Dollars to Spend promotion and less than the minimum amount for [Bonus Percentage] coupon
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR views Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects an item such that the top-off amount makes cart meet the [Bonus percentage coupon]
	And CSR clicks on Confirm Selection button
	When CSR applies [Bonus percentage coupon]
	Then CSR sees the Bonus percentage description in Coupons section

Examples: 
	|UsingData												|
	|QA_CSR:Teacher_BonusPercentage_DTSTopOffAmt_ManualCoupon	|
	
	
	
	