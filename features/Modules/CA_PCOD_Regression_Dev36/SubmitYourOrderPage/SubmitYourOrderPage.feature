Feature: SubmitYourOrderPage
	This feature is used to validate PCOD SubmitYourOrderPage

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DWCAPCOD-362    		     #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

@DWCAPCOD-362
@Parent_SubmitOrder
@SubmitYourOrderPage
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
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
@DWCAPCOD-364
@ShippingAndPayment
@SubmitYourOrderPage
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
#And the items are assigned to the (default child) Child1
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
  |UsingData|
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
And teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays

Examples:
  |UsingData|
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
  |UsingData|
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
  |UsingData|
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
  |UsingData|
  |InSprint13.4:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_3Child|
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-96     		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
     
@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Change child selections to a child connected to teacher belonging to different school:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST
And Parent login in with valid [username] and [password]
And parent add items to cart for 1 child
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of child1 orders>
And Tax Subtotal - <tax subtotal for child1 orders>
When Parent navigates back to Shopping cart page from submit your order page
And few items are assigned to child2
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
When parent navigates to Submit Your Order page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all child orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_ChangeCilds_GSTPST_GST|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as GST:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects New Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as GST & PST:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST & PST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects New Master card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as HST:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects New Amex card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and GST/PST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects New 5series Master card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and HST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with HST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST/PST and HST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other with HST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Master card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with 4 children all connected to different teacher each belonging to GST, GST/PST, HST, GST/QST:[<UsingData>]

Given parent with 4 child connected to different teacher belonging to provinces one with GST,GST/PST,HST and GST/QST
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And Childname3's Orders - <Child3's Pretax subtotal>
And Childname4's Orders - <Child4's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher, one teacher belonging to tax exempt school:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects New Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders> (Tax for child connected to tax exempted teacher is 0)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with 2 children connected to different teacher, one teacher belongs to school which is PST exempt:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but PST tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects New Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders> (Tax for child connected to PST tax exempted teacher, only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays
Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent adds items which is PST tax exempt for a child connected to teacher with GST/PST school:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to cart which are PST exempt
And parent navigates to Shipping & Payment page
And parent selects saved Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders>(Only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher|     


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-363    	 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 
@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5     
Scenario Outline:order details on Submit Your Order page for parent with 1 child:[<UsingData>]

Given parent has only one child configured
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
When parent navigates to Submit Your Order page
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
And all items added to that child displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_OrderDetailsSection_1Child|

    
@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5    
Scenario Outline:order details on Submit Your Order page for parent with 2 child connected to same teacher:[<UsingData>]

Given parent has 2 childs connected to same teacher
And Parent login in with valid [username] and [password]
And parent add items to cart for both the children
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
When parent navigates to Submit Your Order page
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child2FirstName” in TeacherName's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_OrderDetailsSection_2Child_1Teacher|



@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:order details on Submit Your Order page for parent with 2 child connected to different teacher:[<UsingData>]

Given parent has 2 childs connected to different teacher
And Parent login in with valid [username] and [password]
And parent add items to cart for both the children
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
When parent navigates to Submit Your Order page
Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
   
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_OrderDetailsSection_1Child_DifferentTeacher|


@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:order details on Submit Your Order page for parent with 3 children 2 connected to same teacher and other to different teacher:[<UsingData>]

Given parent has 3 children 2 connected to same teacher and other to different child
And Parent login in with valid [username] and [password]
And parent add items to cart for 3 children
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
When parent navigates to Submit Your Order page
Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child3FirstName” in Teacher1Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_OrderDetailsSection_3Child|


@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:order details on Submit Your Order page for a cart with items reassigned to 2 children:[<UsingData>]

 Given parent has 2 childs connected to different teacher
 And Parent login in with valid [username] and [password]
 And parent add items to cart for one child
 And parent navigates to Shipping & Payment page
 And parent selects saved visa card from credit card dropdown
 And parent navigates to Submit Your Order page
 When parent navigates to Shopping cart page from submit your order page
 And reassigns few items to child2
 And parent navigates to Shipping & Payment page
 And parent selects saved visa card from credit card dropdown
 And parent navigates to Submit Your Order page
 Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
 And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
 #And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
 And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
 And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
 #And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
 And Total Items - <Total no.of Items added to cart> displays
 And Order Subtotal - <Subtotal of all children> displays
 And Tax Subtotal - <Subtotal of taxes for all children items> displays 
 And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
 Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_ShippingSection_2Child_DifferentTeacher|


@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:order details on Submit Your Order page for a cart with items reassigned to 1 child:[<UsingData>]

Given parent has 2 children
And Parent login in with valid [username] and [password]
And parent add items to cart for 2 children
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
And parent navigates to Submit Your Order page
When parent navigates to Shopping cart page from submit your order page
And parent reassigns all items to child1
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
And parent navigates to Submit Your Order page
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
And all items added to that child displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_OrderDetailsSection_2Child|

@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:order details for parent adding freepick item for 2 children:[<UsingData>]

#Given parent has 2 child connected to different teacher
Given Parent login in with valid [username] and [password]
And parent add items to cart for Child1 meeting the minimum amount for free pick coupon
And parent applies a freepick coupon
And selects a freepick item and assigns to child1
And parent applies another freepick coupon
And parent selects a freepick item and assigns to child2
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
When parent navigates to Submit Your Order page
Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And all paid items added to child1 displays
And freepick item added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level, striked off price and text FREE
And Quantity, Total - FREE and Coupon: “coupon code1” displays
And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
And freepick item added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level, striked off price and text FREE
And Quantity, Total - FREE and Coupon: “coupon code2” displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
           
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_FreeItem_2Child_DifferentTeacher|

@DWCAPCOD-363
@Parent_SubmitOrder
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:order details for parent adding 2 freepick items for 1 child:[<UsingData>]

#Given parent has 2 child connected to different teacher
Given Parent login in with valid [username] and [password]
And parent add items to cart for 2 children meeting the minimum amount for free pick coupon
And parent applies a freepick coupon
And selects a freepick item and assigns to child1
And parent applies another freepick coupon
And selects a freepick item and assigns to child1
And parent navigates to Shipping & Payment page
And parent selects saved visa card from credit card dropdown
When parent navigates to Submit Your Order page
Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And all paid items added to child1 displays under Child1
And freepick item added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level, striked off price and text FREE
And Quantity, Total - FREE and Coupon: “coupon code1” displays
And Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And freepick item added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level, striked off price and text FREE
And Quantity, Total - FREE and Coupon: “coupon code2” displays
And all paid items added to child2 displays under Child2
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
           
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ShippingPayment_FreeItem_2Child_DifferentTeachers|



