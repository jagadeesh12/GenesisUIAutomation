@CouponModify
Feature: DollarstoSpend
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            DOLLARS TO SPEND SCENARIOS                  ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################



@Golden
@DollarstoSpend
@Priority1
Scenario Outline:Teacher receives DTS on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page
	And teacher adds student club items to cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When teacher navigates to coupons & Rewards page
	Then teacher views Dollars to Spend promotion
	
	
	Examples: 
	|UsingData								|
	|QA:Golden:Teacher_DTS_with_minimum_amount	|
	
	
	
@Golden
@DollarstoSpend
@Maintenance
@Priority1
Scenario Outline:Teacher does not receive DTS promotion on a cart which does not meet minimum amount:[<UsingData>]
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart less than [minumum amount]
	# And Teacher navigates to Review Your Cart page
	When teacher navigates to coupons & Rewards page
	Then teacher does not receive Dollars to Spend promotion
	
	Examples: 
	|UsingData									|
	|QA:Golden:Teacher_DTS_without_minimum_amount	|	
	
	
	
@Golden
@DollarstoSpend	
@Maintenance
@Priority1
Scenario Outline:No DTS for cart total qualifying for promotion includes Redemptions:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher adds Student club items to cart less than the [Manual shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher views Dollars to Spend promotion
	When teacher enters [Student dollar amount] of Bonus coupon to redeem from Student Bonus bank
    Then teacher does not receive Dollars to Spend promotion
	
	Examples: 
	|UsingData												|
	|QA:Golden:Teacher_redeems_studentdollars_on_minimum_amount|		
	
@Golden
@DollarstoSpend
@Maintenance
@Priority1
Scenario Outline:Teacher does not receive Dollars to Spend promotion on cart with Teacher catalogs:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher add “teacher club items” to cart from YTO page
	When teacher navigates to coupons & Rewards page
	Then teacher does not receive Dollars to Spend promotion
	
	Examples: 
	|UsingData								|
	|QA:Golden:TeacherCatalogue_DTS_with_minimum_amount	|	
	
	
@Golden	
@DollarstoSpend
@Maintenance
@Priority1
Scenario Outline:Teacher selects items from multiple flyers from DTS modal such that there is a top-off and checkout:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And teacher navigates to coupons & Rewards page
	And teacher views Dollars to Spend promotion
	And teacher clicks on Make Selection button
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item from the Make Selection window
	And teacher selects a different grade from dropdown
	And teacher select an item such that there is a top-off
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
	And teacher submit the order
	And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page
	
	Examples: 
	|UsingData													|
	|QA:Golden:Teacher_DTS_with_minimum_amount_TopOffAmt_Checkout	|


@Golden	
@DollarstoSpend	
@Priority1
Scenario Outline:Teacher selects free pick item less than or equal to the coupon amount and checkout:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
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
	|QA:Golden:Teacher_DTS_with_minimum_amount_FPI_Checkout|	
	
@Golden	
@DollarstoSpend
@Maintenance
@Priority1
Scenario Outline:Top-off amount selected by teacher should be added to the cart total:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
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
	|QA:Golden:Teacher_DTS_with_minimum_amount_CartTotal_IncludesTopOffAmt|
	
	

@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher views results by Selecting a grade from Grade level dropdown:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	Then items from all flyers mapped to the grade from current calendar month displays
	
Examples:
  | UsingData                                		 	|
  | QA:DollarsToSpend:Teacher_gets_DTS_with_minimum_amount |	
  

@DollarsToSpend
@Priority1
@Maintenance
@DTSIssue
Scenario Outline:Teacher selects an item by Selecting a grade from Grade level dropdown:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window
	Then selected item displays in the Current Selection section
	
Examples:
  | UsingData                                		|
  | QA:DollarsToSpend:Teacher_DTS_with_minimum_amount 	|
  
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher selects items from same flyer on DTS modal and checkout:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
	And teacher submit the order
	And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page
	
Examples:
  | UsingData                                							|
  | QA:DollarsToSpend:Teacher_DTS_with_minimum_amount_MultiItems_Checkout 	|  
  
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:GST & PST charged on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                				|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_GST_PST_Province_BC 	|  
  
    
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:GST & QST charged  on top-off amount when only one item is selected from DTS modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                				|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_GST_QST_Province_QC 	| 
  		
	
	
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:HST charged on top-off amount when only one item is selected from DTS modal-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NL 	|   
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:HST charged  on top-off amount when only one item is selected from DTS modal-NB:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NB 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline: HST charged on top-off amount when only one item is selected from DTS modal-NS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NS 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:HST charged on top-off amount when only one item is selected from DTS modal-ON:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And  teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_ON 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:HST charged on top-off amount when only one item is selected from DTS modal-PE:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_PE 	|       
      
      
      
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline: charged GST  on top-off amount when only one item is selected from DTS modal-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_AB 	|     
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Charged GST on top-off amount when only one item is selected from DTS modal-NT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NT 	|
 
  

@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:GST on top-off amount when only one item is selected from DTS modal-NU:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NU 	|



@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:charged GST on top-off amount when only one item is selected from DTS modal-YT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_YT 	|        
        
 
 
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:GST on top-off amount when multiple items are selected from DTS modal-BC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_BC 	|  

  

@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline: GST on top-off amount when multiple items are selected from DTS modal-QC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_QC	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline: GST on top-off amount when multiple items are selected from DTS modal-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NL 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline: GST on top-off amount when multiple items are selected from DTS modal-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:TeacherOrder_TopOff_GST_Province_AB_2 	| 
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:No taxes on top-off amount for tax exempted schools when multiple items are selected from DTS modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                									|
  | QA:Golden:DollarsToSpend:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB 	|    
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:No taxes on top-off amount for tax exempted schools when one item is selected from DTS modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                									|
  | QA:DollarsToSpend:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB_2 	|   
  
  

  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher can redeem Dollars to Spend once per level per customer:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	When teacher clicks on Submit Order
	And teacher navigates to Home page from Order ref page
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher does not see the Dollars to spend promotion
	
Examples:
  | UsingData                                			|
  | QA:Golden:DollarsToSpend:Teacher_DTS_with_minimum_amount_2 	|     
  

@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Dollars to Spend on second tier if teacher already redeemed on first tier:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [tier1 minimum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	When teacher clicks on Submit Order
	And teacher navigates to Home page from Order ref page
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [tier2 minimum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher sees the Dollars to spend promotion
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:Teacher_DTS_with_minimum_amount_3 	|       
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Message to explain teacher about the top-off amount being added to Student club total:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window
	And teacher clicks on Confirm Selection button
	And teacher is on coupons & Rewards page
	When teacher proceeds to checkout from rewards and coupons page
	Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
	And teacher submit the order
	And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page
	
Examples:
  | UsingData                                			|
  | QA:DollarsToSpend:Teacher_DTS_with_minimum_amount_4 	| 
  


##############################TCOD#############################################
	

@DollarstoSpend
@Priority2	
Scenario Outline:Teacher sees correct options under grade dropdown in DTS modal window:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And teacher navigates to coupons & Rewards page
And teacher views Dollars to Spend promotion
And teacher clicks on Make Selection button
When teacher clicks on grade level dropdown in DTS model
Then teacher should see Early Childhood, Kindergarten & Grade 1, Grades 2 & 3, Grades 4 & 5, Grades 6 & 7 and French  options
	
Examples: 
|UsingData										    |
|QA:Teacher_Options_GradeDropDown_DTSModelWindow|

####################################### 11.5 ########################################

@DollarsToSpend
@Priority1
@SCSCOD-4267
Scenario Outline:Teacher selects an item by Selecting a grade from Grade level dropdown in DTS model window:[<UsingData>]
                	
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher selects a grade
When teacher selects an item from Make Selection window
Then selected item displays in the Current Selection section
	
Examples:
  | UsingData                                		 	|
  | QA:DollarsToSpend:Teacher_DTS_Selection_Grade |
  
@DollarsToSpend
@Priority1
Scenario Outline:Teacher selects an item by searching with specific term in DTS model window:[<UsingData>]
                	
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher searches for a [qualifying Item number]
And item displays in results in DTS model
When teacher selects an item from the Make Selection window
Then selected item displays in Current Selection section for DTS
	
Examples:
  | UsingData                                		 	|
  | QA:DollarsToSpend:Teacher_DTS_Selection_Search_ValidSearch |
  
@DollarsToSpend
@Priority1
Scenario Outline:Teacher get result with valid search in DTS model window when he is in other than first page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And teacher navigates to coupons & Rewards page
And teacher views Dollars to Spend promotion
And teacher clicks on Make Selection button
And teacher searches for a [qualifying Item number]
And teacher navigates to page2 in DTS model window
When teacher selects an item from the Make Selection window

Examples: 
|UsingData													         |
|QA:Teacher_DTS_with_valid_Search_Otherthanfirstpage|


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-5052     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Sprint12.3
  @DollarstoSpend
  @Priority2
  @SCSCOD-5052
  Scenario Outline:Correct unique item number is displayed on order history page for DTS:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items with unique item id number to the cart with [minumum amount]
    And Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion
    And teacher clicks on Make Selection button
    And teacher selects an item from the Make Selection window having unique item id
    And teacher clicks on Confirm Selection button
    And teacher proceeds to checkout from coupons & rewards page and submit the order
    When teacher navigates to my account page and click on view order option under order history for latest booked order
    Then teacher see the item selected from Dollars to spend with unique item id with correct format in Rewards Section

  Examples:
    | UsingData                                                |
    | QA:Teacher_DTS_OrderHistory_UniqueItemId|

  ##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DTS             			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline:HST on top-off amount for DTS when single item is selected with multiple quantity for NL province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_HST_Province_NL|

  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline: HST on top-off amount for DTS when single item is selected with multiple quantity for NB :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_HST_Province_NB|


  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline: charged HST on top-off amount for DTS,single item is selected with multiple quantity for NS province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_HST_Province_NS|


  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline:HST on top-off amount for DTS when single item is selected with multiple quantity for ON province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_HST_Province_ON|


  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline:HST on top-off amount for DTS when single item is selected with multiple quantity for PE province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_HST_Province_PE|


  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline:GST on top-off amount for DTS when single item is selected with multiple quantity for AB province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_HST_Province_AB|

  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline: GST & PST on top-off amount for DTS when single item is selected with multiple quantity for BC province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_GST_PST_Province_BC|


  @Sprint12.3
  @DollarsToSpend
  @Priority1
  Scenario Outline: GST & QST on top-off amount for DTS when single item is selected with multiple quantity for QC province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher clicks on Confirm Selection button
    And teacher makes the qty as 3
    Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |QA:Teacher_DTS_TopOff_GST_QST_Province_QC	|

  @Sprint12.3
  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:No Tax top-off amount for DTS, single item is selected with multiple quantities for tax exempted schools NB:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher clicks on Confirm Selection button
    And teacher makes the qty as 3
    Then No tax is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                							    |
    |QA:TeacherOrder_TopOff_GardenHillHighSchoolGardenHill_MB|

