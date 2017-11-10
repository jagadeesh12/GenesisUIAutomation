Feature: ReviewCart
	This feature is used to validate PCOD ReviewCart

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site



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
When teacher navigates to [Review Cart] page from Search results page
And added item is deleted from the cart

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
And parent clicks on YES button
Then added item is deleted from shopping cart

Examples:
|UsingData|
|InSprint13.2:PCOD:Parent_EditQuantity_Zero_ShoppingCart|



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
Then added item is deleted from shopping cart
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
###########################################   		    DWCAPCOD-150    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
   
@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent views the coupon code section:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent add item from PDP page and navigates to shopping cart page
Then Coupon code section displays with “HAVE A COUPON?” and text box to enter coupon code with default text
And Apply button displays
And a note “Please note: Only three Coupons can be applied to an order.”

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_CouponCodeSection|


@DWCAPCOD-105
@ReviewCart
@Priority2
Scenario Outline:Parent can enter letters, numbers, special characters in coupon code field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters letters in coupon code field
Then data is accepted and no error message is displayed
When parent enters numbers in coupon code field
Then data is accepted and no error message is displayed
When parent enters special characters along with numbers in coupon code field
Then data is accepted and no error message is displayed
When parent enters special characters along with letters in coupon code field
Then data is accepted and no error message is displayed

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_CouponCodecharactersAccepted|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent enters a non-existing coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters non-existing coupon code
And parent clicks “Apply” button
Then error message “The system does not recognize the coupon code you have entered. Please check the coupon and try again. If the coupon code is correct, please contact customer service at 1-800-SCHOLASTIC (1-800-724-6527).” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_Non-ExistingCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority2
Scenario Outline:Active/Inactive state of the Apply button for coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
And Apply button for coupon code is disabled by default
When parent enters 1 characters in coupon code
Then “Apply” button is enabled


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ActiveInactiveStateof_ApplyButton_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent can apply Free pick coupon on a cart with qualifying minimum amount:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart meeting the [minimum amount] from PDP page and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
Then Free pick modal displays

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ExistingCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent cannot apply already redeemed coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters already redeemed coupon code
Then error message “Our records indicate that coupon code "XXXXX" has already been redeemed.” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_RedeemedCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent cannot redeem expired coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters expired coupon code
Then error message “Our records indicate that coupon code "XXXXX" has expired.” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ExpiredCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent cannot redeem teacher freepick coupon:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters teacher freepick coupon code
Then error message “The system does not recognize the coupon code you have entered. Please check the coupon and try again. If the coupon code is correct, please contact customer service at 1-800-SCHOLASTIC (1-800-724-6527).” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_TeacherFreePickCouponCode_ShoppingCart|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-874   				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-874
@ReviewCart
@Priority1
Scenario Outline:Parent can apply Free pick coupon on the cart with qualifying minimum amount:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
And parent clicks “Apply” button
Then Free pick modal displays

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ValidCouponCode_MinimumAmt_ShoppingCart|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-356   				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent clicks through Pagination links on search results:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent searches for a keyword with more than 10 results
And parent clicks on Pagination links
Then 10 results display on each page

Examples:
| UsingData|
|InSprint13.3:PCOD:ParentOrder_FreepickCoupon_10resultsperpage|
      
      
      
@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Search on Freepick modal displays only items less than or equal to the coupon amount displays:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon] 
And Free pick modal displays
When parent searches for a [search term]
Then items less than or equal to the [coupon amount] displays in Freepick modal

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_CompareItemsPrice_SearchKeyword|
  
@DWCAPCOD-356
@ReviewCart
@Priority1 
Scenario Outline:Parent selects an item by searching for a qualifying item on Free pick modal:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And Free pick modal displays
When parent searches for a [qualifying Item number]
Then searched item(s) should display in result
When parent selects an item from the results
Then selected item displays in Current Selection section

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_QualifyingItemSearch|


@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent selects an item by searching with Author Name:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And Free pick modal displays
And parent searches for a [Author Name]
Then searched item(s) should display in result w.r.t author
When parent selects an item from the results
Then selected item displays in Current Selection section

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCouponQualifyingItemSearch_Author|


@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent selects an item by searching with Item title:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And Free pick modal displays
And parent searches for a [Item title]
Then searched item(s) should display in result
When parent selects an item from the results
Then selected item displays in Current Selection section

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCouponQualifyingItemSearch_Title|

      
      
@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent cannot be able to find a non-qualifying item on free pick modal:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent searches item which is greater than coupon amount
Then no results message displays
When parent searches teacher club item
Then no results message displays
When parent searches expired item
Then no results message displays

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_NonQualifyingItem|



@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:No results are displayed when teacher searches for a term with no results:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And parent searches for a [search term] with no results
Then no results message displays
    
Examples: 
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_NoResults|
      
      
      
            
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-875   				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-875
@ReviewCart
@Priority2
Scenario Outline:Parent clicks through Pagination links on Grade level results:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent selects a grade from grade dropdown
And parent clicks on Pagination links
Then 10 results display on each page
Examples:
|UsingData|
|InSprint13.3:PCOD:parentOrder_FreepickCouponresult|


@DWCAPCOD-875
@ReviewCart
@Priority1
Scenario Outline:Parent cannot find Teacher Club items in Grade level results on Free pick modal:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent clicks on grade level dropdown
Then teacher catalogues does not display in list of grades

Examples:
| UsingData|
|InSprint13.3:PCOD:ParentOrder_FreepickCoupon_teachercat|



@DWCAPCOD-875
@ReviewCart
@Priority1
Scenario Outline:Items displayed in Free pick modal must not exceed maximum dollar value:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
And parent clicks on grade level dropdown and select a grade from dropdown
Then items less than or equal to the [coupon amount] displays in Freepick modal

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_CompareItemsPrice_CouponAmt|


@DWCAPCOD-875
@ReviewCart
@Priority1
Scenario Outline:Parent cannot apply coupon on a cart which does not meet the minimum cart total:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page less than the [minimum amount] and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
Then error message “Your order does not meet the “XXXXX” coupon requirements. Please check the coupon for details.” displays

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_without_minimum_amount|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-330    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@ReviewCart
@DWCAPCOD-330
@Priority1
@Sprint-13.4
Scenario Outline:Parent reassings child for paid items:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And the items are assigned to the default child
When parent assigns few books to one child and the rest to different child
Then child dropdown on all the books are updated to the recently assigned child

Examples:
  |UsingData|
  |InSprint13.4:PCOD:ParentOrder_Reassign_PaidItems|


@ReviewCart
@DWCAPCOD-330
@Priority3
@Sprint-13.4
Scenario Outline:Order of Children in child dropdown:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
And the items are assigned to the default child
When parent clicks on child dropdown
Then all the children are listed in the dropdown
And the order in which the children are displayed are based on highest to lowest grade of the child

Examples:
  |UsingData|
  |InSprint13.4:PCOD:ParentOrder_ChildOrder_Dropdown|


@ReviewCart
@DWCAPCOD-330
@Priority1
@Sprint-13.4
Scenario Outline:Parent reassigns few items to child and rest of the items stay assigned to default child:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And the items are assigned to the default child
When parent clicks on child dropdown for few items
And reassigns them to a different child
Then all the items that are reassigned are now assigned to the re-assigned child
And the other items are still assigned to default child

Examples:
  |UsingData|
  |InSprint13.4:PCOD:ParentOrder_ChildOrder_Dropdown_Different|


@ReviewCart
@DWCAPCOD-330
@Priority1
@Sprint-13.4
Scenario Outline:Parent changes the child selection and returns back to shopping cart from shipping and payment page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And the items are assigned to the default child
And parent clicks on child dropdown for few items
And reassigns them to a different child
And parent navigates to Shipping & Payment page
When Parent navigates back to Shopping cart page from shipping & payment page
Then all the items that are reassigned are now assigned to the re-assigned child
And the other items are still assigned to default child

Examples:
  |UsingData|
  |InSprint13.4:PCOD:ParentOrder_ChildNameReassign_BackandForth|
  
  
  
###################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-106	     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Priority1
  @DWCAPCOD-106
  @Sprint-13.5
  Scenario Outline: Parent clicks on delete for the Freepick item:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [qualifying Item number]
    And parent selects an item from the results
    And parent clicks on Confirm Selection button
    When parent clicks on Delete
    Then Delete confirmation tooltip displays with Delete this item text with buttons YES and NO
  Examples:
    | UsingData                                        |
    | ParentOrder_FreePickCoupon_QualifyingItemSearch |

  @Priority2
  @ReviewCart
  @DWCAPCOD-106
  @Sprint-13.5
  Scenario Outline: Cancel on Freepick modal:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And parent selects a grade
    And parent selects an item from modal
    When parent clicks Cancel in freepick modal window
    Then Coupon is removed from the cart

  Examples:
    |UsingData|
    |BTS:FreePick:TeacherOrder_FreePickCoupon_Cancel|

  @Priority2
  @ReviewCart
  @DWCAPCOD-106
  @Sprint-13.5
  Scenario Outline: Parent clicks on delete - NO for the Freepick item:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [qualifying Item number]
    And parent selects an item from the results
    And parent clicks on Confirm Selection button
    When parent clicks on Delete
    And clicks on NO
    Then Free pick item is not deleted
    And is retained in its original state
  Examples:
    | UsingData                                        |
    | ParentOrder_FreePickCoupon_QualifyingItemSearch1 |


  @Priority1
  @DWCAPCOD-106
  @Sprint-13.5
  Scenario Outline: Parent clicks on delete - YES for the Freepick item :[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [qualifying Item number]
    And parent selects an item from the results
    And parent clicks on Confirm Selection button
    When parent clicks on Delete
    And clicks on YES
    Then Free pick item is deleted from cart
    And the coupon is also removed
  Examples:
    | UsingData                                        |
    | ParentOrder_FreePickCoupon_QualifyingItemSearch2 |  
  
  
  
  
  
##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-1184 		         #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################



  @Priority2
  @DWCAPCOD-1184
  @Sprint-14.1
  @ReviewCart
  Scenario Outline: Edit View of Freepick modal:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent selects a grade from grade dropdown
    And parent selects an item from the results
    #And selected item displays in Current Selection section
    And selected item displays in Current Selection section for Freepick
    And parent clicks on Confirm Selection button
    When parent clicks on edit option of Freepick
    Then free pick modal displays with the selected item displayed in the current selection section
  Examples:
    | UsingData                   |
    | ParentOrder_EditView_FreePickCoupon |


  @Priority2
  @DWCAPCOD-1184
  @Sprint-14.1
  @ReviewCart
  Scenario Outline: Parent edits free pick:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [keyword]
    And parent selects an item from the results
    #And selected item displays in Current Selection section
    And selected item displays in Current Selection section for Freepick
    And parent clicks on Confirm Selection button
    When parent clicks on edit option of Freepick
    And parent selects a different grade from dropdown
    And parent selects a different item from Free Pick modal window
    And parent clicks on Confirm Selection button
    Then the recently selected free pick item information is shown on Shopping cart page

  Examples:
    | UsingData                   |
    | ParentOrder_Edit_FreePickCoupon1 |


  @Priority2
  @DWCAPCOD-1184
  @Sprint-14.1
  @ReviewCart
  Scenario Outline: Parent deletes the freepick item on Edit free pick modal:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [keyword]
    And parent selects an item from the results
    #And selected item displays in Current Selection section
    And selected item displays in Current Selection section for Freepick
    And parent clicks on Confirm Selection button
    When parent clicks on edit option of Freepick
    And deletes the item from current selection section
    Then Confirm selection button is disabled
    And there is no way for the user to proceed without selecting freepick item

  Examples:
    | UsingData                   |
    | ParentOrder_Edit_FreePickCoupon2 |


  @Priority2
  @DWCAPCOD-1184
  @Sprint-14.1
  @ReviewCart
    Scenario Outline: Parent chooses a different book and click on close :[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart meeting the [minimum amount]
    And parent navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [keyword]
    And parent selects an item from the results
    #And selected item displays in Current Selection section
    And selected item displays in Current Selection section for Freepick
    And parent clicks on Confirm Selection button
    When parent clicks on edit option of Freepick
    And parent selects a different grade from dropdown
    And parent selects a different item from Free Pick modal window
    And parent clicks on Close
    Then the recently selected free pick item information is not saved

  Examples:
    | UsingData                   |
    | ParentOrder_Edit_FreePickCoupon3|  
