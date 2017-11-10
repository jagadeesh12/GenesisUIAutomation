Feature: Review Cart - Teachers - Incorporate SFO and YTO
	This feature is to validate the Teachers - Cart - Incorporate SFO and YTO scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site 


@CSR	
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@1
Scenario Outline: Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes GST & QST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And YTO Subtotal,Qty,GST,QST,Total and Cart Total displays correctly
Examples:
  | UsingData                              |
  | InSprint15.2:CSR:Adds_YTO_student_items_QC |	

@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@2
Scenario Outline: Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes GST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly
Examples:
  | UsingData                                            |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_AB |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_MB |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NT |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NU |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_SK |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_YT |
   
@CSR   
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@3
Scenario Outline:Correct YTO,Teacher Exclusives Total and Cart Total displays with applicable taxes HST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO and Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO and Teacher Exclusives sections
And YTO and Teacher Exclusives Total and Cart Total displays correctly
Examples:
  | UsingData                             |
  | InSprint15.2:CSR:Adds_YTO_TE_items_NL |
  | InSprint15.2:CSR:Adds_YTO_TE_items_NB |
  | InSprint15.2:CSR:Adds_YTO_TE_items_NS |
  | InSprint15.2:CSR:Adds_YTO_TE_items_ON |
  | InSprint15.2:CSR:Adds_YTO_TE_items_PE |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@4
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes GST & PST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And YTO Subtotal,Qty,GST,PST,Total and Cart Total displays correctly
Examples:
  | UsingData                              |
  | InSprint15.2:CSR:Adds_YTO_student_items_BC |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@5
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added for tax exempted schools GST & QST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And No taxes are charged and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                              |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_QC_NoTax |
  
@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@6
Scenario Outline:Correct YTO and Teacher Exclusives Total and Cart Total displays with applicable taxes GST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO and Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO and Teacher Exclusives sections
And YTO and Teacher Exclusives Total and Cart Total displays correctly
Examples:
  | UsingData                             |
  | InSprint15.2:CSR:Adds_YTO_TE_items_AB |
  | InSprint15.2:CSR:Adds_YTO_TE_items_MB |
  | InSprint15.2:CSR:Adds_YTO_TE_items_NT |
  | InSprint15.2:CSR:Adds_YTO_TE_items_NU |
  | InSprint15.2:CSR:Adds_YTO_TE_items_SK |
  | InSprint15.2:CSR:Adds_YTO_TE_items_YT |
  
@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@7
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes HST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO and Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly
Examples:
  | UsingData                              |
  | InSprint15.2:CSR:Adds_YTO_student_items_NL |
  | InSprint15.2:CSR:Adds_YTO_student_items_NB |
  | InSprint15.2:CSR:Adds_YTO_student_items_NS |
  | InSprint15.2:CSR:Adds_YTO_student_items_ON |
  | InSprint15.2:CSR:Adds_YTO_student_items_PE |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@8
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added for tax exempted schools GST & PST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And No taxes are charged and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                              |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_BC_NoTax |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@9
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes GST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly
Examples:
  | UsingData                              |
  | InSprint15.2:CSR:Adds_YTO_student_items_AB |
  | InSprint15.2:CSR:Adds_YTO_student_items_MB |
  | InSprint15.2:CSR:Adds_YTO_student_items_NT |
  | InSprint15.2:CSR:Adds_YTO_student_items_NU |
  | InSprint15.2:CSR:Adds_YTO_student_items_SK |
  | InSprint15.2:CSR:Adds_YTO_student_items_YT |
  
@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@10
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added for tax exempted schools HST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And No taxes are charged and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                              |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NL_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NB_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NS_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_ON_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_PE_NoTax |
  
@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@11
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools GST & QST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And No taxes are charged and YTO Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                    |
  | InSprint15.2:CSR:Adds_YTO_student_items_QC_NoTax |	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@12
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added for tax exempted schools GST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And No taxes are charged and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly
Examples:
  | UsingData                                              |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_AB_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_MB_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NT_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NU_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_SK_NoTax |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_YT_NoTax |

@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@13
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools GST & PST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And No taxes are charged and YTO Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                    |
  | InSprint15.2:CSR:Adds_YTO_student_items_BC_NoTax |	
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@14
Scenario Outline:Correct YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes GST & QST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO sections
And CSR sees the text 'You are earning rewards on'
And YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
Examples:
  | UsingData                          |
  | InSprint15.2:CSR:Adds_YTO_items_QC |
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@15
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools HST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And No taxes are charged and YTO Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                    |
  | InSprint15.2:CSR:Adds_YTO_student_items_NL_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_NB_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_NS_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_ON_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_PE_NoTax |
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@16
Scenario Outline:Correct YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes GST & PST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO sections
And CSR sees the text 'You are earning rewards on'
And YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
Examples:
  | UsingData                          |
  | InSprint15.2:CSR:Adds_YTO_items_BC |	  

@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@17
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools GST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And No taxes are charged and YTO Subtotal,Qty,Total and Cart Total displays correctly
Examples:
  | UsingData                                    |
  | InSprint15.2:CSR:Adds_YTO_student_items_AB_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_MB_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_NT_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_NU_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_SK_NoTax |
  | InSprint15.2:CSR:Adds_YTO_student_items_YT_NoTax |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@18
Scenario Outline:Correct YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes HST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO sections
And CSR sees the text 'You are earning rewards on'
And YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
Examples:
  | UsingData                          |
  | InSprint15.2:CSR:Adds_YTO_items_NL |
  | InSprint15.2:CSR:Adds_YTO_items_NB |
  | InSprint15.2:CSR:Adds_YTO_items_NS |
  | InSprint15.2:CSR:Adds_YTO_items_ON |
  | InSprint15.2:CSR:Adds_YTO_items_PE |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@19
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes GST & QST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And Teacher Exclusives Subtotal,Qty,GST,QST,Total and Cart Total displays correctly
Examples:
  | UsingData                                        |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_QC |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@20
Scenario Outline:Correct YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes GST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO section
And CSR sees the text 'You are earning rewards on'
And YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
Examples:
  | UsingData                          |
  | InSprint15.2:CSR:Adds_YTO_items_AB |
  | InSprint15.2:CSR:Adds_YTO_items_MB |
  | InSprint15.2:CSR:Adds_YTO_items_NT |
  | InSprint15.2:CSR:Adds_YTO_items_NU |
  | InSprint15.2:CSR:Adds_YTO_items_SK |
  | InSprint15.2:CSR:Adds_YTO_items_YT |  

@CSR
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@21
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes GST & PST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And Teacher Exclusives Subtotal,Qty,GST,PST,Total and Cart Total displays correctly
Examples:
  | UsingData                                        |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_BC |	
  
@CSR 
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@22
Scenario Outline:Correct YTO and Teacher Exclusives Total and Cart Total displays with applicable taxes GST & QST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO and Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO and Teacher Exclusives sections
And YTO and Teacher Exclusives Total and Cart Total displays correctly
Examples:
  | UsingData                             |
  | InSprint15.2:CSR:Adds_YTO_TE_items_QC |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@23
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes HST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the Teacher Exclusives section
And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly
Examples:
  | UsingData                                        |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NL |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NB |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_NS |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_ON |
  | InSprint15.2:CSR:Adds_YTO_teacher_catalogue_items_PE |
  
@CSR  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@24
Scenario Outline:Correct YTO and Teacher Exclusives Total and Cart Total displays with applicable taxes GST & PST:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO and Teacher Exclusive items to the cart
When CSR navigates to Review Cart page from Order Entry page
Then CSR sees the YTO and Teacher Exclusives sections
And YTO and Teacher Exclusives Total and Cart Total displays correctly
Examples:
  | UsingData                             |
  | InSprint15.2:CSR:Adds_YTO_TE_items_BC | 