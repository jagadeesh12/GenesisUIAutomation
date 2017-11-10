Feature: Validation of CSR stories for Sprint 14.5
	This feature is used to validate the Sprint 14.5 stories for CSR
	
Background:
	Given CSR opens the rco-scholastic web site
    
##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6119    	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@ConfirmSubmit_PurchaseOrder
@CSR
@SCSCOD-6119
@Priority1
@Sprint-14.5
Scenario Outline: CSR only sees Amount Paid by Purchase Order label in the Payment section of Confirm and Submit page:[<UsingData>]
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
And CSR enters amount paid for PO as the same as the total order amount
When CSR clicks on [Continue Checkout] button in Payment page
Then the label 'Amount Paid by Purchase Order' displays in the Payment section
And the amount entered is displayed for PO
Examples:
  | UsingData 												       |
  | QA:CSR_sees_correct_labels_Payment_Credit_PO_POOnly_ConfirmSubmit |
  
@ConfirmSubmit_PurchaseOrder
@CSR
@SCSCOD-6119
@Priority1
@Sprint-14.5
Scenario Outline: CSR only sees Amount Paid by Credit Card label in the Payment section of Confirm and Submit page:[<UsingData>]
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
And CSR enters amount paid for credit card as the same as the total order amount
When CSR clicks on [Continue Checkout] button in Payment page
Then the label 'Amount Paid by Credit Card' displays in the Payment section
And the amount entered is displayed for credit card
Examples:
  | UsingData 												     		   |
  | QA:CSR_sees_correct_labels_Payment_Credit_PO_CreditCardOnly_ConfirmSubmit |