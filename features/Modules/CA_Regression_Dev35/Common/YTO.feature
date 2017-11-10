Feature: YTO
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    YTO PAGE    		         #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################          


@YTO
@Priority1
Scenario Outline:Teacher has the ability to click - to remove items from cart on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	When teacher clicks on '-' in YTO page
	Then the item quantity is decreased by 1 in YTO page
	When Teacher navigates to Review Your Cart page
	Then the item quantiy is decreased by 1 in Review Your Cart page
	
Examples:
  | UsingData      		|
  | BTS:YTO:Teacher_Login_5 |
  
  
  
@YTO
@Priority1
Scenario Outline:Teacher has the ability to click + to add items to cart on YTO page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher adds items to the cart from Student clubs
	When teacher clicks on '+' in YTO page
	Then the item quantity is increased by 1 in YTO page
	When Teacher navigates to Review Your Cart page
	Then the item quantiy is increased by 1 in Review Your Cart page
	
Examples:
  | UsingData      		|
  | BTS:YTO:Teacher_Login_6 |  
  
  
  
#@YTO
#@Priority1
#Scenario Outline:Teacher can save the student name by entering name and clicking Enter:[<UsingData>]
  #
#Given teacher logs into the application by providing [UserInformation]
#	When teacher selects [enter classroom order] from home page
#	And Teacher enters the student name and hits ENTER
#	Then entered name is displayed in Student name field
#	
#Examples:
  #| UsingData       |
  #| BTS:YTO:Teacher_Login_7 | 
  
  
########################### Priority 3 #############################

@YTO
@Priority3
Scenario Outline:Teacher can get back to the same flyer and month which she was shopping on when clicks on browser back:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on any item title
	And Teacher clicks on See Full details link
	And Teacher clicks on browser back from PDP page
	Then Teacher lands on YTO on same flyer and month where she came from
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_8 |  
  
  
@YTO
@Priority3
Scenario Outline:Teacher can get back to same flyer and month which she was shopping for when she comes back from search results page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher searches for any term
	And Teacher clicks navigates back to YTO
	Then Teacher lands on YTO on same flyer and month where she came from
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_9 |
    

    
@YTO
@Priority3
Scenario Outline:Teacher should land on default flyer on YTO when selects a specific flyer and month and logout and login:[<UsingData>]
  
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on Logout
	And teacher logs into the application by providing [UserInformation]
	When Teacher navigates to YTO
	Then Teacher lands on YTO on default flyer current month
	
Examples:
  | UsingData       |
  | BTS:YTO:Teacher_Login_10 |
  
  
@YTO
@Priority2
Scenario Outline:Long Description should display on PDP:[<UsingData>]
				
Given teacher logs into the application by providing [UserInformation]
When teacher navigates to PDP of an item
Then teacher should see short description in “What makes this special”
And teacher should see long description in “About” section

Examples:
    |UsingData|	    
    |Dev35:Teacher_PDP_LongAndShortDescription|


  @YTO
  @Priority3
  @SCSCOD-4395
  Scenario Outline:Teacher should see correct downloadable link labels for any flyer under Early Childhood Elf catalog:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    When teacher clicks on Early Childhood Elf catalog and select any one of the flyer present under it
    Then downloadable flyer links labels should be “Student Flyer” and “Teacher Pages”

  Examples:
    | UsingData                                              |
    | InSprint_12.1:Dev35:Teacher_ELF_DownladableLinks_Labels|


  @YTO
  @Priority3
  @SCSCOD-4395
  Scenario Outline:Teacher should see correct downloadable link labels for any flyer under Grades 4&5 Arrow catalog:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    When teacher clicks on Grades 4&5 Arrow catalog and select any one of the flyer present under it
    Then downloadable flyer links labels should be “Student Flyer” and “Teacher Pages”

  Examples:
    | UsingData                                              |
    | InSprint_12.1:Dev35:Teacher_Grades4_5_Arrow_DownladableLinks_Labels|


  @YTO
  @Priority3
  @SCSCOD-4395
  Scenario Outline:Teacher should see correct downloadable link labels for any flyer under Teacher Catalogues:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    When teacher clicks on Teacher Catalogues and select any one of the flyer present under it
    Then downloadable flyer links labels should be “Student Flyer” and “Teacher Pages”

  Examples:
    | UsingData                                              |
    | InSprint_12.1:Dev35:Teacher_TeacherCatalogue_DownladableLinks_Labels|


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
    |InSprint_12.1:dev35:Teacher_MainMenu_Global|

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
    |InSprint_12.1:dev35:Teacher_MainMenu_Global_OrderHistoryPage|



  @SCSCOD-4375
  @ReviewCart
  @Priority2
  Scenario Outline:Teacher navigates to home page when clicked on home icon present in Review Cart page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And Teacher navigates to rewards & coupons page
    When teacher clicks on home page icon option present in main menu on top of the page
    Then teacher is navigated to home page

  Examples:
    |UsingData                                    |
    |InSprint_12.1:dev35:Teacher_HomeIcon_Homepage|



  @SCSCOD-4375
  @ReviewCart
  @Priority2
  Scenario Outline:Teacher navigates to YTO page when clicked on “ENTER ORDERS” option present in Review Cart page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
  # SS - Should not navigate to Coupon page in this case # And Teacher navigates to rewards & coupons page
    When teacher clicks on “ENTER ORDER” option present in main menu on top of the page
    Then teacher is navigated to YTO page

  Examples:
    |UsingData                                              |
    |InSprint_12.1:dev35:Teacher_ENTERORDER_YTOPage|


  @SCSCOD-4375
  @ReviewCart
  @Priority2
  Scenario Outline:Teacher navigates to Books and Resources page when clicked on “BOOKS & RESOURCES” present in Review Cart page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
  # SS - Should not navigate to Coupon page in this case #And Teacher navigates to rewards & coupons page
    When teacher clicks on “BOOKS & RESOURCES” option present in main menu on top of the page
    Then teacher is navigated to Books and Resources page

  Examples:
    |UsingData                                                        |
    |InSprint_12.1:dev35:Teacher_ShopBooksResources_BooksResourcesPage|



  @SCSCOD-4375
  @ReviewCart
  @Priority2
  Scenario Outline:Teacher navigates to Teacher's Desk page when clicked on “TEACHER'S DESK” option present in Review Cart page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
  # SS - Should not navigate to Coupon page in this case #And Teacher navigates to rewards & coupons page
    When teacher clicks on “TEACHER'S DESK” option present in main menu on top of the page
    Then teacher is navigated to Teacher's Desk page

  Examples:
    |UsingData                                                |
    |InSprint_12.1:dev35:Teacher_TeachersDesk_TeachersDeskPage|



  @SCSCOD-4373
  @ReviewCart
  @Priority2
  Scenario Outline:Teacher navigates to All Flyers page when clicked on “ALL FLYERS” option present in Review Cart page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And Teacher navigates to rewards & coupons page
    When teacher clicks on “ALL FLYERS” option present in main menu on top of the page
    Then teacher is navigated to All Flyers page

  Examples:
    |UsingData                                             |
    |InSprint_12.1:dev35:Teacher_AllFlyers_ShopAllFlyersePage|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		   SCSSCOD-4541    				 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################



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
    | InSprint_12.1:Dev35:Teacher_EmailFieldBlank_NextBtnDisabled|



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
    | InSprint_12.1:Dev35:Teacher_AccountNumberBlank_NextBtnDisabled|


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
    | InSprint_12.1:Dev35:Teacher_AccountNumberNotAssociatedToAccount_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_AccountNumberAssociatedToAccount_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailSpecialCharacters_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailParital_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailMissingUserName_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailMissing@Sign_ValidationMsg|



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
    | InSprint_12.1:Dev35:Teacher_EmailMissingDomain_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailMissing@Sign_Domain_ValidationMsg|



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
    | InSprint_12.1:Dev35:Teacher_GarbageEmail_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_Email@Sign2_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailLeadingDot_ValidationMsg|


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
    | InSprint_12.1:Dev35:Teacher_EmailTrailingDot_ValidationMsg|



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
    | InSprint_12.1:Dev35:Teacher_EmailMultipleDot_ValidationMsg|



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
    | InSprint_12.1:Dev35:Teacher_EmailUnicode_ValidationMsg|



