Feature: As a QE want to validate Account Activation Modal

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6308  	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Sprint-14.4
  @SCSCOD-6308
  @LoginPage
  Scenario Outline:Teacher selects "Remember me" and enters account number/email address:[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    When teacher selects “Remember me” checkbox
    And teacher enters valid account number/email address
    And teacher enters valid password and clicks on login button
    And teacher is navigated to home page
    And teacher logout from the application
    Then teacher should see already entered account number/email address in scholastic account/email field
    And teacher close the browser and launches reading club site in new browser
    And teacher should see already entered account number/email address in scholastic account/email field

  Examples:
    |UsingData|
    |InSprint14.4:TCOD:LoginPage_RememberMe1|


  @Sprint-14.4
  @SCSCOD-6308
  @LoginPage
  Scenario Outline:Teacher enters account number and selects "Remember me":[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    And teacher enters valid account number
    When teacher selects “Remember me” checkbox
    And teacher enters valid password and clicks on login button
    And teacher is navigated to home page
    And teacher logout from the application
    Then teacher should see already entered account number in scholastic account/email field
    And teacher close the browser and launches reading club site in new browser
    And teacher should see already entered account number in scholastic account/email field

  Examples:
    |UsingData|
    |InSprint14.4:TCOD:LoginPage_RememberMe2|

  @Sprint-14.4
  @SCSCOD-6308
  @LoginPage
  Scenario Outline:Teacher enters email address and selects "Remember me":[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    And teacher enters valid email address
    When teacher selects “Remember me” checkbox
    And teacher enters valid password and clicks on login button
    And teacher is navigated to home page
    And teacher logout from the application
    Then teacher should see already entered email address in scholastic account/email field
    And teacher close the browser and launches reading club site in new browser
    And teacher should see already entered email address in scholastic account/email field


  Examples:
    |UsingData|
    |InSprint14.4:TCOD:LoginPage_RememberMe3|

  @Sprint-14.4
  @SCSCOD-6308
  @LoginPage
  Scenario Outline:Teacher enters invalid account number/email address and selects "Remember me":[<UsingData>]

    Given teacher has valid reading clubs account and navigates to login page
    And teacher enters invalid account number/email address
    When teacher selects “Remember me” checkbox
    And teacher enters invalid password and clicks on login button
    Then teacher should not see entered account number/email address in scholastic account/email field
    And "Remember me" checkbox is deselected

  Examples:
    |UsingData|
    |InSprint14.4:TCOD:LoginPage_RememberMe4|


