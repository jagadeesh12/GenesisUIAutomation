Feature: DWCAPCOD-159
	Teacher's - Teacher's Desk - Student Online Orders

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

@DWCAPCOD-159
@TeacherDesk
@Priority1
@Sprint-16.3
@1
Scenario Outline: Teacher clicks on 'View and Submit' when no SOO orders in cart:[<UsingData>]
	Given teacher logs in to the application by providing [UserInformation]
	And teacher clicks on Teacher Desk
	When teacher clicks "View & Submit" from SOO section
	Then empty SOO page displays
Examples:
|UsingData|
|InSprint16.3:PCOD:TeacherDesk:NoSOO_Orders|

@DWCAPCOD-159
@TeacherDesk
@Priority1
@Sprint-16.3
@2
Scenario Outline: Teacher clicks on 'View and Submit' from Teacher Desk with pending SOO orders in cart:[<UsingData>]
	Given teacher logs in to the application by providing [UserInformation]
	And teacher clicks on Teacher Desk
	When teacher clicks "View & Submit" from SOO section
	Then SOO page displays with parent orders
Examples:
|UsingData|
|InSprint16.3:PCOD:TeacherDesk:Pending_SOO_Orders|

@DWCAPCOD-159
@TeacherDesk
@Priority1
@Sprint-16.3
@3
Scenario Outline: SOO order count for orders from 3 parents:[<UsingData>]
	Given teacher has pending parent orders from 3 parents
	And teacher logs in to the application by providing [UserInformation]
	When teacher clicks on Teacher Desk
	Then "You Have Received Student Online Orders 3" displays
Examples:
|UsingData|
|InSprint16.3:PCOD:TeacherDesk:3_SOO_Orders|

#@DWCAPCOD-159
#@TeacherDesk
#@Manual
#@Sprint-16.3
#Scenario Outline: SOO section on Teacher Desk with no SOO Orders:[<UsingData>]
#Given teacher does not have pending parent orders in cart
#And teacher logs into the application by providing [User Information]
#When teacher navigates to Teacher Desk
#Then Teacher is shown a section for Student Online Orders in the middle column (titled 'Your Orders' ) between the 'Submit your order by' and the 'Order Status' sections.
#And Section message line 1 "You Have Received" displays
#And Section message line 2 "Student Online Orders" displays
#And Section displays "0" next message as no SOO are present
#And "View & Submit" hyperlink displays
#
#Examples:
#|UsingData|
#|InSprint16.3:PCOD|
#
#@DWCAPCOD-159
#@TeacherDesk
#@Manual
#@Sprint-16.3
#Scenario Outline: SOO section on Teacher Desk with pending soo items:[<UsingData>]
#Given teacher does not have pending multiple orders from multiple children from same parent in cart
#And teacher logs into the application by providing [User Information]
#When teacher navigates to Teacher Desk
#Then Teacher is shown a section for Student Online Orders in the middle column (titled 'Your Orders' ) between the 'Submit your order by' and the 'Order Status' sections.
#And Section message line 1 "You Have Received" displays
#And Section message line 2 "Student Online Orders" displays
#And Section displays total number of SOO orders received
#And "View & Submit" hyperlink links to Cart page
#And A pop-up modal also displays with Modal message - "You have Student Online Orders that must be submitted for processing. To maximize Classroom Rewards, submit one combined class order."
#
#Examples:
#|UsingData|
#|InSprint16.3:PCOD|