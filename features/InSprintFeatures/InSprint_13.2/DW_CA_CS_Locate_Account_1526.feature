Feature: Locate Account – Search Results – Start a New Search
	This feature is to validate the Locate Account – Search Results – Start a New Search scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount
@Priority1
@DWCACSR-1526
@1
Scenario Outline:CSR sees the hyperlink with the label Start a New Search in a Search Results page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then the hyperlink with the label 'Start a New Search' displays in a Search Results page
	
Examples:
  | UsingData 						|
  | Hyperlink_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1526
@2
Scenario Outline:CSR will be re-directed to the Locate Account page when he clicks on Start a New Search hyperlink:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on [Start a New Search] hyperlink
	Then CSR will be re-directed to the [Locate Account] page
	
Examples:
  | UsingData 							|
  | CSR_redirects_to_LocateAccount_page	|
  

@LocateAccount
@Priority1
@DWCACSR-1526
@3
Scenario Outline:CSR sees the hyperlink with the label 'Start a New Search' in a Search Results page when he searches by Teacher Name:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches by [Teacher Name]
	Then the hyperlink with the label 'Start a New Search' displays in a Search Results page
	
Examples:
  | UsingData 									|
  | TeacherName_Hyperlink_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1526
@4
Scenario Outline:CSR will be re-directed to the Locate Account page when he clicks on Start a New Search hyperlink when he searches by Teacher Name:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches by [Teacher Name]
	When CSR clicks on [Start a New Search] hyperlink
	Then CSR will be re-directed to the [Locate Account] page
	
Examples:
  | UsingData 										|
  | CSR_redirects_to_LocateAccount_page_TeacherName	|
       
  
  
@LocateAccount
@Priority1
@DWCACSR-1526
@5
Scenario Outline:CSR sees the hyperlink with the label 'Start a New Search' in a Search Results page when he searches by School Address:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches by [School Address]
	Then the hyperlink with the label 'Start a New Search' displays in a Search Results page
	
Examples:
  | UsingData 										|
  | SchoolAddress_Hyperlink_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1526
@6
Scenario Outline:CSR will be re-directed to the Locate Account page when he clicks on Start a New Search hyperlink when he searches by School Address:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches by [School Address]
	When CSR clicks on [Start a New Search] hyperlink
	Then CSR will be re-directed to the [Locate Account] page
	
Examples:
  | UsingData 											|
  | CSR_redirects_to_LocateAccount_page_SchoolAddress	|
              