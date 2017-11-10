@redemptionsnow
Feature: Redemptions & Rewards - Incorporate SFO and update YTO
	This feature is to validate the Teachers - Checkout - Redemptions & Rewards - Incorporate SFO and update YTO scenarios

 
Background: 
	Given teacher open rco-scholastic web site 

	
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@1
Scenario Outline:Correct SFO subtotal,Qty,taxes,Total and Cart Total displays in Redemptions page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And SFO subtotal,Qty,GST,QST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_SFO_items_Redemptions_rewards_page_QC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@2
Scenario Outline:Correct SFO subtotal,Qty,taxes,Total and Cart Total displays in Redemptions page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And SFO subtotal,Qty,GST,PST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_SFO_items_Redemptions_rewards_page_BC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@3
Scenario Outline:Correct SFO subtotal,taxes,Total and Cart Total displays in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And SFO subtotal,Qty,HST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NL	|	
  | QA:Adds_SFO_items_Redemptions_rewards_page_NB	|	
  | QA:Adds_SFO_items_Redemptions_rewards_page_NS	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_ON	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_PE	|

  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@4
Scenario Outline:Correct SFO subtotal,taxes,Total and Cart Total displays in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And SFO subtotal,Qty,GST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_SFO_items_Redemptions_rewards_page_AB	|	
  | QA:Adds_SFO_items_Redemptions_rewards_page_MB	|	
  | QA:Adds_SFO_items_Redemptions_rewards_page_NT	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NU	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_SK	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_YT	|
  
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@5
Scenario Outline:No taxes charged and correct SFO subtotal,Qty,Total and Cart Total displays in Redemptions page for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And No taxes are charged for QC and SFO subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_items_Redemptions_rewards_page_QC_NoTax	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@6
Scenario Outline:No taxes charged and correct SFO subtotal,Qty,Total and Cart Total displays in Redemptions page for tax exempted schools GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And No taxes are charged for BC and SFO subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_items_Redemptions_rewards_page_BC_NoTax	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@7
Scenario Outline:No taxes are charged and correct SFO subtotal,Qty,Total and Cart Total displays in Redemptions page for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And No taxes are charged for HST and SFO subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NL_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NB_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NS_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_ON_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_PE_NoTax	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@8
Scenario Outline:No taxes are charged and correct SFO subtotal,Qty,Total and Cart Total displays in Redemptions page for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO section in Redemptions & Rewards page
	And No taxes are charged for GST and SFO subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_items_Redemptions_rewards_page_AB_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_MB_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NT_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NU_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_SK_NoTax	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_YT_NoTax	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@9
Scenario Outline:Correct YTO subtotal,Qty,taxes and Total displays in Redemptions page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And YTO subtotal,Qty,GST,QST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_items_Redemptions_rewards_page_QC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@10
Scenario Outline:Correct YTO subtotal,Qty,taxes and Total displays in Redemptions page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And YTO subtotal,Qty,GST,PST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_items_Redemptions_rewards_page_BC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@11
Scenario Outline:Correct YTO subtotal,taxes and Total displays in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And YTO subtotal,Qty,HST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NL	|	
  | QA:Adds_YTO_items_Redemptions_rewards_page_NB	|	
  | QA:Adds_YTO_items_Redemptions_rewards_page_NS	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_ON	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_PE	|

  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@12
@SS
Scenario Outline:Correct YTO subtotal,taxes and Total displays in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And YTO subtotal,Qty,GST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_items_Redemptions_rewards_page_AB	|	
  | QA:Adds_YTO_items_Redemptions_rewards_page_MB	|	
  | QA:Adds_YTO_items_Redemptions_rewards_page_NT	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NU	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_SK	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_YT	|
  
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@13
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty and Total displays in Redemptions page for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And No taxes are charged for QC and YTO subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_YTO_items_Redemptions_rewards_page_QC_NoTax	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@14
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty and Total displays in Redemptions page for tax exempted schools GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And No taxes are charged for BC and YTO subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_YTO_items_Redemptions_rewards_page_BC_NoTax	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@15
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty and Total displays in Redemptions page for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And No taxes are charged for HST and YTO subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NL_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NB_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NS_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_ON_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_PE_NoTax	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@16
Scenario Outline:No taxes are charged and correct YTO subtotal,Qty and Total displays in Redemptions page for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the YTO section in Redemptions & Rewards page
	And No taxes are charged for GST and YTO subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_YTO_items_Redemptions_rewards_page_AB_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_MB_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NT_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NU_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_SK_NoTax	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_YT_NoTax	|
      
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@17
Scenario Outline:Correct Teacher Exclusives subtotal,Qty,taxes and Total displays in Redemptions page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And Teacher Exclusives subtotal,Qty,GST,QST and Total displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_QC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@18
Scenario Outline:Correct Teacher Exclusives subtotal,Qty,taxes and Total displays in Redemptions page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And Teacher Exclusives subtotal,Qty,GST,PST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_BC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@19
Scenario Outline:Correct Teacher Exclusives subtotal,taxes and Total displays in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And Teacher Exclusives subtotal,Qty,HST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NL	|	
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NB	|	
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NS	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_ON	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_PE	|

  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@20
Scenario Outline:Correct Teacher Exclusives subtotal,taxes and Total displays in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And Teacher Exclusives subtotal,Qty,GST and Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_AB	|	
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_MB	|	
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NT	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NU	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_SK	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_YT	|
  
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@21
Scenario Outline:No taxes charged and correct TE subtotal,Qty and Total displays in Redemptions page for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And No taxes are charged for QC and Teacher Exclusives subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_QC_NoTax	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@22
Scenario Outline:No taxes charged and correct Teacher Exclusives subtotal,Qty and Total displays in Redemptions page for tax exempted schools GST&PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And No taxes are charged for BC and Teacher Exclusives subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_BC_NoTax	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@23
Scenario Outline:No taxes are charged and correct Teacher Exclusives subtotal,Qty and Total displays in Redemptions page for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And No taxes are charged for HST and Teacher Exclusives subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NL_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NB_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NS_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_ON_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_PE_NoTax	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@24
Scenario Outline:No taxes are charged and correct Teacher Exclusives subtotal,Qty and Total displays in Redemptions page for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the Teacher Exclusives section in Redemptions & Rewards page
	And No taxes are charged for GST and Teacher Exclusives subtotal,Qty and Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_AB_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_MB_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NT_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_NU_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_SK_NoTax	|
  | QA:Adds_Teacher_Exclusives_items_Redemptions_rewards_page_YT_NoTax	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@25
Scenario Outline:Correct SFO,YTO and Teacher Exclusives Total and Cart Total displays in Redemptions page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And SFO,YTO and Teacher Exclusives GST, QST and Totals displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_QC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@26
Scenario Outline:Correct SFO,YTO and Teacher Exclusives Total and Cart Total displays in Redemptions page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And SFO,YTO and Teacher Exclusives GST, PST and Totals displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_BC	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@27
Scenario Outline:Correct SFO,YTO and Teacher Exclusives Total and Cart Total displays in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And SFO,YTO and Teacher Exclusives HST and Totals displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NL	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NB	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NS	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_ON	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_PE	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@28
Scenario Outline:Correct SFO,YTO and TE Total and Cart Total displays in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And SFO,YTO and Teacher Exclusives GST and Totals displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_AB	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_MB	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NT	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NU	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_SK	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_YT	|
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@29
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Cart Total displays correctly in Redemptions page for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And No taxes are charged for QC and SFO,YTO,Teacher Exclusives Totals displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_QC_NoTax	|	


@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@30
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Cart Total displays correctly in Redemptions page for tax exempted schools GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And No taxes are charged for BC and SFO,YTO,Teacher Exclusives Totals displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_BC_NoTax	|	 
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@31
Scenario Outline:No taxes charged and SFO,YTO,TE Totals and Cart Total displays correctly in Redemptions page for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And No taxes are charged for HST and SFO,YTO,Teacher Exclusives Totals displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NL_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NB_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NS_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_ON_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_PE_NoTax	|
  
  	 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@32
Scenario Outline:No taxes are charged and SFO,YTO,TE Totals and Cart Total displays correctly in Redemptions page for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	When teacher navigates to [Redemptions & Rewards] page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page
	And No taxes are charged for GST and SFO,YTO,Teacher Exclusives Totals displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_AB_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_MB_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NT_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_NU_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_SK_NoTax	|
  | QA:Adds_SFO_YTO_TE_items_Redemptions_rewards_page_YT_NoTax	|
  
  
  
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@33
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes in Redemptions page with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Credit Notes in SFO section
	Then SFO subtotal,Qty,GST,QST and Total displays correctly after redeem the Credit Notes
	
Examples:
  | UsingData                            						|
  | QA:Adds_SFO_items_Redemptions_rewards_page_QC_2.1	|	  
  
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@34
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes in Redemptions page with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Credit Notes in SFO section
	Then SFO subtotal,Qty,GST,PST and Total displays correctly after redeem the Credit Notes
	
Examples:
  | UsingData                            						|
  | QA:Adds_SFO_items_Redemptions_rewards_page_BC_2.1	|	  
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@34
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Credit Notes in SFO section
	Then SFO subtotal,Qty,HST and Total displays correctly after redeem the Credit Notes
	
Examples:
  | UsingData                            						|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NL_2.1	| 
  | QA:Adds_SFO_items_Redemptions_rewards_page_NB_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NS_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_ON_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_PE_2.1	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@34
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Credit Notes in SFO section
	Then SFO subtotal,Qty,GST and Total displays correctly after redeem the Credit Notes
	
Examples:
  | UsingData                            						|
  | QA:Adds_SFO_items_Redemptions_rewards_page_AB_2.1	| 
  | QA:Adds_SFO_items_Redemptions_rewards_page_MB_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NT_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_NU_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_SK_2.1	|
  | QA:Adds_SFO_items_Redemptions_rewards_page_YT_2.1	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@35
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with correct taxes GST&QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	Then YTO subtotal,Qty,GST,QST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_YTO_items_Redemptions_rewards_page_QC_2.1	|	  
  
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@36
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with correct taxes GST&PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	Then YTO subtotal,Qty,GST,PST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_YTO_items_Redemptions_rewards_page_BC_2.1	|	  
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@37
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	Then YTO subtotal,Qty,HST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NL_2.1	| 
  | QA:Adds_YTO_items_Redemptions_rewards_page_NB_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NS_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_ON_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_PE_2.1	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@38
Scenario Outline:Correct YTO section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	And teacher navigates to [Review Cart] page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in YTO section
	And teacher applies Credit Notes in YTO section
	Then YTO subtotal,Qty,GST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_YTO_items_Redemptions_rewards_page_AB_2.1	| 
  | QA:Adds_YTO_items_Redemptions_rewards_page_MB_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NT_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_NU_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_SK_2.1	|
  | QA:Adds_YTO_items_Redemptions_rewards_page_YT_2.1	|
  
     
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@39
Scenario Outline:Correct TE section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with correct taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	Then TE subtotal,Qty,GST,QST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_TE_items_Redemptions_rewards_page_QC_2.1	|	  
  
 
@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@40
Scenario Outline:Correct TE section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with correct taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	Then TE subtotal,Qty,GST,PST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_TE_items_Redemptions_rewards_page_BC_2.1	|	  
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@41
Scenario Outline:Correct TE section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	Then TE subtotal,Qty,HST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_TE_items_Redemptions_rewards_page_NL_2.1	| 
  | QA:Adds_TE_items_Redemptions_rewards_page_NB_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_NS_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_ON_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_PE_2.1	|
  

@Redemptions_Rewards
@Priority1
@SCSCOD-7168
@InSprint_15.2
@42
Scenario Outline:Correct TE section values displays when teacher applies Credit Notes and Bonus Bank in Redemptions page with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	And teacher navigates to [Review Cart] page from Search results page
	And teacher navigates to [Redemptions & Rewards] page
	When teacher applies Bonus Bank in TE section
	And teacher applies Credit Notes in TE section
	Then TE subtotal,Qty,GST and Total displays correctly after redeem the Credit Notes and Bonus Bank
	
Examples:
  | UsingData                            						|
  | QA:Adds_TE_items_Redemptions_rewards_page_AB_2.1	| 
  | QA:Adds_TE_items_Redemptions_rewards_page_MB_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_NT_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_NU_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_SK_2.1	|
  | QA:Adds_TE_items_Redemptions_rewards_page_YT_2.1	|
  
  
################################################################

  @Sprint13.2
  @RewardsAndCoupons
  @Shipping
  @Priority2
  @SCSCOD-4726
Scenario Outline: Shipping upsell message displays when there is a shipping fee on the order:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher navigates to YTO page
		And teacher adds YTO item for Paid Shipping
		And teacher navigates to [Review Cart] page
		When teacher navigates to [Redemptions & Rewards] page
    Then shipping upsell message is shown in the blue header of Shipping & Handling section

  Examples:
    |UsingData                                |
    |QA:ShippingUpsellMessage_PaidShipping       |


  @Sprint13.2
  @RewardsAndCoupons
  @Shipping
  @Priority2
  @SCSCOD-4726
Scenario Outline: Shipping upsell message does not display when cart is eligible for free shipping:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher navigates to YTO page
		And teacher adds YTO item for Free Shipping
		And teacher navigates to [Review Cart] page
		When teacher navigates to [Redemptions & Rewards] page
    Then shipping upsell message is NOT shown in the blue header of Shipping & Handling section

  Examples:
    |UsingData                             |
    |QA:ShippingUpsellMessage_FreeShipping    |


  @Sprint13.2
  @RewardsAndCoupons
  @Priority2
  @Shipping
  @SCSCOD-4726
Scenario Outline: Shipping upsell message does not display when teacher adds more items and cart becomes eligible for free shipping:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher navigates to YTO page
		And teacher adds YTO item for Paid Shipping
		And teacher navigates to [Review Cart] page
		When teacher navigates to [Redemptions & Rewards] page
    Then shipping upsell message is shown in the blue header of Shipping & Handling section
    When teacher navigates to Review Your cart page from Coupons & Rewards page
    And teacher adds items from cart resulting in cart total cross [shipping threshold]
    And teacher navigates to [Redemptions & Rewards] page
    Then shipping upsell message is NOT shown in the blue header of Shipping & Handling section

  Examples:
    |UsingData                            |
    |QA:ShippingUpsellMessage_Shipping_moreItemsAdded      |


  @Sprint13.2
  @RewardsAndCoupons
  @Priority2
  @Shipping
  @SCSCOD-4726
Scenario Outline: Shipping upsell message displays when teacher deletes items from cart making cart eligible for paid shipping:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
  	And teacher navigates to YTO page
	And teacher adds YTO item for Free Shipping with item number
	And teacher navigates to [Review Cart] page
	When teacher navigates to [Redemptions & Rewards] page
    Then shipping upsell message is NOT shown in the blue header of Shipping & Handling section
  	When teacher navigates to Review Your cart page from Coupons & Rewards page
    And teacher deletes items from cart resulting in cart total fall below [shipping threshold]
    And teacher navigates to [Redemptions & Rewards] page
    Then shipping upsell message is shown in the blue header of Shipping & Handling section
  Examples:
    |UsingData                            |
    |QA:ShippingUpsellMessage_Shipping_deleteItems       |


  