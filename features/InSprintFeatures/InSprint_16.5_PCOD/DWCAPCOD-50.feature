Feature: DWCAPCOD-50

Background:
Given Parent opens scholastic reading clubs e-commerce site


@1
@DWACAPCOD-50

Scenario Outline: Parent view their name, email and mobile on their profile:[<UsingData>]
Given Parent login in with valid [username] and [password]
When parent clicks on Profile from My Account dropdown
Then parent's correct full name, email and mobile number displays

Examples:
|UsingData|
|Dev35:PCOD:PCOOLPROFILE:1|

@2
@DWACAPCOD-50
Scenario Outline: Parent can view their preferences as opted in on their profile:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent has opted in for communication and promotional emails
When parent clicks on Profile from My Account dropdown
Then parent's view all their communication and promotional email as selected
Examples:
|UsingData|
|Dev35:PCOD:PCOOLPROFILE:2|

@3
@DWACAPCOD-50
Scenario Outline: Parent can view their preferences as opted Out on their profile:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent has not opted in for communication and promotional emails
When parent clicks on Profile from My Account dropdown
Then parent's view all their communication and promotional email as unselected 
Examples:
|UsingData|
|Dev35:PCOD:PCOOLPROFILE:3|


@4
@DWACAPCOD-50
Scenario Outline: Parent can view privacy policy on their profile:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent clicks on Profile from My Account dropdown
Then parent views privacy policy
Examples:
|UsingData|
|Dev35:PCOD:Dev35:PCOD:PCOOLPROFILE:4|

@5
@DWACAPCOD-50
Scenario Outline: Parent edits password:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent clicks on Profile from My Account dropdown
And parent clicks on Edit next to password
And Edit password modal displays with current password hidden
When parent enters new password matching the current password
And parent clicks on Submit
Then Save modal closes and edited password is saved
Examples:
|UsingData|
|Dev35:PCOD:PCOOLPROFILE:5|