Feature: Locate – The Search Form – Search By – Account Number
	This feature is to validate the Locate – The Search Form – Search By – Account Number scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount
@Priority1
@DWCACSR-22
@1
Scenario Outline:CSR searches with Account number on Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then CSR is directed to the 'Search Results' page for the specific Teacher Account
	
Examples:
  | UsingData 						|
  | Search_With_AccountNumber_22	|
  
  
@LocateAccount
@Priority1
@DWCACSR-22
@2
Scenario Outline:CSR enters non-existing account number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR tries to enter [Account Number] which does not exist
	Then error callout message 'The Account number is invalid' displays
	And the Search button is in disabled state
	
Examples:
  | UsingData 								|
  | Search_With_NonExisting_AccountNumber	|
  

@LocateAccount
@Priority1
@DWCACSR-22
@3
Scenario Outline:Active Inactive state of Search button in Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And Search button is disabled by default in Locate Account Page
	When CSR tries to enter 1 character in [Account Number]
	Then the Search button is in enabled state
	
Examples:
  | UsingData 					|
  | Search_Enable_DisableState	|
  
                     