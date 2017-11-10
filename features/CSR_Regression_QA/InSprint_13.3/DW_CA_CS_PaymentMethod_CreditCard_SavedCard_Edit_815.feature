Feature: Payment - Payment Method - Credit Card - Saved Card - Edit - Billing Information
	This feature is to validate the Payment - Payment Method - Credit Card - Saved Card - Edit - Billing Information Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-815
@Priority1
@1
Scenario Outline:CSR sees all 13 provinces in the Province drop-down when Canada is selected in Billing Information section_815:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects saved Credit Card
	And CSR selects 'Edit' hyperlink
	And CSR selects [Canada] in the Country drop-down
	When CSR clicks on Province drop down list in Billing Info section
	Then the province drop down list displays 13 Canadian provinces in Billing Info section
	And provinces list displays in ascending order in Billing Info section
	
Examples:
  | UsingData               					|
  | QA_Payment_SavedCreditCard_All_Provinces_815  	|
 
  
@PaymentMethod
@DWCACSR-815
@Priority1
@2
Scenario Outline:Phone number without hyphens should be formatted automatically when entered_815:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects saved Credit Card
	And CSR selects 'Edit' hyperlink
	When CSR enters valid phone number without hyphens in the 'Phone Number' textbox
	Then the phone number in the textbox has an hyphen between the 3rd and 4th number and the 6th and 7th number
	
Examples:
  | UsingData               									|
  | QA_Payment_SavedCreditCard_Billing_Info_ValidPhoneNum_815  	|
 
 
@PaymentMethod
@DWCACSR-815
@Priority1
@3
Scenario Outline:The labels for Postal Code and Province, drop down values for the Province changes when US is selected in the Country drop-down_815:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects saved Credit Card
	And CSR selects 'Edit' hyperlink
	And CSR selects 'United States' in the Country drop-down
	Then the 'Postal Code' label changes to 'Zip' label
	And the 'Province' label changes to 'State' label
	And the placeholder for the State drop-down displays 'Select Province/State'
	And the 'States' drop-down has the 52 states in alphabetical order
	
Examples:
  | UsingData               							|
  | QA_Payment_SavedCreditCard_Billing_Info_US_selected  	|
 
    