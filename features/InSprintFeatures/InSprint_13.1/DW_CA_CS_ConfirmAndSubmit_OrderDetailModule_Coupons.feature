Feature: Confirm & Submit – Order Details Module – Coupons Module
	This feature is to validate the Confirm & Submit – Order Details Module – Coupons Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit
@Priority1
@DWCACSR-1048
@Manual
@1
Scenario Outline:CSR sees the correct labels for the COUPONS section in Order Detail coupons section in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies a coupon
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the header label displays 'COUPONS' for Order Detail rewards section
	And CSR is presented with the label of the Coupon(s)  <Coupon Code> and Description pulled from Business Manager
	
Examples:
  | UsingData 								|
  | Confirm_Submit_coupon_Summary_module	|
  
  	
@Confirm&Submit
@Priority1
@DWCACSR-1048
@Manual
@2
Scenario Outline:CSR sees FreePick item in a table with details in coupons section of Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies a FreePick coupon
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then CSR sees table in a Coupons section with the details of [Item] [Item Title] [Grade Level] [Amount] [QTY]
	
Examples:
  | UsingData 								|
  | Confirm_Submit_coupon_freePick_table	|
  
  	