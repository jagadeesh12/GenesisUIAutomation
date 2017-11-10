Feature: Loginpage
	This feature is used to validate PCOD Loginpage

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site




@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters email address without domain in email field on Login page:[<UsingData>]

Given Parent enters email address without domain in account number/email field and click outside
Then tool tip error message “Please enter a valid email address.” displays
And account number/email field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_Email_MissingDomain|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters email address without dot in email field on Login page:[<UsingData>]

Given Parent enters email address without dot in account number/email field and click outside
Then tool tip error message “Please enter a valid email address.” displays
And account number/email field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_Email_MissingDot|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters email address without top level domain in email field on Login page:[<UsingData>]

Given Parent enters email address without top level domain in account number/email field and click outside
Then tool tip error message “Please enter a valid email address.” displays
And account number/email field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_Email_MissingTopLevelDomain|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters email address with multiple '@' sign in email field on Login page:[<UsingData>]

Given Parent enters email address with multiple “@” sign in account number/email field and click outside
Then tool tip error message “Please enter a valid email address.” displays
And account number/email field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_Email_Multiple@Signs|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters email address with multiple dots in email field on Login page:[<UsingData>]

Given Parent enters email address with multiple dots in account number/email field and click outside
Then tool tip error message “Please enter a valid email address.” displays
And account number/email field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_Email_MultipleDots|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters email address with multiple dots and invalid top level domain in email field on Login page:[<UsingData>]

Given Parent enters email address with multiple dots and invalid top level doamain in account number/email field and click outside
Then tool tip error message “Please enter a valid email address.” displays
And account number/email field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_Email_MultipleDots_InvalidTopLevelDoamin|

@LoginPage
@DWCAPCOD-56
@Priority2

Scenario Outline:Parent enters non-existing email address and password on Login page:[<UsingData>]

Given Parent enters non-existing email address in account number/email field and password
When Parent clicks on login button
Then tool tip error message “Log-In Error. We couldn't find an account with the information you provided. Please try again or click the “Forgot your account information?” link below to retrieve your account information.” displays
And the email address and password field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_InvalidEmailPassword|

@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters non-existing account number and password on Login page:[<UsingData>]

Given Parent enters non-existing account number in account number/email field and password
When Parent clicks on login button
Then tool tip error message “Log-In Error. We couldn't find an account with the information you provided. Please try again or click the “Forgot your account information?” link below to retrieve your account information.” displays
And the email address and password field is highlighted in yellow


Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_InvalidAccountPassword|

@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent enters valid email address and incorrect password on Login page:[<UsingData>]

Given Parent enters valid email address and incorrect password
When Parent clicks on login button
Then tool tip error message “Log-In Error. We couldn't find an account with the information you provided. Please try again or click the “Forgot your account information?” link below to retrieve your account information.” displays
And the email address and password field is highlighted in yellow


Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_ValidEmailInValidPassword|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent does not enter email or account number but enters password:[<UsingData>]

Given Parent does not enter account number but enters password in password field
When Parent clicks on login button
Then tool tip error message “Please provide your account number or account email.” displays
And email address field is highlighted in yellow

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_BlankAccount|


@LoginPage
@DWCAPCOD-56
@Priority2
Scenario Outline:Parent does not enter Password but enters email or account number:[<UsingData>]

Given Parent enters account number but does not enter password in password field
When Parent clicks on login button
Then tool tip error message “Please enter your password.” displays
And the password field is highlighted in yellow


Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_BlankPassword|


@LoginPage
@DWCAPCOD-56
@Priority1
Scenario Outline:Parent enters valid email and password:[<UsingData>]

Given Parent enters valid email and password
When Parent clicks on login button
Then Parent Home page displays


Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_AccountLogin_ValidUserEmailPassword|