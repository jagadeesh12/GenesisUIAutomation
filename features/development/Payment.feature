Feature: Rewards and Coupons
	This feature is used to check the "Payment" scenario validation

 
Background: 
	Given teacher open rco-scholastic web site 

	
@Golden
@Example
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST without redemptions in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Student and Teacher clubs Total owing amount displays correctly
    Examples:
      | UsingData                                       		 |
      | Golden:TeacherOrder_GST_PST_Province_BC_0_0_0_0_payment  |
      
      
@Golden
@Example
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student redemptions in Payment page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                       		 |
      | Golden:TeacherOrder_GST_PST_Province_BC_2_2_0_0_payment  |   
      
      
@Golden  
@Example
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with teacher redemptions in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_0_0_2_2_payment         |     
      
      
@Golden  
@Payment
@Priority1
  Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student&Teacher redemptions in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_payment | 
      
       
       
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST without redemptions against 'QC' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_0_0_0_0_payment  |
      
      
@Golden
@Example
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Student redemptions against 'QC' Province in Payment page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_2_2_0_0_payment         |
           
           
           
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Teacher redemptions against 'QC' Province in Payment page:[<UsingData>]

   Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_0_0_2_2_payment         |          
                              
                              
@Golden  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Student and Teacher redemptions against 'QC' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly
    Examples:
      | UsingData                                        |
      | Golden:TeacherOrder_GST_QST_Province_QC_2.1_2.1_2.1_2.1_payment |
                              
       
       
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST without redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_0_0_0_0_payment         |      
      
      
@Golden
@Example  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Student redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_2_2_0_0_payment         | 
      
      
@Golden
@Example 
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Teacher redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_0_0_2_2_payment         |
      
      
@Golden  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Student and Teacher redemptions against 'NL' Province in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	Then StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_HST_Province_NL_2.1_2.1_2.1_2.1_payment |
      
      
@Golden
@Example
@Payment
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST without redemptions against 'NU' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page2
Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
And Student and Teacher clubs Total owing amount displays correctly
	
    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_0_0_0_0_payment         |     
      
      
@Golden
@Example
@Payment
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Student redemptions against 'NU' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page2
Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
And Student and Teacher clubs Total owing amount displays correctly

    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_2_2_0_0_payment         |
       
       
@Golden
@Example 
@Payment
@Priority1
@Maintenance
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Teacher redemptions against 'NU' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page2
Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
And Student and Teacher clubs Total owing amount displays correctly

    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_0_0_2_2_payment         |      
      
      
@Golden  
@Payment
@Priority1
  Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Student and Teacher redemptions against 'NU' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When Teacher navigates to Payments page2
Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
And Student and Teacher clubs Total owing amount displays correctly

    Examples:
      | UsingData                                    |
      | Golden:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1_payment |   
      
      
@Golden
@Payment
@Priority1
  Scenario Outline: Teacher selects passed expiration date in combination of credit card and checks in Payment page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	When teacher enters passed expiration date and valid information in all other fields
	And Teacher enter amount to be paid by credit card
	When user unsave the card
	And teacher clicks on "Continue checkout"
	Then teacher sees expired card error message
	
Examples:
  | UsingData                             |
  | Golden:TeacherOrder_ItemsInCart_CreditCard_2 |  
      
      
@Golden
@Payment
@Priority1
Scenario Outline: Teacher places an order with Checks as payment in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigate to Payment page
When teacher selects checks as payment
And teacher clicks on "Continue checkout"
Then teacher views Amount paid by checks with check amount
And teacher submit the order
And teacher views Amount paid by checks with check amount
	
	
Examples:
  | UsingData                          	  	 |
  | Golden:TeacherOrder_ItemsInCart_checks_2 |
  
  
 
@Golden	
@bvt
@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card with combination of cc and checks as payment to checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects combination of credit card and cheques as payment
When teacher selects saved credit card and valid information in all other fields
And teacher clicks on "Continue checkout"
Then teacher views Amount paid by Credit card and Amount paid by Cheques correctly
And teacher clicks on Submit Order
And teacher views Amount paid by Credit Card and Amount paid by Cheques correctly in ConfirmationPage
Examples:
  | UsingData                                               |
  | Golden:TeacherOrder_ItemsInCart_SavedCreditCard_Visa_Check     |  
  


@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & PST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_StudentItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
 
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & PST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigates to Payments page3
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_TeacherItems_GST_PST_Province_BC_2.1_2.1_PaymentPage |
  
  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_StudentItems_GST_QST_Province_QC_2.1_2.1_PaymentPage | 
  
  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigate to Payment page
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                                |
  | TeacherOrder_TeacherItems_GST_QST_Province_QC_2.1_2.1_PaymentPage |  
  
  
  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club items for HST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_StudentItems_HST_Province_NB_2.1_2.1_PaymentPage |
  
  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for HST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigate to Payment page
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_TeacherItems_HST_Province_NS_2.1_2.1_PaymentPage |
  
  
  
  
    
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal for Student Club items for GST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in student Bonus Bank
	And teacher enters amount in student Paper coupons
	And teacher clicks on Apply in Students section
	And Teacher navigates to Payments page2
	Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
	And Student club Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_StudentItems_GST_Province_AB_2.1_2.1_PaymentPage | 
  
  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher charged with correct subtotal on Teacher Club items for GST with redemptions in Payment Page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And teacher enters amount in teacher Bonus Bank
	And teacher enters amount in teacher Paper coupons
	And teacher clicks on Apply in teacher section
	And Teacher navigate to Payment page
	Then TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
	And Teacher Catalogues Total owing amount displays correctly
Examples:
  | UsingData                            |
  | TeacherOrder_TeacherItems_GST_Province_NT_2.1_2.1_PaymentPage |


@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools-BTS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page_2
	And Teacher navigates to Payments page
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page
	
	
Examples:
  | UsingData                             |
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_3 |
  
  
      
@Payment
@Priority1
Scenario Outline:when flag is set to true teacher sees alternate shipping-BTS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	
	
Examples:
  | UsingData                             		|
  | BTS:Payment:TeacherOrder_ItemsInCartAlternateFlag_True 	|   
  
  
@Payment
@Priority1
Scenario Outline:Teacher can proceed to checkout if she does not want alternate shipping-BTS:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	When teacher selects cheques as payment
	And teacher clicks on "Continue checkout"
	Then School address displays in Shipping address section
	When teacher clicks on Submit Order
	Then School address displays in Shipping address section
	
	
Examples:
  | UsingData                   		|
  | BTS:Payment:TeacherOrder_ItemsInCart 	|    
  
  
@Payment
@Priority1
Scenario Outline:Teacher creates an order shipping to alternate address:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	When teacher selects cheques as payment
	And teacher selects alternate shipping option
	And teacher fills alternate shipping address details
	And teacher clicks on "Continue checkout"
	Then teacher views alternate shipping address with text “Alternate Shipping Address” after the address on Confirm & Submit page
	When teacher clicks on Submit Order
	Then teacher views alternate shipping address with text “Alternate Shipping Address” on Submitted page
	
	
Examples:
  | UsingData        					           		|
  | BTS:Payment:TeacherOrder_ItemsInCart_alternateShipping 	| 
  
  
 
@Payment
@Priority1
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Visa:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Visa 		|
  
  
@Payment
@Priority1
@Maintenance
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Amex:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Amex 		|

  
  
@Payment
@Priority1
@Maintenance
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Master:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Master 		|

  
  
@Payment
@Priority1
@Maintenance
@SCSCOD-3667
Scenario Outline:Teacher enters credit card from Billing and payment-Discover:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	Then the credit card is saved
	
	
Examples:
  | UsingData        					           			|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Discover 	|      
      
  
@Payment
@Priority1
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-visa:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Visa_2 		|  



@Payment
@Priority1
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-Amex:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Amex_2 		|

  
  
@Payment
@Priority1
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-Master:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Master_2 	|

  
        
@Payment
@Priority1
@Maintenance
@SCSCOD-3882
Scenario Outline:Teacher enters new credit card with combination of cc and checks as payment to checkout-Discover:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items from different Student clubs same months
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	And teacher selects combination of credit card and cheques as payment
	And user selects Add a New card
	Then user fills [CreditCardInformation] for the credit card 
	When user unsave the card
	And Teacher enter amount to be paid by credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card and Cheques correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card and Cheques correctly
	
Examples:
  | UsingData                             					|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_Discover_2 	|
  
    
@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card to checkout-Visa:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Visa 		| 


@Payment
@Priority1
Scenario Outline:Teacher selects saved credit card to checkout-Amex:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Amex 		| 

  
  
@Payment
@Priority1
@Maintenance
Scenario Outline:Teacher selects saved credit card to checkout-Master:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Master 	| 

  
  
@Payment
@Priority1
@Maintenance
@SCSCOD-3882
Scenario Outline:Teacher selects saved credit card to checkout-Discover:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	And teacher comes to Home page
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	When teacher selects saved credit card
	And teacher clicks on "Continue checkout"
	Then teacher views Amount paid by Credit Card correctly
	When teacher clicks on Submit Order
	And teacher views Amount paid by Credit Card correctly
	
Examples:
  | UsingData                             						|
  | BTS:Payment:TeacherOrder_ItemsInCart_SavedCreditCard_Discover 	|     



@Golden
@Payment
@Priority1
Scenario Outline:Teacher is not charged with taxes for Student & Teacher Club items for Tax exempted schools:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page_2
	And Teacher navigates to Payments page
	Then no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page
	
	
Examples:
  | UsingData                             |
  | Golden:TeacherOrder_ItemsInCart_CreditCard_3 | 
  

@Golden  
@Payment
@Priority1
Scenario Outline:when flag is set to true teacher sees alternate shipping:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	Then teacher sees alternate shipping option
	
	
Examples:
  | UsingData                             		|
  | Golden:TeacherOrder_ItemsInCartAlternateFlag_True 	| 
  
  
   #################		PRIORITY 2       ###########################
  
  
@Payment
@Priority2
@SCSCOD-4033
Scenario Outline: Teacher redeem dollars equal to Shipping Fee using Bonus Bank redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
And teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank
When teacher navigates to Payment page 
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
|BTS:Teacher_ShippingBonusBank__Equal_ShippingFeeAmt_Payment| 


@Payment
@Priority2
Scenario Outline: Teacher does not view payment methods when order total is 0 because of redemptions:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart less than [Shipping Threshold]
And teacher navigates to coupons & Rewards page
And teacher enters amount in student Bonus Bank equal to Student Club total
And teacher enters amount in teacher Bonus Bank equal to Teacher Club total
And teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank
When teacher navigate to payment page
Then payments dropdown is disabled
And teacher can submit order without selecting payment method


Examples: 
|UsingData|
|BTS:Teacher_allredemptions__Equal_totalAmt_checkout_Payment|


@Payment
@Priority2
Scenario Outline:Teacher does not enter address1 in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [postal code], [city] and [province]
Then Continue Checkout button should be disabled


Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_Address1Miss|


@Payment
@Priority2
Scenario Outline:Teacher does not enter address2 in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [postal code], [city] and [province]
And teacher clicks on "Continue checkout"
Then teacher lands on Confirm and Submit page

Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_Address2Miss|



@Payment
@Priority2
Scenario Outline:Teacher does not enter postal code in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [city] and [province]
Then Continue Checkout button should be disabled

Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_PostalcodeMiss|



@Payment
@Priority2
Scenario Outline:Teacher does not enter City in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [postal code] and [province]
Then Continue Checkout button should be disabled

Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_CityMiss|




@Payment
@Priority2
Scenario Outline:Teacher does not enter province in alternate shipping and proceeds to checkout:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
And teacher selects cheques as payment
When teacher selects alternative shipping and enters only [address1], [city] and [postal code]
Then Continue Checkout button should be disabled



Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_alternateShipping_StateMiss|



@Payment
@Priority2
Scenario Outline:Teacher selects saved expired credit card:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher navigate to My Account page and make sure expired card is present
And teacher navigates to home page
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
When teacher selects credit card as payment and try to look for expired card
Then no credit card is seen in the list


Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_savedExpiredCreditCard|


@Payment
@Priority2
Scenario Outline:Teacher selects saved expired credit card from Combination of Credit card and checks:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher navigate to My Account page and make sure expired card is present
And teacher navigates to home page
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And Teacher navigates to Payments page
When teacher selects combination of credit card and checks as payment and try to look for expired card
Then no credit card is seen in the list


Examples: 
|UsingData|
|BTS:TeacherOrder_ItemsInCart_savedExpiredCreditCard_Cheque|


########################### PRIORITY 3 #########################

@Payment
@Priority3
Scenario Outline:Teacher selects passed expiration date in credit card form:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	When Teacher adds items from different Student and Teacher clubs
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	And Teacher navigates to Payments page
	When user selects payment method as creditCard
	And user selects Add a New card
	When teacher enters passed expiration date and valid information in all other fields
	When user unsave the card
	And teacher clicks on "Continue checkout"
	Then teacher sees expired card error message
	
Examples:
  | UsingData                             		|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard |
     
     
@Payment
@Priority3
@TODO
Scenario Outline:Teacher selects passed expiration date from Billing and payment:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account
	And teacher clicks on Billing and Payments
	And teacher clicks on Add a card
	When teacher enters [credit card info] in MyAccount Page
	And teacher click on Save
	#Then teacher sees error message displays
	
	
Examples:
  | UsingData        					           		|
  | BTS:Payment:TeacherOrder_ItemsInCart_CreditCard_2 		|
  