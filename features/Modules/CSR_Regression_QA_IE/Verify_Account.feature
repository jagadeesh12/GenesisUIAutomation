Feature: Verify Account
	This feature is to validate the Verify Account page scenarios

 
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
  | QA_VerifyAccount_SchoolDetails_CanadaSchool	|		
  

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
  | QA_VerifyAccount_SchoolDetails_USSchool	|		
  

@VerifyAccount
@DWCACSR-76
@Priority1
@1
Scenario Outline:First time Teacher modal does not show up for an existing teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page for 1st time Teacher
	Then First time teacher modal does not show up
	
Examples:
  | UsingData 									|
  | QA_VerifyAccount_ExistingTeacher_NoModalWindow	|		
  

@VerifyAccount
@DWCACSR-76
@Priority1
@2
Scenario Outline:CSR can close the First time teacher modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page for 1st time Teacher
    When CSR clicks on Close icon 'X' on the top right of the window
    Then Verify Account page displays
	
Examples:
  | UsingData 										|
  | QA_VerifyAccount_NewTeaching_ModalWindow_CloseIcon	|		
  

@VerifyAccount
@DWCACSR-76
@Priority1
@3
Scenario Outline:First time Teacher modal displays when CSR searches for a new teacher:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page for 1st time Teacher
    Then a modal window displays with title 'Instructions for CSR'
	And a 'X' icon positioned to the top-right of the window displays
	And a paragraph of text within the main content area which states 'Welcome to Reading Club!'
	
Examples:
  | UsingData 								|
  | QA_VerifyAccount_NewTeaching_ModalWindow	|
  
@VerifyAccount
@DWCACSR-966
@Priority1
@1
Scenario Outline:CSR looks at the order in the order History module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then the CSR is presented with the header 'Order History & Status'
	And Order [Order Number] displays
	And Placed Date: [YYYY-MM-DD] displays
	
Examples:
  | UsingData 					|
  | QA_VerifyAccount_OrderHistory	|		
  

@VerifyAccount
@DWCACSR-966
@Priority1
@2
Scenario Outline:Order History for Phone Order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Phone Order displays in Order History section
	
Examples:
  | UsingData 							|
  | QA_VerifyAccount_OrderHistory_Phone	|		
 
 
@VerifyAccount
@DWCACSR-966
@Priority1
@3
Scenario Outline:Order History for mail order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Mail Order displays in Order History section
	
Examples:
  | UsingData 						|
  | QA_VerifyAccount_OrderHistory_Mail	|		
   
   
@VerifyAccount
@DWCACSR-966
@Priority1
@4
Scenario Outline:OrderHistory for fax order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Fax Order displays in Order History section
	
Examples:
  | UsingData 						|
  | QA_VerifyAccount_OrderHistory_Fax	|		
   
   
@VerifyAccount
@DWCACSR-966
@Priority1
@5
Scenario Outline:Order History for Online order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Type: Online displays in Order History section
	
Examples:
  | UsingData 							|
  | QA_VerifyAccount_OrderHistory_Online	|		
 
 
@VerifyAccount
@DWCACSR-966
@Priority1
@6
Scenario Outline:Order History for Held Order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then Status: 'Held by Accounting' displays in Order History section
	
Examples:
  | UsingData 										|
  | QA_VerifyAccount_OrderHistory_Held_by_Accounting	|		


@VerifyAccount
@DWCACSR-966
@Priority1
@7
Scenario Outline:Order History sort order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	#Then order history line-items are arranged/sorted by the most recent 'Placed Date'
	
Examples:
  | UsingData 						|
  | QA_VerifyAccount_OrderHistory_Sort	|		
        
        
@VerifyAccount_PageHeader&CSR_Script
@DWCACSR-77
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Verify Account header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then Blue step script icon should be displayed next to [verify Account] header in a page
	
Examples:
  | UsingData 											|
  | QA_Blue_step_script_icon_displays_Verify_Account_page	|		
  

@VerifyAccount_PageHeader&CSR_Script
@DWCACSR-77
@Priority1
@2
Scenario Outline:Modal window displays with the title 'Verify Account' when CSR clicks on Blue step script icon in Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
    When CSR clicks on Blue step script icon in [Verify Account] page
    Then the modal window should be displayed with the title 'Verify Account'
    And the close button 'X' should be displayed in the top right corner of the [Verify Account] modal window
	
Examples:
  | UsingData 												|
  | QA_Blue_step_script_icon_modalWindow_Verify_Account_page	|		
  

@VerifyAccount_PageHeader&CSR_Script
@DWCACSR-77
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Verify Account page when CSR closes the modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
    And CSR clicks on Blue step script icon in [Verify Account] page
    When CSR clicks on close button in [Verify Account] modal window
	Then CSR is presented with the [Verify Account] page
	
Examples:
  | UsingData 															|
  | QA_Blue_step_script_icon_modalWindow_disappeared_Verify_Account_page	|
  
 
@VerifyAccount_StepHeader
@DWCACSR-957
@Priority1
@1
Scenario Outline:Verify Account tab highlights in the step indicator when CSR enters into the Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on Teacher's Name in Search Results
    Then [Verify Account] tab should be highlighted in the step indicator
	
Examples:
  | UsingData               					|
  | QA_SearchResults_Verify_Account_tab_highlights	|		
  

@VerifyAccount_StepHeader
@DWCACSR-957
@Priority1
@2
Scenario Outline:Number of the VERIFY ACCOUNT page displays correctly in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on Teacher's Name in Search Results
	Then the step header number for the [Verify Account] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  						|
  | QA_SearchResults_Number_for_the_Verify_Account_tab	|	
  
  
                                        