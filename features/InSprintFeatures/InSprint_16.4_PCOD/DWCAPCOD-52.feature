Feature: DWCAPCOD-52

Background:
  Given Parent opens scholastic reading clubs e-commerce site

Scenario Outline: Parent edits password and logs in with edited password:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  When parent clicks on Edit next to password
  And parent enters valid matching passwords in “New password” and “confirm New password” fields
  And clicks on Save button
  Then Edit password modal closes
  And Edited password is saved
  And parent can login with edited password
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordValid|

Scenario Outline: Parent clicks on Hide password:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  And parent clicks on Edit next to password
  And parent enters passwords in “New password” and “confirm New password” fields
  And password is shown by default in edit password modal
  When parent clicks on Hide
  Then password is hidden on “New password” and “confirm New password” fields
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordHide|

Scenario Outline: Parent clicks on Show password:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  And parent clicks on Edit next to password
  And parent enters passwords in “New password” and “confirm New password” fields
  And parent clicks on Hide
  When parent clicks on Show
  Then password on “New password” and “confirm New password” fields is shown
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordShow|

Scenario Outline: Parent enters non-matching passwords:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  When parent clicks on Edit next to password
  And enters non-matching passwords in “New password” and “confirm New password” fields
  #And clicks on Save
  Then “Does not match password” tooltip displays
  And Save button gets disabled
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordNotMatching|

Scenario Outline: Parent enter invalid password without numbers:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  When parent clicks on Edit next to password
  And enters invalid password without numbers
  Then “Please make sure your password has at least 7 characters and contains both letters and numbers. Special characters may be used.” tool tip message dispays on outfocus
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordWithoutNumber|

Scenario Outline: Parent enter invalid password without letters:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  When parent clicks on Edit next to password
  And enters invalid password without letters
  Then “Please make sure your password has at least 7 characters and contains both letters and numbers. Special characters may be used.” tool tip message dispays on outfocus
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordWithoutLetters|

Scenario Outline: Parent enter invalid password less than 7 characters:[<UsingData>]
  
  Given Parent login in with valid [username] and [password]
  And parent clicks on Profile from My Account dropdown
  When parent clicks on Edit next to password
  And enters invalid password less than 7 characters
  Then “Please enter at least 7 characters.” tool tip message dispays on outfocus
  Examples:
    |UsingData|
    |Dev35:PCOD:ProfileEditPasswordLess7Characters|

#test

#@MANUAL
#Scenario Outline: Parent views Edit Password modal
#Given Parent login in with valid [username] and [password]
#And parent clicks on Profile from My Account dropdown
#When parent clicks on Edit next to password
#Then "Edit Password" modal displays with content " Create a New Password"
#And submessage "Please make sure your password has at least 7 characters and contains both letters and numbers. Special characters may be used."
#And no tip message displays
#And "New password" and "confirm New password" fields displays
#And close icon on top right corner
#And Save button at the bottom displays