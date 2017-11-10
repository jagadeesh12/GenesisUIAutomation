Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6769        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-6769
@Priority1
@Sprint-14.5
@LoginPage
@Release-5.22.2017
Scenario Outline: User provides First Name, Last Name only, but no matches were found:[<UsingData>]

Given teacher has valid reading clubs account and navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher clicks on “Forgot your Account Number or Email Address?” hyper link
And teacher provides first name and last name
When teacher clicks CONTINUE button
Then teacher is returned to the Forgot Account Number or Email Address modal
And teacher sees error message “No matching account was found. Please contact customer service at 1-800-268-3860.”
And first name and last name inputs should be retained
And CONTINUE button should be enabled

Examples:
|UsingData|
|InSprint14.5:TCOD:ForgotPasswordModalPage_FirtNameLastName_NoMatch|



@SCSCOD-6769
@Priority1
@Sprint-14.5
@LoginPage
@Release-5.22.2017
Scenario Outline: User provides First Name, Last Name only, matching account is found but there is no email address on file:[<UsingData>]

Given teacher has valid reading clubs account but no email id is mapped
And teacher navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher clicks on “Forgot your Account Number or Email Address?” hyper link
And teacher provides first name and last name
When teacher clicks CONTINUE button
Then teacher is returned to the Forgot Account Number or Email Address modal
And teacher sees error message “No matching account was found. Please contact customer service at 1-800-268-3860.”
And first name and last name inputs should be retained
And CONTINUE button should be enabled

Examples:
|UsingData|
|InSprint14.5:TCOD:ForgotPasswordModalPage_FirtNameLastName_NoEmail|











