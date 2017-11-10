Feature: Payment - Payment Method - Combo - Credit Card & PO - Billing Information
	This feature is to validate the Payment - Payment Method - Combo - Credit Card & PO - Billing Information Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-1187
@Priority1
@1
Scenario Outline:CSR sees Canada is selected by default for the Country drop down list in Billing Information section_1187:[<UsingData>]
	
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
	Then the country field is selected [Canada] by default
	And the country field drop down has [United States] option
	
Examples:
  | UsingData               														|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_Canada_selected_by_default  	|
 
  

@PaymentMethod
@DWCACSR-1187
@Priority1
@2
Scenario Outline:CSR sees all 13 provinces in the Province drop-down when Canada is selected in Billing Information section_1187:[<UsingData>]
	
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
	Then the 'Province' drop-down has the 13 provinces in Canada
	
Examples:
  | UsingData               								|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_All_Provinces  	|
 
 
 
@PaymentMethod
@DWCACSR-1187
@Priority1
@3
Scenario Outline:The labels for Postal Code and Province, drop-down values for the Province changes when US is selected in the Country drop-down:[<UsingData>]
	
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
	And CSR selects 'United States' in the 'Country' drop-down
	Then the 'Postal Code' label changes to 'Zip' label
	And the 'Province' label changes to 'State' label
	And the placeholder for the State drop-down displays 'Select Province/State'
	And the 'States' drop-down has the 50 states in alphabetical order
	
Examples:
  | UsingData               										|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_US_selected  |
 

@PaymentMethod
@DWCACSR-1187
@Priority1
@4
Scenario Outline:Error message shown when invalid phone number is entered:[<UsingData>]
	
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
	And CSR enters invalid phone number without hyphens in the 'Phone Number' textbox
	And CSR clicks outside the textbox of Phone Number field
	Then the an error message should be displayed
	
Examples:
  | UsingData               															|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_InvalidPhoneNum  				|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_InvalidPhoneNum_Starts_with_zero |
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_InvalidPhoneNum_Starts_with_one  |
  
 
@PaymentMethod
@DWCACSR-1187
@Priority1
@5
Scenario Outline:Phone number without hyphens should be formatted automatically when entered:[<UsingData>]
	
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
	And CSR enters valid phone number without hyphens in the 'Phone Number' textbox
	Then the phone number in the textbox has an hyphen between the 3rd and 4th number and the 6th and 7th number
	
Examples:
  | UsingData               											|
  | Perf_QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_ValidPhoneNum  	|

                  