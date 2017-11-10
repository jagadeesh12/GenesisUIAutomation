Feature: Locate – The Search Form – Search By – Teacher Name
	This feature is to validate the Locate – The Search Form – Search By – Teacher Name scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Perf_QA_Search_By_TeacherName_24_1	|
  
  
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
  | Perf_QA_Search_By_TeacherName_24_2	|
  

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
  | Perf_QA_Search_By_TeacherName_24_3	|
  
 
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
  | Perf_QA_Search_By_TeacherName_24_4	|
                     