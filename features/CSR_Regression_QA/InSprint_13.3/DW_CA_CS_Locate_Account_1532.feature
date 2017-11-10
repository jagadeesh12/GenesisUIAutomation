Feature: Locate – Search Results – School Address By – Back to School Listing
	This feature is to validate the Locate – Search Results – School Address By – Back to School Listing scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount
@Priority1
@DWCACSR-1532
@1
Scenario Outline:The hyperlink 'Back to School Listing' is present on the teacher listing result page_1532:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects School Address from Search by dropdown
	And CSR enters School Name no more than 70 characters
	And clicks on Search
	When CSR selects the first school name under the School Name column
	Then hyperlink 'Back to School Listing' is present above the Teacher Listing Search results table and to the right of 'Start a New Search' hyperlink
	
Examples:
  | UsingData 																	|
  | QA_Search_By_SchoolAddress_BacktoSchool_HyperLink_SchoolListing_TeacherListing	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1532
@2
Scenario Outline:The hyperlink 'Back to School Listing' is not present on the teacher listing result page_1532:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name
	And CSR enters at least 1 character in Last Name
	And clicks on Search
	Then hyperlink 'Back to School Listing' is not present above the Teacher Listing Search results table
	
Examples:
  | UsingData 															|
  | QA_Search_By_SchoolAddress_BacktoSchool_NoHyperLink_TeacherNameSearch	|
  
 
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
  | QA_Search_By_SchoolAddress_BacktoSchool_HyperlinkClicked	|
    