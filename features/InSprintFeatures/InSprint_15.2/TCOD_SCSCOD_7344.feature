@CouponModify
Feature: Payment - Checkout - Incorporate SFO and update YTO
	This feature is to validate the Teachers - Checkout - Payment - Incorporate SFO and update YTO scenarios

 
Background: 
	Given teacher open rco-scholastic web site 

	
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@1
Scenario Outline:Correct SFO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And SFO subtotal,Qty,GST,PST,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_SFO_items_Payment_page_BC_2.1	|	


@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@2
Scenario Outline:Correct SFO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And SFO subtotal,Qty,GST,QST,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_SFO_items_Payment_page_QC_2.1	|	
     
     
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@3
Scenario Outline:Correct SFO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And SFO subtotal,Qty,HST,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_SFO_items_Payment_page_NL_2.1	|	
  | InSprint15.2:Adds_SFO_items_Payment_page_NB_2.1	|	
  | InSprint15.2:Adds_SFO_items_Payment_page_NS_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_ON_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_PE_2.1	|
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@4
Scenario Outline:Correct SFO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And SFO subtotal,Qty,GST,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_SFO_items_Payment_page_AB_2.1	|	
  | InSprint15.2:Adds_SFO_items_Payment_page_MB_2.1	|	
  | InSprint15.2:Adds_SFO_items_Payment_page_NT_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_NU_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_SK_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_YT_2.1	| 	
 
 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@5
Scenario Outline:No taxes are charged and correct SFO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And No taxes are charged for BC and SFO subtotal,Qty,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_items_Payment_page_BC_NoTax_2.1	|	
       
       
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@6
Scenario Outline:No taxes are charged and correct SFO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And No taxes are charged for QC and SFO subtotal,Qty,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_items_Payment_page_QC_NoTax_2.1	|	
       
       
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@7
Scenario Outline:No taxes are charged and correct SFO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And No taxes are charged for HST and SFO subtotal,Qty,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_items_Payment_page_NL_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_NB_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_NS_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_ON_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_PE_NoTax_2.1	|	
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@8
Scenario Outline:No taxes are charged and correct SFO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	When teacher navigates to the [Payments] page
	Then teacher sees the SFO section in Payment page
	And No taxes are charged for GST and SFO subtotal,Qty,SFO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_items_Payment_page_AB_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_MB_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_NT_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_NU_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_SK_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_items_Payment_page_YT_NoTax_2.1	|
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@9
Scenario Outline:Correct YTO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And YTO subtotal,Qty,GST,PST,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_YTO_items_Payment_page_BC_2.1	|	


@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@10
Scenario Outline:Correct YTO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And YTO subtotal,Qty,GST,QST,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_YTO_items_Payment_page_QC_2.1	|	
     
     
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@11
Scenario Outline:Correct YTO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And YTO subtotal,Qty,HST,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_YTO_items_Payment_page_NL_2.1	|	
  | InSprint15.2:Adds_YTO_items_Payment_page_NB_2.1	|	
  | InSprint15.2:Adds_YTO_items_Payment_page_NS_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_ON_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_PE_2.1	|
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@12
Scenario Outline:Correct YTO subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And YTO subtotal,Qty,GST,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_YTO_items_Payment_page_AB_2.1	|	
  | InSprint15.2:Adds_YTO_items_Payment_page_MB_2.1	|	
  | InSprint15.2:Adds_YTO_items_Payment_page_NT_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_NU_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_SK_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_YT_2.1	| 	
 
 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@13
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And No taxes are charged for BC and YTO subtotal,Qty,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_YTO_items_Payment_page_BC_NoTax_2.1	|	
       
       
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@14
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And No taxes are charged for QC and YTO subtotal,Qty,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_YTO_items_Payment_page_QC_NoTax_2.1	|	
       
       
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@15
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And No taxes are charged for HST and YTO subtotal,Qty,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_YTO_items_Payment_page_NL_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_NB_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_NS_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_ON_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_PE_NoTax_2.1	|	
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@16
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	When teacher navigates to the [Payments] page
	Then teacher sees the YTO section in Payment page
	And No taxes are charged for GST and YTO subtotal,Qty,YTO Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_YTO_items_Payment_page_AB_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_MB_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_NT_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_NU_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_SK_NoTax_2.1	|
  | InSprint15.2:Adds_YTO_items_Payment_page_YT_NoTax_2.1	|  
  
 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@17
Scenario Outline:Correct TE subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And TE subtotal,Qty,GST,PST,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_TE_items_Payment_page_BC_2.1	|	


@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@18
Scenario Outline:Correct TE subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And TE subtotal,Qty,GST,QST,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_TE_items_Payment_page_QC_2.1	|	
     
     
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@19
Scenario Outline:Correct TE subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And TE subtotal,Qty,HST,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_TE_items_Payment_page_NL_2.1	|	
  | InSprint15.2:Adds_TE_items_Payment_page_NB_2.1	|	
  | InSprint15.2:Adds_TE_items_Payment_page_NS_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_ON_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_PE_2.1	|
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@20
Scenario Outline:Correct TE subtotal,Qty,taxes,Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And TE subtotal,Qty,GST,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            			|
  | InSprint15.2:Adds_TE_items_Payment_page_AB_2.1	|	
  | InSprint15.2:Adds_TE_items_Payment_page_MB_2.1	|	
  | InSprint15.2:Adds_TE_items_Payment_page_NT_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_NU_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_SK_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_YT_2.1	| 	
 
 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@21
Scenario Outline:No taxes are charged and correct TE subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And No taxes are charged for BC and TE subtotal,Qty,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_TE_items_Payment_page_BC_NoTax_2.1	|	
       
       
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@22
Scenario Outline:No taxes are charged and correct TE subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And No taxes are charged for QC and TE subtotal,Qty,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_TE_items_Payment_page_QC_NoTax_2.1	|	
       
       
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@23
Scenario Outline:No taxes are charged and correct TE subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And No taxes are charged for HST and TE subtotal,Qty,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_TE_items_Payment_page_NL_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_NB_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_NS_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_ON_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_PE_NoTax_2.1	|	
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@24
Scenario Outline:No taxes are charged and correct TE subtotal,Qty,Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then teacher sees the TE section in Payment page
	And No taxes are charged for GST and TE subtotal,Qty,TE Total and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_TE_items_Payment_page_AB_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_MB_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_NT_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_NU_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_SK_NoTax_2.1	|
  | InSprint15.2:Adds_TE_items_Payment_page_YT_NoTax_2.1	|  
  
 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@25
Scenario Outline:Correct SFO,YTO and TE Total and Order Total displays in Payment page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then SFO,YTO and TE, Totals, GST, PST and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_BC_2.1	|	 
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@26
Scenario Outline:Correct SFO,YTO and TE Total and Order Total displays in Payment page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then SFO,YTO and TE, Totals, GST, QST and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_QC_2.1	|	 
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@27
Scenario Outline:Correct SFO,YTO and TE Total and Order Total displays in Payment page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then SFO,YTO and TE, Totals, HST and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NL_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NB_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NS_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_ON_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_PE_2.1	|
  
  
  	 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@28
Scenario Outline:Correct SFO,YTO and TE Total and Order Total displays in Payment page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then SFO,YTO and TE, Totals, GST and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_AB_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_MB_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NT_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NU_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_SK_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_YT_2.1	|
  

@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@29
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Order Total displays correctly in Payment page for tax exempted schools GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then No taxes are charged for BC and SFO,YTO,TE Totals and Order Total displays correctly
	
Examples:
  | UsingData                            							|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_BC_NoTax_2.1	|	 
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@30
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Order Total displays correctly in Payment page for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then No taxes are charged for QC and SFO,YTO,TE Totals and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_QC_NoTax_2.1	|	 
  
  
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@31
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Order Total displays correctly in Payment page for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then No taxes are charged for HST and SFO,YTO,TE Totals and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NL_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NB_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NS_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_ON_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_PE_NoTax_2.1	|
  
  
  	 
@Payment
@Priority1
@SCSCOD-7344
@InSprint_15.2
@32
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Order Total displays correctly in Payment page for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	And teacher applies Credit Notes in SFO section
	And teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	And teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	When teacher navigates to the [Payments] page
	Then No taxes are charged for GST and SFO,YTO,TE Totals and Order Total displays correctly
	
Examples:
  | UsingData                            					|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_AB_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_MB_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NT_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_NU_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_SK_NoTax_2.1	|
  | InSprint15.2:Adds_SFO_YTO_TE_items_Payment_page_YT_NoTax_2.1	|
  
    
                                                     