Feature: InSprint_15.2 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################                              #############################################################
###########################################           SCSCOD-6791
###########################################
###########################################   manual                      #############################################################
##################################################################################################################################################
##################################################################################################################################################


#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @1
#  @Release-BTS2017
#  @Manual
#
#
#
#  Scenario Outline: Teacher sort Student Name and Item# in SFO page:[<UsingData>]
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple Student name and ItemNo from different flyer
#    And SFO modal displays added items
#    And the student name is displayed in the order of addition
#    When teacher use sort option on Student Name
#    Then the student name should be sorted from A-Z
#    And when again sort option is used for student name
#    And student name will be sorted in order Z-A
#
#
#    Examples:
#      | UsingData |
#      | SFO_Student Name Sort |
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @2
#  @Release-BTS2017
#  @Manual
#
#  Scenario Outline: Teacher use sort on Student Name having multiple item# in SFO page:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple Item to same student
#    And SFO modal displays added items
#    When teacher use sort option on Student Name
#    Then the display of student name order should not change
#    And when again sort option is used for student name
#    And there is no change in the order of display
#
#
#    Examples:
#      | UsingData |
#      | SFO_Student Name Sort2 |
#
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @Release-BTS2017
#  @3
#  @Manual
#
#  Scenario Outline: Teacher sort on Item#, multiple Students are added :[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple items for diffent students
#    And SFO modal displays added items
#    When teacher use sort option on Item#
#    Then the items are sorted and the student name order changes according the item#
#    And when again sort option is used on Item#
#    And the item# sort is updated and this updates the display of Student name as well
#
#
#    Examples:
#      | UsingData |
#      | SFO_ItemNo Sort1 |
#
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @4
#  @Release-BTS2017
#  @Manual
#
#  Scenario Outline: Teacher sort on Item#, SFO has same student name:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple items for same student
#    And SFO modal displays added items
#    When teacher use sort option on Item#
#    Then the items are sorted by Item#
#    And when again sort option is used on Item#
#    And the item# sort is updated
#
#
#    Examples:
#      | UsingData |
#      | SFO_ItemNo Sort2 |
#
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @5
#  @Release-BTS2017
#  @Manual
#
#  Scenario Outline: Teacher sort on Item#, SFO has same item# added to different student:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds different student name and same Item# for all students
#    And SFO modal displays added items
#    When teacher use sort option on Item#
#    Then there is not change in the display on SFO
#    And when again sort option is used on Item#
#    And there is not change in the display on SFO
#    And teacher sorts on Student name
#    And the SFO is sorted by Student name
#
#
#    Examples:
#      | UsingData |
#      | SFO_ItemNo Sort3 |
#
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @6
#  @Release-BTS2017
#  @Manual
#
#  Scenario Outline: Teacher delete added item in SFO:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple Student name and ItemNo from different flyer
#    And SFO modal displays added items
#    When teacher click delete icon for an item
#    And confirm delete popup is displayed
#    And teacher click Yes
#    Then item should be deleted from SFO
#
#
#    Examples:
#      | UsingData |
#      | SFO_ItemNo_Delete |
#
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @7
#  @Release-BTS2017
#  @Manual
#
#  Scenario Outline: On Delete QTY pop-up teacher click No:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple Student name and ItemNo from different flyer
#    And SFO modal displays added items
#    When teacher click delete icon for an item
#    And confirm delete popup is displayed
#    And teacher click NO
#    Then item should not be deleted from SFO
#
#
#    Examples:
#      | UsingData |
#      | SFO_ItemNo_Delete2 |
#
#
#  @SCSCOD-6791
#  @Priority1
#  @Sprint-15.2
#  @SFOPage
#  @8
#  @Release-BTS2017
#  @Manual
#
#  Scenario Outline: Teacher update the quantity for the added item in SFO:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher adds multiple Student name and ItemNo from different flyer
#    And SFO modal displays added items
#    When teacher updates the QTY field
#    Then the QTY field is updated with the newly entered number
#    And  the cart icon is updated and the new value is equal is the newly entered number
#    And  the Price field in the SFO grid should remain same
#
#
#    Examples:
#      | UsingData |
#      | SFO_Item_QTY|










