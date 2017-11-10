Feature: Confirm & Submit - Order Summary, Payment & Shipping Modules
	This feature is to validate the Confirm & Submit - Order Summary, Payment & Shipping Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit_OrderSummaryModule
@DWCACSR-325
@Priority1
@Manual
@1
Scenario Outline:CSR sees the Student Clubs, Teacher Catalogues, Shipping and Total Amount labels in Order Summary Module of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs and Teacher Catalogues items to the cart without minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then CSR sees 2 layers : [Header Layer] and [Flyer Module Details Layer]
	And CSR sees the header layer with the label 'Order Summary'
	And the label 'Student Clubs Amount Owing' for the Student Clubs items amount
	And the amount is displays like [$##.##]
	And the label 'Teacher Catalogues Amount Owing' for the Teacher Catalogues items amount
	And the amount is displays like [$##.##]
	And the label 'Shipping & Handling Amount Owing' for the Shipping charges
	And the amount is displays like [$##.##] and if the shipping is free then it displays 'FREE'
	And the label 'TOTAL AMOUNT OWING' for all the total cost of the order
	And the amount is displays like [$##.##]
	And two horizontal lines displays above and below for the [TOTAL AMOUNT OWING] label row
	
Examples:
  | UsingData 												|
  | CSR_sees_correct_labels_OrderSummary_ConfirmSubmit_page	|		
  

@Confirm&Submit_PaymentModule
@DWCACSR-326
@Priority1
@Manual
@1
Scenario Outline:CSR sees the Payment header and the Amount Paid by Credit Card labels in the Payment section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects saved Credit Card
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the label displays 'PAYMENT' for the header of the Payment section
	Then the label 'Amount Paid by Credit Card' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 														|
  | CSR_sees_correct_labels_Payment_CreditCard_ConfirmSubmit_page	|		
  

@Confirm&Submit_PaymentModule
@DWCACSR-326
@Priority1
@Manual
@2
Scenario Outline:CSR sees Amount Paid by Cheques label in the Payment section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the label 'Amount Paid by Cheques' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 													|
  | CSR_sees_correct_labels_Payment_Cheques_ConfirmSubmit_page	|
  

@Confirm&Submit_PaymentModule
@DWCACSR-326
@Priority1
@Manual
@3
Scenario Outline:CSR sees Amount Paid by Purchase Order label in the Payment section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Purchase Order as payment
	And CSR enter PO details
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the label 'Amount Paid by Purchase Order' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 												|
  | CSR_sees_correct_labels_Payment_PO_ConfirmSubmit_page	|  
  
  
@Confirm&Submit_PaymentModule
@DWCACSR-326
@Priority1
@Manual
@4
Scenario Outline:CSR sees Amount Paid by Credit Card and Amount Paid by Cheques labels in the Payment section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects combo as payment
	And CSR ennter details
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the label 'Amount Paid by Credit Card' and 'Amount Paid by Cheques' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 															|
  | CSR_sees_correct_labels_Payment_Credit_Cheques_ConfirmSubmit_page	|  
  

@Confirm&Submit_PaymentModule
@DWCACSR-326
@Priority1
@Manual
@5
Scenario Outline:CSR sees Amount Paid by Parent Online Payments label in the Payment section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects POP as payment
	Then the POP amount deducts automatically which is same as Actual order amount
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the label 'Amount Paid by Parent Online Payments' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 												|
  | CSR_sees_correct_labels_Payment_POP_ConfirmSubmit_page	|  
      

@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@1
Scenario Outline:CSR sees YOUR ORDER WILL BE SHIPPED TO label and the Shipping address correctly in the Shipping address section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the label 'YOUR ORDER WILL BE SHIPPED TO' displays for the header layer of Shipping address section
	And the Shipping address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 													|
  | CSR_sees_correct_labels_Shipping_Addr_ConfirmSubmit_page	|  
      

@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@2
Scenario Outline:CSR sees alternate shipping address correctly in the Shipping address section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR clicks on alternate shipping check box
	And CSR enters the details
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the entered Shipping address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 													|
  | CSR_sees_correct_alternate_Shipping_Addr_ConfirmSubmit_page	|  
  
  
@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@3
Scenario Outline:CSR sees correct shipping address in the Shipping address section of Confirm & Submit page when selects Credit card and adds a new card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects Add a New Card
	And CSR enters card and Billing info details
	And CSR uncheck the alternate address
	When CSR clicks on [Continue Checkout] button in Payment page
	Then CSR sees correct Shipping address in the Shipping Address details layer
	
	
Examples:
  | UsingData 														|
  | CSR_sees_correct_Shipping_Addr_adds_newCard_ConfirmSubmit_page	|  
  
 
@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@4
Scenario Outline:CSR sees correct alternate shipping address in the Shipping address section of Confirm & Submit page when selects Credit card and adds a new card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects Add a New Card
	And CSR enters card and Billing info details
	And CSR clicks on alternate shipping check box
	And CSR enters alternate shipping details
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the entered Shipping and alternate address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 																	|
  | CSR_sees_correct_alternate_Shipping_Addr_adds_newCard_ConfirmSubmit_page	|  


@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@5
Scenario Outline:CSR sees correct shipping address in the Shipping address section of Confirm & Submit page when selects Credit card and saved card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects saved Credit Card
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the Shipping address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 												|
  | CSR_sees_correct_Shipping_Addr_Saved_ConfirmSubmit_page	|  
  

@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@6
Scenario Outline:CSR sees correct shipping address in the Shipping address section of Confirm & Submit page when selects Combination and adds a new card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects combo as payment
	And CSR selects Add a New Card
	And CSR enters card and Billing info details
	And CSR uncheck the alternate address
	When CSR clicks on [Continue Checkout] button in Payment page
	Then CSR sees correct Shipping address in the Shipping Address details layer
	
	
Examples:
  | UsingData 																|
  | CSR_sees_correct_Shipping_Addr_adds_newCard_combo_ConfirmSubmit_page	|  
  
 
@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@7
Scenario Outline:CSR sees correct alternate shipping address in the Shipping address section of Confirm & Submit page when selects Combination and adds a new card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects combo as payment
	And CSR selects Add a New Card
	And CSR enters card and Billing info details
	And CSR clicks on alternate shipping check box
	And CSR enters alternate shipping details
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the entered Shipping and alternate address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 																		|
  | CSR_sees_correct_alternate_Shipping_Addr_adds_newCard_combo_ConfirmSubmit_page	|  
  

@Confirm&Submit_ShippingAddressModule
@DWCACSR-327
@Priority1
@Manual
@8
Scenario Outline:CSR sees correct alternate shipping address in the Shipping address section of Confirm & Submit page when selects Combination and saved card:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects combo as payment
	And CSR selects saved Credit Card
	When CSR clicks on [Continue Checkout] button in Payment page
	Then the Shipping address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 														|
  | CSR_sees_correct_Shipping_Addr_saved_combo_ConfirmSubmit_page	|  
  
         	              	         		           		  