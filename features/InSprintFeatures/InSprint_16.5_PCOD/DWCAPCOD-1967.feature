Feature: DWCAPCOD-1967


Background: 
	Given Parent opens scholastic reading clubs e-commerce site
	
Scenario Outline: CSR Payment page with SOO + YTO [Payment Cart | GST & QST]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1 and navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR navigates to [Payment] page from [Redeem & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And Order Total displays <YTO Subtotal>
And total no. of items displays with correct no. of items <SOO + YTO>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:CSR:PCOD:SOOYTO_PaymentPage_GSTQST_ItemInfo|

Scenario Outline: CSR Payment page with SOO + Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1 and navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds teacher exclusive items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR navigates to [Payment] page from [Redeem & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And Order Total displays <Teacher exclusive subtotal>
And total no. of items displays with correct no. of items <SOO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:CSR:PCOD:SOOTE_PaymentPage_GST_ItemInfo|



Scenario Outline: CSR Payment page with SOO + YTO + Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1 and navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs and teacher exclusive items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR navigates to [Payment] page from [Redeem & Rewards] page
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
|Dev35:CSR:PCOD:SOOYTOTE_PaymentPage_GST_ItemInfo|

Scenario Outline: CSR Payment page with SOO + YTO + Teacher Exclusives and redemptions from YTO & Teacher Exclusives [Payment Cart | GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1 and navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs and teacher exclusive items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
And teacher applies Bonus Bank and paper coupons redemptions to YTO and teacher exclusives
When CSR navigates to [Payment] page from [Redeem & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And blue header on YTO displays with correct total(post tax post redemption amount) and no. of items
And correct YTO Subtotal, taxes and YTO Total(post tax post redemption amount) displays
And blue header on Teacher Exclusives displays with correct total(post tax post redemption amount) and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total(post tax post redemption amount) displays
And Order Total displays <YTO total + Teacher exclusive total>
And total no. of items displays with correct no. of items <SOO + YTO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:CSR:PCOD:SOOSFOYTOTE_Redemptions_PaymentPage_GST_ItemInfo|
	
	
Scenario Outline: CSR Payment page with SOO + YTO + Teacher Exclusives [Payment Cart | GST only] with SOO orders excluded from cart:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1 and navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs and teacher exclusive items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR excludes SOO order
And CSR navigates to Redemptions & Rewards page
When CSR navigates to [Payment] page from [Redeem & Rewards] page
Then blue header on SOO displays as $0
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And Order Total displays <YTO total + Teacher exclusive total>
And total no. of items displays with correct no. of items <YTO + Teacher Exclusives>
And shipping displays FREE
Examples:
|UsingData|
|Dev35:CSR:PCOD:SOOSFOYTOTE_SOOExcluded_PaymentPage_GST_ItemInfo|

#@Manual
#Scenario Outline: CSR Payment page with SOO + YTO + Teacher Exclusives and redemptions from pops [Payment Cart | GST only]
#Given Parent has a child connected to teacher with pending parent orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR adds YTO and Teacher Exclusive items
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#And CSR redeems pops
#Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
#And blue header on YTO displays with correct total and no. of items
#And correct YTO Subtotal, taxes and YTO Total displays
#And Parent online payment applied amount displays correctly with pops amount selected
#And blue header on Teacher Exclusives displays with correct total and no. of items
#And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
#And Order Total displays <Your Teacher order total + Teacher exclusive subtotal>
#And total no. of items displays with correct no. of items <SOO + YTO + Teacher Exclusives>
#And Shipping Fee is FREE!

#@Later
#Scenario Outline: CSR Parent with 2 children and order going to 2 teachers with pending order for each child [GST only]:[<UsingData>]
#Given implementation is pending for this
#Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And Order Total displays as 0 and no. of items displays the correct number from Child1
#And shipping displays FREE
#And CSR searches for Teacher2 and navigates to [Payment] page
#And CSR navigates to [Payment] page
#And blue header on SOO displays with correct total and no. of items as in Child2's total
#And shipping displays FREE
#Examples:
#|UsingData|
#|Dev35:PCOD:|

#
#@Later
#Scenario Outline: CSR Parent with 2 children and order going to 1 teacher and only one child has pending order[GST_PST]:[<UsingData>]
#Given implementation is pending for this
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And Order Total displays as 0 and no. of items displays the correct number from Child1
#And shipping displays FREE
#And CSR searches for Teacher2 and navigates to [Payment] page
#And blue header on SOO displays with $0.00 as total and no. of items as 0
#Examples:
#|UsingData|
#|Dev35:PCOD:|
#
#@Later
#Scenario Outline: CSR Parent with 2 children and 2 orders going to 2 teachers [Payment | GST_QST]:[<UsingData>]
#Given implementation is pending for this
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And Order Total displays as 0 and no. of items displays the correct number from Child1
#And shipping displays FREE
#And CSR searches for Teacher2 and navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child2's total
#And Order Total displays as 0 and no. of items displays the correct number from Child2
#And shipping displays FREE
#Examples:
#|UsingData|
#|Dev35:PCOD:|
#
#@Later
#Scenario Outline: CSR Parent with 1 child connected to teacher with pending orders [csr-Payment | HST]:[<UsingData>]
#Given implementation is pending for this
#Given Parent has a child connected to teacher with pending orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And Order Total displays as 0 and no. of items displays the correct number from Child1
#And shipping displays FREE
#Examples:
#|UsingData|
#|Dev35:PCOD:|
#
#@Later
#Scenario Outline: CSR Parent with 3 children and order going to 2 teachers with pending orders [csr-Payment | Tax Exempted School]:[<UsingData>]
#Given implementation is pending for this
#Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2 total
#And Order Total displays as 0 and no. of items displays the correct number from Child1 + Child2
#And shipping displays FREE
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And blue header on SOO displays with correct total and no. of items as in Child3's total
#And Order Total displays as 0 and no. of items displays the correct number from Child3
#And shipping displays FREE
#Examples:
#|UsingData|
#|Dev35:PCOD:|
#
#@Later
#Scenario Outline: CSR Parent with 1 child connected to one teacher submits order with only free pick coupon[csr-Payment]:[<UsingData>]
#Given implementation is pending for this
#Given Parent has a child connected to teacher with free pick order
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with $0.00 as total and no. of items as 0
#And $0.00 displays for SOO Subtotal, taxes and SOO Total
#And $0.00 displays in “Rewards earned with Today's Qualifying Order Value of”
#Examples:
#|UsingData|
#|Dev35:PCOD:|
#
#@Later

#Scenario Outline: CSR 2 parents with one child place orders connected to the same teacher [csr-Review Cart]:[<UsingData>]
#Given implementation is pending for this
#Given 2 parents with one child connected to same teacher places order and teacher has pending orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2 total
#And Order Total displays as 0 and no. of items displays the correct number from Child1 + Child2
#And shipping displays FREE
#Examples:
#|UsingData|
#|Dev35:PCOD:|

#@Later
#@Manual
#Scenario Outline: CSR pops do not display when there are SOO items only in cart
#Given Parent has a child connected to teacher with pending parent orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR adds YTO and Teacher Exclusive items
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then pops do not display

#@Later
#@Manual
#Scenario Outline: CSR Parent with 2 children connected to two teachers located in different provinces and pending orders [Review Cart | GST_PST and HST]

#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And Order Total displays as 0 and no. of items displays the correct number from Child1
#And shipping displays FREE
#And CSR searches for teacher2
#When CSR navigates to [Payment] page
#Then blue header on SOO displays with correct total and no. of items as in Child2's total
#And Order Total displays as 0 and no. of items displays the correct number from Child2
#And shipping displays FREE

