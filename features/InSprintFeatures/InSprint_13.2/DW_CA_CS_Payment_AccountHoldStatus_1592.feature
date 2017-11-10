Feature: Payment : Account Hold Status – API
	This feature is to validate the Account Hold Status – API – Status Override - UI -validation scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Payment
@Priority1
@DWCACSR-1592
@1
Scenario Outline:CSR sees Account Hold Status section and the radio button fields in a Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then the Customer Account Hold Status section displays
	And the header label displays as 'ACCOUNT HOLD STATUS:'
#	And the radio button displays with the label [Override order and place on 'Open' Status.]
#	And another radio button displays with the label [Submit order with 'Hold' Status.]
	
Examples:
  | UsingData 								|
  | Payment_Account_Hold_Status_radio_btns	|
  
  	
@Payment
@Priority1
@DWCACSR-1592
@2
Scenario Outline:Radio buttons should not be selected by default in a Account Hold Status section in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then the radio buttons should not be selected by default in a Account Hold Status section
		
Examples:
  | UsingData 						|
  | Payment_radio_btns_not_selected	|
     
     
     