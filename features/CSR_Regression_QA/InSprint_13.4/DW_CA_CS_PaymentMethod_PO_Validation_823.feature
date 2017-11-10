Feature: Payment - Payment Method - Purchase Order - Validation
	This feature is to validate the Payment - Payment Method - Purchase Order - Validation Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod_PO
@DWCACSR-823
@Priority1
@1
Scenario Outline:Error message shown when PO Number not entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Purchase Order as payment
	And CSR clicks on Continue Checkout in Payment page
	Then CSR sees error message above 'PO Number' textbox
	And CSR sees message 'A PO Number must be provided'
	
Examples:
  | UsingData               				|
  | QA_Payment_PurchaseOrder_PONumber_Error    |
 

@PaymentMethod_PO
@DWCACSR-823
@Priority1
@2
Scenario Outline:Error message shown when Board or School Number not entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Purchase Order as payment
	And CSR enters valid PO Number in Purchase Order textbox
	When CSR clicks on Continue Checkout in Payment page
	Then CSR sees error message above 'Board/ School Number' textbox
	And CSR sees message 'A Board/School Number must be provided'
	
Examples:
  | UsingData               						|
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_Error   |
 

@PaymentMethod_PO
@DWCACSR-823
@Priority1
@3
Scenario Outline:Error message shown when Account Number not entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Purchase Order as payment
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	And CSR clicks on Continue Checkout in Payment page
	Then CSR sees error message above 'Account Number' textbox
	And CSR sees message 'An Account Number must be provided e.g. 99'
	
Examples:
  | UsingData               					|
  | QA_Payment_PurchaseOrder_AccountNumber_Error   |
 
 