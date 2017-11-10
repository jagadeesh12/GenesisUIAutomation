Feature: Golden Scenarios
	This feature is used to validate the Golden scenarios

 
Background: 
	Given teacher open rco-scholastic web site 




#################################################            BONUS FLAT SCENARIOS                        ##############################################
#######################################################################################################################################################
########################################################################################################################################################



@Golden
@BonusFlat
@Maintenance
Scenario Outline:Teacher receives Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier1:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Dollars to Spend from SF page
And teacher navigates to coupons & Rewards page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher navigates to Submitted page
And teacher sees the Bonus Flat description in Submitted page

Examples: 
|UsingData										|
|Golden:teacher_with_soo_and_Manual_Flat_Bonus	|

@Golden
@Example
@BonusFlat
Scenario Outline:Teacher receives Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier2:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
When teacher adds [ItemInformation] eligible amount for Dollars to Spend from SF page
And teacher navigates to coupons & Rewards page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher navigates to Submitted page
And teacher sees the Bonus Flat description in Submitted page

Examples: 
|UsingData									|
|Golden:Teacher_gets_AutoBonusFlat_tier2	|
  
 
@Golden
@Example
@BonusFlat  
Scenario Outline:Teacher receives Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier3:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Dollars to Spend from SF page
And teacher navigates to coupons & Rewards page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher navigates to Submitted page
And teacher sees the Bonus Flat description in Submitted page

Examples: 
|UsingData									|
|Golden:Teacher_gets_AutoBonusFlat_tier3	|


@Golden
@BonusFlat
Scenario Outline:Teacher does not get Bonus Flat Dollars on a cart which does not meet minimum amount:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Dollars to Spend from SF page
And teacher navigates to coupons & Rewards page
##Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_does_not_see_Bonus_Flat_1	|


@Golden
@BonusFlat
Scenario Outline:Teacher does not get Bonus Flat Dollars if the cart total qualifying for promotion includes Redemptions:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds [ItemInformation] eligible amount for Dollars to Spend from SF page
And teacher navigates to coupons & Rewards page
When Teacher enters the bonus bank coupons 
##Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_does_not_see_Bonus_Flat_2	|


@Golden
@BonusFlat
@Maintenance
Scenario Outline:Bonus Flat Dollars not added to Bonus Bank when teachers cart has Teachers club order only:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When Teacher adds teacher club items to cart with minimum amount
And teacher navigates to coupons & Rewards page
Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_does_not_see_Bonus_Flat_3	|





#################################################            BONUS PERCENTAGE SCENARIOS                  ##############################################
#######################################################################################################################################################
########################################################################################################################################################





@Golden
@Maintenance
@BonusPercentage
Scenario Outline:Predetermined percentage of Bonus Coupon Rewards dollars automatically added to my Bonus Bank based on a tiered percentage on Student Club order:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When Teacher adds teacher club items to cart with minimum amount
And teacher navigates to coupons & Rewards page
Then teacher see the Bonus percentage description in Rewards section with correct calculated dollars
And teacher navigates to Confirm & Submit page
#And teacher sees the Bonus percentage description in Rewards section
#And teacher clicks Submit Order
#And teacher sees the Bonus percentage description in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_1	|


@Golden
@BonusPercentage
@Maintenance
Scenario Outline:Teacher does not receive Bonus coupon Reward dollars on cart with Teacher Club items only:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When Teacher adds teacher club items to cart with minimum amount
And teacher navigates to coupons & Rewards page
#Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_2	|
    
    
@Golden
@BonusPercentage
@Maintenance
Scenario Outline:Teacher can view the Bonus percentage reward information in rewards section on different checkout pages, email, Order Detail:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When Teacher adds teacher club items to cart with minimum amount
And teacher navigates to coupons & Rewards page
Then teacher see the Bonus percentage description in Rewards section with correct calculated dollars
#And teacher navigates to Confirm & Submit page
#And teacher see the Bonus percentage description in Rewards section with correct calculated dollars
#And teacher clicks on Submit Order
#And teacher see the Bonus percentage description in Rewards section with correct calculated dollars


Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_3	|   


@Golden
@BonusPercentage
@Maintenance
Scenario Outline:Teacher can view the Bonus percentage coupon information displayed on all checkout pages, email, Order Detail:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And Teacher adds teacher club items to cart with minimum amount
And teacher navigates to coupons & Rewards page
When teacher applies [Bonus percentage coupon]
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher navigates to Submitted page
And teacher sees the Bonus Flat description in Submitted page

Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_4	| 


@Golden
@BonusPercentage
Scenario Outline:Teacher cannot apply an expired coupon on any cart:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
When teacher selects “enter classroom order” from home page 
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
When Teacher navigates to rewards & coupons page
When teacher applies [expired coupon]
Then teacher recieves error message

Examples:
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_5	|


#################################################   DOLLARS TO SPEND  ##############################################
####################################################################################################################
######################################################################################################################


@Golden
@DollarstoSpend
Scenario Outline:Teacher receives Dollars to Spend automatic promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds student club items to cart with [minumum amount]
	When teacher navigates to coupons & Rewards page
	Then teacher views Dollars to Spend promotion
	
	
	Examples: 
	|UsingData								|
	|Golden:Teacher_DTS_with_minimum_amount	|
	
	
	
@Golden
@DollarstoSpend
@Maintenance
Scenario Outline:Teacher does not receive Dollars to spend promotion on a cart which does not meet minimum amount:[<UsingData>] 
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart less than [minumum amount]
	When teacher navigates to coupons & Rewards page
	Then teacher does not receive Dollars to Spend promotion
	
	Examples: 
	|UsingData									|
	|Golden:Teacher_DTS_without_minimum_amount	|	
	
	
	
@Golden
@SCSCOD-3421
@DollarstoSpend	
@Maintenance
Scenario Outline:Teacher does not receive Dollars to Spend promotion if the cart total qualifying for promotion includes Redemptions:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	And teacher views Dollars to Spend promotion
	When teacher enters [Student dollar amount] of Bonus coupon to redeem from Student Bonus bank
    Then teacher does not receive Dollars to Spend promotion
	
	Examples: 
	|UsingData												|
	|Golden:Teacher_redeems_studentdollars_on_minimum_amount|		
	
@Golden
@DollarstoSpend
@Maintenance
Scenario Outline:Teacher does not receive Dollars to Spend promotion on cart with Teacher catalogs:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher add “teacher club items” to cart from YTO page
	When teacher navigates to coupons & Rewards page
	Then teacher does not receive Dollars to Spend promotion
	
	Examples: 
	|UsingData								|
	|Golden:TeacherCatalogue_DTS_with_minimum_amount	|	
	
	
@Golden	
@DollarstoSpend
@Maintenance
Scenario Outline:Teacher selects items from multiple flyers from DTS modal such that there is a top-off and checkout:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	And teacher views Dollars to Spend promotion
	And teacher clicks on Make Selection button
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item from the Make Selection window
	And teacher selects a different grade from dropdown
	And teacher selects an item such that there is a top-off
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
	And teacher submit the order
	And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page
	
	Examples: 
	|UsingData													|
	|Golden:Teacher_DTS_with_minimum_amount_TopOffAmt_Checkout	|
	
@Golden	
@DollarstoSpend	
Scenario Outline:Teacher selects free pick item less than or equal to the coupon amount and checkout:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	And teacher views Dollars to Spend promotion
	And teacher clicks on Make Selection button
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item less than or equal to the coupon amount
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
	And teacher submit the order
	And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page
	
	Examples: 
	|UsingData|
	|Golden:Teacher_DTS_with_minimum_amount_FPI_Checkout|	
	
@Golden	
@DollarstoSpend
@SCSCOD-3661
@Maintenance
Scenario Outline:Top-off amount selected by teacher should be added to the cart total:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	And teacher views Dollars to Spend promotion
	And teacher clicks on Make Selection button
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item such that there is a top-off
	And teacher clicks on Confirm Selection button
	When teacher is on coupons & Rewards page
	Then the cart total includes the top-off amount
	And teacher proceeds to checkout from rewards and coupons page
    And teacher see the cart total includes the top-off amount in Confirm & submit page
    And teacher submit the order
    And teacher see the cart total includes the top-off amount in confirmation page
	
Examples: 
	|UsingData|
	|Golden:Teacher_DTS_with_minimum_amount_CartTotal_IncludesTopOffAmt|	
	
	
@GoldenTODO 
@Auto-DTS 
@Priority1
  Scenario Outline: Teacher is charged GST & PST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects Enter Classroom Order from home page
    And teacher adds student club items to cart with [minumum amount]
    And teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown in DTS modal
    When teacher selects only one item such that there is a top-off
    Then GST & PST are charged on the top-off amount
    And the post tax top-off amount is added to Student club total
    Examples:
      | UsingData                               |
      | Golden:TeacherOrder_TopOff_GST_PST_Province_BC |	
      
      
 @GoldenTODO 
 @Auto-DTS 
 @Priority1
  Scenario Outline: Teacher is charged GST & QST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects Enter Classroom Order from home page
    And teacher adds student club items to cart with [minumum amount]
    And teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown in DTS modal
    When teacher selects only one item such that there is a top-off
    Then GST & QST are charged on the top-off amount
    And the post tax top-off amount is added to Student club total
    Examples:
      | UsingData                               |
      | Golden:TeacherOrder_TopOff_GST_QST_Province_QC |
 
 
@GoldenTODO 
@Auto-DTS 
@Priority
  Scenario Outline: Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal for 'NL' province:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects Enter Classroom Order from home page
    And teacher adds student club items to cart with [minumum amount]
    And teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown in DTS modal
    When teacher selects only one item such that there is a top-off
    Then HST is charged on the top-off amount
    And the post tax top-off amount is added to Student club total
    Examples:
      | UsingData                           |
      | Golden:TeacherOrder_TopOff_HST_Province_NL |    
      
      
 @GoldenTODO 
 @Auto-DTS 
 @Priority
  Scenario Outline: Teacher is not charged taxes on top-off amount for tax exempted schools when multiple items are selected from Dollars to Spend modal:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects Enter Classroom Order from home page
    And teacher adds student club items to cart with [minumum amount]
    And teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown in DTS modal
    When teacher selects multiple items such that there is a top-off
    Then there is no tax charged on the top-off amount
    And the top-off amount is added to Student club total
    Examples:
      | UsingData                                                  |
      | Golden:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB | 
      
      
 @GoldenTODO
 @Auto-DTS 
 @Priority
  Scenario Outline: Teacher can redeem Dollars to Spend once per level per customer:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects Enter Classroom Order from home page
    And teacher adds student club items to cart with [minumum amount]
    And teacher navigates to coupons & Rewards page
    And teacher selects an item from Dollars to Spend modal
    And teacher submits the order
    And teacher navigates to Home page
    And teacher adds student club items to cart with same [minumum amount] as in previous order
    When teacher navigates to coupons & rewards page
    Then teacher does not see the Dollars to spend promotion
    Examples:
      | UsingData                       |
      | Golden:Teacher_DTS_with_minimum_amount_2 |
      
      
########################################	FREE PICK    ########################################################################
#################################################################################################################################
#################################################################################################################################



      
      
@Golden
@FreePick      
Scenario Outline:Teacher can apply Manual Free pick on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	Then Free pick modal displays
	
	Examples: 
	|UsingData|
	|Golden:TeacherOrder_FreePickCoupon|     
	
	
@Golden
@FreePick
@Maintenance
Scenario Outline:Teacher applies a Free Pick Coupon and verify the item must not exceed maximum dollar value:[<UsingData>]
			
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher clicks on grade level dropdown and select a grade from dropdown
	Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
	
Examples: 
	|UsingData|
	|Golden:TeacherOrder_FreePickCoupon_CompareItemsPrice_CouponAmt|	         
	
@Golden
@FreePick
@Maintenance
Scenario Outline:Teacher cannot apply coupon on a cart which does not meet the minimum cart total:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart less than [minumum amount]
	When teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	Then teacher should see order does not meet coupon requirements error message
	
Examples: 
	|UsingData|
	|Golden:TeacherOrder_FreePickCoupon_without_minimum_amount|
	
	
@Golden
@FreePick	
@Maintenance
Scenario Outline:Teacher edits free pick and checkout:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	And Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item from the results
	And teacher clicks on Confirm Selection button
	When teacher click on edit option on dollar to spend section
	And teacher selects a different grade from dropdown
	And teacher selects a different item from Free Pick model window
	And teacher proceeds to checkout from rewards and coupons page
	Then Free pick is displayed in coupons section with correct details in Confirm & Submit page
	And teacher submit the order
	And Free pick is displayed in coupons section with correct details in Confirmation page
	
	Examples: 
	|UsingData|
	|Golden:TeacherOrder_FreePickCoupon_Edit_Checkout|
	
	
	
	
###########################################   		SHIPPING             	         #############################################################        
##################################################################################################################################################        
##################################################################################################################################################  

@Golden
@Auto-FreeShipping
Scenario Outline:Teacher recieves Free shipping on a cart with order total greater than or equal to Shipping threshold on Teacher and Student club orders:[<UsingData>]
		
		
Given teacher login into the application by providing [UserInformation]
When teacher adds items to cart equal to the [shipping threshold]
And teacher navigates to coupons & Rewards page
Then teacher receives FREE shipping

Examples: 
|UsingData|
|Golden:Teacher_FREEshipping_greaterthan_Shipping_Threshold|
	
	
	
@Golden
@Auto-FreeShipping	
Scenario Outline:Teacher recieves Paid shipping on a cart with order total less than the Shipping threshold on Teacher and Student club orders:[<UsingData>]
		
		
Given teacher login into the application by providing [UserInformation]
When teacher add items to cart less than the [shipping threshold]
And teacher navigates to coupons & Rewards page
Then teacher does not receive free Shipping

Examples: 
|UsingData|
|Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold|
	
	
	
	
@Golden
@Auto-FreeShipping	
Scenario Outline:Teacher is charged GST & PST on the shipping fee:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, GST, PST and Shipping & Handling Total displays in Shipping & Handling section
   
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_BC |
  
  
  
@Golden
@Auto-FreeShipping
@SCSCOD-3668	
Scenario Outline:Teacher is charged GST & QST on the shipping fee:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, GST, QST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_QC |
  
  
@Golden
@Auto-FreeShipping	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NL' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NL |
  
  
@Golden
@Auto-FreeShipping	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NS' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NS |
  
  
  
@Golden
@Auto-FreeShipping	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NB' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NB |
  
  
  
@Golden
@Auto-FreeShipping	
Scenario Outline:Teacher is charged HST on the shipping fee against 'ON' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_ON |
  
  
  
  
  @Golden
@Auto-FreeShipping	
Scenario Outline:Teacher is charged HST on the shipping fee against 'PE' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_PE |
  
  
  
  
@Golden
@Auto-FreeShipping
Scenario Outline:Teacher still receive Free Shipping if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add items to cart less than the [shipping threshold]
	And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	When teacher enters amount in [student bonus dollar] resulting in cart total fall below [shipping threshold]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Golden:Teacher_FREEshipping_Redemption_lessthan_Shipping_Threshold|                                  
                                   
                                   
@Golden
@Manual-FreeShipping
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
@SCSCOD-3581
@Manual-FreeShipping
Scenario Outline:Teacher cannot apply Free Shipping coupon on a cart which does not meet minimum amount:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
    And teacher adds Student club items to cart less than the [Manual shipping threshold]
	And teacher navigates to coupons & Rewards page
	When teacher applies [Free Shipping Coupon]
    Then teacher sees error message for order amount not meeting for Free Shipping
	
	Examples: 
	|UsingData|
	|Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold_Coupon|
  
  
  
  

#########################################		STACKABLE COUPONS              ##################################################
##################################################################################################################################
##################################################################################################################################		
	
@GoldenTODO
@StackableCoupons
@Maintenance
Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied non-stackable coupon:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And teacher applies [Non-Stackable coupon]
When teacher tries to apply [stackable coupon]
Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
Examples:
  | UsingData                               |
  | Golden:Teacher_NonstackableandStackableCoupons |	
  
  
  
  
@GoldenTODO
@StackableCoupons
Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
When teacher applies one [Stackable coupon]
Then teacher should be able to apply another [stackable coupon]
Examples:
  | UsingData                               |
  | Golden:Teacher_stackableandStackableCoupons |  
	
	
#########################################		QA STUDENT LINE INCENTIVE       ##################################################
##################################################################################################################################
##################################################################################################################################	
	
	
@Golden	
@SCSCOD-3462
@qastudentincentive
Scenario Outline:Teacher enters 50 students in QA Student incentive and checkout:[<UsingData>]

	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds “ItemInformation” from YTO page 
	And teacher navigates to coupons & Rewards page
	When teacher views Q & A Student incentive with no. of students
	And teacher enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
	And teacher submit the order
	And teacher sees Q & A student incentive information in rewards section on Confirmation page
	
	Examples:
	    |UsingData|
	    |Golden:teacher_login_with_twentydollar_enterstudents_50|	
	    
	    
@Golden
@Example	
@SCSCOD-3462
@qastudentincentive	    
Scenario Outline:Teacher enters 49 students in QA Student incentive and checkout:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds “ItemInformation” from YTO page 
	And teacher navigates to coupons & Rewards page
	When teacher views Q & A Student incentive with no. of students
	And teacher enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
	And teacher submit the order
	And teacher sees Q & A student incentive information in rewards section on Confirmation page
	
	Examples:
	    |UsingData|
	    |Golden:teacher_login_with_twentydollar_enterstudents_49|	    	
	    
	    
@Golden
@Example	
@SCSCOD-3462
@qastudentincentive		    
Scenario Outline:Teacher enters 12 students in QA Student incentive and checkout:[<UsingData>]

	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds “ItemInformation” from YTO page 
	And teacher navigates to coupons & Rewards page
	When teacher views Q & A Student incentive with no. of students
	And teacher enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
	And teacher submit the order
	And teacher sees Q & A student incentive information in rewards section on Confirmation page
	
	Examples:
	    |UsingData|
	    |Golden:teacher_login_with_twentydollar_enterstudents_12|
	    
	    
	    
@Golden
@SCSCOD-3469
@qastudentincentive	
Scenario Outline:Teacher should not receive QA Student incentive promotion on cart with Teacher catalogs:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	When teacher add “teacher club items” to cart from YTO page 
	And teacher navigates to coupons & Rewards page
	Then teacher should not see Q & A Student incentive line
	
	
	Examples:
	    |UsingData|	    
	    |Golden:teacher_login_TeacherCatalogueItems_QAStudentIncentive|
	    
	    

#########################################		FREE ITEM                    ##################################################
##################################################################################################################################
##################################################################################################################################	
	    
	    
@Golden
@FreeItem
@Priority1
@Maintenance
Scenario Outline:Teacher receives Free item promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds student club items to cart with [minumum amount]
And Teacher navigates to rewards & coupons page
Then Teacher should see Free item promotion is displayed
And teacher enters number of students in text field
And teacher proceeds checkout from rewards and coupons page
And user selects payment method as credit card on payment page
And Teacher sees Free item promotion in Confirm & Submit and confirmation pages

Examples: 
		|UsingData|
		|Golden:teacher_with_soo_and_Automatic_tossin_minamount|
		
		
		
@GoldenTODO
@FreeItem
@Priority1
Scenario Outline:Teacher does not receive Free item promotion if the cart total qualifying for promotion includes Redemptions:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When Teacher adds teacher club items to cart with minimum amount 
And Teacher makes redemeptions from student bonus bank such that cart total is now below [minimum amount]
When Teacher navigates to coupons & Rewards page
Then Teacher should not see Free item

		
Examples: 
		|UsingData|
		|Golden:teacher_catalogues_Automatic_tossin_minamount_redemptions|		
		
		
@Golden
@FreeItem
@Priority1
@Maintenance
Scenario Outline:Teacher does not receive Free item promotion on cart withTeacher catalogs:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When Teacher adds teacher club items to cart with minimum amount 
And Teacher navigates to rewards & coupons page
Then Teacher should not see Free item promotion is displayed

		
Examples: 
		|UsingData|
		|Golden:teacher_catalogues_Automatic_tossin_minamount|
		
		
		
		
@Golden
@FreeItem
@Priority1
@Maintenance
Scenario Outline:Teacher should not receive Free item promotion on a cart which does not meet qualifying minimum amount:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds student club items to cart less than [minumum amount]
And Teacher navigates to rewards & coupons page
Then Teacher should not see Free item promotion is displayed

		
Examples: 
		|UsingData|
		|Golden:teacher_club_items_Automatic_tossin_less_than_minamount|
		
		
		
		
@GoldenTODO
@FreeItem
@Priority1
Scenario Outline:Teacher can apply Free item coupon if Redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to Coupons & Rewards page
And Teacher adds amount in [Teacher Bonus dollars] such that cart total is now below [minimum amount]
When Teacher applies [Free item coupon]
Then Teacher should see Free item in coupons section
Examples:
  | UsingData                                     |
  | Golden:teacher_TeacherBonusRedemption_FreeItemCoupon |
  
  
  
  
@GoldenTODO
@FreeItem
@Priority1
Scenario Outline:Teacher cannot apply a Toss-in coupon that is already redeemed:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
When teacher applies already redeemed [Free item coupon]
Then teacher should see error message
Examples:
  | UsingData                                     |
  | Golden:teacher_TeacherBonusRedemption_FreeItemCoupon_Redeemed | 
  
  		
		
		    
	    
	    

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    REVIEW CART    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
  	



	    	    
	    
	    
@Golden	    
@ReviewCart
@Priority1
Scenario Outline:Items grouped by Student club when teacher creates order with more than one Student Club same month:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	Then items are grouped by Student Club Youngest Club to Oldest Club
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher navigates to Confirm and Submit page
	Then teacher sees items grouped by Student Club Youngest Club to Oldest Club in submit page
	When teacher clicks on Submit Order
	Then teacher sees items grouped by Club Youngest Club to Oldest Club in Order reference page
	
Examples:
  | UsingData                                   |
  | Golden:TeacherOrder_DifferentStudentClub_Samemonth_ReviewCart |	
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Items grouped by Student club when teacher creates order with more than one Student Club different month:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs different month
	And Teacher navigates to Review Your Cart page
	Then items are grouped by Student Club Youngest Club to Oldest Club
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher navigates to Confirm and Submit page
	Then teacher sees items grouped by Student Club Youngest Club to Oldest Club in submit page
	When teacher clicks on Submit Order
	Then teacher sees items grouped by Club Youngest Club to Oldest Club in Order reference page
	
Examples:
  | UsingData                                   	 |
  | Golden:TeacherOrder_DifferentStudentClub_differentmonth_ReviewCart |  
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST against 'BC' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly
	
Examples:
  | UsingData                        |
  | Golden:TeacherOrder_GST_PST_Province_BC_ReviewCart |	
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student and Teacher club items for GST & QST against 'QC' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,QST,Total amount and Teacher Catalogues Subtotal,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                          |
  | Golden:TeacherOrder_GST_QST_Province_QC_ReviewCart | 
  
  
@Golden		    
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NL' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_HST_Province_NL_ReviewCart |  
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NB' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |  
  | Golden:TeacherOrder_HST_Province_NB_ReviewCart |    
  
  
@Golden
@Example	    
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NS' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_HST_Province_NS_ReviewCart |    
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'ON' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_HST_Province_ON_ReviewCart |  
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'PE' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_HST_Province_PE_ReviewCart | 
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'AB' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_GST_Province_AB_ReviewCart |
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NT' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                    |   
  | Golden:TeacherOrder_GST_Province_NT_ReviewCart |   
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NU' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_GST_Province_NU_ReviewCart |    
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'YT' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | Golden:TeacherOrder_GST_Province_YT_ReviewCart|   	
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for Tax exempted schools against 'AB' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly
	
Examples:
  | UsingData                  |
  | Golden:TeacherOrder_Province_TaxExempted_AB_ReviewCart     |    
  
  
@Golden
@Example		    
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for Tax exempted schools against 'MB' Province in ReviewCart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly
	
Examples:
  | UsingData                  |
  | Golden:TeacherOrder_Province_TaxExempted_MB_ReviewCart |   
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Teacher edits Qty on Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher edits the Quantity of Student club item in Review Cart page
	And Teacher edits the Quantity of Teacher club item in Review Cart page
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                  		 |
  | Golden:TeacherOrder_EditQty_ReviewCart  | 
  
  
@Golden		    
@ReviewCart
@Priority1
Scenario Outline:Teacher has the ability to click + to increase the Qty of an item on Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When teacher clicks on '+'
	Then the Qty of the item is increased by 1
	And the cart total is adjusted accordingly
	
Examples:
  | UsingData      |
  | Golden:TeacherOrder_Increase+Qty_ReviewCart  |  
  

@Golden  
@ReviewCart
@Priority1
Scenario Outline:Teacher clicks on - to make the Qty as 0 and delete the item on Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	And Teacher navigates to Review Your Cart page
	When teacher clicks on '-'until the cart qty becomes 0
	Then the item is removed from cart
	
Examples:
  | UsingData      	|
  | Golden:TeacherOrder_Decrease-Qty_ReviewCart |  
  
  
  
  
##################################################################################################################################
##################################################################################################################################  
#########################################		                                ##################################################
#########################################		REWARDS AND COUPONS             ##################################################
#########################################		                                ##################################################
##################################################################################################################################
################################################################################################################################## 
  
  
  
   
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST without redemptions for 'BC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_PST_Province_BC_0_0_0_0_CouponsRewards 		 |    	
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student redemptions for 'BC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_PST_Province_BC_2_2_0_0_CouponsRewards        |
  
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with teacher redemptions for 'BC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_PST_Province_BC_0_0_2_2_CouponsRewards         |
    
    
@Golden
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student and teacher redemptions for 'BC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_CouponsRewards |
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student and Teacher club items for GST & QST without redemptions for 'QC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_QST_Province_QC_0_0_0_0_CouponsRewards         |  
  
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with student redemptions for 'QC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_QST_Province_QC_2_2_0_0_CouponsRewards         |  
      	    		
      	    		
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with teacher redemptions for 'QC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_QST_Province_QC_0_0_2_2_CouponsRewards         |
  
  
  
@Golden
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with student and teacher redemptions for 'QC' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                                		 |
  | Golden:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_CouponsRewards | 
        	    		
        	    		
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST without redemptions for 'NL' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_HST_Province_NL_0_0_0_0_CouponsRewards         |      
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST with student redemptions for 'NL' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_HST_Province_NL_2_2_0_0_CouponsRewards         |   	    
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST with teacher redemptions for 'NL' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_HST_Province_NL_0_0_2_2_CouponsRewards         |  
  
  
  
@Golden
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST with student and teacher redemptions for 'NL' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_HST_Province_NL_2.1_2.1_2.1_2.1_CouponsRewards |  	
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST without redemptions for 'NU' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,HST,Total amount and TeacherCatalogues PostTax,Items,GST,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_GST_Province_NU_0_0_0_0_CouponsRewards         |  	
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST with student redemptions for 'NU' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,HST,Total amount and TeacherCatalogues PostTax,Items,GST,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_GST_Province_NU_2_2_0_0_CouponsRewards         |
  
  
@Golden
@Example
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST with teacher redemptions for 'NU' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,HST,Total amount and TeacherCatalogues PostTax,Items,GST,HST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_GST_Province_NU_0_0_2_2_CouponsRewards         | 
    
    
@Golden
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST with student and teacher decimal redemptions for 'NU' province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly
	
Examples:
  | UsingData                                	 |
  | Golden:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1_CouponsRewards | 
  
  
@Golden
@Example 
@RewardsAndCoupons
@Priority1
  Scenario Outline:Teacher can edit redemptions and totals are adjusted accordingly without redemptions for 'BC' province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	When teacher edits the Student Bonus Bank and paper coupons
	And teacher edits the teacher Bonus Bank and paper coupons
	Then Updated StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_0_0_0_0_Edit_CouponsRewards         | 
      
      
@Golden
@Example 
@RewardsAndCoupons
@Priority1
  Scenario Outline:Teacher can edit redemptions and totals are adjusted accordingly with student redemptions for 'BC' province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	When teacher edits the Student Bonus Bank and paper coupons
	And teacher edits the teacher Bonus Bank and paper coupons
	Then Updated StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_2_2_0_0_Edit_CouponsRewards         | 
      
      
@Golden
@Example  
@RewardsAndCoupons
@Priority1
  Scenario Outline:Teacher can edit redemptions and totals are adjusted accordingly with teacher redemptions for 'BC' province:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
	When teacher edits the Student Bonus Bank and paper coupons
	And teacher edits the teacher Bonus Bank and paper coupons
	Then Updated StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_0_0_2_2_Edit_CouponsRewards         |
      
      
      
@Golden  
@RewardsAndCoupons
@Priority1
  Scenario Outline:Teacher can edit redemptions and totals are adjusted accordingly with student and teacher decimal redemptions for 'BC' province:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
When teacher selects [enter classroom order] from home page
When Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
When Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
When teacher edits the Student Bonus Bank and paper coupons
And teacher edits the teacher Bonus Bank and paper coupons
Then Updated StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
Examples:
  | UsingData                                        |
  | Golden:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_Edit_CouponsRewards |      
              
    
    
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		PAYMENT    						 #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
        
        
                  
                  
@Golden
@Example
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST without redemptions in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                       		 |
      | Golden:TeacherOrder_GST_PST_Province_BC_0_0_0_0_payment  |
      
      
@Golden
@Example
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student redemptions in Payment page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                       		 |
      | Golden:TeacherOrder_GST_PST_Province_BC_2_2_0_0_payment  |   
      
      
@Golden  
@Example
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with teacher redemptions in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_0_0_2_2_payment         |     
      
      
@Golden  
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student&Teacher redemptions in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_payment | 
      
      
@Golden
@Payment
@Priority1
Scenario Outline:Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page_2
	And Teacher navigates to Payments page
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page
	
	
Examples:
  | UsingData                             |
  | Golden:TeacherOrder_ItemsInCart_CreditCard_3 | 
      
       
       
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST without redemptions against 'QC' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_0_0_0_0_payment  |
      
      
@Golden
@Example
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Student redemptions against 'QC' Province in Payment page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_2_2_0_0_payment         |
           
           
           
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Teacher redemptions against 'QC' Province in Payment page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_0_0_2_2_payment         |          
                              
                              
@Golden  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Student and Teacher redemptions against 'QC' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_2.1_2.1_2.1_2.1_payment |
                              
       
       
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST without redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_0_0_0_0_payment         |      
      
      
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Student redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_2_2_0_0_payment         | 
      
      
@Golden
@Example 
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Teacher redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_0_0_2_2_payment         |
      
      
@Golden  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Student and Teacher redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_2.1_2.1_2.1_2.1_payment |
      
      
@Golden
@Example
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST without redemptions against 'NU' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Student and Teacher clubs Total owing amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_0_0_0_0_payment         |     
      
      
@Golden
@Example
@Payment
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Student redemptions against 'NU' Province in Payment page:[<UsingData>]

  	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Student and Teacher clubs Total owing amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_2_2_0_0_payment         |
       
       
@Golden
@Example 
@Payment
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Teacher redemptions against 'NU' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Student and Teacher clubs Total owing amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_0_0_2_2_payment         |      
      
      
@Golden  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Student and Teacher redemptions against 'NU' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Student and Teacher clubs Total owing amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1_payment |
      
          
   
      
      
@Golden
@Payment
@Priority1
  Scenario Outline: Teacher selects passed expiration date in combination of credit card and checks in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	When teacher enters passed expiration date and valid information in all other fields
	And Teacher enter amount to be paid by credit card
	When user unsave the card
	And teacher clicks on "Continue checkout"
	Then teacher sees expired card error message
	
Examples:
  | UsingData                             |
  | Golden:TeacherOrder_ItemsInCart_CreditCard_2 |  
      
      
@Golden
@Payment
@Priority1
@Maintenance
  Scenario Outline: Teacher places an order with Checks as payment in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page4
	And teacher selects checks as payment
	When teacher navigates to Confirm & Submit page
	Then teacher views Amount paid by checks with check amount
	And Teacher submits the order
	And teacher views Amount paid by checks with check amount
Examples:
  | UsingData                         |
  | Golden:TeacherOrder_ItemsInCart_checks_2 | 
      
  
  
  
  
##################################################################################################################################################        
##################################################################################################################################################  
###########################################   		CONFIRM AND SUBMIT    	         #############################################################        
##################################################################################################################################################        
##################################################################################################################################################  
  
       
      
@Golden
@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with Shipping Fee against 'BC' Province in ConfirmSubmit Page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        				|
  | Golden:Confirm_Submit:TeacherOrder_GST_PST_Province_BC | 
      
      
@Golden
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST against 'QC' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        				|
  | Golden:Confirm_Submit:TeacherOrder_GST_QST_Province_QC |   
      
      
@Golden
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NL' Province in ConfirmSubmit Page:[<UsingData>]

   	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_NL | 
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NB' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_NB |        
      
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NS' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_NS |
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'ON' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_ON |       
                                                   
                                                   
                                                   
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'PE' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			       |
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_PE |
      
      
@Golden
@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'AB' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    				|
  | Golden:Confirm_Submit:TeacherOrder_GST_Province_AB |        
      
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NT' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    				|
  | Confirm_Submit:TeacherOrder_GST_Province_NT |
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NU' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    				|
  | Confirm_Submit:TeacherOrder_GST_Province_NU |
           
           
           
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'YT' Province in ConfirmSubmit Page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    				|
  | Confirm_Submit:TeacherOrder_GST_Province_YT |
           
                            
                       
@Golden
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'BC' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			    |
  | Golden:Confirm_Submit:TeacherOrder_GST_Province_BC |
      
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'AB' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			    |
  | Golden:Confirm_Submit:TeacherOrder_TaxExempt_Province_AB |
          
          
          
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'NL' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			    |
  | Golden:Confirm_Submit:TeacherOrder_TaxExempt_Province_NL |
      
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher views payment section for Student & Teacher Club items for GST with Student redemptions against 'NU' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section  
	And Teacher navigates to Payments page2
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			  	 |
  | Golden:TeacherOrder_GST_Province_NU_0_0_0_0         |
      
      
      
@Golden 
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher views payment section for Student & Teacher Club items for GST with Teacher redemptions against 'NU' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section  
	And Teacher navigates to Payments page2
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			  	 					|
  | Golden:Confirm_Submit:TeacherOrder_GST_Province_NU_2_2_0_0      |
      
      
      
@Golden
@Example
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher views payment section for Student & Teacher Club items for GST with Student and Teacher redemptions against 'NU' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section  
	And Teacher navigates to Payments page2
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			  	 |
  | Golden:Confirm_Submit:TeacherOrder_GST_Province_NU_0_0_2_2         |
  
  
      
      
  
  
###########################################   		SUBMITTED           	         #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   
  
  
  
  
      
      
@Golden
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with Shipping Fee against 'BC' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | Golden:Submitted:TeacherOrder_GST_PST_Province_BC 	| 
      
      
 
      
      
@Golden
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST against 'QC' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,QST,Total amount and Teacher Catalogues Subtotal,GST,QST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | Golden:Submitted:TeacherOrder_GST_QST_Province_QC	| 
      
      
      
@Golden
@Submitted
@Priority1
@Maintenance
  Scenario Outline:Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NL' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_HST_Province_NL 	|                                       
         
         
@Golden
@Example
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NB' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_HST_Province_NB 	|        
                     
                     
@Golden
@Example 
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NS' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_HST_Province_NS 	|  
      
      
@Golden
@Example
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'ON' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_HST_Province_ON 	|
      
      
      
@Golden
@Example
@Submitted
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'PE' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_HST_Province_PE 	|                      
                                         
                                         
                                         
@Golden
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'AB' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_GST_Province_AB 	|  
      
      
      
@Golden
@Example 
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NT' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_GST_Province_NT 	|   
      
      
      
@Golden
@Example  
@Submitted
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NU' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_GST_Province_NU 	| 
      
      
@Golden
@Submitted
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'YT' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        		|
  | Golden:Submitted:TeacherOrder_GST_Province_YT 	|      
      
    
    
@Golden
@Submitted
@Priority1
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'AB' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | Golden:Submitted:TeacherOrder_TaxExempted_GST_Province_AB|   
      
      
@Golden
@Example
@Submitted
@Priority1
@Maintenance
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'BC' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | Golden:Submitted:TeacherOrder_TaxExempted_GST_Province_BC	|           
      
      
@Golden
@Example
@Submitted
@Priority1
@Maintenance
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'NL' Province in Submitted page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | Golden:Submitted:TeacherOrder_GST_Province_AB_2	|     
                                   
 
 ############################################################
      
	
	
@Golden	
@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card with combination of cc and checks as payment to checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects combination of credit card and cheques as payment
When teacher selects saved credit card and valid information in all other fields
And teacher clicks on "Continue checkout"
Then teacher views Amount paid by Credit card and Amount paid by Cheques correctly
And teacher clicks on Submit Order
And teacher views Amount paid by Credit Card and Amount paid by Cheques correctly in ConfirmationPage
Examples:
  | UsingData                                	 		|
  | Golden:TeacherOrder_ItemsInCart_SavedCreditCard_Visa_Check | 
  



#########################################		SAVED CART SCENARIOS             ##################################################
##################################################################################################################################
##################################################################################################################################	



@Golden  
@SavedCart
@Priority1
Scenario Outline:Items grouped by Student club when teacher saves cart for later with more than one Student Club different month:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs different month
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then items are grouped by Student Club Youngest Club to Oldest Club in SavedCart page
	
Examples:
  | UsingData                                		 			|
  | Golden:TeacherOrder_DifferentStudentClub_differentmonth_2 	|	
  
  
@Golden  
@SavedCart
@Priority1
Scenario Outline:Items grouped by Student and teacher club when teacher saves cart for later with Student clubs and  teacher club:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then items are grouped by student club and teacher Club
	
Examples:
  | UsingData                          			|
  | Golden:TeacherOrder_StudentAndTeacherClub 	|  
  
 
@Golden  
@SavedCart
@Priority1
Scenario Outline:Subtotals, Qty and totals displayed correctly when teacher saves cart for later with student and teacher Club:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then totals are calculated correctly in Saved Cart page
	
Examples:
  | UsingData                         					|
  | Golden:TeacherOrder_DifferentStudentAndTeacherClub 	|  
  

@Golden  
@SavedCart
@Priority1
Scenario Outline:Teacher can delete a saved cart:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	And Teacher deletes the Saved cart
	Then the deleted saved cart is not shown
	
Examples:
  | UsingData                         						|
  | Golden:TeacherOrder_DifferentStudentAndTeacherClub_2 	|  
  

@Golden  
@SavedCart
@Priority1
Scenario Outline:Teacher can restore cart from Manage saved carts page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the Manage saved cart
	And Teacher restore the Saved cart
	Then saved cart is not shown in the Saved cart list
	
Examples:
  | UsingData                         						|
  | Golden:TeacherOrder_DifferentStudentAndTeacherClub_3 	| 
  
###################################
@Golden
@YTO
@Priority1
Scenario Outline:Teacher can save the student name by entering name and clicking on tick mark:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher enters the student name and clicks on Tick mark
	Then entered name is displayed in Student name field
	
Examples:
  | UsingData       |
  | Golden:Teacher_Login_4 | 
   

@Golden  
@Payment
@Priority1
Scenario Outline:when flag is set to true teacher sees alternate shipping:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	
	
Examples:
  | UsingData                             		|
  | Golden:TeacherOrder_ItemsInCartAlternateFlag_True 	|    
                                                               