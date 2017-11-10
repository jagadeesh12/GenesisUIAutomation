Feature: Locate – Search Results – School Address By – Teacher Listing
	This feature is to validate the Locate – Search Results – School Address By – Teacher Listing scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Search_By_SchoolAddress_TeacherListing_Occurrences	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1533
@2
@Manual
Scenario Outline:The correct headings for the result table is present on the teacher listing page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	When CSR selects the first school name under the School Name column
	Then headings ‘Teacher Name’, ‘Email’, ‘Account’, ‘School Name’, ‘School Address’ and ‘Status’ should be present
	
Examples:
  | UsingData 										|
  | Search_By_SchoolAddress_TeacherListing_Headings	|
  

@LocateAccount
@Priority1
@DWCACSR-1533
@3
Scenario Outline:CSR sees a results paragraph with the correct amount of returned results on the teacher listing page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	When clicks on Search
	When CSR selects the first school name under the School Name column
	Then CSR sees a result paragraph 'We found [number] results for [School Name]' under the page header
	
Examples:
  | UsingData 												|
  | Search_By_SchoolAddress_TeacherListing_Result_Paragraph	|
 
   