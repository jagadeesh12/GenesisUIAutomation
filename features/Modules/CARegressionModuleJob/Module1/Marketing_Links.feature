@CouponModify
Feature: MarketingLinks
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
    
 
#@Story-4099     
#@MarketingLinks
#@Priority1
#Scenario Outline:As a teacher, I want to be taken to the PDP page when clicked on a PDP Marketing link:[<UsingData>]
#
#Given teacher navigates to PDP Marketing link
#When teacher logs into the application by providing [UserInformation]
#Then teacher lands on PDP of the item the teacher clicked through
#Examples: 
  #|UsingData                                   |
  #|QA:TeacherOrder_Marketing_URL_PDPPage    |
  
  
  
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
#  |QA:TeacherOrder_Marketing_URL_BTS        |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:Marketing link displayed after login:[<UsingData>]
#As a teacher, I want to be taken to the PDP page through Marketing
# when incorrect credentials are entered on first attempt and login succesful on second attempt:[<UsingData>]

Given teacher navigates to PDP Marketing link
And teacher logs into the application by providing [Incorrect UserInformation]
When teacher logs into the application by providing [UserInformation]
Then teacher lands on PDP of the item the teacher clicked through
Examples: 
  |UsingData                                   |
  |QA:TeacherOrder_Marketing_URL_Relogin    |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the Category page when clicked on a Category Marketing link:[<UsingData>]

Given teacher navigates to Category Marketing link
When teacher logs into the application by providing [UserInformation]
Then teacher lands on Category page the teacher clicked through
Examples: 
  |UsingData                                   |
  |QA:TeacherOrder_CategoryMarketing_Link   |
  
  
  
@Story-4099     
@MarketingLinks
@Priority1
Scenario Outline:As a teacher, I want to be taken to the Content page when clicked on a Content Marketing link:[<UsingData>]

Given teacher navigates to Content Marketing link
#When teacher logs into the application by providing [UserInformation]
Then teacher lands on Content page the teacher clicked through
Examples: 
  |UsingData                                  |
  |QA:TeacherOrder_ContentMarketing_Link   |