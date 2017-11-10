Feature: Payment Method
	This feature is to validate the Payment Method scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@1
Scenario Outline:Continue Checkout button enable in Payment page when CSR selects Checks as payment:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	And CSR enters [PO Number]
	Then Continue Checkout button is enabled in the footer region of the page

Examples: 
	| UsingData       						|
	| QA_CSR_Payment_ContinueCheckout_Enabled	|
	

@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@2
Scenario Outline:Confirm and Submit page displays when CSR clicks on Continue Checkout button in Payment page:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	When CSR clicks on [Continue Checkout] button in Payment page
	Then [Confirm & Submit] page displays

Examples: 
	| UsingData       					|
	| QA_CSR_Confirm_Submit_page_displays	|

	
@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@3
Scenario Outline:Saved Credit Card displays in the list when CSR selects Credit Card as Payment in Payment page:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Credit Card as payment
	Then Saved Credit Card displays in the list

Examples: 
	| UsingData       				|
	| QA_CSR_Saved_CreditCard_displays	|
	
	
@Payment_ProceedToCheckout
@DWCACSR-309
@Priority1
@4
Scenario Outline:Saved Credit Card information displays correctly when CSR selects Saved Credit Card as Payment in Payment page:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	When CSR selects saved Credit Card
	Then Credit Card information displays correctly

Examples: 
	| UsingData       								|
	| QA_CSR_Saved_CreditCard_info_displays_correctly	|	
	
	
@PaymentMethod_PO
@DWCACSR-818
@Priority1
@1
Scenario Outline:PO Number and Scholastic mailing address section displays when CSR selects Cheques as Payment:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	Then PO Number text box displays
	And Scholastic mailing address section displays
	
Examples:
  | UsingData               			|
  | QA_PO_Number_Mailing_section_displays	|		
  

@PaymentMethod_PO
@DWCACSR-818
@Priority1
@2
Scenario Outline:Scholastic mailing address text displays correctly when CSR selects Cheques as Payment:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	Then Scholastic mailing address text displays correctly
	
Examples:
  | UsingData               		|
  | QA_Mailing_section_text_displays	|		
  

@PaymentMethod_PO
@DWCACSR-818
@Priority1
@3
Scenario Outline:CSR can enter up to 20 numbers in a PO Number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	When CSR enters [PO Number]
	Then [PO Number] field accepts the entered number and CSR can see it
	
Examples:
  | UsingData               	|
  | QA_CSR_enters_PONumber_20_nums	|
  
  
@PaymentMethod_PO
@DWCACSR-818
@Priority1
@4
Scenario Outline:CSR cannot enter more than 20 numbers in a PO Number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	When CSR enters more than 20 numbers in [PO Number] field
	Then [PO Number] field not accept the entered number
	
Examples:
  | UsingData               				|
  | QA_CSR_enters_PONumber_more_than_20_nums	|  	   
  

@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@1
Scenario Outline:Error callOut message not displays when CSR enters Postal Code without a space between 3rd and 4th charactres:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code without a space between 3rd and 4th charactres
	And CSR performs Tab key
	Then Error callOut message not displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_not_displays_PaymrntPage	|		
  

@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format_1:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code that doesn't follow the rule
	And CSR performs Tab key
	Then Error callOut message displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_1_displays_PaymentPage	|
  

@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code that doesn't follow the rule
	And CSR performs Tab key
	Then Error callOut message displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_2_displays_PaymentPage	|

  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format_3:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code that doesn't follow the rule
	And CSR performs Tab key
	Then Error callOut message displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_3_displays_PaymentPage	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format_4:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code that doesn't follow the rule
	And CSR performs Tab key
	Then Error callOut message displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_4_displays_PaymentPage	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format_5:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code that doesn't follow the rule
	And CSR performs Tab key
	Then Error callOut message displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_5_displays_PaymentPage	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format_6:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code that doesn't follow the rule
	And CSR performs Tab key
	Then Error callOut message displays
	
Examples:
  | UsingData 									|
  | QA_Error_callOut_msg_6_displays_PaymentPage	|        
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_A:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_A	|
  

@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_B:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_B	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_C:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_C	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_E:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_E	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_G:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_G	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_H:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_H	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_J:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_J	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_K:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_K	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_L:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_L	|

  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_M:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_M	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_N:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_N	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_P:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_P	|

  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_R:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_R	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_S:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_S	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_T:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_T	|

  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_V:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_V	|

  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter_Y:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter
	And the same province drop-down box is DISABLED
	
Examples:
  | UsingData 										|
  | QA_province_selects_automatically_PaymentPage_Y	|
                                
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@4
Scenario Outline:Drop down list enables if the 1st letter is mapped to 1 or more provinces:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the province in which that postal code is related to will be automatically selected based on its 1st letter if it is mapped more than one
	And the province drop-down box is ENABLED
	
Examples:
  | UsingData 								|
  | QA_province_dropDown_enabled_PaymrntPage_X	|
     
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@6
Scenario Outline:CONTINUE CHECKOUT button is enable when CSR fills all the field in alternate shipping address:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR fills the alternate shipping address detail
	Then the CONTINUE CHECKOUT button is enabled
	
Examples:
  | UsingData 									|
  | QA_ContinueCheckout_btn_enabled_PaymrntPage	|
   
   
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@7
Scenario Outline:CONTINUE CHECKOUT button is disable when CSR doen't fill any of the field in alternate shipping address_1:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR doesn't fill any one of the field in alternate shipping address detail
	Then the CONTINUE CHECKOUT button is disabled
	
Examples:
  | UsingData 												|
  | QA_ContinueCheckout_btn_disabled_PaymrntPage_NoAddress1	|     
  
   
   
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@7
Scenario Outline:CONTINUE CHECKOUT button is disable when CSR doen't fill any of the field in alternate shipping address_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR doesn't fill any one of the field in alternate shipping address detail
	Then the CONTINUE CHECKOUT button is disabled
	
Examples:
  | UsingData 												|    
  | QA_ContinueCheckout_btn_disabled_PaymrntPage_NoAddress2	|  
 
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@7
Scenario Outline:CONTINUE CHECKOUT button is disable when CSR doen't fill any of the field in alternate shipping address_3:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR doesn't fill any one of the field in alternate shipping address detail
	Then the CONTINUE CHECKOUT button is disabled
	
Examples:
  | UsingData 												| 
  | QA_ContinueCheckout_btn_disabled_PaymrntPage_NoPostalCode	|  

  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@7
Scenario Outline:CONTINUE CHECKOUT button is disable when CSR doen't fill any of the field in alternate shipping address_4:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR selects Alternate Shipping Address Check box
	When CSR doesn't fill any one of the field in alternate shipping address detail
	Then the CONTINUE CHECKOUT button is disabled
	
Examples:
  | UsingData 												| 
  | QA_ContinueCheckout_btn_disabled_PaymrntPage_NoCity		| 
  

@PaymentMethod
@DWCACSR-1192
@Priority1
@1
Scenario Outline:'Select a Card' drop-down has correct layout when 'Comb of Credit Card and Cheque' option is selected on Payment page_1192:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and Cheques as payment
	When CSR selects 'Select a Card' drop-down
	Then CSR sees the label 'Add a New Card' under the 'Select a Card' drop-down
	And CSR sees all saved cards under the 'Add a New Card' label
	
Examples:
  | UsingData               											|
  | QA_Payment_CombinationOfCreditCardCheques_SelectCardDropDown_Layout    |
  
  
@PaymentMethod_PO
@DWCACSR-1195
@Priority1
@1
Scenario Outline:CSR can enter maximaum of 20 alphanumeric in PO Number field in PO Number layer section in Payment page_1195:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should accept the entered value
	
Examples:
  | UsingData               			|
  | QA_CSR_enters_20_integers_1195     	|
  | QA_CSR_enters_20_alphanumeric_1195 	|
  

@PaymentMethod_PO
@DWCACSR-1195
@Priority1
@2
Scenario Outline:CSR cannot enter more than 20 alphanumeric in PO Number field in PO Number layer section in Payment page_1195:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should not accept the entered value
	
Examples:
  | UsingData               			|
  | QA_CSR_enters_21_integers_1195     	|
  | QA_CSR_enters_21_alphanumeric_1195 	|
  
@PaymentMethod
@DWCACSR-822
@Priority1
@1
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field in Credit Card_822:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [Creidt Card fld]
	When CSR clicks outside the textbox
	Then CSR sees the amount in [Cheque fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               				|
  | QA_CSR_amount_to_be_paid_by_credit_card_822    |
  

@PaymentMethod
@DWCACSR-822
@Priority1
@2
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field in Cheques_822:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [Cheque fld]
	When CSR clicks outside the textbox
	Then CSR sees the amount in [Credit Card fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               			|
  | QA_CSR_amount_to_be_paid_by_cheque_822   	|
  
 
@PaymentMethod
@DWCACSR-822
@Priority1
@3
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field in Credit Card_822:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [Creidt Card fld]
	When CSR clicks outside the textbox
	Then CSR sees the amount 0.00 in [Cheque fld]
	
Examples:
  | UsingData               					|
  | QA_CSR_over_amount_to_be_paid_by_credit_card_822   |
  

@PaymentMethod
@DWCACSR-822
@Priority1
@4
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field in Cheque_822:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [Cheque fld]
	When CSR clicks outside the textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               				|
  | QA_CSR_over_amount_to_be_paid_by_Cheque_822   	|
  

@PaymentMethod
@DWCACSR-822
@Priority1
@5
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field in Credit Card_822:[<UsingData>]
	
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
	And CSR enters the total amount in [Creidt Card fld]
	When CSR clicks outside the textbox
	Then CSR sees the amount 0.00 in [Cheque fld]
	
Examples:
  | UsingData               								 |
  | QA_CSR_enters_same_tot_amount_to_be_paid_by_credit_card_822 	 |
  

@PaymentMethod
@DWCACSR-822
@Priority1
@6
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field in Cheque_822:[<UsingData>]
	
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
	And CSR enters the total amount in [Cheque fld]
	When CSR clicks outside the textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               							|
  | QA_CSR_enters_same_tot_amount_to_be_paid_by_Cheque_822 	|
      
      
@PaymentMethod
@DWCACSR-313
@Priority1
@1
Scenario Outline:The months under the Expiration Date label are shown in the correct order and format_313:[<UsingData>]
	
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
	When CSR selects the left drop-down box under 'Expiration Date:' label
	Then the drop-down menu should have values from 1 to 12
	#And all single digits begin with 0
	
Examples:
  | UsingData               							|
  | QA_Payment_CombinationOfCreditCardCheques_Months_313  	|
 
  
@PaymentMethod
@DWCACSR-313
@Priority1
@2
Scenario Outline:The selected year under the Expiration Date label is not shown in the drop-down menu when accessed:[<UsingData>]
	
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
	And CSR selects the right drop-down box under 'Expiration Date:' label
	And CSR selects [Year]
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then [Year] is not shown in the drop-down box
	
Examples:
  | UsingData               						|
  | QA_Payment_CombinationOfCreditCardCheques_Year1  	|
 

@PaymentMethod
@DWCACSR-313
@Priority1
@3
Scenario Outline:Security Card character limit:[<UsingData>]
	
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
	When CSR enters characters more than 4 in the Security Code textbox
	Then the Security Code does not accept more than 4 characters
	
Examples:
  | UsingData               									|
  | QA_Payment_CombinationOfCreditCardCheques_5_Char_SecurityCode  |
  
  
@PaymentMethod
@DWCACSR-313
@Priority1
@4
Scenario Outline:The years under the Expiration Date label are shown in the correct order and for the next 20 years_313:[<UsingData>]
	
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
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then the right drop-down has values of the years ranging from the current system year to the next 20 years
	
Examples:
  | UsingData               						|
  | QA_Payment_CombinationOfCreditCardCheques_Years  	|
   

@PaymentMethod
@DWCACSR-313
@Priority1
@5
Scenario Outline:Credit Card image shows to the far right in the Card textbox when a valid card is entered:[<UsingData>]
	
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
	When CSR enters a valid card in the 'Card #' textbox
	Then an image is shown to the far right in the 'Card #' textbox
	
Examples:
  | UsingData               							|
  | QA_Payment_CombinationOfCreditCardCheques_VISACard  	|
  | QA_Payment_CombinationOfCreditCardCheques_MasterCard  	|
  | QA_Payment_CombinationOfCreditCardCheques_AMEXCard  	|
  
  
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
Scenario Outline:CSR sees the Saved Card in a list when he selects the Save Card checkbox in Billing Info section in Payment page_821:[<UsingData>]
	
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
Scenario Outline:CSR sees no Saved Card in a list when he de-selects the Save Card checkbox in Billing Info section in Payment page_821:[<UsingData>]
	
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
    		

@PaymentMethod
@DWCACSR-1197
@Priority1
@1
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field in Credit Card:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount in [Cheque fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               				|
  | QA_CSR_amount_to_be_paid_by_credit_card    |
  

@PaymentMethod
@DWCACSR-1197
@Priority1
@2
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field in Cheques:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [Cheque fld]
	When CSR clicks outside the Cheque fld textbox
	Then CSR sees the amount in [Credit Card fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               			|
  | QA_CSR_amount_to_be_paid_by_cheque   	|
  
 
@PaymentMethod
@DWCACSR-1197
@Priority1
@3
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field in Credit Card:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount 0.00 in [Cheque fld]
	
Examples:
  | UsingData               					|
  | QA_CSR_over_amount_to_be_paid_by_credit_card   |
  

@PaymentMethod
@DWCACSR-1197
@Priority1
@4
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field in Cheque:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [Cheque fld]
	When CSR clicks outside the Cheque fld textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               				|
  | QA_CSR_over_amount_to_be_paid_by_Cheque   	|
  

@PaymentMethod
@DWCACSR-1197
@Priority1
@5
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field in Credit Card:[<UsingData>]
	
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
	And CSR enters the total amount in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount 0.00 in [Cheque fld]
	
Examples:
  | UsingData               								 |
  | QA_CSR_enters_same_tot_amount_to_be_paid_by_credit_card 	 |
  

@PaymentMethod
@DWCACSR-1197
@Priority1
@6
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field in Cheque:[<UsingData>]
	
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
	And CSR enters the total amount in [Cheque fld]
	When CSR clicks outside the Cheque fld textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               							|
  | QA_CSR_enters_same_tot_amount_to_be_paid_by_Cheque 	|
      
      
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
 
 
@PaymentMethod_PO
@DWCACSR-816
@Priority1
@1
Scenario Outline:CSR can enter maximaum of 20 alphanumeric in PO Number field in PO Number layer section in Payment page_816:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should accept the entered value
	
Examples:
  | UsingData               		|
  | QA_CSR_enters_20_integers_816     	|
  | QA_CSR_enters_20_alphanumeric_816 	|
  

@PaymentMethod_PO
@DWCACSR-816
@Priority1
@2
Scenario Outline:CSR cannot enter more than 20 alphanumeric in PO Number field in PO Number layer section in Payment page_816:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should not accept the entered value
	
Examples:
  | UsingData               		|
  | QA_CSR_enters_21_integers_816     	|
  | QA_CSR_enters_21_alphanumeric_816 	|
  

@PaymentMethod_PO
@DWCACSR-820
@Priority1
@1
Scenario Outline:CSR can enter maximaum of 20 alphanumeric in PO Number field in PO Number layer section in Payment page:[<UsingData>]
	
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
	When CSR enters [PO Number]
	Then PO Number field should accept the entered value
	
Examples:
  | UsingData               	|
  | QA_CSR_enters_20_integers     	|
  | QA_CSR_enters_20_alphanumeric 	|
  

@PaymentMethod_PO
@DWCACSR-820
@Priority1
@2
Scenario Outline:CSR cannot enter more than 20 alphanumeric in PO Number field in PO Number layer section in Payment page:[<UsingData>]
	
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
	When CSR enters [PO Number] more than 20 characters
	Then PO Number field should not accept more than 20 characters
	
Examples:
  | UsingData               	|
  | QA_CSR_enters_21_integers     	|
  | QA_CSR_enters_21_alphanumeric 	|
  
@PaymentMethod_PO
@DWCACSR-823
@Priority1
@1
Scenario Outline:Error message shown when PO Number not entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Purchase Order as payment
	And CSR clicks on Continue Checkout in Payment page
	Then CSR sees error message above 'PO Number' textbox
	And CSR sees message 'A PO Number must be provided'
	
Examples:
  | UsingData               				|
  | QA_Payment_PurchaseOrder_PONumber_Error    |
 

@PaymentMethod_PO
@DWCACSR-823
@Priority1
@2
Scenario Outline:Error message shown when Board or School Number not entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Purchase Order as payment
	And CSR enters valid PO Number in Purchase Order textbox
	When CSR clicks on Continue Checkout in Payment page
	Then CSR sees error message above 'Board/ School Number' textbox
	And CSR sees message 'A Board/School Number must be provided'
	
Examples:
  | UsingData               						|
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_Error   |
 

#@PaymentMethod_PO
#@DWCACSR-823
#@Priority1
#@3
#Scenario Outline:Error message shown when Account Number not entered:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	And CSR adds Student Clubs items to the cart to meet the minimum amount
#	And CSR navigates to Review Cart page from Order Entry page
#	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#	And CSR navigates to [Payment] page from [Redeem & Rewards] page
#	When CSR selects Purchase Order as payment
#	And CSR enters valid PO Number in Purchase Order textbox
#	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
#	And CSR clicks on Continue Checkout in Payment page
#	Then CSR sees error message above 'Account Number' textbox
#	And CSR sees message 'An Account Number must be provided e.g. 99'
#	
#Examples:
#  | UsingData               					|
#  | QA_Payment_PurchaseOrder_AccountNumber_Error   |
 
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@1
Scenario Outline: CSR can enter 1 alphanumeric character in Purchase Order textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid PO Number in Purchase Order textbox
Then Purchase Order textbox accepts the input
Examples:
  | UsingData                                                |
  | QA_Payment_PurchaseOrder_PONumber_1_AlphanumericCharacter   |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@2
Scenario Outline: CSR can enter 20 alphanumeric characters in Purchase Order textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid PO Number in Purchase Order textbox
Then Purchase Order textbox accepts the input
Examples:
  | UsingData                                                |
  | QA_Payment_PurchaseOrder_PONumber_20_AlphanumericCharacters |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@3
#Scenario Outline: CSR cannot enter special characters in Purchase Order textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid characters in Purchase Order textbox
#Then Purchase Order textbox rejects the input
#Examples:
#  | UsingData                                                |
#  | QA_Payment_PurchaseOrder_PONumber_SpecialCharacters         |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@4
Scenario Outline: CSR cannot enter more than 20 characters in Purchase Order textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid characters in Purchase Order textbox
Then Purchase Order textbox rejects the input
Examples:
  | UsingData                                                |
  | QA_Payment_PurchaseOrder_PONumber_21_AlphanumericCharacters |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@5
Scenario Outline: CSR enters 2 integers in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Account Number textbox
Then Account Number textbox accepts the input
Examples:
  | UsingData                                      |
  | QA_Payment_PurchaseOrder_AccountNumber_2_Integers |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@6
Scenario Outline: CSR enters 8 integers in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Account Number textbox
Then Account Number textbox accepts the input
Examples:
  | UsingData                                      |
  | QA_Payment_PurchaseOrder_AccountNumber_8_Integers |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@7
Scenario Outline: CSR cannot enter only one integer in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Account Number textbox
And CSR clicks outside the Account Number textbox
Then Error message is displayed for Account Number field
Examples:
  | UsingData                                                  |
  | QA_Payment_PurchaseOrder_AccountNumber_1_Integer              |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@8
Scenario Outline: CSR cannot enter more than 8 integers in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Account Number textbox
And CSR clicks outside the Account Number textbox
Then Account Number textbox rejects the input
Examples:
  | UsingData                                                  |
  | QA_Payment_PurchaseOrder_AccountNumber_9_Integers             |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@9
#Scenario Outline: CSR cannot enter alphabetical characters in Account Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Account Number textbox
#And CSR clicks outside the Account Number textbox
#Then Account Number textbox rejects the input
#Examples:
#  | UsingData                                                  |
#  | QA_Payment_PurchaseOrder_AccountNumber_AlphabeticalCharacters |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@10
#Scenario Outline: CSR cannot enter special charcters in Account Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Account Number textbox
#And CSR clicks outside the Account Number textbox
#Then Account Number textbox rejects the input
#Examples:
#  | UsingData                                                  |
#  | QA_Payment_PurchaseOrder_AccountNumber_SpecialCharacters      |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@11
Scenario Outline: CSR enters 2 integers in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Board/School Number textbox
Then Board/School Number textbox accepts the input
Examples:
  | UsingData                                          |
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_2_Integers |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@11
Scenario Outline: CSR enters 8 integers in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Board/School Number textbox
Then Board/School Number textbox accepts the input
Examples:
  | UsingData                                          |
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_8_Integers |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@12
Scenario Outline: CSR cannot enter 1 integer in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Board/School Number textbox
And CSR clicks outside the Board/School Number textbox
Then Error message is displayed for Board/School Number field
Examples:
  | UsingData                                                      |
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_1_Integer 	           |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@13
Scenario Outline: CSR cannot enter more than 8 integers in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Board/School Number textbox
And CSR clicks outside the Board/School Number textbox
Then Board/School Number textbox rejects the input
Examples:
  | UsingData                                                      |
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_9_Integers             |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@14
#Scenario Outline: CSR cannot enter alphabetical characters in Board/School Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Board/School Number textbox
#And CSR clicks outside the Board/School Number textbox
#Then Board/School Number textbox rejects the input
#Examples:
#  | UsingData                                                      |
#  | QA_Payment_PurchaseOrder_BoardSchoolNumber_AlphabeticalCharacters |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@15
#Scenario Outline: CSR cannot enter special charcaters in Board/School Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Board/School Number textbox
#And CSR clicks outside the Board/School Number textbox
#Then Board/School Number textbox rejects the input
#Examples:
#  | UsingData                                                      |
#  | QA_Payment_PurchaseOrder_BoardSchoolNumber_SpecialCharacters      |
      
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@16
Scenario Outline: CSR can select only one radio button:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR selects a radio button
Then the other radio buttons should remain unselected
Examples:
  | UsingData                                 |
  | QA_Payment_PurchaseOrder_RadioButton_OnlyOne |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@17
Scenario Outline: Radio button labelled ‘PUB (Backorders Allowed)’ selected by default:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
Then CSR sees radio button labelled ‘PUB (Backorders Allowed)’ selected
Examples:
  | UsingData                                 |
  | QA_Payment_PurchaseOrder_RadioButton_Default |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@18
Scenario Outline: Error message shown when CSR clicks or tabs out of PO Number textbox without entering PO Number:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR selects Purchase Order textbox
And CSR clicks outside the Purchase Order textbox
Then CSR sees error message above Purchase Order textbox
Examples:
  | UsingData                                  |
  | QA_Payment_PurchaseOrder_ErrorMessage_NoInput |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@19
Scenario Outline: Error message shown when CSR clicks or tabs out of Account Number textbox without entering Account Number:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR selects Account Number textbox
And CSR clicks outside the Account Number textbox
Then CSR sees error message above Account Number textbox
Examples:
  | UsingData                                  |
  | QA_Payment_AccountNumber_ErrorMessage_NoInput |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@20
Scenario Outline: Error message shown when CSR clicks or tabs out of Board/School Number textbox without entering Board/School Number:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR selects Board/School Number textbox
And CSR clicks outside the Board/School Number textbox
Then CSR sees error message above Board/School Number textbox
Examples:
  | UsingData                                      |
  | QA_Payment_BoardSchoolNumber_ErrorMessage_NoInput |


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
  | QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_Canada_selected_by_default  	|
 
  

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
  | QA_Payment_Combination_Of_Credit_Card_PO_All_Provinces  	|
 
 
 
@PaymentMethod
@DWCACSR-1187
@Priority1
@3
Scenario Outline:The labels for Postal and Province and drop-down values for the Province changes when US is selected in the Country drop-down:[<UsingData>]
	
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
  | QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_US_selected  |
 

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
  | QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_InvalidPhoneNum  				|
  | QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_InvalidPhoneNum_Starts_with_zero |
  | QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_InvalidPhoneNum_Starts_with_one  |
  
 
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
  | QA_Payment_Combination_Of_Credit_Card_PO_Billing_Info_ValidPhoneNum  	|

                  
@PaymentMethod
@DWCACSR-1190
@Priority1
@1
Scenario Outline:CSR enters with more than two decimal place in the amount to be paid by credit card field_1190:[<UsingData>]
	
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
	And CSR enters amount in credit card field and clicks on outside
	Then CSR only see first two values after decimal point in credit card field
	
Examples:
  | UsingData               								|
  | QA_CSR_three_decimals_amount_to_be_paid_by_credit_card     |
  
 
@PaymentMethod
@DWCACSR-1190
@Priority1
@2
Scenario Outline:CSR enters with more than two decimal place in the amount to be paid by purchase order field_1190:[<UsingData>]
	
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
	And CSR enters amount in purchase order field and clicks on outside
	Then CSR only see first two values after decimal point in purchase order field
	
Examples:
  | UsingData               					|
  | QA_CSR_three_decimals_amount_to_be_paid_by_PO  |
  

@PaymentMethod
@DWCACSR-1190
@Priority1
@3
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field_1190:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount in [PO fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               		      |
  | QA_CSR_amount_to_be_paid_by_credit_card  |
  

@PaymentMethod
@DWCACSR-1190
@Priority1
@4
Scenario Outline:CSR enters amount less than total amount in the amount to be paid field2_1190:[<UsingData>]
	
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
	And CSR enters [Amount Less than Total Amount] in [PO fld]
	When CSR clicks outside the PO fld textbox
	Then CSR sees the amount in [Credit Card fld] that is the difference between total amount and [Amount Less than Total Amount]
	
Examples:
  | UsingData               	 |
  | QA_CSR_amount_to_be_paid_by_PO  |
  

@PaymentMethod
@DWCACSR-1190
@Priority1
@5
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field_1190:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount 0.00 in [PO fld]
	
Examples:
  | UsingData               		      		|
  | QA_CSR_over_amount_to_be_paid_by_credit_card 	|


@PaymentMethod
@DWCACSR-1190
@Priority1
@6
Scenario Outline:CSR enters amount more than the total amount in the amount to be paid field2_1190:[<UsingData>]
	
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
	And CSR enters [Amount More than Total Amount] in [PO fld]
	When CSR clicks outside the PO fld textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               		    |
  | QA_CSR_over_amount_to_be_paid_by_PO 	|


@PaymentMethod
@DWCACSR-1190
@Priority1
@7
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field_1190:[<UsingData>]
	
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
	And CSR enters the total amount in [Credit Card fld]
	When CSR clicks outside the Credit Card fld textbox
	Then CSR sees the amount 0.00 in [PO fld]
	
Examples:
  | UsingData               		      			|
  | QA_CSR_over_amount_to_be_paid_by_credit_card_2 	|


@PaymentMethod
@DWCACSR-1190
@Priority1
@8
Scenario Outline:CSR enters exact amount as the total amount in the amount to be paid field2_1190:[<UsingData>]
	
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
	And CSR enters the total amount in [PO fld]
	When CSR clicks outside the PO fld textbox
	Then CSR sees the amount 0.00 in [Credit Card fld]
	
Examples:
  | UsingData               		    |
  | QA_CSR_over_amount_to_be_paid_by_PO_2 	|
                                      
                                      
@PaymentMethod
@DWCACSR-1186
@Priority1
@1
Scenario Outline:The years under the Expiration Date label are shown in the correct order and for the next 20 years_1186:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then the right drop-down has values of the years ranging from the current system year to the next 20 years
	
Examples:
  | UsingData               					|
  | QA_Payment_CombinationOfCreditCardPO_Years  	|
   

@PaymentMethod
@DWCACSR-1186
@Priority1
@2
Scenario Outline:Credit Card image shows to the far right in the Card textbox when a valid card is entered_1186:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	When CSR enters a valid card in the 'Card #' textbox
	Then an image is shown to the far right in the 'Card #' textbox
	
Examples:
  | UsingData               					 |
  | QA_Payment_CombinationOfCreditCardPO_AMEXCard   |
  | QA_Payment_CombinationOfCreditCardPO_MasterCard |
  | QA_Payment_CombinationOfCreditCardPO_VISACard   |
  

@PaymentMethod
@DWCACSR-1186
@Priority1
@3
Scenario Outline:The months under the Expiration Date label are shown in the correct order and format_1186:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	When CSR selects the left drop-down box under 'Expiration Date:' label
	Then the drop-down menu should have values from 1 to 12
	#And all single digits begin with 0
	
Examples:
  | UsingData               						|
  | QA_Payment_CombinationOfCreditCardPO_Months_1186  	|
  
  
@PaymentMethod
@DWCACSR-1186
@Priority1
@4
Scenario Outline:The selected year under the Expiration Date label is not shown in the drop-down menu when accessed_1186:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	And CSR selects the right drop-down box under 'Expiration Date:' label
	And CSR selects [Year]
	When CSR selects the right drop-down box under 'Expiration Date:' label
	Then [Year] is not shown in the drop-down box
	
Examples:
  | UsingData               					|
  | QA_Payment_CombinationOfCreditCardPO_Year1  	|
   

@PaymentMethod
@DWCACSR-1186
@Priority1
@5
Scenario Outline:Security Card character limit_1186:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	When CSR enters characters more than 4 in the Security Code textbox
	Then the Security Code does not accept more than 4 characters
	
Examples:
  | UsingData               								|
  | QA_Payment_CombinationOfCreditCardPO_5_Char_SecurityCode  	|
  
        
@PaymentMethod
@DWCACSR-1188
@Priority1
@1
Scenario Outline:CSR enters invalid values in Board/School Number textbox_1188:[<UsingData>]
	
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
	And CSR enters invalid entry in Board/School Number textbox
	Then Board/School Number textbox rejects the input
	
Examples:
  | UsingData               										|
#  | QA_Payment_PurchaseOrder_BoardSchoolNumber_1_Integer             	|
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_9_Integers             	|
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_AlphanumericCharacters 	|
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_SpecialCharacters      	|
 
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@2
Scenario Outline:CSR can enter at most 20 alphanumeric characters in Purchase Order textbox_1188:[<UsingData>]
	
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
	And CSR enters valid PO Number in Purchase Order textbox
	Then Purchase Order textbox accepts the input
	
Examples:
  | UsingData               												 |
  | QA_Payment_Combination_Of_Credit_Card_PO_PONumber_1_AlphanumericCharacter   |
  | QA_Payment_Combination_Of_Credit_Card_PO_PONumber_20_AlphanumericCharacters |  
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@3
Scenario Outline:Continue checkout button disabled when Board/School Number is not provided_1188:[<UsingData>]
	
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
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Account Number in Account textbox
	Then Continue Checkout button is disabled in Payment page
	
Examples:
  | UsingData               												 |
  | QA_Payment_Combination_Of_Credit_Card_PO_BoardSchoolNumber_ButtonDisabled   |     
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@4
Scenario Outline:CSR enters invalid characters in Purchase Order textbox_1188:[<UsingData>]
	
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
	And CSR enters invalid characters in Purchase Order textbox
	Then Purchase Order textbox rejects the input
	
Examples:
  | UsingData               												 |
  | QA_Payment_Combination_Of_Credit_Card_PO_PONumber_SpecialCharacters         |
  | QA_Payment_Combination_Of_Credit_Card_PO_PONumber_21_AlphanumericCharacters |  
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@5
Scenario Outline:CSR enters between 2 and 8 integers in Account Number textbox_1188:[<UsingData>]
	
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
	And CSR enters valid entry in Account Number textbox
	Then Account Number textbox accepts the input
	
Examples:
  | UsingData               									   |
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_2_Integers |
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_8_Integers |
  

@PaymentMethod
@DWCACSR-1188
@Priority1
@6
Scenario Outline:CSR enters invalid values in Account Number textbox_1188:[<UsingData>]
	
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
	And CSR enters invalid entry in Account Number textbox
	Then Account Number textbox rejects the input
	
Examples:
  | UsingData               									   			  |
  #| QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_1_Integer             |  
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_9_Integers            |
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_AlphabeticalCharacters|
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_SpecialCharacters     |
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@7
Scenario Outline:CSR can select only one radio button_1188:[<UsingData>]
	
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
	And CSR selects a radio button
	Then the other radio buttons should remain unselected
	
Examples:
  | UsingData               									|
  | QA_Payment_Combination_Of_Credit_Card_PO_RadioButton_OnlyOne   |    
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@8
Scenario Outline:Radio button labelled PUB:Backorders Allowed selected by default_1188:[<UsingData>]
	
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
	Then CSR sees radio button labelled ‘PUB (Backorders Allowed)’ selected
	
Examples:
  | UsingData               									|
  | QA_Payment_Combination_Of_Credit_Card_PO_RadioButton_Default   |    
  
  
@PaymentMethod
@DWCACSR-1188
@Priority1
@9
Scenario Outline:Error message shown when CSR clicks or tabs out of PO Number textbox without entering PO Number_1188:[<UsingData>]
	
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
	And CSR selects Purchase Order textbox
	And CSR clicks outside the Purchase Order textbox
	Then CSR sees error message above Purchase Order textbox
	
Examples:
  | UsingData               									|
  | QA_Payment_Combination_Of_Credit_Card_PO_ErrorMessage_NoInput  |    
 
 
@PaymentMethod
@DWCACSR-1188
@Priority1
@10
Scenario Outline:Error message shown when CSR clicks or tabs out of Account Number textbox without entering Account Number_1188:[<UsingData>]
	
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
	And CSR selects Account Number textbox
	And CSR clicks outside the Account Number textbox
	Then CSR sees error message above Account Number textbox
	
Examples:
  | UsingData               										|
  | QA_Payment_Combination_Of_Credit_Card_PO_ErrorMessage_NoInput_2  	|    
          
          
@PaymentMethod
@DWCACSR-1188
@Priority1
@11
Scenario Outline:Error message shown when CSR clicks or tabs out of Board/School Number textbox without entering Board/School Number_1188:[<UsingData>]
	
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
	And CSR selects Board/School Number textbox
	And CSR clicks outside the Board/School Number textbox
	Then CSR sees error message above Board/School Number textbox
	
Examples:
  | UsingData               										|
  | QA_Payment_Combination_Of_Credit_Card_PO_ErrorMessage_NoInput_3  	|    
                      
                      
@PaymentMethod
@DWCACSR-1188
@Priority1
@12
Scenario Outline:CSR enters between 2 and 8 integers in Board/School Number textbox_1188:[<UsingData>]
	
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
	And CSR enters valid entry in Board/School Number textbox
	Then Board/School Number textbox accepts the input
	
Examples:
  | UsingData               							|
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_2_Integers  |
  | QA_Payment_PurchaseOrder_BoardSchoolNumber_8_Integers  |
                                  
                                  
 @PaymentMethod
@DWCACSR-310
@Priority1
@1
Scenario Outline:Error message shown when Board/School Number not entered_310:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Combination of Credit Card and PO as payment
	And CSR selects [Add a New Card]
	And CSR enters card information
	And CSR enters valid PO Number in Purchase Order textbox
	#And CSR clicks on Continue Checkout in Payment page
	When CSR perform tab to move out on 'Board/ School Number' textbox
	Then CSR sees error message above 'Board/ School Number' textbox
	And CSR sees message 'A Board/School Number must be provided'
	
Examples:
  | UsingData               									|
  | QA_Payment_CombinationOfCreditCardPO_BoardSchoolNumber_Error	|


@PaymentMethod
@DWCACSR-310
@Priority1
@2
Scenario Outline:Error message shown when Account Number not entered_310:[<UsingData>]
	
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
	And CSR enters card information
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	When CSR perform tab to move out on [Account Number] textbox
	Then CSR sees error message above Account Number textbox with the text 'Please provide a unique number with the Purchase Order'
	
Examples:
  | UsingData               								|
  | QA_Payment_CombinationOfCreditCardPO_AccountNumber_Error	|


@PaymentMethod
@DWCACSR-310
@Priority1
@3
Scenario Outline:Error message shown when Board/School Number is not in AS400_310:[<UsingData>]
	
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
	And CSR enters card information
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	And CSR enters valid Account Number in Account textbox
	#And CSR clicks on Continue Checkout in Payment page
	#Then CSR sees error message above 'Board/ School Number' textbox
	And CSR sees message ‘We cannot seem to locate the Board/School with the number provided’
	
Examples:
  | UsingData               												|
  | QA_Payment_CombinationOfCreditCardPO_BoardSchoolNumber_Not_In_AS400_Error	|


@PaymentMethod
@DWCACSR-310
@Priority1
@4
Scenario Outline:Continue checkout button disabled when Board/School Number is not provided_310:[<UsingData>]
	
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
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Account Number in Account textbox
	Then Continue Checkout button is disabled in Payment page
	
Examples:
  | UsingData               												|
  | QA_Payment_Combination_Of_Credit_Card_PO_BoardSchoolNumber_ButtonDisabled	|

  
@PaymentMethod
@DWCACSR-310
@Priority1
@5
Scenario Outline:Continue checkout button disabled when Account Number is not provided_310:[<UsingData>]
	
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
	And CSR enters valid PO Number in Purchase Order textbox
	And CSR enters valid Board/ School Number in 'Board/ School Number' textbox
	Then Continue Checkout button is disabled in Payment page
	
Examples:
  | UsingData               											|
  | QA_Payment_Combination_Of_Credit_Card_PO_AccountNumber_ButtonDisabled	|

 
@PaymentMethod
@DWCACSR-310
@Priority1
@6
Scenario Outline:Error message shown when PO Number not entered_310:[<UsingData>]
	
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
	And CSR enters card information
	#And CSR clicks on Continue Checkout in Payment page
	And CSR perform tab to move out on [PO Number] textbox
	Then CSR sees error message above 'PO Number' textbox
	And CSR sees message 'A PO Number must be provided'
	
Examples:
  | UsingData               							|
  | QA_Payment_CombinationOfCreditCardPO_PONumber_Error	|

                                         
                                         
                                                                                                                        
                             