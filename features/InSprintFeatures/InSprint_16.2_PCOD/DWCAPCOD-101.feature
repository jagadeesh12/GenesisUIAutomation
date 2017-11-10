Feature: DWCAPCOD-101
	
	
Background: 
Given Parent opens scholastic reading clubs e-commerce site	

@DWCAPCOD-101
@SSO
@Priority1
@Sprint-16.2 
Scenario Outline: Parent with one child submit order to teacher:[<UsingData>]

Given teacher connected to one parent having one child and has 1 pending order
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Online Orders from Enter Orders option
Then the items for corresponding child displays with correct Item#, title, Flyer, price, quantity
And order placed date displays

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_1Child|


@DWCAPCOD-101
@SSO
@Priority1
@Sprint-16.2 
Scenario Outline: Parent with multiple children connected to same teacher submit order to the teacher:[<UsingData>]

Given teacher connected to one parent having 2 childs and has 1 pending order
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Online Orders from Enter Orders option
Then the items for corresponding child1 displays with correct Item#, title, Flyer, price, quantity
And the items for corresponding child2 displays with correct Item#, title, Flyer, price, quantity 
And order placed date displays

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_2Child|

@DWCAPCOD-101
@SSO
@Priority1
@Sprint-16.2 
Scenario Outline: Parent with multiple children connected to same teacher submit multiple orders to teacher:[<UsingData>]

Given teacher connected to one parent having 2 childs and has 2 pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Online Orders from Enter Orders option
Then order submitted recently should appear on top
And the items for recent order corresponding child1 and child2 displays with correct Item#, title, Flyer, price, quantity
And order placed date displays for recent order
And order submitted first should appear on bottom of the list
And the items for first order corresponding child1  and child2 displays with correct Item#, title, Flyer, price, quantity
And order placed date displays for first order

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_2Child_MultipleOrders|

@DWCAPCOD-101
@SSO
@Priority1
@Sprint-16.2
@DWCAPCOD-1974 
Scenario Outline: Totals on SOO page:[<UsingData>]

Given teacher connected to one parent having 2 childs and has 2 pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Online Orders from Enter Orders option
Then total of all items displays without any taxes

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_Totals|

@DWCAPCOD-101
@SSO
@Priority2
@Sprint-16.2 
Scenario Outline: Clicking on Item title in SOO page:[<UsingData>]

Given teacher connected to one parent having one child and has 1 pending order
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on Item title of any item
Then 'See Full Details' hyperlink should be seen
And Remove/hide star and heart icon should be seen

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_ItemTitle_Link|



@DWCAPCOD-101
@SSO
@Priority2
@Sprint-16.2 
Scenario Outline: Clicking on Item number in SOO page:[<UsingData>]

Given teacher connected to one parent having one child and has 1 pending order
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on Item number of any item
Then 'See Full Details' hyperlink should be seen
And Remove/hide star and heart icon should be seen

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_ItemNumber|

@DWCAPCOD-101
@SSO
@Priority2
@Sprint-16.2 
Scenario Outline: Clicking View Full Details link from SOO page:[<UsingData>]

Given teacher connected to one parent having one child and has 1 pending order
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on Item title of any item
When teacher clicks 'See Full Details' hyperlink
Then teacher is navigated to PDP page of corresponding item

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_ViewFullDetailsLink|


@DWCAPCOD-101
@SSO
@Priority2
@Sprint-16.2 
Scenario Outline: Clicking on Student Flyer Orders:[<UsingData>]

Given teacher connected to one parent having one child
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Flyer Orders from Enter Orders option
Then tab title shows Student Flyer Orders

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_StudentFlyerOrdersOption|

@DWCAPCOD-101
@SSO
@Priority2
@Sprint-16.2 
Scenario Outline: Clicking on Your Teacher Order:[<UsingData>]

Given teacher connected to one parent having one child
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Your Teacher Order from Enter Orders option
Then tab title shows Your Teacher Order

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_YourTeacherOrderOption|


@DWCAPCOD-101
@SSO
@Priority2
@Sprint-16.2 
Scenario Outline: Clicking on Review Cart:[<UsingData>]

Given teacher connected to one parent having one child and has 1 pending order
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on Review Cart button
Then teacher is navigated to Review Cart page

Examples:
|UsingData|
|InSprint16.2:PCOD:ParentTeacher_SSO_ReviewCart|


Scenario Outline: Student Online orders page with no orders:[<UsingData>]

Given teacher connected to one parent having one child and has no pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Online Orders from Enter Orders option
Then tab title shows Student Online Orders
And no. of orders does not show in the tab
And page title shows Student Online Orders
And message “There are no Student Online Orders to review. You may continue to your teacher order or go to Checkout.” displays
Examples:
 | UsingData           |
 | Dev35:Teacher_SOO_NOOrders|

