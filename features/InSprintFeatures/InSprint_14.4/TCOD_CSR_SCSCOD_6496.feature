Feature: FreeShipping - Unique Coupon Code
	This feature is to validate All Users – Manual Rewards –  Unique Coupon Code – Free Shipping scenarios

 
Background: 
	Given teacher open rco-scholastic web site 

	
@FreeShipping
@UniqueCouponCode
@Priority1
@SCSCOD-6496
@1
Scenario Outline:Teacher can apply unique free shipping coupon to Student Clubs items:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart below the free shipping
	And teacher navigates to coupons & Rewards page
	When teacher enters free shipping coupon and clicks on apply
	Then free shipping coupon is applied to order
	
Examples:
  | UsingData                            					|
  | TCOD_ManualRewards_UniqueCode_FreeShipping_StudentClubs |	
  

@FreeShipping
@UniqueCouponCode
@Priority1
@SCSCOD-6496
@2
Scenario Outline:Teacher can apply unique free shipping coupon to Student Clubs items2:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart below the free shipping
	And teacher navigates to coupons & Rewards page
	When teacher enters free shipping coupon and clicks on apply
	Then free shipping coupon is applied to order
	
Examples:
  | UsingData                            					|
  | TCOD_ManualRewards_UniqueCode_FreeShipping_StudentClubs |	
  
    