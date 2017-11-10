Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7164        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


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
|InSprint15.1:TCOD:LoginPage_EmailAutoformatted|



Scenario Outline: Teacher enters email in mixed case in Account Number or Email field in login page:[<UsingData>]

Given teacher has valid reading clubs account
And teacher navigates to the Canada Reading Clubs site
When teacher enters valid email in mixed case in Account Number or Email field and valid password
And teacher clicks on login button
Then email is validated and teacher is navigated to home page

Examples:
|UsingData|
|InSprint15.1:TCOD:LoginPage_EmailAutoformatted_MixedCase|



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
|InSprint15.1:TCOD:MyAccountPage_EmailAutoformatted|











