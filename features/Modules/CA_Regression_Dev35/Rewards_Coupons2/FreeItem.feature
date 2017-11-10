Feature: FreeItem
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################           FREE ITEM SCENARIOS                          ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################


  @Golden
  @FreeItem
  @Priority1
  @Maintenance
  Scenario Outline:Teacher receives Free item promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]

    Given  teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    When teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    Then Teacher should see Free item promotion is displayed
    And teacher navigate to payment page
    And teacher selects payment method as credit card on payment page
    And Teacher sees Free item promotion in Confirm & Submit page
    And teacher submit the order
    And Teacher sees Free item promotion in Confirmation page

  Examples:
    |UsingData|
    |Golden:teacher_with_soo_and_Automatic_tossin_minamount|
		
		

@Golden
@FreeItem
@Priority1
@Maintenance
Scenario Outline:Teacher does not receive Free item promotion on cart withTeacher catalogs:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
When teacher adds Teacher items to cart equal to the [Free Item Promotion]
And teacher navigates to coupons & Rewards page
Then Teacher should not see Free item promotion is displayed

		
Examples: 
		|UsingData|
		|Golden:teacher_catalogues_Automatic_tossin_minamount|
		
		
@Golden
@FreeItem
@Priority1
@Maintenance
Scenario Outline:Teacher should not receive Free item promotion on a cart which does not meet qualifying minimum amount:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds student club items to cart less than [minumum amount]
And teacher navigates to coupons & Rewards page
Then Teacher should not see Free item promotion is displayed

		
Examples: 
		|UsingData|
		|Golden:teacher_club_items_Automatic_tossin_less_than_minamount|  
		
		
@FreeItem
@Priority1
Scenario Outline:Teacher can apply Free item coupon on a cart with qualifying minimum amount on Student Club orders and Checkout:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher applies [Free item coupon]
	And Teacher sees Free item displayed in Coupons section
	And teacher proceeds to checkout from rewards and coupons page
	Then Teacher sees Free item information in Payments page Coupons section
	When teacher submit the order
	Then Teacher sees Free item information in Order reference page Coupons section
	
Examples:
  | UsingData                             |
  | BTS:FreeItem:teacher_login_FreeItemCoupon |	
  

@FreeItem
@Priority1
Scenario Outline:Teacher cannot apply the Free item coupon if the cart total qualifying for promotion includes Redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher enters amount in [student Bonus Bank] such that cart total is now below [minimum amount]
	And teacher clicks on Apply in Students section
	And Teacher applies [Free item coupon]
	Then Teacher sees error message
	
Examples:
  | UsingData                             					|
  | BTS:FreeItem:teacher_ManualFreeItem_StudentBonusRedemption 	|
  

@FreeItem
@Priority1
Scenario Outline:Teacher cannot apply Free item coupon on cart with Teacher catalogs:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher adds Teacher items to cart equal to the [Manual Free Item Coupon]
    And teacher navigates to coupons & Rewards page
	And Teacher applies [Free item coupon]
	Then Teacher sees error message
	
Examples:
  | UsingData                             	|
  | BTS:FreeItem:teacher_login_FreeItemCoupon_2 	|
  

@FreeItem
@Priority1
Scenario Outline:Teacher cannot apply Free item coupon on a cart which does not meet qualifying minimum amount:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds student club items to cart which is less than required [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher applies [Free item coupon]
	Then Teacher sees error message
	
Examples:
  | UsingData                             	|
  | BTS:FreeItem:teacher_login_FreeItemCoupon_3 	|	
  
  
@FreeItem
@Priority1
Scenario Outline:Teacher cannot apply Free item coupon if Redemptions from student paper coupon makes the cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher enters amount in [student paper dollar] such that cart total is now below [minimum amount]
	And teacher clicks on Apply in Students section
	And Teacher applies [Free item coupon]
	Then Teacher sees error message
	
Examples:
  | UsingData                             					|
  | BTS:FreeItem:teacher_StudentPaperRedemption_FreeItemCoupon 	|	
  
  
@FreeItem
@Priority1
Scenario Outline:Teacher can apply Free item coupon if Redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher adds teacher club items to cart with [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher adds amount in [Teacher Bonus dollars] such that cart total is now below [minimum amount]
	And teacher clicks on Apply in teacher section
	And Teacher applies [Free item coupon]
	Then Teacher sees Free item displayed in Coupons section
	
Examples:
  | UsingData                             					|
  | Golden:FreeItem:teacher_TeacherBonusRedemption_FreeItemCoupon 	|	
  
  
@FreeItem
@Priority1
Scenario Outline:Teacher receives Free item promotion if the cart total qualifying for promotion includes Teacher paper coupon Redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher adds teacher club items to cart with [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher adds amount in [Teacher paper dollar] such that cart total is now below [minimum amount]
	And teacher clicks on Apply in teacher section
	And teacher sees the Dollars to spend promotion
	
Examples:
  | UsingData                           |
  | BTS:FreeItem:teacher_login_FreeItem 	|	   
  
          
@FreeItem
@Priority1
Scenario Outline:Teacher can apply Free item promotion if Redemptions from Teacher paper coupon makes the cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher adds teacher club items to cart with [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher adds amount in [Teacher paper dollar] such that cart total is now below [minimum amount]
	And teacher clicks on Apply in teacher section
	And Teacher applies [Free item coupon]
	Then Teacher sees Free item displayed in Coupons section
	
Examples:
  | UsingData                           					|
  | BTS:FreeItem:teacher_TeacherPaperRedemption_FreeItemCoupon 	|
  
  
@FreeItem
@Priority1
Scenario Outline:Teacher can apply a deleted toss-in coupon:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds items to cart that meets the [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher applies [Free item coupon]
	Then Teacher sees Free item displayed in Coupons section
	When teacher deletes the Free item coupon
	And teacher can apply the same [Free item coupon] again
	Then Teacher sees Free item displayed in Coupons section
	
Examples:
  | UsingData                           	|
  | BTS:FreeItem:Teacher_ManualFREEItemCoupon 	|  
  
    
@FreeItem
@Priority1
Scenario Outline:Teacher cannot apply a Toss-in coupon that is already redeemed:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds items to cart that meets the [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	When teacher applies already redeemed [Free item coupon]
	Then Teacher sees error message
	
Examples:
  | UsingData                           			|
  | Golden:FreeItem:Teacher_ManualFREEItem_RedeemedCoupon 	|  
      
  
@FreeItem
@Priority2
Scenario Outline:Free item coupon is removed when teacher deletes items from cart making cart non-qualifying_2:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher applies [Free item coupon]
	Then Teacher sees Free item displayed in Coupons section
	And Teacher deletes items from cart such that cart does not qualify for [minimum amount]
	And Teacher navigates to rewards & coupons page
	Then Free item Coupon should not display
	And teacher can proceed to payment page
	
Examples:
  | UsingData                            |
  | BTS:FreeItem:teacher_login_FreeItemCoupon_4 |  
  
  
  
#################################			PRIORITY 3  SCENARIOS			#################################################

  @FreeItem
  @Priority3
  @data
  Scenario Outline:Teacher cannot apply Free item coupon when promotion expires:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And Teacher applies [Free item coupon]
    Then Teacher sees error message


  Examples:
    |UsingData|
    |BTS:Teacher_FreeItem_Expired_ManualCoupon|



@FreeItem
@Priority3
Scenario Outline:Teacher can apply Free item coupon on a cart with top-off amount making the cart qualifying:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds items to cart less than the [minimum amount]for free item and equal to [minimum amount] for Dollars to Spend promotion
And teacher navigates to coupons & Rewards page
And teacher clicks on Make Selection button
When teacher selects an item such that the top-off amount makes cart meet the [shipping threshold]
And teacher clicks on Confirm Selection button
And Teacher applies [Free item coupon]
Then Teacher sees Free item displayed in Coupons section

Examples: 
|UsingData|
|BTS:Teacher_FreeItem_DTSTopOffAmt_ManualCoupon|