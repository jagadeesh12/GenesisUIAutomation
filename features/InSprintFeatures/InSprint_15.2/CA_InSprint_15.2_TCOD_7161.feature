Feature: InSprint_15.2 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7161                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7161
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017



  Scenario Outline:SFO page displays free pick item:[<UsingData>]

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
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from the results
    When teacher clicks on Confirm Selection button
    Then Student Flyer Orders modal is dispalyed
    And the freepick item is displayed with Student Name,item Title, Item Flyer,Coupon Code.Price as FREE and QTY is displayed



    Examples:
      | UsingData |
      | SFO_FreePick_Grade |


  @SCSCOD-7161
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @2
  @Manual


  Scenario Outline:SFO display mini PDP for added Free Item for 2 Sec:[<UsingData>]

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
    And teacher clicks on grade level dropdown and select a grade from dropdown
    When teacher selects an item from the results
    Then the mini PDP for added item is displayed for 2 seconds
    And the mini PDP auto hides
    And the freepick item is displayed with Student Name,item Title, Item Flyer,Coupon Code.Price as FREE and QTY is displayed



    Examples:
      | UsingData |
      | SFO_FreePick_Grade1 |