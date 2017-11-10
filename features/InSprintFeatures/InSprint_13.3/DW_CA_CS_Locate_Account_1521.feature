Feature: Locate – The Search Form – Applying Multiple Search Criteria 
	This feature is to validate the Locate – The Search Form – Applying Multiple Search Criteria  scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount
@Priority1
@DWCACSR-1521
@1
Scenario Outline:CSR sees a list of teachers with matching information when using the teacher’s first and last name:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR selects Teacher Name from Search by dropdown
	And CSR enters at least 1 character in First Name
	And CSR enters at least 1 character in Last Name
	When clicks on Search
	Then the first name that was entered should have an occurrence in the first name of each row under Teacher Name column
	And the last name that was entered should have an occurrence in the last name of each row under Teacher Name column
	
Examples:
  | UsingData 					|
  | SearchForm_TeacherNameCombo	|
  
  
              