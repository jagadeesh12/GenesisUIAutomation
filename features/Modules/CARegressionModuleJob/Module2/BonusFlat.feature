@CouponModify
Feature: BonusFlat
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            BONUS FLAT SCENARIOS                        ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################



@Golden
@BonusFlat
@Priority1
@Maintenance
Scenario Outline: Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier1:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to the cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher submit the order
And teacher sees the Bonus Flat description in Submitted page

Examples:
|UsingData										|
|QA:teacher_with_soo_and_Manual_Flat_Bonus	|

@Golden
@Example
@BonusFlat
@Priority1
@Maintenance
Scenario Outline: Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier2:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to the cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher submit the order
And teacher sees the Bonus Flat description in Submitted page

Examples:
|UsingData									|
|QA:Teacher_gets_AutoBonusFlat_tier2	|
  
 
@Golden
@Example
@BonusFlat
@Priority1
@Maintenance
Scenario Outline: Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier3:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to the cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher submit the order
And teacher sees the Bonus Flat description in Submitted page

Examples:
|UsingData									|
|QA:Teacher_gets_AutoBonusFlat_tier3	|


@Golden
@BonusFlat
@Priority1
Scenario Outline:Teacher does not get Bonus Flat Dollars on a cart which does not meet minimum amount:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO item for Paid Shipping
And teacher navigates to [Review Cart] page
And teacher navigates to [Redemptions & Rewards] page
Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|QA:teacher_does_not_see_Bonus_Flat_1	|


@Golden
@BonusFlat
@Priority1
Scenario Outline:No Bonus Flat Dollars if the cart total qualifying for promotion includes Redemptions:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds [ItemInformation] eligible amount for Bonus Flat
  And Teacher navigates to Review Your Cart page
And teacher navigates to coupons & Rewards page
When teacher enters amount in [student Bonus Bank] such that cart total is now below [minimum amount]
And teacher clicks on Apply in Students section
Then teacher does not see the Bonus Flat message in Rewards section

Examples:
|UsingData								|
|QA:teacher_does_not_see_Bonus_Flat_2	|

@Golden
@BonusFlat
@Maintenance
@Priority1

Scenario Outline:Bonus Flat Dollars not added to Bonus Bank when teachers cart has Teachers club order only:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher adds Teacher Exclusives item for Paid Shipping
And teacher navigates to [Review Cart] page from Search results page
When teacher navigates to [Redemptions & Rewards] page
Then teacher does not see the Bonus Flat message in Rewards section

Examples:
|UsingData								|
|QA:teacher_does_not_see_Bonus_Flat_3	|


@BonusFlat
@Priority2
Scenario Outline:Bonus Flat Dollars removed from Bonus Bank as teacher removes items making cart non-qualifying:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher receives Flat Bonus dollars
	And teacher deletes the items from cart making cart non-qualifying
	And Teacher navigates to rewards & coupons page
	Then teacher does not receive Flat Bonus dollars
	And does not see the Bonus Flat message in Rewards section

Examples:
  | UsingData                            |
  | QA:BonusFlat:Teacher_gets_AutoBonusFlat |

#SS - This combination of promotion for DTS and Bonus Flat is not setup in BM
#@BonusFlat
#@Priority2
#Scenario Outline:Teacher receieves Bonus Flat promotion if top-off from DTS makes cart qualify for Bonus Flat promotion:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	And teacher navigates to YTO page
#	And teacher adds YTO item for Paid Shipping
#	And teacher navigates to [Review Cart] page
#	And teacher navigates to [Redemptions & Rewards] page
#	And teacher sees the Dollars to spend promotion
#	And teacher clicks on Make Selection button
#	And teacher selects a grade
#	When teacher selects an item from Make Selection window
#	And teacher clicks on Confirm Selection button
#	And teacher is on coupons & Rewards page
#	Then teacher receives Flat Bonus dollars
#
#Examples:
#  | UsingData                               |
#  | QA:BonusFlat:TeacherOrder_AutoBonusFlat_2 	|
  
    
@BonusFlat
@Priority2


Scenario Outline:Teacher is notified with the next tier of promotions when teacher qualifies for Bonus Flat promotion:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO item for [Bonus Flat Upsell]
	When Teacher navigates to rewards & coupons page
	Then teacher sees the upsell message with dollars gained from current cart total
	And teacher is notified of dollar amount that teacher would receive if teacher adds items to cart meeting next tier

Examples:
  | UsingData                       |
  | QA:BonusFlat:Teacher_UpsellMessage |