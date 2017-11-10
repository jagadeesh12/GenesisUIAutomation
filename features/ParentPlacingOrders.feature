Feature: Parents placing orders
	This feature is used to place orders from parents
 
Background: 
	Given Parent opens scholastic reading clubs e-commerce site 
	
########################## Teacher Checkout Test Case ################################ 



Scenario Outline: Parent with one child submit order to teacher:[<UsingData>]

Given teacher connected to one parent and having one child placing 1 order

Examples:
|UsingData|
|PCOD:ParentTeacher_1Child_Order|


Scenario Outline: Parent with 2 childs submit 1 order to teacher:[<UsingData>]

Given teacher connected to one parent and having 2 childs placing 1 order

Examples:
|UsingData|
|PCOD:ParentTeacher_2Childs_1Order|



Scenario Outline: 1 Parent with 2 childs submit 2 orders to 1 teacher:[<UsingData>]

Given teacher connected to 1 parent and having 2 childs placing 2 orders

Examples:
|UsingData|
|PCOD:1Teacher_1Parent_2Childs_2Order|



Scenario Outline: 2 Parent with 2 childs submit 1 order to 1 teacher:[<UsingData>]

Given teacher connected to 2 parents and having 2 childs placing 1 order

Examples:
|UsingData|
|PCOD:1Teacher_2Parent_2Childs_1Order|