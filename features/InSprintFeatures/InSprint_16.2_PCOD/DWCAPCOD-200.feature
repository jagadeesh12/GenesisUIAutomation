Feature: DWCAPCOD-200
	Parents - Home Page - Child Drop Down - Connect Child to Teacher
	
	
Background: 
	Given Parent opens scholastic reading clubs e-commerce site	

@DWCAPCOD-200
@HomePage
@Priority1
@Sprint-16.2 
Scenario Outline: Parent connects child to teacher from Home page child dropdown:[<UsingData>]
Given Parent login in with valid [username] and [password]
When parent clicks "Connect to Teacher" link from child dropdown
And parent clicks on Find Your Teacher
And parent selects a teacher
And parent clicks on Save on the "Connect to Teacher" modal
Then parent remains on Home page
And <ChildFirstName> in <TeacherName>'s class displays in child dropdown
And all children are removed from account
Examples:
| UsingData |
| InSprint16.2:PCOD:Homepgae_Dropdown_ChildNotConnected |