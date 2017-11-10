Feature: ReviewCart
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
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club items for GST & PST against 'BC' Province in ReviewCart page:[<UsingData>]
	
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
