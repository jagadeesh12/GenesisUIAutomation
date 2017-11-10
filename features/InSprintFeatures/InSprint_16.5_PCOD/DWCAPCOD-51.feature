Feature: DWCAPCOD-51
	Parents - My Account - Edit Profile

Background:
	Given Parent opens scholastic reading clubs e-commerce site

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@1
Scenario Outline: Error message displays when invalid mobile number is entered:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit link next to name
When parent enters invalid phone number
Then error message “Please enter a valid phone number.” displays
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:InvalidPhoneNumber|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@2
Scenario Outline: Parent edits profile info and clicks on Close [Name and Email]:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit link next to name
When parent edits their profile information
And parent clicks on Close on Edit Profile modal
Then edited information is not saved and profile page displays the old information
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:Edit_and_Close|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@3
Scenario Outline: Parent cannot enter more than 30 characters in First and Last name field:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit link next to name
When parent tries to enter more than 30 characters in first and Last name 
Then any characters entered after 30 are ignored for "Name"
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:30Characters_Name|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@4
Scenario Outline: Parent cannot enter more than 60 characters in Email field:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit link next to name
When parent tries to enter more than 60 characters in email 
Then any characters entered after 60 are ignored for "Email"
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:60Characters_Email|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@5
Scenario Outline: Error message displays when parent enters invalid format of email address:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit link next to name
When parent enters invalid format of email address 
Then error message displays for invalid email address
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:InvalidEmailFormat|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@6
Scenario Outline: Save button enabled when no data entered in mobile number:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
When parent clicks on Edit link next to name
And parent does not enter mobile number
Then save button is enabled on Edit Profile modal
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:SaveButtonEnabled|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@7
Scenario Outline: Tool tip displays when parent enters less than 2 characters in first name and last name:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit link next to name
When parent enters only 1 character in "First Name" field
Then tool tip displays with error message "Please enter valid first name" for "First Name" field
When parent enters only 1 character in "Last Name" field
Then tool tip displays with error message "Please enter valid last name" for "Last Name" field
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:1Character_Name|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@8
Scenario Outline: Parent enter already used email address on Edit profile modal:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
When parent clicks on Edit link next to name
And parent enters already used email address
Then error message displays for already existing email
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:DupliacteEmail|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@9
Scenario Outline: Parent logins with edited email address and password:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent edits their email address
And parent edits their password
And parent clicks on Sign Out from My Account dropdown
When parent tries to login with edited email address and password
Then parent Home page displays
And parent restores previous information on account
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:EditEmailPassword_Login|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@10
Scenario Outline: Parent can edit their name, email and mobile number:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
When parent clicks on Edit link next to name
And parent edits first name, last name, email and mobile number
And parent clicks on Save on the Edit Profile modal
Then the Edit Profile modal disappears
And the edited full name, email and mobile number displays
And parent restores previous information on account
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:Edit_Save_AllInformation|

@DWCAPCOD-51
@Parent_MyAccount
@Sprint-16.5
@Priority1
@11  
Scenario Outline: Save button disabled if parent does not enter required data on edit profile:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
When parent clicks on Edit link next to name
And parent does not enter data in any of first name, last name, email
Then save button is disabled
Examples:
|UsingData|
|InSprint16.5:PCOD:Parent_MyAccount:EditProfile:SaveButtonDisabled|