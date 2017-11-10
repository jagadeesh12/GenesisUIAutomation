@stackablenow
Feature: StackableCoupons
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#################################################################################################################################
#################################################################################################################################
#########################################                                      #################################################  
#########################################		STACKABLE COUPONS              ##################################################
##################################################################################################################################
##################################################################################################################################		
	
@Golden
@StackableCoupons
@Priority1
Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied non-stackable coupon:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher applies [stackable coupon]
When teacher tries to apply [Non-Stackable coupon]
Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
Examples:
  | UsingData                               |
  | QA:Teacher_StackableandNonstackableCoupons |
  
  
  
  
@StackableCoupons
@Priority1
Scenario Outline:Teacher trying to apply a non-stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher applies [Non-Stackable coupon]
When teacher tries to apply [stackable coupon]
Then error message "The coupon code you are trying to apply cannot be combined with any other coupons. To use this coupon code, please remove the other coupon(s) you have already applied and try again." display
Examples:
  | UsingData                               |
  | QA:Teacher_NonstackableandStackableCoupons |
  
  
  
@StackableCoupons
@Priority1 
Scenario Outline:Teacher trying to apply a non-stackable coupon to a basket with a previously applied non-stackable coupon:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
And teacher applies [Non-Stackable coupon]
When teacher tries to apply another [non-stackable coupon]
Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
Examples:
  | UsingData                               |
  | QA:Teacher_NonstackableandNonStackableCoupons |
  
  
  
  
@Golden
@StackableCoupons
@Priority1
Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to cart with [minumum amount]
And teacher navigates to [Review Cart] page
When teacher navigates to [Redemptions & Rewards] page
When teacher applies [stackable coupon]
Then teacher should be able to apply another [stackable coupon] successfully
Examples:
  | UsingData                               |
  | QA:Teacher_stackableandStackableCoupons |