Feature: Locate – The Search Form – Search By – School Address 
	This feature is to validate the Locate – The Search Form – Search By – School Address scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Perf_QA_Search_By_SchoolAddress_morethan_70	|
  
  
              