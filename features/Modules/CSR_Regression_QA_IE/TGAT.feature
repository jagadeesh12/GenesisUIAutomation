Feature: TGAT
	This feature is to validate the TGAT scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@DWCACSR-793  @TGAT
Scenario Outline:CSR applying TGAT coupon for a new teacher on student club items with qualifying order value:[<UsingData>]
     
     Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     And CSR adds Student Clubs items to the cart with minimum amount
     And CSR navigates to Review Cart page from Order Entry page
     And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
     When CSR enters a TGAT coupon
     Then TGAT modal window should be displayed
     When CSR enters referring Teacher account details in TGAT modal window
     Then referring Teacher account details should be displyed in the [Coupons Applied] section
#     When CSR navigates to the Payment page
#     And CSR navigates to Confirm and Submit page
#     And CSR submit the order
#     Then order confirmation details should be displayed
    	
Examples:
   | UsingData                  							|
   | QA_CSR_Teacher_using_TGAT_coupon_for_student_club_items	|		
      


@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for a new teacher on student club and teacher club items with qualifying order value:[<UsingData>] 
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR enters a TGAT coupon
	Then TGAT modal window should be displayed

Examples: 
	| UsingData                  										|
	| QA_CSR_Teacher_using_TGAT_coupon_for_student_and_teacher_club_items	|	
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for a new teacher on teacher club items with qualifying order value:[<UsingData>] 
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters a TGAT coupon
	Then the error message 'Your order does not meet the coupon requirements.Please check the coupon for details' should be displayed 
	
Examples: 
	| UsingData                  							|
	| QA_CSR_Teacher_using_TGAT_coupon_for_teacher_club_items	|    
		


@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for Existing inactive teacher:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon
	When CSR enters inactive Teacher account details in TGAT modal window
	Then the error message 'This customer account number is invalid. Please make sure you entered the correct number' should be displayed 
	
Examples: 
	| UsingData                  										|
	| QA_CSR_Teacher_using_TGAT_coupon_and_enters_Inactive_account_number	|  
		
		

@DWCACSR-793 @TGAT 
Scenario Outline:CSR views TGAT coupon information in Confirm & Submit and Confirmation page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window 
	And CSR navigates to the Payment page
#	When CSR navigates to Confirm and Submit page
#	Then TGAT coupon information should be displayed in Confirm and Submit page
	
Examples: 
	| UsingData                  												|
	| QA_CSR_TGAT_coupon_information_in_Confirm_and_Submit_and_Confirmation_page	|  
	
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR views TGAT coupon information in Confirmation page in Order History:[<UsingData>] 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window 
	And CSR navigates to the Payment page 
#	And CSR navigates to Confirm and Submit page 
#	When CSR submit the order
#	Then CSR can see the TGAT coupon information in Order History section

Examples: 
	| UsingData                  							|
	| QA_CSR_TGAT_coupon_information_in_Order_History_section	|  
	
	
@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for a New teacher with incorrect referring teacher customer number:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	When CSR enters invalid referring Teacher account number in TGAT modal window
	Then the error message 'This customer account number is invalid. Please make sure you entered the correct number' should be displayed 
	
Examples: 
	| UsingData                  						|
	| QA_CSR_TGAT_coupon_with_incorrect_referring_teacher	|		
	
	
@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for a New teacher without referring teacher customer number:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	When CSR enters only the [Fname] and [Lname] of referring Teacher in TGAT modal window
	Then the [Submit] button should be disabled

Examples: 
	| UsingData                  								|
	| QA_CSR_TGAT_coupon_with_only_Fname_Lname_referring_teacher	|	
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for a New teacher without referring teacher's first name:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	When CSR enters only the [AcNumber] and [Lname] of referring Teacher in TGAT modal window
	Then the [Submit] button should be disabled

Examples: 
	| UsingData                  									|
	| QA_CSR_TGAT_coupon_with_only_AcNumber_Lname_referring_teacher	|	
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon without referring teacher's last name:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	When CSR enters only the [AcNumber] and [Fname] of referring Teacher in TGAT modal window
	Then the [Submit] button should be disabled 

Examples: 
	| UsingData                  									|
	| QA_CSR_TGAT_coupon_with_only_AcNumber_Fname_referring_teacher	|     
	


@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying multiple TGAT coupon for a new teacher in same order with qualifying order value:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon which is referred by [Teacher1] 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR enters a TGAT coupon which is referred by [Teacher2]
	Then the error message 'This Coupon has already been applied to this order' should be displayed 
	
Examples: 
	| UsingData                  								|
	| QA_CSR_Teacher_using_multiple_TGAT_coupon_for_same_orders	|		
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying invalid TGAT coupon for a new teacher:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters invalid TGAT coupon
	Then the error message 'Coupon code is unknown.' should be displayed 
	
Examples: 
	| UsingData                  				|
	| QA_CSR_Teacher_enters_invalid_TGAT_coupon	|    
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applies expired TGAT coupon for a new teacher:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters expired TGAT coupon
	Then the error message 'Coupon code is unknown.' should be displayed 
	
Examples: 
	| UsingData                  				|
	| QA_CSR_Teacher_enters_expired_TGAT_coupon	|    
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying TGAT coupon for a new teacher without qualifying order value:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters a TGAT coupon 
	Then the error message 'Your order does not meet the coupon requirements. Please check the coupon for details.' should be displayed 
	
Examples: 
	| UsingData                  						|
	| QA_CSR_TGAT_coupon_without_qualifying_order_value	|    
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR already redeemed TGAT coupon for a teacher using same TGAT coupon with qualifying order value:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters a TGAT coupon which is already applied and redeemed
	Then the error message 'You have already redeemed this coupon code on a previous order.' should be displayed
	
Examples: 
	| UsingData                  									|
	| QA_CSR_Already_redeemed_TGAT_coupon_with_qualifying_order_value	|   
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR already redeemed TGAT coupon for a teacher using different TGAT coupon with qualifying order value:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters a TGAT coupon which is referred by [Teacher2] 
	Then the error message 'You have already redeemed this coupon code on a previous order.' should be displayed
	
Examples: 
	| UsingData                  									|
	| QA_CSR_Already_redeemed_TGAT_coupon_using_different_TGAT_coupon	|   
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applying same TGAT coupon for Multiple teachers for the first with qualifying order value:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR enters a TGAT coupon which is referred by [Teacher1] 
	Then TGAT modal window should be displayed 
	
Examples: 
	| UsingData                  							|
	| QA_CSR_TeacherA_using_TGAT_coupon_referred_by_Teacher1	|   
	| QA_CSR_TeacherB_using_TGAT_coupon_referred_by_Teacher1	|   
	| QA_CSR_TeacherC_using_TGAT_coupon_referred_by_Teacher1	|   
	| QA_CSR_TeacherD_using_TGAT_coupon_referred_by_Teacher1	|
	
	
	
@DWCACSR-793 @TGAT 
Scenario Outline:CSR views correct tool tip for TGAT coupon number:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	When CSR enters referring Teacher account details in TGAT modal window 
	Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed 
	
Examples: 
	| UsingData         	         		|
	| QA_CSR_ToolTip_for_TGAT_coupon_number	|    
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR is mandated to enter referring teacher’s info if New teacher applies TGAT and closes the modal and tries to checkout:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR closes the TGAT modal window
#	When CSR proceed to checkout from Rewards and coupons page
#	Then the error message 'click the coupon link below to finalize your coupons' text should be displayed
	
Examples: 
	| UsingData            									      			|
	| QA_CSR_Teacher_without_enter_TGAT_coupon_details_and_proceedToCheckout	|    
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applies the same TGAT coupon for a New teacher:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR enters again the same TGAT coupon
	Then the error message 'Coupon code is already in your cart.' should be displayed 
	
Examples: 
	| UsingData                  				|
	| QA_CSR_Enter_same_TGAT_coupon_error_message	|  
      


@DWCACSR-793 @TGAT 
Scenario Outline:CSR selects NO to delete the applied TGAT coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window
	When CSR clicks on delete TGAT coupon button and selects as [NO]
	Then the applied TGAT coupon should be displayed in [Coupons Applied] section 
	
Examples: 
	| UsingData                  				|
	| QA_CSR_TGAT_coupon_when_selects_NO_to_delete	|  
	


@DWCACSR-793 @TGAT 
Scenario Outline:CSR selects YES to delete the applied TGAT coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR clicks on delete TGAT coupon button and selects as [YES]
	Then the applied TGAT coupon should not be displayed in [Coupons Applied] section 
	
Examples: 
	| UsingData                		  				|
	| QA_CSR_TGAT_coupon_when_selects_YES_to_delete	|    
	


@DWCACSR-793 @TGAT 
Scenario Outline:CSR deletes the applied TGAT coupon and enters the same TGAT coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon which is referred by [Teacher1] 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR deletes the TGAT coupon
	And CSR enters a TGAT coupon which is referred by [Teacher1] 
	Then TGAT modal window should be displayed

Examples: 
	| UsingData           		       				|
	| QA_CSR_Same_TGAT_coupon_when_delete_and_apply	|
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR deletes the applied TGAT coupon and enters the different TGAT coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon which is referred by [Teacher1] 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR deletes the TGAT coupon
	And CSR enters a TGAT coupon which is referred by [Teacher2] 
	Then TGAT modal window should be displayed 

Examples: 
	| UsingData                  					|
	| QA_CSR_Diff_TGAT_coupon_when_delete_and_apply	|  
	
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR applies the coupon and removes items from cart making cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR deletes the items from cart making cart non-qualifying
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then the applied TGAT coupon should not be displayed in [Coupons Applied] section
	
Examples: 
	| UsingData                  							|
	| QA_CSR_Teacher_removes_items_to_make_cart_non_qualifying	|  
	
	

@DWCACSR-793 @TGAT 
Scenario Outline:CSR can apply TGAT coupon if top-off from DTS makes the cart qualify for applying TGAT coupon:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying [minumum amount]
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR selects the DTS item which top off amount makes the cart to qualify
	And CSR enters a TGAT coupon
	Then TGAT modal window should be displayed
	
Examples: 
	| UsingData                  					|
	| QA_CSR_Top_off_from_DTS_makes_the_cart_qualify	|  
	
	

@SCSCOD-4299 @assignee:sreddy-temp@scholastic.com @COMPLETED 
Scenario Outline:CSR cannot apply TGAT coupon if there are redemptions against a qualifying cart total making the cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in student Bonus Bank
	And CSR enters amount in student Paper coupons
	And CSR clicks on Apply in Students section
	When CSR enters a TGAT coupon 
	Then the error message 'Your order does not meet the coupon requirements. Please check the coupon for details.' should be displayed 
	
Examples: 
	| UsingData                  						|
	| QA_CSR_Redemptions_against_a_qualifying_cart_total	|  
	
	

@SCSCOD-4299 @assignee:sreddy-temp@scholastic.com @COMPLETED 
Scenario Outline:CSR applies TGAT coupon and makes redemptions against student clubs making cart non-qualifying:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters a TGAT coupon 
	And CSR enters referring Teacher account details in TGAT modal window 
	When CSR enters amount in student Bonus Bank
	And CSR enters amount in student Paper coupons
	And CSR clicks on Apply in Students section
	Then the applied TGAT coupon should not be displayed in [Coupons Applied] section 
	
Examples: 
	| UsingData                  												|
	| QA_CSR_Applied_TGAT_coupon_with_Redemptions_against_a_qualifying_cart_total	|  
	
	
                                               