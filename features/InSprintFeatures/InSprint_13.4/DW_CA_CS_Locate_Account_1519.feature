Feature: Locate – The Search Form – Search By – School Address  - Country - Canada
	This feature is to validate the Locate – The Search Form – Search By – School Address  - Country - Canada scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | SearchBy_SchoolAddress_Canada_Postal_Code_8Characters	|
  
  
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
  | SearchBy_SchoolAddress_Canada_Valid_Postal_Code_6charcters				|
  | SearchBy_SchoolAddress_Canada_Valid_Postal_Code_7charcters_with_space	|
  
  
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
  | SearchBy_SchoolAddress_Canada_Invalid_Postal_Code_6charcters			|
  | SearchBy_SchoolAddress_Canada_Invalid_Postal_Code_7charcters_with_space	|


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
  | SearchBy_SchoolAddress_Canada_Valid_Postal_Code_6charcters_2	|
  

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
  | SearchBy_SchoolAddress_Canada_AllProvinces	|
  
        