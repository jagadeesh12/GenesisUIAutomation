Feature: Payment
	This feature is to validate the Payment Page scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@Payment_Method
@DWCACSR-312
@Priority1
@1
Scenario Outline: CSR selects Checks as payment:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	Then Cheques payable to section and message displays correctly
	And Continue Checkout button is enabled in the footer region of the page

Examples: 
	| UsingData       		|
	| QA_CSR_Teacher_payment	|
	
	
@Payment_Module 
@DWCACSR-305 
@Priority1 
@1 
Scenario Outline:No payment options are displayed and continue checkout is enabled when CSR redeems the entire cart total using redemptions:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart less than the [Shipping threshold]
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR enters amount equal to Student club amount owing in Student Bonus Bank
	And CSR enters amount equal to teacher club amount owing in Student Bonus Bank
	And CSR enters amount equal to Shipping amount owing in Student Bonus Bank
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then Payment options are not displayed
	And Continue Checkout button is enabled in the footer region of the page

Examples: 
	| UsingData                   |
	| QA_CSR_Teacher_Payment_module  |	
	
@Payment_PageFramework
@DWCACSR-300
@Priority1
@1
Scenario Outline:Payment tab highlights when CSR clicks on Continue Checkout in Redeem and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
	Then [PAYMENT] tab should be highlighted in the step indicator
	
Examples:
  | UsingData 					|
  | QA_CSR_Payment_tab_highlights	|		
  

@Payment_PageFramework
@DWCACSR-300
@Priority1
@2
Scenario Outline:Continue Checkout button disabled in Payment page when CSR clicks on Continue Checkout in Redeem and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
    Then the button [Continue Checkout] should be disabled in the footer region of the page
	
Examples:
  | UsingData 						|
  | QA_CSR_Continue_Checkout_btn_disabled	|		
  

@Payment_PageFramework
@DWCACSR-300
@Priority1
@3
Scenario Outline:Payment method and alternate shipping address displays when CSR clicks on Continue Checkout in Redeem and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
    Then Unique method of Payment section displays
    And Alternate shipping address field section displays
	
Examples:
  | UsingData 							|
  | QA_CSR_Payment_method_Alternate_shipping	|		
  

@Payment_PageHeader&CSR_Script
@DWCACSR-302
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Payment header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then Blue step script icon should be displayed next to [Payment] header in a page
	
Examples:
  | UsingData 									|
  | QA_Blue_step_script_icon_displays_Payment_page	|		
  

@Payment_PageHeader&CSR_Script
@DWCACSR-302
@Priority1
@2
Scenario Outline:Modal window displays with the title 'To apply redemptions' when CSR clicks on Blue step script icon in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
    When CSR clicks on Blue step script icon in [Payment] page
    Then the modal window should be displayed with the title 'Shipping & Payment:'
    And the close button 'X' should be displayed in the top right corner of the [Shipping & Payment:] modal window
	
Examples:
  | UsingData 										|
  | QA_Blue_step_script_icon_modalWindow_Payment_page	|		
  

@Payment_PageHeader&CSR_Script
@DWCACSR-302
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Payment page when CSR closes the To confirm your order modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
    And CSR clicks on Blue step script icon in [Payment] page
    When CSR clicks on close button in [Shipping & Payment:] modal window
	Then CSR is presented with the [Payment] page
	
Examples:
  | UsingData 													|
  | QA_Blue_step_script_icon_modalWindow_disappeared_Payment_page	|
  
  		
@Payment_StepHeader
@DWCACSR-301
@Priority1
@1
Scenario Outline:PAYMENT tab highlights in the step indicator when CSR enters into the Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
    Then [PAYMENT] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               |
  | QA_Payment_tab_highlights	|		
  

@Payment_StepHeader
@DWCACSR-301
@Priority1
@2
Scenario Outline:Number of the PAYMENT page displays in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [Continue Checkout] button in Redeem and Rewards page
	Then the step header number for the [PAYMENT] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  	|
  | QA_Number_for_the_Payment_tab	|	
  
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club  items for GST & PST without redemptions in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank
	And CSR enters amount in teacher Paper coupons
	And CSR clicks on Apply in teacher section
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly 

Examples: 
	| UsingData                                       		 |
	| QA_CSR:TeacherOrder_GST_PST_Province_BC_0_0_0_0_payment  |
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club for GST & PST with student redemptions in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                       		 |
	| QA_CSR:TeacherOrder_GST_PST_Province_BC_2_2_0_0_payment  |   
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club for GST & PST with teacher redemptions in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                        |
	| QA_CSR:TeacherOrder_GST_PST_Province_BC_0_0_2_2_payment         |     
	
      
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club for GST & PST with student&Teacher redemptions in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                        |
	| QA_CSR:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_payment | 
	
       
       
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club items for GST & QST without redemptions against 'QC' in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly
	
Examples: 
	| UsingData                                        |
	| QA_CSR:TeacherOrder_GST_QST_Province_QC_0_0_0_0_payment  |
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club for GST & QST with Student redemptions against 'QC' in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                        |
	| QA_CSR:TeacherOrder_GST_QST_Province_QC_2_2_0_0_payment         |
	
	
           
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club for GST & QST with Teacher redemptions against 'QC' in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                        |
	| QA_CSR:TeacherOrder_GST_QST_Province_QC_0_0_2_2_payment         |          
                              
                              
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club for GST & QST with Student and Teacher redemptions against 'QC' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                        |
	| QA_CSR:TeacherOrder_GST_QST_Province_QC_2.1_2.1_2.1_2.1_payment |
	
	
       
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club for HST without redemptions against 'NL' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_HST_Province_NL_0_0_0_0_payment         |      
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club for HST with Student redemptions against 'NL' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_HST_Province_NL_2_2_0_0_payment         | 
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club for HST with Teacher redemptions against 'NL' in Payment page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_HST_Province_NL_0_0_2_2_payment         |
	
	
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club for HST with Student and Teacher redemptions against 'NL' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly
	
Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_HST_Province_NL_2.1_2.1_2.1_2.1_payment |
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal for Student & Teacher Club items for GST without redemptions against 'NU' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	When CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly 

Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_GST_Province_NU_0_0_0_0_payment         |     
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal for Student & Teacher Club items for GST with Student redemptions against 'NU' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	When CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly 

Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_GST_Province_NU_2_2_0_0_payment         |
	
	
@Golden 
@Example 
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club for GST with Teacher redemptions against 'NU' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	When CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly 
	
Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_GST_Province_NU_0_0_2_2_payment         |      
		
      
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal for Student & Teacher Club for GST with Student and Teacher redemptions against 'NU' in Payment:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	When CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly 

Examples: 
	| UsingData                                    |
	| QA_CSR:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1_payment |   
	
	

@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student club items for GST & PST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And Student club Total owing amount displays correctly 

Examples: 
	| UsingData                                |
	| QA_CSR:TeacherOrder_StudentItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
	
  
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal on Teacher club items for GST & PST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Teacher Catalogues Total owing amount displays correctly 

Examples: 
	| UsingData                                |
	| QA_CSR:TeacherOrder_TeacherItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
	
  
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student club items for GST & QST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And Student and Teacher clubs Total owing amount displays correctly

Examples: 
	| UsingData                                |
	| QA_CSR:TeacherOrder_StudentItems_GST_QST_Province_QC_2.1_2.1_PaymentPage | 
  
  
  
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal on Teacher club items for GST & QST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Teacher Catalogues Total owing amount displays correctly 

Examples: 
	| UsingData                                |
	| QA_CSR:TeacherOrder_TeacherItems_GST_QST_Province_QC_2.1_2.1_PaymentPage |  
	
	
	
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club items for HST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And Student club Total owing amount displays correctly 
	
Examples: 
	| UsingData                            |
	| QA_CSR:TeacherOrder_StudentItems_HST_Province_NB_2.1_2.1_PaymentPage |
	
	
  
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal on Teacher Club items for HST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Teacher Catalogues Total owing amount displays correctly 
	
Examples: 
	| UsingData                            |
	| QA_CSR:TeacherOrder_TeacherItems_HST_Province_NS_2.1_2.1_PaymentPage |
	
	
  
  
    
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal for Student Club items for GST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in student Bonus Bank 
	And CSR enters amount in student Paper coupons 
	And CSR clicks on Apply in Students section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly 
	And Student club Total owing amount displays correctly 
	
Examples: 
	| UsingData                            |
	| QA_CSR:TeacherOrder_StudentItems_GST_Province_AB_2.1_2.1_PaymentPage | 
	
	
  
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal on Teacher Club items for GST with redemptions in Payment Page:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in teacher Bonus Bank 
	And CSR enters amount in teacher Paper coupons 
	And CSR clicks on Apply in teacher section 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly 
	And Teacher Catalogues Total owing amount displays correctly 
	
Examples: 
	| UsingData                            |
	| QA_CSR:TeacherOrder_TeacherItems_GST_Province_NT_2.1_2.1_PaymentPage |
	

@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR is not charged with taxes for Student & Teacher Club items for Tax exempted schools-QA_CSR:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page 
	
	
Examples: 
	| UsingData                             |
	| QA_CSR:Payment:TeacherOrder_ItemsInCart_CreditCard_3 |
	

@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR is not charged with taxes for Student & Teacher Club items for Tax exempted schools:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR navigates to [Payment] page from [Redeem & Rewards] page 
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page 
	
Examples: 
	| UsingData                             |
	| QA_CSR:TeacherOrder_ItemsInCart_CreditCard_3 | 
	
	
@Payment
@Priority1
@DWCACSR-1511
@1
Scenario Outline:Continue checkout button not enabled until one of the hold status radio button is selected:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And 'ACCOUNT HOLD STATUS' is returned
	When CSR selects a payment method
	But does not select one of the radio buttons for hold status
	Then Continue Checkout button is not enabled
	
Examples:
  | UsingData 											|
  | QA_Payment_Account_Hold_Status_radio_btns_NoSelection	|
  
  	
@Payment
@Priority1
@DWCACSR-1511
@2
Scenario Outline:CSR selects one of the hold status radio button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And 'ACCOUNT HOLD STATUS' is returned
	And CSR selects a payment method
	When CSR selects one of the radio buttons for hold status
	And CSR clicks on Continue Checkout
	Then [Confirm & Submit] page displays
		
Examples:
  | UsingData 											|
  | QA_Payment_Account_Hold_Status_radio_btns_Selection	|
     
     
@Payment
@Priority1
@DWCACSR-1511
@3
Scenario Outline:Radio button for Hold status does not display if the account does not have a hold status:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then 'ACCOUNT HOLD STATUS' is NOT returned
	And radio buttons for hold status does not display
	When CSR selects a payment method
	And Continue Checkout button is enabled
		
Examples:
  | UsingData 									|
  | QA_Payment_Account_NO_Hold_Status_radio_btns	|
          
          
                  	