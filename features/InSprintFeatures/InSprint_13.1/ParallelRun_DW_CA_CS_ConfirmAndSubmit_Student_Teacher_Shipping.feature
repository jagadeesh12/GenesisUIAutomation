@CSR
Feature: Confirm & Submit - Student Clubs. Teacher Catalogues & Shipping - Applying Taxes
	This feature is to validate the Confirm & Submit - Student Clubs. Teacher Catalogues & Shipping - Applying Taxes scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Confirm_Submit_GST_PST_Province_BC	|
  
  	
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
  | Confirm_Submit_GST_PST_Province_BC_2	|
  
   
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
  | Confirm_Submit_GST_QST_Province_QC	|
  
  	
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
  | Confirm_Submit_GST_QST_Province_QC_2	|
  
   
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
  | Confirm_Submit_HST_Province_NL	|



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
  | Confirm_Submit_HST_Province_NB	|

  
  

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
  | Confirm_Submit_HST_Province_NS	|

  
  
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
  | Confirm_Submit_HST_Province_ON	|

  
  
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
  | Confirm_Submit_HST_Province_PE	|
  
          

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
  | Confirm_Submit_GST_Province_AB	|
     

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
  | Confirm_Submit_GST_Province_MB	|

     
     
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
  | Confirm_Submit_GST_Province_NT	|

     
     
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
  | Confirm_Submit_GST_Province_NU	|

     
     
     
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
  | Confirm_Submit_GST_Province_SK	|
   
     
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
  | Confirm_Submit_GST_Province_YT	|
                    

@Confirm&Submit
@Priority1
@7
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for GST & PST:[<UsingData>]
	
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
  | Confirm_Submit_GST_PST_Province_BC_NoTaxes	|
  
   
@Confirm&Submit
@Priority1
@8
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for GST & QST:[<UsingData>]
	
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
  | Confirm_Submit_GST_QST_Province_QC_NoTaxes	|
  


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
  | StudentClubs_Confirm_Submit_GST_PST_Province_BC	|
  
  	
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
  | StudentClubs_Confirm_Submit_GST_PST_Province_BC_2	|
  
   
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
  | StudentClubs_Confirm_Submit_GST_QST_Province_QC	|
  
  	
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
  | StudentClubs_Confirm_Submit_GST_QST_Province_QC_2	|
  
   
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
  | StudentClubs_Confirm_Submit_HST_Province_NL	|



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
  | StudentClubs_Confirm_Submit_HST_Province_NB	|
  
  
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
  | StudentClubs_Confirm_Submit_HST_Province_NS	|

  
  
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
  | StudentClubs_Confirm_Submit_HST_Province_ON	|

  
  
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
  | StudentClubs_Confirm_Submit_HST_Province_PE	|
  
        

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
  | StudentClubs_Confirm_Submit_GST_Province_AB	|
  
     

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
  | StudentClubs_Confirm_Submit_GST_Province_MB	|

   
   
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
  | StudentClubs_Confirm_Submit_GST_Province_NT	|

   
   
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
  | StudentClubs_Confirm_Submit_GST_Province_NU	|

   
   
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
  | StudentClubs_Confirm_Submit_GST_Province_SK	|

   
   
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
  | StudentClubs_Confirm_Submit_GST_Province_YT	|
      
            
   
	
@Confirm&Submit
@Priority1
@17
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for GST & PST:[<UsingData>]
	
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
  | StudentClubs_Confirm_Submit_GST_PST_Province_BC_NoTaxes	|
  
   
@Confirm&Submit
@Priority1
@18
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for GST & QST:[<UsingData>]
	
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
  |  StudentClubs_Confirm_Submit_GST_QST_Province_QC_NoTaxes	|

 
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_PST_Province_BC	|
  
   
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_QST_Province_QC	|
  
   
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
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NL	|
  

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
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NB	|

  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NS	|

  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_ON	|

  
  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_PE	|
      

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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_AB	|


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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_MB	|
 
  
  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NT	|

  
  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NU	|

  
  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_SK	|

  
  
  
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_YT	|
 
  	
@Confirm&Submit
@Priority1
@25
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for GST & PST:[<UsingData>]
	
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_PST_Province_BC_NoTaxes	|
  
   
@Confirm&Submit
@Priority1
@26
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for GST & QST:[<UsingData>]
	
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
  |  Student_And_TeacherCatalogues_Confirm_Submit_GST_QST_Province_QC_NoTaxes	|
  
   

  
  