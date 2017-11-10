Feature: Payment - Payment Method - Combo - Credit Card & PO -  Amount to be Paid
	This feature is to validate the Payment - Payment Method - Combo - Credit Card & PO -  Amount to be Paid Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-1190
@Priority1
@1
Scenario Outline:CSR enters with more than two decimal place in the amount to be paid by credit card field_1190:[<UsingData>]
	
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
	And CSR enters amount in credit card field and clicks on outside
	Then CSR only see first two values after decimal point in credit card field
	
Examples:
  | UsingData               								|
  | Perf_QA_CSR_three_decimals_amount_to_be_paid_by_credit_card     |
  
 
@PaymentMethod
@DWCACSR-1190
@Priority1
@2
Scenario Outline:CSR enters with more than two decimal place in the amount to be paid by purchase order field_1190:[<UsingData>]
	
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
	And CSR enters amount in purchase order field and clicks on outside
	Then CSR only see first two values after decimal point in purchase order field
	
Examples:
  | UsingData               					|
  | Perf_QA_CSR_three_decimals_amount_to_be_paid_by_PO  |
  

@PaymentMethod
@DWCACSR-1190
@Priority1
@3
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field_1190:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount in [PO fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               		      |
  | Perf_QA_CSR_amount_to_be_paid_by_credit_card  |
  

@PaymentMethod
@DWCACSR-1190
@Priority1
@4
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field2_1190:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [PO fld]
	When CSR clicks outside the PO fld textbox
	Then CSR sees the amount in [Credit Card fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               	 |
  | Perf_QA_CSR_amount_to_be_paid_by_PO  |
  

@PaymentMethod
@DWCACSR-1190
@Priority1
@5
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field_1190:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount 0.00 in [PO fld]
	
Examples:
  | UsingData               		      		|
  | Perf_QA_CSR_over_amount_to_be_paid_by_credit_card 	|


@PaymentMethod
@DWCACSR-1190
@Priority1
@6
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field2_1190:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [PO fld]
	When CSR clicks outside the PO fld textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               		    |
  | Perf_QA_CSR_over_amount_to_be_paid_by_PO 	|


@PaymentMethod
@DWCACSR-1190
@Priority1
@7
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field_1190:[<UsingData>]
	
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
	And CSR enters the total amount in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount 0.00 in [PO fld]
	
Examples:
  | UsingData               		      			|
  | Perf_QA_CSR_over_amount_to_be_paid_by_credit_card_2 	|


@PaymentMethod
@DWCACSR-1190
@Priority1
@8
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field2_1190:[<UsingData>]
	
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
	And CSR enters the total amount in [PO fld]
	When CSR clicks outside the PO fld textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               		    |
  | Perf_QA_CSR_over_amount_to_be_paid_by_PO_2 	|
                                      