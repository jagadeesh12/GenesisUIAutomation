Feature: Validation of SCSCOD-7556 scenarios for Sprint 15.3
  This feature is used to validate all scenarios for SCSCOD-7556

  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7556      			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  #DATA CREATION PENDING

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @TeacherDesk
  @Manual
  @Release-BTS2017
  @1

  Scenario Outline:Teacher enters Student name on SFO and the name is saved in Class list:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Item# and Student name is entered
    When teacher clicks on Add button
    Then Student Name is saved to Class list on the backend
    And as teacher again try to add another student name
    And the Student Name field provides auto suggestion option based on the Class list



    Examples:
      | UsingData |
      | SFO_ClassList_1 |




  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Manual
  @Release-BTS2017
  @2

  Scenario Outline:Enter Student name on SFO after the session time out:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Item# and Student name is entered
    And teacher clicks on Add button
    And Student Name is saved to Class list on the backend
    When application is not used for more than 30 minutes the session time out.
    Then teacher  re-login to the application
    And teacher enters Student name
    And the Student Name field gives auto suggestion option based on the Class list
    And item# is entered
    And teacher clicks on Add button
    And the name is added to the Class list and the previously entered student name is retained as well


    Examples:
      | UsingData |
      | SFO_ClassList_2 |

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Manual
  @Release-BTS2017
  @3

  Scenario Outline:Enter Student name after logout and login student name is saved in Class list:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Item# and Student name is entered
    And teacher clicks on Add button
    And Student Name is saved to Class list on the backend
    And teacher logout from the application and relogin
    And teacher enters student name and item#
    When teacher click on ADD
    Then the name is added to the Class list and the previously entered student name is retained as well


    Examples:
      | UsingData |
      | SFO_ClassList_3 |

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @Manual
  @4

  Scenario Outline:Student name typed is not added to Class list unless Add button is clicked:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Item# and Student name is entered
    When ADD button is not clicked
    Then Class list will not be updated with the Student name typed

    Examples:
      | UsingData |
      | SFO_ClassList_4 |


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @5

  Scenario Outline:Teacher navigate to Teacher's Desk and Class List is displayed:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher clicks on Teacher's desk
    Then teacher can see Class List section below the Order Status Section and above the Parent Online Payments section
    And hyperlink “Manage” is present


    Examples:
      | UsingData |
      | SFO_ClassList_5 |



  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @6

  Scenario Outline:Teacher navigate to Teacher's Desk and click Manage for Class List section:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher can see Class List section below the Order Status Section and above the Parent Online Payments section
    And hyperlink “Manage” is present
    When teacher click on “Manage”
    Then Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    # Content Message
    # And the modal message “Student Flyer Orders Please Note: These are students you have entered orders for online”  is displayed
    And Add student name field, add button, save hyperlink, edit hyperlink are all visible
    And Add button is not active, Save Hyperlink is not active


    Examples:
      | UsingData |
      | SFO_ClassList_6 |


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @7

  Scenario Outline: Student name is added to Class list from SFO Coupon modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Student Name is saved to Class list on the backend
    When teacher again try to add another student name
    Then the Student Name field provides auto suggestion option based on the Class list

    Examples:
      | UsingData |
      | SFO_ClassList_7 |


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @8

  Scenario Outline:Teacher close the class list modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal has x button at top of modal
    When teacher clicks on the x button
    Then the manage class list modal closes

    Examples:
      | UsingData |
      | SFO_ClassList_8|


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @9

  Scenario Outline:Enter student name in Add Student name field present on Class list Modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And Add student name field, add button, save hyperlink, edit hyperlink are all visible
    When teacher enters student name more than 2 characters and less than 21
    Then Add button is enabled
    And hyperlink Save is not activated
    And hyperlink Edit is active



    Examples:
      | UsingData |
      | SFO_ClassList_9 |


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @10

  Scenario Outline:Enter student name on Class list Modal and click Add:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And Add student name field, add button, save hyperlink, edit hyperlink are all visible
    And teacher enters student name more than 2 characters and less than 21
    And Add button is enabled
    When teacher clicks on Add button on Class list modal
    Then entered name is added to the grid below
    And hyperlink Save is active
    And hyperlink Edit is active

    Examples:
      | UsingData |
      | SFO_ClassList_10|



  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @11

  Scenario Outline:Enter student name on Class list Modal and close modal without save:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And  teacher enters student name more than 2 characters and less than 21
    And teacher clicks on Add button on Class list modal
    When teacher clicks on the x button
    Then the manage class list modal closes
    And teacher click on “Manage”
    And the entered name is not displayed on the grid


    Examples:
      | UsingData |
      | SFO_ClassList_11|



  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @12

  Scenario Outline:Enter student name on Class list Modal and save before closing the modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And  teacher enters student name more than 2 characters and less than 21
    And teacher clicks on Add button on Class list modal
    And teacher clicks on Save
    When teacher clicks on the x button
    Then the manage class list modal closes
    And teacher click on “Manage”
    And the entered name is displayed on the grid


    Examples:
      | UsingData |
      | SFO_ClassList_12|


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @13

  Scenario Outline:Enter student name on Class list Modal and click hyperlink Edit without clicking ADD:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And  teacher enters student name more than 2 characters and less than 21
    When teacher click on Edit
    Then name field is disabled and displays the name
    And Add button is disabled
    And edit is inactive
    And Save is activated
    And the grid is available for edit name



    Examples:
      | UsingData |
      | SFO_ClassList_13|



  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @15

  Scenario Outline:Enter less than 2 characters in student name on Class list Modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    When teacher enters student name less than 2 characters
    Then “Student names must include at least 2 characters.” is displayed
    And Add button is disabled




  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @16

  Scenario Outline:Enter more than 20 characters in student name on Class list Modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    When teacher tries to type more than 20 characters in name field
    Then name field does not except more than 20 characters



    Examples:
      | UsingData |
      | SFO_ClassList_16|

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @17

  Scenario Outline:Class List modal is empty and Edit hyperlink should not be active :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    When the modal grid is empty
    Then edit is inactive
    And save is inactive

  | UsingData |
  | SFO_ClassList_17|


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @18

  Scenario Outline:Teacher clicks on Edit hyperlink and delete name and does not save:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    And teacher delete the existing name
    And close the Class list modal
    When teacher click on “Manage”
    Then the deleted name is not removed from class list



  | UsingData |
  | SFO_ClassList_18|

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @19

  Scenario Outline:Teacher clicks on Edit hyperlink and delete name and Save changes:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    And teacher delete the existing name
    And click on save
    And close the Class list modal
    When teacher click on “Manage”
    Then the deleted name is removed from class list


  | UsingData |
  | SFO_ClassList_19|

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @20

  Scenario Outline:Teacher clicks on Edit hyperlink and edit the already present name but does not save:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    And teacher edits the the existing name
    And close the Class list modal
    When teacher click on “Manage”
    Then the edited name is not displayed and the previous name is retained

  | UsingData |
  | SFO_ClassList_20|

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @21

  Scenario Outline:Teacher clicks on Edit hyperlink and edit the already present name clicks save:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    And teacher edits the the existing name
    And click on save
    And close the Class list modal
    When teacher click on “Manage”
    Then the edited name is  displayed

  | UsingData |
  | SFO_ClassList_21|


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @22


  Scenario Outline:Teacher edits the name such that name is less than 2 characters:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    When teacher try to update the existing name with only 2 characters
    Then “Student names must include at least 2 characters.” is displayed

  | UsingData |
  | SFO_ClassList_22|


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @23

  Scenario Outline:Teacher tries to edit the name to update name more than 20 characters:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    When teacher try to update the existing name with more than 20 characters
    Then the updated name will not allow more than 20 characters

  | UsingData |
  | SFO_ClassList_23|

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @24

  Scenario Outline:Teacher tries add existing name to class list:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks on Teacher's desk
    And teacher click on “Manage”
    And Manage Class list modal is displayed
    And the modal title is “Manage Class List”
    And teacher clicks edit
    When teacher try to add existin name
    Then error message is dispalyed

  | UsingData |
  | SFO_ClassList_24|

  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @25

  Scenario Outline:Teacher can choose name using mouse or keyboard on SFO modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher clicks to type student name
    Then auto suggest should display name
    And teacher can choose the desired name using keyboard or mouse

  | UsingData |
  | SFO_ClassList_25|


  @SCSCOD-7556
  @Priority1
  @Sprint-15.3
  @SFOPage
  @Release-BTS2017
  @26

  Scenario Outline:Teacher can choose name using mouse or keyboard on SFO coupon modal:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher clicks to type student name
    Then auto suggest should display name
    And teacher can choose the desired name using keyboard
  | UsingData |
  | SFO_ClassList_26|














