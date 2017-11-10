Feature: DWCAPCOD-1998
	Teachers - Checkout - Redemptions & Rewards Page - SOO
	
	
Background: 
	Given teacher open rco-scholastic web site



Scenario Outline: Cart count with pending SOO only orders in teacher's cart:[<UsingData>]

Given 2 parents with one child connected to same teacher places order and teacher has pending orders
When teacher logs in to the application by providing [UserInformation]
Then teacher views the correct count of SOO items in minicart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_ItemCount|

@DWCAPCOD-1786
Scenario Outline: Cart count with SFO + SOO + YTO + Teacher Exclusives:[<UsingData>]

Given teacher has pending parent orders in cart
And teacher logs in to the application by providing [UserInformation]
When teacher adds SFO items
And teacher adds YTO items from YTO by Item# page
And teacher adds Teacher Exclusive items from Quick look
Then correct count of SFO + SOO + YTO + Teacher exclusive items displays in mini cart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOYTOTE_ItemCount|


Scenario Outline: Cart count with SFO + SOO items in cart:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
When teacher adds SFO items
Then correct count of SFO + SOO items displays in mini cart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFO_ItemCount|

Scenario Outline: Cart count with SOO + YTO items in cart:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
When teacher adds YTO items from YTO by flyer page
Then correct count of SOO + YTO items displays in mini cart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOYTO_ItemCount|

Scenario Outline: Cart count with SOO + Teacher exclusives items in cart:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
When teacher adds Teacher Exclusive items from PDP page
Then correct count of SOO + Teacher Exclusives items displays in mini cart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOTE_ItemCount|

Scenario Outline: Cart count with SFO + SOO + YTO items in cart:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
When teacher adds SFO items
And teacher adds YTO items
Then correct count of SFO + SOO + YTO displays in mini cart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOYTO_ItemCount|

Scenario Outline: Cart cout with SFO + SOO + Teacher Exclusives items in cart:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
When teacher adds SFO items
And teacher adds Teacher Exclusive items
Then correct count of SFO + SOO + Teacher Exclusives displays in mini cart

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOTE_ItemCount|

@DWCAPCOD-2161
Scenario Outline: Cart count with zero dollar SFO + Zero dollar SOO freepick items in cart:[<UsingData>]

Given Parent has a child connected to teacher with pending parent freepick only order in cart
And teacher logs in to the application by providing [UserInformation]
When teacher applies SFO coupon 
And teacher adds freepick item from SFO coupon modal
Then correct count of cart displays

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOFreePick_ItemCount|

Scenario Outline: Deleting SOO order updates cart count:[<UsingData>]

Given Parent has a child connected to teacher with pending parent freepick only order in cart
And teacher logs in to the application by providing [UserInformation]
When teacher deletes an SOO order
Then cart count is updated with the deleted order

Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_Delete_ItemCount|
