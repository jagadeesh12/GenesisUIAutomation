Feature: SSO
	Parent Cart - Expired Items in cart

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

###################################################################################################################################################
###########################################   		    DWCAPCOD-333			     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@ParentCart
@DWCAPCOD-333
@Sprint-16.1
@Manual
Scenario Outline: Parent has items from only expired flyers in cart:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has pending items from expired flyers
When parent navigates to Review cart page
Then message at top of cart "Items in your order require attention." displays
And Expired item is greyed out and unactionable
And Parent sees an item expiry graphic next to the expired item
And Parent sees message on click of graphic "The flyer this item was offered in has expired. The item will not be submitted as part of your order and you will not be charged."
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint16.1:PCOD:Parent_Expired_InCart|

@ParentCart
@DWCAPCOD-333
@Sprint-16.1
@Manual
Scenario Outline: Parent has items from both expired and non-expired flyers in cart:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has pending items from expired and non-expired flyers
When parent navigates to Review cart page
Then message at top of cart "Items in your order require attention." displays
And only expired items are greyed out and unactionable
And has item expiry graphic next to the expired item
And non-expired items are not greyed out and can be updated or modified
And continue checkout button is disabled until the expired items are deleted

Examples:
|UsingData|
|InSprint16.1:PCOD:Parent_Expired_NonExpired_InCart|

@ParentCart
@DWCAPCOD-333
@Sprint-16.1
@Manual
Scenario Outline: Parent has expired freepick item in cart:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has pending items from expired flyers
When parent navigates to Review cart page
Then message at top of cart "Items in your order require attention." displays
And both paid and free expired items are greyed out and unactionable
And has item expiry graphic next to the expired item
And non-expired items are not greyed out and can be updated or modified
And continue checkout button is disabled until the expired items are deleted

Examples:
|UsingData|
|InSprint16.1:PCOD:Parent_ExpiredFreepick_InCart|

@ParentCart
@DWCAPCOD-333
@Sprint-16.1
@Manual
Scenario Outline: Parent can succesfully checkout after deleting the expired items from the cart:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has pending items from expired and non-expired flyers
And parent navigates to Review cart page
When parent deletes all the expired items from the cart
Then Continue checkout button is enabled
And parent is able to sucesfully submit the order with items from active flyers

Examples:
|UsingData|
|InSprint16.1:PCOD:Parent_Delete_ExpiredFreepick_InCart|