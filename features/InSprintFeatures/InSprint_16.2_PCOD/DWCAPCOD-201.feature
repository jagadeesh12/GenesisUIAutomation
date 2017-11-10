Feature: DWCAPCOD-201
	Parents - Cart - Connect Child to Teacher from Shopping Cart
	
	
Background: 
	Given Parent opens scholastic reading clubs e-commerce site	

@DWCAPCOD-201
@ReviewCart
@Priority1
@Sprint-16.2 
Scenario Outline:Parent connects child to teacher from Review Cart:[<UsingData>]

Given Parent login in with valid [username] and [password] and empties cart
And parent add items to cart and navigate to shopping cart
When parent selects child not connected to teacher from child dropdown
And parent clicks on Find Your Teacher
And parent selects a teacher
And parent clicks on Save on the "Connect to Teacher" modal
Then <ChildFirstName LastName> displays in child dropdown
And <ChildFirstName> in <TeacherName>'s class displays in child dropdown on Home page
And <ChildFirstName> in <TeacherName>'s class displays in My Children section in My Account page
And all children are removed from account
Examples:
|UsingData|
|InSprint16.2:PCOD:ReviewCart_ChildNotConnected|