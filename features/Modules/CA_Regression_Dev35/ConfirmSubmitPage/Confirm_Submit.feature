Feature: ConfirmAndSubmit
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

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
	#When Teacher adds items from different Student and Teacher clubs_2
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	#And Teacher navigates to Review Your Cart page
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
	#When Teacher adds items from different Student and Teacher clubs_2
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	#And Teacher navigates to Review Your Cart page
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_NL | 
      
      
@Golden

@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NB' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_NB |        
      
      
      
@Golden

@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'NS' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_NS |
      
      
@Golden

@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'ON' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                        			|
  | Golden:Confirm_Submit:TeacherOrder_HST_Province_ON |       
                                                   
                                                   
                                                   
@Golden

@ConfirmAndSubmit
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST against 'PE' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    				|
  | Golden:Confirm_Submit:TeacherOrder_GST_Province_AB |        
      
      
      
@Golden

@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NT' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    					|
  | Confirm_Submit:TeacherOrder_GST_Province_NT_2 	|
      
      
@Golden

@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'NU' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    				|
  | Confirm_Submit:TeacherOrder_GST_Province_NU_2 |
           
           
           
@Golden

@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST against 'YT' Province in ConfirmSubmit Page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
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
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			    |
  | Golden:Confirm_Submit:TeacherOrder_TaxExempt_Province_BC |
      
      
      
@Golden

@ConfirmAndSubmit
@Priority1
@Maintenance

  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'AB' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			    |
  | Golden:Confirm_Submit:TeacherOrder_TaxExempt_Province_AB |
          
          
          
@Golden
@ConfirmAndSubmit
@Priority1
@Maintenance
  Scenario Outline: Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools against 'NL' Province in ConfirmSubmit Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	#When Teacher adds items from different Student and Teacher clubs_2
	#And Teacher navigates to Review Your Cart page
	And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			    |
  | Golden:Confirm_Submit:TeacherOrder_TaxExempt_Province_NL |
      
      

@Golden
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
	And Teacher navigates to Payments page
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
	And Teacher navigates to Payments page
	And teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly in ConfirmSubmit Page
	
Examples:
  | UsingData                    			  	 					|
  | Golden:Confirm_Submit:TeacherOrder_GST_Province_NU_2_2_0_0      |
      
      

@Golden
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
	And Teacher navigates to Payments page
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
#	When Teacher adds items from different Student and Teacher clubs_2
#	And Teacher navigates to Review Your Cart page
    And teacher add Teacher and Student club items to the cart equal to [Shipping Threshold]
	When Teacher navigates to rewards & coupons page
	When teacher proceeds to checkout from rewards and coupons page
	Then Main message – [Rewards Earned with Today’s Qualifying Order of] displays in rewards section
	And Sub message – Submit by [Last date of current calendar month] to receive [Insert calendar month] rewards displays in rewards section
	And teacher clicks on Submit Order
	Then sees the Main message and sub message as in confirm & submit page
	
Examples:
  | UsingData                                		 		|
  | BTS:Confirm_Submit:TeacherOrder_Province_TaxExemptedItem 	|    