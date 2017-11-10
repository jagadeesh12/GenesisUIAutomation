Feature: InSprint_13.2 PCOD
	This feature is used to validate all scenarios

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-350    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
   
@ReviewCart
@DWCAPCOD-350
@Priority1
Scenario Outline:Adding items from PDP page with default quantity:[<UsingData>]     

Given Parent login in with valid [username] and [password]
And parent searches with valid item
And PDP of the item displays
And quantity of the item should be 1 by default
When parent clicks on “ADD TO CART” button
And parent clicks on “GO TO CHECKOUT” button
Then item added from PDP page should display in review cart page along with title, flyer, price and quantity

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_PDPPage|



@ReviewCart
@DWCAPCOD-350
@Priority1
Scenario Outline:Adding items from PDP page by modifying the quantity:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
And modify the quantity of the item
When parent clicks on “ADD TO CART” button
And parent clicks on “GO TO CHECKOUT” button
Then item added from PDP page should display in review cart page along with title, flyer, price and quantity

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_ModifyQty_PDPPage|



@ReviewCart
@DWCAPCOD-350
@Priority1
Scenario Outline:Adding items from PDP page with maximum quantity:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
And update the quantity with maximum value
When parent clicks on “ADD TO CART” button
And parent clicks on “GO TO CHECKOUT” button
Then item added from PDP page should display in review cart page along with title, flyer, price and quantity

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_MaximumQty_PDPPage|


@ReviewCart
@DWCAPCOD-350
@Priority2
Scenario Outline:Adding items from PDP page making the quantity as zero:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
And update the quantity to zero
When parent clicks on “ADD TO CART” button
Then quantity should change to 1
And parent clicks on “GO TO CHECKOUT” button
Then item added from PDP page should display in review cart page along with title, flyer, price and quantity

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_ZeroQty_PDPPage|



@ReviewCart
@DWCAPCOD-350
@Priority3
Scenario Outline:Parent clicks close icon in 'ADD TO CART' modal window:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
And parent enters desired quantity
And parent clicks on “ADD TO CART” button
When parent clicks close icon present in “ADD TO CART” modal window
Then “ADD TO CART” modal window should close
And stays back in PDP page
And updated quantity should remain in quanity field

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_CloseIcon_PDPPage|


@ReviewCart
@DWCAPCOD-350
@Priority1
Scenario Outline:Parent clicks 'CONTINUE SHOPPING' button in PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
And parent enters desired quantity
And parent clicks on “ADD TO CART” button
When parent clicks on “CONTINUE SHOPPING” button
Then “ADD TO CART” modal window should close
And item added should update in cart
And stays back in PDP page

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_ContinueShopping_PDPPage|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-535    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        



@ReviewCart
@DWCAPCOD-535
@Priority1
Scenario Outline:Parent view items in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item
And PDP of the item displays
And parent clicks on “ADD TO CART” button
When parent clicks “GO TO CHECKOUT” button
Then parent is navigated to shopping cart page
And correct item title is present
And correct item price is present
And correct quantity is present
And correct item total price is present
And correct total items and order total is present

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_ShoppingCart|



@ReviewCart
@DWCAPCOD-535
@Priority2
Scenario Outline:Parent add same item twice and navigate to review cart page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item
And PDP of the item displays
And parent clicks on “ADD TO CART” button
When parent clicks “GO TO CHECKOUT” button
Then parent is navigated to shopping cart page
And correct item title, price, quantity, total price, total items and order total is seen
And parent searches with same item
And PDP of the item displays
And parent clicks on “ADD TO CART” button
When parent clicks “GO TO CHECKOUT” button
Then parent is navigated to shopping cart page
And correct item title, price, updated quantity, updated total price, updated total items and updated order total is seen

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddSameItemTwice_ShoppingCart|



@ReviewCart
@DWCAPCOD-535
@Priority3
Scenario Outline:Parent see 'BACK TO SHOP' link and 'PROCEED TO CHECKOUT' button in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item
And PDP of the item displays
And parent clicks on “ADD TO CART” button
When parent clicks “GO TO CHECKOUT” button
Then parent is navigated to shopping cart page
And parent sees “BACK TO SHOP” link and “PROCEED TO CHECKOUT” button


Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_AddItem_BackToShop_ProceedToCheckout_ShoppingCart|
   

@ReviewCart
@DWCAPCOD-535
@Priority1
Scenario Outline:Parent clicks 'BACK TO SHOP' link present in review cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item
And PDP of the item displays
And parent clicks on “ADD TO CART” button
And parent clicks “GO TO CHECKOUT” button
And parent is navigated to shopping cart page
When parent clicks on “BACK TO SHOP” link
Then parent is navigated back to home page

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_BackToShopLink_ShoppingCart|


@ReviewCart
@DWCAPCOD-535
@Priority1
Scenario Outline:Parent clicks on 'PROCEED TO CHECKOUT' button present in review cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item
And PDP of the item displays
And parent clicks on “ADD TO CART” button
And parent clicks “GO TO CHECKOUT” button
And parent is navigated to shopping cart page
When parent clicks on “PROCEED TO CHECKOUT” button
Then parent is navigated Shipping & Payment page

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_ProceedToCheckOutBtn_ShoppingCart|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-331    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@ReviewCart
@DWCAPCOD-331
@Priority1
Scenario Outline:Parent update the quantity and tabout in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent edit the quantity and tabout
Then updated quantity is displayed in quantity field
And total price is updated correctly
And total items and order total is updated correctly

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_EditQuantity_ShoppingCart|



@ReviewCart
@DWCAPCOD-331
@Priority2
@NotYetImplemented
Scenario Outline:Parent edits the quantity to negative value in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent edit the quantity to any negative value and click outside of quantity field
Then negative value is not accepted and postive value is updated in quantity field
And total price is updated correctly
And total items and order total is updated correctly

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_EditNegativeQuantity_ShoppingCart|


@ReviewCart
@DWCAPCOD-331
@Priority2
@NotYetImplemented
Scenario Outline:Parent cannot enter more than 3 digits in quantity field in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent tries to edit the quantity to more than 3 digits
Then quantity field does not accept more than 3 digits

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_EditQuantity_MoreThan3Digits_ShoppingCart|


@ReviewCart
@DWCAPCOD-331
@Priority2
Scenario Outline:Parent edits the quantity to zero in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent edits the quantity to zero and click outside of quantity field
Then item is deleted from shopping cart

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_EditQuantity_Zero_ShoppingCart|





##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-332    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@ReviewCart
@DWCAPCOD-332
@Priority1
Scenario Outline:Parent tries to delete only item present in shopping cart by clicking NO button from delete modal window:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent clicks on Delete option for item added
And clicks on NO button in delete modal window
Then item is not deleted from shopping cart

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DeleteItem_No_ShoppingCart|


@ReviewCart
@DWCAPCOD-332
@Priority2
Scenario Outline:Parent delete single item in shopping cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add multiple items from PDP page and navigates to shopping cart page
When parent clicks on Delete option for any one item
And clicks on YES button in delete modal window
Then that particular item is deleted from the cart
And correct total items and Order Total should display
And “BACK TO SHOP” link is enabled
And “PROCEED TO CHECKOUT” button is enabled

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DeleteSingleItem_Yes_ShoppingCart|



@ReviewCart
@DWCAPCOD-332
@Priority1
Scenario Outline:Parent tries to delete only item present in shopping cart by clicking YES button from delete modal window:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent clicks on Delete option for item added
And clicks on YES button in delete modal window
Then item is deleted from the cart
And “You currently have no items in your cart.” text is seen in shopping cart
And total items and Order Total should show as zero
And “BACK TO SHOP” link is enabled
And “PROCEED TO CHECKOUT” button is disabled

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DeleteItem_Yes_ShoppingCart|




##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-538    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################

@HomePage
@DWCAPCOD-538
@Priority1
Scenario Outline:Child associated to highest grade is seen as default child in 'Child in Teacher Class' drop down:[<UsingData>]

Given Parent login in with valid [username] and [password] having multiple children
When parent is in homepage
Then parent see child associated to highest grade as default in “Child in Teacher Class” drop down

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DefaultChild_HighestGrade|



@HomePage
@DWCAPCOD-538
@Priority1
Scenario Outline:Child added first is seen as default in 'Child in Teacher Class' drop down when more than two childs are associated to same highest grade:[<UsingData>]

Given Parent login in with valid [username] and [password] having multiple children associated to same highest grade
When parent is in homepage
Then parent see initially added child having highest grade as default in “Child in Teacher Class” drop down

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_DefaultChild_HighestGradeMultipleChildren|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-538    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################


@ConnectToTeacher
@DWCAPCOD-557
@Priority2
Scenario Outline:Parent enter required information and select grade by using arrow keys on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid first name and last name in “Add a Child” modal window
And selects grade by using arrow keys and click ENTER button
Then SAVE button is enabled
And CANCEL button is enabled

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_GradeArrowKeys|


@ConnectToTeacher
@DWCAPCOD-557
@Priority1
Scenario Outline:Parent provides required information and enters CAC number less than 5 digts on Add a Child modal from homepage:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
When Parent enters valid data in all fields except CAC in CONNECT TO A TEACHER text field
And parent enters CAC with less than 5 digits
Then Submit button should be disabled
And SAVE button is not enabled
And CANCEL button is enabled

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_CAC_LessThan5Digits|


@ConnectToTeacher
@DWCAPCOD-557
@Priority2
Scenario Outline:Clicking Save button in 'Add a Child' window should redirect to home page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent clicks on “Add a Child” link present in home page
And Parent enters valid data in all fields in Add a Child window from home page
When parent clicks on Save button
Then parent is redirected to home page

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_ConnectYourTeacher_AddaChildHomePage_SaveBtn_HomePage|







