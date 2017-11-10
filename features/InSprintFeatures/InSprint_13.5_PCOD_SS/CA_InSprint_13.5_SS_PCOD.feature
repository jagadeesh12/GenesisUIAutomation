Feature: InSprint_13.5 PCOD
  This feature is used to validate all scenarios


  Background:
    Given Parent opens scholastic reading clubs e-commerce site


###################################################################################################################################################
###########################################   		    DWCAPCOD-540		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@Priority1
@DWCAPCOD-540
@Sprint-13.5
Scenario Outline: Parent enters Visa card information with saved card option selected:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
And parent selects “Add a new Card” from credit card dropdown
And parent enters valid data in all credit card fields entering Visa card number
And Save credit card option selected
When parent clicks on Continue Checkout
And parent navigates back to Shipping & Payment page
Then this card is shown as saved card in Credit card dropdown


Examples:
|UsingData|
|InSprint13.5:ParentOrder_CreditCard_AddNewCard_CA_Visa|


@Priority1
@DWCAPCOD-540
@Sprint-13.5
  Scenario Outline: Parent enters 2-series Master card information with saved card option selected:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Master card number
    And Save credit card option selected
    When parent clicks on Continue Checkout
    And parent navigates back to Shipping & Payment page
    Then this card is shown as saved card in Credit card dropdown

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_AddNewCard_CA_Master|


  @Priority1
  @DWCAPCOD-540
  @Sprint-13.5
  Scenario Outline: Parent enters 5-series Master card information with saved card option selected:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Master card number
    And Save credit card option selected
    When parent clicks on Continue Checkout
    And parent navigates back to Shipping & Payment page
    Then this card is shown as saved card in Credit card dropdown

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_AddNewCard_CA_Master5|

  @Priority1
  @DWCAPCOD-540
  @Sprint-13.5
  Scenario Outline: Parent enters Amex card information with saved card option selected:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Amex card number
    And Save credit card option selected
    When parent clicks on Continue Checkout
    And parent navigates back to Shipping & Payment page
    Then this card is shown as saved card in Credit card dropdown

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_AddNewCard_CA_Amex|


  @Priority1
  @DWCAPCOD-540
  @Sprint-13.5
  Scenario Outline: Parent submits order with saved visa card:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects saved visa card from credit card dropdown
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_savedCard_Visa|


  @Priority1
  @DWCAPCOD-540
  @Sprint-13.5
  Scenario Outline: Parent submits order with saved 2series Master card:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects saved 2-series Master card from credit card dropdown
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_SavedCard_Master2|


  @Priority1
  @DWCAPCOD-540
  @Sprint-13.5
  Scenario Outline: Parent submits order with saved 5series Master card:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects saved 5-series Master card from credit card dropdown
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_SavedCard_Master5|


  @Priority1
  @DWCAPCOD-540
  @Sprint-13.5
  Scenario Outline: Parent submits order with saved Amex card:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    And parent selects saved Amex card from credit card dropdown
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.5:ParentOrder_CreditCard_SavedCard_Amex|


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
