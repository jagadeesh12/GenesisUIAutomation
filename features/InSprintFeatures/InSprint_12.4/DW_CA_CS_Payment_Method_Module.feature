Feature: Payment - Method & Module
	This feature is to validate the Payment - Method & Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site		
  

@Payment_Method
@DWCACSR-312
@Priority1
@1
Scenario Outline: CSR selects Checks as payment:[<UsingData>]

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	Then Cheques payable to section and message displays correctly
	And Continue Checkout button is enabled in the footer region of the page

Examples: 
	| UsingData       		|
	| CSR_Teacher_payment	|
	
	
@Payment_Module 
@DWCACSR-305 
@Priority1 
@1 
Scenario Outline:No payment options are displayed and continue checkout is enabled when CSR redeems the entire cart total using redemptions:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds student club and teacher catalogue items to the cart less than the [Shipping threshold]
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR enters amount equal to Student club amount owing in Student Bonus Bank
	And CSR enters amount equal to teacher club amount owing in Student Bonus Bank
	And CSR enters amount equal to Shipping amount owing in Student Bonus Bank
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then Payment options are not displayed
	And Continue Checkout button is enabled in the footer region of the page

Examples: 
	| UsingData                   |
	| CSR_Teacher_Payment_module  |	
	
	