@Perf200
Feature: Payment - Alternate (Split) Shipping Address - Validations
	This feature is to validate the Payment - Alternate (Split) Shipping Address - Validations scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter
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
	Then the province in which that postal code is related to will be automatically selected based on the its (1st) letter if it mapped more than one
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
  
  
          