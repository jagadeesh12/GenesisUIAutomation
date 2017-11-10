Feature: DWCACSR-196
	This feature is to validate the Customer Information Module Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site
	
@Priority1	
Scenario Outline:CSR can view [Add a Flyer] link on the right side towards the bottom of the Enter order page:[<UsingData>]

Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
When CSR is on the Order Entry page 
Then [Add Flyer] link is displayed 
Examples:
  | UsingData |
  | CSR_navigate_CreateOrderPage	|		