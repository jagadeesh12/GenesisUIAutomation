Feature: DWCAPCOD-2324
	CSR - Teacher Checkout - Redemptions & Rewards Page - Rewards recalculation
	
Background:
	Given CSR opens the rco-scholastic web site
	And CSR goes to the RCOCA CSR site

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@1
Scenario Outline: CSR can apply Teacher Freepick coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for YTO coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for coupon 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR enters valid Coupon code on Rewards Page
And CSR clicks apply on coupon code section
And CSR searches for a [qualifying Item number]
And CSR selects the item from freepick modal
And CSR clicks on Confirm Selection button
Then YTO freepick item information displays on the Redemptions & Rewards page
Examples: 
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_TeacherFreePickCoupon|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@2
Scenario Outline: CSR can apply BonusFlat coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for coupon 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR enters valid Coupon code on Rewards Page
And CSR clicks apply on coupon code section
Then Bonus Flat coupon information displays under Applied Coupons section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_BonusFlatCoupon|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@3
Scenario Outline: CSR can apply TGAT coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for TGAT coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for coupon 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR enters a TGAT coupon
And CSR enters referring Teacher account details in TGAT modal window
Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed
And the TGAT coupon information displays under Applied Coupons section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_TGATCoupon|    

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@4
Scenario Outline: CSR can apply FreeItem coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for FreeItem coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for coupon 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR enters valid Coupon code on Rewards Page
And CSR clicks apply on coupon code section
Then Free Item coupon information displays under Applied Coupons section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_FreeItemCoupon|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@5
Scenario Outline: CSR can redeem Bonus Flat promotion on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat Promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for promotion 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR sees the Bonus Flat description in Rewards section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_BonusFlatPromotion|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@6
Scenario Outline: CSR can redeem Student Incentive on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Student Incentive promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for promotion 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR sees the Student Incentive description in Rewards section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_StudentIncentivePromotion|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@7
Scenario Outline: CSR can redeem Free Item promotion on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Free Item Promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR sees the Free Item description in Rewards section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_FreeItemPromotion|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@8
Scenario Outline: CSR can redeem Spell Scholastic promotion on pre-tax YTO + SOO subtotal:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Spell Scholastic
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR sees the Spell Scholastic promotion description in Rewards section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_SpellScholastic|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@9
Scenario Outline: CSR cannot redeem bonus flat coupon on Teacher Exclusive items:[<UsingData>]
Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds teacher exclusive items to order entry such that SOO + Teacher Exclusive pre-tax subtotal meets the min. amount for coupon 
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR enters valid Coupon code on Rewards Page
And CSR clicks apply on coupon code section
Then error message displays and coupon is not applied
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:TeacherExclusiv_SOO_BonusFlatCoupon_Unqualify|

@DWCAPCOD-2324
@Priority1
@SOO
@CSR
@10
Scenario Outline: Excluding SOO order does not qualify for promotion:[<UsingData>]
Given teacher has pending parent orders in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds items less than the min. amount for promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR excludes the SOO orders on Review Cart page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR does not see the Bonus Flat description in Rewards section
Examples:
|UsingData|
|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_BonusFlatPromotion_ExcludeSOO|

#Scenario Outline: Deleting SOO order does not qualify for promotion:[<UsingData>]
#Given implementation is pending for this
#Given teacher has pending parent orders in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat promotion
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR adds items to order entry such that SOO + YTO pre-tax subtotal meets the min. amount for YTO coupon 
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#And CSR navigates to cart page
#And CSR deletes one of the parent order making the pre-tax subtotal less than the min. amount
#When CSR navigates to Rewards & Coupons page
#Then CSR does not see the Bonus Flat description in Rewards section
#Examples:
#|UsingData|
#|InSprint16.5:CSR:SOO:RewardsRedemption:YTO_SOO_DeleteSOO|