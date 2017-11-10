 Feature: Validation of SCSCOD-7321 scenarios for Sprint 15.3
  This feature is used to validate all scenarios for SCSCOD-7321

  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7321      			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7321
  @Priority1
  @Sprint-15.3
  @SFOPage_FreePickModal
  @Release-BTS2017
  @1
  @SS



  Scenario Outline:Enter Valid coupon code which has expired on SFO coupon modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    When teacher enters Coupon code which has expired in BM
    And teacher clicks on Apply
    Then error message is displayed “This coupon is no longer valid. Please check the coupon for details”

  Examples:
  | UsingData |
  | SFO_CouponModal_Coupon_Expired|




  @SCSCOD-7321
  @Priority1
  @Sprint-15.3
  @SFOPage_FreePickModal
  @Release-BTS2017
  @2

  Scenario Outline: Enter coupon code which does not exist in setup on SFO coupon modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    When teacher enters Coupon code which is not setup in BM
    And teacher clicks on Apply
    Then error message is displayed for Coupon not Setup


    Examples:
      | UsingData |
      | SFO_CouponModal_Coupon_NoSetup|

  @SCSCOD-7321
  @Priority1
  @Sprint-15.3
  @SFOPage_FreePickModal
  @Release-BTS2017
  @3

  Scenario Outline: Enter coupon code which has already been redeemed on SFO coupon modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    When teacher enters Coupon code which has been redeemed
    And teacher clicks on Apply
    Then error message is displayed “Our records indicate that this coupon code has already been redeemed.”

    Examples:
      | UsingData |
      | SFO_CouponModal_Coupon_Reedem|


  @SCSCOD-7321
  @Priority1
  @Sprint-15.3
  @SFOPage_FreePickModal
  @Release-BTS2017
  @4


  Scenario Outline:Error message is displayed when SFO has a freepick and same freepick coupon is again applied :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid coupon code with combination of numbers, characters and -
    And teacher clicks on Apply
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from modal
    And Free Pick selected modal is displayed
    And teacher clicks on Confirm Selection button
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    When teacher enters valid coupon code with combination of numbers, characters and -
    Then error message is displayed for coupon already present in the cart

    Examples:
      | UsingData |
      | SFO_CouponModal_Coupon_Reedem2|
