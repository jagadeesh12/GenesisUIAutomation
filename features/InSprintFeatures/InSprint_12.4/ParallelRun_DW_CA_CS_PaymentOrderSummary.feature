Feature: Payment Order Summary
	This feature is to validate the Payment Order Summary scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site
	

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
	| CSR:TeacherOrder_GST_PST_Province_BC_0_0_0_0_payment  |
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student redemptions in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_PST_Province_BC_2_2_0_0_payment  |   
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club  items for GST & PST with teacher redemptions in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_PST_Province_BC_0_0_2_2_payment         |     
	
      
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student&Teacher redemptions in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_payment | 
	
       
       
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club items for GST & QST without redemptions against 'QC' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_QST_Province_QC_0_0_0_0_payment  |
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club items for GST & QST with Student redemptions against 'QC' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_QST_Province_QC_2_2_0_0_payment         |
	
	
           
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club items for GST & QST with Teacher redemptions against 'QC' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_QST_Province_QC_0_0_2_2_payment         |          
                              
                              
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student and Teacher club items for GST & QST with Student and Teacher redemptions against 'QC' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_QST_Province_QC_2.1_2.1_2.1_2.1_payment |
	
	
       
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club items for HST without redemptions against 'NL' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_HST_Province_NL_0_0_0_0_payment         |      
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club items for HST with Student redemptions against 'NL' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_HST_Province_NL_2_2_0_0_payment         | 
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club items for HST with Teacher redemptions against 'NL' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_HST_Province_NL_0_0_2_2_payment         |
	
	
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal on Student Club and Teacher club items for HST with Student and Teacher redemptions against 'NL' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_HST_Province_NL_2.1_2.1_2.1_2.1_payment |
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal for Student & Teacher Club items for GST without redemptions against 'NU' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_Province_NU_0_0_0_0_payment         |     
	
      
@Golden 
@Example 
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR charged with correct subtotal for Student & Teacher Club items for GST with Student redemptions against 'NU' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_Province_NU_2_2_0_0_payment         |
	
	
@Golden 
@Example 
@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:Teacher charged with correct subtotal for Student & Teacher Club items for GST with Teacher redemptions against 'NU' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_Province_NU_0_0_2_2_payment         |      
		
      
@Golden 
@CSR_Payment 
@Priority1 
Scenario Outline:CSR charged with correct subtotal for Student & Teacher Club items for GST with Student and Teacher redemptions against 'NU' Province in Payment page:[<UsingData>] 

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
	| CSR:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1_payment |   
	
	

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
	| CSR:TeacherOrder_StudentItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
	
  
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
	| CSR:TeacherOrder_TeacherItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
	
  
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
	| CSR:TeacherOrder_StudentItems_GST_QST_Province_QC_2.1_2.1_PaymentPage | 
  
  
  
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
	| CSR:TeacherOrder_TeacherItems_GST_QST_Province_QC_2.1_2.1_PaymentPage |  
	
	
	
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
	| CSR:TeacherOrder_StudentItems_HST_Province_NB_2.1_2.1_PaymentPage |
	
	
  
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
	| CSR:TeacherOrder_TeacherItems_HST_Province_NS_2.1_2.1_PaymentPage |
	
	
  
  
    
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
	| CSR:TeacherOrder_StudentItems_GST_Province_AB_2.1_2.1_PaymentPage | 
	
	
  
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
	| CSR:TeacherOrder_TeacherItems_GST_Province_NT_2.1_2.1_PaymentPage |
	

@CSR_Payment 
@Priority1 
@Maintenance 
Scenario Outline:CSR is not charged with taxes for Student & Teacher Club items for Tax exempted schools-CSR:[<UsingData>] 

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
	| CSR:Payment:TeacherOrder_ItemsInCart_CreditCard_3 |
	

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
	| CSR:TeacherOrder_ItemsInCart_CreditCard_3 | 
	
	
	
