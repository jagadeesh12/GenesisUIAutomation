Feature: Verify Account - Page Header & CSR Script
	This feature is to validate the Verify Account - Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount_PageHeader&CSR_Script
@DWCACSR-77
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Verify Account header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then Blue step script icon should be displayed next to [verify Account] header in a page
	
Examples:
  | UsingData 											|
  | Blue_step_script_icon_displays_Verify_Account_page	|		
  

@VerifyAccount_PageHeader&CSR_Script
@DWCACSR-77
@Priority1
@2
Scenario Outline:Modal window displays with the title 'Verify Account' when CSR clicks on Blue step script icon in Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
    When CSR clicks on Blue step script icon in [Verify Account] page
    Then the modal window should be displayed with the title 'Verify Account'
    And the close button 'X' should be displayed in the top right corner of the [Verify Account] modal window
	
Examples:
  | UsingData 												|
  | Blue_step_script_icon_modalWindow_Verify_Account_page	|		
  

@VerifyAccount_PageHeader&CSR_Script
@DWCACSR-77
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Verify Account page when CSR closes the modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
    And CSR clicks on Blue step script icon in [Verify Account] page
    When CSR clicks on close button in [Verify Account] modal window
	Then CSR is presented with the [Verify Account] page
	
Examples:
  | UsingData 															|
  | Blue_step_script_icon_modalWindow_disappeared_Verify_Account_page	|
  
  		
      