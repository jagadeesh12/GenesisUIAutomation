Feature: MyAccount
	This feature is used to validate PCOD MyAccount

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site




@DWCAPCOD-74
@MyAccount
@Priority3
Scenario Outline:Parent cannot give any spaces in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent tries to give spaces in CAC text field
Then CAC text field will not allow any spaces

Examples:
  | UsingData                                                   |
  | InSprint_12.3:PCOD:Dev35:Parent_ErrorMsg_CACSpacescharacters|
  
@DWCAPCOD-74
@MyAccount
@Priority2 
Scenario Outline:Connect button in Connect to Teacher model window is disabled when CAC text field is blank:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When CAC text field is left blank
Then Connect button should be disabled

Examples:
  | UsingData                                                  |
  | InSprint_12.3:PCOD:Dev35:Parent_ConnectBtnDisabled_CACBlank|
  
@DWCAPCOD-74
@MyAccount
@Priority2  
Scenario Outline:Connect button in Connect to Teacher model window is enabled when CAC is entered in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters 5 characters in CAC text field
Then Connect button should be enabled

Examples:
  | UsingData                                                   |
  | InSprint_12.3:PCOD:Dev35:Parent_ConnectBtnEnabled_CACEntered|

@DWCAPCOD-74
@MyAccount
@Priority3
Scenario Outline:Parent cannot enter more than 5 characters in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent tries to enter more than 5 characters in CAC text field
Then CAC text field will not take more than 5 characters

Examples:
  | UsingData                                             |
  | InSprint_12.3:PCOD:Dev35:Parent_CACMorethan5characters|
  
  
@DWCAPCOD-74
@MyAccount
@Priority3  
Scenario Outline:Connect button should be disabled if parent enters less than 5 characters in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters enters less than 5 characters in CAC text field
Then Connect button should be disabled

Examples:
  | UsingData                                             |
  | InSprint_12.3:PCOD:Dev35:Parent_CACLessthan5characters|
  
  
@DWCAPCOD-74
@MyAccount
@Priority3  
Scenario Outline:Parent see proper validation message if incorrect CAC is entered:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters incorrect CAC in text field
And click on connect button
Then “Please make sure you entered the code correctly. If you don't have correct code , contact your child's teacher.” should be seen

Examples:
  | UsingData                                            |
  | InSprint_12.3:PCOD:Dev35:Parent_ErrorMsg_IncorrectCAC|
  
@DWCAPCOD-74
@MyAccount
@Priority3 
Scenario Outline:Parent cannot enter special characters in CAC text field:[<UsingData>]
 
 Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent tries to enter special characters in CAC text field
Then CAC text field will not allow special characters

Examples:
  | UsingData                                           |
  | InSprint_12.3:PCOD:Dev35:Parent_CACSpecialcharacters|
  

  
##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-63  		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Priority1
  @DWCAPCOD-63
  @Sprint-14.1
  @MyAccount

  Scenario Outline: Parent clicks Save button after providing all required information in Add a Child modal from MyAccount page:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent clicks on My Account and Profile from the header
   When parent clicks on Add a Child link present in My Children section
    And Parent enters valid data in all fields in Add a Child window from home page
   When parent clicks on Save button
   Then child information given is saved
   And ChildFirstName in TeacherNames class displays with a /+ sign/

  Examples:
    |UsingData                                                             |
    |InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildMyAccount_SaveBtn2|


  @Priority2
  @DWCAPCOD-63
  @Sprint-14.1
  @MyAccount

  Scenario Outline: Parent clicks Close icon after providing all required information in Add a Child modal from My Account page:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent clicks on My Account and Profile from the header
    And parent clicks on Add a Child link present in My Children section
    #And Parent enters valid data in all fields in Add a Child window from home page
    And Parent enters valid data in all fields in Add a Child window from home page1
    When parent clicks on Close icon
    Then “Add a Child” window is closed
    And child information given is not saved
    And parent is redirected to My Account page

  Examples:
    |UsingData                                                                   |
    |InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildMyAccountPage_CloseIcon|


  @Priority2
  @DWCAPCOD-63
  @Sprint-14.1
  @MyAccount

  Scenario Outline: Parent clicks Cancel after providing all required information in Add a Child modal from My Account page:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent clicks on My Account and Profile from the header
    And parent clicks on Add a Child link present in My Children section
    And Parent enters valid data in all fields in Add a Child window from home page1
    When parent clicks on Cancel icon
    Then “Add a Child” window is closed
    And child information given is not saved
    And parent is redirected to My Account page

  Examples:
    |UsingData                                                                   |
    |InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildMyAccountPage_Cancelbtn|


  @Priority1
  @DWCAPCOD-63
  @Sprint-14.1
  @MyAccount

  Scenario Outline: Parent adds 2 children connected to different teacher:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent clicks on My Account and Profile from the header
    When parent clicks on Add a Child link present in My Children section
    And Parent enters valid data in all fields and connects to teacher using CAC code
    And parent clicks on Add a child link again to add another child
    And parent enters valid data in all fields and connects to different teacher using FAT
    Then Child1FirstName in Teacher1Name class displays with a + sign
    And Child2FirstName in Teacher2Name class displays with a + sign
  Examples:
    |UsingData                                                             |
    |InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildMyAccount_SaveBtn|  
  
  
    