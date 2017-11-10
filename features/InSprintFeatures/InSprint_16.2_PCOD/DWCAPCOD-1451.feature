Feature: DWCAPCOD-1451
SOO with 2 parents 1 teachers

Background: 
Given Parent opens scholastic reading clubs e-commerce site



Scenario Outline: 2 parents placing an order to 1 teacher:[<UsingData>]

Given 2 different parents place order to the same teacher
And teacher logs in to the application by providing [UserInformation]
When teacher clicks on Student Online Orders from Enter Orders option
Then order is grouped by child1 with correct Item number, title, Flyer, price, quantity
And total for each student's order
And order placed date is displayed below the child1
And order is grouped by child2 with correct Item number, title, Flyer, price, quantity
And total for each student's order
And order placed date is displayed below the child2
And cumulative total, Qty for all Student Online Orders

Examples:
|UsingData|
|InSprint16.2:PCOD:2Parents_1Teacher_2Child_1Order|