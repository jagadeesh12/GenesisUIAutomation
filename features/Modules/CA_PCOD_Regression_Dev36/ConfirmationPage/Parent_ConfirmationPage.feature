Feature: Parent_ConfirmationPage
	This feature is used to validate PCOD Confirmation page

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-366		   #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 
@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1 
Scenario Outline:order details on Order Confirmation page for a cart with items reassigned to 1 child:[<UsingData>]

Given parent has 2 children
And Parent login in with valid [username] and [password]
And parent add items to cart for 2 children
And parent navigates to Submit Your Order page from shopping cart
When Parent navigates back to Shopping cart page from submit your order page
And parent reassigns all items to child1
And parent navigates to Submit Your Order page from shopping cart
And parent clicks on Submit Order
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
And all items added to that child displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
        
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_Reassigned_1Child|


@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:order details in confirmation page for parent adding freepick item for 2 children:[<UsingData>]

#Given parent has 2 child connected to different teacher
Given Parent login in with valid [username] and [password]
And parent add items to cart for Child1 meeting the minimum amount for free pick coupon
And parent applies a freepick coupon
And selects a freepick item and assigns to child1
And parent applies another freepick coupon
And parent selects a freepick item and assigns to child2
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
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
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_Freepick_1Child_DifferentTeacher|



@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:order details in confirmation page for parent adding 2 freepick items for 1 child:[<UsingData>]

Given parent has 2 child connected to different teacher
And Parent login in with valid [username] and [password]
And parent add items to cart for 2 children meeting the minimum amount for free pick coupon
And parent applies a freepick coupon
And selects a freepick item and assigns to child1
And parent applies another freepick coupon
And selects a freepick item and assigns to child1
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
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
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_Freepick_2Childs_DifferentTeacher|
    
 
@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:order details on Order Confirmation page for parent with 1 child:[<UsingData>]    
    
Given parent has only one child configured
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
And all items added to that child displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_1Child|
    
    
@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:order details on Order Confirmation page for parent with 2 child connected to same teacher:[<UsingData>]

Given parent has 2 childs connected to same teacher
And Parent login in with valid [username] and [password]
And parent add items to cart for both the children
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Details section displays with “ChildFirstName” in TeacherName's Class items
And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child2FirstName” in Teacher1Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
        
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_2Child_SameTeacher|
    
    
@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:order details on Order Confirmation page for parent with 2 child connected to different teacher:[<UsingData>]

Given parent has 2 childs connected to different teacher
And Parent login in with valid [username] and [password]
And parent add items to cart for both the children
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
       
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_2Child_DiffTeacher|
    
    
    
@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:order details on Order Confirmation page for parent with 3 children 2 connected to same teacher and other to different teacher:[<UsingData>]

Given parent has 3 children 2 connected to same teacher and other to different child
And Parent login in with valid [username] and [password]
And parent add items to cart for 3 children
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Order Details section displays with “Child3FirstName” in Teacher1Name's Class items
And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
        
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_3Childs_2Same_1Diff|
    
    
@DWCAPCOD-366
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:order details on Order Confirmation page for a cart with items reassigned to 2 children:[<UsingData>]

 Given parent has 2 childs connected to different teacher
 And Parent login in with valid [username] and [password]
 And parent add items to cart for one child
 And parent navigates to Submit Your Order page from shopping cart
 When Parent navigates back to Shopping cart page from submit your order page
 And reassigns few items to child2
 And parent navigates to Submit Your Order page from shopping cart
 And parent clicks on Submit Order
 Then Order Details section displays with “Child1FirstName” in Teacher1Name's Class items
 And all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
 And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
 And Order Details section displays with “Child2FirstName” in Teacher2Name's Class items
 And all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price
 And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
 And Total Items - <Total no.of Items added to cart> displays
 And Order Subtotal - <Subtotal of all children> displays
 And Tax Subtotal - <Subtotal of taxes for all children items> displays 
 And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
        
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_OrderDetailsSection_2Child_DifferentTeacher_Reassigns|





##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-97 		   #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 
@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:Parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST in confirmation page:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST
And Parent login in with valid [username] and [password]
And  parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all child orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_Details_MultipleChilds_GST_GSTPST|



    
@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1    
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST/PST and HST in confirmation page:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other with HST
And Parent login in with valid [username] and [password]
And  parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and HST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_Details_MultipleChilds_GSTPST_HST|



@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent with 4 children all connected to different teacher each belonging to GST, GST/PST, HST, GST/QST in confirmation page:[<UsingData>]

Given parent with 4 child connected to different teacher belonging to provinces one with GST,GST/PST,HST and GST/QST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 4 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And Childname3's Orders - <Child3's Pretax subtotal>
And Childname4's Orders - <Child4's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for 4 children - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_Details_4MultipleChilds_Taxes|


@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent with multiple children connected to different teacher, one teacher belonging to tax exempt school in confirmation page:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects New Visa card as payment and navigate to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and GST/PST - <tax subtotal for all child orders> (Tax for child connected to tax exempted teacher is 0)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_Details_GSTPST_GSTPST_GSTPSTExempt|
   
      

@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent with 2 children connected to different teacher, one teacher belongs to school which is PST exempt in confirmation page:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but PST tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects New Visa card as payment and navigate to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and GST/PST exempted- <tax subtotal for all child orders> (Tax for child connected to PST tax exempted teacher, only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_Details_1Child_DifferentTeacher_2GSTPST_PSTExempt|




@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority2
@Sprint-14.1
Scenario Outline:Parent submits order and views order confirmation page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Confirmation page displays with Site header with Scholastic Reading Club logo and Home icon
And confirmation message “Thank You for Your Order!”
And Sub-message “You will receive an email once your child’s teacher submits your order. Your credit card won’t be charged until your books have shipped. You can check your order status at any time by visiting your Account.” displays
And Order number displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrder_ConfirmationPage_Details|


@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent adds items which is PST tax exempt for a child connected to teacher with GST/PST school in confirmation page:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST/PST and item as PST tax exempt 
And Parent login in with valid [username] and [password]
And parent add items to cart which are PST exempt
And parent navigates to Shipping & Payment page
And parent selects saved Visa card as payment
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders>(Only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_GSTPST_ItemPSTExempt|




@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Change child selections to a child connected to teacher belonging to different school and check in confirmation page:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST
And Parent login in with valid [username] and [password]
And parent add items to cart for 1 child
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
And parent navigates to Submit Your Order page
And Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of child1 orders>
And Tax Subtotal - <tax subtotal for child1 orders>
When Parent navigates back to Shopping cart page from submit your order page
And few items are assigned to child2
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
And parent navigates to Submit Your Order page
And parent clicks on Submit Order
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_1Child_DifferentTeacher|


@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Shipping address for parent with 1 child on Order Confirmation page:[<UsingData>]

Given parent has only one child configured
And Parent login in with valid [username] and [password]
And parent add items to cart
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Shipping section displays with “Childname's items will be shipped to:”
And single teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_ShippingSection_1Child|



@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as GST in confirmation page:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Visa card as payment
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_1Child_GST|



Scenario Outline:Shipping address for parent with 2 child connected to same teacher on Order Confirmation page:[<UsingData>]

Given parent has 2 childs connected to same teacher
And Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And reassigns few items to child2
And parent navigates to Submit Your Order page from shopping cart page
When parent clicks on Submit Order
Then Shipping section displays with “Child1name's items will be shipped to:”
And single teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays
And “Child2name's items will be shipped to:”
And child2 teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays
    
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPager_ShippingSection_2Child|



Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as GST & PST in confirmation page:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST & PST
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Master card as payment
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPager_1Child_GSTPST|


@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Shipping address for parent with 2 children connected to different teacher on Order Confirmation page:[<UsingData>]

Given parent has 2 childs connected to different teacher
And Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And reassigns few items to child2
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Shipping section displays with “Child1name's items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
And “Child2name's items will be shipped to:”
And teacher2's first and last name with school address <School Name1, Street, city,Country, postal code> displays
   
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_ShippingSection_2Child_DifferentTeacher|



@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as HST in confirmation page:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_1Child_HST|



@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Shipping address for parent with 3 children, 2 connected to same teacher and other connected to different teacher on Order Confirmation page:[<UsingData>]

Given parent has 3 children 2 connected to same teacher and other to different child
And Parent login in with valid [username] and [password]
And parent add 3 items to cart and navigate to shopping cart
And reassigns few items to child2 and child3
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Shipping section displays with “Child1name's items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
And  “Child2name's items will be shipped to:”
And teacher2's first and last name with school address <School Name2, Street, city,Country, postal code> displays
And Shipping section presented with “Child3name's items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
    
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_ShippingSection_3Child|



@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and GST/PST in confirmation page:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects New 5series Master card as payment and navigate to Submit Your Order page
When parent clicks on Submit Order
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_2Child_DifferentTeacher_GST_GSTPST|



@DWCAPCOD-97
@Parent_OrderConfirmation
@ConfirmationPage
@Priority1
@Sprint-14.1
Scenario Outline:Shipping section is updated in confirmation page when parent changes the child assignment for items:[<UsingData>]

Given parent has 2 childs connected to different teacher
And Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And the items are assigned to the (default child) Child1
And parent navigates to Submit Your Order page from shopping cart
And Shipping section displays with “Child1name's items will be shipped to:”
And single teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays
And parent navigates to Shopping cart page from submit your order page
And reassigns few items to child2
And parent navigates to Submit Your Order page from shopping cart
When parent clicks on Submit Order
Then Shipping section displays with “Child1name's items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
And “Child2name's items will be shipped to:”
And teacher2's first and last name with school address <School Name1, Street, city,Country, postal code> displays
   
Examples:
|UsingData|
|InSprint14.1:PCOD:ParentOrderConfirmationPage_ShippingSection_2Child_Reassign|



