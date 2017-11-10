Feature: DWCAPCOD-1453
This feature is to validate the Teachers - Checkout - Backend Rewards Recalculation scenarios

Background: 
Given Parent opens scholastic reading clubs e-commerce site	

@1
@DWCAPCOD-1453

Scenario Outline: Teacher can apply SFO coupon on pre-tax SOO subtotal:[<UsingData>]

Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for SFO coupon
 And teacher logs in to the application by providing [UserInformation]
  And delete items other than SOO
# And teacher comes to Home page
  And user navigate to home page
And teacher clicks enter orders
And teacher clicks “Student Flyer Orders” link
And Student Flyer Order modal is displayed
And teacher clicks on the delete SFO coupon
And teacher click on link “Apply a coupon for this student”
And SFO Coupon Modal is displayed
When teacher enters valid Student Name
And teacher enters valid Coupon code
And teacher click on Apply
And teacher searches for a [qualifying Item number]
And teacher selects an item from the results
And teacher clicks on Confirm Selection button
Then SFO freepick item information displays on the SFO page
And teacher clicks on the delete SFO coupon
  Examples:
    | UsingData |
    | Backend_Rewards_Recalculation_1 |

@2
@DWCAPCOD-1453
Scenario Outline: Teacher can apply Teacher Freepick coupon on pre-tax SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Freepick coupon
  And teacher logs in to the application by providing [UserInformation]
  And delete items other than SOO
# And teacher comes to Home page
  And user navigate to home page
    And teacher navigates to Coupons & Rewards page from Home page
    And teacher clicks on Delete coupon
    When Teacher enters [Free Pick Coupon] on rewards and coupons page
    When teacher searches for a [qualifying Item number]
    And teacher selects an item from the freepick modal
    And selected item displays in Current Selection section for Freepick
    And teacher clicks on Confirm Selection button
    Then the freepick coupon information displays under Applied Coupons section
    And teacher clicks on Delete coupon
    #And teacher clicks on Yes option
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_2 |

  @3
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply BonusFlat coupon on pre-tax SOO subtotal:[<UsingData>]

    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher navigates to Coupons & Rewards page from Home page
    And teacher clicks on Delete coupon
    #And teacher clicks on Yes option
    When Teacher enters a Bonus Flat coupon
    Then Bonus Flat coupon information displays under Applied Coupons section
    And teacher clicks on Delete coupon
    #And teacher clicks on Yes option


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_3 |

  @4
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply TGAT coupon on pre-tax SOO subtotal:[<UsingData>]

    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for TGAT coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher navigates to Coupons & Rewards page from Home page
    And  teacher clicks on Delete coupon
    When Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed
    And the TGAT coupon information displays under Applied Coupons section
    And teacher clicks on Delete coupon
   # And teacher clicks on Yes option


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_4 |

  @5
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply FreeItem coupon on pre-tax SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Free Item coupon
    And teacher logs in to the application by providing [UserInformation]
    And teacher navigates to Coupons & Rewards page from Home page
    And teacher clicks on Delete coupon
    When Teacher applies [Free item coupon]
    Then Teacher sees Free item displayed in Coupons section
    And teacher clicks on Delete coupon
    #And teacher clicks on Yes option

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_5 |

  @6
  @DWCAPCOD-1453
  Scenario Outline: Teacher cannot redeem FreeShipping coupon on pre-tax SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Free Shipping coupon
    And teacher logs in to the application by providing [UserInformation]
    And teacher navigates to Coupons & Rewards page from Home page
    When teacher applies [Free Shipping Coupon]
    Then teacher sees error message “Shipping for your order is already FREE! This coupon code cannot be applied.”

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_6 |

  @7
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Bonus Flat promotion on pre-tax SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat promotion
    And teacher logs in to the application by providing [UserInformation]
    When teacher navigates to Coupons & Rewards page from Home page
    Then teacher see Bonus Flat description in Rewards section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_7 |

  @8
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Student Incentive on pre-tax SOO subtotal:[<UsingData>]

    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Student Incentive promotion
    And teacher logs in to the application by providing [UserInformation]
    When teacher navigates to Coupons & Rewards page from Home page
    Then teacher sees the Student Incentive description in Rewards section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_8 |


  @9
  @DWCAPCOD-1453

  Scenario Outline: Teacher can redeem Free Item promotion on pre-tax SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Free Item promotion
    And teacher logs in to the application by providing [UserInformation]
    When teacher navigates to Coupons & Rewards page from Home page
    Then teacher sees the Free Item description in Rewards section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_9 |

  @10
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Spell Scholastic promotion on pre-tax SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal qualifies for min. amount for Spell Scholastic promotion
    And teacher logs in to the application by providing [UserInformation]
    When teacher navigates to Coupons & Rewards page from Home page
    Then teacher sees the Spell Scholastic promotion description in Rewards section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_10 |


  @11
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply SFO coupon on pre-tax SOO + SFO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for SFO coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SOO + SFO pre-tax subtotal meets the min. amount for SFO coupon
    And teacher clicks on the delete SFO coupon
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And teacher searches for a [qualifying Item number]
    And teacher selects an item from the results
    And teacher clicks on Confirm Selection button
    Then SFO freepick item information displays on the SFO page


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_11 |

  @12
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply Teacher Freepick coupon on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for freepick coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO from xml such that SOO + SFO pre-tax subtotal meets the min. amount for freepick coupon
    And teacher navigates to [Review Cart] page
    And teacher navigates to [Redemptions & Rewards] page
    When Teacher enters [Free Pick Coupon] on rewards and coupons page
    And teacher searches for a [qualifying Item number]
    And teacher selects an item from the freepick modal
    And selected item displays in Current Selection section for Freepick
    And teacher clicks on Confirm Selection button
    Then the freepick coupon information displays under Applied Coupons section
    And teacher is back to SFO section
    And empty SFO section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_12 |


  @13
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply BonusFlat coupon on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO from xml such that SOO + SFO pre-tax subtotal meets the min. amount for freepick coupon
    And teacher navigates to [Review Cart] page
    And teacher navigates to [Redemptions & Rewards] page
    When Teacher enters a Bonus Flat coupon
    Then Bonus Flat coupon information displays under Applied Coupons section
    And teacher is back to SFO section
    And empty SFO section


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_13 |


  @14
  @DWCAPCOD-1453

  Scenario Outline: Teacher can apply TGAT coupon on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for TGAT coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO from xml such that SOO + SFO pre-tax subtotal meets the min. amount for freepick coupon
    And teacher navigates to [Review Cart] page
    And teacher navigates to [Redemptions & Rewards] page
    When Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed
    And the TGAT coupon information displays under Applied Coupons section
    And teacher is back to SFO section
    And empty SFO section
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_14 |


  @15
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply FreeItem coupon on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for FreeItem coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SOO + SFO pre-tax subtotal meets the min. amount for FreeItem coupon
    And teacher navigates to [Review Cart] page
    And teacher navigates to [Redemptions & Rewards] page
    When Teacher applies [Free item coupon]
    Then Free Item coupon information displays under Applied Coupons section
    And teacher is back to SFO section
    And empty SFO section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_15 |


  @16
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Bonus Flat promotion on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat Promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SOO + SFO pre-tax subtotal meets the min. amount for Bonus Flat Promotion
    And teacher navigates to [Review Cart] page
    And teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Bonus Flat description in Rewards section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_16 |

  @17
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Student Incentive on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Student Incentive promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SOO + SFO pre-tax subtotal meets the min. amount for Student Incentive promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Student Incentive description in Rewards section


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_17 |


  @18
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Free Item promotion on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Free Item Promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SOO + SFO pre-tax subtotal meets the min. amount for Free Item Promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Free Item description in Rewards section

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_18 |


  @19
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Spell Scholastic promotion on pre-tax SFO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Spell Scholastic
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SOO + SFO pre-tax subtotal meets the min. amount for Spell Scholastic
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Spell Scholastic promotion description in Rewards section


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_19 |


#@20
#Scenario Outline: Teacher can apply YTO coupon on pre-tax SOO + YTO subtotal:[<UsingData>]
#Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for YTO coupon
#And teacher logs in to the application by providing [UserInformation]
#And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for YTO coupon
#And teacher click on link “Apply a coupon for this student”
#And YTO Coupon Modal is displayed
#When teacher enters valid Student Name
#And teacher enters valid Coupon code
#And teacher click on Apply
#And teacher searches for a [qualifying Item number]
#And teacher selects an item from the results
#And teacher clicks on Confirm Selection button
#Then YTO freepick item information displays on the YTO page
#
#
#   Examples:
#    | UsingData |
#    | Backend_Rewards_Recalculation_20 |


  @21
  @DWCAPCOD-1453

  Scenario Outline: Teacher can apply Teacher Freepick coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for freepick coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for freepick coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And Teacher enters [Free Pick Coupon] on rewards and coupons page
    And Free pick modal displays
    And teacher searches for a [qualifying Item number]
    Then item displays in results in Free Pick model
    And teacher selects an item from the results
    And selected item displays in Current Selection section for Freepick
    And teacher clicks on Confirm Selection button
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_21 |


  @22
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply BonusFlat coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for Bonus Flat coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    When Teacher enters a Bonus Flat coupon
    Then Bonus Flat coupon information displays under Applied Coupons section


    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_22 |


  @23
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply TGAT coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for TGAT coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for TGAT coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed
    And the TGAT coupon information displays under Applied Coupons section



    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_23 |


  @24
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply FreeItem coupon on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for FreeItem coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for FreeItem coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And Teacher applies [Free item coupon]
    Then Free Item coupon information displays under Applied Coupons section
    And teacher click on link Edit Cart
    And empty items other than SOO

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_24 |


  @25
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Bonus Flat promotion on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat Promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for Bonus Flat Promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Bonus Flat description in Rewards section
    And teacher click on link Edit Cart
    And empty items other than SOO

    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_25 |


  @26
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Student Incentive on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Student Incentive promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for Student Incentive promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Student Incentive description in Rewards section
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_26 |


  @27
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Free Item promotion on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Free Item Promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for Free Item Promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Free Item description in Rewards section
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_27 |


  @28
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Spell Scholastic promotion on pre-tax YTO + SOO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Spell Scholastic
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to YTO such that SOO + YTO pre-tax subtotal meets the min. amount for Spell Scholastic
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    Then teacher sees the Spell Scholastic promotion description in Rewards section
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_28 |


  @29
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply SFO coupon on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for SFO coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO items such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for SFO coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    And Teacher navigates to SFO page from Redemptions page
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher clicks on Apply
    Then error message displays for SFO field
    And teacher click on the close icon
    And teacher navigates to [Review Cart] page
    And empty items other than SOO




    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_29 |


  @30
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply Teacher Freepick coupon on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for freepick coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for freepick coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    And Teacher enters [Free Pick Coupon] on rewards and coupons page
    Then error message displays for SFO field
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_30 |


  @31
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply BonusFlat coupon on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for Bonus Flat coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    When Teacher enters a Bonus Flat coupon
    Then error message displays for COUPONS field
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_31 |


  @32
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply TGAT coupon on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for TGAT coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for TGAT coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    When Teacher enters a TGAT coupon
    Then error message displays for COUPONS field
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_32 |


  @33
  @DWCAPCOD-1453
  Scenario Outline: Teacher can apply FreeItem coupon on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for FreeItem coupon
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for FreeItem coupon
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    When Teacher applies [Free item coupon]
    Then error message displays for COUPONS field
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_33 |


  @34
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Bonus Flat promotion on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Bonus Flat Promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for Bonus Flat Promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    Then teacher does not see the Bonus Flat description in Rewards section
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_34 |


  @35
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Student Incentive on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Student Incentive promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for Student Incentive promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    Then teacher does not see the Student Incentive description in Rewards section
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_35 |


  @36
  @DWCAPCOD-1453
  Scenario Outline: Teacher can redeem Free Item promotion on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Free Item Promotion
    And teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for Free Item Promotion
    And teacher navigates to [Review Cart] page
    When teacher navigates to [Redemptions & Rewards] page
    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
    Then teacher does not see the Free Item description in Rewards section
    Then Teacher sees Free item displayed in Coupons section
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_36 |


#@37
#Scenario Outline: Teacher can redeem Spell Scholastic promotion on pre-tax SFO + SOO + YTO subtotal:[<UsingData>]
#    Given teacher has pending parent items in cart whose pre-tax subtotal is less than min. amount for Spell Scholastic
#    And teacher logs in to the application by providing [UserInformation]
#    And teacher adds items to SFO & YTO such that SFO + SOO + YTO pre-tax subtotal meets the min. amount for Spell Scholastic
#    When Teacher navigates to Redemptions & Rewards page
#    And teacher applies redemptions from SFO & YTO making the order pre-tax subtotal less than the min. amount
#    Then teacher does not see the Spell Scholastic promotion description in Rewards section
#  And teacher click on link Edit Cart
#  And empty items other than SOO
#      Examples:
#    | UsingData |
#    | Backend_Rewards_Recalculation_37 |

#@38
#Scenario Outline: Deleting SOO order does not qualify for promotion:[<UsingData>]
#    Given teacher has pending parent orders in cart whose pre-tax subtotal qualifies for min. amount for Bonus Flat promotion
#    And teacher logs in to the application by providing [UserInformation]
#    And teacher navigates to cart page from Home page
#    And teacher deletes one of the parent order making the pre-tax subtotal less than the min. amount
#    When Teacher navigates to Redemptions & Rewards page
#    Then teacher does not see the Bonus Flat description in Rewards section
#  And teacher click on link Edit Cart
#  And empty items other than SOO
#      Examples:
#    | UsingData |
#    | Backend_Rewards_Recalculation_38|
#

  @39
    
  Scenario Outline: Teacher cannot redeem bonus flat coupon on Teacher Exclusive items:[<UsingData>]
    Given teacher logs in to the application by providing [UserInformation]
    And delete items other than SOO
# And teacher comes to Home page
    And user navigate to home page
    And teacher adds teacher exclusive items to cart meeting the min. amount for the coupon
    And teacher click on cart
    When teacher navigates to [Redemptions & Rewards] page
    And Teacher enters a Bonus Flat coupon
    Then error message displays for COUPONS field
    And teacher click on link Edit Cart
    And empty items other than SOO
    Examples:
      | UsingData |
      | Backend_Rewards_Recalculation_39 |