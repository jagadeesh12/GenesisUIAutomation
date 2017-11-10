Feature: Order Entry - Proceed To Checkout
	This feature is to validate the Order Entry - Proceed To Checkout Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@OrderEntry-ProceedToCheckout
@DWCACSR-197
@Priority2
@1
Scenario Outline:Verify CSR can click on the [Proceed To CheckOut] button and this should navigate to Review Cart Page

	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects [Continue To Verify Account] in Locate Account page
	And [Verify Account] page should be displayed
	And CSR selects [Continue To Order Entry] in Verify Account page
	And [Order Entry] page should be displayed
	And [Proceed To Checkout] button should be displayed
	And CSR enters Item#Qty 
	When CSR clicks on [Proceed To CheckOut]
	Then Review order page is displayed
		
Examples:
  | UsingData                  							|
  | CSR_clicks_ProceedToCheckout	|	