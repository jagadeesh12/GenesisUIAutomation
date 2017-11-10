Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6750        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7179
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
|InSprint14.4:TCOD:Teacher_AccountLogin_BlankAccount|











