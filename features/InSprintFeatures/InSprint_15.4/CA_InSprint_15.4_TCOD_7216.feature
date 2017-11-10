Feature: MyAccount-EditGrade
	This feature is to validate the RCO Select Grade

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7216     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@1

	Scenario Outline:Teacher opens Edit Role modal under My account:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		When teacher click Edit link present beside Role
		Then Edit Role modal modal is displayed
		And Edit Role modal displays Label Role,drop down label Select Role and X icon to close the modal
		And click on X icon
		And the Edit Role modal is closed


		Examples:
			| UsingData |
			| EditRole_1 |


	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@2

	Scenario Outline:Teacher decide to enter number of student for grade she teaches:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And this displays drop down list for Grade with default value Select Grade
		And an input box with Label Students and 0 selected by default
		And Save button is disabled
		When teacher selects Grade as MultiGrades
		Then Modal updates and on the Edit Role Modal Next button is enabled


		Examples:
			| UsingData |
			| EditRole_Modal_TeacherGrade |
			| EditRole_Modal_TeacherSpeciality |


	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@3

	Scenario Outline:Teacher navigate to Select Grade Modal:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		When teacher click on Next button
		Then the modal with title Select Grade is displayed
		And modal displays message which is contant assest
		And the label Grade is displayed
		And Each grades are displayed with input box to enter number of students
		And text/copy ‘Total amount of Students taught:’
		And beside that copy, a label representing the sum of the total amount of students taught by a Teacher across multiple grades.
		And a  button labeled ‘NEXT’  in the enabled state


		Examples:
			| UsingData |
			| SelectGradeModal_EditRole_BYGRADE|
			| SelectGradeModal_EditRole_BYSPECIALITY|





	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@4

	Scenario Outline:Teacher modifies single grade to Multiple grade on the Edit Role modal:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		When teacher click on Next button
		Then the modal with title Select Grade is displayed
		And text/copy ‘Total amount of Students taught:’ with value from prvious single grade selection is displayed



		Examples:
			| UsingData |
			| SelectGradeModal_EditRole_GradeUpdate1|
			| SelectGradeModal_EditRole_BYSPECIALITY_GradeUpdate1|





	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@5

	Scenario Outline:Teacher modifies Multiple grade to Single grade on the Edit Role modal:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		When teacher click on Next button
		Then the modal with title Select Grade is displayed
		And text/copy ‘Total amount of Students taught:’ with value from prvious multigrade selection is displayed



		Examples:
			| UsingData |
			| SelectGradeModal_EditRole_GradeUpdate2|
			| SelectGradeModal_EditRole_BYSPECIALITY_GradeUpdate2|



	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@6

	Scenario Outline:Select Grade Modal Display Kindergarten as only K grade:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		When teacher click on Next button
		Then the modal with title Select Grade is displayed
		And the list of grade which is displayed should only display “Pre-School”,“Kindergarten”,“Grade1” to “Grade12”



		Examples:
			| UsingData |
			| SelectGradeModal_GradeList|



	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@7

	Scenario Outline:Select Grade Modal's Total amount of Students taught: is udpated:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		And teacher click on Next button
		And the modal with title Select Grade is displayed
		And text/copy ‘Total amount of Students taught:’
		When student number for Grade is updated for different grades
		Then value of students displayed is udpated for label ‘Total amount of Students taught:’
		And verify the total should be summation of each grades


		Examples:
			| UsingData |
			| SelectGradeModal_GradeList7|



	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@8

	Scenario Outline:Select Primary grade modal is displayed:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		And teacher click on Next button
		And the modal with title Select Grade is displayed
		And teacher enters[Student No] for [grades]
		And text/copy ‘Total amount of Students taught:’ display total of all the grades
		When teacher click Next
		Then ‘Primary Grade’ modal is displayed
		And the modal has a label Select Primary Grade
		And message from content assest is displayed informing teacher to select primary grade
		And labels with grey background displaying grades, selected as multiple grade is displayed
		And button Save is displayed on the modal
		And the grade lables are displayed in the order ‘Select Grade’ listbox





		Examples:
			| UsingData |
			| SelectGradeModal_GradeList8|


	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@9

	Scenario Outline:Select Primary grade from the grade label on the Select Primary grade modal:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher click Edit link present beside Role
		And Edit Role modal modal is displayed
		And teacher select Teacher (By Grade) Role, or Teacher (By Speciality)
		And selects grade as Multiple Grade
		And teacher click on Next button
		And the modal with title Select Grade is displayed
		And teacher enters[Student No] for [grades]
		And text/copy ‘Total amount of Students taught:’ display total of all the grades
		And teacher click Next
		And ‘Primary Grade’ modal is displayed
		When teacher selects one of the label displaying grade value to make it primary grade
		Then the background color will change from gray to blue
		And the teacher will be presented with a callout message (content asset)
		And the button labeled ‘SAVE’ will change into the enabled state


		Examples:
			| UsingData |
			| SelectGradeModal_GradeList9|


	@SCSCOD-7216
	@Priority1
	@Sprint-15.4
	@MyAccount-EditGrade
	@Release-BTS2017
	@10

	Scenario Outline:Multigrade teacher with primary grade selected edits the role under MyAccount:[<UsingData>]


		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		When teacher click Edit link present beside Role
		Then Select Primary Grade window is displayed
		And all the label displaying grade will be greyed out
		And the Save button is not active.


		Examples:
			| UsingData |
			| SelectGradeModal_GradeList10|
