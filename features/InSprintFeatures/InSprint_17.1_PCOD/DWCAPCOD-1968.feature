Feature: DWCAPCOD-1968

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

Scenario Outline: CSR Order with pending parent orders from 2 children and order going to 2 teachers with pending order for each child [Confirm Page - GST only]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And CSR logs in to the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher1
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
When CSR searches for a teacher2
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher2
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: CSR Order with pending Parent orders from 2 children and order going to 1 teacher and only one child has pending order[Confirm Page - GST_PST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher1
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page
And click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
And CSR searches for a teacher2
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Review Cart page
Then there is no pending SOO orders
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: CSR Order with pending Parent orders with 2 children and 2 orders going to 2 teachers [Confirm Page - GST_QST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher1
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
And CSR searches for a teacher2
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher2
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Parent with 1 child connected to teacher with pending orders [Confirm Page - HST]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Parent with 3 children and order going to 2 teachers with pending orders [Confirm Page - Tax Exempted School]:[<UsingData>]
Given implementation is pending for this
Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct <Child1+Child2> total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And order grouped by child2 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher1
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
And CSR searches for a teacher2
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then correct order details display on Confirm & Submit, Order Confirmation and Order History
And Order Summary Section displays the Student Online Orders - Paid with the correct Child3 total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child3 with correct Item number, title, Flyer, price, quantity
And child3’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher2
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher2 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Parent with 1 child connected to one teacher submits order with only free pick coupon[Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with free pick order
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid as $0
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price as FREE, quantity
And child1’s subtotal, tax total and overall total is displayed as $0
And cumulative total is $0 and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher1
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

#@Manual
#Scenario Outline: Parent with 2 children connected to two teachers located in different provinces and pending orders [Confirm Page - GST_PST and HST]
#
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to Confirm & Submit page
#Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
#And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
#And Shipping & Handling displays FREE and Total Amount Due displays $0
#And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child1’s subtotal, tax total and overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And Shipping displays FREE
#When CSR submits the order for teacher1
#Then Order Summary section and Order details display as in Confirm & Submit page
#When teacher1 navigates to My Account page and click on view Order details for this order
#Then Order Summary section and Order details display as in Order Confirmation page
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to Confirm & Submit page
#Then correct order details display on Confirm & Submit, Order Confirmation and Order History
#And Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
#And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
#And Shipping & Handling displays FREE and Total Amount Due displays $0
#And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child2’s subtotal, tax total and overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And Shipping displays FREE
#When CSR submits the order for teacher2
#Then Order Summary section and Order details display as in Confirm & Submit page
#When teacher1 navigates to My Account page and click on view Order details for this order
#Then Order Summary section and Order details display as in Order Confirmation page


Scenario Outline: CSR 2 parents with one child place orders connected to the same teacher [Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct <Child1+Child2> total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And order grouped by child2 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When CSR submits the order for teacher1
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher2 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|



Scenario Outline: CSR Order with SOO + YTO with Saved Visa card as Payment [Confirm Page - GST & QST]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending parent orders
And CSR searches for a teacher1
And CSR navigates to order entry Page
And CSR adds YTO items
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR selects saved visa card as payment
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders and Teacher Exclusives total displays as $0
And Correct Your Teacher Order total displays
And Shipping & Handling displays FREE and Total Amount Due displays <YTO Total>
And payment section displays Amount paid by Credit card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Shipping displays FREE
When CSR submits the order for teacher
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Order with SOO + Teacher Exclusives with Combination of Credit card and Checks as Payment [Confirm Page - GST only]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending parent orders
And CSR searches for a teacher1
And CSR navigates to order entry Page
And CSR adds Teacher Exclusive items
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR selects combination of Credit card and checks as payment
When CSR navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order total displays as $0
And Correct Teacher Exclusives total displays
And Shipping & Handling displays FREE and Total Amount Due displays <Teacher Exclusives Total>
And payment section displays correct Amount paid by CC and Amount paid by Checks
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And Shipping displays FREE
When CSR submits the order for teacher
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|



Scenario Outline: CSR Order with SOO + YTO + Teacher Exclusives with New Amex Card [Confirm Page - GST only]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending parent orders
And CSR searches for a teacher1
And CSR navigates to order entry Page
And CSR adds YTO items
And CSR adds Teacher Exclusives items
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR selects New Amex card as payment
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Order total displays as $0
And Correct Your Teacher Order, Teacher Exclusives total displays
And Shipping & Handling displays FREE and Total Amount Due displays <YTO + Teacher Exclusives Total>
And payment section displays Amount paid by Credit card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And Shipping displays FREE
When CSR submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|



Scenario Outline: CSR Order with SOO only order and Bonus Flat promotion and Bonus Flat coupon[Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Bonus Flat
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR applies Bonus Flat coupon
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Rewards Earned with Qualifying order total of shows the SOO pre-tax total
And Bonus Flat reward information displays under Rewards Section
And Coupons section displays with Bonus Flat coupon information
When CSR submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Order with SOO only order and TGAT coupon[Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for TGAT coupon
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR applies TGAT coupon
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Coupons section displays with TGAT coupon information
When CSR submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Order with SOO only order and Free item coupon and Free item promotion[Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Free Item
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR applies Bonus Flat coupon
When CSR navigates to Confirm & Submit page
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Rewards Earned with Qualifying order total of shows the SOO pre-tax total
And Free Item reward information displays under Rewards Section
And Coupons section displays with Free Item coupon information
When CSR submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR Order with SOO only order and Spell Scholastic and Student Incentive promotion[Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Spell Scholastic & Student Incentive
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR enters no. of students in Student Incentive on Redemptions & Rewards page
When CSR navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Rewards Earned with Qualifying order total of shows the SOO pre-tax total
And Spell Scholastic reward information displays under Rewards Section
And Student incentive with no. of students displays under rewards section
When CSR submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR $0 order with redemptions from YTO + Teacher exclusives including SOO order with Freepick coupon[Confirm Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending parent orders with Free pick coupon
And CSR searches for a teacher1
And CSR navigates to Order entry Page
And CSR adds YTO items
And CSR adds Teacher Exclusive items
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to [Redemptions & Rewards] page
And CSR redeems entire amount towards bonus bank and paper coupons from YTO
And CSR redeems entire amount towards bonus bank and paper coupons from Teacher Exclusives
And CSR applies freepick coupon on Redemptions & Rewards page
When CSR navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays as $0
And Shipping & Handling displays FREE and Total Amount Due displays as $0
And payment section displays Amount paid by Credit card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal is displayed
And child wise tax total is displayed
And child wise overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And coupons section displays with YTO Free pick coupon information
And Shipping displays FREE
When CSR submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When CSR navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:|

#@Manual
#Scenario Outline: CSR Order with SOO + YTO + Teacher Exclusives with pops with combination of Credit & Checks with saved Master card
#Given Parent has a child connected to teacher with pending parent orders
#And CSR searches for a teacher1
#And CSR navigates to Order entry Page
#And CSR adds YTO items
#And CSR adds Teacher Exclusive items
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#And CSR selects pops on payment page
#When CSR Snavigates to Confirm & Submit page 
#Then correct order details display on Confirm & Submit, Order Confirmation and Order History
#And Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
#And Correct Student Flyer Orders, Your Teacher Order displays
#And Correct Parent Online Payments Applied displays with negative amount
#And Correct Student Flyer Orders & Your Teacher Order Total displays <SFO + YTO - pops Applied)
#And Correct Teacher Exclusives Total displays
#And Shipping & Handling displays FREE and Total Amount Due displays <SFO + YTO + Teacher Exclusives Total>
#And payment section displays Amount paid by Checks as Total amount due
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child1’s subtotal, tax total and overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
#And child wise subtotal is displayed
#And child wise tax total is displayed
#And child wise overall total is displayed
#And cumulative total and Qty for all Student Flyer Orders displays
#And YTO section displays with correct Item number, title, Flyer, price, quantity
#And cumulative total and Qty for YTO displays
#And Parent Online Payments section displays with correct pop Student Name, Offer code, Confirmation and amount
#And pops Applied and Student Flyer and Teacher order total displays correctly
#And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
#And cumulative total and Qty for Teacher Exclusives displays
#And Shipping displays FREE
#When CSR submits the order
#Then Order Summary section and Order details display as in Confirm & Submit page
#When CSR navigates to My Account page
#And click on view Order details for this order
#Then Order Summary section and Order details display as in Order Confirmation page