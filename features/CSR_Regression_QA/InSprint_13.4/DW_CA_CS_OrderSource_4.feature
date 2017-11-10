Feature: Order Source – Select Order Path
	This feature is to validate the Order Source – Select Order Path Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@OrderSource
@DWCACSR-4
@Priority1
@1
Scenario Outline:CSR clicks on Mail Order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Mail Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR can succesfully submit the order
	
Examples:
  | UsingData               	|
  | QA_VerifyAccount_Mail_Order	|
 

@OrderSource
@DWCACSR-4
@Priority1
@2
Scenario Outline:CSR clicks on Fax order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Fax Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR can succesfully submit the order
	
Examples:
  | UsingData               |
  | QA_VerifyAccount_Fax_Order	|
 
    