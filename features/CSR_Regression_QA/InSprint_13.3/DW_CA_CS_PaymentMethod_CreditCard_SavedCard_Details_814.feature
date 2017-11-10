Feature: Payment - Payment Method - Credit Card - Saved Card - Edit - Credit Card Details
	This feature is to validate the Payment - Payment Method - Credit Card - Saved Card - Edit - Credit Card Details Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@PaymentMethod
@DWCACSR-814
@Priority1
@1
@Manual
Scenario Outline:Security Code needed when saving on the editing page:[<UsingData>]
	
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
	When CSR clicks on Save button
	Then CSR sees Security Code text box colored yellow
	
Examples:
  | UsingData               					|
  | QA_Payment_SavedCreditCard_SecurityCodeNeeded  |
 
  
@PaymentMethod
@DWCACSR-814
@Priority1
@2
Scenario Outline:The years under the Expiration Date label are shown in the correct order and for the next 20 years:[<UsingData>]
	
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
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then the right drop-down has values of the years ranging from the current system year to the next 20 years
	
Examples:
  | UsingData               		|
  | QA_Payment_SavedCreditCard_Years  	|
 
 
@PaymentMethod
@DWCACSR-814
@Priority1
@3
Scenario Outline:The months under the Expiration Date label are shown in the correct order and format:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	And CSR selects saved Credit Card
	And CSR selects 'Edit' hyperlink
	When CSR selects the left drop-down box under 'Expiration Date:' label
	Then the drop-down menu should have values from 1 to 12
	#And all single digits begin with 0
	
Examples:
  | UsingData               			|
  | QA_Payment_SavedCreditCard_Months  	|
 
  
