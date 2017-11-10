Feature: Verify Account - Customer Profile – Role Details – Container
	This feature is to validate the Verify Account - Customer Profile – Role Details – Container scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@DWCACSR-962
@Priority1
@1
Scenario Outline:CSR verifies teacher account with multiple roles:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented with the label 'ROLE' within the Role Details container
	And directly below the label the CSR is presented with all of the roles that the Teacher has selected
	
Examples:
  | UsingData 					|
  | QA_VerifyAccount_RoleDetails	|		
  

@VerifyAccount
@DWCACSR-962
@Priority1
@2
Scenario Outline:CSR verifies teacher account with multiple grades:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented [Grade] , [no. of students]
	And each grade is displayed in a new line
	
Examples:
  | UsingData 					|
  | QA_VerifyAccount_GradeDetails	|		
  

              