Feature: DWCAPCOD-149
	Teachers - Checkout - Redemptions & Rewards Page - SOO
	
	
Background: 
	Given teacher open rco-scholastic web site

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SFO + SOO + YTO [Redemptions & Rewards Cart - GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal + SFO Subtotal + YTO Subtotal>
And teacher receives FREE shipping

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOYTO_RewardsPage_ItemInfo|


@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Parent with 2 children and 2 orders going to 2 teachers [Redemptions & Rewards - GST_QST]:[<UsingData>]
Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
When teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child2's Subtotal
Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_RewardsPage_ItemInfo_2Teachers_GSTQST|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SFO + SOO + Teacher Exclusives [Redemptions & Rewards Cart - GST only]:[<UsingData>]

Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds Teacher Exclusive items to cart
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal + SFO Subtotal>
And teacher receives FREE shipping

Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOTE_RewardsPage_ItemInfo|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Parent with 1 child connected to teacher with pending orders [Redemptions & Rewards - HST]:[<UsingData>]
Given Parent has a child connected to teacher with pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_RewardsPage_ItemInfo|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SOO + YTO + Teacher Exclusives [Redemptions & Rewards Cart - GST only]:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds YTO items
And teacher adds Teacher Exclusive items to cart
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal + YTO Subtotal>
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOOYTOTE_RewardsPage_ItemInfo|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Parent with 3 children and order going to 2 teachers with pending orders [Redemptions & Rewards - Tax Exempted School]:[<UsingData>]
Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1 + Child2's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1 + Child2's Subtotal
When teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child3's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child3's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child3's Subtotal
Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_RewardsPage_ItemInfo_2Teachers_TaxExempt|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SFO + SOO + YTO + Teacher Exclusives and redemptions from SFO, YTO & Teacher Exclusives [Redemptions & Rewards Cart - GST only]:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
And teacher adds Teacher Exclusive items to cart
When teacher navigates to [Redemptions & Rewards] page
And teacher applies Credit Notes to SFO, Bonus Bank and paper coupons redemptions to YTO and teacher exclusives
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on SFO displays with SFO total(post tax post redemption amount) and no. of items
And correct SFO Subtotal, taxes and SFO Total(post tax post redemption amount) displays
And blue header on YTO displays with correct total(post tax post redemption amount) and no. of items
And correct YTO Subtotal, taxes and YTO Total(post tax post redemption amount) displays
And blue header on Teacher Exclusives displays with correct total(post tax post redemption amount) and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total(post tax post redemption amount) displays
And “Rewards earned with Today's Qualifying Order Value of” displays <(SOO Subtotal) + (SFO Subtotal-redemptions) + (YTO Subtotal - redemptions)>
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOYTOTE_Redemptions_RewardsPage_ItemInfo_GST|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Parent with 1 child connected to one teacher submits order with only free pick coupon [Rewards Page]:[<UsingData>]
Given Parent has a child connected to teacher with free pick order
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with $0.00 as total and no. of items as 0
And $0.00 displays for SOO Subtotal, taxes and SOO Total
And $0.00 displays in “Rewards earned with Today's Qualifying Order Value of”
Examples:
|UsingData|
|InSprint16.3:PCOD:FreePickOnly_RewardsPage_ItemInfo|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: 2 parents with one child place orders connected to the same teacher [Rewards Cart]:[<UsingData>]
Given 2 parents with one child connected to same teacher places order and teacher has pending orders
And teacher logs in to the application by providing [UserInformation]
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1 + Child2's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1 + Child2's Subtotal
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_RewardsPage_ItemInfo_2Parents_1Teacher|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SFO + SOO + YTO + Teacher Exclusives [Redemptions & Rewards Cart - GST only]:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
And teacher adds YTO items
And teacher adds Teacher Exclusive items to cart
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal + SFO Subtotal + YTO Subtotal>
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFOYTOTE_RewardsPage_ItemInfo_GST|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SFO + SOO [Redemptions & Rewards Cart - GST only]:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds SFO items
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on SFO displays with correct total and no. of items
And correct SFO Subtotal, taxes and SFO Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal + SFO Subtotal>
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOOSFO_RewardsPage_ItemInfo_GST|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SOO + YTO [Redemptions & Rewards Cart - GST & QST]:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds YTO items
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on YTO displays with correct total and no. of items
And correct YTO Subtotal, taxes and YTO Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal + YTO Subtotal>
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOOYTO_RewardsPage_ItemInfo_GSTQST|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Parent with 2 children and order going to 2 teachers with pending order for each child [GST only]:[<UsingData>]
Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
When teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child2's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child2's Subtotal
Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_RewardsPage_ItemInfo_GST_1Parent_2Teachers|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Redemptions & Rewards page with SOO + Teacher Exclusives [Redemptions & Rewards Cart - GST only]:[<UsingData>]
Given Parent has a child connected to teacher with pending parent orders
And teacher logs in to the application by providing [UserInformation]
And teacher adds Teacher Exclusive items to cart
When teacher navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
And blue header on Teacher Exclusives displays with correct total and no. of items
And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
And “Rewards earned with Today's Qualifying Order Value of” displays <SOO Subtotal>
And teacher receives FREE shipping
Examples:
|UsingData|
|InSprint16.3:PCOD:SOOTE_RewardsPage_ItemInfo_GST|

@DWCAPCOD-149
@RedemptionsRewards
@SOO
@Priority1
@Sprint-16.3
Scenario Outline: Parent with 2 children and order going to 1 teacher and only one child has pending order[GST_PST]:[<UsingData>]

Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
And teacher1 logs in to the application by providing [UserInformation]
When teacher1 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with correct total and no. of items as in Child1's total
And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
When teacher2 also logs in to the application by providing [UserInformation]
And teacher2 navigates to [Redemptions & Rewards] page
Then blue header on SOO displays with $0.00 as total and no. of items as 0
And $0.00 displays for SOO Subtotal, taxes and SOO Total
And $0.00 displays in “Rewards earned with Today's Qualifying Order Value of”
Examples:
|UsingData|
|InSprint16.3:PCOD:SOO_RewardsPage_ItemInfo_GSTPST_1Parent_2Teachers_Orderfor1Teacher|

#@DWCAPCOD-149
#@RedemptionsRewards
#@SOO
#@Sprint-16.3
#@Manual
#Scenario: Student Online Orders UI with pending order for only SOO items on Redemptions & Rewards page:[<UsingData>]
#Given teacher has one child connected to the account with pending order
#And teacher logs into the application by providing [UserInformation]
#When teacher navigates to [Redemptions & Rewards] page
#Then teacher is navigated to Redemptions & Rewards step of checkout
#And Student Online Order section is displayed at the top, above SFO and YTO
#And Blue header displays with "STUDENT ONLINE ORDERS", the total dollar value of the Student Online Orders and the total number of Items
#And Section is expandable and collapsible.
#And there is no Bonus Bank or Credit Notes redemptions
#And "Student Online Orders Subtotal" displays
#And aggregated Taxes display
#And "Student Online Orders Total" displays
#
#@DWCAPCOD-149
#@RedemptionsRewards
#@SOO
#@Sprint-16.3
#@Manual
#Scenario: Parent with 2 children connected to two teachers located in different provinces and pending orders [Rewards Page - GST_PST and HST]:[<UsingData>]
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And teacher1 logs into the application by providing [UserInformation]
#When teacher1 navigates to [Redemptions & Rewards] page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
#And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
#When teacher2 logs into the application by providing [UserInformation]
#And teacher2 navigates to [Redemptions & Rewards] page
#Then blue header on SOO displays with correct total and no. of items as in Child2's total
#And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
#And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child2's Subtotal
#And Shipping Fee is FREE!
