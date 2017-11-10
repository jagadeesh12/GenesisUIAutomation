Feature: InSprint_15.1 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7159                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @1


  Scenario Outline: Teacher Apply Free Pick Coupon on SFO modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved

  Examples:
    | UsingData |
    | SFO_FREEPICK_Applied |

  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @2


  Scenario Outline: When FreePick coupon is applied Coupon code field is deactivated:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved
    And Coupon Code field is deactivated



  Examples:
    | UsingData |
    | SFO_CouponModal_Couponfield_Inactive |


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @3


  Scenario Outline: When FreePick coupon is applied Student Name remains active:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved
    And Student Name field remains active


  Examples:
    | UsingData |
      | SFO_CouponModal__StudentName_Active |


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017



  Scenario Outline:Teacher applies coupon and call out message is displayed on the modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved
    And Coupon call out message is displayed


  Examples:
    | UsingData |
    | SFO_CouponModal__CallOut_Message |

  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @5


  Scenario Outline:Teacher can search for free pick item by ItemID :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And SFO Coupon Modal is displayed
    And Apply button changes to Saved
    When teacher searches for a [qualifying Item number]
    Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
    And teacher selects an item from the results
    And Free Pick selected modal is displayed


  Examples:
    | UsingData |
    | SFO_CouponModal__FreePick_ItemIdSearch |


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @6


  Scenario Outline:Teacher can search for free pick item by ItemName :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And SFO Coupon Modal is displayed
    And Apply button changes to Saved
    When teacher searches for a [qualifying Item name]
    Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
    And teacher selects an item from the results
    And Free Pick selected modal is displayed


  Examples:
    | UsingData |
    | SFO_CouponModal__FreePick_ItemName |


