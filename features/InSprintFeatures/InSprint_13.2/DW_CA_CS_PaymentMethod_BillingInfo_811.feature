Feature: Payment - Payment Method - Credit Card - Add A New Card - Billing Information
	This feature is to validate the Payment - Payment Method - Credit Card - Add A New Card - Billing Information Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@PaymentMethod_BillingInfo
@DWCACSR-811
@Priority1
@Manual
@1
Scenario Outline:CSR sees the correct labels displayed for the Payment method when he selects Credit card and Add a New Card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	When CSR selects [Add a New Card]
	Then the header label displays 'Billing Information' for the Billing information section
	And the label displays 'FIRST NAME' with the text box
	And the label displays 'LAST NAME' with the text box next to the [FIRST NAME] field
	And the label displays 'Address 1' with the text box below the [FIRST NAME] field
	And the label displays 'Address 2' with the text box next to the [Address 1] field
	And the label displays 'Postal Code' with the text box below the [Address 1] field
	And the label displays 'City' with the text box next to the [Postal Code] field
	And the label displays 'Province' with the drop down list below the [Postal Code] field
	And the placeholder displays 'Select Province/State' for the [Province] drop down list
	And the label displays 'Country' with the drop down list next to the [Province] field
	And the label displays 'PHONE NUMBER' with the text box below the [Province] field
	And the text displays 'Example: 333-333-3333' below the [PHONE NUMBER] field
	
	
Examples:
  | UsingData               						|
  | Payment_Credit_Card_Add_NewCard_Billing_info	|		
  

@PaymentMethod_BillingInfo
@DWCACSR-811
@Priority1
@Manual
@2
Scenario Outline:CSR sees Canada is selected by default for the Country drop down list in Billing Information section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	When CSR selects [Add a New Card]
	Then the country field is selected [Canada] by default
	And the country field drop down has [United States] option
	
	
Examples:
  | UsingData               			|
  | Payment_Canada_selected_by_default	|		
  

