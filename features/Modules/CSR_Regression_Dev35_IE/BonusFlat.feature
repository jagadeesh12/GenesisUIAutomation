@Module1Now
Feature: Bonus Flat
	This feature is to validate the Bonus Flat scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@Automated @CSR_Manual_BonusFlat @Priority1
Scenario Outline:CSR applies Bonus Flat coupon on qualifying cart with Student Club orders and checkout:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR applies Bonus Flat coupon
	#Then CSR receives Flat Bonus Dollars
	And sees the Bonus Flat coupon number and message in coupons section
	#And CSR navigates to Confirm  & Submit page
	#And CSR sees the Bonus Flat coupon number and message in coupons section
	#And CSR submits the order 

Examples: 
	| UsingData                   			|
	| Dev35_CSR:TeacherOrder_BonusFlatCoupon_1 	|
	
	
@Automated @Manual_BonusFlat @Priority1 
Scenario Outline:Teacher cannot apply Bonus Flat coupon on a cart which does not meet minimum amount:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Club items to the cart less than the [minimum amount]
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR applies Bonus Flat coupon
	Then CSR sees error message for order amount does not meet Bonus Flat value

Examples: 
	| UsingData                   		|
	| Dev35_CSR:TeacherOrder_BonusFlatCoupon_2|
	

@Automated @Manual_BonusFlat @Priority1 
Scenario Outline:Teacher cannot apply Bonus Flat coupon on Teacher club orders:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR applies Bonus Flat coupon
	Then CSR sees error message for the Teacher Catalogues items
	
Examples: 
	| UsingData                   		|
	| Dev35_CSR:TeacherOrder_BonusFlatCoupon_3|
	

@Automated @Manual_BonusFlat @Priority2 
Scenario Outline:Bonus Flat Dollars removed from Bonus Bank when teacher removes items from cart making cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies Bonus Flat coupon
	#And CSR receives Flat Bonus Dollars
	When CSR deletes items from cart making cart non-qualifying
	#Then CSR does not see Flat Bonus dollars
	And does not see the Bonus Flat message in coupons section

Examples: 
	| UsingData                   			|
	| Dev35_CSR:TeacherOrder_BonusFlatCoupon_4 	|
	

@Automated @Manual_BonusFlat @Priority2 
Scenario Outline:CSR should not be able to apply coupon that is already redeemed:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR applies already redeemed Bonus Flat coupon
	Then CSR recieves error message

Examples: 
	| UsingData                   			|
	| Dev35_CSR:TeacherOrder_BonusFlatCoupon_5	|
	

#@Automated @Priority2 @UpsellMessage 
#Scenario Outline:CSR is notified with the next tier of promotions when teacher qualifies for Bonus Flat promotion:[<UsingData>]
#
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	And CSR adds Student Clubs items to the cart to meet the minimum amount
#	And CSR navigates to Review Cart page from Order Entry page
#	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#	Then CSR sees the upsell message with dollars gained from current cart total
#	#And CSR is notified of dollar amount that teacher would receive if teacher adds items to cart meeting next tier
#
#Examples: 
#	| UsingData             				|
#	| Dev35_CSR:Teacher_BonusFlat_UpsellMessage 	|
	

  