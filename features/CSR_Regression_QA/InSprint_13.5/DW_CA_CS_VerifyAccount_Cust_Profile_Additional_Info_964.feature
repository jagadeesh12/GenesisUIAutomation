Feature: Verify Account - Customer Profile – Additional Information – Container
	This feature is to validate the Verify Account - Customer Profile – Additional Information – Container scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@DWCACSR-964
@Priority1
@1
Scenario Outline:CSR views additional info container for first time teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then CSR is presented with 'This is my first year teaching: YES' in Additional Information Container
	
Examples:
  | UsingData 								|
  | QA_VerifyAccount_AdditionalInformation_YES	|		
  

@VerifyAccount
@DWCACSR-964
@Priority1
@2
Scenario Outline:CSR view additional information for existing teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then CSR is presented with 'This is my first year teaching: NO' in Additional Information Container
	
Examples:
  | UsingData 								|
  | QA_VerifyAccount_AdditionalInformation_NO	|		
  

              