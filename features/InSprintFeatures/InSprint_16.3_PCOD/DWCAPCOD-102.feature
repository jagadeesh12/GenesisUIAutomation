Feature: DWCAPCOD-102
	Teachers - Enter Orders - Deleting Student Online Order from SOO Page

Background: 
	Given Parent opens scholastic reading clubs e-commerce site


@Priority1
@Parent_TeacherCart
@DWCAPCOD-102
@Sprint-16.3
@1
Scenario Outline: Teacher clicks on (X)delete button for a student online order:[<UsingData>]
Given teacher has pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on (X) next to the child order
Then teacher is presented with a new modal Message “Are You Sure You Want To Permanently Delete This Order?”
And Modal sub-message – “This order will be permanently deleted, and we will inform <CHILD NAME >’s parent the order has been cancelled and the credit card wil not be charged.”
And Modal question 2 – “Please tell us why you’re deleting this order:” displays
And Teacher is presented with 3 selectable options:“This isn’t my student.”, “This order is incorrect – the parent asked me to delete it.”, “Other”
And “DO NOT DELETE” button in active state displays
And “Delete” button displays in inactive state
Examples:
	|UsingData|
	|Dev35:PCOD:SOO_DeleteItems_ModalWindow|
	
@Priority1
@Parent_TeacherCart
@DWCAPCOD-102
@Sprint-16.3
@2
Scenario Outline: Teacher clicks on Do not delete button for a student online order:[<UsingData>]
Given teacher has pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on (X) next to the child order
And teacher selects a reason for deleting an order
And teacher clicks on “Do Not Delete”
Then Delete modal is closed
And the child order is not deleted
Examples:
	|UsingData|
	|Dev35:PCOD:SOO_DeleteItems_No|

@Priority1
@Parent_TeacherCart
@DWCAPCOD-102
@Sprint-16.3
@3
Scenario Outline: Teacher clicks on Delete button for a student online order:[<UsingData>]
Given teacher has pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher clicks on Student Online Orders from Enter Orders option
When teacher clicks on (X) next to the child order
And teacher selects a reason for deleting an order
And teacher clicks on “Delete”
Then the child order is deleted
Examples:
	|UsingData|
	|Dev35:PCOD:SOO_DeleteItems|