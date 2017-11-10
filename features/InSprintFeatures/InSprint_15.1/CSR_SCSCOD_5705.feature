Feature: Order Entry - Teacher Orders - Reset Form
	This feature is to validate the CSR Order Entry - Teacher Orders - Reset Form scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@1
Scenario Outline:RESET button positioned at the bottom of the Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then RESET button displays in bottom of the page
	#And RESET button is in disabled by default
	
Examples:
  | UsingData 											|
  | InSprint_15.1:RESET_button_displays_OrderEntry_page	|
  

#@OrderEntry
#@Priority1
#@SCSCOD-5705
#@Sprint-15.1
#@2
#Scenario Outline:RESET button will be enabled when CSR starts enter the data in any of the order entry form fields:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	When CSR starts enter the data in any of the field
#	Then RESET button should be enabled
#	
#Examples:
#  | UsingData 											|
#  | InSprint_15.1:RESET_button_enabled_OrderEntry_page	|
  
  
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@3
Scenario Outline:Confirmation callout message displays when CSR clicks on RESET button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the data in any of the field in a form
	When CSR clicks on RESET button
	Then RESET button confirmation callout message displays
	And the text displays as 'Are you sure?' with YES and NO buttons
	
Examples:
  | UsingData 												|
  | InSprint_15.1:RESET_button_confirmation_msg_displays	|  
    
    
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@4
Scenario Outline:Entered Flyer data in a form will reset in a page when CSR clicks on RESET button and selects YES:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code
	When CSR clicks on RESET button and select YES
	Then the callout message will close automatically
	And the entered flyer data in a form will reset in a page
	
Examples:
  | UsingData 											|
  | InSprint_15.1:CSR_enters_FlyerCode_to_reset_data	|  
  
  
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@5
Scenario Outline:Entered Item Number data in a form will reset in a page when CSR clicks on RESET button and selects YES:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Item Number
	When CSR clicks on RESET button and select YES
	Then the callout message will close automatically
	And the entered Item number data in a form will reset in a page
	
Examples:
  | UsingData 										|
  | InSprint_15.1:CSR_enters_ItemNum_to_reset_data	|    
        
        
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@6
Scenario Outline:Entered Item QTY data in a form will reset in a page when CSR clicks on RESET button and selects YES:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Item Qty
	When CSR clicks on RESET button and select YES
	Then the callout message will close automatically
	And the entered Item Qty data in a form will reset in a page
	
Examples:
  | UsingData 										|
  | InSprint_15.1:CSR_enters_ItemQty_to_reset_data	|  
           
           
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@7
Scenario Outline:The data entered in a form will reset in a page when CSR clicks on RESET button and selects YES:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code, Item Num and Item Qty
	When CSR clicks on RESET button and select YES
	Then the callout message will close automatically
	And the data entered in a form will reset in a page
	
Examples:
  | UsingData 														|
  | InSprint_15.1:CSR_enters_FlyerCode_ItemNum_QTY_to_reset_data	|    
                        
                        
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@8
Scenario Outline:The data entered in a form will reset in a page when CSR navigate back from Review cart and clicks on RESET btn YES :[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code, Item Num and Item Qty
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to Order Entry page from Review Cart page
	When CSR clicks on RESET button and select YES
	Then the callout message will close automatically
	And the data entered in a form will reset in a page
	
Examples:
  | UsingData 															|
  | InSprint_15.1:data_reset_when_clicks_on_RESET_in_OrderEntry_page	| 
  
  
@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@9
Scenario Outline:The data entered in a form will not reset in a page when CSR clicks on RESET button and selects NO:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code, Item Num and Item Qty
	When CSR clicks on RESET button and select NO
	Then the callout message will close automatically
	And the data entered in a form will not reset in a page
	
Examples:
  | UsingData 								|
  | InSprint_15.1:CSR_selects_RESET_and_NO	|    
                             

@OrderEntry
@Priority1
@SCSCOD-5705
@Sprint-15.1
@10
Scenario Outline:Review Cart page displays after CSR clicks on RESET button and enter the data again and clicks on Proceed To Checkout:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code, Item Num and Item Qty
	And CSR clicks on RESET button and select YES
	When CSR enters the Flyer code, Item Num and Item Qty
	And CSR navigates to Review Cart page from Order Entry page
	Then Review cart page is displayed
	
Examples:
  | UsingData 													|
  | InSprint_15.1:ReviewCart_page_displays_after_enter_the data	| 
                                                        