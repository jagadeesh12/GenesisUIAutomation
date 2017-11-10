Feature: InSprint_15.2 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################                              #############################################################
###########################################           SCSCOD-6794
###########################################
###########################################                              #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6794
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @1




  Scenario Outline: Teacher click on ? on SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher clicks on ?
    Then Teacher is presented with a pop-up modal
    And the modal displays the Message
    And “Learn More” hyperlink is displayed



    Examples:
      | UsingData |
      | SFO_Student Name Mssg|


  @SCSCOD-6794
  @Priority1
  @Sprint-15.2
  @SFOPage
  @2
  @Release-BTS2017
  @Manual




  Scenario Outline: SFO page Enter student name message is content assest:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher clicks on ?
    Then Teacher is presented with a pop-up modal
    And the message is a content assest
    And the message is updated and the updated message is displayed in the pop-up



    Examples:
      | UsingData |
      | SFO_Student Name MssgContent|



  @SCSCOD-6794
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @3





  Scenario Outline: SFO page Enter student name message close:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher clicks on ?
    And Teacher is presented with a pop-up modal
    #And the message is a content assest
    When teacher clicks on ?
    Then the pop-up modal is closed



    Examples:
      | UsingData |
      | SFO_Student Name Mssg1|