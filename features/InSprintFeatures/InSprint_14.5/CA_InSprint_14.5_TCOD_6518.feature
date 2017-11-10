Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6518        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-6518
@Priority2
@Sprint-14.5
@LoginPage
@Release-5.22.2017
Scenario Outline: Teacher clicks BACK button present in Retrieve Email Address Modal:[<UsingData>]

Given teacher has valid reading clubs account and navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher clicks on “Forgot your Account Number or Email Address?” hyper link
And teacher provides first name and last name
And teacher clicks CONTINUE button
And teacher is navigated to the Retrieve Email Address Modal
When teacher clicks on BACK button
Then teacher is returned to “Forgot Your Login Information?” modal
And first name and last name inputs should be empty
And CONTINUE button should be disabled

Examples:
|UsingData|
|InSprint14.5:TCOD:RetrieveEmailAddressModal_BACKButton|


@SCSCOD-6518
@Priority1
@Sprint-14.5
@LoginPage
@Release-5.22.2017
Scenario Outline: Teacher selects 'I know my password and want to sign in' from Retrieve Email Address Modal and continue with only first and last name:[<UsingData>]

Given teacher has valid reading clubs account and navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher clicks on “Forgot your Account Number or Email Address?” hyper link
And teacher provides first name and last name
And teacher clicks CONTINUE button
And teacher is navigated to the Retrieve Email Address Modal
And teacher selects any email from the options
And teacher selects “I know my password and want to sign in” option
When teacher clicks on NEXT button
Then Retrieve Email Address Modal is closed
And teacher is returned to unauthenticated login page

Examples:
|UsingData|
|InSprint14.5:TCOD:RetrieveEmailAddressModal_KnowPassword|



@SCSCOD-6518
@Priority1
@Sprint-14.5
@LoginPage
@Release-5.22.2017
Scenario Outline: Teacher selects 'I know my password and want to sign in' from Retrieve Email Address Modal and continue with first, last name and valid account number:[<UsingData>]

Given teacher has valid reading clubs account and navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher clicks on “Forgot your Account Number or Email Address?” hyper link
And teacher provides first name, last name and valid account number
And teacher clicks CONTINUE button
And teacher is navigated to the Retrieve Email Address Modal
And teacher selects any email from the options
And teacher selects “I know my password and want to sign in” option
When teacher clicks on NEXT button
Then Retrieve Email Address Modal is closed
And teacher is returned to unauthenticated login page

Examples:
|UsingData|
|InSprint14.5:TCOD:RetrieveEmailAddressModal_Acc_KnowPassword|











