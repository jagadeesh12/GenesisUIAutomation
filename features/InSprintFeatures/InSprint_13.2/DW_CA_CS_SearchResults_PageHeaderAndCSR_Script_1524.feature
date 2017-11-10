Feature: Search Results – Page Header & CSR Script 
	This feature is to validate the Search Results – Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@SearchResults_PageHeader&CSR_Script
@DWCACSR-1524
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Search Results header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then Blue step script icon should be displayed next to [Search Results] header in a page
	
Examples:
  | UsingData 											|
  | Blue_step_script_icon_displays_SearchResults_page	|		
  

@SearchResults_PageHeader&CSR_Script
@DWCACSR-1524
@Priority1
@2
Scenario Outline:Modal window displays with the title 'Search Results' when CSR clicks on Blue step script icon in Search Results page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
    When CSR clicks on Blue step script icon in [Search Results] page
    Then the modal window should be displayed with the title 'Search Results'
    And the close button 'X' should be displayed in the top right corner of the [Search Results] modal window
	
Examples:
  | UsingData 												|
  | Blue_step_script_icon_modalWindow_SearchResults_page	|		
  

@SearchResults_PageHeader&CSR_Script
@DWCACSR-1524
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Search Results page when CSR closes the modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
    And CSR clicks on Blue step script icon in [Search Results] page
    When CSR clicks on close button in [Search Results] modal window
	Then CSR is presented with the [Search Results] page
	
Examples:
  | UsingData 															|
  | Blue_step_script_icon_modalWindow_disappeared_SearchResults_page	|
  
  		
      