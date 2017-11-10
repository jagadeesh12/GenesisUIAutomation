
Feature: InSprint_15.2 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7160                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7160
  @Priority1
  @Sprint-15.2
  @SFOPage_FreePickModal
  @Release-BTS2017
  @1


  Scenario Outline:SFO Coupon modal displays free pick item:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then Free pick modal displays
    And teacher clicks on grade level dropdown and select a grade from dropdown
    Then items less than or equal to the [coupon amount] displays in Manual Free Pick model


  Examples:
    | UsingData |
    | SFO_FreePick_Grade |



  @SCSCOD-7160
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @2

  Scenario Outline:SFO Teacher selects an item by searching for a qualifying item on Free pick modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    When teacher searches for a [qualifying Item number]
    Then item displays in results in Free Pick model
    And teacher selects an item from the results
    And selected item displays in Current Selection section for Freepick
    And teacher clicks on Confirm Selection button


  Examples:
    | UsingData |
    | SFO_FreePick_Search |


#  @SCSCOD-7160
#  @Priority1
#  @Sprint-15.1
#  @SFOPage_FreePickModal
#  @3
# @Release-BTS2017
#  @Manual
#
#
#  Scenario Outline:SFO Free Pick modal sorting the results:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher click on link “Apply a coupon for this student”
#    And SFO Coupon Modal is displayed
#    And teacher enters valid Student Name
#    And teacher enters valid Coupon code
#    And teacher click on Apply
#    And Free pick modal displays
#    When teacher clicks on grade level dropdown and select a grade from dropdown
#    Then the items displayed in Free pick modal is sorted on Price high to low
#    And teacher click on price header on the modal
#    And items are sorted by price
#
#
#  Examples:
#    | UsingData |
#    | SFO_FreePick_Sort |
#
#
#
#  @SCSCOD-7160
#  @Priority1
#  @Sprint-15.1
#  @SFOPage_FreePickModal
#  @4
#  @Release-BTS2017
#  @Manual
#
#
#  Scenario Outline:SFO Free Pick Confrim modal :[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher click on link “Apply a coupon for this student”
#    And SFO Coupon Modal is displayed
#    And teacher enters valid Student Name
#    And teacher enters valid Coupon code
#    And teacher click on Apply
#    And Free pick modal displays
#    When teacher selects an item from modal
#    Then Free Pick selected modal is displayed
#    And the selected freeItem is displayed
#    And the title of the modal is “Your Current Selection”
#    And the modal displays a grid with header as Item#,Title,Flyer,Price,Select
#    And the button “CANCEL”,“CONFIRM & APPLY” is displayed
#    And the “CONFIRM & APPLY” button is enabled by default
#
#
#
#  Examples:
#    | UsingData |
#    | SFO_FreePick_SelectModalVal |
#

#  @SCSCOD-7160
#  @Priority1
#  @Sprint-15.1
#  @SFOPage_FreePickModal
#  @5
#  @Release-BTS2017
#  @Manual
#
#
#  Scenario Outline:SFO Free Pick modal teacher edits free item:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher click on link “Apply a coupon for this student”
#    And SFO Coupon Modal is displayed
#    And teacher enters valid Student Name
#    And teacher enters valid Coupon code
#    And teacher click on Apply
#    And Free pick modal displays
#    And teacher selects an item from modal
#    And Free Pick selected modal is displayed
#    And the selected freeItem is displayed
#    When teacher clicks another item from SFO
#    Then the free pick item is updated on Free Pick selected modal
#    And teacher clicks on Confirm & Apply button
#
#
#  Examples:
#    | UsingData |
#    | SFO_FreePick_SelectModalVal1 |
#

  @SCSCOD-7160
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @6



  Scenario Outline:SFO Free Pick Confirm modal close:[<UsingData>]

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
    And teacher selects an item from modal
    And Free Pick selected modal is displayed
    And the selected freeItem is displayed
    When teacher click on “X” button
    Then the Free Pick Modal close


  Examples:
    | UsingData |
    | SFO_FreePick_ModalClose |


  @SCSCOD-7160
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @7



  Scenario Outline:SFO Free Pick Selected modal close:[<UsingData>]

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
    And teacher selects an item from modal
    And Free Pick selected modal is displayed
    And the selected freeItem is displayed
    When teacher click on “CANCEL” button
    Then the Free Pick Modal close


  Examples:
    | UsingData |
    | SFO_FreePick_ModalClose1 |



#  @SCSCOD-7160
#  @Priority1
#  @Sprint-15.1
#  @SFOPage_FreePickModal
#  @Release-BTS2017
#  @8
#  @Manual
#
#
#
#  Scenario Outline:SFO Free Pick modal Edit Selection Cancel:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher clicks enter orders
#    And teacher clicks “Student Flyer Orders” link
#    And Student Flyer Orders modal is dispalyed
#    And teacher click on link “Apply a coupon for this student”
#    And SFO Coupon Modal is displayed
#    And teacher enters valid Student Name
#    And teacher enters valid Coupon code
#    And teacher click on Apply
#    And Free pick modal displays
#    And teacher selects an item from modal
#    And Free Pick selected modal is displayed
#    And the selected freeItem is displayed
#    When teacher clicks on other item on coupon modal
#    Then the Free Pick Selected Modal displays new item selected
#    And teacher click cancel then the Free Pick Selected Modal closes and no item is selected
#
#
#  Examples:
#    | UsingData |
#    | SFO_FreePick_ItemUpdate |
