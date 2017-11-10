Feature: Search Results – School Not in System
	This feature is to validate the Search Results – School Not in System scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@SearchResults
@DWCACSR-1535
@Priority1
@1
Scenario Outline:CSR clicks on 'School Not in System' hyperlink:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on 'School Not in System'
	Then CSR is presented with a modal window with the title 'Instructions for CSR'
	And a paragraph of text displays
	And an icon X in the top right of the window
	
Examples:
  | UsingData 									|
  | Perf_QA_Search_results_SchoolNotInSystem_OnClick	|			
  
  
@SearchResults
@DWCACSR-1535
@Priority1
@2
Scenario Outline:CSR clicks on Close button on School Not in System modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR clicks on 'School Not in System'
	When CSR clicks on Close button
	Then CSR will be re-directed to the 'Search Form' on the Locate Account page
	
Examples:
  | UsingData 												|
  | Perf_QA_Search_results_SchoolNotInSystem_OnClick_CloseButton	|	
    	

@SearchResults
@DWCACSR-1535
@Priority1
@3
Scenario Outline:CSR view the 'School Not in System' hyperlink:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then search results display with a hyperlink 'School Not in System' positioned at the bottom right of every tabular structure of Search Results
	
Examples:
  | UsingData 							|
  | Perf_QA_Search_results_SchoolNotInSystem	|	
    	  