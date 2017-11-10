Feature: Locate Account - Page Header & CSR Script
	This feature is to validate the Locate Account - Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount_PageHeader&CSR_Script
@DWCACSR-949
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Locate Account header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then Blue step script icon should be displayed next to [Locate Account] header in a page
	
Examples:
  | UsingData 											|
  | Blue_step_script_icon_displays_LocateAccount_page	|		
  

@LocateAccount_PageHeader&CSR_Script
@DWCACSR-949
@Priority1
@2
Scenario Outline:Modal window displays with the title 'Locate Account' when CSR clicks on Blue step script icon in Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
    When CSR clicks on Blue step script icon in [Locate Account] page
    Then the modal window should be displayed with the title 'Locate Account'
    And the close button 'X' should be displayed in the top right corner of the [Locate Account] modal window
	
Examples:
  | UsingData 												|
  | Blue_step_script_icon_modalWindow_LocateAccount_page	|		
  

@LocateAccount_PageHeader&CSR_Script
@DWCACSR-949
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Locate Account page when CSR closes the modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
    And CSR clicks on Blue step script icon in [Locate Account] page
    When CSR clicks on close button in [Locate Account] modal window
	Then CSR is presented with the [Locate Account] page
	
Examples:
  | UsingData 															|
  | Blue_step_script_icon_modalWindow_disappeared_LocateAccount_page	|
  
  		
      