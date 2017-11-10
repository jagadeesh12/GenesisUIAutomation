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
  | Error_callOut_msg_not_displays_PaymrntPage	|		
  

@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@2
Scenario Outline:Error callOut message displays when CSR does not follow the format ‘Letter-Integer-Letter-Space-Integer-Letter-Integer’:[<UsingData>]
	
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
  | Error_callOut_msg_1_displays_PaymentPage	|
  | Error_callOut_msg_2_displays_PaymentPage	|
  | Error_callOut_msg_3_displays_PaymentPage	|
  | Error_callOut_msg_4_displays_PaymentPage	|
  | Error_callOut_msg_5_displays_PaymentPage	|
  | Error_callOut_msg_6_displays_PaymentPage	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@3
Scenario Outline:CSR sees the province in which that postal code is related to will be automatically selected based on the its 1st letter:[<UsingData>]
	
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
  | province_selects_automatically_PaymentPage_A	|
  | province_selects_automatically_PaymentPage_B	|
  | province_selects_automatically_PaymentPage_C	|
  | province_selects_automatically_PaymentPage_E	|
  | province_selects_automatically_PaymentPage_G	|
  | province_selects_automatically_PaymentPage_H	|
  | province_selects_automatically_PaymentPage_J	|
  | province_selects_automatically_PaymentPage_K	|
  | province_selects_automatically_PaymentPage_L	|
  | province_selects_automatically_PaymentPage_M	|
  | province_selects_automatically_PaymentPage_N	|
  | province_selects_automatically_PaymentPage_P	|
  | province_selects_automatically_PaymentPage_R	|
  | province_selects_automatically_PaymentPage_S	|
  | province_selects_automatically_PaymentPage_T	|
  | province_selects_automatically_PaymentPage_V	|
  | province_selects_automatically_PaymentPage_Y	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@4
Scenario Outline:Drop down list enables if the 1st letter is mapped to 1 or more provinces and CSR sees the province in which that postal code is related to will be automatically selected:[<UsingData>]
	
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
  | province_dropDown_enabled_PaymrntPage_X	|
  

@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@Manual
@5
Scenario Outline:CSR can select only one province from the list if the 1st letter of Postal code is mapped to 1 or more Provinces:[<UsingData>]
	
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
	And CSR enters Postal Code
	When CSR try to select more than one province from the drop down list
	Then CSR can see only one province which is selected from the list
	
Examples:
  | UsingData 										|
  | CSR_can_select_only_one_province_PaymrntPage	|    
  
  
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
  | ContinueCheckout_btn_enabled_PaymrntPage	|
   
   
@Payment_AlternateShippingAddress
@DWCACSR-315
@Priority1
@7
Scenario Outline:CONTINUE CHECKOUT button is disable when CSR doen't fill any of the field in alternate shipping address:[<UsingData>]
	
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
  | ContinueCheckout_btn_disabled_PaymrntPage_NoAddress1	|     
  | ContinueCheckout_btn_disabled_PaymrntPage_NoPostalCode	|  
  | ContinueCheckout_btn_disabled_PaymrntPage_NoCity		|  
   
   
   