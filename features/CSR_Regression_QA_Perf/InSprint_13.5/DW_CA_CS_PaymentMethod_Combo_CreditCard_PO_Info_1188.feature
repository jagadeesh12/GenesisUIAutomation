Feature: Payment - Payment Method - Combo - Credit Card & PO - PO Information
	This feature is to validate the Payment - Payment Method - Combo - Credit Card & PO - PO Information Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-1188
@Priority1
@1
Scenario Outline:CSR enters invalid values in Board/School Number textbox_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters invalid entry in Board/School Number textbox
	Then Board/School Number textbox rejects the input
	
Examples:
  | UsingData               										|
  | Perf_QA_Payment_PurchaseOrder_BoardSchoolNumber_1_Integer             	|
  | Perf_QA_Payment_PurchaseOrder_BoardSchoolNumber_9_Integers             	|
  | Perf_QA_Payment_PurchaseOrder_BoardSchoolNumber_AlphanumericCharacters 	|
  | Perf_QA_Payment_PurchaseOrder_BoardSchoolNumber_SpecialCharacters      	|
 
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@2
Scenario Outline:CSR can enter at most 20 alphanumeric characters in Purchase Order textbox_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters valid PO Number in Purchase Order textbox
	Then Purchase Order textbox accepts the input
	
Examples:
  | UsingData               												 |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_PONumber_1_AlphanumericCharacter   |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_PONumber_20_AlphanumericCharacters |  
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@3
Scenario Outline:Continue checkout button disabled when Board/School Number is not provided_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Account Number in Account textbox
	Then Continue Checkout button is disabled in Payment page
	
Examples:
  | UsingData               												 |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_BoardSchoolNumber_ButtonDisabled   |     
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@4
Scenario Outline:CSR enters invalid characters in Purchase Order textbox_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters invalid characters in Purchase Order textbox
	Then Purchase Order textbox rejects the input
	
Examples:
  | UsingData               												 |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_PONumber_SpecialCharacters         |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_PONumber_21_AlphanumericCharacters |  
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@5
Scenario Outline:CSR enters between 2 and 8 integers in Account Number textbox_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters valid entry in Account Number textbox
	Then Account Number textbox accepts the input
	
Examples:
  | UsingData               									   |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_2_Integers |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_8_Integers |
  

@PaymentMethod
@DWCACSR-1188
@Priority1
@6
Scenario Outline:CSR enters invalid values in Account Number textbox_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters invalid entry in Account Number textbox
	Then Account Number textbox rejects the input
	
Examples:
  | UsingData               									   			  |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_1_Integer             |  
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_9_Integers            |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_AlphabeticalCharacters|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_SpecialCharacters     |
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@7
Scenario Outline:CSR can select only one radio button_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR selects a radio button
	Then the other radio buttons should remain unselected
	
Examples:
  | UsingData               									|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_RadioButton_OnlyOne   |    
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@8
Scenario Outline:Radio button labelled PUB:Backorders Allowed selected by default_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	Then CSR sees radio button labelled ‘PUB (Backorders Allowed)’ selected
	
Examples:
  | UsingData               									|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_RadioButton_Default   |    
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@9
Scenario Outline:Error message shown when CSR clicks or tabs out of PO Number textbox without entering PO Number_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR selects Purchase Order textbox
	And CSR clicks outside the Purchase Order textbox
	Then CSR sees error message above Purchase Order textbox
	
Examples:
  | UsingData               									|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_ErrorMessage_NoInput  |    
 
 
@PaymentMethod
@DWCACSR-1188
@Priority1
@10
Scenario Outline:Error message shown when CSR clicks or tabs out of Account Number textbox without entering Account Number_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR selects Account Number textbox
	And CSR clicks outside the Account Number textbox
	Then CSR sees error message above Account Number textbox
	
Examples:
  | UsingData               										|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_ErrorMessage_NoInput_2  	|    
          
          
@PaymentMethod
@DWCACSR-1188
@Priority1
@11
Scenario Outline:Error message shown when CSR clicks or tabs out of Board/School Number textbox without entering Board/School Number_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR selects Board/School Number textbox
	And CSR clicks outside the Board/School Number textbox
	Then CSR sees error message above Board/School Number textbox
	
Examples:
  | UsingData               										|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_ErrorMessage_NoInput_3  	|    
                      
                      
@PaymentMethod
@DWCACSR-1188
@Priority1
@12
Scenario Outline:CSR enters between 2 and 8 integers in Board/School Number textbox_1188:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	When CSR selects [Add a New Card]
	And CSR enters valid entry in Board/School Number textbox
	Then Board/School Number textbox accepts the input
	
Examples:
  | UsingData               							|
  | Perf_QA_Payment_PurchaseOrder_BoardSchoolNumber_2_Integers  |
  | Perf_QA_Payment_PurchaseOrder_BoardSchoolNumber_8_Integers  |
                                                                               