@ytonow
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
  | QA:YTO:Teacher_Login_5 |
  
  
  
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
  | QA:YTO:Teacher_Login_6 |  
  
  
  
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
#  | UsingData       |
#  | QA:YTO:Teacher_Login_7 | 
  

@YTO
@Priority3
Scenario Outline:Teacher can get back to the same flyer and month which she was shopping on when clicks on browser back:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on any item title
	And Teacher clicks on See Full details link
	And Teacher clicks on browser back from PDP page
	#Then Teacher lands on YTO on same flyer and month where she came from1
	
Examples:
  | UsingData       |
  | QA:YTO:Teacher_Login_8 |  
  
  
@YTO
@Priority3
Scenario Outline:Teacher can get back to same flyer and month which she was shopping for when she comes back from search results page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher searches for any term
#	And teacher selects [enter classroom order] from home page
	And Teacher clicks navigates back to YTO
	#Then Teacher lands on YTO on same flyer and month where she came from1
	
Examples:
  | UsingData       |
  | QA:YTO:Teacher_Login_9 |
    

    
@YTO
@Priority3
Scenario Outline:Teacher should land on default flyer on YTO when selects a specific flyer and month and logout and login:[<UsingData>]
  
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [enter classroom order] from home page
	And Teacher clicks on any flyer and month
	And Teacher clicks on Logout
	And teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
#	When Teacher navigates to YTO
	Then Teacher lands on YTO on default flyer current month
	
Examples:
  | UsingData       |
  | QA:YTO:Teacher_Login_10 |
  

@YTO
@Priority2
Scenario Outline:Long Description should display on PDP:[<UsingData>]
				
Given teacher logs into the application by providing [UserInformation]
When teacher navigates to PDP of an item
Then teacher should see short description in “What makes this special”
And teacher should see long description in “About” section

Examples:
    |UsingData|	    
    |QA:Teacher_PDP_LongAndShortDescription|   
    
#####################################12.1############################################

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
  |QA:Teacher_ELF_DownladableLinks_Labels|
  
  
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
  |QA:Teacher_Grades4_5_Arrow_DownladableLinks_Labels| 
  

#WE WILL NOT SEE TE CATALOGUE IN FLYERS NOW
#@YTO
#@Priority3
#@SCSCOD-4395  
#Scenario Outline:Teacher should see correct downloadable link labels for any flyer under Teacher Catalogues:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#When teacher clicks on Teacher Catalogues and select any one of the flyer present under it
#Then downloadable flyer links labels should be “Student Flyer” and “Teacher Pages”
#
#Examples:
  #| UsingData                                              |
  #|QA:Teacher_TeacherCatalogue_DownladableLinks_Labels|
  
  
  
@SCSCOD-4375
@YTO
@Priority2
Scenario Outline:Teacher navigates to YTO page when clicked on “ENTER ORDERS” option present in Review Cart page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds “ItemInformation” from YTO page
When teacher clicks on “ENTER ORDER” option present in main menu on top of the page
Then teacher is navigated to YTO page

Examples: 
|UsingData                                              |
|QA:Teacher_ENTERORDER_YTOPage|


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    YTO             			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Sprint12.3
  @YTO
  @Priority3

  Scenario Outline:navigated to specific grade's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on Early Childhood Elf flyer present under Grade section
    Then teacher is navigated to Early Childhood Elf flyer for current month in YTO page

  Examples:
    |UsingData                                                 |
    |QA:Teacher_AllFlyers_SpecGradesFlyerMonth|

  @Sprint12.3
  @YTO
  @Priority3
  Scenario Outline:Teacher is naviagted to special collection's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on Special Offers flyer present under Grade section
    Then teacher is navigated to special Offers flyer for current month in YTO page

  Examples:
    |UsingData                                                    |
    |QA:Teacher_AllFlyers_SpecialOffersFlyerMonth|

  @Sprint12.3
  @YTO
  @Priority3
  Scenario Outline:Teacher is naviagted to French Club's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on French Club flyer present under French section
    Then teacher is navigated to Club de lecture flyer for current month in YTO page

  Examples:
    |UsingData                                                  |
    |QA:Teacher_AllFlyers_FrenchClubsFlyerMonth|
    

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    YTO-15.1             		 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################
@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@3
Scenario Outline: Teacher can navigate to the Rewards and Redemption page with no items in cart when the hyperlink “Redeem your Coupons” is selected on Review Cart page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
When teacher selects the shopping cart icon with 0 items
And teacher selects the hyperlink “Redeem your Coupons”
Then teacher sees the Rewards and Redemption page
Examples:
| UsingData                                                       |
| QA:TCOD:ReviewCart_RedeemCouponsHyperlink_RewardsPage |

@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@2
Scenario Outline: The label for the “UPDATE CART” button is changed to “SAVE” on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
Then label for the "Update Cart" button is changed to "SAVE"
Examples:
| UsingData                        |
| QA:TCOD:YTO_SaveButton |

@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@4
Scenario Outline: Teacher can navigate to Redemptions page with no items in cart when the hyperlink “Redeem your Coupons” is selected on YTO page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher selects the hyperlink “Redeem your Coupons”
Then teacher sees the Rewards and Redemption page
Examples:
| UsingData                                                |
| QA:TCOD:YTO_RedeemCouponsHyperlink_RewardsPage |

@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@1
Scenario Outline: The link ‘By Flyer’ is selected by default when teacher navigates to the ‘Your Teacher Order’ page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
Then the link "By Flyer" is selected by default
Examples:
| UsingData                                   |
| QA:TCOD:YTO_ByFlyerOption_Default |