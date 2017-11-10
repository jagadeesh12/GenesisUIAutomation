Feature: BTS Release Test Scenarios
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    MARKETING LINKS              #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
    
 
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the PDP page when clicked on a PDP Marketing link:[<UsingData>]

Given teacher navigates to PDP Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on PDP of the item the teacher clicked through
Examples: 
  |UsingData                                   |
  |dev:TeacherOrder_Marketing_URL_PDPPage    |
  
  
  
#@Story-4099     
#@MarketingLinks
#@Priority1
#Scenario Outline:As a teacher, I want to be taken to the PDP page when the BTS modal is not completed and clicked on a PDP Marketing link:[<UsingData>]
#
#Given teacher navigates to PDP Marketing link
#And teacher logs into the application by providing [UserInformation]
#And BTS modal displays
#When teacher completes the missing information on BTS modal
#Then teacher lands on PDP of the item the teacher clicked through
#Examples: 
#  |UsingData                                   |
#  |dev:TeacherOrder_Marketing_URL_BTS        |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the PDP page through Marketing when incorrect credentials are entered on first attempt and login succesful on second attempt:[<UsingData>]

Given teacher navigates to PDP Marketing link
And teacher logs into the application by providing [Incorrect UserInformation]
When teacher logs into the application by providing [UserInformation]
Then teacher lands on PDP of the item the teacher clicked through
Examples: 
  |UsingData                                   |
  |dev:TeacherOrder_Marketing_URL_Relogin    |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the Category page when clicked on a Category Marketing link:[<UsingData>]

Given teacher navigates to Category Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on Category page the teacher clicked through
Examples: 
  |UsingData                                   |
  |dev:TeacherOrder_CategoryMarketing_Link   |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the Content page when clicked on a Content Marketing link:[<UsingData>]

Given teacher navigates to Content Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on Content page the teacher clicked through
Examples: 
  |UsingData                                  |
  |dev:TeacherOrder_ContentMarketing_Link   |
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   MY ACCOUNT ORDER CONFIRMATION PAGE     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
    
  

@Submitted 
@Priority1 
@MyAccount
Scenario Outline: As a Teacher, I would like to have the ability to see My Account dropdown and it should be clickable:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page1
And MyAccount dropdown displays on the header
When teacher clicks on My Account link
Then teacher should land on My Account page
    
 
Examples:
  |UsingData                                       |
  | dev:TeacherOrder_OrderConfirmation_MyAccount |
  
  
  
@Submitted 
@Priority1 
@MyAccount
Scenario Outline: As a Teacher, I would like to have the ability to view my profile information from Order confirmation page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And clicks on Profile from My Account dropdown
And teacher reads details and navigate back to home page
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page1
And MyAccount dropdown displays on the header
When teacher clicks on My Account link
Then teacher should land on My Account page
Examples:
      |UsingData                                       |
      |dev:TeacherOrder_OrderConfirmation_MyAccount_Profile |
      

@Submitted 
@Priority1 
@MyAccount     
Scenario Outline: As a Teacher, I would like to have the ability to logout from Order confirmation page:[<UsingData>]
  
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page1
And MyAccount dropdown displays on the header
When teacher clicks logout option from My Account dropdown
Then teacher should land on Login page
      
   
Examples:
|UsingData                                        |
| dev:TeacherOrder_MyAccount_Confirmation_Logout|



@Submitted 
@Priority1 
@MyAccount
Scenario Outline:As a Teacher, I would like to have the ability to navigate to Billing & Payments from Order Confirmation page to view my credit card info:[<UsingData>]
  
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And Teacher selects new credit card as payment with "save card to wallet" option checked
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page1
When teacher clicks on Billing & Payment from My Account dropdown
Then teacher should land on My Account page anchored to Billing & Payments section with saved card info that is added
      
   
  Examples:
  |UsingData                        |
  | dev:TeacherOrder_MyAccount_MyProfile_Confirmationpage|
  
  
  
Scenario Outline:As a Teacher, I would like to have the ability to view order history from Order Confirmation page:[<UsingData>]
  
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects checks as payment
And teacher clicks on "Continue checkout"
And teacher lands on confirm & submit page
And teacher submit the order
And teacher lands on Submitted page
When teacher clicks on Order History from My Account dropdown
Then teacher should land on My Account page anchored to Order History with this specific order information displayed (order number and amount due)      
   
  Examples:
  |UsingData                        |
  |dev:TeacherOrder_MyAccount_OrderHistory_Confirmationpage|
  
  
  

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   STORY 3699 - ITEM LABEL                #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

 
 
@ReviewCart-LineItemLabel
@Priority3 
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher catalogues total in all checkout pages:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
When Teacher navigates to Review Your Cart page
Then line time label for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher navigates to confirm and submit page from Review cart page
And line time label in Confirm and Submit page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher clicks on Submit Order
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   
  
  Examples:
  |UsingData                        |
  |dev:TeacherOrder_StudentTeacherClubs_Label_Checkout|  
    
    
    
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher club total in order history:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
And teacher clicks on Submit Order
When teacher navigates to my account page and click on view order under order history
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   

  
  Examples:
  |UsingData                        |
  |dev:TeacherOrder_StudentTeacherClubs_Label_OrderHistory|
  
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3342 CONFIRMATION PAGE UI     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
      

@Story3342
@Orderconfirmation
@Priority3
Scenario Outline: As a teacher, when I submit the order, the order confirmation page should be clear with respect to UI:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
When teacher clicks on Submit Order
And teacher lands on confirm & submit page
Then teacher should see home icon
And should not see Checkout label in the red bar
And should not see checkout phases


Examples:
  |UsingData                                |
  |dev:Sprint11.2:OrderConfirmationPage_UI|
  
@Story3342  
@Orderconfirmation
@Priority3  
Scenario Outline:As a teacher, when I click on home icon in order confirmation page, it should navigate to home page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
When teacher clicks on Submit Order
And teacher lands on confirm & submit page
When teacher clicks on home icon present on the top
Then teacher should be navigated back to home page

  
  Examples:
  |UsingData                                      |
  |dev:Sprint11.2:OrderConfirmationPage_HomeIcon  |
  
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3701 REWARDS SECTION MESSAGE  #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
   
  
@Story-3701  
@Reward_Message
@Priority3    
Scenario Outline:As a teacher, I should see proper wording in rewards section in all the order checkout pages:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
When Teacher navigates to rewards & coupons page
Then “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section
And “How is my Qualifying Order Value calculated” displays in Rewards section
And “Your Qualifying Order Value” should contain in Rewards section
And teacher proceeds checkout from rewards and coupons page
And “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section
And teacher submit the order
And “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section

  
  Examples:
  |UsingData                                       |
  |dev:Sprint11.2:RewardsSection_Message_Checkout|
  
  
@Story-3701  
@Reward_Message
@Priority3   
Scenario Outline:As a teacher, I should see proper wording in rewards section in order history:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher proceeds checkout from rewards and coupons page
And teacher submit the order
When teacher navigates to my account page and click on view order under order history
And “Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section

  
  Examples:
  |UsingData                                           |
  |dev:Sprint11.2:RewardsSection_Message_OrderHistory|       
  
    
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3919 SEARCH RESULTS           #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
  
  
Scenario Outline:Teacher should get user friendly page when searched anything which generates zero matches:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query for a product that does not match any items in the database
When search results are displayed [UserInformation]
Then the search result page displays Sorry no results page is displayed

Examples:
  | UsingData                                |
  | dev:Search_NoResult                           |
    
 
  Scenario Outline: Teacher should get user friendly page when searched anything which generated zero matches in already searched page:[<UsingData>]
 
  Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query in the search field which has more than 15 results
  When search results are presented with results set greater than the default 15 items and View All link
  And teacher have entered search query for a product that does not match any items in the database
  When search results are displayed [UserInformation]
  Then the search result page displays Sorry no results page is displayed
  
  Examples:
  | UsingData                                |
  | dev:Search_NoResult_fromSearchResultPage                        |
  
  

  Scenario Outline: Teacher, when searched with valid keyword in second search field should navigate to search result page:[<UsingData>]
 
 Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query for a product that does not match any items in the database
 When search results are displayed [UserInformation]
 Then the search result page displays Sorry no results page is displayed
 And Teacher have entered search query in the search field which return search result
 Then Search result page should display the searched item
 
 Examples:
  | UsingData                                |
  | dev:Search_NoResult_AgainSearchPage                      |
  
  
  
  
  
  
 ##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 2858 TOOL TIP LOGIN PAGE      #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
    



@Story-2858    
@ToolTipHome
@Priority1
Scenario Outline:Teacher should see the tool tip when tring to login with password as blank:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher enters user name leaving password field blank and click on login button
Then “Please enter your password” tooltip should display

Examples: 
  |UsingData                                 |
  |dev:TeacherLogin_Passwordblank_Error    |  
  
 
 
@Story-2858    
@ToolTipHome
@Priority1
Scenario Outline:Teacher should see the tool tip when tring to login with username as blank:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher enters password leaving user name field blank and click on login button
Then “Please enter your account number” tooltip should display

Examples: 
  |UsingData                                 |
  |dev:TeacherLogin_UserNameblank_Error    |
  
  
  
@Story-2858    
@ToolTipHome
@Priority1
Scenario Outline:Teacher should see only one tool tip when tring to login with invalid username and password:[<UsingData>]
  
Given teacher navigates to Reading Club Online login page by entering the URL
When teacher logs into the application by providing incorrect username and password
Then Only single tool tip for Login Error should be displayed
And teacher clears the username and click on login button
And only “Please enter your account number” tooltip should display


Examples: 
  |UsingData                                          |
  |dev:TeacherLogin_InvalidCredentials_UserNameBlank| 
    
  ##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    STORY 1880 Activation flow   #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   
  

  Scenario Outline: Teacher,should only be allowed to input Numeric VALID account numbers with 8 characters in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 And click on Next button
 Then Forgot Your Password Modal with Close button is dispalyed
 And teacher clicks Close to close the modal
 
 
 Examples:
  | UsingData                                |
  | dev:validaccountNumber                      |
    
 
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
  | dev:invalidaccountNumber                      |
    
 
 
 Scenario Outline: Teacher,should not be allowed to input account number which is not numeric in the Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 Then Account number field is blank

  
 
 Examples:
  | UsingData                                |
  | dev:invalidaccountNumber                      |
    

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    STORY 2856 -My Saved Cart    #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   



Scenario Outline: Teacher updates the quantity of item in save card, updated quantity should be reflected :[<UsingData>]
 
Given teacher login into the application by providing [UserInformation]
When teacher selects “enter classroom order” from home page
And teacher adds student club items to cart with [minumum amount]
When teacher clicks save cart, provides cart name and save
And quantity is updated and same reflects on cart

 Examples:
  | UsingData                                |
  | dev:MySavedCart                   |
  
 