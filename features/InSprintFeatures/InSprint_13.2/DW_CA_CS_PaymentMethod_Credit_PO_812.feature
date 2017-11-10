Feature: Payment - Payment Method - Credit Card - Add A New Card - PO Number
	This feature is to validate the Payment - Payment Method - Credit Card - Add A New Card - PO Number Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site
 
@PaymentMethod
@DWCACSR-812
@Priority1
@1
Scenario Outline:CSR sees the correct labels for the PO Number layer section in Payment page:[<UsingData>]
	
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
	Then the label 'Purchase Order Information' displays for the header of PO Number layer
	And the label 'Purchase Order Number' displays with the text box in the header of PO Number layer
	
Examples:
  | UsingData               				|
  | CSR_sees_correct_labels_for_PO_layer	|		
 
 
@PaymentMethod
@DWCACSR-812
@Priority1
@2
Scenario Outline:CSR can enter maximaum of 20 alphanumeric in PO Number field in PO Number layer section in Payment page:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should accept the entered value
	
Examples:
  | UsingData               	|
  | CSR_enters_20_integers		|	
  | CSR_enters_20_alphanumeric	|	
  
  
@PaymentMethod
@DWCACSR-812
@Priority1
@3
Scenario Outline:CSR cannot enter more than 20 alphanumeric in PO Number field in PO Number layer section in Payment page:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should not accept the entered value
	
Examples:
  | UsingData               	|
  | CSR_enters_21_integers		|	
  | CSR_enters_21_alphanumeric	|	
    		
                                