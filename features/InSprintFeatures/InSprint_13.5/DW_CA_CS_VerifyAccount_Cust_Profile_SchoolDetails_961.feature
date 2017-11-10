Feature: Verify Account - Customer Profile – School Details – Container
	This feature is to validate the Verify Account - Customer Profile – School Details – Container scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@DWCACSR-961
@Priority1
@1
Scenario Outline:SchoolDetails Container for a Canadian teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented with the label 'SCHOOL'
	And correct [School Name, Address 1, Address 2, City, Province, Canada, Postal Code, School Phone Number] displays each in a seperate line
	
Examples:
  | UsingData 									|
  | VerifyAccount_SchoolDetails_CanadaSchool	|		
  

@VerifyAccount
@DWCACSR-961
@Priority1
@2
Scenario Outline:School Details container for a US teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented with the label 'SCHOOL'
	And correct [School Name, Address 1, Address 2, City, State, US, Zip Code, School Phone Number] displays each in a seperate line
	
Examples:
  | UsingData 								|
  | VerifyAccount_SchoolDetails_USSchool	|		
  

              