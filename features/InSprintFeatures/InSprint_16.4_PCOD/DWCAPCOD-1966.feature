Feature: DWCAPCOD-1966

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

  Scenario Outline: Redemptions & Rewards page with SOO + YTO [Redemptions & Rewards Cart | GST & QST]:[<UsingData>]


    Given Parent has a child connected to teacher with pending parent orders
    And CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher1 and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR checks the include orders checkbox
    When CSR navigates to Redemptions & Rewards page
    Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
    And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
    And blue header on YTO displays with correct total and no. of items
    And correct YTO Subtotal, taxes and YTO Total displays
    And "Rewards earned with Today's Qualifying Order Value of" displays <SOO Subtotal + YTO Subtotal>
    And shipping displays FREE
    Examples:

		|UsingData|
		|Dev35:CSR:PCOD:SOOYTO_RewardsPage_ItemInfo_GSTQST|

  Scenario Outline: Redemptions & Rewards page with SOO + Teacher Exclusives [Redemptions & Rewards Cart | GST only]:[<UsingData>]
    

    Given Parent has a child connected to teacher with pending parent orders
    And CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher1 and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds teacher exclusive items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR checks the include orders checkbox
    When CSR navigates to Redemptions & Rewards page
    Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
    And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
    And blue header on Teacher Exclusives displays with correct total and no. of items
    And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
    And "Rewards earned with Today's Qualifying Order Value of" displays <SOO Subtotal>
    And shipping displays FREE
    Examples:
      |UsingData|
      |Dev35:CSR:PCOD:SOOTE_RewardsPage_ItemInfo_GST|

  Scenario Outline: Redemptions & Rewards page with SOO + YTO + Teacher Exclusives [Redemptions & Rewards Cart | GST only]:[<UsingData>]

    Given Parent has a child connected to teacher with pending parent orders
    And CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher1 and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs and teacher exclusive items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR checks the include orders checkbox
    When CSR navigates to Redemptions & Rewards page
    Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
    And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
    And blue header on YTO displays with correct total and no. of items
    And correct YTO Subtotal, taxes and YTO Total displays
    And blue header on Teacher Exclusives displays with correct total and no. of items
    And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays
    And "Rewards earned with Today's Qualifying Order Value of" displays <SOO Subtotal + YTO Subtotal>
    And shipping displays FREE
    Examples:
      |UsingData|
      |Dev35:CSR:PCOD:SOOYTOTE_RewardsPage_ItemInfo|

  Scenario Outline: Redemptions & Rewards page with SOO + YTO + Teacher Exclusives and redemptions from YTO & Teacher Exclusives [Redemptions & Rewards Cart | GST only]:[<UsingData>]
   

    Given Parent has a child connected to teacher with pending parent orders
    And CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher1 and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs and teacher exclusive items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR checks the include orders checkbox
    When CSR navigates to Redemptions & Rewards page
    And CSR redeems bonus bank and paper coupons from YTO
    And CSR redeems bonus bank and paper coupons from Teacher Exclusives
    Then blue header on SOO displays with correct total and no. of items as in SOO Child's total
    And correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total
    And blue header on YTO displays with correct total(post tax post redemption amount) and no. of items
    And correct YTO Subtotal, taxes and YTO Total(post tax post redemption amount) displays
    And blue header on Teacher Exclusives displays with correct total(post tax post redemption amount) and no. of items
    And correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total(post tax post redemption amount) displays
    And "Rewards earned with Today's Qualifying Order Value of" displays <(SOO Subtotal) + (YTO Subtotal - redemptions)>
    And shipping displays FREE
    Examples:
      |UsingData|
      |Dev35:CSR:PCOD:SOOYTOTE_Redemptions_RewardsPage_ItemInfo_GST|

#@Later
  #Scenario Outline: Parent with 2 children and order going to 2 teachers with pending order for each child [Redemptions page - GST only]:[<UsingData>]
    #Given implementation is pending for this
    #Given Parent having 2 child connected to 2 teachers and has 1 pending order for each child
    #And CSR logs into the application by providing [UserInformation]
    #And CSR selects the order type as [Phone Order]
    #And CSR searches for a teacher1 and navigates to Verify Account Page
    #And CSR navigates to Order Entry Page
    #And CSR navigates to Review Cart page from Order Entry page
    #And CSR checks the include orders checkbox
    #When CSR navigates to Redemptions & Rewards page
    #Then blue header on SOO displays with correct total and no. of items as in Child1's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
    #When CSR searches for teacher2 and navigates to [Redemptions & Rewards] page
    #Then blue header on SOO displays with correct total and no. of items as in Child2's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child2's Subtotal
    #Examples:
      #|UsingData|
      #|Dev35:PCOD:|
#@Later
  #Scenario Outline: Parent with 2 children and order going to 1 teacher and only one child has pending order[Redemptions page - GST_PST]:[<UsingData>]
    #Given implementation is pending for this
    #Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1
    #And CSR logs into the application by providing [UserInformation]
    #And CSR selects the order type as [Phone Order]
    #And CSR searches for a teacher1 and navigates to Verify Account Page
    #And CSR navigates to Order Entry Page
    #And CSR navigates to Review Cart page from Order Entry page
    #And CSR checks the include orders checkbox
    #When CSR navigates to Redemptions & Rewards page
    #Then blue header on SOO displays with correct total and no. of items as in Child1's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
    #When CSR searches for teacher2 and navigates to [Redemptions & Rewards] page
    #Then blue header on SOO displays with $0.00 as total and no. of items as 0
    #And $0.00 displays for SOO Subtotal, taxes and SOO Total
    #And $0.00 displays in “Rewards earned with Today's Qualifying Order Value of”
    #Examples:
      #|UsingData|
      #|Dev35:PCOD:|
#
#@Later
  #Scenario Outline: Parent with 2 children and 2 orders going to 2 teachers [Redemptions & Rewards | GST_QST]:[<UsingData>]
    #Given implementation is pending for this
    #Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
    #And CSR logs into the application by providing [UserInformation]
    #And CSR selects the order type as [Phone Order]
    #And CSR searches for a teacher1 and navigates to Verify Account Page
    #And CSR navigates to Order Entry Page
    #And CSR navigates to Review Cart page from Order Entry page
    #And CSR checks the include orders checkbox
    #When CSR navigates to Redemptions & Rewards page
    #Then blue header on SOO displays with correct total and no. of items as in Child1's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
    #When CSR searches for teacher2 and navigates to [Redemptions & Rewards] page
    #Then blue header on SOO displays with correct total and no. of items as in Child2's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child2's Subtotal
    #Examples:
      #|UsingData|
      #|Dev35:PCOD:|
#@Later
  #Scenario Outline: Parent with 1 child connected to teacher with pending orders [Redemptions & Rewards | HST]:[<UsingData>]
    #Given implementation is pending for this
    #Given Parent has a child connected to teacher with pending orders
    #And CSR logs into the application by providing [UserInformation]
    #And CSR selects the order type as [Phone Order]
    #And CSR searches for a teacher1 and navigates to Verify Account Page
    #And CSR navigates to Order Entry Page
    #And CSR navigates to Review Cart page from Order Entry page
    #And CSR checks the include orders checkbox
    #When CSR navigates to Redemptions & Rewards page
    #Then blue header on SOO displays with correct total and no. of items as in Child1's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal
    #Examples:
      #|UsingData|
      #|Dev35:PCOD:|
#@Later
  #Scenario Outline: Parent with 3 children and order going to 2 teachers with pending orders [Redemptions & Rewards | Tax Exempted School]:[<UsingData>]
    #Given implementation is pending for this
    #Given Parent having 3 children, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order
    #And CSR logs into the application by providing [UserInformation]
    #And CSR selects the order type as [Phone Order]
    #And CSR searches for a teacher1 and navigates to Verify Account Page
    #And CSR navigates to Order Entry Page
    #And CSR navigates to Review Cart page from Order Entry page
    #And CSR checks the include orders checkbox
    #When CSR navigates to Redemptions & Rewards page
    #Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child1 + Child2's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1 + Child2's Subtotal
    #When CSR searches for teacher2 and navigates to [Redemptions & Rewards] page
    #Then blue header on SOO displays with correct total and no. of items as in Child3's total
    #And correct SOO Subtotal, taxes and SOO Total displays as in Child3's total
    #And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child3's Subtotal
    #Examples:
      #|UsingData|
      #|Dev35:PCOD:|
#@Later
  #Scenario Outline: Parent with 1 child connected to one teacher submits order with only free pick coupon:[<UsingData>]
    #Given implementation is pending for this
    #Given Parent has a child connected to teacher with free pick order
    #And CSR logs into the application by providing [UserInformation]
    #And CSR selects the order type as [Phone Order]
    #And CSR searches for a teacher1 and navigates to Verify Account Page
    #And CSR navigates to Order Entry Page
    #And CSR navigates to Review Cart page from Order Entry page
    #And CSR checks the include orders checkbox
    #When CSR navigates to Redemptions & Rewards page
    #Then blue header on SOO displays with $0.00 as total and no. of items as 0
    #And $0.00 displays for SOO Subtotal, taxes and SOO Total
    #And $0.00 displays in “Rewards earned with Today's Qualifying Order Value of”
    #Examples:
      #|UsingData|
      #|Dev35:PCOD:|
#
#@Later
#Scenario Outline: 2 parents with one child place orders connected to the same teacher [Review Cart]:[<UsingData>]
#Given implementation is pending for this
#Given 2 parents with one child connected to same teacher places order and teacher has pending orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1 and navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to Redemptions & Rewards page
#Then blue header on SOO displays with correct total and no. of items as in Child1 + Child2's total
#And correct SOO Subtotal, taxes and SOO Total displays as in Child1 + Child2's total
#And SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1 + Child2's Subtotal
#And shipping displays FREE
#Examples:
#|UsingData|
#|Dev35:PCOD:|

#@Later
#@Manual
#Scenario Outline: Parent with 2 children connected to two teachers located in different provinces and pending orders [Review Cart | GST_PST and HST]
#Given Parent having 2 children, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR searches for a teacher1
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR navigates to Review Cart page from Order Entry page
#And CSR checks the include orders checkbox
#When CSR navigates to Redemptions & Rewards page
#Then blue header on SOO displays with correct total and no. of items as in Child1's total
#And correct SOO Subtotal, taxes and SOO Total displays as in Child1's total
#And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child1's Subtotal
#When CSR searches for teacher2
#And CSR navigates to [Redemptions & Rewards] page
#Then blue header on SOO displays with correct total and no. of items as in Child2's total
#And correct SOO Subtotal, taxes and SOO Total displays as in Child2's total
#And SOO Subtotal displays in "Rewards earned with Today's Qualifying Order Value of" as in Child2's Subtotal
#And Shipping Fee is FREE!