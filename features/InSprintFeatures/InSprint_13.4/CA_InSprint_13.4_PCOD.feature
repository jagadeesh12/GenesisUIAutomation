Feature: InSprint_13.4 PCOD
  This feature is used to validate all scenarios


  Background:
    Given Parent opens scholastic reading clubs e-commerce site

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



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-358    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  Scenario Outline:Parent reassigns the child for freepick item:[<UsingData>]


    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [Item title]
    And parent selects item from the results
    And selected item displays in Current Selection section for Freepick
    And parent clicks on Confirm Selection button
    And the selected item is assigned to the default child
    When parent selects a different child from the dropdown for the freepick item
    Then the free pick item is assigned to the reassigned child

  Examples:
    |UsingData|
    |InSprint13.4:PCOD:ParentOrder_Reassign_FreePickItem|


  Scenario Outline:Display of freepick item on Shopping cart page:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And Free pick modal displays
    And parent searches for a [qualifying Item number]
    And parent selects an item from the results
    And selected item displays in Current Selection section for Freepick
    When parent clicks on Confirm Selection button
    Then the selected item displays under the paid item on shopping cart page
    And the item image, item title, Book type(paper back or hard cover), Grade & Age, Reading level displays
    And stricked price of the item and term FREE displays
    And Child dropdown with default child selected and list of children in dropdown displays
    And Quantity 1 in disabled state displays
    And Delete link displays under the Quantity
    And Total FREE and Coupon code displays
    And Edit link displays under the coupon code

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_FreePickItem_Added|



  Scenario Outline:Free pick coupon is removed when parent deletes items from cart making cart non-qualifying:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    When parent enters [Free Pick Coupon]
    And parent searches for a [qualifying Item number]
    And parent selects an item from modal
    And parent clicks on Confirm Selection button
    When parent deletes item from cart making cart total fall below [minimum amount]
    Then coupon is automatically removed from the cart

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_FreePickCoupon_Removed|


  Scenario Outline:Confirm Selection button is disabled when freepick is deleted from Curent selection section:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And parent selects a grade from grade dropdown
    And parent selects an item
    When parent deletes the item from Current Selection section
    Then confirm selection button is disabled

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_FreepickCoupon_ConfirmSelectionDisabled|


  Scenario Outline:Close on Freepick modal:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And parent selects a grade from grade dropdown
    And parent selects an item
    When parent clicks on close button
    Then Coupon is removed from the cart

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_FreepickCoupon_CloseBtn|


  Scenario Outline:Cancel on Freepick modal:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And parent selects a grade
    And parent selects an item from modal
    When parent clicks Cancel in freepick modal window
    Then Coupon is removed from the cart

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_FreepickCoupon_CancelBtn|


  Scenario Outline:Parent changes the child selection on Freepick item:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
    And parent enters [Free Pick Coupon]
    And parent selects a grade
    And parent selects an item from modal
    And parent clicks on Confirm Selection button
    And the freepick item is assigned to default child
    When parent selects a different child from the dropdown
    Then freepick item is assigned to the recently selected child

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_FreepickCoupon_ReassignChild|




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-365    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent views footer on order checkout:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent navigates to Shipping & Payment page
Then Ordercheckout footer displays with Scholastic.ca, About Scholastic, Careers,International, PRIVACY POLICY, WEB PRIVACY POLICY, TERMS OF USE TM ® & © 2017 Scholastic Inc. All Rights Reserved

Examples:
  |UsingData|
  |InSprint13.4:PCOD:ParentOrder_OrderCheckoutFooter|


@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on Scholastic.ca from footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on Scholastic.ca from the footer
Then parent is redirected to http://www.scholastic.ca/

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_scholasticca|


@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on About Scholastic from footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on About Scholastic from the footer
Then parent is redirected to http://www.scholastic.ca/aboutscholastic/

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_AboutScholastic|

@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on Careers from Footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on Careers from the footer
Then parent is redirected to http://www.scholastic.ca/aboutscholastic/careers.php

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_Careers|

@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on International from the footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on International from the footer
Then parent is redirected to http://www.scholastic.ca/aboutscholastic/businesses_worldwide.php

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_International|

@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on Privacy Policy from the footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on Privacy policy from the footer
Then parent is redirected to http://www.scholastic.ca/aboutscholastic/privacy.php

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_privacypolicy|

@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on Web Privacy policy from the footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on Web Privacy policy from the footer
Then parent is redirected to http://www.scholastic.ca/aboutscholastic/webprivacy.php

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_WebPrivacyPolicy|


@ShippingAndPayment
@DWCAPCOD-365
@Priority3
@Sprint-13.4
Scenario Outline:Parent clicks on Terms of Use from the footer:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
When parent clicks on Terms of Use from the footer
Then parent is redirected to http://www.scholastic.ca/aboutscholastic/webterms.php

Examples:
  |UsingData|
  |InSprint13.4:ParentOrder_OrderCheckoutFooter_TermsOfUse|




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-520    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @DWCAPCOD-520
  @Parent_Header
  @HomePage
  @Sprint-13.4
  @Priority3
  Scenario Outline:Parent Clicks on Home icon:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    When parent clicks on Home icon
    Then parent Home page displays

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_OrderCheckoutHeader_HomeIcon|




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-362    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @DWCAPCOD-362
  @Parent_SubmitOrder
  @SubmitPage
  @Sprint-13.4
  @Priority2
  Scenario Outline:Parent views Step header on Submit Your Order page:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    When parent navigates to Submit Your Order page from shopping cart page
    Then checkout phases 1) SHIPPING & PAYMENT 2) SUBMIT YOUR ORDER displays
    And SUBMIT YOUR ORDER is highlighted and not clickable

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_SubmitOrder_StepHeader|


  @DWCAPCOD-362
  @Parent_SubmitOrder
  @SubmitPage
  @Sprint-13.4
  @Priority2
  Scenario Outline:Parent can click on Shipping & Payment from Step header:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    When parent navigates to Submit Your Order page from shopping cart page
    And clicks on SHIPPING & PAYMENT from step header
    Then SHIPPING & PAYMENT page displays with all the order information intact
    And SHIPPING & PAYMENT is highlighted
    And SUBMIT YOUR ORDER is not clickable

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_SubmitOrder_StepHeader_ClickShipingHeader|




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-361    		     #############################################################
###########################################   			DWCAPCOD-364				 #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline:Parent enters Visa card information with country selected as CA and submits order:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Visa card number and country selected as Canada
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_CA_Visa|


  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline:Parent enters Master card information with country selected as CA and submits order:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Master card number and country selected as Canada
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_CA_Master|


  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline:Parent enters Master card information with 2 series with country selected as CA and submits the order:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Master card number with 2 series and country selected as Canada
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_CA_Master2|



  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline:Parent enters Amex card information with country selected as CA and submits the order:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Amex card number and country selected as Canada
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page
  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_CA_Amex|


  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline: Parent enters Visa card information with country selected as US and submits the order:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Visa card number and country selected as US
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_US_Visa|


  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline: Parent enters Master card information with country selected as US and submits the order:[<UsingData>]
    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Master card number and country selected as US
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_US_Master|


  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline: Parent enters Master card information with 2 series with country selected as US and submits the order:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Master card number with 2 series and country selected as US
    And clicks on Continue Checkout
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_US_Master2|


  @DWCAPCOD-361
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline: Parent enters Amex card information with country selected as US and proceeds to next step:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields entering Amex card number and country selected as US
    And clicks on Continue Checkout
    Then Submit Your Order page displays
    When parent clicks on Submit order from Submit Your Order page
    Then parent lands on order Confirmation page

  Examples:
    |UsingData|
    |InSprint13.4:ParentOrder_CreditCard_AddNewCard_US_Amex|




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-1163    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @DWCAPCOD-1163
  @ShippingAndPayment
  @Priority1
  @Sprint-13.4
  Scenario Outline:Parent Checkout - Shipping & Payment Screen - Payment Method - Authorizing payment:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent add items to cart and navigate to shopping cart
    And parent navigates to Shipping & Payment page
    When parent selects “Add a new Card” from credit card dropdown
    And enters valid data in all credit card fields and enters invalid credit card number
    And clicks on Continue Checkout
    Then error message “Invalid Credit Card Number, Please Enter Correct Card Number” displays on Shipping & Payment page

  Examples:
    |UsingData|
    |InSprint13.4:PCOD:ParentOrder_InvalidCreditCard|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-1178    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @DWCAPCOD-1178
  @SubmitYourOrderPage
  @Priority1
  @Sprint-13.4
  Scenario Outline:Shipping section is updated when parent changes the child assignment for items:[<UsingData>]

    Given parent has 2 childs connected to different teacher
    And Parent login in with valid [username] and [password]
    And parent add 2 items to cart and navigate to shopping cart
    And the items are assigned to the (default child) Child1
    And parent navigates to Submit Your Order page page
    And Shipping section displays with “<Child1name>'s items will be shipped to:”
    And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
    When parent navigates to Shopping cart page from submit your order page
    And reassigns few items to child2
    And parent navigates to Submit Your Order page page
    Then Shipping section displays with “<Child1name>'s items will be shipped to:”
    And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
    And “Child2name's items will be shipped to:”
    And teacher2's first and last name with school address <School Name1, Street, city,Country, postal code> displays

  Examples:
    |UsingData                                                          |
    |InSprint13.4:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|


  @DWCAPCOD-1178
  @SubmitYourOrderPage
  @Priority1
  @Sprint-13.4
  Scenario Outline:Shipping address for parent with 1 child on Submit Your Order page:[<UsingData>]

    Given parent has only one child configured
    And Parent login in with valid [username] and [password]
    And parent add items to cart
    When parent navigates to Submit Your Order page page
    Then Shipping section displays with “<Childname>'s items will be shipped to:”
    And single teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays

  Examples:
    |UsingData                                         |
    |InSprint13.4:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_1Child|

  @DWCAPCOD-1178
  @SubmitYourOrderPage
  @Priority1
  @Sprint-13.4
  Scenario Outline:Shipping address for parent with 2 child connected to same teacher on Submit Your Order page:[<UsingData>]

    Given parent has 2 childs connected to same teacher
    And Parent login in with valid [username] and [password]
    And parent add 2 items to cart and navigate to shopping cart
    And reassigns few items to child2
    When parent navigates to Submit Your Order page page
    Then Shipping section displays with “<Child1name>'s items will be shipped to:”
    And teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays
    And “Child2name's items will be shipped to:”
    And teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays

  Examples:
    |UsingData                                         |
    |InSprint13.4:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_2Child|


  @DWCAPCOD-1178
  @SubmitYourOrderPage
  @Priority1
  @Sprint-13.4
  Scenario Outline:Shipping address for parent with 2 children connected to different teacher on Submit Your Order page:[<UsingData>]

    Given parent has 2 childs connected to different teacher
    And Parent login in with valid [username] and [password]
    And parent add 2 items to cart and navigate to shopping cart
    And reassigns few items to child2
    When parent navigates to Submit Your Order page page
    Then Shipping section displays with “<Child1name>'s items will be shipped to:”
    And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
    And “Child2name's items will be shipped to:”
    And teacher2's first and last name with school address <School Name1, Street, city,Country, postal code> displays

  Examples:
    |UsingData                                                          |
    |InSprint13.4:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|

  @DWCAPCOD-1178
  @SubmitYourOrderPage
  @Priority1
  @Sprint-13.4
  Scenario Outline:Shipping address for parent with 3 children, 2 connected to same teacher and other connected to different teacher on Submit Your Order page:[<UsingData>]

    Given parent has 3 children 2 connected to same teacher and other to different child
    And Parent login in with valid [username] and [password]
    And parent add 3 items to cart and navigate to shopping cart
    And reassigns few items to child2 and child3
    When parent navigates to Submit Your Order page page
    Then Shipping section displays with “<Child1name>'s items will be shipped to:”
    And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
    And “Child2name's items will be shipped to:”
    And teacher2's first and last name with school address <School Name2, Street, city,Country, postal code> displays
    And Shipping section presented with “<Child3name>'s items will be shipped to:”
    And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays

  Examples:
    |UsingData                                         |
    |InSprint13.4:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_3Child|

##update

         