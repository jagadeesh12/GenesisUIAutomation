Feature: InSprint_15.1 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6789                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @1



  Scenario Outline: SFO modal displays tab SFO and YTO tab:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And Student Flyer Orders tab should be displayed
    And Your Teacher Order tab should also be displayed

  Examples:
    | UsingData |
    | SFO_PageDisplay_Tab |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @2


  Scenario Outline: SFO modal display:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And Student Flyer Orders tab should be displayed
    And the title is displyed as “Student Flyer Orders”
    And the following message is displayed

  Examples:
    | UsingData |
    | SFO_PageDisplay_title |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @3


  Scenario Outline: SFO modal displays Data fields:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    And ADD button is not enabled


  Examples:
    | UsingData |
    | SFO_Page_2Labels |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @4


  Scenario Outline: SFO Item# validation rules:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    When Valid ItemNo is entered less than 7 characters with valid student name
    Then Add button is enabled and teacher clicks on Add
    And no error message is displayed


  Examples:
    | UsingData |
    | SFO_Page_Item#Validation |

  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @5

  Scenario Outline: SFO Item#7 validation rules:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    When Valid ItemNo is entered as 7 characters with valid student name
    Then Add button is enabled and teacher clicks on Add
    And no error message is displayed


  Examples:
    | UsingData |
    | SFO_Page_Item#Validation_equal7 |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @6

  Scenario Outline: SFO Item# special character validation rules:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    When teacher enters ItemNo with special character
    Then error message should be displayed “Please enter a valid item number.”


  Examples:
    | UsingData |
    | SFO_Page_Item#Validation_specialCharacter |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @7

  Scenario Outline: SFO form Add button should be disabled with Item blank:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And ADD button is not enabled when Item# is blank and Student Name is present

  Examples:
    | UsingData |
    | SFO_Page_ADDButton1 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @8

  Scenario Outline:SFO form Add button should be disabled with Student name blank:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And ADD button is not enabled when Item# is entered and Student name is blank

  Examples:
    | UsingData |
    | SFO_Page_ADDButton2 |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @9

  Scenario Outline:SFO form Valid ItemNo and Student Name entered:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Item# and Student name is entered
    And teacher clicks on Add button
    And Student Flyer Order page displays ItemNo and Student Name

  Examples:
    | UsingData |
    | SFO_Page_Item_Added |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @10
  Scenario Outline:SFO form error message:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Invalid Item# and Student name is entered
    When teacher clicks on Add button
    Then error message is displayed


  Examples:
    | UsingData |
    | SFO_Page_Item_Added1 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @11

  Scenario Outline:SFO form Student Name alphanumeric with special character Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher enter the student name with special character
    Then error messsage is displayed “Please enter a valid Student Name.”



  Examples:
    | UsingData |
    | SFO_Page_Item_Name3 |




  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @12

  Scenario Outline:SFO form Student Name Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When Item# is entered and Student name entered is alphanumeric equal 20 Character
    Then teacher clicks on Add button
    And SFO page is populated with Student name and ItemNo


  Examples:
    | UsingData |
    | SFO_Page_Item_Added2 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @13

  Scenario Outline:SFO form Student Name Numeric Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When Item# is entered and Student name entered is Numeric only equal 20 Character
    Then teacher clicks on Add button
    And SFO page is populated with Student name and ItemNo


  Examples:
    | UsingData |
    | SFO_Page_Item_Name1 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @14

  Scenario Outline:SFO form Student Name alphabets Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When Item# is entered and Student name entered is all alphabets only equal 20 Character
    Then teacher clicks on Add button
    And SFO page is populated with Student name and ItemNo


  Examples:
    | UsingData |
    | SFO_Page_Item_Name2 |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @15


  Scenario Outline:SFO form Student Name alphanumeric with special character Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher enter the student name with special character
    Then error messsage is displayed “Please enter a valid Student Name.”



  Examples:
    | UsingData |
    | SFO_Page_Item_Name3 |














