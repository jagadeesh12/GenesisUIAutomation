Feature: SSO
	Parent Account - View Children

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

###################################################################################################################################################
###########################################   		    DWCAPCOD-82			     	 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@Priority1
@ParentAccount
@DWCAPCOD-82
@Sprint-16.1
@1
Scenario Outline: Parent view child information on My account page for parent with no child:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent does not have any child added
When parent clicks on My Account and Profile from the header
Then Parent is navigated to the Profile section of the My Account page
And secondary section header  “MY CHILDREN” displays
And this Section shows no message but shows “Add a Child” hyperlink
Examples:
	|UsingData                                                             |
	|InSprint16.1:PCOD:ParentAccount:ChildInformation_NoChildAdded|

@Priority1
@ParentAccount
@DWCAPCOD-82
@Sprint-16.1
@2
Scenario Outline: Parent view the connected child information on My account page:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has a child connected to a teacher
And parent clicks on My Account and Profile from the header
And <ChildFirstName> in <TeacherName>'s class displays with a + sign 
When parent clicks on + sign
Then Label ñ "YOUR CHILD:" displays
And <Name of child>, <Grade of child> displays
And "Edit" and "Remove" labels in right corner under expand and collapse displays
And "Add a Child" label at bottom right of section displays
Examples:
	|UsingData                                                             |
	|InSprint16.1:PCOD:ParentAccount:ChildInformation_ConnectedChild|

@Priority1
@ParentAccount
@DWCAPCOD-82
@Sprint-16.1
@3
Scenario Outline: Parent views the information of a child not connected to teacher on My account page:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has a child not connected to a teacher
And parent clicks on My Account and Profile from the header
And <ChildFirstName> displays with a + sign 
When parent clicks on + sign
Then Label "YOUR CHILD:" displays
And <Name of child>, <Grade of child> displays
And "Edit" and "Remove" labels in right corner under expand and collapse displays
And "Add a Child" label at bottom right of section displays
Examples:
	|UsingData                                                             |
	|InSprint16.1:PCOD:ParentAccount:ChildInformation_ChildConnected|