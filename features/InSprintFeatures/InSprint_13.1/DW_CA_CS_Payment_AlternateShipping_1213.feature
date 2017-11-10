Feature: Payment - Payment - Alternate (Split) Shipping Address - US Address
	This feature is to validate the Payment - Alternate (Split) Shipping Address - US Address scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Payment_AlternateShippingAddress
@DWCACSR-1213
@Priority1
@1
Scenario Outline:CSR sees the label changes when he selects US option from the country drop down list in a Alternate Shipping section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters PO Number
	And CSR selects Alternate Shipping Address Check box
	When CSR selects [US] option from the Country drop down list
	Then the label 'PROVINCE' changes to 'STATE'
	And the label 'Postal Code' changes to 'Zip'
	
Examples:
  | UsingData 								|
  | Label_changes_selects_US_PaymrntPage	|		
  

@Payment_AlternateShippingAddress
@DWCACSR-1213
@Priority1
@2
Scenario Outline:CSR sees 50 states within the United States and displays in alphabetical order when he selects US as a country and selects a STATE drop down:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters PO Number
	And CSR selects Alternate Shipping Address Check box
	And CSR selects [US] option from the Country drop down list
	When CSR clicks on STATE list
	Then the State drop down list displays 50 states within the United States
	And States list displays in alphabetical order
	
Examples:
  | UsingData 									|
  | States_list_50_displays_alphabetical_order	|	
  
  
@Payment_AlternateShippingAddress
@DWCACSR-1213
@Priority1
@3
Scenario Outline:CSR can enter only 5 integers within the Zip Code textbox:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters PO Number
	And CSR selects Alternate Shipping Address Check box
	And CSR selects [US] option from the Country drop down list
	When CSR enters integers in a Zip Code textbox
	Then the Zip Code textbox allows the entered value
	
Examples:
  | UsingData 							|
  | CSR_enters_5_integers_in_ZipCode	|	
  
    	
@Payment_AlternateShippingAddress
@DWCACSR-1213
@Priority1
@4
Scenario Outline:CSR sees 50 states within the United States and displays in alphabetical order when he selects US as a country and selects a STATE drop down:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters PO Number
	And CSR selects Alternate Shipping Address Check box
	And CSR selects [US] option from the Country drop down list
	When CSR enters more than 6 integers in a Zip Code textbox
	Then the Zip Code textbox should not allow the entered value
	
Examples:
  | UsingData 							|
  | CSR_enters_6_integers_in_ZipCode	|
  
  
@Payment_AlternateShippingAddress
@DWCACSR-1213
@Priority1
@5
Scenario Outline:CSR sees 50 states within the United States and displays in alphabetical order when he selects US as a country and selects a STATE drop down:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR enters PO Number
	And CSR selects Alternate Shipping Address Check box
	And CSR selects [US] option from the Country drop down list
	When CSR enters a Zip Code
	Then the Zip Code textbox should not allow the letters and Special characters
	
Examples:
  | UsingData 								|
  | CSR_enters_letters_in_ZipCode			|  	  
  | CSR_enters_Spec_chars_in_ZipCode		|  	  
  | CSR_enters_letters_spec_chars_in_ZipCode|
  
  
    	  
                                