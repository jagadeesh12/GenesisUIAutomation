Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6795                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6795
  @Priority1
  @Sprint-14.5
  @EnterOrderMenu


  Scenario Outline: RCO homepage displays “Student Flyer Orders”,“Your Teacher Order” link when click on “Your Teacher Order”:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher should see the Home Page
    And Home icon, ENTER ORDERS, BOOKS & RESOURCES, ALL FLYERS and TEACHER'S DESK options should be present
    When teacher clicks enter orders
    Then “Student Flyer Orders”,“Your Teacher Order” link should be displayed


  Examples:
    | UsingData |
    | SFO_YTO_MenuDisplayed  |


  @SCSCOD-6795
  @Priority1
  @Sprint-14.5
  @EnterOrderMenu

  Scenario Outline: Teacher click on Student Flyer Order link to display SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher should see the Home Page
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders page is displayed


  Examples:
    |UsingData  |
    |SFO_PageDisplayed           |