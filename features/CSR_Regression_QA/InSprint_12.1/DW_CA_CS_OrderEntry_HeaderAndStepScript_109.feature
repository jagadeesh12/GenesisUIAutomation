@Perf200
Feature: Order Entry - Header and Step Script
	This feature is to validate the Order Entry - Header and Step Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@1
@123
Scenario Outline:Step header text 'Enter New Order' displays in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	Then the step header should have the text 'Enter New Order'
	
Examples:
  | UsingData 							|
  | QA_Enter_New_Order_text_OrderEntryPage	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@2
Scenario Outline:CSR should see a blue step script icon beside the Verify Account header in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	Then CSR should see a blue step script icon beside the Verify Account header
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_blue_step_script_icon	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@3
Scenario Outline:Order Entry Script displays when CSR clicks on blue step script icon in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on blue step script icon in Order Entry page
	Then [Order Entry Script] popup should be displayed
	#And correct text should be displayed in the popup
	
Examples:
  | UsingData 					|
  | QA_CSR_sees_Order_Entry_Script	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@4
Scenario Outline:close btn 'X' displays in the top right corner of the modal window in Order Entry Script modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on blue step script icon in Order Entry page
	Then the close button 'X' should be displayed in the top right corner of the modal window
	
Examples:
  | UsingData 											|
  | QA_CSR_sees_close_btn_in_OrderEntryScript_modal_window	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@5
Scenario Outline:Verify Account page displays when CSR clicks on close btn 'X' in Order Entry Script modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR clicks on blue step script icon in Order Entry page
	When CSR clicks on close button in Order Entry Script modal window
	Then [Order Entry] page should be displayed
	
Examples:
  | UsingData 												|
  | QA_Verify_Account_page_displays_when_CSR_closes_the_window	|			
  
    