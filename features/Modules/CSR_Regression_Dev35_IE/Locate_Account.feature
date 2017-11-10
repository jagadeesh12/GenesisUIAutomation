Feature: Locate Account
	This feature is to validate the Locate Account page scenarios

 
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
  | Dev35_Hyperlink_in_SearchResultsPage	|
  
  
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
  | Dev35_CSR_redirects_to_LocateAccount_page	|
  

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
  | Dev35_TeacherName_Hyperlink_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1526
@4
Scenario Outline:CSR will be re-directed to the Locate Account page when he clicks on Start a New Search hyperlink searches by Teacher Name:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches by [Teacher Name]
	When CSR clicks on [Start a New Search] hyperlink
	Then CSR will be re-directed to the [Locate Account] page
	
Examples:
  | UsingData 										|
  | Dev35_CSR_redirects_to_LocateAccount_page_TeacherName	|
       
  
  
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
  | Dev35_SchoolAddress_Hyperlink_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1526
@6
Scenario Outline:CSR will be re-directed to the Locate Account page when he clicks on Start a New Search hyperlink searches by School Address:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches by [School Address]
	When CSR clicks on [Start a New Search] hyperlink
	Then CSR will be re-directed to the [Locate Account] page
	
Examples:
  | UsingData 											|
  | Dev35_CSR_redirects_to_LocateAccount_page_SchoolAddress	|


@LocateAccount
@Priority1
@DWCACSR-950
@1
Scenario Outline:CSR sees the Locate Customer Account by: section with Account Number and Search By options to search the account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then CSR sees the Locate Customer Account by: section with [Account Number] and [Search By] options to search the account
	
Examples:
  | UsingData 							|
  | Dev35_CSR_LocateCustomer_Account_section	|
    

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
  | Dev35_CSR_enters_10_integers	|
    
  
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
  | Dev35_CSR_enters_11_integers	|



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
  | Dev35_CSR_enters_alphabets		|

  
  
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
  | Dev35_CSR_enters_special_chars	|
    
    
  
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
  | Dev35_Search_btn_disabled	|
      
      	
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
  | Dev35_Blue_step_script_icon_displays_LocateAccount_page	|		
  

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
  | Dev35_Blue_step_script_icon_modalWindow_LocateAccount_page	|		
  

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
  | Dev35_Blue_step_script_icon_modalWindow_disappeared_LocateAccount_page	|
  
  		
@LocateAccount_SearchResults_StepHeader
@DWCACSR-1523
@Priority1
@1
Scenario Outline:Locate Account tab highlights in the step indicator when CSR enters into the Locate Account Search Results page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
    Then [Locate Account] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               					|
  | Dev35_SearchResults_Locate_Account_tab_highlights	|		
  

@LocateAccount_SearchResults_StepHeader
@DWCACSR-1523
@Priority1
@2
Scenario Outline:Number of the LOCATE ACCOUNT page displays correctly in a bubble containing step header in a Search Results:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then the step header number for the [Locate Account] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  						|
  | Dev35_SearchResults_Number_for_the_Locate_Account_tab	|	
  
  
@LocateAccount_StepHeader
@DWCACSR-20
@Priority1
@1
Scenario Outline:Locate Account tab highlights in the step indicator when CSR enters into the Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
    Then [Locate Account] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               		|
  | Dev35_Locate_Account_tab_highlights	|		
  

@LocateAccount_StepHeader
@DWCACSR-20
@Priority1
@2
Scenario Outline:Number of the LOCATE ACCOUNT page displays correctly in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	When CSR selects the order type as [Phone Order]
	Then the step header number for the [Locate Account] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  			|
  | Dev35_Number_for_the_Locate_Account_tab	|	
  
  
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
  | Dev35_Search_results_SchoolNotInSystem_OnClick	|			
  
  
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
  | Dev35_Search_results_SchoolNotInSystem_OnClick_CloseButton	|	
    	

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
  | Dev35_Search_results_SchoolNotInSystem	|	


@LocateAccount
@Priority1
@DWCACSR-1518
@1
Scenario Outline:Character limit on School Name field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	When CSR enters School Name more than 70 characters
	Then the School Name does not accept more than 70 characters
	
Examples:
  | UsingData 								|
  | Dev35_Search_By_SchoolAddress_morethan_70	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1521
@1
Scenario Outline:CSR sees a list of teachers with matching information when using the teacher’s first and last name:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name
	And CSR enters at least 1 character in Last Name
	When clicks on Search
	Then the first name that was entered should have an occurrence in the first name of each row under Teacher Name column
	And the last name that was entered should have an occurrence in the last name of each row under Teacher Name column
	
Examples:
  | UsingData 						|
  | Dev35_SearchForm_TeacherNameCombo	|
  

@LocateAccount
@Priority1
@DWCACSR-1528
@1
Scenario Outline:CSR sees the school name, province and city in result paragraph when the school name, province and city entered in search form_1528:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	When clicks on Search
	Then school name, city and province in the result paragraph match [School Name], [City] and [Province] from the search form
	
Examples:
  | UsingData 																|
  | Dev35_Search_By_SchoolAddress_Result_Paragraph_School_Name_Province_City	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1528
@2
Scenario Outline:Only school name, postal, province and city in result paragraph when the school name, postal, province and city are entered_1528:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code in the postal code text-box
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	When clicks on Search
	Then school name, city, province and postal code in the result paragraph match [School Name], [City], [Province] and [Postal Code] from the search form
	
Examples:
  | UsingData 																			|
  | Dev35_Search_By_SchoolAddress_Result_Paragraph_School_Name_Postal_Code_Province_City	|
  

@LocateAccount
@Priority1
@DWCACSR-1531
@DWCACSR-1534
@1
Scenario Outline:The school value in the result paragraph matches the school clicked from the school listing page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	When CSR selects the first school name under the School Name column and get the value
	Then the school value in the result paragraph matches the school clicked from the school listing page
	
Examples:
  | UsingData 											|
  | Dev35_Search_By_SchoolAddress_TeacherListing_School_Name	|
  
 
@LocateAccount
@Priority1
@DWCACSR-1531
@DWCACSR-1534
@2
Scenario Outline:The school address value in the result paragraph matches the school address clicked from the school listing page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	And CSR selects the first school address under the School Address column
	Then the school address value in the result paragraph matches the school address clicked from the school listing page
	
Examples:
  | UsingData 												|
  | Dev35_Search_By_SchoolAddress_TeacherListing_School_Address	|
    

@LocateAccount
@Priority1
@DWCACSR-1532
@1
Scenario Outline:Hyperlink 'Back to School Listing' is present on the teacher listing result page after click on a school in the school listing page_1532:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	When CSR selects the first school name under the School Name column
	Then hyperlink 'Back to School Listing' is present above the Teacher Listing Search results table and to the right of 'Start a New Search' hyperlink
	
Examples:
  | UsingData 																	|
  | Dev35_Search_By_SchoolAddress_BacktoSchool_HyperLink_SchoolListing_TeacherListing	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1532
@2
Scenario Outline:Hyperlink 'Back to School Listing' is not present on the teacher listing page after searching using the teachers F and L name_1532:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name
	And CSR enters at least 1 character in Last Name
	And clicks on Search
	Then hyperlink 'Back to School Listing' is not present above the Teacher Listing Search results table
	
Examples:
  | UsingData 															|
  | Dev35_Search_By_SchoolAddress_BacktoSchool_NoHyperLink_TeacherNameSearch	|
  
 
@LocateAccount
@Priority1
@DWCACSR-1532
@3
Scenario Outline:The hyperlink 'Back to School Listing' returns to the school listing result page that was previously shown_1532:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	And CSR selects the first school name under the School Name column
	When CSR clicks on 'Back to School Listing' hyperlink
	Then CSR sees the same school listing results as shown previously
	
Examples:
  | UsingData 												|
  | Dev35_Search_By_SchoolAddress_BacktoSchool_HyperlinkClicked	|
    
    
@LocateAccount
@Priority1
@DWCACSR-1533
@1
Scenario Outline:CSR sees a list of teachers with matching information when using the teacher's first and last name:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	When clicks on Search
	#When CSR selects the first school name under the School Name column
	Then the School name that was entered should have an occurrence in the complete name of each row under School Name column
	
Examples:
  | UsingData 											|
  | Dev35_Search_By_SchoolAddress_TeacherListing_Occurrences	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1536
@1
Scenario Outline:A result paragraph that has no results when the school name, postal code, province and city are provided:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters that will give no result
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code in the postal code text-box that will give no result
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	When clicks on Search
	Then result paragraph 'We found 0 results for [School Name], [City], [Province], [Postal Code]' is shown under the page
	
Examples:
  | UsingData 																|
  | Dev35_Search_By_SchoolAddress_NoResults_School_Name_Postal_Code_Province_City	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1536
@2
Scenario Outline:A result paragraph that has no results when the teacher’s first and last name are provided:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name that will give no result
	And CSR enters at least 1 character in Last Name that will give no result
	When clicks on Search
	Then result paragraph 'We found 0 results for [Last Name] [First Name]' is shown under the page header
	
Examples:
  | UsingData 												|
  | Dev35_Search_By_TeacherName_NoResults_First_Name_Last_Name	|
  

@LocateAccount
@Priority1
@DWCACSR-1536
@3
Scenario Outline:A result paragraph that has no results when the school name and postal code are provided only:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code in the postal code text-box that will give no result
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	When clicks on Search
	Then result paragraph 'We found 0 results for [City], [Province], [Postal Code]' is shown under the page
	
Examples:
  | UsingData 													|
  | Dev35_Search_By_SchoolAddress_NoResults_Postal_Code_Province_City	|
  

@LocateAccount
@Priority1
@DWCACSR-1536
@4
Scenario Outline:A result paragraph that has no results when the province and city are provided:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	When clicks on Search
	Then result paragraph 'We found 0 results for [City], [Province]' is shown under the page
	
Examples:
  | UsingData 										|
  | Dev35_Search_By_SchoolAddress_NoResults_Province_City	|
  

@LocateAccount
@Priority1
@DWCACSR-22
@1
Scenario Outline:CSR searches with Account number on Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then CSR is directed to the 'Search Results' page for the specific Teacher Account
	
Examples:
  | UsingData 						|
  | Dev35_Search_With_AccountNumber_22	|
  
  
@LocateAccount
@Priority1
@DWCACSR-22
@2
Scenario Outline:CSR enters non-existing account number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR tries to enter [Account Number] which does not exist
	Then error callout message 'The Account number is invalid' displays
	And the Search button is in disabled state
	
Examples:
  | UsingData 								|
  | Dev35_Search_With_NonExisting_AccountNumber	|
  

@LocateAccount
@Priority1
@DWCACSR-22
@3
Scenario Outline:Active Inactive state of Search button in Locate Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And Search button is disabled by default in Locate Account Page
	When CSR tries to enter 1 character in [Account Number]
	Then the Search button is in enabled state
	
Examples:
  | UsingData 					|
  | Dev35_Search_Enable_DisableState	|
  

@LocateAccount
@Priority1
@DWCACSR-24
@1
Scenario Outline:Search button enabled when First Name field has at least 1 character then Last Name has at least 1 character:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name
	And CSR enters at least 1 character in Last Name
	Then the Search button is in enabled state
	
Examples:
  | UsingData 					|
  | Dev35_Search_By_TeacherName_24_1	|
  
  
@LocateAccount
@Priority1
@DWCACSR-24
@2
Scenario Outline:Character limit on First Name field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	When CSR enters First Name more than 50 characters
	Then the First Name does not accept more than 50 characters
	
Examples:
  | UsingData 					|
  | Dev35_Search_By_TeacherName_24_2	|
  

@LocateAccount
@Priority1
@DWCACSR-24
@3
Scenario Outline:Character limit on Last Name field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	When CSR enters Last Name more than 50 characters
	Then the Last Name does not accept more than 50 characters
	
Examples:
  | UsingData 					|
  | Dev35_Search_By_TeacherName_24_3	|
  
 
@LocateAccount
@Priority1
@DWCACSR-24
@4
Scenario Outline:Teacher Listing Search Results page is shown after First and Last name are entered and searched:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name
	And CSR enters at least 1 character in Last Name
	And clicks on Search
	Then the page 'Teacher Listing Search Results' appears
	
Examples:
  | UsingData 					|
  | Dev35_Search_By_TeacherName_24_4	|
         
         
@LocateAccount
@Priority1
@DWCACSR-1519
@1
Scenario Outline:Character limit in the Postal Code:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	When CSR enters more than 7 characters in 'Postal Code' textbox
	Then Postal Code does not accept more than 7 characters
	
Examples:
  | UsingData 												|
  | Dev35_SearchBy_SchoolAddress_Canada_Postal_Code_8Characters	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1519
@2
Scenario Outline:Search button enabled when a valid Postal Code is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code
	When CSR clicks outside the Postal Code textbox
	Then Search button is enabled in Locate Account page
	
Examples:
  | UsingData 																|
  | Dev35_SearchBy_SchoolAddress_Canada_Valid_Postal_Code_6charcters				|
  | Dev35_SearchBy_SchoolAddress_Canada_Valid_Postal_Code_7charcters_with_space	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1519
@3
Scenario Outline:Error message shown when a invalid Postal Code is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters invalid Postal Code
	When CSR clicks outside the Postal Code textbox
	Then error message is shown above the Postal Code textbox
	
Examples:
  | UsingData 																|
  | Dev35_SearchBy_SchoolAddress_Canada_Invalid_Postal_Code_6charcters			|
  | Dev35_SearchBy_SchoolAddress_Canada_Invalid_Postal_Code_7charcters_with_space	|


@LocateAccount
@Priority1
@DWCACSR-1519
@4
Scenario Outline:CSR sees School Listing Search Results page when using only valid Postal Code:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code
	When clicks on Search
	Then CSR sees the 'School Listing Search Results' page
	
Examples:
  | UsingData 														|
  | Dev35_SearchBy_SchoolAddress_Canada_Valid_Postal_Code_6charcters_2	|
  

@LocateAccount
@Priority1
@DWCACSR-1519
@5
Scenario Outline:CSR sees all provinces in Canada when Province drop-down is clicked:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR selects the Province drop-down
	Then CSR sees all 13 provinces of Canada in alphabetical order
	
Examples:
  | UsingData 									|
  | Dev35_SearchBy_SchoolAddress_Canada_AllProvinces	|
  

@LocateAccount
@Priority1
@DWCACSR-1520
@1
Scenario Outline:Character limit in the Zip Code:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'US' from the 'Country' drop-down box
	When CSR enters more than 10 integers in 'Zip Code' textbox
	Then Zip Code does not accept more than 10 integers
	
Examples:
  | UsingData 										|
  | Dev35_SearchBy_SchoolAddress_US_Zip_Code_11_Integers	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1520
@2
Scenario Outline:Search button enabled when a valid Zip Code is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'US' from the 'Country' drop-down box
	And CSR enters valid Zip Code
	And CSR clicks outside the Zip Code textbox
	Then Search button is enabled in Locate Account page
	
Examples:
  | UsingData 												|
  | Dev35_SearchBy_SchoolAddress_US_Valid_Postal_Code_5_Integers	|
#  | Dev35_SearchBy_SchoolAddress_US_Valid_Postal_Code_7_Integers	|
#  | Dev35_SearchBy_SchoolAddress_US_Valid_Postal_Code_10_Integers	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1520
@3
Scenario Outline:Error message shown when a invalid Zip Code is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'US' from the 'Country' drop-down box
	And CSR enters invalid Zip Code
	#And CSR clicks outside the Zip Code textbox
	Then error message is shown above the Zip Code textbox
	
Examples:
  | UsingData 															|
  | Dev35_SearchBy_SchoolAddress_US_Invalid_Postal_Code_Special_Characters	|   
  
  
@LocateAccount
@Priority1
@DWCACSR-1520
@4
Scenario Outline:CSR sees School Listing Search Results page when using only valid Zip Code:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'US' from the 'Country' drop-down box
	And CSR enters valid Zip Code
	And clicks on Search
	Then CSR sees the 'School Listing Search Results' page
	
Examples:
  | UsingData 											|
  | Dev35_SearchBy_SchoolAddress_US_Valid_Zip_Code_5_Integers	|   
  
      
@LocateAccount
@Priority1
@DWCACSR-1520
@5
Scenario Outline:CSR sees all states in US when State drop-down is clicked:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'US' from the 'Country' drop-down box
	When CSR selects the State drop-down
	Then CSR sees all 50 states of US in alphabetical order
	
Examples:
  | UsingData 							|
  | Dev35_SearchBy_SchoolAddress_US_AllStates	|   
  
      
@LocateAccount
@Priority1
@DWCACSR-6107
@1
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a school name search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 													|
  | Dev35_LocateAccount_SchoolAddress_SchoolName_NoSchoolHyperlink	|
  
  
@LocateAccount
@Priority1
@DWCACSR-6107
@2
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a school name and postal search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 															|
  | Dev35_LocateAccount_SchoolAddress_SchoolName_PostalCode_NoSchoolHyperlink	|
  
  
@LocateAccount
@Priority1
@DWCACSR-6107
@3
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a school name, province and city search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 																|
  | Dev35_LocateAccount_SchoolAddress_SchoolName_Province_City_NoSchoolHyperlink	|


@LocateAccount
@Priority1
@DWCACSR-6107
@4
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a school name, postal, province and city search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 																			|
  | Dev35_LocateAccount_SchoolAddress_SchoolName_PostalCode_Province_City_NoSchoolHyperlink	|
     
     
@LocateAccount
@Priority1
@DWCACSR-6107
@5
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a postal code search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 													|
  | Dev35_LocateAccount_SchoolAddress_PostalCode_NoSchoolHyperlink	|
   
   
@LocateAccount
@Priority1
@DWCACSR-6107
@6
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a postal, province and city search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR enters valid Postal Code
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 																|
  | Dev35_LocateAccount_SchoolAddress_PostalCode_Province_City_NoSchoolHyperlink	|
          
          
@LocateAccount
@Priority1
@DWCACSR-6107
@7
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a province and city search:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR selects 'Canada' from the 'Country' drop-down box
	And CSR selects a Province from the province drop-down box
	And CSR selects a City from the city drop-down box
	And clicks on Search
	When CSR selects the 'School is not in the system' hyperlink
	Then CSR sees instruction modal displayed
	
Examples:
  | UsingData 													|
  | Dev35_LocateAccount_SchoolAddress_Province_City_NoSchoolHyperlink	|
                                                                                                    	                                            