Feature: Locate Account – Page Framework
	This feature is to validate the Locate Account – Page Framework scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site
  
  
@LocateAccount
@Priority1
@DWCACSR-950
@1
Scenario Outline:CSR sees the Locate Customer Account by: section with Account Number and Search By options to search the account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then CSR sees the Locate Customer Account by: section with [Account Number] and [Search By] options to search the account
	
Examples:
  | UsingData 							|
  | CSR_LocateCustomer_Account_section	|
    
  