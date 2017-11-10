Feature: DWCAPCOD-1921
	Parent - Sitewide - Suppress Teacher Resources Products in Parent Site - Demandware updates
	
	
Background: 
	Given Parent opens scholastic reading clubs e-commerce site	

#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher resource items cannot be found in results on SFO freepick modal:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page
#And teacher applies free pick coupon
#When teacher searches for teacher resource item on SFO freepick modal
#Then no results should display
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher can search for a keyword from classroom titles:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher searches for a keyword matching classroom title items
#Then teacher views results for the items
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher resource items cannot be found on grade level results on SFO freepick modal:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page
#And teacher applies free pick coupon
#When teacher clicks on grade from grade level dropdown
#Then teacher resource items are not shown in the results
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher can search with unique item# for classroom titles:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher searches for "Item#" of classroom title item
#Then teacher is redirected to PDP page of that item
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher can search for keyword from teacher resources items:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher searches for a keyword matching teacher resources items
#Then teacher views results for the items
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher can search with unique item# for teacher resource titles:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher searches for "Item#" of teacher resource item
#Then teacher is redirected to PDP page of that item
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher cannot add teacher resources items from SFO:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page
#When teacher adds teacher resource item for a student
#Then error message displays
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher can view teacher resources and classroom titles on YTO by Flyer page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher navigates to YTO by Flyer page
#Then teacher views both teacher resource and classroom title items as part of every grade / saleslist
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Priority1
#@Sprint-16.3 
#Scenario Outline: Teacher can add teacher resource and classroom title items on YTO by Item# page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher navigates to YTO by Item# page
#And teacher adds teacher resource item
#And teacher adds classroom title item
#Then teacher successfully adds both these items to cart
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|

#@DWCAPCOD-1921
#@SuppressTeacherProducts
#@Manual
#@Sprint-16.3 
#Scenario: Teacher resource items cannot be searched on SFO freepick modal:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page
#And teacher applies free pick coupon
#When teacher searches for teacher resource item on SFO freepick modal
#Then no results should display