Feature: DWCAPCOD-156
Teacher Site - Teacher Desk - Online Note to Parents

Background: 
	Given Parent opens scholastic reading clubs e-commerce site
	
###################################################################################################################################################
###########################################   		    DWCAPCOD-156		     	 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@1
Scenario Outline: Teacher tries to enter more than 150 characters in Online note:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher tries to enter more than 150 characters in online note
Then the character count shows as (0/150)
And any characters entered after 150 are not accepted
Examples:
	|UsingData|
	|InSprint16.1:TeacherDesk:OnlineNotes_MessageTxt_moreThan150characters|
	

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@2
Scenario Outline: Teacher deletes the default online note:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher deletes the default online note
And teacher clicks on save
And teacher clicks on Edit link
Then the default message is restored
Examples:
	|UsingData|
	|InSprint16.1:TeacherDesk:OnlineNotes_DeleteDafaultMsg|


@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@3
Scenario Outline: Teacher can enter a max of 30 characters in the name on Online Note modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher tries to enter more than 30 characters in the name field
Then any characters entered after 30 characters are ignored
Examples:
    |UsingData|
    |InSprint16.1:TeacherDesk:OnlineNotes_NameTxt_moreThan30characters|

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@4
Scenario Outline: Teacher edits salutation and display name on Online Note modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher edits the salutation and teacher display name
Then the salutation and teacher display name are saved
Examples:
	|UsingData|
	|InSprint16.1:TeacherDesk:OnlineNotes_Edit_Name_Salutation|

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@5
Scenario Outline: Online Note section on Teachers Desk:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
When teacher clicks on Teacher Desk
Then "Online Note to Parents" section displays with "A Note from <salutation> <LastName>" message
And Edit link displays
Examples:
	|UsingData|
	|InSprint16.1:TeacherDesk:OnlineNotes_Section|

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@6
Scenario Outline: Teacher edits the default welcome note and clicks on Save:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher edits the default note
And clicks on Save
Then the edited content is saved
And the modal closes
Examples:
	|UsingData|
	|InSprint16.1:TeacherDesk:OnlineNotes_Edit_DefaultMessage_SAVE|

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@7
Scenario Outline: Teacher edits the default welcome note and clicks on Cancel:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher edits the default note
And clicks on Cancel
Then the edited content is not saved
And the modal closes
Examples:
|UsingData|
|InSprint16.1:TeacherDesk:OnlineNotes_Edit_DefaultMessage_CANCEL|

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@8
Scenario Outline: Teacher edits the default welcome note and clicks on Close:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher edits the default note
And clicks on Close
Then the edited content is not saved
And the modal closes
Examples:
|UsingData|
|InSprint16.1:TeacherDesk:OnlineNotes_Edit_DefaultMessage_CLOSE|

@Priority1
@TeacherDesk
@DWCAPCOD-156
@Sprint-16.1
@9
Scenario Outline: Salutation values for Teacher:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit link of Online Note
When teacher clicks on the salutation dropdown
Then values MRS., MISS, MS, MR., SR., BR., FR., MME., MLLE., M.,OTHER/AUTRE displays in salutation
Examples:
|UsingData|
|InSprint16.1:TeacherDesk:OnlineNotes_Edit_Salutation_Values|

#@Priority1
#@TeacherDesk
#@DWCAPCOD-156
#@Sprint-16.1
#@Manual
#Scenario Outline: Content Slots and Content assets on Teacher's Desk:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher clicks on Teacher Desk
#Then 5 content slots separated by 2 blue headers displays
#And First header "Manage Parent Ordering" displays
#And 3 content slots under this section displays for Letter, Note, and Due Date
#And Second blue header "Teacher Help & Resources" displays
#And 2 content slots displays under this section
#And 1 content slot displays to show the account status, outstanding balance
#
#@Priority1
#@TeacherDesk
#@DWCAPCOD-156
#@Sprint-16.1

#@Manual
#Scenario Outline: Teacher clicks on Edit link on Online note:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#When teacher clicks on Edit link of Online Note
#Then modal with title "Edit Online Note to Parents" displays
#And modal message "Edit how your name appears to parents when they shop online." displays
#And text field for the Teacher's message/note displays with text "Edit your note to parents.Parents see your note when they shop online. max 150 characters (2/150)"
#And default welcome message ""Welcome to our class's Reading Club page. Find great books that your child will love to read and help our class earn FREE books with every purchase! " displays
#And Cancel and save buttons displays