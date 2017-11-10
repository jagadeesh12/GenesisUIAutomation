Feature: Payment - Payment Method - Combo - New Card & Cheque - Card Details
	This feature is to validate the Payment - Payment Method - Combo - New Card & Cheque - Card Details Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site
 
@PaymentMethod
@DWCACSR-313
@Priority1
@1
Scenario Outline:The months under the Expiration Date label are shown in the correct order and format_313:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	When CSR selects [Add a New Card]
	When CSR selects the left drop-down box under 'Expiration Date:' label
	Then the drop-down menu should have values from 1 to 12
	#And all single digits begin with 0
	
Examples:
  | UsingData               							|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_Months_313  	|
 
  
@PaymentMethod
@DWCACSR-313
@Priority1
@2
Scenario Outline:The selected year under the Expiration Date label is not shown in the drop-down menu when accessed:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	And CSR selects [Add a New Card]
	And CSR selects the right drop-down box under 'Expiration Date:' label
	And CSR selects [Year]
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then [Year] is not shown in the drop-down box
	
Examples:
  | UsingData               						|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_Year1  	|
 

@PaymentMethod
@DWCACSR-313
@Priority1
@3
Scenario Outline:Security Card character limit:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	And CSR selects [Add a New Card]
	When CSR enters characters more than 4 in the Security Code textbox
	Then the Security Code does not accept more than 4 characters
	
Examples:
  | UsingData               									|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_5_Char_SecurityCode  |
  
  
@PaymentMethod
@DWCACSR-313
@Priority1
@4
Scenario Outline:The years under the Expiration Date label are shown in the correct order and for the next 20 years_313:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	And CSR selects [Add a New Card]
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then the right drop-down has values of the years ranging from the current system year to the next 20 years
	
Examples:
  | UsingData               						|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_Years  	|
   

@PaymentMethod
@DWCACSR-313
@Priority1
@5
Scenario Outline:Credit Card image shows to the far right in the Card textbox when a valid card is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	And CSR selects [Add a New Card]
	When CSR enters a valid card in the 'Card #' textbox
	Then an image is shown to the far right in the 'Card #' textbox
	
Examples:
  | UsingData               							|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_VISACard  	|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_MasterCard  	|
  | Perf_QA_Payment_CombinationOfCreditCardCheques_AMEXCard  	|
  
  
     