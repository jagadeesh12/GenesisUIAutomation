Feature: Locate – Search Results – School Address By – School Listing - Record Count
	This feature is to validate the Locate – Search Results – School Address By – School Listing - Record Count scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | QA_Search_By_SchoolAddress_Result_Paragraph_School_Name_Province_City	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1528
@2
Scenario Outline:CSR sees the school name, postal code, province and city in result paragraph_1528:[<UsingData>]
	
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
  | QA_Search_By_SchoolAddress_Result_Paragraph_School_Name_Postal_Code_Province_City	|
  
       