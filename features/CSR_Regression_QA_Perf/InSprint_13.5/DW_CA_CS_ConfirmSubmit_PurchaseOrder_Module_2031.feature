Feature: Confirm & Submit - Payment Module - Purchase Order
	This feature is to validate the Confirm & Submit - Payment Module - Purchase Order scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
	
@ConfirmSubmit_PurchaseOrder
@DWCACSR-2031
@Priority1
@1
Scenario Outline: CSR sees Amount Paid by Credit Card and Amount Paid by Purchase Order labels in the Payment section of Confirm & Submit page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart with minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Combination of Credit Card and PO as payment
And CSR selects [Add a New Card]
And CSR fills the Credit card and Billing information form
And CSR enters PO details
And CSR enters amount paid for PO
When CSR clicks on [Continue Checkout] button in Payment page
Then the label 'Amount Paid by Credit Card' and 'Amount Paid by Purchase Order' displays in the Payment section
And the amount entered is displayed for PO
#And the amount is displayed for credit card
Examples:
  | UsingData 												     |
  | Perf_QA_CSR_sees_correct_labels_Payment_Credit_PO_ConfirmSubmit_page |

@ConfirmSubmit_PurchaseOrder
@DWCACSR-2031
@Priority1
@2
Scenario Outline: CSR sees Amount Paid by Purchase Order label in the Payment section of Confirm & Submit page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart with minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Purchase Order as payment
And CSR enters PO details
When CSR clicks on [Continue Checkout] button in Payment page
Then the label 'Amount Paid by Purchase Order' displays in the Payment section
And the amount entered is displayed for PO
Examples:
  | UsingData 											  |
  | Perf_QA_CSR_sees_correct_labels_Payment_PO_ConfirmSubmit_page |