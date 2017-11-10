Feature: DWCAPCOD-103
	Teachers - Cart - SOO in Cart
	
	
Background: 
	Given teacher open rco-scholastic web site

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@1
Scenario Outline:The Student Online Orders section collapses when ‘-‘ sign is selected:[<UsingData>]
Given Parent has a child connected to teacher with pending orders
And teacher1 logs into the application by providing [User Information]
And teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
When teacher1 selects the minus sign on SOO section
Then the Student Online Orders section collapses
And the minus sign changes to a plus sign on SOO section
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_SOOSection_Collapse|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@2
Scenario Outline:The Student Online Orders section expands when ‘+‘ sign is selected:[<UsingData>]
Given Parent has a child connected to teacher with pending orders
And teacher1 logs into the application by providing [User Information]
And teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
When teacher1 selects the minus sign on SOO section
And teacher1 selects the plus sign on SOO section
Then the Student Online Orders section expands
And the plus sign changes to a minus sign on SOO section
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_SOOSection_Expand|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@6
Scenario Outline:Parent with 2 children and order going to 2 teachers with pending order for each child [Review Cart - GST]:[<UsingData>]
Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed
And child1’s tax total is displayed [GST]
And child1’s overall total is displayed [GST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child1
When teacher2 logs into the application by providing [User Information]
And teacher2 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child2 with correct Item number, title, Flyer, price and quantity
And child2’s subtotal is displayed
And child2’s tax total is displayed [GST]
And child2’s overall total is displayed [GST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child2
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_2ChildrenPendingOrderfor2_NU|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@3
Scenario Outline:Parent with 2 children and order going to 1 teacher and only one child has pending order[Review Cart - GST_PST]:[<UsingData>]
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed
And child1’s tax total is displayed [GST_PST]
And child1’s overall total is displayed [GST_PST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child1
When teacher2 logs into the application by providing [User Information]
And teacher2 navigates to [Review Cart] page by clicking the shopping cart icon
Then teacher2 sees the message "No orders to review." under the SOO section for child1
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_2ChildrenPendingOrderfor1_BC|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@7
Scenario Outline:Parent with 2 children and 2 orders going to 2 teachers [Review Cart - GST_QST]:[<UsingData>]
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed
And child1’s tax total is displayed [GST_QST]
And child1’s overall total is displayed [GST_QST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child1
When teacher2 logs into the application by providing [User Information]
And teacher2 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child2 with correct Item number, title, Flyer, price and quantity
And child2’s subtotal is displayed
And child2’s tax total is displayed [GST_QST]
And child2’s overall total is displayed [GST_QST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child2
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_2ChildrenPendingOrderfor2_QC|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@4
Scenario Outline:Parent with 1 child connected to teacher with pending orders [Review Cart - HST]:[<UsingData>]
Given Parent has a child connected to teacher with pending orders
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed
And child1’s tax total is displayed [HST]
And child1’s overall total is displayed [HST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child1
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_1ChildPendingOrders_NB|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@8
Scenario Outline:Parent with 3 children and order going to 2 teachers with pending orders [Review Cart - Tax Exempted School (GST)]:[<UsingData>]
Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed
And child1’s tax total is displayed [Tax Exempted - GST]
And child1’s overall total is displayed [Tax Exempted - GST]
#And order placed date is displayed below child1
And order is grouped by child2 with correct Item number, title, Flyer, price and quantity
And child2’s subtotal is displayed
And child2’s tax total is displayed [Tax Exempted - GST]
And child2’s overall total is displayed [Tax Exempted - GST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child2
When teacher2 logs into the application by providing [User Information]
And teacher2 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child3 with correct Item number, title, Flyer, price and quantity
And child3’s subtotal is displayed
And child3’s tax total is displayed [Tax Exempted - GST]
And child3’s overall total is displayed [Tax Exempted - GST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child3
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_3ChildrenPendingOrdersfor3_YT|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@5
Scenario Outline:Parent with 1 child connected to one teacher submits order with only free pick coupon [Free Pick - GST]:[<UsingData>]
Given Parent has a child connected to teacher with free pick order
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed as $0
And child1’s tax total is displayed as $0
And child1’s overall total is displayed as $0
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child1
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_1ChildFreePickOrder_MB|

@DWCAPCOD-103
@ReviewCart
@SOO
@Priority1
@Sprint-16.2
@9
Scenario Outline:2 parents with one child place orders connected to the same teacher [Review Cart - GST]:[<UsingData>]
Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And teacher1 logs into the application by providing [User Information]
When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
And child1’s subtotal is displayed
And child1’s tax total is displayed [GST]
And child1’s overall total is displayed [GST]
#And order placed date is displayed below child1
And order is grouped by child2 with correct Item number, title, Flyer, price and quantity
And child2’s subtotal is displayed
And child2’s tax total is displayed [GST]
And child2’s overall total is displayed [GST]
And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child2
Examples:
|UsingData|
|InSprint16.2:PCOD:SOO:TCODReviewCart_1ChildSameTeacher_NT|

#@DWCAPCOD-103
#@ReviewCart
#@SOO
#@Priority1
#@Sprint-16.2
#@10
#Scenario Outline:Parent with 1 child connected to one teacher submits two different orders at different times [Review Cart - GST_QST]:[<UsingData>]
#Given Parent has a child connected to teacher with two orders placed at different times
#And teacher logs into the application by providing [User Information]
#When teacher navigates to [Review Cart] page by clicking the shopping cart icon
#Then orders are grouped by child with the most recent orders displayed with correct Item number, title, Flyer, price, quantity
#And child1’s subtotal is displayed
#And child1’s tax total is displayed [GST_QST]
#And child1’s overall total is displayed [GST_QST]
#And cumulative total for all Student Online Orders on Review Cart [GST_QST]
#And order placed date is displayed below child1
#Examples:
#|UsingData|
#|InSprint16.2:PCOD:SOO:TCODReviewCart_|

#@DWCAPCOD-103
#@ReviewCart
#@SOO
#@Priority1
#@Sprint-16.2
#@11
#Scenario Outline:SOO, SFO, YTO and Teacher Exclusive sections displays correctly [Review Cart - GST only]:[<UsingData>]
#Given Parent has a child connected to teacher with pending orders
#And teacher logs into the application by providing [User Information]
#And teacher adds SFO items for one child
#And teacher adds YTO items
#And teacher adds Teacher Exclusive items
#When teacher navigates to [Review Cart] page by clicking the shopping cart icon
#Then SOO orders are grouped by child with correct Item number, title, Flyer, price, quantity
#And SOO subtotal, tax total,overall total and cumulative total for all Student Online Orders on Review Cart are displayed
#And SFO section displays the added child’s item number, title, Flyer, price, quantity
#And SFO subtotal, tax total,overall total and cumulative total for all SFO items are displayed
#And YTO section displays item number, title, Flyer, price, quantity
#And YTO subtotal, tax total,overall total and cumulative total for all YTO items are displayed
#And teacher sees “YOU ARE EARNING REWARDS ON” label, <SOOPretaxTotalPrice+SFOPreTaxTotalPrice+YTOPreTaxTotalPrice> and <SOOTotalItems+SFOTotalItems+YTOTotalItems> for all items
#And Teacher Exclusive section displays item number, title, Flyer, price, quantity
#And Teacher Exclusive subtotal, tax total,overall total and cumulative total for all Teacher Exclusive items are displayed
#And teacher sees “CART TOTAL” label, <SOOPostTotalPrice+SFOPostTotalPrice+YTOPostTotalPrice+TeacherExclusivePostTotalPrice> and <SOOTotalItems+SFOTotalItems+YTOTotalItems+TeacherExclusiveTotalItems> for all items
#Examples:
#|UsingData|
#|InSprint16.2:PCOD:SOO:TCODReviewCart_|

#@DWCAPCOD-103
#@ReviewCart
#@SOO
#@Manual
#@Sprint-16.2
#Scenario Outline:Student Online Orders UI with no orders [Review Cart]:[<UsingData>]
#Given teacher has no orders for SOO section
#And teacher logs into the application by providing [UserInformation]
#When teacher navigates to [Review Cart] page by clicking the shopping cart icon
#Then teacher sees Student Online Orders section above the SFO section
#And teacher sees blue header that displays "STUDENT ONLINE ORDERS | EARNS YOUR REWARDS!"
#And teacher sees a ‘-‘ sign to the left to the blue header
#And teacher do not see ‘ADD’ button to the right of the blue header
#And teacher sees the message “No orders to review.” under the blue header
#Examples:
#|UsingData|
#|InSprint16.2:PCOD:SOO:TCODReviewCart_|
#
#@DWCAPCOD-103
#@ReviewCart
#@SOO
#@Manual
#@Sprint-16.2
#Scenario Outline:Student Online Orders UI with pending order for only SOO items [Review Cart]:[<UsingData>]
#Given teacher has one child connected to the account with pending order
#And teacher logs into the application by providing [UserInformation]
#When teacher navigates to [Review Cart] page by clicking the shopping cart icon
#Then teacher sees Student Online Orders section above the SFO section
#And teacher sees blue header that displays "STUDENT ONLINE ORDERS | EARNS YOUR REWARDS!"
#And teacher sees a ‘-‘ sign to the left to the blue header
#And teacher do not see ‘ADD’ button to the right of the blue header
#And teacher sees the columns labelled “ITEM#”, “TITLE”, “FLYER”, “PRICE”, “QUANTITY” under the blue header
#And teacher sees the child’s name under the columns
#And teacher sees “Date Placed” and [Order Date] under the child’s name
#And teacher sees the rows <ItemNumber>, <ItemTitle>, <FlyerName>, <Price>, <Quantity> for each item
#And teacher sees the “<ChildName> Subtotal” label, <SubtotalPrice>, “<TotalQuantity> Items” label under the rows of items
#And teacher sees <TaxCharged> and <TaxPrice> under the subtotal row
#And teacher sees “<ChildName> Total” label and <TotalPrice> under the tax row
#And teacher sees “Student Online Orders Total” label, <OverallTotalPrice> and <OverallTotalQuantity> under the child’s section
#And teacher sees “YOU ARE EARNING REWARDS ON” label, <SOOPretaxTotalPrice> and <SOOTotalItems> for all items
#And teacher sees “CART TOTAL” label, <CartTotalPrice> and <CartTotalItems> for all items
#Examples:
#|UsingData|
#|InSprint16.2:PCOD:SOO:TCODReviewCart_|
#
#@DWCAPCOD-103
#@ReviewCart
#@SOO
#@Manual
#@Sprint-16.2
#Scenario Outline:Parent with 2 children connected to two teachers located in different provinces and pending orders [Review Cart - GST_PST and HST]:[<UsingData>]
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And teacher1 logs into the application by providing [User Information]
#When teacher1 navigates to [Review Cart] page by clicking the shopping cart icon
#Then order is grouped by child1 with correct Item number, title, Flyer, price and quantity
#And child1’s subtotal is displayed
#And child1’s tax total is displayed
#And child1’s overall total is displayed
#And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child1
#When teacher2 logs into the application by providing [User Information]
#And teacher2 navigates to [Review Cart] page
#Then order is grouped by child2 with correct Item number, title, Flyer, price, quantity
#And child2’s subtotal is displayed
#And child2’s tax total is displayed
#And child2’s overall total is displayed
#And cumulative total for all Student Online Orders on Review Cart
#And order placed date is displayed below child2
#Examples:
#|UsingData|
#|InSprint16.2:PCOD:SOO:TCODReviewCart_|