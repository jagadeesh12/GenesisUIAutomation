Feature: Submitted
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	# When Teacher adds items from different Student and Teacher clubs_2
	# And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	# When Teacher adds items from different Student and Teacher clubs_2
	# And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & PST-BC:[<UsingData>]
	
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
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & PST-QC:[<UsingData>]
	
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