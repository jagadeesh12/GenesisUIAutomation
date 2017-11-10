@FreePickNow
Feature: FreePick
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            FREE PICK SCENARIOS                         ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################



      

@Golden
@FreePick
@Priority1   
Scenario Outline:Teacher can apply Manual Free pick on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	Then Free pick modal displays
	
	Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon|     
	
	
@Golden
@FreePick
@Maintenance
@Priority1
Scenario Outline:Teacher applies a Free Pick Coupon and verify the item must not exceed maximum dollar value:[<UsingData>]
			
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher clicks on grade level dropdown and select a grade from dropdown
	Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
	
Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_CompareItemsPrice_CouponAmt|


@Golden
@FreePick
@Maintenance
@Priority1
Scenario Outline:Teacher cannot apply coupon on a cart which does not meet the minimum cart total:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart without [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	Then teacher should see order does not meet coupon requirements error message
	
Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_without_minimum_amount|
	
	
@Golden
@FreePick
@Priority1
Scenario Outline:Teacher edits free pick and checkout:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item from the results
	And teacher clicks on Confirm Selection button
	When teacher click on edit option for Free Pick coupon section
	And teacher selects a different grade from dropdown
	And teacher selects a different item from Free Pick model window
	And teacher clicks on Confirm Selection button
	And teacher proceeds to checkout from rewards and coupons page
	Then Free pick is displayed in coupons section with correct details in Confirm & Submit page
	And teacher submit the order
	And Free pick is displayed in coupons section with correct details in Confirmation page
	
	Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_Edit_Checkout|
	
	

@FreePick	
@Maintenance
@Priority1
Scenario Outline:cannot apply Manual Free pick on a cart with qualifying minimum amount on Teacher Club orders:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher adds Teacher Exclusives item for Paid Shipping
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	Then teacher should see order does not meet coupon requirements error message
	
	
Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_2|
	
@FreePick	
@Maintenance
@Priority1
	Scenario Outline:Items less than or equal to the coupon amount displays when teacher searches for a keyword:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher searches for a [search term]
	Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
	
	
Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_CompareItemsPrice_SearchKeyword|
	
	
@FreePick	
@Maintenance
@Priority1
@NoMoreValidTest
Scenario Outline:Teacher selects an item by searching for a qualifying item on Free pick modal:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	When teacher searches for a [qualifying Item number]
	Then item displays in results in Free Pick model
	And teacher selects an item from the results
	And selected item displays in Current Selection section for Freepick
	And teacher clicks on Confirm Selection button
	
	
Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_QualifyingItemSearch|
	


@FreePick	
@Maintenance
@Priority1
Scenario Outline:Teacher selects an item by searching with Item title:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	When teacher searches for a [keyword]
	Then item displays in results in Free Pick model
	And teacher selects an item from the results
	And selected item displays in Current Selection section for Freepick
	And teacher clicks on Confirm Selection button
	
	
Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_ItemSearch_Title|
	
	
	
@FreePick	
@Maintenance
@Priority1
Scenario Outline:Teacher selects free item and checkout:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher clicks on grade level dropdown and select a grade from dropdown
	And teacher selects an item from the results
	And teacher clicks on Confirm Selection button
	When teacher proceeds to checkout from rewards and coupons page
	Then Free pick is displayed in coupons section with correct details in Confirm & Submit page
	And teacher submit the order
	And Free pick is displayed in coupons section with correct details in Confirmation page
	
	
	Examples: 
	|UsingData|
	|QA:TeacherOrder_FreePickCoupon_Checkout|
	
	
	
	
	
@FreePick
@Priority2
Scenario Outline:Teacher is mandated to redeem Free pick coupon:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
When Teacher enters [Free Pick Coupon] on rewards and coupons page
And teacher closes the Free pick modal without making any selections
And teacher clicks on Continue Checkout
Then page is refreshed and error message “To proceed with checkout, please select an item to redeem your Free Book Pick by clicking on the coupon code.” should display
Examples:
  | UsingData                   |
  | QA:TeacherOrder_FreePickCoupon_Skip | 	
	
	
@FreePick
@Priority2
Scenario Outline:Free pick coupon is removed when teacher deletes items from cart making cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items for Free Shipping
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	And teacher selects a grade
	And teacher selects an item from modal
	And teacher clicks on Confirm Selection button
	And teacher deletes item from cart making cart total fall below [minimum amount]
	And Teacher navigates to rewards & coupons page
	Then Free Pick Coupon should not display
	And teacher can proceed to payment page
	
Examples:
  | UsingData                            |
  | QA:FreePick:TeacherOrder_FreePickCoupon |	
  

@FreePick
@Priority2
Scenario Outline:Teacher cannot be able to find a non-qualifying item on free pick modal_ItemGreaterThanCouponAmount:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	And Free pick modal displays
	When teacher searches for a [Non-qualifying Item]
	Then no results displays
	
Examples:
  | UsingData                            								|
  | QA:FreePick:TeacherOrder_FreePickCoupon_ItemGreaterThanCouponAmount 	|	
  
  
@FreePick
@Priority2
Scenario Outline:Teacher cannot be able to find a non-qualifying item on free pick modal_TeacherCatalogueItem:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	And Free pick modal displays
	When teacher searches for a [Non-qualifying Item]
	Then no results displays
	
Examples:
  | UsingData                            								|
  | QA:FreePick:TeacherOrder_FreePickCoupon_TeacherClubItem             	|

  
  
@FreePick
@Priority2
Scenario Outline:Teacher cannot be able to find a non-qualifying item on free pick modal_ExpiredItem:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	And Free pick modal displays
	When teacher searches for a [Non-qualifying Item]
	Then no results displays
	
Examples:
  | UsingData                            								|
  | QA:FreePick:TeacherOrder_FreePickCoupon_ExpiredItem               		|    
  
  
@FreePick
@Priority2
Scenario Outline:Confirm Selection button is disabled when freepick is deleted from Curent selection section:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	And teacher selects a grade
	And teacher selects an item from modal
	When teacher deletes the item from Current Selection section window
	Then confirm selection button is disabled
	
Examples:
  | UsingData                            |
  | QA:FreePick:TeacherOrder_FreepickCoupon_2 |	
    
   
@FreePick
@Priority2
Scenario Outline:Close on Free pick modal:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And Teacher enters [Free Pick Coupon]
And teacher selects a grade
And teacher selects an item from modal
When teacher clicks on modal window close button
#Then item selections are saved
	
Examples:
  | UsingData                            |
  | QA:FreePick:TeacherOrder_FreepickCoupon_3 |           	
  

@FreePick
@Priority2
Scenario Outline:Teacher cannot find Teacher Club items in Grade level results on Free pick modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	When teacher clicks on grade level dropdown
	Then teacher catalogue does not display in list of grades
	
Examples:
  | UsingData                            |
  | QA:FreePick:TeacherOrder_FreepickCoupon_4 |  
  
  
  
  
@FreePick
@Priority3
Scenario Outline:No results are displayed when teacher searches for a term with no results:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And Teacher enters [Free Pick Coupon] on rewards and coupons page
And Free pick modal displays
When teacher searches for a [search term] with no results
Then no results displays


Examples: 
|UsingData|
|QA:FreePick:TeacherOrder_FreePickCoupon_NoResults|



@FreePick
@Priority3
Scenario Outline:Teacher clicks Cancel button on Free pick modal:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon]
	And teacher selects a grade
	And teacher selects an item from modal
	When teacher clicks Cancel in freepick model window
	Then item selections are not saved
	And teacher can click on the coupon code
	And Free pick modal displays

Examples: 
|UsingData|
|QA:FreePick:TeacherOrder_FreePickCoupon_Cancel|


######################11.5 ############################################
Scenario Outline:Teacher selects specific free pick item and checkout:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to cart with [minumum amount]
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	And Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	When teacher searches for [Dr. Seuss: What Was I Scared Of?]
	And teacher selects [Dr. Seuss: What Was I Scared Of?] from the results
	And teacher clicks on Confirm Selection button
	And teacher proceeds to checkout from rewards and coupons page
	Then Free pick is displayed in coupons section with correct details in Confirm & Submit page
	And teacher submit the order
	And Free pick is displayed in coupons section with correct details in Confirmation page

Examples: 
|UsingData|
|QA:Golden:TeacherOrder_SpecificFreePickItem_Checkout|



  @Sprint12.3
  @FreePick
  @Priority2
  @SCSCOD-5052
  Scenario Outline:Correct unique item number is displayed on order history page for Free pick:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher navigates to YTO page
    And teacher adds YTO items with unique item id number to cart with [minumum amount]
    And teacher navigates to [Review Cart] page
    And teacher navigates to [Redemptions & Rewards] page
    And Teacher enters [Free Pick Coupon]
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from the model window having unique item id
    And teacher clicks on Confirm Selection button
    And teacher proceeds to checkout from coupons & rewards page and submit the order
    When teacher navigates to my account page and click on view order option under order history for latest booked order
    Then teacher see the item selected from Free pick window with unique item id with correct format in Rewards Section

  Examples:
    | UsingData                                                     |
    | QA:Teacher_FreePick_OrderHistory_UniqueItemId|
