Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6767        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-6767
@Priority2
@Sprint-14.5
@LoginPage
@Release-5.22.2017
Scenario Outline: Teacher provides first name, last name and e-mail address in 'Forgot Your Login Information?' and continue:[<UsingData>]

Given teacher has valid reading clubs account and navigates to the Canada Reading Clubs site
And teacher clicks on “Forgot your login information?” link
And teacher clicks on “Forgot your Account Number or Email Address?” hyper link
And teacher provides first name, last name and valid e-mail address
When teacher clicks CONTINUE button
Then teacher is navigated to the Retrieve Account Number Modal
And modal title is “Forgot your login information?”
And modal subtitle is “FORGOT YOUR ACCOUNT NUMBER?”
And modal message is “We have sent you an email containing your Account Number to the email address on file for your account”
And OK button is present
And Close icon on top right corner of the modal window 

Examples:
|UsingData|
|InSprint14.5:TCOD:RetrieveAccountNumberModal|











