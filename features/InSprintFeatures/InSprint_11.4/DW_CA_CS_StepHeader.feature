Feature: Rewards and Coupons
	This feature is to validate the Step Header scenarios.

Background: 
	Given CSR opens the rco-scholastic web site

@StepHeader
@DWCACSR-12
@Priority1
@1
Scenario Outline:Locate Account screen displays when CSR logs in to the application:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then "Locate Account" screen should be displayed
	And "Locate Account" tab should be highlighted
	
Examples:
  | UsingData                  	|
  | InSprint_11.4:CSR_enters_Locate_Account_to_Verify_Account_page	|		
  
    
@StepHeader
@DWCACSR-12
@Priority1
@2
Scenario Outline:Step header section displays correct order when CSR selects the order type:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then Step Header section should be in order from "Locate Account" to "Confirm & Submit"
	
Examples:
  | UsingData                  	|
  | Step_header_verify_order	|
  
      
@StepHeader
@DWCACSR-12
@Priority1
@3
@Manual
Scenario Outline:Highlight the page tab when CSR selects the order type and goes to particular page in step header section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type
	Then "Locate Account" tab should be highlighted
	When CSR goes to "Verify Account" page
	Then "Verify Account" tab should be highlighted
	When CSR goes to "Order Entry" page
	Then "Order Entry" tab should be highlighted
	When CSR goes to "Review Cart" page
	Then "Review Cart" tab should be highlighted
	When CSR goes to "Rewards & Coupons" page
	Then "Rewards & Coupons" tab should be highlighted
	When CSR goes to "Shipping & Payment" page
	Then "Shipping & Payment" tab should be highlighted
	When CSR goes to "Confirm & Submit" page
	Then "Confirm & Submit" tab should be highlighted
	
Examples:
  | UsingData                  		|
  | Step_header_section_highlight	|
  
        