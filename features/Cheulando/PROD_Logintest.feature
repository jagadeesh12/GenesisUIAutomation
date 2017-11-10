Feature: Login and Logout
	Test the logging in and logging out of PROD
	
Background:
	Given teacher open rco-scholastic web site
	
#Scenario Outline: Login, verify the search bar is displayed then logout:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher lands on login page
#Then teacher sees search bar
#When Teacher clicks on Logout
#Then teacher sees login screen
#Examples:
#	|UsingData|
#	|PROD:Login:Logout:SearchBar|
	
#Scenario Outline: Generate Data:[<UsingData>]
#	And data creation function is called
#Examples:
#|UsingData|
#||

#Scenario Outline: YTO checkout with mixed cart:[<UsingData>] 
#
#Given teacher logs in to the application by providing [UserInformation]
#And teacher navigates to YTO page
#And teacher adds YTO items to the cart
#And teacher navigates to [Review Cart] page
#And teacher navigates to [Redemptions & Rewards] page
#And teacher navigates to the [Payments] page
#When teacher navigates to [Confirm & Submit] page
#And teacher submits the order and adds submitted SOO order in Excel
#Examples:
#|UsingData|
#|BVTDev35:Test:Adds_YTO_Items_MultipleItemsFlyers|

Scenario Outline: Redo submitted and deleted orders:[<UsingData>] 

Given parents login, add items and submit orders on the PCOD site

Examples:
|UsingData|
||