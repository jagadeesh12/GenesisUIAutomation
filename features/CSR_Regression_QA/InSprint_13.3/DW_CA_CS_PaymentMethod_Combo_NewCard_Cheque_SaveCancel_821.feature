Feature: Payment - Payment Method - Combo - New Card & Cheque - Save or Cancel
	This feature is to validate the Payment - Payment Method - Combo - New Card & Cheque - Save or Cancel Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@PaymentMethod
@DWCACSR-821
@Priority1
@1
Scenario Outline:CSR sees the checkbox with the label 'Save this card' in the Billing Information section of Payment page_821:[<UsingData>]
	
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
	Then the checkbox with the label 'Save this card' displays below the [Phone Number] field
	
Examples:
  | UsingData               						|
  | QA_Payment_Billing_info_SaveThisCard_checkbox_821	|		
  

@PaymentMethod
@DWCACSR-821
@Priority1
@2
Scenario Outline:CSR sees the Saved Card in a list when he selects the Save Card checkbox in Billing Information section in Payment page_821:[<UsingData>]
	
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
	And CSR fills the Credit card and Billing information form
	And CSR saves the card
	And CSR enters the amount to be paid by Credit card
	And CSR clicks on Continue Checkout in Payment page
	And CSR navigates to [Payment] page
	When CSR selects Credit Card as payment
	Then Saved Credit Card displays in the list
	
Examples:
  | UsingData               									|
  | QA_Payment_SavedCard_displays_when_selects_SaveThisCard_821	|		
  

@PaymentMethod
@DWCACSR-821
@Priority1
@3
Scenario Outline:Billing Information field section disappears when CSR clicks on Cancel button_821:[<UsingData>]
	
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
	When CSR clicks on [Cancel] button in Billing Information section
	Then the Billing Information field section disappears
		
Examples:
  | UsingData               						|
  | QA_Payment_Billing_info_disappears_on_Cancel_821	|
  
  
@PaymentMethod
@DWCACSR-821
@Priority1
@4
Scenario Outline:CSR sees no Saved Card in a list when he de-selects the Save Card checkbox in Billing Information section in Payment page_821:[<UsingData>]
	
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
	And CSR fills the Credit card and Billing information form
	And CSR unsave the card
	And CSR enters the amount to be paid by Credit card
	And CSR clicks on Continue Checkout in Payment page
	And CSR navigates to [Payment] page
	When CSR selects Credit Card as payment
	Then there is no Saved Credit Card displayed in the list
		
Examples:
  | UsingData               										|
  | QA_Payment_SavedCard_not_displayed_when_de_select_SaveThisCard_821	|
    		
  