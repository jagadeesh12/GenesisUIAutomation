Feature: DWCAPCOD-1979

Background: 
	Given teacher open rco-scholastic web site 
	
Scenario Outline: CSR can apply Teacher Freepick coupon on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Freepick coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR enters [Free Pick Coupon] on rewards and coupons page
And CSR selects an item from the freepick modal
And selected item displays in Current Selection section
Then the freepick coupon information displays under Applied Coupons section
Examples: 
|UsingData|
|TeacherOrder_FreePickCoupon_QualifyingItemSearch|

Scenario Outline: CSR can apply BonusFlat coupon on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR enters a Bonus Flat coupon
Then Bonus Flat coupon information displays under Applied Coupons section
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR can apply TGAT coupon on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for TGAT coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR enters a TGAT coupon
And CSR enters referring Teacher account details in TGAT modal window
Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed
And the TGAT coupon information displays under Applied Coupons section
	
Examples:
| UsingData                  		|
| ToolTip_for_TGAT_coupon_number	|    

Scenario Outline: CSR can apply FreeItem coupon on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Free Item coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR enters a Free Item coupon
Then Free Item coupon information displays under Applied Coupons section
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR cannot redeem FreeShipping coupon on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Free Shipping coupon
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
And CSR navigates to Redemptions & Rewards page
When CSR enters a Free Shipping coupon
Then error message displays
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR can redeem Bonus Flat promotion on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then CSR sees the Bonus Flat description in Rewards section
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR can redeem Student Incentive on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Student Incentive promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then CSR sees the Student Incentive description in Rewards section

Examples:
| UsingData                                           |
| teacher_login_Item_enterstudents_0_enterstudents_14 |


Scenario Outline: CSR can redeem Free Item promotion on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Free Item promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then CSR sees the Free Item description in Rewards section
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: CSR can redeem Spell Scholastic promotion on pre-tax SOO subtotal [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Spell Scholastic promotion
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then CSR sees the Spell Scholastic promotion description in Rewards section
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: Parent with 2 children and order going to 2 teachers with pending order for each child [Redemptions Page-GST only]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
When CSR searches for teacher2
And CSR navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child2's Subtotal
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 2 children and order going to 2 teachers and only one child has pending order[Redemptions Page-GST_PST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 child connected to 2 teachers and pending order for only one child
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
When CSR searches for teacher2
And CSR navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with $0.00 as total and no. of items as 0
And "No items to review" message displays
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: Parent with 2 children and 2 orders going to 2 teachers [Redemptions Page-GST_QST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
When CSR searches for teacher2
And teacher2 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child2's Subtotal
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 1 child connected to teacher with pending orders [Redemptions Page-HST]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 3 children and order going to 2 teachers with pending orders [Redemptions Page-Tax Exempted School]:[<UsingData>]
Given implementation is pending for this
Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1 + Child2's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1 + Child2's Subtotal
When CSR searches for teacher2
And teacher2 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child3's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child3's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child3's Subtotal
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 1 child connected to one teacher submits order with only free pick coupon[Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with free pick order
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with $0.00 as total and no. of items as 1
And $0.00 displays for SOO Subtotal, taxes and SOO Total
And $0.00 displays in "Rewards earned with Today's Qualifying Order Value of"
Examples:
|UsingData|
|Dev35:PCOD:|

@Manual
Scenario Outline: Parent with 2 children connected to two teachers located in different provinces and pending orders [Redemptions Page-GST_PST and HST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
When CSR searches for teacher2
And CSR navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child2's Subtotal
And Shipping Fee is FREE!


Scenario Outline: 2 parents with one child place orders connected to the same teacher [Redemptions Page]:[<UsingData>]
Given implementation is pending for this
Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to Redemptions & Rewards page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1 + Child2's total
And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1 + Child2's Subtotal
And Shipping Fee is FREE!
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: Parent with 2 children and order going to 2 teachers with pending order for each child [Payment Page-GST only]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And CSR searches for Teacher2
And CSR navigates to [Payment] page
And blue header on SOO displays with correct total and no. of items as in Child2's total
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: Parent with 2 children and order going to 1 teacher and only one child has pending order[Payment Page-GST_PST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And CSR searches for teacher2
And CSR navigates to [Payment] page
And blue header on SOO displays with $0.00 as total and no. of items as 0
Examples:
|UsingData|
|Dev35:PCOD:|


Scenario Outline: Parent with 2 children and 2 orders going to 2 teachers [Payment Page-GST_QST]:[<UsingData>]
Given implementation is pending for this
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And CSR searches for Teacher2
And CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And Order Total displays as 0 and no. of items displays the correct number from Child2
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 1 child connected to teacher with pending orders [Payment Page-HST]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 3 children and order going to 2 teachers with pending orders [Payment Page-Tax Exempted School]:[<UsingData>]
Given implementation is pending for this
Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2 total
And Order Total displays as 0 and no. of items displays the correct number from Child1 + Child2
And shipping displays FREE
And CSR searches for teacher2
And blue header on SOO displays with correct total and no. of items as in Child3's total
And Order Total displays as 0 and no. of items displays the correct number from Child3
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:|

Scenario Outline: Parent with 1 child connected to one teacher submits order with only free pick coupon[Payment Page]:[<UsingData>]
Given implementation is pending for this
Given Parent has a child connected to teacher with free pick order
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with $0.00 as total and no. of items as 0
And $0.00 displays for SOO Subtotal, taxes and SOO Total
And $0.00 displays in "Rewards earned with Today's Qualifying Order Value of"
Examples:
|UsingData|
|Dev35:PCOD:|

@Manual
Scenario Outline: Parent with 2 children connected to two teachers located in different provinces and pending orders [Payment Page-GST_PST and HST]:[<UsingData>]

Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And Order Total displays as 0 and no. of items displays the correct number from Child1
And shipping displays FREE
And CSR searches for teacher2
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And Order Total displays as 0 and no. of items displays the correct number from Child2
And shipping displays FREE


Scenario Outline: 2 parents with one child place orders connected to the same teacher [Payment Page]:[<UsingData>]
Given implementation is pending for this
Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR searches for a teacher1
And CSR navigates to Verify Account Page
And CSR navigates to Review Cart page from Order Entry page
And CSR checks the include orders checkbox
When CSR navigates to [Payment] page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2 total
And Order Total displays as 0 and no. of items displays the correct number from Child1 + Child2
And shipping displays FREE
Examples:
|UsingData|
|Dev35:PCOD:|