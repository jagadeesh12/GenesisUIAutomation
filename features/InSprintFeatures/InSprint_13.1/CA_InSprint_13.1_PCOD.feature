Feature: InSprint_13.1 PCOD
	This feature is used to validate all scenarios

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-115    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@Search
@DWCAPCOD-115
@Priority1
Scenario Outline:Searching with Item# navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent enters valid Item# in search field and click on search icon
Then PDP of the searched item displays

Examples:
  |UsingData                             |
  |InSprint13.1:PCOD:Parent_SearchbyItem#|
  
  
@Search
@DWCAPCOD-115
@Priority1
Scenario Outline:Searching with exact matching title navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent enters exact matching title in search field and click enter button
Then PDP of the searched item displays

Examples:
  |UsingData                                 |
  |InSprint13.1:PCOD:Parent_SearchbyItemtitle|
  
  
@Search
@DWCAPCOD-115
@Priority1
Scenario Outline:Searching with exact matching author name navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent enters exact matching author name in search field and click enter button
Then PDP of the searched author displays

Examples:
  |UsingData                                  |
  |InSprint13.1:PCOD:Parent_SearchbyAuthorName|
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-116    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@Search
@DWCAPCOD-116
@Priority3
Scenario Outline:Pop up seen when clicked on the Reading Level in PDP page:[<UsingData>]    
   
Given Parent login in with valid [username] and [password]
And parent searches with valid item which is having reading level information
And PDP of the item displays
When parent click on Reading Level line
Then pop up is displayed with reading level infomation
And “About Reading Levels” link is present in the pop up

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_ReadingLevelWindowPopup|


@Search
@DWCAPCOD-116
@Priority3
Scenario Outline:Clicking on close icon in 'About Reading Levels' window in PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item which is having reading level information
And PDP of the item displays
And parent click on Reading Level line
And clicks “About Reading Levels” link present in the pop up
When parent clicks on close icon
Then “About Reading Levels” window is closed

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_ReadingLevelWindowCloseIcon|



@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Clicking on item from search result page navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches with valid partial matching title
And clicks on any of the item
Then correct PDP of the item displays

Examples:
  |UsingData|
  |InSprint13.1:PCOD:Parent_SearchResultPage_ItemClick|
  
  
  
@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Parent cannot enter more than 999 in Quantity input field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
When parent enter more than 999 in quantity input field
Then it should not allow to enter more than 3 digits

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_QuantityMoreThan3Digits|


@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Parent edits the quantity in PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
When parent enter some number in quantity input field
Then quantity field should be displayed as entered
When parent edits the quantity field
Then modified data should be displayed in quantity input field

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_QuantityEdit|



@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Parent cannot enter negative value in Quantity field in PDP page:[<UsingData>] 

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
When parent tries to enter negative value in quantity input field
Then negative value is not accepted in quantity field

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_QuantityNegative|


@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Clicking on "Back To Results" link on PDP page should navigate back to search result page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid partial matching title
And parent clicks on any of the item present in search result page
And PDP of the item displays
When parent clicks on “Back To Results” link
Then parent is navigated back to search result page

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_BackToResultLink|




    
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-305    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:No Search results page displays when user searches for a term with no results:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches with non-existing keyword
And parent clicks enter
Then no search results page displays

Examples:
  |UsingData                    |
  |PCOD:Parent_NoResults_Keyword|
  
  
@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:No Search results page displays when user searches with a non-existing item#:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches for non-existing item#
And parent click on Search icon
Then no search results page displays

Examples:
  |UsingData                  |
  |PCOD:Parent_NoResults_Item#|
  
  
  
@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:Parent searches for an author with no results:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches with author name with no results
Then no search results page displays

Examples:
  |UsingData                  |
  |PCOD:Parent_SearchbyKeyword|
  
  
@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:Parent searches for Item# from no results page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with Item# with no results
Then no search results page displays
When parent searches for valid item# from no search results page
Then parent is navigated to PDP page
Examples:
  |UsingData                   |
  |PCOD:Parent_Search_NoResults|
  


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-199    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


  
  
@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent cannot enter more than 50 characters in Child's First Name field in Add a Child window from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters more than 50 characters in First name field on Add a Child modal
Then any characters entered after 50 characters are ignored   
      
Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_FirstName50characters|


@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent cannot enter more than 50 characters in Child's Last Name field in Add a Child window from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters more than 50 characters in Last name field on Add a Child modal
Then any characters entered after 50 characters are ignored for last name field

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_LasttName50characters|



@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent enters 1 character in Child's Last Name field in Add a Child window from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters only 1 character in Last name field on Add a Child modal
And tabout from last name field or click on some other fields
Then tool tip message “Please enter a valid name. Must contain at least two characters.” displays
And the field is highlighted in yellow and bordered in red


Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_LasttNameSinglecharacter|



@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent enters 2 or more characters in Child's Last Name field in Add a Child window from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters 2 or more character in Last name field on Add a Child modal
Then last name is accepted
And no error message displays and field is not highlighted

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_LasttNameTwocharacter|



@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not enter only Child's First Name on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all the fields and does not enter data in Child's First Name
Then SAVE button is not enabled
And CANCEL button is enabled

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_ExceptFirstName|


@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not enter only Child's Last Name on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all the fields and does not enter data in Child's Last Name
Then SAVE button is not enabled
And CANCEL button is enabled

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_ExceptLastName|


@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent clicks on the grade dropdown on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent clicks on the grade dropdown
Then Select Grade is displayed by default
And dropdown values Pre-Kindergarten, Kindergarten, 1st Grade, 2nd Grade, 3rd Grade, 4th Grade, 5th Grade, 6th Grade, 7th Grade, 8th Grade, 9th Grade, 10th Grade, 11th Grade, 12th Grade displays


Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_GradeDropDown_Values|



@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent enters valid data in all fields and does not select a grade on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all fields and does not select a grade
Then SAVE button is not enabled
And CANCEL button is enabled

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_ExceptGrade|   
      
 
@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent Clicks on Month dropdown for Birthdate from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent clicks on Month dropdown
Then months January through december displays in the chronological order

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_MonthDropDown_Values|


@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent Clicks on Year dropdown for Birthdate from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent clicks on Year dropdown
Then current - 20 to current year displays

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_yearDropDown_Values|


@ConnectToTeacher
@DWCAPCOD-199
@Priority3
Scenario Outline:Parent enters valid data in all fields and does not select Birthdate on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all fields and does not select Birthdate
Then SAVE button is enabled
And CANCEL button is enabled
Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_ExceptBirthDetails|


@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent enters valid data in all fields and selects partial birthdate on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all fields and does not select either Month or Year in Birthdate
Then SAVE button is not enabled
And CANCEL button is enabled

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_PartialBirthDetails|




@DWCAPCOD-199
@MyAccount
@Priority3
Scenario Outline:Parent cannot give any spaces in CONNECT TO A TEACHER text field on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent tries to give spaces in CONNECT TO A TEACHER text field
Then CONNECT TO A TEACHER text field will not allow any spaces

Examples:
  | UsingData|
  | InSprint13.1:PCOD:Dev35:Parent_ErrorMsg_CACSpacescharactersHomePage|  
  
  
  
@DWCAPCOD-199
@MyAccount
@Priority2 
Scenario Outline:Submit button for CONNECT TO A TEACHER field is disabled when field is blank on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When CONNECT TO A TEACHER text field is left blank
Then Submit button should be disabled

Examples:
  | UsingData                                                  |
  | InSprint13.1:PCOD:Dev35:Parent_ConnectBtnDisabled_CACBlankHomePage|
  
  
  
@DWCAPCOD-199
@MyAccount
@Priority2  
Scenario Outline:Submit button for CONNECT TO A TEACHER field is enabled when correct CAC is entered in the CONNECT TO A TEACHERfield on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent enters 5 characters in CONNECT TO A TEACHER text field
Then Submit button should be enabled

Examples:
  | UsingData                                                   |
  | InSprint13.1:PCOD:Dev35:Parent_ConnectBtnEnabled_CACEnteredHomePage|

@DWCAPCOD-199
@MyAccount
@Priority3
Scenario Outline:Parent cannot enter more than 5 characters in CONNECT TO A TEACHER text field on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent tries to enter more than 5 characters in CONNECT TO A TEACHER text field
Then CONNECT TO A TEACHER text field will not take more than 5 characters

Examples:
  | UsingData|
  | InSprint13.1:PCOD:Dev35:Parent_CACMorethan5charactersHomePage|
  
  
@DWCAPCOD-199
@MyAccount
@Priority3  
Scenario Outline:Submit button should be disabled if parent enters less than 5 characters in CONNECT TO A TEACHER text field on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent enters enters less than 5 characters in CONNECT TO A TEACHER text field
Then Submit button should be disabled

Examples:
  | UsingData                                             |
  | InSprint13.1:PCOD:Dev35:Parent_CACLessthan5charactersHomePage|
  
  

@DWCAPCOD-199
@MyAccount
@Priority3  
Scenario Outline:Parent see proper validation message if incorrect CONNECT TO A TEACHER is entered on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent enters incorrect CONNECT TO A TEACHER in text field
And click on Submit button
Then “Please make sure you entered the correct class code. If you don't have correct code , contact your child's teacher.” should be seen

Examples:
  | UsingData                                            |
  | InSprint13.1:PCOD:Dev35:Parent_ErrorMsg_IncorrectCACHomePage|
  
@DWCAPCOD-199
@MyAccount
@Priority3 
Scenario Outline:Parent cannot enter special characters in CONNECT TO A TEACHER text field on Add a Child modal from homepage:[<UsingData>]
 
Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent tries to enter special characters in CONNECT TO A TEACHER text field
Then CONNECT TO A TEACHER text field will not allow special characters

Examples:
  | UsingData                                           |
  | InSprint13.1:PCOD:Dev35:Parent_CACSpecialcharactersHomePage|
  
  
  
@ConnectToTeacher
@DWCAPCOD-199
@Priority3
Scenario Outline:Parent enters valid data in all fields and does not enter CAC on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all fields and does not enter CAC in CONNECT TO A TEACHER text field
Then SAVE button is enabled
And CANCEL button is enabled
Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_ValidData_ExceptCAC|


@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent clicks Cancel button after providing all required information in Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
And Parent enters valid data in all fields in Add a Child window from home page
When parent clicks on Cancel button
Then child information given is not saved

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_CancelBtn|



@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent clicks Save button after providing all required information in Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
And Parent enters valid data in all fields in Add a Child window from home page
When parent clicks on Save button
Then child information given is saved

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_SaveBtn| 
    
  
@ConnectToTeacher
@DWCAPCOD-199
@Priority1
Scenario Outline:Parent clicks SUBMIT button after providing correct CAC number in Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
And parent enters correct CAC number in Connect to a Teacher text field
When parent clicks on SUBMIT button
Then correct teacher information is displayed below

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_SubmitBtn|



@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent clicks 'Find Your Teacher' link in Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When parent clicks on “Find Your Teacher” link
Then parent is navigated to “Connect To Teacher” window

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_AddaChildHomePage_FindYourTeacherLink|



@ConnectToTeacher
@DWCAPCOD-199
@Priority2
Scenario Outline:Parent clicks Close icon after providing all required information in Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
And Parent enters valid data in all fields in Add a Child window from home page
When parent clicks on close icon
Then “Add a Child” window is closed
And child information given is not saved

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_CloseIcon|    
      
