Feature: Payment - Payment Method - Combo - Card & Cheque - Select Card
	This feature is to validate the Payment - Payment Method - Combo - Card & Cheque - Select Card Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-1192
@Priority1
@1
Scenario Outline:'Select a Card' drop-down has correct layout when 'Combination of Credit Card and Cheque' option is selected on Payment page_1192:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	When CSR selects 'Select a Card' drop-down
	Then CSR sees the label 'Add a New Card' under the 'Select a Card' drop-down
	And CSR sees all saved cards under the 'Add a New Card' label
	
Examples:
  | UsingData               											|
  | QA_Payment_CombinationOfCreditCardCheques_SelectCardDropDown_Layout    |
  
  

