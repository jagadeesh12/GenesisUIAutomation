Feature: Rewards and Coupons
	This feature is used to check the "Free Pick" scenario validation

 
Background: 
	Given teacher open rco-scholastic web site 

	
      
@Golden
@FreePick
@Priority1      
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
@Priority1
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
@Priority1
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
@Priority1
@SCSCOD-3992
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
	|Golden:TeacherOrder_FreePickCoupon_Edit_Checkout|
	
	
	
@FreePick	
@Maintenance
@Priority1
Scenario Outline:Teacher cannot apply Manual Free pick on a cart with qualifying minimum amount on Teacher Club orders:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Teacher items to cart less than [Manual FreePick Coupon]
    And teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	Then teacher should see order does not meet coupon requirements error message
	
	
Examples: 
	|UsingData|
	|TeacherOrder_FreePickCoupon|
	
@FreePick	
@Maintenance
@Priority1
	Scenario Outline:Items less than or equal to the coupon amount displays when teacher searches for a keyword:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	And teacher searches for a [search term]
	Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
	
	
Examples: 
	|UsingData|
	|TeacherOrder_FreePickCoupon_CompareItemsPrice_SearchKeyword|
	
	
@FreePick	
@Maintenance
@Priority1
Scenario Outline:Teacher selects an item by searching for a qualifying item on Free pick modal:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	When teacher searches for a [qualifying Item number]
	Then item displays in results in Free Pick model
	And teacher selects an item from the results
	And selected item displays in Current Selection section for Freepick
	And teacher clicks on Confirm Selection button
	
	
Examples: 
	|UsingData|
	|TeacherOrder_FreePickCoupon_QualifyingItemSearch|
	


@FreePick	
@Maintenance
@Priority1
Scenario Outline:Teacher selects an item by searching with Item title:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
	When Teacher enters [Free Pick Coupon] on rewards and coupons page
	And Free pick modal displays
	When teacher searches for a [keyword]
	Then item displays in results in Free Pick model
	And teacher selects an item from the results
	And selected item displays in Current Selection section for Freepick
	And teacher clicks on Confirm Selection button
	
	
Examples: 
	|UsingData|
	|TeacherOrder_FreePickCoupon_ItemSearch_Title|
	
	
	
@FreePick	
@Maintenance
@Priority1
@SCSCOD-3992
Scenario Outline:Teacher selects free item and checkout:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher selects “enter classroom order” from home page 
	And teacher adds student club items to cart with [minumum amount]
	And teacher navigates to coupons & Rewards page
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
	|TeacherOrder_FreePickCoupon_Checkout|
	
	
##################### PRIORITY 2 ################### 	
	
	
@FreePick
@Sprint18
@NotDeveloped 
@Priority2
Scenario Outline:Teacher is mandated to redeem Free pick coupon:[<UsingData>]
	
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
When Teacher enters [Free Pick Coupon] on rewards and coupons page
And teacher closes the Free pick modal without making any selections
And teacher clicks on Continue Checkout
Then page is refreshed and error message “To proceed with checkout, please select an item to redeem your Free Book Pick by clicking on the coupon code.” should display
Examples:
  | UsingData                   |
  | TeacherOrder_FreePickCoupon_Skip | 	
	
	
@FreePick
@Priority2
Scenario Outline:Free pick coupon is removed when teacher deletes items from cart making cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
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
  | BTS:FreePick:TeacherOrder_FreePickCoupon |	
  

@FreePick
@Priority2
Scenario Outline:Teacher cannot be able to find a non-qualifying item on free pick modal_ItemGreaterThanCouponAmount:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher enters [Free Pick Coupon]
	And Free pick modal displays
	When teacher searches for a [Non-qualifying Item]
	Then no results displays
	
Examples:
  | UsingData                            								|
  | BTS:FreePick:TeacherOrder_FreePickCoupon_ItemGreaterThanCouponAmount 	|	
  
  
@FreePick
@Priority2
Scenario Outline:Teacher cannot be able to find a non-qualifying item on free pick modal_TeacherCatalogueItem:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher enters [Free Pick Coupon]
	And Free pick modal displays
	When teacher searches for a [Non-qualifying Item]
	Then no results displays
	
Examples:
  | UsingData                            								|
  | BTS:FreePick:TeacherOrder_FreePickCoupon_TeacherClubItem             	|

  
  
@FreePick
@Priority2
Scenario Outline:Teacher cannot be able to find a non-qualifying item on free pick modal_ExpiredItem:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher enters [Free Pick Coupon]
	And Free pick modal displays
	When teacher searches for a [Non-qualifying Item]
	Then no results displays
	
Examples:
  | UsingData                            								|
  | BTS:FreePick:TeacherOrder_FreePickCoupon_ExpiredItem               		|    
  
  
@FreePick
@Priority2
Scenario Outline:Confirm Selection button is disabled when freepick is deleted from Curent selection section:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher enters [Free Pick Coupon]
	And teacher selects a grade
	And teacher selects an item from modal
	When teacher deletes the item from Current Selection section window
	Then confirm selection button is disabled
	
Examples:
  | UsingData                            |
  | BTS:FreePick:TeacherOrder_FreepickCoupon_2 |	
    
   
@FreePick
@Priority2
@NeedtoupdateDefect
Scenario Outline:Close on Free pick modal:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
When teacher selects [enter classroom order] from home page
And teacher adds student club items to the cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher enters [Free Pick Coupon]
And teacher selects a grade
And teacher selects an item from modal
When teacher clicks on modal window close button
Then item selections are saved
	
Examples:
  | UsingData                            |
  | BTS:FreePick:TeacherOrder_FreepickCoupon_3 |           	
  

@FreePick
@Priority2
Scenario Outline:Teacher cannot find Teacher Club items in Grade level results on Free pick modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And Teacher enters [Free Pick Coupon]
	When teacher clicks on grade level dropdown
	Then teacher catalogue does not display in list of grades
	
Examples:
  | UsingData                            |
  | BTS:FreePick:TeacherOrder_FreepickCoupon_4 |  
  
  
##################### PRIORITY 3 ###################  
  
@FreePick
@Priority3
Scenario Outline:No results are displayed when teacher searches for a term with no results:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And Teacher enters [Free Pick Coupon] on rewards and coupons page
And Free pick modal displays
When teacher searches for a [search term] with no results
Then no results displays


Examples: 
|UsingData|
|BTS:FreePick:TeacherOrder_FreePickCoupon_NoResults|



@FreePick
@Priority3
Scenario Outline:Teacher clicks Cancel button on Free pick modal:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And Teacher enters [Free Pick Coupon]
And teacher selects a grade
And teacher selects an item from modal
When teacher clicks Cancel in freepick model window
Then item selections are not saved
And teacher can click on the coupon code
And Free pick modal displays



Examples: 
|UsingData|
|BTS:FreePick:TeacherOrder_FreePickCoupon_Cancel|      	
  
    	
