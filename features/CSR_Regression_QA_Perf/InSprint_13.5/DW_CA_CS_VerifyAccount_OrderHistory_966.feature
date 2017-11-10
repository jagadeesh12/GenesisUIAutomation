Feature: Verify Account - Order History – View Order History List
	This feature is to validate the Verify Account - Order History – View Order History List scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@DWCACSR-966
@Priority1
@1
Scenario Outline:CSR looks at the order in the order History module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented with the header 'Order History & Status'
	And Order [Order Number] displays
	And Placed Date: [YYYY-MM-DD] displays
	
Examples:
  | UsingData 					|
  | Perf_QA_VerifyAccount_OrderHistory	|		
  

@VerifyAccount
@DWCACSR-966
@Priority1
@2
Scenario Outline:Order History for Phone Order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Phone Order displays in Order History section
	
Examples:
  | UsingData 							|
  | Perf_QA_VerifyAccount_OrderHistory_Phone	|		
 
 
@VerifyAccount
@DWCACSR-966
@Priority1
@3
Scenario Outline:Order History for mail order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Mail Order displays in Order History section
	
Examples:
  | UsingData 						|
  | Perf_QA_VerifyAccount_OrderHistory_Mail	|		
   
   
@VerifyAccount
@DWCACSR-966
@Priority1
@4
Scenario Outline:OrderHistory for fax order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Fax Order displays in Order History section
	
Examples:
  | UsingData 						|
  | Perf_QA_VerifyAccount_OrderHistory_Fax	|		
   
   
@VerifyAccount
@DWCACSR-966
@Priority1
@5
Scenario Outline:Order History for Online order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Online displays in Order History section
	
Examples:
  | UsingData 							|
  | Perf_QA_VerifyAccount_OrderHistory_Online	|		
 
 
@VerifyAccount
@DWCACSR-966
@Priority1
@6
Scenario Outline:Order History for Held Order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Status: 'Held by Accounting' displays in Order History section
	
Examples:
  | UsingData 										|
  | Perf_QA_VerifyAccount_OrderHistory_Held_by_Accounting	|		


@VerifyAccount
@DWCACSR-966
@Priority1
@7
Scenario Outline:Order History sort order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then order history line-items are arranged/sorted by the most recent 'Placed Date'
	
Examples:
  | UsingData 						|
  | Perf_QA_VerifyAccount_OrderHistory_Sort	|		
              