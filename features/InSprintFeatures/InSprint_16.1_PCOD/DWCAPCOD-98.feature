Feature: SSO
	SSO with confirmation email
	
Background: 
Given Parent opens scholastic reading clubs e-commerce site

#MANUAL SCENARIOS


#Scenario Outline: Parent notification email for parent order with 2 child connected to different teacher
#
#Given parent has 2 childs connected to different teacher
#And Parent login in with valid [username] and [password]
#And parent add items to cart for both the children
#And parent navigates to Submit Your Order page
#When parent clicks on Submit Order
#Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
#And all items added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Order Details section displays with “<Child2FirstName> in <Teacher2Name>'s Class items
#And all items added to child2 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Total Items - <Total no.of Items added to cart> displays
#And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
#And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
#
#
#Scenario: Parent notification email for parent adding freepick item for 2 children
#
#Given parent has 2 child connected to different teacher
#And Parent login in with valid [username] and [password]
#And parent add items to cart for Child1 meeting the minimum amount for free pick coupon
#And parent applies a freepick coupon
#And selects a freepick item and assigns to child1
#And parent applies another freepick coupon
#And parent selects a freepick item and assigns to child2
#And parent navigates to Submit Your Order page
#When parent clicks on Submit Order
#Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
#And all paid items added to child1 displays
#And freepick item added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
#And Quantity, Total - FREE and Coupon: <coupon code1> displays
#And Order Details section displays with “<Child2FirstName> in <Teacher2Name>'s Class items
#And freepick item added to child2 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
#And Quantity, Total - FREE and Coupon: <coupon code2> displays
#And Total Items - <Total no.of Items added to cart> displays
#And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
#And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
#
#
#
#Scenario: Parent notification email for parent adding 2 freepick items for 1 child
#
#Given parent has 2 child connected to different teacher
#And Parent login in with valid [username] and [password]
#And parent add items to cart for 2children meeting the minimum amount for free pick coupon
#And parent applies a freepick coupon
#And selects a freepick item and assigns to child1
#And parent applies another freepick coupon
#And parent selects a freepick item and assigns to child1
#And parent navigates to Submit Your Order page
#When parent clicks on Submit Order
#Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
#And all paid items added to child1 displays under Child1
#And freepick item added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
#And Quantity, Total - FREE and Coupon: <coupon code1> displays
#And Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
#And freepick item added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
#And Quantity, Total - FREE and Coupon: <coupon code2> displays
#And all paid items added to child2 displays under Child2
#And Total Items - <Total no.of Items added to cart> displays
#And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
#And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
#
#
#
#Scenario: parent notification email for parent order with 1 child
#
#Given parent has only one child configured
#And Parent login in with valid [username] and [password]
#And parent add items to cart
#And parent navigates to Submit Your Order page
#When parent clicks on Submit Order
#Then Order Details section displays with “<ChildFirstName> in <TeacherName>'s Class items
#And all items added to that child displays under this child with product image, product title, Book type, Grade | Age, Reading level, Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Total Items - <Total no.of Items added to cart> displays
#And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
#And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
#
#
#Scenario: parent notification email for parent order with 2 child connected to same teacher
#
#Given parent has 2 childs connected to same teacher
#And Parent login in with valid [username] and [password]
#And parent add items to cart for both the children
#And parent navigates to Submit Your Order page
#When parent clicks on Submit Order
#Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
#And all items added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Order Details section displays with “<Child2FirstName> in <Teacher1Name>'s Class items
#And all items added to child2 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Total Items - <Total no.of Items added to cart> displays
#And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
#And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
#
#
#Scenario: Order confirmation email for parent order with 3 children 2 connected to same teacher and other to different teacher
#
#Given parent has 3 children 2 connected to same teacher and other to different child
#And Parent login in with valid [username] and [password]
#And parent add items to cart for 3 children
#And parent navigates to Submit Your Order page
#When parent clicks on Submit Order
#Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
#And all items added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Order Details section displays with “<Child2FirstName> in <Teacher2Name>'s Class items
#And all items added to child2 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Order Details section displays with “<Child3FirstName> in <Teacher1Name>'s Class items
#And all items added to child2 displays under this child with product image, product title, Book type, Grade | Age, Reading level. Price
#And Quantity, Total - Item level subtotal(unit price* Qty) pretax amount displays
#And Total Items - <Total no.of Items added to cart> displays
#And Order Subtotal - <Subtotal of all children> displays
#And Tax Subtotal - <Subtotal of taxes for all children items> displays 
#And Total Amount Due - <Order Subtotal + Tax Subtotal> displays




