Feature: InSprint_12.4 PCOD
	This feature is used to validate all scenarios

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-75    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-75
@ConnectToTeacher
@Priority1
Scenario Outline:Parent clicks on Province dropdown to see all the provinces:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent clicks on Province dropdown
Then all the provinces are listed in the dropdown

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ProvinceDropdown|


@DWCAPCOD-75
@ConnectToTeacher
@Priority1
Scenario Outline:Parent selects a Province and all cities related to the province are listed in city dropdown:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher” 
When parent selects a province
And clicks on City dropdown
Then all cities related to the selected province are listed in city dropdown
And Search button is still disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ProvinceDropdown_Cities|


@DWCAPCOD-75
@ConnectToTeacher
@Priority1
Scenario Outline:Parent selects province and city:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent selects a province and city
Then Search button is enabled


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_Selects_Province_City|


@DWCAPCOD-75
@ConnectToTeacher
@Priority2
Scenario Outline:Parent clicks on Back on Step1 of Find Your Teacher:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent clicks on Back
Then parent is taken back to Connect to Teacher workflow with option to enter CAC code


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_BackBtn|


@DWCAPCOD-75
@ConnectToTeacher
@Priority3
Scenario Outline:Parent clicks on Close(X) on Step1 of Find Your Teacher:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent clicks on “Close (X)”
Then Connect to Your Teacher modal closes and the entered information is not saved

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CloseIcon|



@DWCAPCOD-75
@ConnectToTeacher
@Priority1
Scenario Outline:Postal code field is auto-formatted to correct format when valid code is entered in combination of lower case and upper case with space in Connect to Teacher window:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent enter valid postal code as combination of lower case and upper case with space after 3 characters
Then postal code field is auto-formatted to correct format

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_LowerUpperCase_WithSpace|


@DWCAPCOD-75
@ConnectToTeacher
@Priority1
Scenario Outline:Postal code field is auto-formatted to correct format when valid code is entered in lower case with space in Connect to Teacher window:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent enter valid postal code as lower case with space after 3 characters
Then postal code field is auto-formatted to correct format

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_LowerCase_WithSpace|


@DWCAPCOD-75
@ConnectToTeacher
@Priority2
Scenario Outline:Proper validation message is seen if parent enters postal code with 7 characters with no space in Connect to Teacher window:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent enter postal code with 7 characters with no space and tab out
Then “Please enter a valid postal code.” should display

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_7Char_ErrorMsg|

@DWCAPCOD-75
@ConnectToTeacher
@Priority2
Scenario Outline:Proper validation message is seen if parent enters postal code as less than 6 characters in Connect to Teacher window:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent enter postal code with less than 6 characters and tab out
Then “Please enter a valid postal code.” should display


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_6Char_ErrorMsg|

@DWCAPCOD-75
@ConnectToTeacher
@Priority3
Scenario Outline:Proper UI should be present for postal code text field in Connect to Teacher window:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent clicks on “Find Your Teacher”
Then postal code field is displayed with place holder as “Enter School Postal Code”


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_UI|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-76    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        




@DWCAPCOD-76
@ConnectToTeacher
@Priority1
Scenario Outline:Parent enters a postal code with no schools registered at scholastic:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent enters postal code with no schools registered with scholastic
And parent clicks on Search
Then “Sorry, we cannot locate your school. Please search again.” message displays

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_NotAssociatedToSchool|


@DWCAPCOD-76
@ConnectToTeacher
@Priority1
Scenario Outline:Parent enters a postal code with inactive school:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
When parent enters postal code with inactive school
And parent clicks on Search
Then “Sorry, we cannot locate your school. Please search again.” message displays

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_postalCode_ForInactiveSchool|


@DWCAPCOD-76
@ConnectToTeacher
@Priority3
Scenario Outline:Parent clicks on Back on Step2 of Find Your Teacher:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent enters valid postal code
And parent clicks on Search
When parent clicks on Back 
Then Step1 of Find Your Teacher with School search displays

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_BackBtn_Step1|


@DWCAPCOD-76
@ConnectToTeacher
@Priority3
Scenario Outline:Parent clicks on New Search on Step2 of Find Your Teacher:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent enters valid postal code
And parent clicks on Search
When parent clicks on “New Search” link
Then Step1 of Find Your Teacher with School search displays


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_NewSearchlink_Step1|


@DWCAPCOD-76
@ConnectToTeacher
@Priority3
Scenario Outline:Parent clicks on Close(X) on Step2 of Find Your Teacher:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent enters valid postal code
And parent clicks on Search
When parent clicks on “Close (X)”
Then Connect to Your Teacher modal closes and the entered information is not saved

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CloseIcon_Step2|


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-77    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        



#@DWCAPCOD-77
#@ConnectToTeacher
#@Priority1
#Scenario Outline:Selected school address displays on Find your Teacher Step3:[<UsingData>]
#
#Given parent opens scholastic reading clubs e-commerce site
#And parent clicks on “Connect to your Teacher” option
#And parent clicks on “Find Your Teacher”
#And parent searches with a valid postal code
#When parent selects a school
#And clicks Next
#Then selected school address displays with School name, street, City, province, postal code
#
#Examples:
#|UsingData|
#|InSprint12.4:PCOD:Parent_ConnectYourTeacher_Validpostal_SchoolDetails|
#
#
#@DWCAPCOD-77
#@ConnectToTeacher
#@Priority2
#Scenario Outline:Parent clicks on “Can't Find Your Teacher” link:[<UsingData>]
#
#Given parent opens scholastic reading clubs e-commerce site
#And parent clicks on “Connect to your Teacher” option
#And parent clicks on “Find Your Teacher”
#And parent searches with a valid postal code
#And parent selects a school
#And clicks Next
#When parent clicks on “Can't Find Your Teacher” link 
#Then tool tip message “At this time, there are no teachers at the selected school who are accepting Scholastic Reading Club online orders. Encourage your child's teacher to participate in Reading Club - it's a great way to build reading excitement and get books and resources for the classroom!” displays
#
#Examples:
#|UsingData|
#|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CantFindTeacher|
#
#
#@DWCAPCOD-77
#@ConnectToTeacher
#@Priority2
#Scenario Outline:Parent selects a school with no teacher's registered at the school:[<UsingData>]
#
#Given parent opens scholastic reading clubs e-commerce site
#And parent clicks on “Connect to your Teacher” option
#And parent clicks on “Find Your Teacher”
#And parent searches with a valid postal code
#And parent selects a school with no teachers
#And clicks Next
#When parent clicks on “Select Teacher” dropdown 
#Then tool tip message “At this time, there are no teachers at the selected school who are accepting Scholastic Reading Club online orders. Encourage your child's teacher to participate in Reading Club - it's a great way to build reading excitement and get books and resources for the classroom!” displays
#
#Examples:
#|UsingData|
#|InSprint12.4:PCOD:Parent_ConnectYourTeacher_School_NoTeacherRegistered|
#
#@DWCAPCOD-77
#@ConnectToTeacher
#@Priority3
#Scenario Outline:Parent clicks on Back on Step 3 of Find Your Teacher:[<UsingData>]
#
#Given parent opens scholastic reading clubs e-commerce site
#And parent clicks on “Connect to your Teacher” option
#And parent clicks on “Find Your Teacher”
#And parent searches with a valid postal code
#And parent selects a school
#And clicks Next
#When parent clicks on Back
#Then Find Your Teacher Step 2 with school selection should display
#
#
#Examples:
#|UsingData|
#|InSprint12.4:PCOD:Parent_ConnectYourTeacher_BackBtn_Step3|
#
#@DWCAPCOD-77
#@ConnectToTeacher
#@Priority3
#Scenario Outline:Parent clicks on Close(X) on Step 3 of Find Your Teacher:[<UsingData>]
#
#Given parent opens scholastic reading clubs e-commerce site
#And parent clicks on “Connect to your Teacher” option
#And parent clicks on “Find Your Teacher”
#And parent searches with a valid postal code
#And parent selects a school
#And clicks Next
#When parent clicks on “Close (X)”
#Then Connect to Your Teacher modal closes and the entered information is not saved
#
#Examples:
#|UsingData|
#|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CloseIcon_Step3|




##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-78    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-78
@ConnectToTeacher
@Priority1
Scenario Outline:Parent views correct teacher information on Connect to a Teacher step 2:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters a valid CAC code
And parent clicks on Connect button
Then correct teacher's name associated to the CAC displays
And correct school name associated to the CAC displays
And school location with school city, province and postal code displays


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CorrectCAC_TeachaerDetails|



@DWCAPCOD-78
@ConnectToTeacher
@Priority2
Scenario Outline:Parent clicks on “No” for “Is this your classroom teacher” from Connect to a Teacher step 2:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters a valid CAC code
And parent clicks on Connect button
And YES button is enabled by default
When parent clicks on “No” for “Is this your classroom teacher”
Then YOUR TEACHER'S NAME field displays with a text box

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CorrectCAC_TeachaerDetails_NoBtn|


@DWCAPCOD-78
@ConnectToTeacher
@Priority2
Scenario Outline:Parent clicks on “This is not my teacher” link from Connect to a Teacher step 2:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters a valid CAC code
And parent clicks on Connect button
When parent clicks on “This is not my teacher”
Then Step 1 displays with option to enter the CAC code

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CAC_ThisIsNotMyTeacher|


@DWCAPCOD-78
@ConnectToTeacher
@Priority2
Scenario Outline:Parent clicks on “Create an Account” from Connect to a Teacher step 2:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters a valid CAC code
And parent clicks on Connect button
When parent clicks on “Create an Account”
Then Create an Account modal displays


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CAC_CreateAnAccount|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-79    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent cannot enter more than 30 characters in First Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters more than 30 characters in First name field
Then any characters entered after 30 characters are ignored

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_FirstName30characters|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent cannot enter special characters except “'” in First Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters any special character other than “'” in First Name field
Then the special characters are ignored

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_FirstName_Specialcharacters|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:First Name field is highlighted in red if parent clicks inside the first name field and clicks outside without entering any data:[<UsingData>]

And parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent clicks inside first name field and does not enter any data
And clicks inside Last Name field
Then First Name field is highlighted in Yellow bordered with red

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_FirstName_Empty|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters only 1 character in First Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters only one character in first name field
And clicks outside or inside last name field
Then First Name field is highlighted in Yellow bordered with red
And tool tip message “Please enter a valid name. Must contain at least two characters.” displays


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_FirstName_SingleChar|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters 2 characters in First Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters two characters in first name field
And clicks outside or inside last name field
Then First Name field is saved with the data
And no error message displays 
And the field is not highlighted

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_FirstName_TwoChar|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enter valid data in all fields and does not enter only First Name:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields except First Name field
Then Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_EnterAllData_ExceptFirstName|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent cannot enter more than 30 characters in Last Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters more than 30 characters in Last name field
Then any characters entered after 30 characters are ignored for last name field

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_LastName30characters|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent cannot enter special characters except “'” in Last Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters any special character other than “'” in Last Name field
Then the special characters are ignored for last name field


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_LastName_Specialcharacters|



@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Last Name field is highlighted in red if parent clicks inside the Last name field and clicks outside without entering any data:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent clicks inside Last name field and does not enter any data
And clicks inside Email field
Then Last Name field is highlighted in Yellow bordered with red


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_LastName_Empty|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters only 1 character in Last Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters only one character in Last name field
And clicks outside or inside Email field
Then Last Name field is highlighted in Yellow bordered with red
And tool tip message “Please enter a valid name. Must contain at least two characters.” displays


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_LastName_SingleChar|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters 2 characters in Last Name field:[<UsingData>]

And parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters two characters in Last name field
And clicks outside or inside Email field
Then Last Name field is saved with the data
And no error message displays 
And last name field is not highlighted

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_LastName_TwoChar|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enter valid data in all fields and does not enter only Last Name:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields except Last Name field
Then Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_EnterAllData_ExceptLastName|



@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters email address without domain:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid email without domain
And clicks outside or inside password field
Then tool tip error message “Please enter a valid email address.” displays
And email field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Email_MissingDomain|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters email address without dot:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid email without dot
And clicks outside or inside password field
Then tool tip error message “Please enter a valid email address.” displays
And email field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Email_MissingDot|



@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters email address without top level domain:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid email without top level domain
And clicks outside or inside password field
Then tool tip error message “Please enter a valid email address.” displays
And email field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Email_MissingTopLevelDomain|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters email address with multiple '@' sign:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid email with multiple “@” sign
And clicks outside or inside password field
Then tool tip error message “Please enter a valid email address.” displays
And email field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Email_Multiple@sign|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters email address with multiple dots:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid email with multiple dots
And clicks outside or inside password field
Then tool tip error message “Please enter a valid email address.” displays
And email field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Email_MultipleDots|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not enter only Email:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields except Email
Then Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_EnterAllData_ExceptEmail|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enters password with less than 7 characters in Create Account modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters password with less than 7 characters
Then password is shown by default
And clicks outside or inside phone number field
And tool tip error message “Please make sure your password has at least 7 characters and contains both letters and numbers.” displays
And the box is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Password_LessThan7Char|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enters password without combination of letters and numbers in Create Account modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters password more than 7 characters but without combination of letters and numbers
Then password is shown by default
And clicks outside or inside phone number field
And tool tip error message “Please make sure your password has at least 7 characters and contains both letters and numbers.” displays
And the box is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Password_WithoutCombination_LettersAndNumbers|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enter valid password in the password field in Create Account modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid password in the password field
Then the password is accepted

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Password_Valid|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enter valid password with combination of letters, numbers and special characters in the password field in Create Account modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid password in the password field
Then the password is accepted

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Password_Valid_LettersNumbersSpecialChar|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent clicks on Hide to hide the characters entered in password field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid password in the password field 
And parent clicks on Hide link
Then the password is hidden and '.'s are displayed

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Password_Hide|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent clicks on Show to show the characters entered in password field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And Parent enters valid password in the password field
And parent clicks on Hide next to password field
When parent clicks on Show link
Then the entered characters in password is shown


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Password_Show|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not enter only Password:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields except password
Then Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_EnterAllData_ExceptPassword|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters invalid phone number1 in phone number field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters incorrect format of phone number
Then tool tip error message “Please specify a valid phone number.” displays
And phone number field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_PhoneNumber_Invalid1|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters invalid phone number2 in phone number field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters incorrect format of phone number
Then tool tip error message “Please specify a valid phone number.” displays
And phone number field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_PhoneNumber_Invalid2|


@ConnectToTeacher
@DWCAPCOD-79
@Priority2
Scenario Outline:Parent enters invalid phone number3 in phone number field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters incorrect format of phone number
Then tool tip error message “Please specify a valid phone number.” displays
And phone number field is highlighted and bordered in red
And Continue button is disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_PhoneNumber_Invalid3|


@ConnectToTeacher
@DWCAPCOD-79
@Priority3
Scenario Outline:Parent enters valid data in all fields and does not enter only Phone number:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields except phone number
Then Continue button is enabled as this is an optional field

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_EnterAllData_ExceptPhoneNumber|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent cannot create account until preferred language is selected:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And Parent enters valid data in all fields except selecting the language preference
And Continue button is disabled
When Parent selects Language Preference as English or French
Then Continue button is enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_PreferredLang_Unselect_Select|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent cannot create account until both Terms and policy are accepted:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And Parent enters valid data in all fields except selecting the Terms and Privacy Policy
And Continue button is disabled
When Parent selects either Terms or Policy
Then Continue button is still disabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_Terms_Policy_Unselect|

@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Continue button enabled when Parent accepts both Terms and Privacy policy:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields and selects both Terms and Privacy Policy
Then Continue button is enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_ProvideAllDetails|

@ConnectToTeacher
@DWCAPCOD-79
@Priority3
Scenario Outline:Continue button enabled when Parent does not accept communications about special offers:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields and does not accept communications about special offers
Then Continue button is enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_UnCheckOffers_ContinueBtnEnabled|


@ConnectToTeacher
@DWCAPCOD-79
@Priority1
Scenario Outline:Parent enters valid data in all Create Account fields and clicks on Continue:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields
And clicks on Continue button
Then Add a child modal displays
And Parent account is created

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_ValidData_ContinueBtn|


@ConnectToTeacher
@DWCAPCOD-79
@Priority3
Scenario Outline:Parent enters valid data in all Create Account fields and clicks on Close(X):[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
When Parent enters valid data in all fields
And parent clicks on “Close (X)”
Then Create Account modal disappears
#And Parent account is not created and all the entered information is lost


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CreateAnAccount_CloseIcon|




##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-138    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
################################################################################################################################################## 

@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent cannot enter more than 50 characters in Child's First Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters more than 30 characters in First name field on Add a Child modal
Then any characters entered after 50 characters are ignored

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_FirstName50characters|


@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent cannot enter more than 50 characters in Child's Last Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters more than 50 characters in Last name field on Add a Child modal
Then any characters entered after 50 characters are ignored for last name field

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_LasttName50characters|


@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent enters 1 character in Child's Last Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters only 1 character in Last name field on Add a Child modal
And tabout from last name field or click on some other fields
Then “Please enter at least 2 characters” error message displays
And the field is highlighted in yellow and bordered in red


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_LasttNameSinglecharacter|


@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent enters 2 or more characters in Child's Last Name field:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters 2 or more character in Last name field on Add a Child modal
Then last name is accepted
And no error message displays and field is not highlighted

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_LasttNameTwocharacter|


@ConnectToTeacher
@DWCAPCOD-138
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not enter only Child's First Name on Add a Child modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters valid data in all fields and does not enter data in Child's First Name
Then ADD button is not enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_ExceptFirstName|


@ConnectToTeacher
@DWCAPCOD-138
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not enter only Child's Last Name on Add a Child modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters valid data in all fields and does not enter data in Child's Last Name
Then ADD button is not enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_ExceptLastName|


@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent clicks on the grade dropdown on Add a Child modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent clicks on the grade dropdown
Then Select Grade is displayed by default
And dropdown values Pre-Kindergarten, Kindergarten, 1st Grade, 2nd Grade, 3rd Grade, 4th Grade, 5th Grade, 6th Grade, 7th Grade, 8th Grade, 9th Grade, 10th Grade, 11th Grade, 12th Grade displays


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_GradeDropDown_Values|



@ConnectToTeacher
@DWCAPCOD-138
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not select a grade on Add a Child modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters valid data in all fields and does not select a grade
Then ADD button is not enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_ExceptGrade|


@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent Clicks on Month dropdown for Birthdate:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent clicks on Month dropdown
Then months January through december displays in the chronological order

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_MonthDropDown_Values|


@ConnectToTeacher
@DWCAPCOD-138
@Priority2
Scenario Outline:Parent Clicks on Year dropdown for Birthdate:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent clicks on Year dropdown
Then current - 20 to current year displays

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_yearDropDown_Values|


@ConnectToTeacher
@DWCAPCOD-138
@Priority3
Scenario Outline:Parent enters valid data in all fields and does not select Birthdate on Add a Child modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters valid data in all fields and does not select Birthdate
Then ADD button is enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_ExceptBirthDetails|



@ConnectToTeacher
@DWCAPCOD-138
@Priority1
Scenario Outline:Parent enters valid data in all fields and selects partial birthdate on Add a Child modal:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters valid data in all fields and does not select either Month or Year in Birthdate
Then ADD button is not enabled

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_PartialBirthDetails|




Scenario Outline:Parent enters valid data in all “Add a Child” fields:[<UsingData>]

And parent clicks on “Connect to your Teacher” option
And parent enters a valid CAC code
And parent clicks on Connect button
And parent clicks on “Create an Account” button
And parent creates an account and navigates to Add a Child window
When Parent enters valid data in all fields in Add a Child window
And clicks on ADD
Then child information is saved

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_AddaChild_ValidData_Add|


