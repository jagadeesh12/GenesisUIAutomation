Feature: Redemptions & Rewards - Student Clubs. Teacher Catalogues & Shipping - Applying Taxes
	This feature is to validate the Redemptions & Rewards - Student Clubs. Teacher Catalogues & Shipping - Applying Taxes scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@1
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 								|
  | Redemptions_Rewards_GST_PST_Province_BC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@2
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 									|
  | Redemptions_Rewards_GST_PST_Province_BC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@3
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 								|
  | Redemptions_Rewards_GST_QST_Province_QC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@4
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 									|
  | Redemptions_Rewards_GST_QST_Province_QC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@5
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for HST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | Redemptions_Rewards_HST_Province_NL	|
  | Redemptions_Rewards_HST_Province_NB	|
  | Redemptions_Rewards_HST_Province_NS	|
  | Redemptions_Rewards_HST_Province_ON	|
  | Redemptions_Rewards_HST_Province_PE	|
  

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | Redemptions_Rewards_GST_Province_AB	|
  | Redemptions_Rewards_GST_Province_MB	|
  | Redemptions_Rewards_GST_Province_NT	|
  | Redemptions_Rewards_GST_Province_NU	|
  | Redemptions_Rewards_GST_Province_SK	|
  | Redemptions_Rewards_GST_Province_YT	|
     


  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@7
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays
	
Examples:
  | UsingData 										|
  | Redemptions_Rewards_GST_PST_Province_BC_NoTaxes	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@8
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays
	
Examples:
  | UsingData 										|
  | Redemptions_Rewards_GST_QST_Province_QC_NoTaxes	|


@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@11
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | StudentClubs_Redemptions_Rewards_GST_PST_Province_BC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@12
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | StudentClubs_Redemptions_Rewards_GST_PST_Province_BC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@13
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | StudentClubs_Redemptions_Rewards_GST_QST_Province_QC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@14
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | StudentClubs_Redemptions_Rewards_GST_QST_Province_QC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@15
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | StudentClubs_Redemptions_Rewards_HST_Province_NL	|
  | StudentClubs_Redemptions_Rewards_HST_Province_NB	|
  | StudentClubs_Redemptions_Rewards_HST_Province_NS	|
  | StudentClubs_Redemptions_Rewards_HST_Province_ON	|
  | StudentClubs_Redemptions_Rewards_HST_Province_PE	|
  

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | StudentClubs_Redemptions_Rewards_GST_Province_AB	|
  | StudentClubs_Redemptions_Rewards_GST_Province_MB	|
  | StudentClubs_Redemptions_Rewards_GST_Province_NT	|
  | StudentClubs_Redemptions_Rewards_GST_Province_NU	|
  | StudentClubs_Redemptions_Rewards_GST_Province_SK	|
  | StudentClubs_Redemptions_Rewards_GST_Province_YT	|
     


  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@17
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays
	
Examples:
  | UsingData 														|
  | StudentClubs_Redemptions_Rewards_GST_PST_Province_BC_NoTaxes	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@18
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays
	
Examples:
  | UsingData				 										|
  |  StudentClubs_Redemptions_Rewards_GST_QST_Province_QC_NoTaxes	|
  
 

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@21
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 																|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_PST_Province_BC	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@22
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 																|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_QST_Province_QC	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@23
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_NL	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_NB	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_NS	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_ON	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_PE	|
  

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_AB	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_MB	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_NT	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_NU	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_SK	|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_YT	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@25
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays
	
Examples:
  | UsingData 																		|
  | Student_And_TeacherCatalogues_Redemptions_Rewards_GST_PST_Province_BC_NoTaxes	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@26
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays
	
Examples:
  | UsingData				 														|
  |  Student_And_TeacherCatalogues_Redemptions_Rewards_GST_QST_Province_QC_NoTaxes	|
       