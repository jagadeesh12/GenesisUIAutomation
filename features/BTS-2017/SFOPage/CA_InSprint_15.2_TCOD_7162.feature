Feature: InSprint_15.2 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7162                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7162
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @1


  Scenario Outline:SFO Free Pick modal closed by X :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    When Free pick modal is closed by X button
    Then Free pick modal closes and SFO page is displayed
    And SFO pages displays error message for coupon
    And the coupon code and Student name is displayed on SFO


    Examples:
      | UsingData |
      | SFO_FreePick_Close_Mssg|


  @SCSCOD-7162
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @2


  Scenario Outline:SFO coupon code hyperlink is clicked  :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    And Free pick modal is closed by X button
    And SFO pages displays coupon code which is hyperlink
    When teacher click on the coupon hyperlink
    Then SFO Coupon Modal is displayed


    Examples:
      | UsingData |
      | SFO_FreePick_couponLink|



