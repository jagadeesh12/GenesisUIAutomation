Feature: DWCAPCOD-150

Background: 
	Given Parent opens scholastic reading clubs e-commerce site

Scenario Outline: Parent with 2 children and order going to 2 teachers with pending order for each child [Payment page - GST only]:[<UsingData>]

Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Payment] page
And blue header on SOO displays with correct total and no. of items as in Child2's total
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:2Childs_2Teach_SOO_PaymentPage_GST_ItemInfo|

Scenario Outline: Parent with 2 children and order going to 1 teacher and only one child has pending order[Payment page - GST_PST]:[<UsingData>]

Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Payment] page
And blue header on SOO displays with $0.00 as total and no. of items as 0
Examples:
|UsingData|
|Dev35:PCOD:2Childs_1Teach_SOO_PaymentPage_GSTPST_ItemInfo|


Scenario Outline: Parent with 2 children and 2 orders going to 2 teachers [Payment | GST_QST]:[<UsingData>]

Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And Order Total displays as 0 and no. of items displays the correct number from Child2
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:2Childs_2Teach_SOO_PaymentPage_GSTQST_ItemInfo|

Scenario Outline: Parent with 1 child connected to teacher with pending orders [Payment | HST]:[<UsingData>]

Given Parent has a child connected to teacher with pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher1 navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:1Child1_1Teach_SOO_PaymentPage_HST_ItemInfo|

Scenario Outline: Parent with 3 children and order going to 2 teachers with pending orders [Payment | Tax Exempted School]:[<UsingData>]

Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2 total
And Order Total displays as 0 and no. of items displays the correct number from Child1 + Child2
And shipping displays FREE
And teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Payment] page
And blue header on SOO displays with correct total and no. of items as in Child3's total
And Order Total displays as 0 and no. of items displays the correct number from Child3
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:3Childs_2Teach_SOO_PaymentPage_TaxExempt_ItemInfo|

Scenario Outline: Parent with 1 child connected to one teacher submits order with only free pick coupon[Payment page]:[<UsingData>]

Given Parent has a child connected to teacher with free pick order
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to [Payment] page
Then blue header on SOO displays with $0.00 as total and no. of items as 0
And $0.00 displays for SOO Subtotal, taxes and SOO Total
Examples:
|UsingData|
|Dev35:PCOD:1Childs_1Teach_SOO_PaymentPage_FreePickCoupon|


#@Manual
#Scenario Outline: Parent with 2 children connected to two teachers located in different provinces and pending orders [Review Cart | GST_PST and HST]
#
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And Order Total displays as 0 and no. of items displays the correct number from Child1
#And shipping displays FREE
#And teacher2 logs into the application by providing [UserInformation]
#When teacher2 navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child2's total
#And Order Total displays as 0 and no. of items displays the correct number from Child2
#And shipping displays FREE


Scenario Outline: 2 parents with one child place orders connected to the same teacher [Payment page]:[<UsingData>]

Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2 total
And Order Total displays as 0 and no. of items displays the correct number from Child1 + Child2
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:2Parents_1Child_1Teach_SOO_PaymentPage_ItemInfo|

Scenario Outline: Payment page with SFO + SOO + YTO + Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
And teacher adds Teacher Exclusive items
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And Order Total displays <SFO total + YTO total + Teacher exclusive total>
And total no. of items displays with correct no. of items <SOO + SFO + YTO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOSFOYTOTE_PaymentPage_GST_ItemInfo|

Scenario Outline: Payment page with SFO + SOO [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And Order Total displays <SFO total>
And total no. of items displays with correct no. of items <SOO + SFO>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOSFO_PaymentPage_GST_ItemInfo|

Scenario Outline: Payment page with SOO + YTO [Payment Cart | GST & QST]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds YTO items
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And Order Total displays <YTO total>
And total no. of items displays with correct no. of items <SOO + YTO>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOYTO_PaymentPage_GSTQST_ItemInfo|

Scenario Outline: Payment page with SOO + Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

	Given Parent has a child connected to teacher with pending parent orders
	And teacher logs in to the application by providing [UserInformation]
	And teacher adds Teacher Exclusive items
	When teacher navigates to [Payment] page
	Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
	And blue header on Teacher Exclusives displays with correct total and no. of items
	And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
	And Order Total displays <Teacher exclusive total>
	And total no. of items displays with correct no. of items <SOO + Teacher Exclusives>
	And shipping displays FREE
	Examples:
		|UsingData|
		|Dev35:PCOD:SOOTE_PaymentPage_GST_ItemInfo|

Scenario Outline: Payment page with SFO + SOO + YTO [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And Order Total displays <SFO total + YTO total>
And total no. of items displays with correct no. of items <SOO + SFO + YTO>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOSFOYTO_PaymentPage_GST_ItemInfo|

Scenario Outline: Payment page with SFO + SOO + Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds Teacher Exclusive items
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And Order Total displays <SFO total + Teacher exclusive total>
And total no. of items displays with correct no. of items <SOO + SFO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOSFOTE_PaymentPage_GST_ItemInfo|

Scenario Outline: Payment page with SOO + YTO + Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds YTO items
And teacher adds Teacher Exclusive items
When teacher navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And Order Total displays <YTO total + Teacher exclusive total>
And total no. of items displays with correct no. of items <SOO + YTO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOYTOTE_PaymentPage_GST_ItemInfo|

Scenario Outline: Payment page with SFO + SOO + YTO + Teacher Exclusives and redemptions from SFO, YTO & Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
And teacher adds Teacher Exclusive items
And teacher navigates to [Redemptions & Rewards] page
When teacher applies Credit Notes to SFO, Bonus Bank and paper coupons redemptions to YTO and teacher exclusives
And teacher navigates to the [Payments] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on SFO displays with SFO total(post tax post redemption amount) and no. of items
And correct SFO Subtotal, taxes and SFO Total(post tax post redemption amount) displays
And blue header on YTO displays with correct total(post tax post redemption amount) and no. of items
And correct YTO Subtotal, taxes and YTO Total(post tax post redemption amount) displays
And blue header on Teacher Exclusives displays with correct total(post tax post redemption amount) and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total(post tax post redemption amount) displays
And Order Total displays <SFO total + YTO total + Teacher exclusive total>
And total no. of items displays with correct no. of items <SFO + SOO + YTO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:SOOSFOYTOTE_Redemptions_PaymentPage_GST_ItemInfo|

#@Manual
#Scenario Outline: Payment page with SFO + SOO + YTO + Teacher Exclusives and redemptions from pops [Payment Cart | GST only]:[<UsingData>]
#Given implementation is pending for this
#Given Parent has a child connected to teacher with pending parent orders
#And teacher logs into the application by providing [UserInformation]
#And teacher adds SFO items
#And teacher adds YTO items
#And teacher adds Teacher Exclusive items
#When teacher navigates to [Payment] page
#And teacher redeems pops
#Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
#And blue header on SFO displays with correct total and no. of items
#And correct SFO Subtotal, taxes and SFO Total displays
#And blue header on YTO displays with correct total and no. of items
#And correct YTO Subtotal, taxes and YTO Total displays
#And Parent online payment applied amount displays correctly with pops amount selected
#And StudentFlyer order total and Your Teacher order total displays correctly <SFO total + YTO total - pops applied>
#And blue header on Teacher Exclusives displays with correct total and no. of items
#And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
#And Order Total displays <StudentFlyer order total and Your Teacher order total + Teacher exclusive subtotal>
#And total no. of items displays with correct no. of items <SOO + SFO + YTO + Teacher Exclusives>
#And Shipping Fee is FREE!
#Examples:
#|UsingData|
#|Dev35:PCOD:|
