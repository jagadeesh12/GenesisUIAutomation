Feature: InSprint_14.1 PCOD
	This feature is used to validate all scenarios

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-1553   	 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 
@DWCAPCOD-1553
@Parent_ShoppingCart
@ReviewCart
@Priority1
@Sprint-14.2   
Scenario Outline:Parent do not see 'Move to Wish List' hyperlink for any of the items added to shopping cart:[<UsingData>]

Given parent have valid credentials
And Parent login in with valid [username] and [password]
When parent add items to cart and navigate to shopping cart
Then parent should not see “Move to Wish List” hyperlink in shopping cart

Examples:
|UsingData|
|InSprint14.2:PCOD:ParentOrder_ShoppingCart_NoMoveToWishList|


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-100   	 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 
@DWCAPCOD-100
@SSO
@Priority1
@Sprint-14.2   
Scenario Outline:Enter Order Menu options:[<UsingData>]

Given teacher is connected to parent account
And teacher logs into the application by providing [UserInformation]
When teacher hovers over Enter Orders option present in home page
Then Student Flyer Orders, Student Online Orders, Your Teacher Order options displays
    
Examples:
|UsingData|
|InSprint14.2:PCOD:ParentOrder_Teacher_EnterOrder_Options|
