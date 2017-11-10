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
	#And StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly 
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
	#And StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly 
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
	
	
	
@CSR_Payment 
@Priority2 
Scenario Outline:CSR redeem dollars equal to Shipping Fee using Bonus Bank redemptions:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount equal to the [ShippingFee] in shipping Bonus Bank 
	When CSR navigates to Payment page 
	Then No. of items and Total(Post tax & post Redemptions) in Student Catalogues displays 
	And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Student Catalogues displays 
	And StudentClubsTotal(post Redemptions) displays 
	And No. of items and Total(Post tax & post Redemptions) in Teacher Catalogues displays 
	And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays 
	And TeacherCatalogues Total(Post tax & post Redemptions) displays 
	And Total(Post tax) displays in Shipping & Handling header 
	And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays 
	And Shipping & Handling Total(Post tax & post Redemptions) displays 
	And Total Amount Due displays Student Club total + TeacherCatalogues Total + Shipping Total 

Examples: 
	|UsingData|
	|CSR:Teacher_ShippingBonusBank__Equal_ShippingFeeAmt_Payment| 
	

@Priority1 @CSR_Payment @Shipping 
Scenario Outline:CSR charged with correct taxes for GST & QST on Shipping Fee with or without remdemptions on Payment page 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in Shipping Bonus Bank 
	And CSR enters amount in Shipping Paper coupons 
	When CSR navigates to Payment page 
	Then Shipping & Handling reflects cost of shipping & handling 
	And tax rates for GST & QST display correctly 
	And Bonus Bank Redeemed & Paper Bonus Coupons display with a '-'ve sign 
	And shipping & Handling Amount Owing(post tax & post redemptions) displays correctly 
	And Shipping & Handling Amount Owing displays correctly in the blue header 
	And Total Amount Owing displays correctly and it includes the shipping & Handling Amount Owing 

Examples: 
	|UsingData                        |
	| CSR:TeacherOrder_GST_QST_Province_QC_0_0|
	| CSR:TeacherOrder_GST_QST_Province_QC_2.2_2.2|
	| CSR:TeacherOrder_GST_QST_Province_QC_0_2|
	| CSR:TeacherOrder_GST_QST_Province_QC_5_0|
	

@Priority1 @CSR_Payment @Shipping 
Scenario Outline:CSR charged with correct taxes for HST on Shipping Fee with or without redemptions on Payment page 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in Shipping Bonus Bank 
	And CSR enters amount in Shipping Paper coupons 
	When CSR navigates to Payment page 
	Then Shipping & Handling reflects cost of shipping & handling 
	And tax rates for HST display correctly 
	And Bonus Bank Redeemed & Paper Bonus Coupons display with a '-'ve sign 
	And shipping & Handling Amount Owing(post tax & post redemptions) displays correctly 
	And Shipping & Handling Amount Owing displays correctly in the blue header 
	And Total Amount Owing displays correctly and it includes the shipping & Handling Amount Owing 

Examples: 
	|UsingData                        |
	| CSR:TeacherOrder_HST_Province_NS_0_0|
	| CSR:TeacherOrder_HST_Province_NS_2.2_2.2|
	| CSR:TeacherOrder_HST_Province_NB_0_2|
	| CSR:TeacherOrder_HST_Province_NL_5_0|
	
	
@Priority1 @CSR_Payment @Shipping 
Scenario Outline:CSR charged with correct taxes for GST on Shipping Fee with or without redemptions on Payment page 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in Shipping Bonus Bank 
	And CSR enters amount in Shippin Paper coupons 
	When CSR navigates to Payment page 
	Then Shipping & Handling reflects cost of shipping & handling 
	And tax rates for GST display correctly 
	And Bonus Bank Redeemed & Paper Bonus Coupons display with a '-'ve sign 
	And shipping & Handling Amount Owing(post tax & post redemptions) displays correctly 
	And Shipping & Handling Amount Owing displays correctly in the blue header 
	And Total Amount Owing displays correctly and it includes the shipping & Handling Amount Owing 

Examples: 
	|UsingData                        |
	| CSR:TeacherOrder_GST_Province_AB_0_0|
	| CSR:TeacherOrder_GST_Province_MB_2.2_2.2|
	| CSR:TeacherOrder_GST_Province_NT_0_2|
	| CSR:TeacherOrder_GST_Province_SK_5_0|
	
	
@Priority1 @CSR_Payment @Shipping 
Scenario Outline: CSR redeems entire shipping fee 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in Shipping Bonus Bank & paper coupons equal to the Shipping fee including taxes 
	When CSR navigates to Payment page 
	Then Shipping & Handling reflects cost of shipping & handling 
	And tax rates for GST display correctly 
	And Bonus Bank Redeemed & Paper Bonus Coupons display with value entered with '-'ve sign 
	And shipping & Handling Amount Owing is $0.00 
	And Shipping & Handling Amount Owing displays $0.00 in the blue header 
	And Total Amount Owing displays correctly and it includes the shipping & Handling Amount Owing 

Examples: 
	|UsingData                        | 
	| CSR:TeacherOrder_GST_Province_YT_5_0.25|
	

@Priority1 @CSR_Payment @Shipping 
Scenario Outline:Shipping Fee displays FREE on payment page when order qualifies for free shipping 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart greater than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR navigates to Payment page 
	Then Shipping & Handling displays FREE! in blue header 
	And the redemptions section does not display, only the blue header displays 

Examples: 
	|UsingData                        | 
	| CSR:TeacherOrder_GST_Province_YT|
	
	
@Priority1 @CSR_Payment @Shipping 
Scenario Outline:CSR charged with correct taxes for GST & PST on Shipping Fee with or without redemptions on Payment 
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR enters amount in Shipping Bonus Bank 
	And CSR enters amount in Shippin Paper coupons 
	When CSR navigates to Payment page 
	Then Shipping & Handling reflects cost of shipping & handling 
	And tax rates for GST & PST display correctly 
	And Bonus Bank Redeemed & Paper Bonus Coupons display with a '-'ve sign 
	And shipping & Handling Amount Owing(post tax & post redemptions) displays correctly 
	And Shipping & Handling Amount Owing displays correctly in the blue header 
	And Total Amount Owing displays correctly and it includes the shipping & Handling Amount Owing 
	
Examples: 
	|UsingData                        |
	| CSR:TeacherOrder_GST_PST_Province_BC_0_0|
	| CSR:TeacherOrder_GST_PST_Province_BC_2.2_2.2|
	| CSR:TeacherOrder_GST_PST_Province_BC_0_2|
	| CSR:TeacherOrder_GST_PST_Province_BC_5_0|
	
	
@ORPHAN @CSR_Payment @Priority1 @pops @Manual 
Scenario Outline:Correct totals and subtotals displayed when teacher creates order with student club with pops and navigates to Payment page 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR navigates to Payment page 
	And pops are displayed 
	When CSR selects pops 
	Then No. of items Total(Post tax & post Redemptions)in Student Clubs displays 
	And Bonus Bank Redemptions Paper Bonus coupon Redemptions POPs in Student Clubs displays 
	And StudentClubsTotal(Post tax & post Redemptions) displays correctly 
	And Total Amount Due displays correctly 
	
Examples: 
	| UsingData                     |
	| CSR:TeacherOrder_StudentClub_pops |
	
	
@ORPHAN @CSR_Payment @Priority1 @pops @Manual 
Scenario Outline:Correct totals and subtotals displayed when teacher creates order with student clubs and no pops selected  and navigates to Payment page 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds student items to the cart less than the [Shipping threshold] 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR navigates to Payment page 
	Then No. of items Total(Post tax & post Redemptions)in Student Clubs displays 
	And Bonus Bank Redemptions Paper Bonus coupon Redemptions POPs=0 in Student Clubs displays 
	And StudentClubsTotal(Post tax & post Redemptions) displays correctly 
	And Total Amount Due displays correctly 
	
Examples: 
	| UsingData                     |
	| CSR:TeacherOrder_StudentClub_pops |
