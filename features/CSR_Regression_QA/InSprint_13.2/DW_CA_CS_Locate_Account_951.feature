Feature: Locate Account – The Search Form
	This feature is to validate the Locate Account – The Search Form scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

  
@LocateAccount
@Priority1
@DWCACSR-951
@2
Scenario Outline:CSR can enter up to maximum of ten integers within the Account Number textbox:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR enters the Account Number
	Then the Account Number field should accept the entered value
	
Examples:
  | UsingData 				|
  | QA_CSR_enters_10_integers	|
    
  
@LocateAccount
@Priority1
@DWCACSR-951
@3
Scenario Outline:CSR cannot enter other than integers and cannot enter more than 10 integers in the Account Number textbox:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR enters the Account Number
	Then the Account Number field should not accept the entered value
	
Examples:
  | UsingData 					|
  | QA_CSR_enters_11_integers	|



@LocateAccount
@Priority1
@DWCACSR-951
@3
Scenario Outline:CSR cannot enter other than integers and cannot enter more than 10 integers in the Account Number textbox_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR enters the Account Number
	Then the Account Number field should not accept the entered value
	
Examples:
  | UsingData 					|
  | QA_CSR_enters_alphabets		|

  
  
@LocateAccount
@Priority1
@DWCACSR-951
@3
Scenario Outline:CSR cannot enter other than integers and cannot enter more than 10 integers in the Account Number textbox_3:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR enters the Account Number
	Then the Account Number field should not accept the entered value
	
Examples:
  | UsingData 					|
  | QA_CSR_enters_special_chars	|
    
    
  
@LocateAccount
@Priority1
@DWCACSR-951
@4
Scenario Outline:Search button is disabled when CSR enters into the Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then the Search button is in disabled state
	
Examples:
  | UsingData 			|
  | QA_Search_btn_disabled	|
      
      	

     