@bonuspercentagenow
Feature: BonusPercentage
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            BONUS PERCENTAGE SCENARIOS                  ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################


@Golden
@Maintenance
@BonusPercentage
@Priority1
Scenario Outline:Bonus Coupon Rewards dollars added to Bonus Bank based,tiered percentage on Student Club order:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Percentage
#And Teacher navigates to Review Your Cart page
When Teacher navigates to rewards & coupons page
Then teacher see the Bonus percentage description in Rewards section with correct calculated dollars
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus percentage description in Confirm Submit page
And teacher submit the order
And teacher sees the Bonus percentage description in Confirmation page

Examples: 
|UsingData								|
|QA:Golden:teacher_Bonus_Percentage_Desc_1	|


@Golden
@BonusPercentage
@Maintenance
@Priority1
Scenario Outline:Teacher does not receive Bonus coupon Reward dollars on cart with Teacher Club items only:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds teacher club items to cart with minimum amount for bonus percentage
And teacher navigates to coupons & Rewards page
Then teacher does not see the Bonus Percentage message in Rewards section

Examples: 
|UsingData								|
|QA:Golden:teacher_Bonus_Percentage_Desc_2	|
    

@Golden
@BonusPercentage
@Maintenance
@Priority1
Scenario Outline:Bonus percentage display rewards section on different checkout pages:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Percentage
#And Teacher navigates to Review Your Cart page
And  Teacher navigates to rewards & coupons page
Then teacher see the Bonus percentage description in Rewards section with correct calculated dollars
And teacher navigates to Confirm & Submit page
And teacher see the Bonus percentage description in confirm submit page with correct calculated dollars
And teacher clicks on Submit Order
And teacher see the Bonus percentage description in confirmation page with correct calculated dollars


Examples: 
|UsingData								|
|QA:Golden:teacher_Bonus_Percentage_Desc_3	|


@BonusPercentage
@Priority1
Scenario Outline:Teacher does not receive Bonus percentage rewards on a cart which does not meet minimum amount:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher add items from student clubs with unique item id number
	#And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher does not recieve Bonus percentage dollars
	And teacher does not see the Bonus percentage description in Rewards section
	
Examples:
  | UsingData                                		 |
  | QA:BonusPercentage:Teacher_AutoBonusPercentage 	|
  



@BonusPercentage
@Priority2
Scenario Outline:Teacher adding more items to cart making cart qualify for next tiered Bonus Percentage:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to meet the [minimum amount] for first tier
	#And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from first tier
	When teacher adds more items to cart qualifying for next tier
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from second tier
	And teacher sees description from second tier and calculations based on second tier in Rewards section

Examples:
  | UsingData                                		 		|
  | QA:BonusPercentage:Teacher_AutoBonusPercentage_tierShift 	|
  
  
@BonusPercentage
@Priority2
Scenario Outline:Teacher removing items from cart leads to previous tiered percentage:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to meet the [minimum amount] for second tier
	#And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from second tier
	When teacher deletes the items from cart qualifying for first tier
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from first tier
	And teacher sees description from first tier and calculations based on first tier in Rewards section

Examples:
  | UsingData                                		 			|
  | QA:BonusPercentage:Teacher_AutoBonusPercentage_tiershift_2 	|
  
  
@BonusPercentage
@Priority2
Scenario Outline:Bonus percentage promotion if top-off from DTS makes cart qualify for Bonus percentage promotion:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	#And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window
	And teacher clicks on Confirm Selection button
	Then teacher recieves Bonus percent Dollars
	
Examples:
  | UsingData                                		|
  | QA:BonusPercentage:TeacherOrder_AutoBonusPercent 	|
  
  
@BonusPercentage
@Priority2
Scenario Outline: next tier of promotions when teacher qualifies for Bonus percentage:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to get the upseller message for second tier
	#And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher sees the upsell message with dollars gained from current cart total
	And teacher is notified of dollar amount that teacher would receive if teacher adds items to cart meeting next tier

Examples:
  | UsingData                             |
  | QA:BonusPercentage:Teacher_UpsellMessage |