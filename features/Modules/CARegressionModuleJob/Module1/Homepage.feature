@CouponModify
Feature: Homepage
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    STORY 1880 Activation flow   #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   
  
@Homepage
Scenario Outline: input Numeric VALID account numbers with 8 characters in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 And click on Next button
 Then Forgot Your Password Modal with Close button is dispalyed
 And teacher clicks Close to close the modal
 
 
 Examples:
  | UsingData                                |
  | QA:validaccountNumber                      |
    
 
 @Homepage
 Scenario Outline: Teacher,enters Invalid Numeric account numbers in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 And  click on Next button 
 Then Account Not found modal is displayed with Back Button
 And teacher clicks Back, which brings back the Activate Your Account Modal
 
 
 Examples:
  | UsingData                                |
  | QA:invalidaccountNumber                      |
    
 
 @Homepage
 Scenario Outline: input account number which is not numeric in the Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 Then Account number field is blank

  
 
 Examples:
  | UsingData                                |
  | QA:invalidaccountNumber                      |
  
  ######################### 11.5##################################

@SCSCOD-4009
@TeacherDesk
@Priority2
Scenario Outline:Order Details page for recent booking when clicked on View link present in YOUR ORDERS in Teacher's Desk:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
  And teacher adds “ItemInformation” from YTO page
  And teacher navigates to payment page
  And teacher selects checks as payment
  And teacher clicks on "Continue checkout"
  And teacher lands on confirm & submit page
  And teacher submit the order
And teacher navigates to Teachers Desk
When teacher clicks on View link
Then teacher should navigate to order details page for recent booking

Examples:
  | UsingData                                                           |
  | QA:TeacherOrder_TeacherDesk_CurrentMonthRewardsLink|
  
  
  
@SCSCOD-4009
@TeacherDesk 
@Priority2
Scenario Outline:Submitted to Scholastic and Shipped options should not be highlighted:[<UsingData>]
#Submitted to Scholastic and Shipped options should not be highlighted in
# YOUR ORDERS section in Teacher's Desk if no orders are submitted:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
When teacher navigates to Teacher's Desk from home page
Then no information should be displayed under "Order Status" section
And Submitted to Scholastic and Shipped options should not be highlighted

Examples:
  | UsingData                                              |
  | QA:TeacherOrder_OrderStatus_NewTeacher|
  
  

@SCSCOD-4009
@TeacherDesk
@Priority2
Scenario Outline:Submitted to Scholastic option should be highlighted in YOUR ORDERS section in Teacher's Desk if any order is submitted:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
  And teacher adds “ItemInformation” from YTO page
  And teacher navigates to payment page
  And teacher selects checks as payment
  And teacher clicks on "Continue checkout"
  And teacher lands on confirm & submit page
  And teacher submit the order
  And teacher lands on Submitted page1
When teacher navigates to Teachers Desk
Then referenec number and submitted date should be displayed under "Order Status" section for recent order
And Submitted to Scholastic option should be highlighted
And Shipped option should not be highlighted

Examples:
  | UsingData                                              |
  | QA:TeacherOrder_OrderStatus_SubmittedToScholastic|
  
  

@SCSCOD-4009
@TeacherDesk
@Priority2
Scenario Outline:Shipped option should be highlighted in YOUR ORDERS section in Teacher's Desk if any order is shipped which is booked:[<UsingData>]

Given teacher whose order is shipped logs into the application by providing [UserInformation]
When teacher navigates to Teacher's Desk from home page
Then Submitted to Scholastic and Shipped options should be highlighted

Examples:
  | UsingData                                           |
  | QA:TeacherOrder_OrderStatus_Shipped|  
  
  
  #########################12.1#################################################
@SCSCOD-4604
@Homepage
@Priority3      
Scenario Outline:Hint label under Account Number field in Activate Your Account window should not be seen:[<UsingData>]

Given teacher open rco-scholastic web site 
When teacher clicks on the Activate Your Account button
Then hint label under Account Number field i.e. “Maximum 8 characters” should not be seen

Examples:
  | UsingData                                          |
  | QA:Teacher_HintLabel_AccountNumber|
  
  
@SCSCOD-4375
@Homepage
@Priority1  
Scenario Outline:Main Menu is visible and active on Home, YTO, Review Cart pages:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
When teacher is in home page
Then Home icon, ENTER ORDERS, BOOKS & RESOURCES, ALL FLYERS and TEACHER'S DESK options should be present
And teacher navigates to YTO page
And Home icon, ENTER ORDERS, BOOKS & RESOURCES, ALL FLYERS and TEACHER'S DESK options should be present
And teacher navigates to Review Your Cart page
And Home icon, ENTER ORDERS, BOOKS & RESOURCES, ALL FLYERS and TEACHER'S DESK options should be present

Examples: 
|UsingData                                  |
|QA:Teacher_MainMenu_Global|  

@SCSCOD-4375
@MyAccount
@Priority1
Scenario Outline:Main Menu is visible and active on Order History Details page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to order history section under My Account page
When teacher clicks View Details link for any of ther orders present under Order History section
Then Home icon, ENTER ORDERS, BOOKS & RESOURCES, ALL FLYERS and TEACHER'S DESK options should be present

Examples: 
|UsingData                                  |
|QA:Teacher_MainMenu_Global_OrderHistoryPage|

@SCSCOD-4375
@ReviewCart
@Priority2
Scenario Outline:Teacher navigates to home page when clicked on home icon present in Review Cart page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds “ItemInformation” from YTO page
#And teacher navigates to Review Your Cart page
When teacher clicks on home page icon option present in main menu on top of the page
Then teacher is navigated to home page

Examples: 
|UsingData                                    |
|QA:Teacher_HomeIcon_Homepage|

@SCSCOD-4541
@MyAccount
@Priority2
Scenario Outline:Next button should be disabled if account number is entered and email field is left blank in Activate Your Account window:[<UsingData>]
Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
And Activate Your Account modal should be dispalyed with Account Number field, Email address field and Next Button
When teacher enters the account number leaving email field blank
Then Next button should be disabled

Examples:
  | UsingData                                                  |
  | QA:Teacher_EmailFieldBlank_NextBtnDisabled|
  
  

@SCSCOD-4541
@MyAccount
@Priority2
Scenario Outline:Next button should be disabled if email field is entered and account number is left blank in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters the email field leaving account number blank
Then Next button should be disabled

Examples:
  | UsingData                                                     |
  | QA:Teacher_AccountNumberBlank_NextBtnDisabled|
  
  
@SCSCOD-4541
@MyAccount
@Priority2  
Scenario Outline:Proper validation message should be seen if email address entered is not associated to particular account number:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email address which is not associated to this account
And click on Next button
Then “The information entered does not match our records. Please check to ensure the correct email address is being entered for the account number provided.” is displayed
And Back button should be present
Examples:
  | UsingData                                                                    |
  | QA:Teacher_AccountNumberNotAssociatedToAccount_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority2
Scenario Outline:Proper validation message should be seen if email address entered is associated to particular account number:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email address which is associated to this account
And click on Next button
Then “We've sent an email with a link to reset your password. Please check your email.” is displayed

Examples:
  | UsingData                                                                    |
  | QA:Teacher_AccountNumberAssociatedToAccount_ValidationMsg1|
  
  

@SCSCOD-4541
@MyAccount
@Priority3
Scenario Outline:Proper validation message should be seen if email is entered with special characters in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email address with special characters and tab out
Then “Please enter a valid email address.” is displayed
Examples:
  | UsingData                                                       |
  | QA:Teacher_EmailSpecialCharacters_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority3  
Scenario Outline:Proper validation message should be seen if email is partially entered in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and partial email address and tab out
Then “Please enter a valid email address.” is displayed  
Examples:
  | UsingData                                             |
  | QA:Teacher_EmailParital_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority3   
Scenario Outline:Proper validation message should be seen with missing username in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with missing username and tab out
Then “Please enter a valid email address.” is displayed  
Examples:
  | UsingData                                                     |
  | QA:Teacher_EmailMissingUserName_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority3  
Scenario Outline:Proper validation message should be seen with missing '@' sign in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with missing '@' sign and tab out
Then “Please enter a valid email address.” is displayed 
Examples:
  | UsingData                                                  |
  | QA:Teacher_EmailMissing@Sign_ValidationMsg|
  
  
  
@SCSCOD-4541
@MyAccount
@Priority3  
Scenario Outline:Proper validation message should be seen with missing domain in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with missing domain and tab out
Then “Please enter a valid email address.” is displayed  
Examples:
  | UsingData                                                   |
  | QA:Teacher_EmailMissingDomain_ValidationMsg| 
  
  
@SCSCOD-4541
@MyAccount
@Priority3
Scenario Outline:Proper validation message should be seen with missing '@' sign and domain in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with missing '@' sign and domain and tab out
Then “Please enter a valid email address.” is displayed
Examples:
  | UsingData                                                         |
  | QA:Teacher_EmailMissing@Sign_Domain_ValidationMsg|                    

  
  
@SCSCOD-4541
@MyAccount
@Priority3
Scenario Outline:Proper validation message should be seen with garbage in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and garbage email and tab out
Then “Please enter a valid email address.” is displayed
Examples:
  | UsingData                                             |
  | QA:Teacher_GarbageEmail_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority3
Scenario Outline:Proper validation message should be seen with two '@' sign in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with missing two '@' signs and tab out
Then “Please enter a valid email address.” is displayed 
Examples:
  | UsingData                                            |
  | QA:Teacher_Email@Sign2_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority3
Scenario Outline:Proper validation message should be seen with leading dot in address in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with leading dot and tab out
Then “Please enter a valid email address.” is displayed 
Examples:
  | UsingData                                                |
  | QA:Teacher_EmailLeadingDot_ValidationMsg|
  
  
@SCSCOD-4541
@MyAccount
@Priority3 
Scenario Outline:Proper validation message should be seen with trailing dot in address in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with trailing dot and tab out
Then “Please enter a valid email address.” is displayed 
Examples:
  | UsingData                                                 |
  | QA:Teacher_EmailTrailingDot_ValidationMsg|
  
  
  
@SCSCOD-4541
@MyAccount
@Priority3 
Scenario Outline:Proper validation message should be seen with multiple dots in address in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with multiple dots and tab out
Then “Please enter a valid email address.” is displayed 
Examples:
  | UsingData                                                 |
  | QA:Teacher_EmailMultipleDot_ValidationMsg|
  
  
  
@SCSCOD-4541
@MyAccount
@Priority3
Scenario Outline:Proper validation message should be seen with unicode address in email field in Activate Your Account window:[<UsingData>]

Given teacher open rco-scholastic web site 
And teacher clicks on the Activate Your Account button
When teacher enters correct account number and email with unicode address and tab out
Then “Please enter a valid email address.” is displayed
Examples:
  | UsingData                                             |
  | QA:Teacher_EmailUnicode_ValidationMsg|


