Feature: Confirm & Submit - Student Clubs. Teacher Catalogues & Shipping - Applying Taxes
	This feature is to validate the Confirm & Submit - Student Clubs. Teacher Catalogues & Shipping - Applying Taxes scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit
@Priority1
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for HST:[<UsingData>]
	
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
  | Confirm_Submit_HST_Province_NB	|
  | Confirm_Submit_HST_Province_NS	|
  | Confirm_Submit_HST_Province_ON	|
  | Confirm_Submit_HST_Province_PE	|
  

@Confirm&Submit
@Priority1
@6
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST:[<UsingData>]
	
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
  | Confirm_Submit_GST_Province_MB	|
  | Confirm_Submit_GST_Province_NT	|
  | Confirm_Submit_GST_Province_NU	|
  | Confirm_Submit_GST_Province_SK	|
  | Confirm_Submit_GST_Province_YT	|
     


@Confirm&Submit
@Priority1
@7
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST in Confirm & Submit page:[<UsingData>]
	
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
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST in Confirm & Submit page:[<UsingData>]
	
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
@9
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as HST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | Confirm_Submit_HST_Province_NL_NoTaxes	|
  | Confirm_Submit_HST_Province_NB_NoTaxes	|
  | Confirm_Submit_HST_Province_NS_NoTaxes	|
  | Confirm_Submit_HST_Province_ON_NoTaxes	|
  | Confirm_Submit_HST_Province_PE_NoTaxes	|
  

@Confirm&Submit
@Priority1
@10
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | Confirm_Submit_GST_Province_AB_NoTaxes	|
  | Confirm_Submit_GST_Province_MB_NoTaxes	|
  | Confirm_Submit_GST_Province_NT_NoTaxes	|
  | Confirm_Submit_GST_Province_NU_NoTaxes	|
  | Confirm_Submit_GST_Province_SK_NoTaxes	|
  | Confirm_Submit_GST_Province_YT_NoTaxes	|
     



@Confirm&Submit
@Priority1
@11
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST:[<UsingData>]
	
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
  | StudentClubs_Confirm_Submit_HST_Province_NL	|
  | StudentClubs_Confirm_Submit_HST_Province_NB	|
  | StudentClubs_Confirm_Submit_HST_Province_NS	|
  | StudentClubs_Confirm_Submit_HST_Province_ON	|
  | StudentClubs_Confirm_Submit_HST_Province_PE	|
  

@Confirm&Submit
@Priority1
@16
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST:[<UsingData>]
	
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
  | StudentClubs_Confirm_Submit_GST_Province_MB	|
  | StudentClubs_Confirm_Submit_GST_Province_NT	|
  | StudentClubs_Confirm_Submit_GST_Province_NU	|
  | StudentClubs_Confirm_Submit_GST_Province_SK	|
  | StudentClubs_Confirm_Submit_GST_Province_YT	|
     
	
@Confirm&Submit
@Priority1
@17
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & PST in Confirm & Submit page:[<UsingData>]
	
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
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & QST in Confirm & Submit page:[<UsingData>]
	
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
@19
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as HST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student Clubs PostTax,Items,HST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 													|
  | StudentClubs_Confirm_Submit_HST_Province_NL_NoTaxes	|
  | StudentClubs_Confirm_Submit_HST_Province_NB_NoTaxes	|
  | StudentClubs_Confirm_Submit_HST_Province_NS_NoTaxes	|
  | StudentClubs_Confirm_Submit_HST_Province_ON_NoTaxes	|
  | StudentClubs_Confirm_Submit_HST_Province_PE_NoTaxes	|
  

@Confirm&Submit
@Priority1
@20
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 													|
  | StudentClubs_Confirm_Submit_GST_Province_AB_NoTaxes	|
  | StudentClubs_Confirm_Submit_GST_Province_MB_NoTaxes	|
  | StudentClubs_Confirm_Submit_GST_Province_NT_NoTaxes	|
  | StudentClubs_Confirm_Submit_GST_Province_NU_NoTaxes	|
  | StudentClubs_Confirm_Submit_GST_Province_SK_NoTaxes	|
  | StudentClubs_Confirm_Submit_GST_Province_YT_NoTaxes	|
     

 
@Confirm&Submit
@Priority1
@21
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
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
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST:[<UsingData>]
	
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
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NB	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NS	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_ON	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_PE	|
  

@Confirm&Submit
@Priority1
@24
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST:[<UsingData>]
	
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
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_MB	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NT	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NU	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_SK	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_YT	|
  
  	
@Confirm&Submit
@Priority1
@25
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST in Confirm & Submit page:[<UsingData>]
	
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
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST in Confirm & Submit page:[<UsingData>]
	
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
  
   
@Confirm&Submit
@Priority1
@27
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as HST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 																	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NL_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NB_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_NS_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_ON_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_HST_Province_PE_NoTaxes	|
  

@Confirm&Submit
@Priority1
@28
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 																	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_AB_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_MB_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NT_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_NU_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_SK_NoTaxes	|
  | Student_And_TeacherCatalogues_Confirm_Submit_GST_Province_YT_NoTaxes	|
     

@Confirm&Submit
@Priority1
@29
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues items are added for GST with or without redemptions:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank
	And CSR enters amount in teacher Paper coupons
	And CSR clicks on Apply in teacher section
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then StudentClub PostTax,Items,GST,shipping charges,Total amount and TeacherCatalogues PostTax,Items,GST,shipping charges,Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData				 										|
  | CSR:Confirm_Submit:TeacherOrder_GST_Province_NU_0_0_0_0         |
  | CSR:Confirm_Submit:TeacherOrder_GST_Province_NU_2_2_0_0         |
  | CSR:Confirm_Submit:TeacherOrder_GST_Province_NU_0_0_2_2         |
  | CSR:Confirm_Submit:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1 |
  
  
@Confirm&Submit
@Priority1
@30
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes for Student Clubs in Confirm and Submit page when selects pops as payment in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects pops
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 													|
  | CSR:StudentClubs_Confirm_Submit_pops_GST_PST_Province_BC	|       
  
  
  