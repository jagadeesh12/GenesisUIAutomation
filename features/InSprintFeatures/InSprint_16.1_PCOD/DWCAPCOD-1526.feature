Feature: SSO
Parent Reward - Free Book Pick - No items in Cart


Background: 
Given Parent opens scholastic reading clubs e-commerce site


Scenario Outline: Parent with one child applies freepick coupon on a $0 cart and checkout:[<UsingData>]
Given parent has a child connected to a teacher
And Parent login in with valid [username] and [password]
And parent does not add any items to cart
And parent navigates to Review cart page
And parent applies a freepick coupon
And selects a freepick item and assigns to child1
And freepick information displays on Review cart page
And parent click on Continue Checkout from Review cart page
And parent navigates to Submit Your Order page
When parent clicks on Submit Order
Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
And freepick item added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
And Quantity, Total - FREE and Coupon: <coupon code1> displays
And Total Items - <Total no.of Items added to cart> displays
And Order Subtotal - <Subtotal of all children> displays
And Tax Subtotal - <Subtotal of taxes for all children items> displays 
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
   
Examples:
|UsingData|
    |ParentOrder_ShippingPayment_ShippingSection_1Child_DifferentTeacher|
    

Scenario Outline: Parent with 2 child connected to different teacher applies freepick coupon on a $0 cart and checkout:[<UsingData>]
 Given parent has 2 child connected to different teacher
 And Parent login in with valid [username] and [password]
 And parent does not add any items to cart
 And parent navigates to Review cart page
 And parent applies a freepick coupon
 And selects a freepick item and assigns to child1
 And parent applies another freepick coupon
 And parent selects a freepick item and assigns to child2
 And freepick information displays on Review cart page for both the children
 And parent click on Continue Checkout from Review cart page
 And parent navigates to Submit Your Order page
 When parent clicks on Submit Order
 Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
 And freepick item added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
 And Quantity, Total - FREE and Coupon: <coupon code1> displays
 And Order Details section displays with “<Child2FirstName> in <Teacher2Name>'s Class items
 And freepick item added to child2 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
 And Quantity, Total - FREE and Coupon: <coupon code2> displays
 And Total Items - <Total no.of Items added to cart> displays
 And Order Subtotal - <Subtotal of all children> displays
 And Tax Subtotal - <Subtotal of taxes for all children items> displays 
 And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
 Examples:
 |UsingData|
    |ParentOrder_ShippingPayment_ShippingSection_1Child_DifferentTeacher|  
    

Scenario Outline: Parent with 2 child and multiple free pick coupons applied to 1 child on a $0 cart and checkout:[<UsingData>]
 Given parent has 2 child connected to different teacher
 And Parent login in with valid [username] and [password]
 And parent does not add any items to cart
 And parent navigates to Review cart page
 And parent applies a freepick coupon
 And selects a freepick item and assigns to child1
 And parent applies another freepick coupon
 And parent selects a freepick item and assigns to child1
 And freepick information displays on Review cart page for both the children
 And parent click on Continue Checkout from Review cart page
 And parent navigates to Submit Your Order page
 When parent clicks on Submit Order
 Then Order Details section displays with “<Child1FirstName> in <Teacher1Name>'s Class items
 And freepick items added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
 And Quantity, Total - FREE and Coupon: <coupon code1> displays
 And second freepick item added to child1 displays under this child with product image, product title, Book type, Grade | Age, Reading level, striked off price and text FREE
 And Quantity, Total - FREE and Coupon: <coupon code2> displays
 And Total Items - <Total no.of Items added to cart> displays
 And Order Subtotal - <Subtotal of all children> displays
 And Tax Subtotal - <Subtotal of taxes for all children items> displays 
 And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
    
 Examples:
 |UsingData|
    |ParentOrder_ShippingPayment_ShippingSection_1Child_DifferentTeacher|  