Feature: DWCAPCOD-1452
SSO with 2 teachers

Background: 
Given Parent opens scholastic reading clubs e-commerce site

Scenario Outline: Parent with 2 children and order going to 2 teachers:[<UsingData>]

Given Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 clicks on Student Online Orders from Enter Orders option
Then order for teacher1 is grouped by child1 with correct Item number, title, Flyer, price, quantity
And subtotal, tax total, and total for each student’s order
And cumulative total for all Student Online Orders
And order placed date is displayed below the child1
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 clicks on Student Online Orders from Enter Orders option
And order for teacher2 is grouped by child2 with correct Item number, title, Flyer, price, quantity
And subtotal, tax total, and total for each student’s order
And cumulative total for all Student Online Orders
And order placed date is displayed below the child2

Examples:
|UsingData|
|InSprint16.2:PCOD:Parent_Multiple_Teachers_2Childs_1Order|


Scenario Outline: Parent with 2 children, places order only for child1 and order going to teacher1:[<UsingData>]

Given Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 clicks on Student Online Orders from Enter Orders option
Then order is grouped by child1 with correct Item number, title, Flyer, price, quantity
And subtotal, tax total, and total for each student’s order
And cumulative total for all Student Online Orders
And order placed date is displayed below the child1
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 clicks on Student Online Orders from Enter Orders option
And message “There are no Student Online Orders to review. You may continue to your teacher order or go to Checkout.” displays

Examples:
|UsingData|
|InSprint16.2:PCOD:Parent_Multiple_Teachers_2Childs_1OrderChild1|


Scenario Outline: Parent with 2 children and 2 orders going to 2 teachers:[<UsingData>]

Given Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 clicks on Student Online Orders from Enter Orders option
Then order for teacher1 submitted recently should appear on top and grouped by child1 with correct Item information and totals
And order placed date displays below the child1 for recent order
And order submitted first should appear at bottom and grouped by child1 with correct Item information and totals
And order placed date displays below the child1 for first order
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 clicks on Student Online Orders from Enter Orders option
Then order for teacher2 submitted recently should appear on top and grouped by child2 with correct Item information and totals
And order placed date displays below the child2 for recent order
And order submitted first should appear at bottom and grouped by child2 with correct Item information and totals
And order placed date displays below the child2 for first order

Examples:
|UsingData|
|InSprint16.2:PCOD:Parent_Multiple_Teachers_2Childs_2Orders|

#Scenario Outline: Parent with 3 children and order going to 2 teachers:[<UsingData>]
#
#Given Parent having 3 childs, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 clicks on Student Online Orders from Enter Orders option
#Then order is grouped by child1 with correct Item information and totals
#And order placed date displays below the child1
#And order is grouped by child2 with correct Item information and totals
#And order placed date displays below the child2
#And teacher2 also logs into the application by providing [UserInformation]
#And teacher2 clicks on Student Online Orders from Enter Orders option
#And order is grouped by child3 with correct Item information and totals
#And order placed date displays below the child3
#
#Examples:
#|UsingData|
#|InSprint16.1:PCOD:Parent_Multiple_Teachers_3Childs_1Order|
#
#
#
#Scenario Outline: Parent with 3 children and 2 orders going to 2 teachers:[<UsingData>]
#
#Given Parent having 3 childs, child1 and child2 related to teacher1 and child3 related to teacher2 and has 2 pending orders
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 clicks on Student Online Orders from Enter Orders option
#Then order submitted recently should appear on top and grouped by child1 and child2 with correct Item information and totals
#And order placed date displays below the child1 and child2 for recent order
#And order submitted first should appear at bottom and grouped by child1 and child2 with correct Item information and totals
#And order placed date displays below the child1 and child2 for recent order
#And teacher2 also logs into the application by providing [UserInformation]
#And teacher2 clicks on Student Online Orders from Enter Orders option
#Then order submitted recently should appear on top and grouped by child3 with correct Item information and totals
#And order placed date displays below the child3 for recent order
#And order submitted first should appear at bottom and grouped by child3 with correct Item information and totals
#And order placed date displays below the child3 for first order
#
#Examples:
#|UsingData|
#|InSprint16.1:PCOD:Parent_Multiple_Teachers_3Childs_2Orders|




#MANUAL SCENARIOS
#Scenario Outline: Student Online Orders UI with no orders
#
#Given Parent having one child connected to 2 teachers and has no orders placed 
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 clicks on Student Online Orders from Enter Orders option
#Then Student Online Order page is displayed as 1 of 3 tabs (Student Flyer Orders, Student Online Orders, and Your Teacher Order)
#And Student Online Orders tab is displayed between the SFO and YTO
#And page/tab title shows Student Online Orders
#And Tab bar shows number of pending orders placed by parents online in brackets at top next to tab title
#And Page message when no SOO order present is “There are no Student Online Orders to review. Help parents place orders online by sharing your Class Code.”
#
#
#Scenario Outline: Student Online Orders UI with pending orders
#
#Given Parent having one child connected to 2 teachers and has pending orders 
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 clicks on Student Online Orders from Enter Orders option
#Then Student Online Order page is displayed as 1 of 3 tabs (Student Flyer Orders, Student Online Orders, and Your Teacher Order)
#And Student Online Orders tab is displayed between the SFO and YTO
#And page/tab title shows Student Online Orders
#And Tab bar shows number of pending orders placed by parents online in brackets at top next to tab title
#And Page message when SOO orders are present is “Review the Student Online Order prior to submission. Once orders are placed, students can get their books and you'll receive your rewards and Bonus Points!”
#And Orders placed online by Parents are ordered based on submitted date (most recent to oldest)
#And order is grouped by correct child name
#And the items for that child displays with correct Item#, title, Flyer, price, quantity 
#And order placed date displays below the childs



