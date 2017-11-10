Feature: Order Entry - Start Order Process
	This feature is to validate the Order Entry - Start Order Process Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@1
Scenario Outline:Verify Account page displays when CSR selects Continue To Verify Account in Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR selects [Continue To Verify Account] in Locate Account page
	Then [Verify Account] page should be displayed
	
Examples:
  | UsingData                  							|
  | CSR_enters_Locate_Account_to_Verify_Account_page	|		
  
    
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@2
Scenario Outline:Order Entry page displays when CSR selects Continue To Order Entry in Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] page should be displayed
	
Examples:
  | UsingData                  						|
  | CSR_enters_Verify_Account_to_OrderEntry_page	|		
  
 
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@3
Scenario Outline:Order Entry tab highlights when CSR selects Continue To Order Entry in Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] tab should be highlighted
	
Examples:
  | UsingData                  	|
  | Order_Entry_tab_highlights	|		
  
  
  
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@4
Scenario Outline:Order Entry Form displays to enter the details for the Teacher’s order request:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then Teacher [Order Entry] form should be displayed
	
Examples:
  | UsingData                  						|
  | Order_Entry_form_displays_in_Order_Entry_page	|		
  
 
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority2
@5
Scenario Outline:CSR is presented with a button ‘Proceed to Checkout’ positioned in the footer region of the ‘Order Entry’ page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then [Proceed To Checkout] button should be displayed
	
Examples:
  | UsingData                  								|
  | Proceed_To_Checkout_button_displays_Order_Entry_page	|		
  

             