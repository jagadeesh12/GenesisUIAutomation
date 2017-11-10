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

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And teacher applies [stackable coupon]
    When teacher tries to apply [Non-Stackable coupon]
    Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
  Examples:
    | UsingData                               |
    | Golden:Teacher_StackableandNonstackableCoupons |




  @StackableCoupons
  @Priority1
  Scenario Outline:Teacher trying to apply a non-stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And teacher applies [Non-Stackable coupon]
    When teacher tries to apply [stackable coupon]
    Then error message "The coupon code you are trying to apply cannot be combined with any other coupons. To use this coupon code, please remove the other coupon(s) you have already applied and try again." display
  Examples:
    | UsingData                               |
    | BTS:Teacher_NonstackableandStackableCoupons |



  @StackableCoupons
  @Priority1
  Scenario Outline:Teacher trying to apply a non-stackable coupon to a basket with a previously applied non-stackable coupon:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And teacher applies [Non-Stackable coupon]
    When teacher tries to apply another [non-stackable coupon]
    Then error message "The coupon code you have already applied cannot be combined with any other coupons. To use a different coupon code, please remove the code you have already entered and try again." displays
  Examples:
    | UsingData                               |
    | BTS:Teacher_NonstackableandNonStackableCoupons |




  @Golden
  @StackableCoupons
  @Priority1
  Scenario Outline:Teacher trying to apply a stackable coupon to a basket with a previously applied stackable coupon:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    When teacher applies [stackable coupon]
    Then teacher should be able to apply another [stackable coupon] successfully
  Examples:
    | UsingData                               |
    | Golden:Teacher_stackableandStackableCoupons |