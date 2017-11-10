Feature: DWCAPCOD205
  Teacher Desk - Due date reminder to parents

  @DWCAPCOD-205
  @1
  Scenario Outline:Send Reminder for no Due Date set:[<UsingData>]

    Given teacher logs in to the application by providing [UserInformation]
    And teacher did not set a due date yet
    And teacher clicks on Teacher Desk
    When teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    Then "Send Due Date Reminder" modal displays with calender displayed next to Order Due Date on the reminder


    Examples:
      |UsingData|
      |Dev35_PCOD_SendReminder_1|


#  @DWCAPCOD-205
#  @2
#  Scenario Outline: Teacher sets DueDate from Send Due Date Reminder modal:[<UsingData>]
#    Given teacher logs into the application by providing [UserInformation]
#    And teacher did not set a due date yet
#    And teacher clicks on Teacher Desk
#    And teacher clicks "Send Reminder" link from "Set Your Next DueDate" section
#    When teacher selects a due date
#    And the modal closes
#    Then the selected date displays
#
#    Examples:
#      |UsingData|
#      |Dev35:PCOD:SetDate|

  @DWCAPCOD-205
  @3
  Scenario Outline: Teacher download the reminder letter after setting the due date:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And teacher has already set a due date
    And teacher clicks on Teacher Desk
    And teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    When teacher clicks on Download
    Then the reminder letter is downloaded in pdf format with the set duedate
    Examples:
      |UsingData|
      |Dev35:PCOD:TeacherDesk3|

  @DWCAPCOD-205
  @4
  Scenario Outline: Teacher prints the reminder letter after setting the due date:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And teacher has already set a due date
    And teacher clicks on Teacher Desk
    And teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    When teacher clicks on Print
    Then the pdf format of the reminder ready to print displays with the set due date
    Examples:
      |UsingData|
      |Dev35:PCOD:TeacherDesk4|

#  @DWCAPCOD-205
#  @5
#  Scenario Outline: Teacher clicks on email for the reminder which has a due date set:[<UsingData>]
#    Given teacher logs in to the application by providing [UserInformation]
#    And teacher has already set a due date
#    And teacher clicks on Teacher Desk
#    And teacher clicks "Send Reminder" link from "Set Your Next DueDate" section "Send letters to Parents" section
#    When teacher clicks on Email
#    Then the default email client displays with the reminder letter with the set duedate
#    Examples:
#      |UsingData|
#      |Dev35:PCOD:|
#
  @DWCAPCOD-205
  @6
  Scenario Outline: Teacher edits the reminder letter:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And teacher has already set a due date
    And teacher clicks on Teacher Desk
    And teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    When teacher clicks on Edit
    And edits the reminder letter
    And clicks on Save on reminder letter
    Then Send Reminder modal displays with edited and saved
    And Reminder modal displays with the edited message
    And teacher clicks "Restore Default Message"

    Examples:
      |UsingData|
      |Dev35:PCOD:TeacherDesk6|

  @DWCAPCOD-205
  @7
  Scenario Outline: Teacher restores default message after editing the reminder:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And teacher has already set a due date
    And teacher clicks on Teacher Desk
    And teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    When teacher clicks on Edit
    And edits the reminder letter
    And clicks on Save on reminder letter
    When teacher clicks "Restore Default Message"
    Then default reminder letter is restored and saved
    Examples:
      |UsingData|
      |Dev35:PCOD:TeacherDesk7|


  @DWCAPCOD-205
  @8
  Scenario Outline: Teacher downloads edited reminder:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And teacher has already set a due date
    And teacher clicks on Teacher Desk
    And teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    And teacher clicks on Edit
    And edits the reminder letter
    When teacher clicks on Download
    Then the reminder letter is downloaded in pdf format with the edited reminder
    Examples:
      |UsingData|
      |Dev35:PCOD:TeacherDesk8|

  @DWCAPCOD-205
  @9
  Scenario Outline: Teacher prints the edited reminder:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And teacher has already set a due date
    And teacher clicks on Teacher Desk
    And teacher clicks on "Send Reminder" link from "Set Your Next DueDate" section
    And teacher clicks on Edit
    And edits the reminder letter
    When teacher clicks on Print
    Then the pdf format of the reminder ready to print displays with the edited reminder
    Examples:
      |UsingData|
      |Dev35:PCOD:TeacherDesk9|


#
#
#  @DWCAPCOD-205
#  @10
#  Scenario Outline: Teacher emails the edited reminder:[<UsingData>]
#    Given teacher logs in to the application by providing [UserInformation]
#    And teacher has already set a due date
#    And teacher clicks on Teacher Desk
#    And teacher clicks "Send Reminder" link from "Set Your Next DueDate" section
#    And teacher edits the reminder letter
#    When teacher clicks on Email
##    Then the default email client displays with the reminder letter with the edited reminder
#    Examples:
#      |UsingData|
#      |Dev35:PCOD:TeacherDesk10-|