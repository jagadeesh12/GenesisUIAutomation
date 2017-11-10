Feature: As a QE want to validate Login password modal
	This feature is used to validate all scenarios


Background:
    Given teacher open rco-scholastic web site

@Sprint-14.4
@Priority1
@SCSCOD-5158
@LoginPage
Scenario Outline:Password field on login page for Reading Clubs site:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
When teacher enters password in password field
Then password by default is hidden and displayed as *
And 'SHOW' is displayed within password field
Examples:
| UsingData |
|InSprint14.4:TCOD:Dev35:Show           |


@Sprint-14.4
@Priority1
@SCSCOD-5158
@LoginPage
Scenario Outline:Teacher clicks on Show to show the characters entered in password field:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
And teacher enters password in password field
When teacher clicks on SHOW
Then the entered characters in the password is shown

Examples:
|UsingData|
|InSprint14.4:TCOD:LoginPage_Password_Show|



@Sprint-14.4
@Priority1
@SCSCOD-5158
@LoginPage
Scenario Outline:Teacher clicks on Hide to hide the characters entered in password field:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
And teacher enters password in password field
And teacher clicks on SHOW
And the entered characters in the password is shown
When teacher clicks on HIDE
Then the password is hidden and '*'s are displayed

Examples:
|UsingData|
|InSprint14.4:TCOD:LoginPage_Password_Hide|


@Sprint-14.4
@Priority1
@SCSCOD-5158
@LoginPage
Scenario Outline:Teacher toggles from SHOW to HIDE and viceversa:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
And teacher enters password in password field
And SHOW option should be seen
When teacher clicks on SHOW
Then HIDE option should be seen
And teacher clicks on HIDE
And SHOW option should be seen
Examples:
|UsingData                                   |
|InSprint14.4:TCOD:LoginPage_Toggle_Hide_Show|

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-5158   	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Sprint-14.4
  @Priority1
  @SCSCOD-5158
  @LoginPage
  Scenario Outline:Password field on login page for Reading Clubs site:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    When teacher enters password in password field
    Then password by default is hidden and displayed as *
    And 'SHOW' is displayed within password field
  Examples:
    | UsingData |
    |InSprint14.4:TCOD:Dev35:Show           |


  @Sprint-14.4
  @Priority1
  @SCSCOD-5158
  @LoginPage
  Scenario Outline:Teacher clicks on Show to show the characters entered in password field:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher enters password in password field
    When teacher clicks on SHOW
    Then the entered characters in the password is shown

  Examples:
    |UsingData|
    |InSprint14.4:TCOD:LoginPage_Password_Show|



  @Sprint-14.4
  @Priority1
  @SCSCOD-5158
  @LoginPage
  Scenario Outline:Teacher clicks on Hide to hide the characters entered in password field:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher enters password in password field
    And teacher clicks on SHOW
    And the entered characters in the password is shown
    When teacher clicks on HIDE
    Then the password is hidden and '*'s are displayed

  Examples:
    |UsingData|
    |InSprint14.4:TCOD:LoginPage_Password_Hide|


  @Sprint-14.4
  @Priority1
  @SCSCOD-5158
  @LoginPage
  Scenario Outline:Teacher toggles from SHOW to HIDE and viceversa:[<UsingData>]

    Given teacher has valid reading clubs account
    And teacher navigates to the Canada Reading Clubs site
    And teacher enters password in password field
    And SHOW option should be seen
    When teacher clicks on SHOW
    Then HIDE option should be seen
    And teacher clicks on HIDE
    And SHOW option should be seen
  Examples:
    |UsingData                                   |
    |InSprint14.4:TCOD:LoginPage_Toggle_Hide_Show|



#SS - This scenario is not valid.The password will only re-appear if autosave of browser is enabled and teacher
  #Login successfully
#  @Sprint-14.4
#  @Priority1
#  @SCSCOD-5158
#  @LoginPage
#
#  Scenario Outline:Password field is set to hidden when page is refreshed
#
#    Given teacher has valid reading clubs account
#    And teacher navigates to the Canada Reading Clubs site
#    And teacher enters password in password field
#    And teacher clicks on SHOW
#    And the entered characters in password is shown
#    When page is refreshed
#    Then the password is hidden and '*'s are displayed
#    And SHOW option should be seen
#
#  Examples:
#    |UsingData|

#    |InSprint14.4:TCOD:LoginPage_Password_Show_Refresh|

