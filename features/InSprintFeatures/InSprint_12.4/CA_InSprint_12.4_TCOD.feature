Feature: InSprint_12.4
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site
	
@RewardsAndCoupons	
@Manual-FreeShipping
@Priority1
Scenario Outline:Teacher applies Free shipping coupon and adds more items to cart making the cart qualifying for automatic free promotion:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher adds student club items to cart qualifying for [Manual Free shipping coupon]
And teacher navigates to coupons & Rewards page
And teacher does not receive free Shipping
And teacher applies [Free Shipping Coupon]
And teacher receives FREE shipping
And teacher navigates to Review Your cart page from Coupons & Rewards page
When teacher adds more items to cart meeting the [shipping threshold]
And teacher navigates to coupons & Rewards page
Then the FREE shipping coupon is automatically removed
And teacher receives FREE shipping
And teacher proceeds to checkout from coupons & rewards page and submit the order
And teacher is able to apply the free shipping coupon in next order

Examples:
  | UsingData                          	  	                           |
  | InSprint_12.4:Dev35:Teacher_RemovesShippingCoupon_UseInAnotherOrder|
	







      
  