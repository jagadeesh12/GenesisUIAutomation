@LoginPageNow
Feature: Loginpage
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	





##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 2858 TOOL TIP LOGIN PAGE      #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
    



@Story-2858    
@Loginpage
@Priority1
Scenario Outline:Teacher should see the tool tip when tring to login with password as blank:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher enters user name leaving password field blank and click on login button
Then “Please enter your password” tooltip should display

Examples: 
  |UsingData                                 |
  |QA:TeacherLogin_Passwordblank_Error    |  
  
 
 
@Story-2858    
@Loginpage
@Priority1
Scenario Outline:Teacher should see the tool tip when tring to login with username as blank:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher enters password leaving user name field blank and click on login button
Then “Please enter your account number” tooltip should display

Examples: 
  |UsingData                                 |
  |QA:TeacherLogin_UserNameblank_Error    |
  
  
  
@Story-2858    
@Loginpage
@Priority1
Scenario Outline:Teacher should see only one tool tip when tring to login with invalid username and password:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher logs into the application by providing incorrect username and password
Then Only single tool tip for Login Error should be displayed
And teacher clears the username and click on login button
And only “Please enter your account number” tooltip should display


Examples: 
  |UsingData                                          |
  |QA:TeacherLogin_InvalidCredentials_UserNameBlank|
  
  ########################################11.5 ###################################
  
#@SCSCOD-4464 this should be manual execution.
#@Priority1
#Scenario Outline:Teacher sees entered items in cart when browser is closed and login with same account:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher adds “ItemInformation” from YTO page
#And teacher close the browser without logging out
#When teacher open rco-scholastic web site once again and login with same account
#Then items entered should be auto saved
# 
# Examples:
#  | UsingData                                                |
#  | QA:Teacher_ItemsSaved_BrowserClose_Login|	
#  



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    SCSCOD-6319     	 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 

@LoginPage
@SCSCOD-6319
@BTS2017
@Priority2
@Sprint-14.3
Scenario Outline: Teacher views “Forgot your login information?” hyperlink in unauthenticated login page:[<UsingData>]

Given teacher has valid reading clubs account
When teacher navigates to the Canada Reading Clubs site
Then teacher views “Forgot your login information?” hyperlink

Examples:
|UsingData|
|QA:Forgot_your_login_information_hyperlink|

@LoginPage
@SCSCOD-6319
@BTS2017
@Priority1
@Sprint-14.3
Scenario Outline: Teacher clicks “Forgot Your Login Information?” hyperlink in unauthenticated login page:[<UsingData>]

Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
When teacher clicks on “Forgot your login information?” hyperlink
Then teacher is navigated to Forgot Password page

Examples:
|UsingData|
|QA:Forgot_your_login_information_click_hyperlink|

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             ############################################################
###########################################   		    SCSCOD-6320   	   #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


Scenario Outline:Teacher sees "Forgot your Account Number or Email Address?" hyper link in "Forgot Your Password?" window:[<UsingData>]

Given teacher has valid reading clubs account but forgot password
And teacher navigates to the Canada Reading Clubs site
When teacher clicks on “Forgot your login information?” link
Then teacher is navigated to “Forgot Your Password?” window
And teacher sees “Forgot your Account Number or Email Address?” hyper link below email address field

Examples:
|UsingData|
|QA:Forgot_Your_Account_Number_Or_Email_Address_hyperlink|



Scenario Outline:Teacher leaves any one of the fields as blank in "Forgot Your Password?" window:[<UsingData>]

Given teacher has valid reading clubs account but forgot password
And teacher navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher is navigated to “Forgot Your Password?” window
When teacher enters valid account number leaving email field as blank
Then NEXT button is disabled
And teacher enters email field leaving account number as blank
And NEXT button is disabled

Examples:
|UsingData|
|QA:Forgot_Your_Account_Number_Or_Email_Address_hyperlink_BlankFields|


Scenario Outline:Teacher clicks on '?' icon for Account number field in "Forgot Your Password?" window:[<UsingData>]

Given teacher has valid reading clubs account but forgot password
And teacher navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher is navigated to “Forgot Your Password?” window
When teacher clicks on '?' icon of Account number field
Then teacher sees “need to update” window message
And teacher clicks on '?' icon of email field
And teacher sees “need to update” message

Examples:
|UsingData|
|QA:Forgot_Your_Account_Number_Or_Email_Address_IconInfo|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6308  	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################



#
#@Sprint-14.4
#  #@SCSCOD-6308
#  #@LoginPage
#  #@Soma need to give a fix for it for the step 'Close the browser and lauch...."
#  Scenario Outline:Teacher enters email address and selects "Remember me":[<UsingData>]
#
#    Given teacher has valid reading clubs account and navigates to login page
#    And teacher enters valid email address
#    When teacher selects “Remember me” checkbox
#    And teacher enters valid password and clicks on login button
#    And teacher is navigated to home page
#    And teacher logout from the application
#    Then teacher should see already entered email address in scholastic account/email field
#    And teacher close the browser and launches reading club site in new browser
#    And teacher should see already entered email address in scholastic account/email field
#
#
#  Examples:
#    |UsingData|
#    |QA:LoginPage_RememberMe3|
#  @Sprint-14.4
#  @SCSCOD-6308
#  @LoginPage
#
#  Scenario Outline:Teacher enters invalid account number/email address and selects Remember me:[<UsingData>]
#
#    Given teacher has valid reading clubs account and navigates to login page
#    And teacher enters invalid account number/email address
#    When teacher selects “Remember me” checkbox
#    And teacher enters invalid password and clicks on login button
#    Then teacher should not see entered account number/email address in scholastic account/email field
#    And "Remember me" checkbox is deselected
#
#  Examples:
#    |UsingData|
#    |QA:LoginPage_RememberMe4|
    
    
    
@SCSCOD-7164
@Priority2
@Sprint-15.1
@LoginPage
@Release-6.15.2017
Scenario Outline: Teacher enters email in upper case in Account Number or Email field in login page:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
When teacher enters valid email in upper case in Account Number or Email field and valid password
And teacher clicks on login button
Then email is validated and teacher is navigated to home page

Examples:
|UsingData|
|QA:LoginPage_EmailAutoformatted|



Scenario Outline: Teacher enters email in mixed case in Account Number or Email field in login page:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
When teacher enters valid email in mixed case in Account Number or Email field and valid password
And teacher clicks on login button
Then email is validated and teacher is navigated to home page

Examples:
|UsingData|
|QA:LoginPage_EmailAutoformatted_MixedCase|



Scenario Outline: Teacher enters email in upper case in My Profile section in My Account page:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
And teacher logs into the application by providing [UserInformation]
And clicks on Profile from My Account dropdown
And teacher click Edit link present under My Profile section
When teacher enters valid email in upper case in Email field
And teacher clicks SAVE button
Then email is validated and auto-formatted to lower case without any issues

Examples:
|UsingData|
|QA:MyAccountPage_EmailAutoformatted|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @1
  Scenario Outline:Teacher enters email address with multiple '@' sign on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters email address with multiple '@' sign in account number/email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays
    And account number email field is highlighted in yellow

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_Email_Multiple@Signs	|


  @LoginPage
  @Priority1
  @SCSCOD-6321
  @Sprint-14.4
  @2
  Scenario Outline:Enter valid data in all fields and does not enter only First Name on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters valid data in all the fields except First Name field
    Then CONTINUE button is disabled

    Examples:
      | UsingData 																|
      | QA:ForgotPasswordModalPage_EnterAllData_ExceptFirstName	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @3
  Scenario Outline:Teacher enters email address with multiple dots on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters email address with multiple dots in account number/email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays
    And account number email field is highlighted in yellow

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_Email_MultipleDots	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @4
  Scenario Outline:Enter more than 30 characters in Last Name field on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters more than 30 characters in Last name field
    Then Last name field should not accept more than 30 characters

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_LastName30characters	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @5
  Scenario Outline:Teacher enters email address with multiple dots and invalid top level domain on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters email address with multiple dots and invalid top level doamain in account number email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays
    And account number email field is highlighted in yellow

    Examples:
      | UsingData 																			|
      | QA:ForgotPasswordModalPage_Email_MultipleDots_InvalidTopLevelDoamin	|

  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @8
  Scenario Outline:Last Name field highlighted in red if clicked inside first name and clicks outside without entering any data for Forgot Password:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher clicks inside last name field and does not enter any data
    And clicks inside First Name field
    Then Last Name field is highlighted in Yellow bordered with red color

    Examples:
      | UsingData 													|
      | QA:ForgotPasswordModalPage_LastName_Empty	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @9
  Scenario Outline:Enter 2 characters in First name and Last name on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters 2 characters in both first name and last name fields
    Then Continue button is enabled

    Examples:
      | UsingData 																|
      | QA:ForgotPasswordModalPage_2Chars_ContinueBtn_Enabled	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @10
  Scenario Outline:Enters only 1 character in Last Name field on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters only one character in last name field
    And clicks outside or inside first name field
    Then Last Name field is highlighted in Yellow bordered with red color
    And tool tip message 'Please enter at least 2 characters.' displays for Last Name field

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_LastName_SingleChar	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @12
  Scenario Outline:Enters 2 characters in Last Name field on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters two characters in last name field
    And clicks outside or inside first name field
    Then no error message displays for Last Name field

    Examples:
      | UsingData 													|
      | QA:ForgotPasswordModalPage_LastName_TwoChar	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @13
  Scenario Outline:Enter more than 30 characters in First Name field on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters more than 30 characters in First name field
    Then First name field should not accept more than 30 characters

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_FirstName30characters	|


  @LoginPage
  @Priority1
  @SCSCOD-6321
  @Sprint-14.4
  @14
  Scenario Outline:Enter valid data in all fields and does not enter only Last Name on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters valid data in all the fields except Last Name field
    Then CONTINUE button is disabled

    Examples:
      | UsingData 																|
      | QA:ForgotPasswordModalPage_EnterAllData_ExceptLastName	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @16
  Scenario Outline:Enter email address without domain on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters email address without domain in account number/email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays
    And account number email field is highlighted in yellow

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_Email_MissingDomain	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @17
  Scenario Outline:First Name field highlighted in red if clicked inside firstname and clicks outside without entering any data on Forgot Password:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher clicks inside first name field and does not enter any data
    And clicks inside of Last Name field
    Then First Name field is highlighted in Yellow bordered with red color

    Examples:
      | UsingData 													|
      | QA:ForgotPasswordModalPage_FirstName_Empty	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @18
  Scenario Outline:Enter email address without dot on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters email address without dot in account number/email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays
    And account number email field is highlighted in yellow

    Examples:
      | UsingData 													|
      | QA:ForgotPasswordModalPage_Email_MissingDot	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @19
  Scenario Outline:Enters only 1 character in First Name field on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters only one character in first name field
    And clicks outside or inside of last name field
    Then First Name field is highlighted in Yellow bordered with red color
    And tool tip message 'Please enter at least 2 characters.' displays for First Name field

    Examples:
      | UsingData 														|
      | QA:ForgotPasswordModalPage_FirstName_SingleChar	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @20
  Scenario Outline:Teacher enters email address without top level domain on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    When teacher enters email address without top level domain in account number/email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays
    And account number email field is highlighted in yellow

    Examples:
      | UsingData 																|
      | QA:ForgotPasswordModalPage_Email_MissingTopLevelDomain	|


  @LoginPage
  @Priority2
  @SCSCOD-6321
  @Sprint-14.4
  @21
  Scenario Outline:Enters 2 characters in First Name field on the Forgot Password modal/page:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Forgot your login information?' link
    And teacher clicks on 'Forgot your Account Number or Email Address?' hyper link
    And teacher enters two characters in first name field
    When clicks outside or inside of last name field
    Then First Name field is saved with the data
    And no error message displays
    #And the field is not highlighted


    Examples:
      | UsingData 													|
      | QA:ForgotPasswordModalPage_FirstName_TwoChar	|


  @LoginPage
  @Priority1
  @SCSCOD-6316
  @Sprint-14.4
  @1
  Scenario Outline:Teacher sees Forgot your Account Number or Email Address hyper link in Activate Your Account window:[<UsingData>]

    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    Then teacher is navigated to 'Activate Your Account' window
    And teacher sees 'Forgot your Account Number or Email Address?' hyper link below email address field

    Examples:
      | UsingData 																|
      | QA:Forgot_Your_Account_Number_Or_Email_Address_hyperlink	|


  @LoginPage
  @Priority1
  @SCSCOD-6316
  @Sprint-14.4
  @2
  Scenario Outline:Teacher leaves any one of the fields as blank in Activate Your Account window:[<UsingData>]

    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    And teacher is navigated to 'Activate Your Account' window
    When teacher enters valid account number leaving email field as blank
    Then NEXT button is disabled

    Examples:
      | UsingData 														|
      | QA:Forgot_Your_Account_Number_Or_Email_Address_hyperlink_BlankFields	|


  @LoginPage
  @Priority1
  @SCSCOD-6316
  @Sprint-14.4
  @3
  Scenario Outline:Teacher leaves any one of the fields as blank in Activate Your Account window_2:[<UsingData>]

    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    And teacher is navigated to 'Activate Your Account' window
    When teacher enters email field leaving account number as blank
    And NEXT button is disabled

    Examples:
      | UsingData 														|
      | QA:Forgot_Your_Account_Number_Or_Email_Address_hyperlink_BlankFields_2	|


  @LoginPage
  @Priority1
  @SCSCOD-6316
  @Sprint-14.4
  @4
  Scenario Outline:Teacher clicks on '?' icon for Account number field in Activate Your Account window:[<UsingData>]

    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    And teacher is navigated to 'Activate Your Account' window
    When teacher clicks on '?' icon of Account number field
    Then teacher sees 'Your account number can be found on the top right corner of your packing slip.' window message
    When teacher clicks on '?' icon of email field
    And teacher sees 'Enter the email address associated with your account number.' message

    Examples:
      | UsingData 																|
      | QA:Forgot_Your_Account_Number_Or_Email_Address_IconInfo	|





  @LoginPage
  @Priority1
  @SCSCOD-6317
  @Sprint-14.4
  @1
  Scenario Outline:Teacher provides invalid account number through Account Activation process:[<UsingData>]

    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    When teacher provides invalid account number
    And valid email address and clicks on NEXT button
    Then teacher is presented with Account Activation fail modal
    And modal header as 'Account Not found'
    And teacher sees 'Forgot your Account Number or Email Address?' hyper link
    And close icon at top right corner of the modal window
    And BACK button enabled by default

    Examples:
      | UsingData 														|
      | QA:AccountActivationFlow_IncorrectAccountNumber	|


  @LoginPage
  @Priority1
  @SCSCOD-6317
  @Sprint-14.4
  @2
  Scenario Outline:Teacher provides invalid email address through Account Activation process:[<UsingData>]

    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    When teacher provides valid account number
    And invalid email address and clicks on NEXT button
    Then teacher is presented with Account Activation fail modal
    #And modal header as 'Email Not Match'
    And teacher sees 'Forgot your Account Number or Email Address?' hyper link
    And close icon at top right corner of the modal window
    And BACK button enabled by default

    Examples:
      | UsingData 														|
      | QA:AccountActivationFlow_IncorrectEmailAddress	|


  @LoginPage
  @Priority1
  @SCSCOD-6317
  @Sprint-14.4
  @3
  Scenario Outline:Teacher clicks on BACK button through 'Activate Your Account' flow:[<UsingData>]

   #Given teacher prints the data from Excel
    Given teacher has valid reading clubs account but not enabled
    And teacher navigates to the Canada Reading Clubs site
    And teacher clicks on 'Activate Your Account' option
    And teacher provides either invalid account number or email address and clicks on NEXT button
    When teacher clicks on BACK button
    Then teacher is navigated back to 'Activate Your Account' window

    Examples:
      | UsingData 											|
      | QA:AccountActivationFlow_BackButton	|




  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @1
  Scenario Outline:Teacher enters non existing account number and password on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters non-existing account number in account number/email field and password
    And teacher clicks on login button
    Then tool tip error message displays for invalid credentials
   #And the AcNum or email address and password field is highlighted in yellow

    Examples:
      | UsingData 														|
      | QA:Teacher_AccountLogin_InvalidAccountPassword	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @2
  Scenario Outline:Teacher enters valid email address and incorrect password on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters valid email address and incorrect password
    And teacher clicks on login button
    Then tool tip error message displays for invalid credentials
   #And the AcNum or email address and password field is highlighted in yellow

    Examples:
      | UsingData 														|
      | QA:Teacher_AccountLogin_ValidEmailInValidPassword	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @3
  Scenario Outline:Teacher enters email address without domain in email field on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters email address without domain in account number or email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays in Login page
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 													|
      | QA:Teacher_AccountLogin_Email_MissingDomain	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @4
  Scenario Outline:Teacher does not enter email or account number but enters password:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher does not enter account number but enters password in password field
    And teacher clicks on login button
    Then tool tip error message 'Please enter your account number or account email.' displays
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 											|
      | QA:Teacher_AccountLogin_BlankAccount	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @5
  Scenario Outline:Teacher does not enter Password but enters email or account number:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters account number but does not enter password in password field
    And teacher clicks on login button
    Then tool tip error message 'Please enter your password.' displays
   #And the Password field is highlighted in yellow color

    Examples:
      | UsingData 												|
      | QA:Teacher_AccountLogin_BlankPassword	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @6
  Scenario Outline:Teacher enters valid email and password:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters valid email and password
    And teacher clicks on login button
    Then teacher Home page displays

    Examples:
      | UsingData 														|
      | QA:Teacher_AccountLogin_ValidUserEmailPassword	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @7
  Scenario Outline:Teacher enters email address with multiple at the rate sign in email field on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters email address with multiple '@' sign in account number or email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays in Login page
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 													|
      | QA:Teacher_AccountLogin_Email_Multiple@Signs	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @8
  Scenario Outline:Teacher enters email address with multiple dots in email field on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters email address with multiple dots in account number or email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays in Login page
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 													|
      | QA:Teacher_AccountLogin_Email_MultipleDots	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @9
  Scenario Outline:Teacher enters email address with multiple dots and invalid top level domain in email field on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters email address with multiple dots and invalid top level doamain in account number or email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays in Login page
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 																		|
      | QA:Teacher_AccountLogin_Email_MultipleDots_InvalidTopLevelDoamin	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @10
  Scenario Outline:Teacher enters non-existing email address and password on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters non-existing email address in account number/email field and password
    And teacher clicks on login button
    Then tool tip error message displays for invalid credentials
   #And the AcNum or email address and password field is highlighted in yellow

    Examples:
      | UsingData 													|
      | QA:Teacher_AccountLogin_InvalidEmailPassword	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @11
  Scenario Outline:Teacher enters email address without dot in email field on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters email address without dot in account number or email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays in Login page
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 												|
      | QA:Teacher_AccountLogin_Email_MissingDot	|


  @LoginPage
  @Priority1
  @SCSCOD-6297
  @Sprint-14.4
  @12
  Scenario Outline:Teacher enters email address without top level domain in email field on Login page:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher enters email address without top level domain in account number or email field and click outside
    Then tool tip error message 'Please enter a valid email address.' displays in Login page
   #And account number or email field is highlighted in yellow

    Examples:
      | UsingData 															|
      | QA:Teacher_AccountLogin_Email_MissingTopLevelDomain	|


    ##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6518        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6518
  @Priority2
  @Sprint-15.1
  @LoginPage
  @Release-5.22.2017
  Scenario Outline: Default Username and password fields in unauthenticated login page:[<UsingData>]

    Given teacher has valid reading clubs account
    When teacher navigates to the Canada Reading Clubs site
    Then Username field placeholder is “Account Number or Account Email” with grey text
    And Password field placeholder is “Account Password” with grey text

    Examples:
      |UsingData|
      |QA:Teacher_AccountLogin_BlankAccount|

