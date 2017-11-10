Feature: Confirm & Submit - Order Details Module - Rewards Module
	This feature is to validate the Confirm & Submit - Order Details Module - Rewards Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit
@Priority1
@DWCACSR-1047
@Manual
@1
Scenario Outline:CSR sees the correct labels for the REWARDS section in Order Detail rewards section in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the header label displays 'REWARDS' for Order Detail rewards section
	And the text displays 'Rewards Earned with Todays Qualifying Order Value of' in the 2nd layer of the module
	And the date and time displays as e.g. 1/30, 11:59pm ET based on the date in a Time and Date section in Order Detail rewards section
	
Examples:
  | UsingData 							|
  | Confirm_Submit_Order_Summary_module	|
  
  	
@Confirm&Submit
@Priority1
@DWCACSR-1047
@2
Scenario Outline:CSR sees correct qualifying order value in Order Detail rewards section in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then correct qualifying order value displays in Order Detail rewards section
	
Examples:
  | UsingData 							|
  | Confirm_Submit_qualifying_order_val	|
  


@Confirm&Submit
@Priority1
@DWCACSR-1047
@3
Scenario Outline:CSR sees the various types of rewards section in Order Detail rewards section in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then CSR sees the various types of rewards section displays in 3rd layer of the Order Detail rewards section
	
Examples:
  | UsingData 								|
  | Confirm_Submit_rewards_section_types	| 
  
   