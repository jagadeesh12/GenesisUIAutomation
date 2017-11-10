Feature: Maintain Account Hold Status – API – Status Override - Validation
	This feature is to validate the Maintain Account Hold Status – API – Status Override - Validation scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Payment
@Priority1
@DWCACSR-1511
@1
Scenario Outline:Continue checkout button not enabled until one of the hold status radio button is selected:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And 'ACCOUNT HOLD STATUS' is returned
	When CSR selects a payment method
	But does not select one of the radio buttons for hold status
	Then Continue Checkout button is not enabled
	
Examples:
  | UsingData 											|
  | QA_Payment_Account_Hold_Status_radio_btns_NoSelection	|
  
  	
@Payment
@Priority1
@DWCACSR-1511
@2
Scenario Outline:CSR selects one of the hold status radio button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And 'ACCOUNT HOLD STATUS' is returned
	And CSR selects a payment method
	When CSR selects one of the radio buttons for hold status
	And CSR clicks on Continue Checkout
	Then [Confirm & Submit] page displays
		
Examples:
  | UsingData 											|
  | QA_Payment_Account_Hold_Status_radio_btns_Selection	|
     
     
@Payment
@Priority1
@DWCACSR-1511
@3
Scenario Outline:Radio button for Hold status does not display if the account does not have a hold status:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then 'ACCOUNT HOLD STATUS' is NOT returned
	And radio buttons for hold status does not display
	When CSR selects a payment method
	And Continue Checkout button is enabled
		
Examples:
  | UsingData 									|
  | QA_Payment_Account_NO_Hold_Status_radio_btns	|
          