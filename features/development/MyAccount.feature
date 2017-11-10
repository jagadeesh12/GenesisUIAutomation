Feature: Rewards and Coupons
	This feature is used to check the "MyAccount" page scenarios validation

 
Background: 
	Given teacher open rco-scholastic web site 

	
@MyAccount
@Priority3
@1
Scenario Outline:Teacher clicks on My Account link to navigate to My Reading club account page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account link
	Then teacher navigates to My Reading Club account page
	
Examples:
  | UsingData               |
  | MyAccount:Teacher_Login |	
  

