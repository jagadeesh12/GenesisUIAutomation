Feature: Locate – The Search Form – Search By – School Address - Country - US
	This feature is to validate the Locate – The Search Form – Search By – School Address - Country - US scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | QA_SearchBy_SchoolAddress_US_Zip_Code_11_Integers	|
  
  
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
  | QA_SearchBy_SchoolAddress_US_Valid_Postal_Code_5_Integers	|
  | QA_SearchBy_SchoolAddress_US_Valid_Postal_Code_7_Integers	|
  | QA_SearchBy_SchoolAddress_US_Valid_Postal_Code_10_Integers	|
  
  
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
	And CSR clicks outside the Zip Code textbox
	Then error message is shown above the Zip Code textbox
	
Examples:
  | UsingData 															|
  | QA_SearchBy_SchoolAddress_US_Invalid_Postal_Code_Special_Characters	|   
  
  
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
  | QA_SearchBy_SchoolAddress_US_Valid_Zip_Code_5_Integers	|   
  
      
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
  | QA_SearchBy_SchoolAddress_US_AllStates	|   
  
      
