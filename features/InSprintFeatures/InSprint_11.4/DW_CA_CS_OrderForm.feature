Feature: Order Entry - Create Order Form
	This feature is to validate the Create Order Entry form
	
 Background: 
	Given CSR opens the rco-scholastic web site

	
@OrderEntry-CreateOrderForm
@DWCACSR-114
@Priority2
@1
Scenario Outline:Verify CSR can enter Flyer code [Flyer Code#]
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects [Continue To Verify Account] in Locate Account page
	And [Verify Account] page should be displayed
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] page should be displayed
	
	Examples:
  | UsingData                  							|
  | CSR_enters_valid Flyer Code	|
  
  
@OrderEntry-CreateOrderForm
@DWCACSR-114
@Priority1
@2
Scenario Outline:Verify an error message is displayed when CSR enters enters invalid Flyer code [Flyer Code#]
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects [Continue To Verify Account] in Locate Account page
	And [Verify Account] page should be displayed
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] page should be displayed
	
	Examples:
  | UsingData                  							|
  | CSR_enters_Invalid Flyer Code	|
 
@OrderEntry-CreateOrderForm
@DWCACSR-114
@Priority2
@3
Scenario Outline:Verify when CSR  enters a  valid flyer code is entered the system allows to enter items associated to the flyer
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects [Continue To Verify Account] in Locate Account page
	And [Verify Account] page should be displayed
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] page should be displayed
	
	Examples:
  | UsingData                  							|
  | CSR_enters_Invalid Flyer Code	|
  
