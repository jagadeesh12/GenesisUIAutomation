Feature: Payment - Alternate (Split) Shipping Address
	This feature is to validate the Payment - Alternate (Split) Shipping Address scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@1
Scenario Outline:CSR sees the Alternate Shipping Address section when he clicks on check box and Continue Checkout button is enabled in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	When CSR selects Alternate Shipping Address Check box
	Then Alternate Shipping Address section expands and displays
	And the Continue Checkout button is enabled
	
Examples:
  | UsingData 										|
  | AlternateShipping_address_section_PaymrntPage	|		
  

@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@Manual
@2
Scenario Outline:CSR sees the correct labels for the Alternate Shipping Address section fields in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	When CSR selects Alternate Shipping Address Check box
	Then the label 'Address1' displays for the Address1 field with text box
	And the label 'Address2' displays for the Address2 field with text box
	And the label 'Postal Code' displays for the Postal Code field with text box
	And the label 'City' displays for the City field with text box
	And the label 'Province' displays for the Province drop down list
	And the placeholder for the Province displays 'Select Province/State'
	And the label 'Country' displays for the Country drop down list
	
Examples:
  | UsingData 										|
  | AlternateShipping_address_form_flds_PaymrntPage	|		


@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@3
Scenario Outline:CSR can enter maximum of 7 characters in a Postal Code field in Alternate Shipping Address section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the field should allow the entered value
	
Examples:
  | UsingData 								|
  | CSR_enters_7_characters_in_PostalCode	|	


@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@4
Scenario Outline:CSR cannot enter more than 7 characters in a Postal Code field in Alternate Shipping Address section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code
	Then the field should not allow the entered value
	
Examples:
  | UsingData 								|
  | CSR_enters_8_characters_in_PostalCode	|  
  
  
@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@5
Scenario Outline:Postal Code value displays space between the 3rd and 4th characters when CSR perform Tab key:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	And CSR enters Postal Code
	When CSR perform Tab key
	Then the entered Postal Code value displays space between the 3rd and 4th characters
	
Examples:
  | UsingData 						|
  | Displays_space_in_PostalCode	|  
  

@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@6
Scenario Outline:CSR sees the entries will automatically format to capitals when he enters a postal code in small letters:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR enters Postal Code as a small letteres
	Then the entries will automatically format to capitals
	
Examples:
  | UsingData 							|
  | PostalCode_entries_turns_Capital	|  
  

@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@7
Scenario Outline:CSR sees 13 Canadian provinces in a Province drop down list and it displays in ascending order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR clicks on Province drop down list
	Then the province drop down list displays 13 Canadian provinces
	And provinces list displays in ascending order
	
Examples:
  | UsingData 								|
  | Province_displays_13_ascending_order	|  
  
  
@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@8
Scenario Outline:Province and Country drop-down boxes are presented in a DISABLED state when the CSR opens the Alternate Address form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	When CSR selects Alternate Shipping Address Check box
	Then Province drop-down box displays as disabled state
	And Country drop-down box displays as disabled state
	
Examples:
  | UsingData 						|
  | Province_country_flds_disabled	|  
  
    
@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@9
Scenario Outline:Province and Country drop-down boxes are presented in a DISABLED state when the CSR opens the Alternate Address form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	When CSR selects Alternate Shipping Address Check box
	Then the country [Canada] is selected by default
	
Examples:
  | UsingData 						|
  | Province_country_flds_disabled	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@10
Scenario Outline:CSR sees country drop down list contains Canada and United States:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR clicks on Country drop down list
	Then the country drop down list contains [Canada] [United States]
	
Examples:
  | UsingData 					|
  | country_dropdown_canada_US	|  
          

@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@11
Scenario Outline:Continue Checkout button turns into disabled state when CSR starts enter the values in a alternate shipping address field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR starts enter the value in a <field>
	Then Continue Checkout button turns into disabled state
	
Examples:
  | UsingData 					|
  | CSR_enters_Address1_field	| 
  | CSR_enters_Address2_field	| 
  | CSR_enters_PostalCode_field	| 
  | CSR_enters_City_field		| 
  
  
@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@12
Scenario Outline:Continue Checkout button turns into disabled state when CSR select the Province in a alternate shipping address field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR selects the Provice
	Then Continue Checkout button turns into disabled state
	
Examples:
  | UsingData 				|
  | CSR_selects_Province	| 
  

@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@13
Scenario Outline:Continue Checkout button turns into disabled state when CSR select the Province in a alternate shipping address field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters [PO Number]
	And CSR selects Alternate Shipping Address Check box
	When CSR selects the Country
	Then Continue Checkout button turns into disabled state
	
Examples:
  | UsingData 			|
  | CSR_selects_Country	| 
                       
                       
@Payment_AlternateShippingAddress
@DWCACSR-307
@Priority1
@14
Scenario Outline:Alternate Shipping Address field is always displays for the CSR:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then Alternate Shipping Address checkbox displays
	When CSR selects Alternate Shipping Address Check box
	Then Alternate Shipping Address checkbox displays
	When CSR selects Checks as payment
	And CSR enters [PO Number]
	Then Alternate Shipping Address checkbox displays
	
Examples:
  | UsingData 								|
  | Alternate_Shipping_Address_displays_CSR	| 
  
  
  
                                