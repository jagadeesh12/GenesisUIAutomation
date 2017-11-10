Feature: Locate –  Search Results – No Results Returned
	This feature is to validate the Locate –  Search Results – No Results Returned scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | QA_Search_By_SchoolAddress_NoResults_School_Name_Postal_Code_Province_City	|
  
  
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
  | QA_Search_By_TeacherName_NoResults_First_Name_Last_Name	|
  

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
  | QA_Search_By_SchoolAddress_NoResults_Postal_Code_Province_City	|
  

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
  | QA_Search_By_SchoolAddress_NoResults_Province_City	|
  
                     