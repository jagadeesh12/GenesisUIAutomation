Feature: RewardsAndCoupons
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################
##################################################################################################################################  
#########################################		                                ##################################################
#########################################		REWARDS AND COUPONS             ##################################################
#########################################		                                ##################################################
##################################################################################################################################
################################################################################################################################## 
  
  
  
   
  
@Golden

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



  @Priority1
  @SCSCOD-4594
  @RewardsAndCoupons
  Scenario Outline:Edit and Apply buttons should be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections in Redemptions & Rewards page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And Teacher adds items from Student and Teacher clubs less than [shipping threshold]
    When Teacher navigates to rewards & coupons page
    Then only Apply buttons should be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections
    And teacher enter bonus amount for Student Clubs and clicks Apply button
    And Edit button should be seen for Student Clubs
    And teacher enter bonus amount for Teacher Catalogues and clicks Apply button
    And Edit button should be seen for Teacher Catalogues
    And teacher enter bonus amount for Shipping & Handling section and clicks Apply button
    And Edit button should be seen for Shipping & Handling section

  Examples:
    | UsingData                                                |
    | InSprint_12.3:Dev35:Teacher_Redemptions_Edit_ApplyButtons|


  @Priority1
  @SCSCOD-4594
  @RewardsAndCoupons
  Scenario Outline:Skip button should not be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections in Redemptions & Rewards page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And Teacher adds items from Student and Teacher clubs less than [shipping threshold]
    When Teacher navigates to rewards & coupons page
    Then Skip button should not be seen for Student Clubs, Teacher Catalogues, and Shipping & Handling sections


  Examples:
    | UsingData                                                    |
    | InSprint_12.3:Dev35:Teacher_Redemptions_SkipButton_NotPresent|