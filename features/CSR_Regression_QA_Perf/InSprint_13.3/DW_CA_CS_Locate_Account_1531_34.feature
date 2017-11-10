Feature: Locate – Search Results – School Address By – School Listing – Teacher Listing – Record Count
	This feature is to validate the Locate – Search Results – School Address By – School Listing – Teacher Listing – Record Count scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Perf_QA_Search_By_SchoolAddress_TeacherListing_School_Name	|
  
 
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
  | Perf_QA_Search_By_SchoolAddress_TeacherListing_School_Address	|
    

    
    