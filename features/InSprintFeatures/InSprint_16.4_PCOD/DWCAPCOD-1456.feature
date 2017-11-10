Feature: DWCAPCOD-1456
	Teachers - My Account - Profile update for Parent Site opt-in

Background:
	Given Parent opens scholastic reading clubs e-commerce site

@DWCAPCOD-1456
@Teacher_MyAccount
@Priority1
@Sprint-16.4
@1
Scenario Outline: Teacher opts in to parent site from Edit Parent site preferences on My Account page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Profile from My Account dropdown
When teacher clicks on Edit next to Parent Site
And teacher checks the parent site option
And teacher clicks on Save on Parent Site Modal
Then Edit Parent Site modal closes
And “Allow parents to find me and place orders online” displays with green tick mark under parent1 site
Examples:
  |UsingData|
  |InSprint16.4:PCOD:MyAccount:OptIn|

@DWCAPCOD-1456
@Teacher_MyAccount
@Priority1
@Sprint-16.4
@2
Scenario Outline: Teacher opts out of parent site from Edit Parent site preferences on My Account page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Profile from My Account dropdown
When teacher clicks on Edit next to Parent Site
And teacher unchecks the parent site option
And teacher clicks on Save on Parent Site Modal
Then Edit Parent Site modal closes
And Parent Site displays without any selected options displayed under it
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:OptOut|

@DWCAPCOD-1456
@Teacher_MyAccount
@Priority1
@Sprint-16.4
@3
Scenario Outline: Teacher logs in first time after parent site launch and has previously not opted in for parent pay:[<UsingData>]
Given teacher has not logged in after parent site launch and teacher has previously not opted in for parent pay
And teacher logs into the application by providing [UserInformation] and sees the parent site modal
When teacher clicks on Next from Welcome to Reading clubs modal
Then Homepage displays with Edit parent site modal
And checkbox to opt in for parent site is not checked by default
Examples:
|UsingData|
|InSprint16.4:PCOD:ParentSiteLaunch:OptOut_Previously|

@DWCAPCOD-1456
@Teacher_MyAccount
@Priority1
@Sprint-16.4
@4
Scenario Outline: Teacher logs in first time after parent site launch and has previously opted in for parent pay:[<UsingData>]
Given teacher has not logged in after parent site launch and teacher has previously opted in for parent pay
And teacher logs into the application by providing [UserInformation] and sees the parent site modal
When teacher clicks on Next from Welcome to Reading clubs modal
Then Homepage displays with Edit parent site modal
And checkbox to opt in for parent site is checked by default
Examples:
|UsingData|
|InSprint16.4:PCOD:ParentSiteLaunch:OptIn_Previously|

#@DWCAPCOD-1456
#@Teacher_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Teacher views tool tip next to parent site:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher has previously opted in for parent pay
#And teacher clicks on Profile from My Account dropdown
#When teacher clicks on (?) next to Parent site
#Then tooltip displays with message displayed from content asset
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:|
#
#@DWCAPCOD-1456
#@Teacher_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Teacher logs in first time after parent site launch:[<UsingData>]
#Given teacher has not logged in after parent site launch
#When teacher logs into the application by providing [UserInformation]
#Then teacher is presented with a modal informing them that Parents can now place orders online
#And there is no close option
#And "Next" button displays
#And teacher cannot click outside of the modal to close the modal
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:|