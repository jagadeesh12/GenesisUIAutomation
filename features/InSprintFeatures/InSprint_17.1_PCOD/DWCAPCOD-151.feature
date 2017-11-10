Feature: DWCAPCOD-151

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

Scenario Outline: Order with pending parent orders from 2 children and order going to 2 teachers with pending order for each child [Confirmation Page-GST only]:[<UsingData>]

Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher1 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
When teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher2 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher2 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:SOO_1Parent2Children2Teachers_GSTOnlySchool|


Scenario Outline: Order with pending Parent orders from 2 children and order going to 1 teacher and only one child has pending order[Confirmation Page-GST_PST]:[<UsingData>]

Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher1 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
When teacher2 also logs in to the application by providing [UserInformation]
Then there is no pending SOO orders
Examples:
|UsingData|
|Dev35:PCOD:SOO_1Parent2Children1Teacher_1ChildOnlyOrders_GSTPSTSchool|


Scenario Outline: Order with pending Parent orders with 2 children and 2 orders going to 2 teachers [Confirmation Page-GST_QST]:[<UsingData>]

Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher1 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
When teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher2 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher2 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:SOO_1Parent2Children2Teachers_GSTQSTSchool|

Scenario Outline: Parent with 1 child connected to teacher with pending orders [Confirmation Page-HST]:[<UsingData>]

Given Parent has a child connected to teacher with pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to confirm & submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child1_1Teach_SOO_Confirmpage_HST_ItemInfo|

#Manual for now
#Scenario Outline: Parent with 3 children and order going to 2 teachers with pending orders [Confirmation Page-Tax Exempted School]:[<UsingData>]
#Given implementation is pending for this
#Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
#And teacher1 logs in to the application by providing [UserInformation]
#When teacher1 navigates to Confirm & Submit page 
#Then Order Summary Section displays the Student Online Orders - Paid with the correct <Child1+Child2> total
#And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
#And Shipping & Handling displays FREE and Total Amount Due displays $0
#And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child1’s subtotal, tax total and overall total is displayed
#And order grouped by child2 with correct Item number, title, Flyer, price, quantity
#And child2’s subtotal, tax total and overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And Shipping displays FREE
#When teacher1 submits the order
#Then Order Summary section and Order details display as in Confirm & Submit page
#When teacher1 navigates to My Account page and click on view Order details for this order
#Then Order Summary section and Order details display as in Order Confirmation page
#When teacher2 also logs in to the application by providing [UserInformation]
#And teacher2 navigates to Confirm & Submit page
#Then Order Summary Section displays the Student Online Orders - Paid with the correct Child3 total
#And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
#And Shipping & Handling displays FREE and Total Amount Due displays $0
#And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
#And Order Details section displays with order grouped by child3 with correct Item number, title, Flyer, price, quantity
#And child3’s subtotal, tax total and overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And Shipping displays FREE
#When teacher2 submits the order
#Then Order Summary section and Order details display as in Confirm & Submit page
#When teacher2 navigates to My Account page and click on view Order details for this order
#Then Order Summary section and Order details display as in Order Confirmation page
#Examples:
#|UsingData|
#|Dev35:PCOD:|

Scenario Outline: Parent with 1 child connected to one teacher submits order with only free pick coupon[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with free pick order
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid as $0
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price as FREE, quantity
And child1’s subtotal, tax total and overall total is displayed as $0
And cumulative total is $0 and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher1 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOOFreePickOrder|

#@Manual
#Scenario Outline: Parent with 2 children connected to two teachers located in different provinces and pending orders [Review Cart | GST_PST and HST]
#
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 Submits the order 
#Then correct order details display on Confirm & Submit, Order Confirmation and Order History
#And Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
#And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
#And Shipping & Handling displays FREE and Total Amount Due displays $0
#And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child1’s subtotal is displayed
#And child1’s tax total is displayed
#And child1’s overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And Shipping displays FREE
#When teacher2 logs into the application by providing [UserInformation]
#And teacher2 submits the order
#Then correct order details display on Confirm & Submit, Order Confirmation and Order History
#And Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
#And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
#And Shipping & Handling displays FREE and Total Amount Due displays $0
#And payment section displays "Your order has no balance, so no payment is necessary to complete this order."
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child2’s subtotal is displayed
#And child2’s tax total is displayed
#And child2’s overall total is displayed
#And cumulative total and Qty for all Student Online Orders displays
#And Shipping displays FREE


Scenario Outline: 2 parents with one child place orders connected to the same teacher [Confirmation Page]:[<UsingData>]

Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct <Child1+Child2> total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And order grouped by child2 with correct Item number, title, Flyer, price, quantity
And child2’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Shipping displays FREE
When teacher2 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher1 navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:SOO_ConfirmPage_ItemInfo_2Parents_1Teacher|

Scenario Outline: Order with SFO + SOO + YTO + Teacher Exclusives with Checks as Payment [Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
And teacher adds Teacher Exclusive items
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays
And Shipping & Handling displays FREE and Total Amount Due displays <SFO + YTO + Teacher Exclusives Total>
And payment section displays Amount paid by Checks as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And Shipping displays FREE
When teacher1 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:SOOSFOYTOTE_ConfirmPage_ItemInfo_GST|

Scenario Outline: Order with SFO + SOO and New Visa card as Payment[Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher selects New Visa card as payment
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders total displays
And Your Teacher Order and Teacher Exclusives total displays as $0
And Shipping & Handling displays FREE and Total Amount Due displays <SFO Total>
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And Shipping displays FREE
When teacher1 submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:SOOSFO_ConfirmPage_ItemInfo_GST|

Scenario Outline: Order with SOO + YTO with Saved Visa card as Payment [Confirmation Page-GST & QST]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds YTO items
And teacher selects saved visa card as payment
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders and Teacher Exclusives total displays as $0
And Correct Your Teacher Order total displays
And Shipping & Handling displays FREE and Total Amount Due displays <YTO Total>
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_YTO_SavedVISACard|

Scenario Outline: Order with SOO + Teacher Exclusives with Combination of Credit card and Checks as Payment [Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds Teacher Exclusive items
And teacher selects combination of Credit card and checks as payment
When teacher navigates to Confirm & Submit page 
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
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_TE_ComboCreditCardCheque|

Scenario Outline: Order with SFO + SOO + YTO with New Master card [Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
When teacher navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders, Your Teacher Order total displays
And Teacher Exclusives total displays as $0
And Shipping & Handling displays FREE and Total Amount Due displays <SFO + YTO Total>
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SFO_YTO_NewMasterCard|

Scenario Outline: Order with SFO + SOO + Teacher Exclusives with saved Master card[Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds Teacher Exclusive items
And teacher selects saved master card as payment
When teacher navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders and Teacher Exclusives total displays
And Your Teacher Order total displays as $0
And Shipping & Handling displays FREE and Total Amount Due displays <SFO + Teacher Exclusives Total>
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SFO_TE_SavedMasterCard|

Scenario Outline: Order with SOO + YTO + Teacher Exclusives with New Amex Card [Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds YTO items
And teacher adds Teacher Exclusive items
And teacher selects New Amex card as payment
When teacher navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Order total displays as $0
And Correct Your Teacher Order, Teacher Exclusives total displays
And Shipping & Handling displays FREE and Total Amount Due displays <YTO + Teacher Exclusives Total>
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_YTO_TE_NewAMEXCard|

@8
Scenario Outline: Order with SFO + SOO + YTO + Teacher Exclusives and redemptions from SFO, YTO & Teacher Exclusives and saved Amex card as payment[Confirmation Page-GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
And teacher adds Teacher Exclusive items
And teacher navigates to [Redemptions & Rewards] page
And teacher redeems credit notes from SFO
And teacher redeems bonus bank and paper coupons from YTO
And teacher redeems bonus bank and paper coupons from Teacher Exclusives
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total (post tax & post redemption amount) displays
And Shipping & Handling displays FREE and Total Amount Due displays <SFO + YTO + Teacher Exclusives post tax, post redemption Total>
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And Shipping displays FREE
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SFO_YTO_TE_Redemptions_SavedAMEXCard|

@1
Scenario Outline: Order with SFO + SOO + YTO with Freepick and Bonus Flat coupons[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders with freepick coupon
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds SFO free pick item
And teacher adds YTO items such that SFO + SOO + YTO amount qualifies for minimum for the coupons
And teacher applies Freepick coupon on Redemptions & Rewards page
And teacher applies Bonus Flat Coupon on Redemptions & Rewards page
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays
And Shipping & Handling displays FREE and Total Amount Due displays <SFO + YTO Total>
And payment section displays Amount paid by Checks as Total amount due
And Order Details section displays with freepick item information with price displayed as FREE
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with Freepick item information with price displayed as FREE
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And coupons section displays with Freepick and Bonus Flat coupon information
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SFO_YTO_YTOFreePickCoupon_BonusFlatCoupon|

@2
Scenario Outline: Order with SOO + SF0 + YTO freepick only order[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent freepick only order
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO free pick item
And teacher applies Freepick coupon on Redemptions & Rewards page
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid as $0
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays as $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays blank
And Order Details section displays with freepick item information with price displayed as FREE
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with Freepick item information with price displayed as FREE
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And coupons section displays with Freepick information
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SFO_YTO_SFOFreePickCoupon_YTOFreePickCoupon|

@3
Scenario Outline: Order with SOO only order and Bonus Flat promotion and Bonus Flat coupon[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Bonus Flat
And teacher logs in to the application by providing [UserInformation]
And teacher applies Bonus Flat coupon
When teacher1 navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Rewards Earned with Qualifying order total of shows the SOO pre-tax total
And Bonus Flat reward information displays under Rewards Section
And Coupons section displays with Bonus Flat coupon information
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_BonusFlatCoupon|

@4
Scenario Outline: Order with SOO only order and TGAT coupon[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for TGAT coupon
And teacher logs in to the application by providing [UserInformation]
And teacher applies TGAT coupon
When teacher1 navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Coupons section displays with TGAT coupon information
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_TGAT|

@5
Scenario Outline: Order with SOO only order and Free item coupon and Free item promotion[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Free Item
And teacher logs in to the application by providing [UserInformation]
And teacher applies Bonus Flat coupon
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Rewards Earned with Qualifying order total of shows the SOO pre-tax total
And Free Item reward information displays under Rewards Section
And Coupons section displays with Free Item coupon information
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_FreItemCoupon_FreeItemPromo|

@6
Scenario Outline: Order with SOO only order and Spell Scholastic and Student Incentive promotion[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Spell Scholastic & Student Incentive
And teacher logs into the application by providing [UserInformation]
And teacher enters no. of students in Student Incentive on Redemptions & Rewards page
When teacher navigates to Confirm & Submit page 
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays “Your order has no balance, so no payment is necessary to complete this order.”
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And Rewards Earned with Qualifying order total of shows the SOO pre-tax total
And Spell Scholastic reward information displays under Rewards Section
And Student incentive with no. of students displays under rewards section
When teacher submits the order
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SpellScholastic_StudentIncentives|

@7
Scenario Outline: $0 order with redemptions from SFO + YTO + Teacher exclusives including SOO order with Freepick coupon[Confirmation Page]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders with Free pick coupon
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds SFO free pick item
And teacher adds YTO items
And teacher adds Teacher Exclusive items
And teacher navigates to [Redemptions & Rewards] page
And teacher redeems entire amount towards credit notes from SFO
And teacher redeems entire amount towards bonus bank and paper coupons from YTO
And teacher redeems entire amount towards bonus bank and paper coupons from Teacher Exclusives
And teacher applies Freepick coupon on Redemptions & Rewards page
When teacher navigates to Confirm & Submit page
Then Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
And Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays as $0
And Shipping & Handling displays FREE and Total Amount Due displays $0
And payment section displays Amount paid by Credit Card as Total amount due
And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
And child1’s subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Online Orders displays
And SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity
And child wise subtotal, tax total and overall total is displayed
And cumulative total and Qty for all Student Flyer Orders displays
And YTO section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for YTO displays
And Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity
And cumulative total and Qty for Teacher Exclusives displays
And coupons section displays with YTO Free pick coupon information
And Shipping displays FREE
When teacher submits the order and adds submitted SOO order in Excel
Then Order Summary section and Order details display as in Confirm & Submit page
When teacher navigates to My Account page and click on view Order details for this order
Then Order Summary section and Order details display as in Order Confirmation page
Examples:
|UsingData|
|Dev35:PCOD:1Child_1Teacher:SOO_SFO_YTO_TE_SFOFreepickCoupon_YTOFreePickCoupon|

#@Manual
#Scenario Outline: Order with SOO + SFO + YTO + Teacher Exclusives with pops with combination of Credit & Checks with saved Master card
#Given Parent has a child connected to teacher with pending parent orders
#And teacher logs into the application by providing [UserInformation]
#And teacher adds SFO items
#And teacher adds YTO items
#And teacher adds Teacher Exclusive items
#And teacher selects pops on payment page
#When teacher Submits the order 
#Then correct order details display on Confirm & Submit, Order Confirmation and Order History
#And Order Summary Section displays the Student Online Orders - Paid with the correct SOO total
#And Correct Student Flyer Orders, Your Teacher Order displays
#And Correct Parent Online Payments Applied displays with negative amount
#And Correct Student Flyer Orders & Your Teacher Order Total displays <SFO + YTO - pops Applied)
#And Correct Teacher Exclusives Total displays
#And Shipping & Handling displays FREE and Total Amount Due displays <SFO + YTO + Teacher Exclusives Total>
#And payment section displays Amount paid by Checks as Total amount due
#And Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity
#And child1’s subtotal is displayed
#And child1’s tax total is displayed
#And child1’s overall total is displayed
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