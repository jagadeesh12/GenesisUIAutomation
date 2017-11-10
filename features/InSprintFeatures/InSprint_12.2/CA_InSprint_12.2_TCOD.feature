Feature: InSprint_12.2
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    UNIQUE ITEM ID     				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        



Scenario Outline:Correct Unique Item ID should be seen for any item in PDP page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
When teacher search with valid item having unique item id from global search
Then teacher should be navigated to PDP page with correct unique item id

Examples:
  | UsingData                                                 |
  | InSprint_12.1:Dev35:Teacher_UniqueItemIds_GlobalSearch_PDP|
  
  
  
Scenario Outline:Select multiple items from Teacher Catalogues and checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher add multiple items from different teacher catalogues with unique item id number
And teacher sees correct item numbers in YTO page
And teacher proceed to checkout and lands on confirm & submit page
And teacher sees correct item numbers in confirm & submit page
When teacher submit the order
Then order is succefully submitted and teacher sees correct item numbers in confirmation page

Examples:
  | UsingData                                                    |
  | InSprint_12.1:Dev35:Teacher_Uniqueitemid_Multipleitems_Submit|
  
  
  
 Scenario Outline:Correct Unique Item ID should be seen for items in order history page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher add items from student clubs with normal item number
And teacher add items from student clubs with unique item id number
And teacher navigates to review cart page
And teacher sees correct item numbers in YTO page
And teacher proceed to checkout and lands on confirm & submit page
And teacher sees correct item numbers in confirm & submit page
And teacher submit the order
And order is succefully submitted and teacher sees correct item numbers in confirmation page
And teacher navigates to order history section under My Account page
When teacher clicks View Details link for any of ther orders present under Order History section
Then teacher sees correct item numbers in order history page

Examples:
  | UsingData                                                   |
  | InSprint_12.1:Dev35:Student_normal_uniqueitemid_items_submit|
  
  
Scenario Outline:Select any item from DTS model and checkout:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items with unique item id number to the cart with [minumum amount]
And teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher clicks on grade level dropdown and select a grade from dropdown
And teacher selects an item from the Make Selection window
And teacher clicks on Confirm Selection button
When teacher proceeds to checkout from rewards and coupons page
Then teacher see the items selected from Dollars to spend with unique item id in Rewards Section
And teacher submit the order
And teacher see the items selected from Dollars to spend with unique item id in Rewards Section on Confirmation page

Examples:
  | UsingData                                              |
  | InSprint_12.1:Dev35:Teacher_DTS_UniqueItemNumber_Submit|
  
  
Scenario Outline:Select any item from FreePick model and checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds student club items with unique item id number to the cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And Teacher enters [Free Pick Coupon]
And teacher clicks on grade level dropdown and select a grade from dropdown
And teacher selects an item from the Make Selection window
And teacher clicks on Confirm Selection button
When teacher proceeds to checkout from rewards and coupons page
Then Free pick is displayed in coupons section with unique item id in Confirm & Submit page
And teacher submit the order
And Free pick is displayed in coupons section with unique item id in Confirmation page
Examples:
  | UsingData                                              |
  | InSprint_12.1:Dev35:Teacher_FreePick_UniqueItemNumber_Submit|
  
  
  
#Scenario Outline:Search with any Unique Item ID from global search:[<UsingData>]
#
#Given teacher login into the application by providing [UserInformation]
#When teacher search with valid unique item id from global search
#Then teacher should be navigated to PDP page with correct item
#
#Examples:
#  | UsingData                                            |
#  | InSprint_12.1:Dev35:Teacher_UniqueItemId_GlobalSearch|
  
  
  
Scenario Outline:Select any item from Student Clubs without redemptions and checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher add items from student clubs with unique item id number
And teacher sees correct item numbers in YTO page
And teacher proceed to checkout and lands on confirm & submit page
And teacher sees correct item numbers in confirm & submit page
When teacher submit the order
Then order is succefully submitted and teacher sees correct item numbers in confirmation page

Examples:
  | UsingData                                            |
  | InSprint_12.1:Dev35:Student_uniqueitemid_items_submit|	
  
  
  
Scenario Outline:Correct Unique Item ID should be seen for any item in PDP Quick View window:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher search with valid item having unique item id from global search
When teacher clicks on Quick View option for any item present in Result page
Then teacher should be navigated to Quick View PDP page with correct item
And correct unique item id should be seen
Examples:
  | UsingData                                                   |
  | InSprint_12.1:Dev35:Teacher_UniqueItemIds_GlobalSearch_QuickViewPDP|
  
  
  
 
Scenario Outline:Select any item from Teacher Catalogues without redemptions and checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher add items from teacher catalogues with unique item id number
And teacher navigates to review cart page
And teacher sees correct item numbers in YTO page
And teacher proceed to checkout and lands on confirm & submit page
And teacher sees correct item numbers in confirm & submit page
When teacher submit the order
Then order is succefully submitted and teacher sees correct item numbers in confirmation page

Examples:
  | UsingData                                            |
  | InSprint_12.1:Dev35:Teacher_uniqueitemid_items_submit|  
  
  
  
    
    
  
  
  
         