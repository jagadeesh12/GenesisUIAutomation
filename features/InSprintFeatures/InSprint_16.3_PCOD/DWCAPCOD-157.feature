Feature: DWCAPCOD-157
	Teachers - Teacher's Desk - Send Letter to Parents

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

@DWCAPCOD-157
@TeacherDesk
@Priority1
@Sprint-16.3
@1
Scenario Outline: Teacher edits the letter:[<UsingData>]
Given teacher logs in to the application by providing [UserInformation]
And teacher clicks on Teacher Desk
When teacher clicks Edit in the "Send Letters to Parents" section
And teacher selects a different language
And teacher edits the letter
And teacher clicks Save
Then edited version of the letter is saved and displays on "Send Letter To Parents" modal
Examples:
|UsingData|
|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:EditLetter|

@DWCAPCOD-157
@TeacherDesk
@Priority1
@Sprint-16.3
@2
Scenario Outline: Teacher clicks Restore default message after editing the letter:[<UsingData>]
Given teacher logs in to the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks "View" link from "Send letters to Parents" section
And teacher clicks "Edit" link on View Mode
And teacher edits the letter
And teacher clicks Save
When teacher clicks "Restore Default Message" in the "Send letters to Parents" modal
Then the default message is restored and saved
Examples:
|UsingData|
|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:RestoreDefaultSelected|

@DWCAPCOD-157
@TeacherDesk
@Priority1
@Sprint-16.3
@3
Scenario Outline: Teacher edits the letter and clicks on close:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Teacher Desk
And teacher clicks "View" link from "Send letters to Parents" section
And teacher clicks "Edit" link on View Mode
And teacher edits the letter
When teacher clicks on close
Then the modal is closed
And the changes are not saved
Examples:
|UsingData|
|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:ClickCloseonModal|

#@DWCAPCOD-157
#@TeacherDesk
#@Priority1
#@Sprint-16.3
#@4
#Scenario Outline: Teacher clicks on Download letter:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#When teacher selects a language and clicks Download
#Then the download pdf format of the letter displays with appropriate selected language
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:DownloadLetter|
#
#@DWCAPCOD-157
#@TeacherDesk
#@Priority1
#@Sprint-16.3
#@5
#Scenario Outline: Teacher clicks on Print letter:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#When teacher selects a language and clicks Print
#Then the download pdf format of the letter displays with appropriate selected language
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:PrintLetter|
#
#@DWCAPCOD-157
#@TeacherDesk
#@Priority1
#@Sprint-16.3
#@6
#Scenario Outline: Teacher clicks on facebook icon from view Letter modal:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#When teacher clicks Facebook icon
#Then teacher is redirected to the scholastic canada reading club facebook page in new tab
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:FaceBookIcon|
#
#@DWCAPCOD-157
#@TeacherDesk
#@Priority1
#@Sprint-16.3
#@7
#Scenario Outline: Teacher downloads the edited letter:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#And teacher clicks "Edit" link on View Mode
#When teacher edits the letter
#And teacher clicks on Download
#Then the download pdf format of the letter displays with edited version of the letter
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:DownloadEdittedLetter|
#
#@DWCAPCOD-157
#@TeacherDesk
#@Priority1
#@Sprint-16.3
#@8
#Scenario Outline: Teacher prints the edited letter:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#And teacher clicks "Edit" link on View Mode
#When teacher edits the letter
#And teacher clicks on Print
#Then the download pdf format of the letter displays with edited version of the letter
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:TeacherDesk:SendLettertoParents:PrintEdittedLetter|

#@DWCAPCOD-157
#@TeacherDesk
#@Manual
#@Sprint-16.3
#Scenario Outline: Teacher clicks on Email letter:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#When teacher selects a language and clicks Email
#Then default email client displays with the letter in appropriate selected language
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#@DWCAPCOD-157
#@TeacherDesk
#@Manual
#@Sprint-16.3
#Scenario Outline: Teacher emails the edited version of the letter:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#And teacher clicks "View" link from "Send letters to Parents" section
#When teacher edits the letter
#And teacher clicks Email
#Then default email client displays with the edited version of the letter
#Examples:
#|UsingData|
#|InSprint16.3:PCOD:|
#
#@DWCAPCOD-157
#@TeacherDesk
#@Manual
#@Sprint-16.3
#Scenario: Teacher views Send Letter to Parent
#Given teacher logs into the application by providing [UserInformation]
#And teacher clicks on Teacher Desk
#When teacher clicks "view" link "Send letters to Parents" section
#Then Teacher is presented with a new modal with title "Send A Letter To Parents"
#And Modal message "Print or email a customized letter to parents with due date, book recommendations, classroom wish list items."
#And Banner image displays
#And Language drop down menu with values English, French, Arabic, Chinese, German, Korean, Russian, Spanish displays
#And content assets created for each language
#And locked text field displays with default message
#And Hyperlink to 'Edit' this message displays
#And Hyperlink to 'Restore Default Message'
#And download, print & email options displays
#And facebook link displays, NO pinterest link
#
#@DWCAPCOD-157
#@TeacherDesk
#@Manual
#@Sprint-16.3
#Scenario: Changing language on letter displays letter in appropriate language
#Given teacher logs into the application by providing [User Information]
#And teacher clicks on Teacher Desk
#And teacher clicks "view" link from "Send letters to Parents" section
#When teacher selects a different language from the language dropdown
#Then appropriate language letter displays