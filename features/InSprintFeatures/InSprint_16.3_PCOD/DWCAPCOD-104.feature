Feature: DWCAPCOD-104
	Parents - Checkout - Teacher Notification Email for a submitted SOO

#@DWCAPCOD-104
#@Parent_TeacherConfirmationEmail
#@Manual
#@Sprint-16.3
#Scenario Outline: Teacher receives confirmation email when parent with 2 children connected to this teacher submits order:[<UsingData>]
#Given Parent with 2 children connected to same teacher
#And parent add items to the cart for both children
#When parent submits order for both the children
#Then teacher receives order confirmation email
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#
#@DWCAPCOD-104
#@Parent_TeacherConfirmationEmail
#@Manual
#@Sprint-16.3
#Scenario Outline: Both teachers receive confirmation email when parent with 2 children connected to 2 different teachers submit order:[<UsingData>]
#Given Parent with 2 children connected to different teacher
#And parent add items to the cart for both children
#When parent submits order for both the children
#Then both the teachers receives order confirmation email
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
