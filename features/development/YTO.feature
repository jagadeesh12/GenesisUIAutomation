Feature: Rewards and Coupons
	This feature is used to check the "YTO" scenario validation

 
Background: 
	Given teacher open rco-scholastic web site 


@YTO
@Priority1
Scenario Outline:Teacher has the ability to click - to remove items from cart on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	When teacher clicks on '-' in YTO page
	Then the item quantity is decreased by 1 in YTO page
	When Teacher navigates to Review Your Cart page
	Then the item quantiy is decreased by 1 in Review Your Cart page
	
Examples:
  | UsingData      		|
  | BTS:YTO:Teacher_Login_5 |
  
  
  
@YTO
@Priority1
Scenario Outline:Teacher has the ability to click + to add items to cart on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	When teacher clicks on '+' in YTO page
	Then the item quantity is increased by 1 in YTO page
	When Teacher navigates to Review Your Cart page
	Then the item quantiy is increased by 1 in Review Your Cart page
	
Examples:
  | UsingData      		|
  | BTS:YTO:Teacher_Login_6 |  
  
  
  
@YTO
@Priority1
Scenario Outline:Teacher can save the student name by entering name and clicking Enter:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher enters the student name and hits ENTER
	Then entered name is displayed in Student name field
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_7 | 
  
  
########################### Priority 3 #############################

@YTO
@Priority3
Scenario Outline:Teacher can get back to the same flyer and month which she was shopping on when clicks on browser back:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on any item title
	And Teacher clicks on See Full details link
	And Teacher clicks on browser back from PDP page
	Then Teacher lands on YTO on same flyer and month where she came from
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_8 |  
  
  
@YTO
@Priority3
Scenario Outline:Teacher can get back to same flyer and month which she was shopping for when she comes back from search results page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher searches for any term
	And Teacher clicks navigates back to YTO
	Then Teacher lands on YTO on same flyer and month where she came from
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_9 |
    

    
@YTO
@Priority3
Scenario Outline:Teacher should land on default flyer on YTO when selects a specific flyer and month and logout and login:[<UsingData>]
  
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on Logout
	And teacher logs into the application by providing [UserInformation]
	When Teacher navigates to YTO
	Then Teacher lands on YTO on default flyer current month
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_10 | 
  
