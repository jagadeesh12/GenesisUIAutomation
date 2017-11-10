Feature: Payment - Payment Method - Combo - Credit Card & PO - Validation
	This feature is to validate the Payment - Payment Method - Combo - Credit Card & PO - Validation Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-310
@Priority1
@1
Scenario Outline:Error message shown when Board/School Number not entered_310:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	And CSR enters card information
	And CSR enters valid PO Number in Purchase Order textbox
	#And CSR clicks on Continue Checkout in Payment page
	When CSR perform tab to move out on 'Board/ School Number' textbox
	Then CSR sees error message above 'Board/ School Number' textbox
	And CSR sees message 'A Board/School Number must be provided'
	
Examples:
  | UsingData               									|
  | QA_Payment_CombinationOfCreditCardPO_BoardSchoolNumber_Error	|


@PaymentMethod
@DWCACSR-310
@Priority1
@2
Scenario Outline:Error message shown when Account Number not entered_310:[<UsingData>]
	
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
	And CSR enters card information
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	When CSR perform tab to move out on [Account Number] textbox
	Then CSR sees error message above Account Number textbox with the text 'Please provide a unique number with the Purchase Order'
	
Examples:
  | UsingData               								|
  | QA_Payment_CombinationOfCreditCardPO_AccountNumber_Error	|


@PaymentMethod
@DWCACSR-310
@Priority1
@3
Scenario Outline:Error message shown when Board/School Number is not in AS400_310:[<UsingData>]
	
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
	And CSR enters card information
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	And CSR enters valid Account Number in Account textbox
	#And CSR clicks on Continue Checkout in Payment page
	Then CSR sees error message above 'Board/ School Number' textbox
	And CSR sees message ‘We cannot seem to locate the Board/School with the number provided’
	
Examples:
  | UsingData               												|
  | QA_Payment_CombinationOfCreditCardPO_BoardSchoolNumber_Not_In_AS400_Error	|


@PaymentMethod
@DWCACSR-310
@Priority1
@4
Scenario Outline:Continue checkout button disabled when Board/School Number is not provided_310:[<UsingData>]
	
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
  | UsingData               												|
  | QA_Payment_Combination_Of_Credit_Card_PO_BoardSchoolNumber_ButtonDisabled	|

  
@PaymentMethod
@DWCACSR-310
@Priority1
@5
Scenario Outline:Continue checkout button disabled when Account Number is not provided_310:[<UsingData>]
	
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
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	Then Continue Checkout button is disabled in Payment page
	
Examples:
  | UsingData               											|
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_ButtonDisabled	|

 
@PaymentMethod
@DWCACSR-310
@Priority1
@6
Scenario Outline:Error message shown when PO Number not entered_310:[<UsingData>]
	
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
	And CSR enters card information
	#And CSR clicks on Continue Checkout in Payment page
	And CSR perform tab to move out on [PO Number] textbox
	Then CSR sees error message above 'PO Number' textbox
	And CSR sees message 'A PO Number must be provided'
	
Examples:
  | UsingData               							|
  | QA_Payment_CombinationOfCreditCardPO_PONumber_Error	|

                                                                                     
