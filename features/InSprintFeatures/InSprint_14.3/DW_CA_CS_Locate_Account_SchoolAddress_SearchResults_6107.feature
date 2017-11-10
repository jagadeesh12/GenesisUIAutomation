Feature: Locate Account - School Address - Search Results - 'School is not in the system' hyperlink
	This feature is to validate the Locate Account - School Address - Search Results - 'School is not in the system' hyperlink scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | LocateAccount_SchoolAddress_SchoolName_NoSchoolHyperlink	|
  
  
@LocateAccount
@Priority1
@DWCACSR-6107
@2
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a school name and postal code search:[<UsingData>]
	
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
  | LocateAccount_SchoolAddress_SchoolName_PostalCode_NoSchoolHyperlink	|
  
  
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
  | LocateAccount_SchoolAddress_SchoolName_Province_City_NoSchoolHyperlink	|


@LocateAccount
@Priority1
@DWCACSR-6107
@4
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a school name, postal code, province and city search:[<UsingData>]
	
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
  | LocateAccount_SchoolAddress_SchoolName_PostalCode_Province_City_NoSchoolHyperlink	|
     
     
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
  | LocateAccount_SchoolAddress_PostalCode_NoSchoolHyperlink	|
   
   
@LocateAccount
@Priority1
@DWCACSR-6107
@6
Scenario Outline:CSR sees instruction modal when 'School is not in the system' hyperlink is clicked after a postal code, province and city search:[<UsingData>]
	
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
  | LocateAccount_SchoolAddress_PostalCode_Province_City_NoSchoolHyperlink	|
          
          
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
  | LocateAccount_SchoolAddress_Province_City_NoSchoolHyperlink	|
                        