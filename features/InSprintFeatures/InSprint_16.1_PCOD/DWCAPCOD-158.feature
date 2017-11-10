Feature: SSO
	Teacher Site - Teacher Desk - Set Order Due Date for Parents

Background:
	Given Parent opens scholastic reading clubs e-commerce site


###################################################################################################################################################
###########################################   		    DWCAPCOD-158		     	 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@Priority1
@TeacherDesk
@DWCAPCOD-158
@Sprint-16.1
@1
Scenario Outline: Due date is blank when teacher does not set a due date:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher has not set a due date
When teacher clicks on Teacher Desk
Then Due Date is blank
Examples:
	|UsingData|
	|InSprint16.1:PCOD:TeacherDesk:OrderDueDate_NotSet|

@Priority1
@TeacherDesk
@DWCAPCOD-158
@Sprint-16.1
@2
Scenario Outline: Teacher clicks on edit due date:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
When teacher clicks on Edit next to Due Date
Then teacher is presented with a calendar modal
And Calendar defaults to current month
And teacher cannot navigate to months past
And past dates in current month are displayed as greyed out and unselectable
And teacher can navigate to any number of months in the future
Examples:
	|UsingData|
	|InSprint16.1:PCOD:TeacherDesk:OrderDueDate_EditDueDateLink_Clicked|

@Priority1
@TeacherDesk
@DWCAPCOD-158
@Sprint-16.1
@3
Scenario Outline: Teacher selects a due date from Order Due Date section:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks on Edit next to Due Date
When teacher selects a due date
Then the modal closes
And the selected date displays
And clicking Edit shows the selected date highlighted in blue
Examples:
	|UsingData|
	|InSprint16.1:PCOD:TeacherDesk:OrderDueDate_SelectDueDate|

@Priority1
@TeacherDesk
@DWCAPCOD-158
@Sprint-16.1
@4
Scenario Outline: Teacher clicks on Send Reminder in Order Due Date section:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
When teacher clicks on Send Reminder
Then Send Reminder modal displays
Examples:
	|UsingData|
	|InSprint16.1:PCOD:TeacherDesk:OrderDueDate_SendReminder_Clicked|

@Priority1
@TeacherDesk
@DWCAPCOD-158
@Sprint-16.1
@5
Scenario Outline: Teacher selects a due date from Order Due Date section from French:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher toggles to French
And teacher clicks on Teacher Desk
And teacher clicks on Edit next to Due Date
When teacher selects a due date
Then the modal closes
And the selected date displays in French format
Examples:
	|UsingData|
	|InSprint16.1:PCOD:TeacherDesk:OrderDueDate_SelectedDueDate_FRENCHFormat|
