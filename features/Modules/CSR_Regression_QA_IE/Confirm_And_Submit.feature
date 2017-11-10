@Module1Now
Feature: Confirm & Submit
	This feature is to validate the Confirm & Submit page scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@Confirm&Submit_PageHeader&CSR_Script
@DWCACSR-322
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Confirm and Submit header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Blue step script icon should be displayed next to [Confirm & Submit] header in a page
	
Examples:
  | UsingData 											|
  | QA_Blue_step_script_icon_displays_ConfirmSubmit_page	|		
  

@Confirm&Submit_PageHeader&CSR_Script
@DWCACSR-322
@Priority1
@2
Scenario Outline:Modal window displays with the title 'Confirm and Submit' when CSR clicks on Blue step script icon in C and S page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
    When CSR clicks on Blue step script icon in [Confirm & Submit] page
    Then the modal window should be displayed with the title 'Confirm & Submit:'
    And the close button 'X' should be displayed in the top right corner of the [Confirm & Submit:] modal window
	
Examples:
  | UsingData 												|
  | QA_Blue_step_script_icon_modalWindow_ConfirmSubmit_page	|		
  

@Confirm&Submit_PageHeader&CSR_Script
@DWCACSR-322
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Confirm and Submit page when CSR closes the modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
    And CSR clicks on Blue step script icon in [Confirm & Submit] page
    When CSR clicks on close button in [Confirm & Submit:] modal window
	Then CSR is presented with the [Confirm & Submit] page
	
Examples:
  | UsingData 															|
  | QA_Blue_step_script_icon_modalWindow_disappeared_Confirm_Submit_page	|
  

@Confirm&Submit_StepHeader
@DWCACSR-321
@Priority1
@1
Scenario Outline:Confirm and Submit tab highlights in the step indicator when CSR enters into the Confirm and Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
    When CSR clicks on [Continue Checkout] button in Payment page
    Then [Confirm and Submit] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               			|
  | QA_Confirm_and_Submit_tab_highlights	|		
  

@Confirm&Submit_StepHeader
@DWCACSR-321
@Priority1
@2
Scenario Outline:Number of the CONFIRM and SUBMIT page displays correctly in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
    When CSR clicks on [Continue Checkout] button in Payment page
	Then the step header number for the [Confirm and Submit] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  				|
  | QA_Number_for_the_Confirm_and_Submit_tab	|	
  
  
@Confirm&Submit
@Priority1
@1
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 								|
  | QA_Confirm_Submit_GST_PST_Province_BC	|
  
  	
@Confirm&Submit
@Priority1
@2
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | QA_Confirm_Submit_GST_PST_Province_BC_2	|
  
   
@Confirm&Submit
@Priority1
@3
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
   And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 								|
  | QA_Confirm_Submit_GST_QST_Province_QC	|
  
  	
@Confirm&Submit
@Priority1
@4
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | QA_Confirm_Submit_GST_QST_Province_QC_2	|
  
   
@Confirm&Submit
@Priority1
@5
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | QA_Confirm_Submit_HST_Province_NL	|



@Confirm&Submit
@Priority1
@5
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | QA_Confirm_Submit_HST_Province_NB	|

  
  

@Confirm&Submit
@Priority1
@5
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | QA_Confirm_Submit_HST_Province_NS	|

  
  
@Confirm&Submit
@Priority1
@5
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | QA_Confirm_Submit_HST_Province_ON	|

  
  
@Confirm&Submit
@Priority1
@5
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | QA_Confirm_Submit_HST_Province_PE	|
  
          

@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | QA_Confirm_Submit_GST_Province_AB	|
     

@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | QA_Confirm_Submit_GST_Province_MB	|

     
     
@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | QA_Confirm_Submit_GST_Province_NT	|

     
     
@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | QA_Confirm_Submit_GST_Province_NU	|

     
     
     
@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | QA_Confirm_Submit_GST_Province_SK	|
   
     
@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct values for Teacher Catalogues when multiple items are added from same flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | QA_Confirm_Submit_GST_Province_YT	|
                    

@Confirm&Submit
@Priority1
@7
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for GST & PST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 										|
  | QA_Confirm_Submit_GST_PST_Province_BC_NoTaxes	|
  
   
@Confirm&Submit
@Priority1
@8
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST in C and S page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 										|
  | QA_Confirm_Submit_GST_QST_Province_QC_NoTaxes	|
  


@Confirm&Submit
@Priority1
@11
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
   And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Confirm_Submit_GST_PST_Province_BC	|
  
  	
@Confirm&Submit
@Priority1
@12
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
   And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Confirm_Submit_GST_PST_Province_BC_2	|
  
   
@Confirm&Submit
@Priority1
@13
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Confirm_Submit_GST_QST_Province_QC	|
  
  	
@Confirm&Submit
@Priority1
@14
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Confirm_Submit_GST_QST_Province_QC_2	|
  
   
@Confirm&Submit
@Priority1
@15
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | QA_StudentClubs_Confirm_Submit_HST_Province_NL	|



@Confirm&Submit
@Priority1
@15
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_HST_Province_NB	|
  
  
@Confirm&Submit
@Priority1
@15
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_HST_Province_NS	|

  
  
@Confirm&Submit
@Priority1
@15
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_HST_Province_ON	|

  
  
@Confirm&Submit
@Priority1
@15
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_HST_Province_PE	|
  
        

@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_GST_Province_AB	|
  
     

@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_GST_Province_MB	|

   
   
@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_GST_Province_NT	|

   
   
@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_GST_Province_NU	|

   
   
@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_GST_Province_SK	|

   
   
@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct values for Student Clubs when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Confirm_Submit_GST_Province_YT	|
      
            
   
	
@Confirm&Submit
@Priority1
@17
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & PST in C an S page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Confirm_Submit_GST_PST_Province_BC_NoTaxes	|
  
   
@Confirm&Submit
@Priority1
@18
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & QST in C and S page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData				 										|
  |  QA_StudentClubs_Confirm_Submit_GST_QST_Province_QC_NoTaxes	|

 
@Confirm&Submit
@Priority1
@21
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_PST_Province_BC	|
  
   
@Confirm&Submit
@Priority1
@22
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_QST_Province_QC	|
  
   
@Confirm&Submit
@Priority1
@23
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NL	|
  

@Confirm&Submit
@Priority1
@23
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NB	|

  
  
@Confirm&Submit
@Priority1
@23
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NS	|

  
  
@Confirm&Submit
@Priority1
@23
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_ON	|

  
  
  
@Confirm&Submit
@Priority1
@23
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_PE	|
      

@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_AB	|


@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_MB	|
 
  
  
  
@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NT	|

  
  
  
@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NU	|

  
  
  
@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_SK	|

  
  
  
@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct values for Student and Teacher Catalogues when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_YT	|
 
  	
@Confirm&Submit
@Priority1
@25
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for GST & PST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 																	|
  | QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_PST_Province_BC_NoTaxes	|
  
   
@Confirm&Submit
@Priority1
@26
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for GST & QST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData				 													|
  |  QA_Student_And_TeacherCatalogues_Confirm_Submit_GST_QST_Province_QC_NoTaxes	|
  
   
@ConfirmSubmit_PurchaseOrder
@DWCACSR-2031
@Priority1
@1
Scenario Outline: CSR sees Amount Paid by Credit Card and Amount Paid by Purchase Order labels in the Payment section of Confirm & Submit page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart with minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Combination of Credit Card and PO as payment
And CSR selects [Add a New Card]
And CSR fills the Credit card and Billing information form
And CSR enters PO details
And CSR enters amount paid for PO
When CSR clicks on [Continue Checkout] button in Payment page
Then the label 'Amount Paid by Credit Card' and 'Amount Paid by Purchase Order' displays in the Payment section
#And the amount is displayed for PO
#And the amount is displayed for credit card
Examples:
  | UsingData 												     |
  | QA_CSR_sees_correct_labels_Payment_Credit_PO_ConfirmSubmit_page |

@ConfirmSubmit_PurchaseOrder
@DWCACSR-2031
@Priority1
@2
Scenario Outline: CSR sees Amount Paid by Purchase Order label in the Payment section of Confirm & Submit page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart with minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Purchase Order as payment
And CSR enters PO details
When CSR clicks on [Continue Checkout] button in Payment page
Then the label 'Amount Paid by Purchase Order' displays in the Payment section
#And the amount is displayed for PO
Examples:
  | UsingData 											  |
  | QA_CSR_sees_correct_labels_Payment_PO_ConfirmSubmit_page |
  
  
                		