Feature: Payment - Payment Method - Credit Card - Add A New Card - Card Details
	This feature is to validate the Payment - Payment Method - Credit Card - Add A New Card - Card Details Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@PaymentMethod
@DWCACSR-306
@Priority1
@Manual
@1
Scenario Outline:CSR sees the correct labels in a New Card information layer when he selects Credit card and Add a New Card in Payment page:[<UsingData>]
	
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
	Then Po Number field section displays
	And card information fields section displays
	And Billing information section displays
	And the label 'Name on Card' with the text box displays within the New Card information layer
	And the label 'Card #' with the text box displays
	And the text 'We accept American Express, Visa, and MasterCard only.' displays below the [Card] field
	And the label 'Expiration Date:' with two select drop down list [Month] and [Year] displays
	And [Month] drop down list contains the options from 01 to 12
	And the [Year] drop down list contains next 20 years as options starting with the current system year
	And the label 'Security Code' displays with the text box
	
Examples:
  | UsingData               			|
  | Payment_NewCard_information_layer	|		
  

@PaymentMethod
@DWCACSR-306
@Priority1
@2
Scenario Outline:CSR sees the selected month option not displayed in the Month list:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects [Add a New Card]
	And CSR selects a Month from the list
	When CSR clicks on Month drop down list
	Then selected month option should not display
	
Examples:
  | UsingData               		|
  | Payment_Month_option_not_shows	|		
  

@PaymentMethod
@DWCACSR-306
@Priority1
@3
Scenario Outline:CSR sees the selected year option not displayed in the Year list:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects [Add a New Card]
	And CSR selects a Year from the list
	When CSR clicks on Year drop down list
	Then selected year option should not display
	
Examples:
  | UsingData               		|
  | Payment_Year_option_not_shows	|		
      
      
@PaymentMethod
@DWCACSR-306
@Priority1
@4
Scenario Outline:CSR can enter maximaum of 4 characters in a Security Code field in New Card information layer in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects [Add a New Card]
	When CSR enters a Security code
	Then the Security code field should accept the entered value
	
Examples:
  | UsingData               				|
  | CSR_enters_4_chars_in_SecurityCode_fld	|		
 
 
@PaymentMethod
@DWCACSR-306
@Priority1
@5
Scenario Outline:CSR cannot enter more than 4 characters in a Security Code field in New Card information layer in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects [Add a New Card]
	When CSR enters a Security code
	Then the Security code field should not accept the entered value
	
Examples:
  | UsingData               				|
  | CSR_enters_5_chars_in_SecurityCode_fld	|		
                        