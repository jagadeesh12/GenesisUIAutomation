Feature: Homepage
	This feature is used to validate PCOD HomePage

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site





@HomePage
@DWCAPCOD-192
@Priority1
Scenario Outline:Item# field is enabled when min 3characters are entered:[<UsingData>]

Given Parent logs into the application by providing valid credentials
When Parent enters minimum 3 characters in item number field
Then ADD TO CART button is enabled

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_CreateAccount_ItemNumberEnabled|
  
@HomePage
@DWCAPCOD-192
@Priority2 
Scenario Outline:Item# field cannot enter more than 6 characters in Item# field:[<UsingData>]

Given Parent logs into the application by providing valid credentials
When Parent tries to enter more than 6 characters in Item# field
Then any characters entered after 6 characters are ignored

Examples:
|UsingData|
|InSprint12.5:PCOD:Parent_CreateAccount_ItemNumber_MoreThanSixCharacters|

@HomePage
@DWCAPCOD-192
@Priority2
Scenario Outline:Parent enters special characters in Item# field:[<UsingData>]

Given Parent logs into the application by providing valid credentials
When Parent enters special characters in Item# field
Then tool tip error message “Please enter a valid item number.” displays
And item# field is highlighted in yellow and bordered in red

Examples:
| UsingData|
| InSprint12.5:PCOD:Parent_CreateAccount_ItemNumber_SpecialCharacters|



@HomePage
@DWCAPCOD-538
@Priority1
Scenario Outline:Child associated to highest grade is seen as default child in 'Child in Teacher Class' drop down:[<UsingData>]

Given Parent login in with valid [username] and [password] having multiple children
When parent is in homepage
Then parent see child associated to highest grade as default in “Child in Teacher Class” drop down

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DefaultChild_HighestGrade|



@HomePage
@DWCAPCOD-538
@Priority1
Scenario Outline:Child added first is seen as default in 'Child in Teacher Class' drop down when more than two childs are associated to same highest grade:[<UsingData>]

Given Parent login in with valid [username] and [password] having multiple children associated to same highest grade
When parent is in homepage
Then parent see initially added child having highest grade as default in “Child in Teacher Class” drop down

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DefaultChild_HighestGradeMultipleChildren|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-520    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@DWCAPCOD-520
@Parent_Header
@HomePage
@Sprint-13.4
@Priority3
Scenario Outline:Parent Clicks on Home icon:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on Home icon
Then parent Home page displays

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutHeader_HomeIcon|