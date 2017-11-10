Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6790                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher adds single Students Order in SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When  teacher add a valid item and Student Name to Student Flyer Order
    Then teacher sees a grid displaying added items
    And the grid displays Student Name, Item#,Item Title, Flyer, Coupon, Price and Quantity




  Examples:
    | UsingData |
    | SFO_AddItem_1  |


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage


  Scenario Outline: Teacher adds more than one Students Order in SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds multiple item, student name from same Flyer
    Then  Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated


  Examples:
    | UsingData  |
    | SFO_AddItem_2          |


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

   Scenario Outline: Teacher add multiple items- Multiple students and Items from different Flyer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds items for multiple student and items belong to different flyers
    Then Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added


  Examples:
    | UsingData  |
    | SFO_AddItem_3          |

  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher add multiple items with multiple QTY- Multiple students and Items from different Flyer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds items with QTY more than 1 for multiple student and items belong to different flyers
    Then Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added


  Examples:
    | UsingData  |
    | SFO_AddItem_4          |


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher add multiple items to same Student from different Flyer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds items multiple items to same Student from different Flyer
    Then Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added


  Examples:
    | UsingData  |
    | SFO_AddItem_5          |