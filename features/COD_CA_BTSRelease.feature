Feature: BTS Release Test Scenarios
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	




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
@SCSCOD-4134
Scenario Outline:Items grouped by Student club when teacher creates order with more than one Student Club same month:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	Then items are grouped by Student Club Youngest Club to Oldest Club
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
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
@SCSCOD-4134
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
@SCSCOD-3585
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
  
  
  
  
########################         REVIEW CART PRIORITY1 SCENARIOS    ########################
  
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Items grouped by Teacher club when teacher creates order with more than one Teacher Club:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
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
  | UsingData                         |
  | TeacherOrder_DifferentTeacherClub_ReviewCart |
  
  
  	  
  
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs different month
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,PST and Total amount displays correctly
	
Examples:
  | UsingData                          |
  | TeacherOrder_StudentItems_GST_PST_Province_BC_ReviewCart |
  
  
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher club  items for GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Teacher Club Subtotal,GST,PST and Total amount displays correctly
	
Examples:
  | UsingData                          |
  | TeacherOrder_TeacherItems_GST_PST_Province_BC_ReviewCart |
  
   
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST in Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Teacher Club Subtotal,GST,QST and Total amount displays correctly
	
Examples:
  | UsingData                        |
  | TeacherOrder_TeacherItems_GST_QST_Province_QC_ReviewCart |     	 
  

@ReviewCart
@Priority1
@SCSCOD-3585
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST in Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs different month
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,QST and Total amount displays correctly
	
Examples:
  | UsingData                          |
  | TeacherOrder_StudentItems_GST_QST_Province_QC_ReviewCart |
  
  
  
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs different month
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | TeacherOrder_StudentItems_HST_Province_NL_ReviewCart |
  
    
@ReviewCart
@Priority1
@SCSCOD-3585
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Teacher Club Subtotal,HST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | TeacherOrder_TeacherItems_HST_Province_NL_ReviewCart |
  
  
@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	Then Student Club Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | TeacherOrder_StudentItems_GST_Province_AB_ReviewCart |
  
  

@ReviewCart
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	Then Teacher Club Subtotal,GST,Total amount displays correctly
	
Examples:
  | UsingData                    |
  | TeacherOrder_TeacherItems_GST_Province_AB_ReviewCart |
  
  
@ReviewCart
@Priority1
@Maintenance
Scenario Outline:Teacher edits Student Name on Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher edits the Student Name in Review Cart page
	Then Student Name is updated in Review Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher navigates to Confirm and Submit page
	Then Student Name is updated in submit page
	When teacher clicks on Submit Order
	Then Student Name is updated in Order reference page
	
Examples:
  | UsingData                  		 		 |
  | TeacherOrder_EditStudentName_ReviewCart  |
  
  
  
@ReviewCart
@Priority1
Scenario Outline:Teacher has the ability to decrease the quantity of an item by clicking on - on Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When teacher clicks on '-'
	Then the Qty of the item is decreased by 1
	And the cart total is adjusted accordingly
	
Examples:
  | UsingData      |
  | Teacher_DecreaseQty_ReviewCart  |


####################################################################
@ReviewCart
@Priority2
Scenario Outline:Teacher can delete item by updating Qty to 0 on Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher edits the Quantity to 0 of Student club item in Review Cart page
	And Teacher edits the Quantity to 0 of Teacher club item in Review Cart page
	Then the item is removed from cart
	
Examples:
  | UsingData                  		 				|
  | BTS:ReviewCart:TeacherOrder_EditQty_0_ReviewCart  	|
  
  
@ReviewCart
@Priority2
Scenario Outline:Teacher views empty cart message when no items added:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher clicks mini cart from home page
	Then teacher views "You have no orders to review. You may enter orders or shop books & resources."
	
Examples:
  | UsingData                  	|
  | BTS:ReviewCart:Teacher_Login  	|
  
    
@ReviewCart
@Priority2
Scenario Outline:Teacher Clicks Enter Orders and lands on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks mini cart from home page
	And teacher clicks enter orders
	Then YTO page displays
	
Examples:
  | UsingData                  		|
  | BTS:ReviewCart:Teacher_Login_2  	|
  
  
@ReviewCart
@Priority2
Scenario Outline:Teacher Clicks Shop books and Resources and lands on shop books and resources page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks mini cart from home page
	And teacher clicks Shop Books & Resources
	Then Shop Books & Resources page displays
	
Examples:
  | UsingData                  		|
  | BTS:ReviewCart:Teacher_Login_3  	|
  
    
##################################### priority3 ###########################################

@ReviewCart
@Priority3
Scenario Outline:Teacher adding items with Student Name and without Qty are not carried over to Review Cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When teacher enters student name and no quantity
	And Teacher navigates to Review Your Cart page
	Then the added item does not display on Review Cart page
	
Examples:
  | UsingData                 	|
  | BTS:ReviewCart:Teacher_Login_4  |    
  
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
@Maintenance
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
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly
	
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
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly
	
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
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly
	
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
  
  
  
###########################    REWARDS AND COUPONS PRIORITY1 SCENARIOS         #############################################
  
  
  
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher club  items for GST & PST with Redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then Teacher Catalogues PostTax,Items,GST,PST,Total amount displays correctly
	
Examples:
  | UsingData                          	  	 |
  | TeacherOrder_TeacherItems_GST_PST_Province_BC_2.1_2.1_CouponsRewards |
  
  
  
  
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST with redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then Teacher Catalogues PostTax,Items,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                          	  	 |
  | TeacherOrder_TeacherItems_GST_QST_Province_QC_2.1_2.1_CouponsRewards |
  
  
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST with redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	Then StudentClub PostTax,Items,GST,QST,Total amount displays correctly
	
Examples:
  | UsingData                          	  	 		 |
  | TeacherOrder_StudentItems_GST_QST_Province_QC_2.1_2.1_CouponsRewards |
  
  
  
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST with redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	Then StudentClub PostTax,Items,HST,Total amount displays correctly
	
Examples:
  | UsingData                          	 |
  | TeacherOrder_StudentItems_HST_Province_NB_2.1_2.1_CouponsRewards | 
  
  
  
@RewardsAndCoupons
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST with redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then Teacher catalogues PostTax,Items,HST,Total amount displays correctly
	
Examples:
  | UsingData                          	 |
  | TeacherOrder_TeacherItems_HST_Province_NB_2.1_2.1_CouponsRewards |
  
  
  
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST with redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	Then StudentClub PostTax,Items,GST,Total amount displays correctly
	
Examples:
  | UsingData                          	 |
  | TeacherOrder_StudentItems_GST_Province_AB_2.1_2.1_CouponsRewards | 
    
    
@RewardsAndCoupons
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST with redemptions:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then Teacher catalogues PostTax,Items,GST,Total amount displays correctly
	
Examples:
  | UsingData                          	 |
  | TeacherOrder_TeacherItems_GST_Province_NT_2.1_2.1_CouponsRewards |  	
	
	
@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher can see message on by when the order needs to be submitted to receive rewards:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then Main message – [Rewards Earned with Today’s Qualifying Order of] displays in rewards section
	And Sub message – Submit by [Last date of current calendar month] to receive [Insert calendar month] rewards displays in rewards section
	
Examples:
  | UsingData                                		 		|
  | BTS:RewardsAndCoupons:TeacherOrder_Province_TaxExemptedItem |	
  
  
  
  
  
###########################   priority 2 scenarios ##################################################################################  
  
  
@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem dollars more than the student club total using Bonus Bank redemptions:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And Teacher adds items from different Student and Teacher clubs
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    When teacher enters amount more than the student order total in student Bonus Bank
    Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays
	
	Examples: 
	|UsingData|
	|BTS:Teacher_BonusBank_GrtThan_StudentClubTotal| 
	
	
	
@RewardsAndCoupons
@Priority2	
Scenario Outline:Teacher cannot redeem dollars more than the student club total using paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount more than the student order total in paper Bonus coupon
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_PaperBank_GrtThan_StudentClubTotal|


@RewardsAndCoupons
@Priority2	
Scenario Outline:Teacher cannot redeem more than the teacher club total using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount more than the teacher order total in teacher Bonus Bank
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TechBonusBank_GrtThan_TeacherClubTotal| 


@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem more than the teacher club total using paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount greater than the teacher order total in teacher paper Bonus coupon
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TechPaperBank_GrtThan_TeacherClubTotal|


@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem dollars more than dollars in Bonus Bank using Student Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount more than dollars in Bonus Bank in student Bonus Bank
Then “Bonus bank totals must be less then or equal to bonus bank available″ message displays

Examples: 
|UsingData|
|BTS:Teacher_StudentBonusBank_GrtThan_BonusBank|



@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem more than dollars in Bonus Bank using Teacher Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount more than dollars in Bonus Bank in teacher Bonus Bank
Then “Bonus bank totals must be less then or equal to bonus bank available″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TeacherBonusBank_GrtThan_BonusBank|



@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem dollars more than the student club total using Bonus Bank and paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student clubs same months
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions greater than the student club total
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_StudentBonusBank_PaperBank_GrtThan_StudentclubAmt|



@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem more than the teacher club total using Bonus Bank and paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions greater than the teacher club total
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TeacherBonusBank_PaperBank_GrtThan_TeacherclubAmt|



@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher can redeem entire student club total using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student clubs same months
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in student Bonus Bank equal to Student Club total
Then Student Clubs Amount Owing becomes$0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_StudentBonusBank_Entire_StudentclubAmt|


@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher can redeem entire student club total using paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student clubs same months
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in student Paper Bonus coupon equal to Student Club total
Then Student Clubs Amount Owing becomes$0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_StudentPaperBankBonus_Entire_StudentclubAmt|



@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher can redeem entire student club total using Bonus Bank and paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student clubs same months
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions equal to the Student Clubs total amount
Then Student Clubs Amount Owing becomes$0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_StudentBonusBank_PaperCoupon_Entire_StudentclubAmt| 




@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher can redeem entire teacher club total using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in teacher Bonus Bank equal to Teacher Club total
Then Teacher Clubs Amount Owing becomes$0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_TeacherBankBonus_Entire_TeacherclubAmt|


@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher can redeem entire teacher club total using paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in teacher paper bonus coupon equal to Teacher Club total
Then Teacher Clubs Amount Owing becomes$0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_TeacherPaperCoupon_Entire_TeacherclubAmt|


@RewardsAndCoupons
@Priority2
@SCSCOD-3774
Scenario Outline:Teacher can redeem entire teacher club total using Bonus Bank and paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions equal to Teacher Clubs total amount
Then Teacher Clubs Amount Owing becomes$0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_TeacherBonusBank_PaperCoupon_Entire_TeacherclubAmt|



@RewardsAndCoupons
@Priority2
Scenario Outline:Teacher cannot redeem more than the Shipping Fee using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount greater than the [ShippingFee] in shipping Bonus Bank
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TeacherBonusBank_Greater_ShippingAmt|



@RewardsAndCoupons
@Priority2  
Scenario Outline:Teacher cannot redeem more than the Shipping Fee using paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount greater than the [ShippingFee] in shipping Paper Bonus Coupon
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TeacherPaperBonusCoupon_Greater_ShippingAmt|



@RewardsAndCoupons
@Priority2  
Scenario Outline:Teacher cannot redeem more than the Shipping Fee total using Bonus Bank and paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount greater than the [ShippingFee] in shipping Bonus Bank and Paper Bonus Coupon
Then “Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays

Examples: 
|UsingData|
|BTS:Teacher_TeacherBonusBank_PaperBonusCoupon_Greater_ShippingAmt|



@RewardsAndCoupons
@Priority2  
Scenario Outline:Teacher cannot redeem more than the dollars in bank using Bonus Bank redemptions for Shipping:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount more than dollars in Bonus Bank in shipping Bonus Bank
Then “Bonus bank totals must be less then or equal to bonus bank available″ message displays

Examples: 
|UsingData|
|BTS:Teacher_ShippingBonusBank__Greater_BonusBankAmt| 




@RewardsAndCoupons
@Priority2  
Scenario Outline:Teacher can redeem dollars equal to Shipping Fee using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank
Then Shipping & Handling Amount owing is 0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_ShippingBonusBank__Equal_ShippingFeeAmt|



@RewardsAndCoupons
@Priority2  
Scenario Outline:Teacher can redeem dollars equal to the Shipping Fee using paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount equal to the [ShippingFee] in shipping paper bonus coupon
Then Shipping & Handling Amount owing is 0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_ShippingPaperBonuscoupon__Equal_ShippingFeeAmt|




  
@RewardsAndCoupons
@Priority2  
Scenario Outline:Teacher can redeem dollars equal to the Shipping Fee using Bonus Bank and paper bonus coupon redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
When teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank and paper Bonus coupon
Then Shipping & Handling Amount owing is 0
And teacher can proceed to checkout

Examples: 
|UsingData|
|BTS:Teacher_ShippingBonusBank_PaperBonuscoupon__Equal_ShippingFeeAmt|
	
#######################priority3########################	
@RewardsAndCoupons
@Priority3
Scenario Outline:How is my qualifying total order qualified link and messaging:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And user clicks on link "How is my qualifying total order qualified"
	Then pop up displays with message “Your Qualifying Order Total is the pre-tax value of all your Student Club items (anything you have purchased from the monthly teacher pages and student flyers), less any Bonus Coupons or Credit Notes redeemed.”

Examples:
  | UsingData                            |
  | BTS:RewardsAndCoupons:TeacherOrder_popup |		
	
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    PAYMENT    				     #############################################################
###########################################   							             #############################################################        
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
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Student and Teacher clubs Total owing amount displays correctly
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
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST without redemptions against 'NU' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page
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
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page
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
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page
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
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page
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
Scenario Outline: Teacher places an order with Checks as payment in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigate to Payment page
When teacher selects checks as payment
And teacher clicks on "Continue checkout"
Then teacher views Amount paid by checks with check amount
And teacher submit the order
And teacher views Amount paid by checks with check amount
	
	
Examples:
  | UsingData                          	  	 |
  | Golden:TeacherOrder_ItemsInCart_checks_2 |
  
  
 
@Golden	
@bvt
@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card with combination of cc and checks as payment to checkout:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	When teacher selects saved credit card and valid information in all other fields
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit card and Amount paid by Cheques correctly
	And teacher clicks on Submit Order
	And teacher views Amount paid by Credit card and Amount paid by Cheques correctly
	
Examples:
  | UsingData                                               |
  | Golden:TeacherOrder_ItemsInCart_SavedCreditCard_Visa_Check     |  
  


##############################        PAYMENT PAGE PRIORITY1 SCENARIOS         ############################################################



@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & PST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_StudentItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
 
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & PST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page3
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_TeacherItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
  
  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_StudentItems_GST_QST_Province_QC_2.1_2.1_PaymentPage | 
  
  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigate to Payment page
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_TeacherItems_GST_QST_Province_QC_2.1_2.1_PaymentPage |  
  
  
  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_StudentItems_HST_Province_NB_2.1_2.1_PaymentPage |
  
  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigate to Payment page
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_TeacherItems_HST_Province_NS_2.1_2.1_PaymentPage |
  
  
  
  
    
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_StudentItems_GST_Province_AB_2.1_2.1_PaymentPage | 
  
  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigate to Payment page
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_TeacherItems_GST_Province_NT_2.1_2.1_PaymentPage |


@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools-BTS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page_2
	And Teacher navigates to Payments page
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page
	
	
Examples:
  | UsingData                             |
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_3 |
  
  
      
@Payment
@Priority1
Scenario Outline:when flag is set to true teacher sees alternate shipping-BTS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	
	
Examples:
  | UsingData                             		|
  | BTS:Payment:TeacherOrder_ItemsInCartAlternateFlag_True 	|   
  
  
@Payment
@Priority1
Scenario Outline:Teacher can proceed to checkout if she does not want alternate shipping-BTS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	When teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then School address displays in Shipping address section
	When teacher clicks on Submit Order
	Then School address displays in Shipping address section
	
	
Examples:
  | UsingData                   		|
  | BTS:Payment:TeacherOrder_ItemsInCart 	|    
  
  
@Payment
@Priority1
Scenario Outline:Teacher creates an order shipping to alternate address:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	When teacher selects cheques as payment
	And teacher selects alternate shipping option
	And teacher fills alternate shipping address details
	And teacher clicks on "Continue checkout"
	Then teacher views alternate shipping address with text “Alternate Shipping Address” after the address on Confirm & Submit page
	When teacher clicks on Submit Order
	Then teacher views alternate shipping address with text “Alternate Shipping Address” on Submitted page
	
	
Examples:
  | UsingData        					           		|
  | BTS:Payment:TeacherOrder_ItemsInCart_alternateShipping 	| 
  
  
 
@Payment
@Priority1
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Visa:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Visa 		|
  
  
@Payment
@Priority1
@Maintenance
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Amex:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Amex 		|

  
  
@Payment
@Priority1
@Maintenance
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Master:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Master 		|

  
  
#@Payment
#@Priority1
#@Maintenance
#@SCSCOD-3667
#Scenario Outline:Teacher enters credit card from Billing and payment-Discover:[<UsingData>]
#	
#	Given teacher logs into the application by providing [UserInformation]
#	When teacher clicks on My Account
#	And teacher clicks on Billing and Payments
#	And teacher clicks on Add a card
#	When teacher enters [credit card info] in MyAccount Page
#	And teacher click on Save
#	Then the credit card is saved
#	
#	
#Examples:
#  | UsingData        					           			|
#  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Discover 	|      
      
  
@Payment
@Priority1
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-visa:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Visa_2 		|  



@Payment
@Priority1
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-Amex:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Amex_2 		|

  
  
@Payment
@Priority1
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-Master:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Master_2 	|

  
        
#@Payment
#@Priority1
#@Maintenance
#@SCSCOD-3882
#Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-Discover:[<UsingData>]
#	
#	Given teacher logs into the application by providing [UserInformation]
#	When teacher selects [enter classroom order] from home page
#	And Teacher adds items from different Student clubs same months
#	And Teacher navigates to Review Your Cart page
#	When Teacher navigates to rewards & coupons page
#	And Teacher navigates to Payments page
#	And teacher selects combination of credit card and cheques as payment
#	And user selects Add a New card
#	Then user fills [CreditCardInformation] for the credit card 
#	When user unsave the card
#	And Teacher enter amount to be paid by credit card
#	And teacher clicks on "Continue checkout"
#	Then teacher views Amount paid by Credit Card and Cheques correctly
#	When teacher clicks on Submit Order
#	And teacher views Amount paid by Credit Card and Cheques correctly
#	
#Examples:
#  | UsingData                             					|
#  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Discover_2 	|
  
    
@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card to checkout-Visa:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Visa 		| 


@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card to checkout-Amex:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Amex 		| 

  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher selects saved credit card to checkout-Master:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Master 	| 

  
  
#@Payment
#@Priority1
#@Maintenance
#@SCSCOD-3882
#Scenario Outline:Teacher selects saved credit card to checkout-Discover:[<UsingData>]
#	
#	Given teacher logs into the application by providing [UserInformation]
#	When teacher clicks on My Account
#	And teacher clicks on Billing and Payments
#	And teacher clicks on Add a card
#	When teacher enters [credit card info] in MyAccount Page
#	And teacher click on Save
#	And teacher comes to Home page
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	When Teacher navigates to rewards & coupons page
#	And Teacher navigates to Payments page
#	When user selects payment method as creditCard
#	When teacher selects saved credit card
#	And teacher clicks on "Continue checkout"
#	Then teacher views Amount paid by Credit Card correctly
#	When teacher clicks on Submit Order
#	And teacher views Amount paid by Credit Card correctly
#	
#Examples:
#  | UsingData                             						|
#  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Discover 	|     



  
  
  
################################################################################



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
  
  
  
  
  
  
  #################		PAYMENT PRIORITY 2 SCENARIOS      ########################################################
  
  
@Payment
@Priority2
@SCSCOD-4033
Scenario Outline: Teacher redeem dollars equal to Shipping Fee using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
And teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank
When teacher navigates to Payment page 
Then No. of items and Total(Post tax & post Redemptions) in Student Catalogues displays
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Student Catalogues displays
And StudentClubsTotal(post Redemptions) displays
And No. of items and Total(Post tax & post Redemptions) in Teacher Catalogues displays
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays
And TeacherCatalogues Total(Post tax & post Redemptions) displays
And Total(Post tax) displays in Shipping & Handling header
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays
And Shipping & Handling Total(Post tax & post Redemptions) displays
And Total Amount Due displays Student Club total + TeacherCatalogues Total + Shipping Total

Examples: 
|UsingData|
|BTS:Teacher_ShippingBonusBank__Equal_ShippingFeeAmt_Payment| 





@Payment
@Priority2
Scenario Outline: Teacher does not view payment methods when order total is 0 because of redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
And teacher enters amount in student Bonus Bank equal to Student Club total
And teacher enters amount in teacher Bonus Bank equal to Teacher Club total
And teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank
When teacher navigate to payment page
Then payments dropdown is disabled
And teacher can submit order without selecting payment method


Examples: 
|UsingData|
|BTS:Teacher_allredemptions__Equal_totalAmt_checkout_Payment|




@Payment
@Priority2
Scenario Outline:Teacher does not enter address1 in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [postal code], [city] and [province]
Then Continue Checkout button should be disabled


Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_Address1Miss|




@Payment
@Priority2
Scenario Outline:Teacher does not enter address2 in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [postal code], [city] and [province]
And teacher clicks on "Continue checkout"
Then teacher lands on Confirm and Submit page

Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_Address2Miss|



@Payment
@Priority2
Scenario Outline:Teacher does not enter postal code in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [city] and [province]
Then Continue Checkout button should be disabled

Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_PostalcodeMiss|



@Payment
@Priority2
Scenario Outline:Teacher does not enter City in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [postal code] and [province]
Then Continue Checkout button should be disabled

Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_CityMiss|




@Payment
@Priority2
Scenario Outline:Teacher does not enter province in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [city] and [postal code]
Then Continue Checkout button should be disabled



Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_StateMiss|



@Payment
@Priority2
Scenario Outline:Teacher selects saved expired credit card:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher navigate to My Account page and make sure expired card is present
And teacher navigates to home page
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
When teacher selects credit card as payment and try to look for expired card
Then no credit card is seen in the list


Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_savedExpiredCreditCard|





@Payment
@Priority2
Scenario Outline:Teacher selects saved expired credit card from Combination of Credit card and checks:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher navigate to My Account page and make sure expired card is present
And teacher navigates to home page
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
When teacher selects combination of credit card and checks as payment and try to look for expired card
Then no credit card is seen in the list


Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_savedExpiredCreditCard_Cheque|


########################### priority3 #########################

@Payment
@Priority3
Scenario Outline:Teacher selects passed expiration date in credit card form:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	And user selects Add a New card
	When teacher enters passed expiration date and valid information in all other fields
	When user unsave the card
	And teacher clicks on "Continue checkout"
	Then teacher sees expired card error message
	
Examples:
  | UsingData                             		|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard |
     
     
@Payment
@Priority3
@TODO
Scenario Outline:Teacher selects passed expiration date from Billing and payment:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	#Then teacher sees error message displays
	
	
Examples:
  | UsingData        					           		|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_2 		|

  
       
  

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    CONFIRM AND SUBMIT    		 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################  
       
      
@Golden
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student Club & Teacher club items for GST & PST with Shipping Fee against 'BC' Province in ConfirmSubmit Page:[<UsingData>]

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
	Then Student Club Subtotal,GST,QST,Total amount and Teacher Catalogues Subtotal,GST,QST,Total amount displays correctly in ConfirmSubmit Page
	
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
  | UsingData                    					|
  | Confirm_Submit:TeacherOrder_GST_Province_NT_2 	|
      
      
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
  | Confirm_Submit:TeacherOrder_GST_Province_NU_2 |
           
           
           
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
  | Confirm_Submit:TeacherOrder_GST_Province_YT_2 |
           
                            
                       
@Golden
@ConfirmAndSubmit
@Priority1
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
  | Golden:Confirm_Submit:TeacherOrder_TaxExempt_Province_BC |
      
      
      
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
  
  
  
@ConfirmAndSubmit	
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for GST & PST in ConfirmAndSubmit Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,PST,Total amount and shipping fee displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        					|
  | BTS-Confirm_Submit:TeacherOrder_GST_PST_Province_BC_2 	|
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST in ConfirmAndSubmit Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher catalogues Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        				|
  | BTS-Confirm_Submit:TeacherOrder_GST_QST_Province_QC_2 	|  
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & PST in ConfirmAndSubmit Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher catalogues Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        				|
  | BTS-Confirm_Submit:TeacherOrder_GST_PST_Province_BC_3 	| 
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST in ConfirmAndSubmit Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        				|
  | BTS-Confirm_Submit:TeacherOrder_GST_QST_Province_QC_4 	|   
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST in ConfirmAndSubmit Page-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_NL_2 	|   

  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST in ConfirmAndSubmit Page-NB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_NB_2 	|
  
  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST in ConfirmAndSubmit Page-NS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_NS_2 	|

  
  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST in ConfirmAndSubmit Page-ON:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_ON_2	|

  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST in ConfirmAndSubmit Page-PE:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_PE_2 	|  
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST in ConfirmAndSubmit Page-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_NL_3 	|
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST in ConfirmAndSubmit Page-NB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_NB_3 	|

  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST in ConfirmAndSubmit Page-NS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_NS_3 	|

  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST in ConfirmAndSubmit Page-ON:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_ON_3	|

  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST in ConfirmAndSubmit Page-PE:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_HST_Province_PE_3 	|    
         

@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST in ConfirmAndSubmit Page-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_AB_3 	|
  
  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST in ConfirmAndSubmit Page-NT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_NT_3 	| 
  
  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST in ConfirmAndSubmit Page-NU:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_NU_3 	|
 
  
  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST in ConfirmAndSubmit Page-YT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_YT_3 	|  
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST in ConfirmAndSubmit Page-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_AB_4 	|   
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST in ConfirmAndSubmit Page-NT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_NT_4 	|
  
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST in ConfirmAndSubmit Page-NU:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_NU_4 	|   
  
  
@ConfirmAndSubmit
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST in ConfirmAndSubmit Page-YT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | BTS-Confirm_Submit:TeacherOrder_GST_Province_YT_4 	| 
  
  
@ConfirmAndSubmit
@Priority1
Scenario Outline:Teacher can see message on by when the order needs to be submitted to receive rewards_2:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs_2
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	When teacher proceeds to checkout from rewards and coupons page
	Then Main message – [Rewards Earned with Today’s Qualifying Order of] displays in rewards section
	And Sub message – Submit by [Last date of current calendar month] to receive [Insert calendar month] rewards displays in rewards section
	And teacher clicks on Submit Order
	Then sees the Main message and sub message as in confirm & submit page
	
Examples:
  | UsingData                                		 		|
  | BTS:Confirm_Submit:TeacherOrder_Province_TaxExemptedItem 	|    
    
                  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    SUBMITTED PAGE    		     #############################################################
###########################################   							             #############################################################        
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
@Example 
@Submitted
@Priority1
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
  | Golden:Submitted:TeacherOrder_TaxExempted_GST_Province_NL	| 
  
##################################################################################################### 

@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for GST & PST-BC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        				|
  | BTS-Submitted:TeacherOrder_GST_PST_Province_BC_2 	|
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for GST & PST-QC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        				|
  | BTS-Submitted:TeacherOrder_GST_PST_Province_QC_2 	|  
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club  items for GST & PST-BC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher catalogues Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        				|
  | BTS-Submitted:TeacherOrder_GST_PST_Province_BC_3 	|   
  
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club  items for GST & PST-QC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher catalogues Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        				|  
  | BTS-Submitted:TeacherOrder_GST_PST_Province_QC_3 	|   
  

@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST in Submitted Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher catalogues Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        				|
  | BTS-Submitted:TeacherOrder_GST_QST_Province_QC_2 	|    
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST in Submitted Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        				|
  | BTS-Submitted:TeacherOrder_GST_QST_Province_QC_4 	|    
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_NL_2 	|  
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST-NB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_NB_2 	|   
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST-NS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_NS_2 	|
   
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST-ON:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_ON_2	|   
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST-PE:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_PE_2 	|   
  

@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_NL_3 	|
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST-NB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_NB_3 	|
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST-NS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_NS_3 	|
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST-ON:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_ON_3	|
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST-PE:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_HST_Province_PE_3 	|   
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_AB_3 	| 
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST-NT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_NT_3 	|

  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST-NU:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_NU_3 	|
  
  
@Submitted
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST-YT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_YT_3 	|
  
 
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_AB_4 	|

  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST-NT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_NT_4 	|   
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST-NU:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_NU_4 	|    
  
  
@Submitted
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST-YT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	When teacher clicks on Submit Order
	Then Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page
	
Examples:
  | UsingData                        			|
  | BTS-Submitted:TeacherOrder_GST_Province_YT_4 	|   
  
  
  
##################################################################################################################################################        
##################################################################################################################################################  
###########################################   		             	                 #############################################################  
###########################################   		SHIPPING             	         #############################################################  
###########################################   		                     	         #############################################################        
##################################################################################################################################################        
##################################################################################################################################################  

@Golden
@Auto-FreeShipping
@Priority1
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
@Priority1	
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
@Priority1	
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
@Priority1	
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
@Priority1	
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
@Priority1
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
@Priority1	
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
@Priority1	
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
@Priority1
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
@Priority1
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
@Priority1
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
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher cannot apply Free Shipping coupon on a cart which does not meet minimum amount:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
    And teacher adds Student club items to cart less than the [Manual shipping threshold]
	And teacher navigates to coupons & Rewards page
	When teacher applies [Free Shipping Coupon]
    Then teacher sees error message for order amount not meeting for Free Shipping
	
	Examples: 
	|UsingData|
	|Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold_Coupon|
	
	
	
	
	
#########################       SHIPPING PRIORITY1 SCENARIOS             #######################################


@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher is charged GST on the shipping fee against 'AB' Province in Coupons and Rewards page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
When teacher adds Student club items to cart less than the [Manual shipping threshold]
And teacher navigates to coupons & Rewards page
Then [Shipping Fee] displays in Shipping & Handling blue header
And Shipping Handling, GST and Shipping & Handling Total displays in Shipping & Handling section

Examples:
  |UsingData|
  | Teacher_charged_taxes_onshippingfee_basedon_province_AB |	
	

@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds items to cart equal to the [shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	When teacher enters amount in [student paper dollar] resulting in cart total fall below [shipping threshold]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_StudentPaperCoupon_FREEshipping_greaterthan_Shipping_Threshold|
	
	
	
	
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Teacher items to cart equal to the [shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	When teacher enters amount in [teacher Bonus dollar] resulting in cart total fall below [shipping threshold]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_charged_ShippingFee_TeacherBonusRedemptions|
	
	
	
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Teacher items to cart equal to the [shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	When teacher enters amount in [teacher paper dollar] resulting in cart total fall below [shipping threshold]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_charged_ShippingFee_TeacherPaperRedemptions|
	
	
	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Student Club orders to receive free shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student club items to cart less than the [Manual shipping threshold]
	And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_StudentItems_FREEshipping_with_coupon|
	
	
	

@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can apply coupon on a cart with qualifying minimum amount on Teacher and Student Club orders to receive free shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
	And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_StudentTeacherItems_FREEshipping_with_coupon|
	
	

	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Student Bonus dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_StudentBonusRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Student paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_StudentPaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Student Bonus and paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Student Bonus dollar] and [student paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_StudentBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Teacher Bonus dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_TeacherBonusRedemptions_charged_ShippingFee_Coupon|
	
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_TeacherPaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher can still apply Free Shipping coupon if redemptions from Teacher Bonus and paper coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher enters amount in [Teacher Bonus dollar] and [Teacher paper dollar] making cart total fall below [Manual shipping threshold]
	When teacher applies [Free Shipping Coupon]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_applies_TeacherBonusandpaperRedemptions_charged_ShippingFee_Coupon|
	
	
	
	
	
	
@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher click on delete and No option does not delete the coupon:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher applies [Free Shipping Coupon]
When teacher clicks on Delete coupon
And teacher clicks on No option
Then coupon is not deleted
And teacher still has FREE shipping

Examples: 
|UsingData|
|Teacher_FREEshipping_DeleteNo_with_coupon|	




@Manual-FreeShipping	
@Priority1
Scenario Outline:Teacher cannot apply already redeemed coupon:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher applies [Free Shipping Coupon]
When teacher tries to apply same [Free Shipping Coupon]
Then teacher sees error message for using same coupon2
	
	Examples: 
	|UsingData|
	|Teacher_FREEshipping_SameCoupon_with_coupon|
	
	
	
#########################       SHIPPING PRIORITY2 SCENARIOS             #######################################	
	
	
	
@Auto-FreeShipping
@Priority2
Scenario Outline:Teacher add more items to cart resulting in Free Shipping:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student club items to cart less than the [Manual shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	And teacher navigates to Review Your cart page from Coupons & Rewards page
    When teacher adds more items to cart meeting the [shipping threshold]
    And teacher navigates to coupons & Rewards page
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_AddMoreItems_ShippingFee_lessthan_Shipping_Threshold|
	
	
	
@Auto-FreeShipping
@Priority2
Scenario Outline:Teacher deletes items from cart resulting in paid shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds items to cart equal to the [shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	And teacher navigates to Review Your cart page from Coupons & Rewards page
    When teacher deletes items from cart resulting in cart total fall below [shipping threshold]
    And teacher navigates to coupons & Rewards page
    Then teacher does not receive free Shipping
	
	Examples: 
	|UsingData|
	|Teacher_DeletesItems_FREEshipping_greaterthan_Shipping_Threshold|
	
	
	
	
	
@Manual-FreeShipping
@Priority2	
Scenario Outline:Teacher applies Shipping coupon and deletes items from cart making cart non-qualifying resulting in coupon being removed:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher adds Student and Teacher club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher does not receive free Shipping
And teacher applies [Free Shipping Coupon]
And teacher receives FREE shipping
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher delete items from cart resulting in cart total fall below [shipping threshold]
And teacher navigates to coupons & Rewards page
Then teacher does not receive free Shipping
	
Examples:
  | UsingData                          	  	 |
  | Teacher_deletes_items_from_cart_ManualShippingCoupon |
  
  
  
  
@Manual-FreeShipping
@Priority2	
Scenario Outline:Teacher can apply a deleted coupon again:[<UsingData>]
	
	Given teacher login into the application by providing [UserInformation]
	And teacher add Teacher club items to cart qualifying for [Manual Free shipping coupon]
    And teacher navigates to coupons & Rewards page
	And teacher applies [Free Shipping Coupon]
	And teacher clicks on Delete coupon
	And teacher clicks on Yes option
	When teacher tries to apply same [Free Shipping Coupon]
	Then teacher receives FREE shipping
	
	
Examples:
  | UsingData                          	  	 |
  | Teacher_deletes_Coupon_AddsCoupon_ManualShippingCoupon |
  
  
  
  
  
  
############################			PRIORITY 3 SCENARIOS 			#####################################################################


@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher cannot apply Free Shipping coupon on a Free shipping cart:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher adds Teacher items to cart equal to the [shipping threshold]
And teacher navigates to coupons & Rewards page
And teacher receives FREE shipping
When teacher applies [Free Shipping Coupon]
Then teacher sees error message “Shipping for your order is already FREE! This coupon code cannot be applied.”



Examples: 
|UsingData|
|BTS:Teacher_FREEshipping_SameCoupon_with_coupon|



@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher recieves Free shipping if the top-off from DTS makes the cart qualify for Free shipping:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher add items to cart less than the [shipping threshold] and equal to [minimum amount] for Dollars to Spend promotion
And teacher navigates to coupons & Rewards page
And [Shipping Fee] displays in Shipping & Handling blue header
And teacher clicks on Make Selection button
When teacher selects an item such that the top-off amount makes cart meet the [shipping threshold]
And teacher clicks on Confirm Selection button
Then teacher receives FREE shipping


Examples: 
|UsingData|
|BTS:Teacher_Receives_FREEshipping_TopoffAmt|




@Manual-FreeShipping
@Priority3
Scenario Outline:Teacher can apply Free shipping coupon if the top-off from DTS makes the cart qualify for Free shipping:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher add items to cart less than the [manual shipping threshold] and equal to [minimum amount] for Dollars to Spend promotion
And teacher navigates to coupons & Rewards page
And [Shipping Fee] displays in Shipping & Handling blue header
And teacher clicks on Make Selection button
When teacher selects an item such that the top-off amount makes cart meet the [shipping threshold]
And teacher clicks on Confirm Selection button
When teacher applies [Free Shipping Coupon]
Then teacher receives FREE shipping


Examples: 
|UsingData|
|BTS:Teacher_Receives_FREEshipping_ManualCoupon_TopoffAmt|


	
	
	
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    YTO PAGE    		         #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################          


@YTO
@Priority1
Scenario Outline:Teacher has the ability to click - to remove items from cart on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	When teacher clicks on '-' in YTO page
	Then the item quantity is decreased by 1 in YTO page
	When Teacher navigates to Review Your Cart page
	Then the item quantiy is decreased by 1 in Review Your Cart page
	
Examples:
  | UsingData      		|
  | BTS:YTO:Teacher_Login_5 |
  
  
  
@YTO
@Priority1
Scenario Outline:Teacher has the ability to click + to add items to cart on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	When teacher clicks on '+' in YTO page
	Then the item quantity is increased by 1 in YTO page
	When Teacher navigates to Review Your Cart page
	Then the item quantiy is increased by 1 in Review Your Cart page
	
Examples:
  | UsingData      		|
  | BTS:YTO:Teacher_Login_6 |  
  
  
  
@YTO
@Priority1
Scenario Outline:Teacher can save the student name by entering name and clicking Enter:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher enters the student name and hits ENTER
	Then entered name is displayed in Student name field
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_7 | 
  
  
########################### Priority 3 #############################

@YTO
@Priority3
Scenario Outline:Teacher can get back to the same flyer and month which she was shopping on when clicks on browser back:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on any item title
	And Teacher clicks on See Full details link
	And Teacher clicks on browser back from PDP page
	Then Teacher lands on YTO on same flyer and month where she came from
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_8 |  
  
  
@YTO
@Priority3
Scenario Outline:Teacher can get back to same flyer and month which she was shopping for when she comes back from search results page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher searches for any term
	And Teacher clicks navigates back to YTO
	Then Teacher lands on YTO on same flyer and month where she came from
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_9 |
    

    
@YTO
@Priority3
Scenario Outline:Teacher should land on default flyer on YTO when selects a specific flyer and month and logout and login:[<UsingData>]
  
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on Logout
	And teacher logs into the application by providing [UserInformation]
	When Teacher navigates to YTO
	Then Teacher lands on YTO on default flyer current month
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_10 | 
  

  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    SAVED CART PAGE    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################       
  
  
@SavedCart
@Priority1
Scenario Outline:Items grouped by Student club when teacher saves cart for later with more than one Student Club same month:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	And teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then items are grouped by Student Club Youngest Club to Oldest Club in SavedCart page
	
Examples:
  | UsingData                                		 		|
  | BTS:SavedCart:TeacherOrder_DifferentStudentClub_Samemonth 	|	
  
    
@SavedCart
@Priority1
Scenario Outline:Items grouped by teacher club when teacher saves cart for later with more than one teacher club:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then items are grouped by teacher Club in SavedCart page
	
Examples:
  | UsingData                                		|
  | BTS:SavedCart:TeacherOrder_DifferentTeacherClub 	|    
  
  
@SavedCart
@Priority1
Scenario Outline:Subtotals, Qty and totals displayed correctly when teacher saves cart for later with Student Club:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs different month
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then Student Club total is calculated correctly in Saved Cart page
	
Examples:
  | UsingData                         							|
  | BTS:SavedCart:TeacherOrder_DifferentStudentClub_differentmonth 	| 
  
  
 
@SavedCart
@Priority1
Scenario Outline:Subtotals, Qty and totals displayed correctly when teacher saves cart for later with teacher Club:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	Then Teacher Catalogues total is calculated correctly in Saved Cart page
	
Examples:
  | UsingData                         				|
  | BTS:SavedCart:TeacherOrder_DifferentTeacherClub_2 	| 
  
  
@SavedCart
@Priority1
Scenario Outline:Teacher clicks on No on delete confirmation modal for saved cart:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	When Teacher clicks on Delete and NO
	Then Teacher is still on saved cart and it is not deleted
	
Examples:
  | UsingData                         						|
  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub 	|
  
  
@SavedCart
@Priority1
@Maintenance
Scenario Outline:Teacher can restore cart:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the Manage saved cart
	And Teacher restore the Saved cart
	When Teacher selects the Manage saved cart
	Then saved cart is not shown in the Saved cart list
	
Examples:
  | UsingData                         			|
  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_2 |
  
  
@SavedCart
@Priority1
Scenario Outline:Teacher can view saved cart from Manage saved carts page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the Manage saved cart
	When Teacher clicks on View
	Then selected saved cart page displays
	
Examples:
  | UsingData                         			|
  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_3 | 
  
  
@SavedCart
@Priority1
Scenario Outline:Teacher can delete a saved cart from Manage saved carts page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the Manage saved cart
	When Teacher clicks on Delete and YES
	Then saved cart is not shown in the Saved cart list
	
Examples:
  | UsingData                         			|
  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_4 | 
  
  
  
@SavedCart
@Priority2
Scenario Outline:Teacher clicks on Close on delete confirmation modal of saved cart:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	And Teacher deletes the Saved cart
	Then Teacher is still on saved cart
	
Examples:
  | UsingData                         							|
  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_5 	|  
  
          
@SavedCart
@Priority2
Scenario Outline:Teacher can return to manage saved carts from a saved cart page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When Teacher do the empty saved cart
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	And Teacher clicks on Save Cart for Later button
	And Teacher saves the cart
	When Teacher selects the saved cart
	When Teacher clicks on 'Return to Manage Saved Carts'
	Then Manage Your Saved carts page displays with list of all saved carts
	
Examples:
  | UsingData                         							|
  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_6 	| 
    
  
  
  
  
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
Scenario Outline:Teacher receives Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier1:[<UsingData>]
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Flat
And teacher navigates to coupons & Rewards page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher submit the order
And teacher sees the Bonus Flat description in Submitted page

Examples: 
|UsingData										|
|Golden:teacher_with_soo_and_Manual_Flat_Bonus	|

@Golden
@Example
@BonusFlat
@Priority1
@Maintenance
Scenario Outline:Teacher receives Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier2:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Flat
And teacher navigates to coupons & Rewards page
Then teacher sees the Bonus Flat description in Rewards section
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus Flat description in Confirm & Submit page
And teacher submit the order
And teacher sees the Bonus Flat description in Submitted page

Examples: 
|UsingData									|
|Golden:Teacher_gets_AutoBonusFlat_tier2	|
  
 
#@Golden
#@Example
#@BonusFlat  
#@Priority1
#@Maintenance
#Scenario Outline:Teacher receives Bonus Flat dollars with qualifying amount on Student Club orders and checkout for tier3:[<UsingData>]
#
#Given teacher login into the application by providing [UserInformation]
#And teacher selects “enter classroom order” from home page 
#When teacher adds [ItemInformation] eligible amount for Bonus Flat
#And teacher navigates to coupons & Rewards page
#Then teacher sees the Bonus Flat description in Rewards section
#And teacher navigates to Confirm & Submit page
#And teacher sees the Bonus Flat description in Confirm & Submit page
#And teacher submit the order
#And teacher sees the Bonus Flat description in Submitted page
#
#Examples: 
#|UsingData									|
#|Golden:Teacher_gets_AutoBonusFlat_tier3	|


@Golden
@BonusFlat
@Priority1
Scenario Outline:Teacher does not get Bonus Flat Dollars on a cart which does not meet minimum amount:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Flat
And teacher navigates to coupons & Rewards page
Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_does_not_see_Bonus_Flat_1	|


@Golden
@BonusFlat
@Priority1
Scenario Outline:Teacher does not get Bonus Flat Dollars if the cart total qualifying for promotion includes Redemptions:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds [ItemInformation] eligible amount for Bonus Flat
And teacher navigates to coupons & Rewards page
When teacher enters amount in [student Bonus Bank] such that cart total is now below [minimum amount]
And teacher clicks on Apply in Students section
Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_does_not_see_Bonus_Flat_2	|


@Golden
@BonusFlat
@Maintenance
@Priority1
Scenario Outline:Bonus Flat Dollars not added to Bonus Bank when teachers cart has Teachers club order only:[<UsingData>]

Given teacher login into the application by providing [UserInformation] 
When teacher adds teacher club items to cart with minimum amount for bonus flat
And teacher navigates to coupons & Rewards page
Then teacher does not see the Bonus Flat message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_does_not_see_Bonus_Flat_3	|



@BonusFlat
@Priority2
Scenario Outline:Bonus Flat Dollars are removed from Bonus Bank when teacher removes items from cart making cart non-qualifying:[<UsingData>]
	
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
  | BTS:BonusFlat:Teacher_gets_AutoBonusFlat |	
  
  
@BonusFlat
@Priority2
Scenario Outline:Teacher receieves Bonus Flat promotion if top-off from DTS makes cart qualify for Bonus Flat promotion:[<UsingData>]
	
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
	Then teacher receives Flat Bonus dollars
	
Examples:
  | UsingData                               |
  | BTS:BonusFlat:TeacherOrder_AutoBonusFlat_2 	|  
  
    
@BonusFlat
@Priority2
Scenario Outline:Teacher is notified with the next tier of promotions when teacher qualifies for Bonus Flat promotion:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to get the upseller message for BonusFlat first tier
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher sees the upsell message with dollars gained from current cart total
	And teacher is notified of dollar amount that teacher would receive if teacher adds items to cart meeting next tier
	
Examples:
  | UsingData                       |
  | BTS:BonusFlat:Teacher_UpsellMessage | 
    



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
Scenario Outline:Predetermined percentage of Bonus Coupon Rewards dollars automatically added to my Bonus Bank based on a tiered percentage on Student Club order:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Percentage
And teacher navigates to coupons & Rewards page
Then teacher see the Bonus percentage description in Rewards section with correct calculated dollars
And teacher navigates to Confirm & Submit page
And teacher sees the Bonus percentage description in Confirm Submit page
And teacher submit the order
And teacher sees the Bonus percentage description in Confirmation page

Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_1	|


@Golden
@BonusPercentage
@Maintenance
@Priority1
Scenario Outline:Teacher does not receive Bonus coupon Reward dollars on cart with Teacher Club items only:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds teacher club items to cart with minimum amount for bonus percentage
And teacher navigates to coupons & Rewards page
Then teacher does not see the Bonus Percentage message in Rewards section

Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_2	|
    
    
@Golden
@BonusPercentage
@Maintenance
@Priority1
Scenario Outline:Teacher can view the Bonus percentage reward information in rewards section on different checkout pages, email, Order Detail:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds [ItemInformation] eligible amount for Bonus Percentage
And teacher navigates to coupons & Rewards page
Then teacher see the Bonus percentage description in Rewards section with correct calculated dollars
And teacher navigates to Confirm & Submit page
And teacher see the Bonus percentage description in confirm submit page with correct calculated dollars
And teacher clicks on Submit Order
And teacher see the Bonus percentage description in confirmation page with correct calculated dollars


Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_3	|   


@Golden
@BonusPercentage
@Maintenance
@Priority1
@deferred
Scenario Outline:Teacher can view the Bonus percentage coupon information displayed on all checkout pages, email, Order Detail:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher adds teacher club items to cart with minimum amount for bonus percentage
And teacher navigates to coupons & Rewards page
When teacher applies [Bonus percentage coupon]
Then teacher sees the Bonus percentage description in coupons section
And teacher navigate to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher sees the Bonus percentage description in Confirm Submit page
And teacher navigates to Submitted page
And teacher sees the Bonus percentage description in Confirmation page


Examples: 
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_4	| 


@Golden
@BonusPercentage
@Priority1
@Maintenance
@SCSCOD-4093
Scenario Outline:Teacher cannot apply an expired coupon on any cart:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And Teacher adds items from different Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher applies [expired coupon]
Then teacher receives “This coupon code is not currently active. Please check the coupon for details.” error message for Bonus Percentage

Examples:
|UsingData								|
|Golden:teacher_Bonus_Percentage_Desc_5	|


@BonusPercentage
@Priority1
Scenario Outline:Teacher does not receive Bonus percentage rewards on a cart which does not meet minimum amount:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds student club items to cart which is less than required [minimum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher does not recieve Bonus percentage dollars
	And teacher does not see the Bonus percentage description in Rewards section
	
Examples:
  | UsingData                                		 |
  | BTS:BonusPercentage:Teacher_AutoBonusPercentage 	|	
  

@BonusPercentage
@Priority1
Scenario Outline:Teacher should not be able to apply Bonus Percentage coupon that is already redeemed:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to meet the [minimum amount] for first tier
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher applies the [redeemed coupon]
	Then Teacher sees error message
	
Examples:
  | UsingData                                		 	|
  | BTS:BonusPercentage:Teacher_entered_redeemedcouponcode 	|
  


@BonusPercentage
@Priority2
Scenario Outline:Teacher adding more items to cart making cart qualify for next tiered Bonus Percentage:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to meet the [minimum amount] for first tier
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from first tier
	When teacher adds more items to cart qualifying for next tier
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from second tier
	And teacher sees description from second tier and calculations based on second tier in Rewards section
	
Examples:
  | UsingData                                		 		|
  | BTS:BonusPercentage:Teacher_AutoBonusPercentage_tierShift 	|  
  
  
@BonusPercentage
@Priority2
Scenario Outline:Teacher removing items from cart leads to previous tiered percentage:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to meet the [minimum amount] for second tier
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from second tier
	When teacher deletes the items from cart qualifying for first tier
	And Teacher navigates to rewards & coupons page
	Then teacher recieves percentage*carttotal/100 dollars from first tier
	And teacher sees description from first tier and calculations based on first tier in Rewards section
	
Examples:
  | UsingData                                		 			|
  | BTS:BonusPercentage:Teacher_AutoBonusPercentage_tiershift_2 	|  
  
    
@BonusPercentage
@Priority2
Scenario Outline:Teacher receives Bonus percentage promotion if top-off from DTS makes cart qualify for Bonus percentage promotion:[<UsingData>]
	
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
	Then teacher recieves Bonus percent Dollars
	
Examples:
  | UsingData                                		|
  | BTS:BonusPercentage:TeacherOrder_AutoBonusPercent 	|  
  
  
  
@BonusPercentage
@Priority2
Scenario Outline:Bonus percentage coupon removed when teacher removes items making cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to meet the [minimum amount] for first tier
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher applies the [Bonus percentage coupon]
	Then teacher recieves percentage*carttotal/100 dollars from first tier_2
	When teacher deletes the Free item coupon
	Then teacher does not see the Bonus percentage dollars received earlier
	
Examples:
  | UsingData                                			|
  | BTS:BonusPercentage:Teacher_apply_Bonuspercentagecoupon |  
  
  
@BonusPercentage
@Priority2
Scenario Outline:Teacher is notified with the next tier of promotions when teacher qualifies for Bonus percentage:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart to get the upseller message for second tier
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher sees the upsell message with dollars gained from current cart total
	And teacher is notified of dollar amount that teacher would receive if teacher adds items to cart meeting next tier
	
Examples:
  | UsingData                             |
  | BTS:BonusPercentage:Teacher_UpsellMessage |
  
  
  
  
@BonusPercentage  
@Priority3
Scenario Outline:Teacher can apply Bonus percentage coupon if top-off from DTS makes cart qualify for Bonus percentage coupon:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher adds student club items to cart with [minumum amount] for Dollars to Spend promotion
And teacher navigates to coupons & Rewards page
And teacher views Dollars to Spend promotion
And teacher clicks on Make Selection button
And teacher selects an item such that the top-off amount makes cart meet the [Bonus percentage coupon]
And teacher clicks on Confirm Selection button
When teacher applies [Bonus percentage coupon]
Then teacher sees the Bonus percentage description in coupons section


Examples: 
|UsingData|
|BTS:Teacher_BonusPercentage_DTSTopOffAmt_ManualCoupon|  
  
    

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
@Priority1
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
@DollarstoSpend	
@Maintenance
@Priority1
Scenario Outline:Teacher does not receive Dollars to Spend promotion if the cart total qualifying for promotion includes Redemptions:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student club items to cart less than the [Manual shipping threshold]
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
@Priority1
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
@Priority1
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
	And teacher select an item such that there is a top-off
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
@Priority1
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
@Priority1
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
  | BTS:DollarsToSpend:Teacher_gets_DTS_with_minimum_amount |	
  

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
  | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount 	|
  
  
  
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
  | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_MultiItems_Checkout 	|  
  
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged GST & PST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                				|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_GST_PST_Province_BC 	|  
  
    
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged GST & QST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                				|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_GST_QST_Province_QC 	| 
  		
	
	
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NL 	|   
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NB 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NS 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-ON:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_ON 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-PE:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_PE 	|       
      
      
      
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_AB 	|     
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NT 	|
 
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NU:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NU 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-YT:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_YT 	|        
        
 
 
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-BC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_BC 	|  

  

@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-QC:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_QC	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-NL:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NL 	|

  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-AB:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                			|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_AB_2 	| 
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is not charged taxes on top-off amount for tax exempted schools when multiple items are selected from Dollars to Spend modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	And teacher selects the multiple items from same grade in Make Selection window2
	And teacher clicks on Confirm Selection button
	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                									|
  | Golden:DollarsToSpend:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB 	|    
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher is not charged taxes on top-off amount for tax exempted schools when one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window2
	And teacher clicks on Confirm Selection button
	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData                                									|
  | BTS:DollarsToSpend:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB_2 	|   
  
  
## (commented by soma)  this is invalid
#@DollarsToSpend
#@Priority1
#Scenario Outline:Teacher is not charged taxes on top-off amount if the only item selected from Dollars to spend modal is tax exempted:[<UsingData>]
#	
#	Given teacher logs into the application by providing [UserInformation]
#	When teacher selects [enter classroom order] from home page
#	And teacher adds student club items to the cart with [minumum amount]
#	And Teacher navigates to Review Your Cart page
#	When Teacher navigates to rewards & coupons page
#	And teacher sees the Dollars to spend promotion2
#	And teacher clicks on Make Selection button
#	And teacher selects a grade
#	When teacher selects an item from Make Selection window2
#	And teacher clicks on Confirm Selection button
#	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total
#	
#Examples:
#  | UsingData                                				|
#  | BTS:DollarsToSpend:TeacherOrder_TopOff_Item_TaxExempted 	|  
  
  
@DollarsToSpend
@Priority1
@Maintenance
@SCSCOD-3537
Scenario Outline:Teacher can redeem Dollars to Spend once per level per customer:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
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
  | Golden:DollarsToSpend:Teacher_DTS_with_minimum_amount_2 	|     
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Teacher can redeem Dollars to Spend on second tier if teacher already redeemed on first tier:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [tier1 minimum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
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
  | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_3 	|       
  
  
@DollarsToSpend
@Priority1
@Maintenance
Scenario Outline:Message to explain teacher about the top-off amount being added to Student club total:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion2
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
  | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_4 	| 
  
  
@DollarsToSpend
@Sprint18
@Priority2
@NotDeveloped 
Scenario Outline:Teacher is mandated to redeem dollars to spend promotion:[<UsingData>]
	
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And teacher views Dollars to Spend promotion
When teacher click on Continue Checkout without making selections from Dollars to Spend promotion
Then page refreshes and error message “To proceed with checkout, please select at least one item to redeem your Dollars To Spend.” displays
Examples:
  | UsingData                       |
  | Teacher_DTS_with_minimum_amount_Skip |    
        
  
              
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
@Sat20
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
	And teacher selects an item from the resultsteacher clicks on grade level dropdown and select a grade from dropdown
	And teacher clicks on Confirm Selection button
	When teacher proceeds to checkout from rewards and coupons page
	Then Free pick is displayed in coupons section with correct details in Confirm & Submit page
	And teacher submit the order
	And Free pick is displayed in coupons section with correct details in Confirmation page
	
	
	Examples: 
	|UsingData|
	|TeacherOrder_FreePickCoupon_Checkout|
	
	
	
	
	
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
#Then item selections are saved
	
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
  
    	
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            QA STUDENT INCENTIVE SCENARIOS              ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################
	
	
@Golden	
@SCSCOD-3462
@qastudentincentive
@Priority1
Scenario Outline:Teacher enters 50 students in QA Student incentive and checkout:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
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
@Priority1   
Scenario Outline:Teacher enters 49 students in QA Student incentive and checkout:[<UsingData>]
		
	Given teacher logs into the application by providing [UserInformation]
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
@Priority1	    
Scenario Outline:Teacher enters 12 students in QA Student incentive and checkout:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
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
@Priority1
Scenario Outline:Teacher should not receive QA Student incentive promotion on cart with Teacher catalogs:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When teacher add “teacher club items” to cart from YTO page 
	And teacher navigates to coupons & Rewards page
	Then teacher should not see Q & A Student incentive line
	
	
	Examples:
	    |UsingData|	    
	    |Golden:teacher_login_TeacherCatalogueItems_QAStudentIncentive|
	    
	    
	    
	    
@qastudentincentive	    
@SCSCOD-3462
@Priority3		
Scenario Outline:Teacher enters 0 and then edits to a non-zero number in no. of students:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher adds “ItemInformation” from YTO page 
	And teacher navigates to coupons & Rewards page
	When teacher views Q & A Student incentive with no. of students
	And teacher enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	And teacher navigates back to coupons & Rewards page from confirm & submit page
	And teacher re-enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	Then teacher sees updated Q & A student incentive information in rewards section on Confirm & Submit page
	And teacher submit the order
	And teacher sees updated Q & A student incentive information in rewards section on Confirmation page
	
	
	Examples:
	    |UsingData|
	    |teacher_login_Item_enterstudents_0_enterstudents_14|
	    
	    
	    
@qastudentincentive	    
@SCSCOD-3463
@Priority3
Scenario Outline:Teacher enters non-Zero number and then edits the no. of Students to 0:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher adds “ItemInformation” from YTO page 
	And teacher navigates to coupons & Rewards page
	When teacher views Q & A Student incentive with no. of students
	And teacher enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	And teacher navigates back to coupons & Rewards page from confirm & submit page
	And teacher re-enters number of students in text field
	And teacher proceeds checkout from rewards and coupons page
	Then Teacher does not see Q & A student incentive information in rewards section on Confirm & Submit page
	And teacher submit the order
	Then Teacher does not see Q & A student incentive information in rewards section on Confirmation page
	
	
	Examples:
	    |UsingData|	    
	    |teacher_login_Item_enterstudents_14_enterstudents_0|
		
		
		
@qastudentincentive	    
@SCSCOD-3468
@Priority2
Scenario Outline:Teacher cannot enter no. of students greater than 50 or negative value:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher adds “ItemInformation” from YTO page
	When Teacher navigates to rewards & coupons page
	When teacher views Q & A Student incentive with no. of students
	And teacher enters number of students in text field
	And teacher tries to checkout from rewards and coupons page
	Then teacher sees appropriate error message for maximum input
	And teacher re-enters number of students in error text field
	#And teacher sees appropriate error message for negative input
	And teacher sees Q & A Student incentive field should not take negative value
	
	
	Examples:
	    |UsingData|	    
	    |teacher_login_Item_enterstudents_51_enterstudents_-1|
		
		
@qastudentincentive
@Priority2
Scenario Outline:Teacher is forced to enter a number in no. of students:[<UsingData>]
		
		
	Given teacher logs into the application by providing [UserInformation]
	And teacher adds “ItemInformation” from YTO page 
	And teacher navigates to coupons & Rewards page
	When teacher views Q & A Student incentive with no. of students
	And teacher does not enter any data in no of students
	And teacher tries to checkout from rewards and coupons page
	Then teacher sees appropriate error message for empty input
	
	
	Examples:
	    |UsingData|	    
	    |teacher_login_Item_NotEnter_QAStudentIncentive|
	    
	    
	    
	    
	    
	    
################################			PRIORITY 2 SCENARIOS			#######################################################################


@qastudentincentive
@Priority2
Scenario Outline:Teacher should not receive Q&A Student incentive promotion when teacher deletes items from Student club:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add items from different Student and Teacher clubs
And teacher navigates to coupons & Rewards page
And teacher views Q & A Student incentive with no. of students
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher deletes all items from Students clubs
And teacher navigates to coupons & Rewards page
Then teacher should not see Q & A Student incentive line

Examples: 
|UsingData|
|BTS:teacher_login_StudentAndCatalogueItems_QAStudentIncentive|    
	    
	    

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

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
When teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
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

Given teacher login into the application by providing [UserInformation]
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

Given teacher login into the application by providing [UserInformation]
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
When teacher navigates to coupons & Rewards page
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




  
#################################################################################################################################
#################################################################################################################################
#########################################                                      #################################################  
#########################################		STACKABLE COUPONS              ##################################################
##################################################################################################################################
##################################################################################################################################		
	
@Golden
@StackableCoupons
@Priority1
Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied non-stackable coupon:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And teacher applies [stackable coupon]
When teacher tries to apply [Non-Stackable coupon]
Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
Examples:
  | UsingData                               |
  | Golden:Teacher_StackableandNonstackableCoupons |
  
  
  
  
@StackableCoupons
@Priority1
Scenario Outline:Teacher trying to apply a non-stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And teacher applies [Non-Stackable coupon]
When teacher tries to apply [stackable coupon]
Then error message "The coupon code you are trying to apply cannot be combined with any other coupons. To use this coupon code, please remove the other coupon(s) you have already applied and try again." display
Examples:
  | UsingData                               |
  | BTS:Teacher_NonstackableandStackableCoupons |
  
  
  
@StackableCoupons
@Priority1  
Scenario Outline:Teacher trying to apply a non-stackable coupon to a basket with a previously applied non-stackable coupon:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And teacher applies [Non-Stackable coupon]
When teacher tries to apply another [non-stackable coupon]
Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
Examples:
  | UsingData                               |
  | BTS:Teacher_NonstackableandNonStackableCoupons |
  
  
  
  
@Golden
@StackableCoupons
@Priority1
Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
When teacher applies [stackable coupon]
Then teacher should be able to apply another [stackable coupon] successfully
Examples:
  | UsingData                               |
  | Golden:Teacher_stackableandStackableCoupons |
  
  
  
  
  
  
  
  
#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            SEARCH SCENARIOS                            ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################

  
 @Search	    
@Sprint18
@Priority2
Scenario Outline:Teacher can view all search results when there are more than 15 results for a given search term:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query in the search field which has more than 15 results
When search results are presented with results set greater than the default 15 items and View All link
And teacher clicks on View All link
Then all the search results displays as teacher scrolls through the page

Examples:
  | UsingData                                |
  | Search_ViewAll                           |
  
  
  
@Search 
@Sprint18
@Priority3
Scenario Outline:Teacher does not see View All link when search results are less than 15:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query with less than 15 results
When search results are presented with results set less than the default 15 items
Then View All link does not display

Examples:
  | UsingData                                |
  | Search_WithLessProductsViewAll                          | 
  
  
#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            TEACHER DESK SCENARIOS                      ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################  
  
@ProductionIssue  
@TeacherDesk
@Priority1
@Sprint18  
Scenario Outline:Teacher can view her name, school and grade info on teacher's desk:[<UsingData>]
	
Given teacher login into the application by providing [UserInformation]
When teacher clicks on Teacher's desk
Then correct teacher name, school and grade displays
Examples:
  | UsingData   |
  | Teacher_Info_TeacherDesk|   
    		
		
@TeacherDesk
@Priority2
Scenario Outline:Teacher views hold status T message on Teachers Desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [Teacher's Desk] from home page
	Then hold status message "There is a problem with your account. Your new and pending orders are on hold and will not ship. Please contact Customer Service at 1-800-268-3860 or custserve@scholastic.ca to resolve the issue." displays
	
Examples:
  | UsingData                               	|
  | BTS:TeacherDesk:Teacher_Login_HoldStatus_T 	|	
  
  
@TeacherDesk
@Priority2
Scenario Outline:Teacher views hold status H message on Teachers Desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [Teacher's Desk] from home page
	Then hold status message "There is a problem with your account. Your new and pending orders are on hold and will not ship. Please contact Customer Service at 1-800-268-3860 or custserve@scholastic.ca to resolve the issue." displays
	
Examples:
  | UsingData                               	|	
  | BTS:TeacherDesk:Teacher_Login_HoldStatus_H 	|  	
  
  
  
@TeacherDesk
@Priority2
Scenario Outline:Teacher views hold status 'P' message on Teacher desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [Teacher's Desk] from home page
	Then hold status message "Your order(s) will ship once payment is confirmed. If you pay by cheque, order(s) will ship once cheques are received." is displays
	
Examples:
  | UsingData                               	|
  | BTS:TeacherDesk:Teacher_Login_HoldStatus_P 	|	
  
    
@TeacherDesk
@Priority2
Scenario Outline:Teacher clicks on Envelope to view the account status message on teacher's desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on Envelope on Home page
	Then teacher lands on teacher's desk with alert message
	
Examples:
  | UsingData                               		|
  | BTS:TeacherDesk:Teacher_Login_HoldStatus_P2 	|	
  
  	
#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            MY ACCOUNT SCENARIOS                            ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################


@MyAccount
@Priority3
Scenario Outline:Teacher clicks on My Account link to navigate to My Reading club account page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account link
	Then teacher navigates to My Reading Club account page
	
Examples:
  | UsingData               |
  | BTS:MyAccount:Teacher_Login |
  
  
  

	
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    INSRPINT_11.2                #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    MARKETING LINKS              #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
    
 
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the PDP page when clicked on a PDP Marketing link:[<UsingData>]

Given teacher navigates to PDP Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on PDP of the item the teacher clicked through
Examples: 
  |UsingData                                   |
  |dev35:TeacherOrder_Marketing_URL_PDPPage    |
  
  
  
#@Story-4099     
#@MarketingLinks
#@Priority1
#Scenario Outline:As a teacher, I want to be taken to the PDP page when the BTS modal is not completed and clicked on a PDP Marketing link:[<UsingData>]
#
#Given teacher navigates to PDP Marketing link
#And teacher logs into the application by providing [UserInformation]
#And BTS modal displays
#When teacher completes the missing information on BTS modal
#Then teacher lands on PDP of the item the teacher clicked through
#Examples: 
#  |UsingData                                   |
#  |dev35:TeacherOrder_Marketing_URL_BTS        |
  
  

@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the PDP page through Marketing when incorrect credentials are entered on first attempt and login succesful on second attempt:[<UsingData>]

Given teacher navigates to PDP Marketing link
And teacher logs into the application by providing [Incorrect UserInformation]
When teacher logs into the application by providing [UserInformation]
Then teacher lands on PDP of the item the teacher clicked through
Examples: 
  |UsingData                                   |
  |dev35:TeacherOrder_Marketing_URL_Relogin    |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the Category page when clicked on a Category Marketing link:[<UsingData>]

Given teacher navigates to Category Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on Category page the teacher clicked through
Examples: 
  |UsingData                                   |
  |dev35:TeacherOrder_CategoryMarketing_Link   |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the Content page when clicked on a Content Marketing link:[<UsingData>]

Given teacher navigates to Content Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on Content page the teacher clicked through
Examples: 
  |UsingData                                  |
  |dev35:TeacherOrder_ContentMarketing_Link   |
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   MY ACCOUNT ORDER CONFIRMATION PAGE     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
    
  
  
@Submitted 
@Priority1 
@MyAccount
Scenario Outline: As a Teacher, I would like to have the ability to see My Account dropdown and it should be clickable:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page
And MyAccount dropdown displays on the header
When clicks on Profile from My Account dropdown
Then teacher should land on MyAccount page anchored to the profile displayed with correct teacher profile


Examples:
  |UsingData                                       |
  | dev35:TeacherOrder_OrderConfirmation_MyAccount |
  
  
  
@Submitted 
@Priority1 
@MyAccount
Scenario Outline: As a Teacher, I would like to have the ability to view my profile information from Order confirmation page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And clicks on Profile from My Account dropdown
And teacher reads details and navigate back to home page
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page
When clicks on Profile from My Account dropdown
Then teacher should land on MyAccount page anchored to the profile displayed with correct teacher profile    
 
Examples:
      |UsingData                                       |
      |dev35:TeacherOrder_OrderConfirmation_MyAccount_Profile |
      
      
@Submitted 
@Priority1 
@MyAccount     
Scenario Outline: As a Teacher, I would like to have the ability to logout from Order confirmation page:[<UsingData>]
  
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page
And MyAccount dropdown displays on the header
When teacher clicks logout option from My Account dropdown
Then teacher should land on Login page
      
   
Examples:
|UsingData                                        |
| dev35:TeacherOrder_MyAccount_Confirmation_Logout|



@Submitted 
@Priority1 
@MyAccount
Scenario Outline:As a Teacher, I would like to have the ability to navigate to Billing & Payments from Order Confirmation page to view my credit card info:[<UsingData>]
  
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And Teacher selects new credit card as payment with "save card to wallet" option checked
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page
When teacher clicks on Billing & Payment from My Account dropdown
Then teacher should land on My Account page anchored to Billing & Payments section with saved card info that is added
      
   
  Examples:
  |UsingData                        |
  | dev35:TeacherOrder_MyAccount_MyProfile_Confirmationpage|
  
  
@Submitted  
Scenario Outline:As a Teacher, I would like to have the ability to view order history from Order Confirmation page:[<UsingData>]
  
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page
When teacher clicks on Order History from My Account dropdown
Then teacher should land on My Account page anchored to Order History with this specific order information displayed (order number and amount due)      
   
  Examples:
  |UsingData                        |
  |dev35:TeacherOrder_MyAccount_OrderHistory_Confirmationpage|      
  
 
  



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   STORY 3699 - ITEM LABEL                #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

 
 
@ReviewCart-LineItemLabel
@Priority3 
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher catalogues total in all checkout pages:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
When Teacher navigates to Review Your Cart page
Then line time label for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher navigates to confirm and submit page from Review cart page
And line time label in Confirm and Submit page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher clicks on Submit Order
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   
  
  Examples:
  |UsingData                        |
  |dev35:TeacherOrder_StudentTeacherClubs_Label_Checkout|  
    
    
@ReviewCart-LineItemLabel
@Priority3     
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher club total in order history:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
And teacher clicks on Submit Order
When teacher navigates to my account page and click on view order under order history
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   

  
  Examples:
  |UsingData                        |
  |dev35:TeacherOrder_StudentTeacherClubs_Label_OrderHistory|
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3342 CONFIRMATION PAGE UI     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
      

@Story3342
@Submitted
@Priority3
Scenario Outline: As a teacher, when I submit the order, the order confirmation page should be clear with respect to UI:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
When teacher clicks on Submit Order
And teacher lands on confirm & submit page
Then teacher should see home icon
And should not see Checkout label in the red bar
And should not see checkout phases


Examples:
  |UsingData                                |
  |dev35:Sprint11.2:OrderConfirmationPage_UI|
  
@Story3342  
@Submitted
@Priority3  
Scenario Outline:As a teacher, when I click on home icon in order confirmation page, it should navigate to home page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
When teacher clicks on Submit Order
And teacher lands on confirm & submit page
When teacher clicks on home icon present on the top
Then teacher should be navigated back to home page

  
  Examples:
  |UsingData                                      |
  |dev35:Sprint11.2:OrderConfirmationPage_HomeIcon|
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3701 REWARDS SECTION MESSAGE  #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
   
  
@Story-3701  
@RewardsAndCoupons
@Priority3    
Scenario Outline:As a teacher, I should see proper wording in rewards section in all the order checkout pages:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
When Teacher navigates to rewards & coupons page
Then “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section
And “How is my Qualifying Order Value calculated” displays in Rewards section
And “Your Qualifying Order Value” should contain in Rewards section
And teacher proceeds checkout from rewards and coupons page
And “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section
And teacher submit the order
And “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section

  
  Examples:
  |UsingData                                       |
  |dev35:Sprint11.2:RewardsSection_Message_Checkout|
  
  
@Story-3701  
@RewardsAndCoupons
@Priority3   
Scenario Outline:As a teacher, I should see proper wording in rewards section in order history:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher proceeds checkout from rewards and coupons page
And teacher submit the order
When teacher navigates to my account page and click on view order under order history
And “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section

  
  Examples:
  |UsingData                                           |
  |dev35:Sprint11.2:RewardsSection_Message_OrderHistory|   
  
  ##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3919 SEARCH RESULTS           #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
  
@Search 
Scenario Outline:Teacher should get user friendly page when searched anything which generates zero matches:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query for a product that does not match any items in the database
When search results are displayed [UserInformation]
Then the search result page displays Sorry no results page is displayed

Examples:
  | UsingData                                |
  | dev35:Search_NoResult                           |
    
@Search 
  Scenario Outline: Teacher should get user friendly page when searched anything which generated zero matches in already searched page:[<UsingData>]
 
  Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query in the search field which has more than 15 results
  When search results are presented with results set greater than the default 15 items and View All link
  And teacher have entered search query for a product that does not match any items in the database
  When search results are displayed [UserInformation]
  Then the search result page displays Sorry no results page is displayed
  
  Examples:
  | UsingData                                |
  | dev35:Search_NoResult_fromSearchResultPage                        |
  
  
@Search  
  Scenario Outline: Teacher, when searched with valid keyword in second search field should navigate to search result page:[<UsingData>]
 
 Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query for a product that does not match any items in the database
 When search results are displayed [UserInformation]
 Then the search result page displays Sorry no results page is displayed
 And Teacher have entered search query in the search field which return search result
 Then Search result page should display the searched item
 
 Examples:
  | UsingData                                |
  | dev35:Search_NoResult_AgainSearchPage    |
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 2858 TOOL TIP LOGIN PAGE      #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
    



@Story-2858    
@Loginpage
@Priority1
Scenario Outline:Teacher should see the tool tip when tring to login with password as blank:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher enters user name leaving password field blank and click on login button
Then “Please enter your password” tooltip should display

Examples: 
  |UsingData                                 |
  |dev35:TeacherLogin_Passwordblank_Error    |  
  
 
 
 
 
@Story-2858    
@Loginpage
@Priority1
Scenario Outline:Teacher should see the tool tip when tring to login with username as blank:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher enters password leaving user name field blank and click on login button
Then “Please enter your account number” tooltip should display

Examples: 
  |UsingData                                 |
  |dev35:TeacherLogin_UserNameblank_Error    |
  
  
  
@Story-2858    
@Loginpage
@Priority1
Scenario Outline:Teacher should see only one tool tip when tring to login with invalid username and password:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher logs into the application by providing incorrect username and password
Then Only single tool tip for Login Error should be displayed
And teacher clears the username and click on login button
And only “Please enter your account number” tooltip should display


Examples: 
  |UsingData                                          |
  |dev35:TeacherLogin_InvalidCredentials_UserNameBlank|  
  
  
  
   ##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    STORY 1880 Activation flow   #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   
  
@Homepage
  Scenario Outline: Teacher,should only be allowed to input Numeric VALID account numbers with 8 characters in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 And click on Next button
 Then Forgot Your Password Modal with Close button is dispalyed
 And teacher clicks Close to close the modal
 
 
 Examples:
  | UsingData                                |
  | dev35:validaccountNumber                      |
    
@Homepage
  Scenario Outline: Teacher,enters Invalid Numeric account numbers in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 And  click on Next button 
 Then Account Not found modal is displayed with Back Button
 And teacher clicks Back, which brings back the Activate Your Account Modal
 
 
 Examples:
  | UsingData                                |
  | dev35:invalidaccountNumber                      |
    
 
@Homepage
 Scenario Outline: Teacher,should not be allowed to input account number which is not numeric in the Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 Then Account number field is blank

  
 
 Examples:
  | UsingData                                |
  | dev35:invalidaccountNumber                      |
    

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    STORY 2856 -My Saved Cart    #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   


@SavedCart
Scenario Outline: Teacher updates the quantity of item in save card, updated quantity should be reflected :[<UsingData>]
 
Given teacher login into the application by providing [UserInformation]
When teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
When teacher clicks save cart, provides cart name and save
And quantity is updated and same reflects on cart

 Examples:
  | UsingData                           |
  | dev35:MySavedCart                   |  
    
  
  

  		