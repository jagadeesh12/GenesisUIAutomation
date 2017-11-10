Feature: SSO
	Parent Account - Remove Children

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

###################################################################################################################################################
###########################################   		    DWCAPCOD-65			     	 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@Priority1
@ParentAccount
@DWCAPCOD-65
@Sprint-16.1
@1
Scenario Outline: Parent clicks on Remove link next to Child info on My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has a child connected to a teacher
And parent clicks on My Account and Profile from the header
And parent clicks on + sign
When parent clicks on Remove
Then parent is presented with tool tip
And Tool tip message "Are you sure you want to removes this child from your account?" displays with "YES" and "NO" buttons
Examples:
|UsingData                                                             |
|InSprint16.1:PCOD:ParentAccount:RemoveLink_Clicked|

@Priority1
@ParentAccount
@DWCAPCOD-65
@Sprint-16.1
@2
Scenario Outline: Parent deletes child from My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has a child connected to a teacher
And parent clicks on My Account and Profile from the header
And parent clicks on + sign
When parent clicks on Remove
And clicks on "YES" option from tool tip
Then the child information is deleted
And this Section shows no message but shows ìAdd a Childî hyperlink
And the child is not seen in child dropdown on Home page
And the child is not seen in child dropdown on Review cart page
Examples:
|UsingData                                                             |
|InSprint16.1:PCOD:ParentAccount:RemoveLink_DeleteChild|

@Priority1
@ParentAccount
@DWCAPCOD-65
@Sprint-16.1
@3
Scenario Outline: Parent Clicks Remove & "No" option for a child from My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has a child connected to a teacher
And parent clicks on My Account and Profile from the header
And parent clicks on + sign
When parent clicks on Remove
And clicks on'NO'option from tool tip
Then the child information is still retained
And the child is still seen in child dropdown on Home page
And the child is still seen in child dropdown on Review cart page
Examples:
|UsingData                                                             |
|InSprint16.1:PCOD:ParentAccount:RemoveLink_NOSelected|

#SS - Data not there
#@Priority1
#@ParentAccount
#@DWCAPCOD-65
#@Sprint-16.1
#@4
#Scenario Outline: Items in cart reassigned when the child is deleted:[<UsingData>]
#Given Parent login in with valid [username] and [password]
#And parent has 2 child connected to different teacher
#And parent adds items to cart and assigns to child1
#And parent clicks on My Account and Profile from the header
#And parent clicks on + sign
#When parent clicks on Remove
#And clicks on "YES" option from tool tip
#Then the child information is deleted
#And all the items in the cart are now assigned to Child2
#Examples:
#|UsingData                                                             |
#|InSprint16.1:PCOD:ParentAccount:RemoveLink_ItemsReassigned|
