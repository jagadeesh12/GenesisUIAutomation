Feature: Verify Account - Customer Profile – Personal Information – Container
	This feature is to validate the Verify Account - Customer Profile – Personal Information – Container scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@DWCACSR-959
@Priority1
@1
@Manual
Scenario Outline:Personal Information Container on Verify Account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented with the label ‘NAME:’ 
	And customer’s full name <Prefix + First Name + Last Name> displays directly below the label
	And CSR is presented with the label ‘EMAIL:’
	And correct email address displays directly below the label
	And CSR is presented with the label ‘MOBILE PHONE:’
	And correct mobile number displays directly below the label
	And CSR is presented with the label 'RECEIVE PREFERENCES'
	And Yes/No option displays directly below it
	And CSR is presented with the label 'LANGUAGE PREFERENCE'
	And English/French option displays directly below it
	
Examples:
  | UsingData 																			|
  | VerifyAccount_PersonalDetails_ContainerWithRecievePreference_Yes_Language_English	|		
  

@VerifyAccount
@DWCACSR-959
@Priority1
@2
@Manual
Scenario Outline:No mobile number on the account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR will be presented with the label ‘N/A’ directly below the label ‘MOBILE PHONE:’
	
Examples:
  | UsingData 										|
  | VerifyAccount_PersonalDetails_NoMobileNumber	|		
  
 
@VerifyAccount
@DWCACSR-959
@Priority1
@3
@Manual
Scenario Outline:Receive Preferences 'NO' for a teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then No option displays directly below the label'RECEIVE PREFERENCES'
	
Examples:
  | UsingData 														|
  | VerifyAccount_PersonalDetails_ContainerWithRecievePreference_No	|		
  

@VerifyAccount
@DWCACSR-959
@Priority1
@4
@Manual
Scenario Outline:Language Preference as French:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then French is displayed directly below the label 'LANGUAGE PREFERENCE'
	
Examples:
  | UsingData 													|
  | VerifyAccount_PersonalDetails_ContainerWithLanguage_French	|		
  

      