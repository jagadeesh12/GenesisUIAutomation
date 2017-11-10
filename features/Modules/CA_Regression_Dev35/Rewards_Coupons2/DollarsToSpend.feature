Feature: DollarstoSpend
  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site


#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            DOLLARS TO SPEND SCENARIOS                  ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################



  @Golden
  @DollarstoSpend
  @Priority1
  Scenario Outline:Teacher receives Dollars to Spend automatic promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    Then teacher views Dollars to Spend promotion


  Examples:
    |UsingData								|
    |Golden:Teacher_DTS_with_minimum_amount	|



  @Golden
  @DollarstoSpend
  @Maintenance
  @Priority1
  Scenario Outline:Teacher does not receive Dollars to spend promotion on a cart which does not meet minimum amount:[<UsingData>]
    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart less than [minumum amount]
    When teacher navigates to coupons & Rewards page
    Then teacher does not receive Dollars to Spend promotion

  Examples:
    |UsingData									|
    |Golden:Teacher_DTS_without_minimum_amount	|



  @Golden
  @DollarstoSpend
  @Maintenance
  @Priority1
  Scenario Outline:Teacher does not receive Dollars to Spend promotion if the cart total qualifying for promotion includes Redemptions:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher adds Student club items to cart less than the [Manual shipping threshold]
    And teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher enters [Student dollar amount] of Bonus coupon to redeem from Student Bonus bank
    Then teacher does not receive Dollars to Spend promotion

  Examples:
    |UsingData												|
    |Golden:Teacher_redeems_studentdollars_on_minimum_amount|

  @Golden
  @DollarstoSpend
  @Maintenance
  @Priority1
  Scenario Outline:Teacher does not receive Dollars to Spend promotion on cart with Teacher catalogs:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher add “teacher club items” to cart from YTO page
    When teacher navigates to coupons & Rewards page
    Then teacher does not receive Dollars to Spend promotion

  Examples:
    |UsingData								|
    |Golden:TeacherCatalogue_DTS_with_minimum_amount	|


  @Golden
  @DollarstoSpend
  @Maintenance
  @Priority1

  Scenario Outline:Teacher selects items from multiple flyers from DTS modal such that there is a top-off and checkout:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
   #And teacher navigates to coupons & Rewards page
   #And teacher views Dollars to Spend promotion
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from the Make Selection window
    And teacher selects a different grade from dropdown
    And teacher select an item such that there is a top-off
    And teacher clicks on Confirm Selection button
    And teacher is on coupons & Rewards page
    When teacher proceeds to checkout from rewards and coupons page
    Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
    And teacher submit the order
    And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page

  Examples:
    |UsingData													|
    |Golden:Teacher_DTS_with_minimum_amount_TopOffAmt_Checkout	|

  @Golden
  @DollarstoSpend
  @Priority1
  Scenario Outline:Teacher selects free pick item less than or equal to the coupon amount and checkout:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item less than or equal to the coupon amount
    And teacher clicks on Confirm Selection button
    And teacher is on coupons & Rewards page
    When teacher proceeds to checkout from rewards and coupons page
    Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
    And teacher submit the order
    And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page

  Examples:
    |UsingData|
    |Golden:Teacher_DTS_with_minimum_amount_FPI_Checkout|

  @Golden
  @DollarstoSpend
  @SCSCOD-3661
  @Maintenance
  @Priority1
  Scenario Outline:Top-off amount selected by teacher should be added to the cart total:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item such that there is a top-off
    And teacher clicks on Confirm Selection button
    When teacher is on coupons & Rewards page
    Then the cart total includes the top-off amount
    And teacher proceeds to checkout from rewards and coupons page
    And teacher see the cart total includes the top-off amount in Confirm & submit page
    And teacher submit the order
    And teacher see the cart total includes the top-off amount in confirmation page

  Examples:
    |UsingData|
    |Golden:Teacher_DTS_with_minimum_amount_CartTotal_IncludesTopOffAmt|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher views results by Selecting a grade from Grade level dropdown:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion
    And teacher clicks on Make Selection button
    And teacher selects a grade
    Then items from all flyers mapped to the grade from current calendar month displays

  Examples:
    | UsingData                                		 	|
    | BTS:DollarsToSpend:Teacher_gets_DTS_with_minimum_amount |


  @DollarsToSpend
  @Priority1
  @Maintenance
  @DTSIssue
  Scenario Outline:Teacher selects an item by Selecting a grade from Grade level dropdown:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window
    Then selected item displays in the Current Selection section

  Examples:
    | UsingData                                		|
    | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher selects items from same flyer on DTS modal and checkout:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window
    And teacher clicks on Confirm Selection button
    And teacher is on coupons & Rewards page
    When teacher proceeds to checkout from rewards and coupons page
    Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
    And teacher submit the order
    And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page

  Examples:
    | UsingData                                							|
    | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_MultiItems_Checkout 	|



  @DollarsToSpend
  @Priority1
  @Maintenance

  Scenario Outline:Teacher is charged GST & PST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total
    

  Examples:
    | UsingData                                				|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_GST_PST_Province_BC 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged GST & QST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                				|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_GST_QST_Province_QC 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NL:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NL 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NB:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NB 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NS:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_NS 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-ON:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_ON 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-PE:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_HST_Province_PE 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-AB:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_AB 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NT:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NT 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-NU:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NU 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal-YT:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_YT 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-BC:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_BC 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-QC:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_QC	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-NL:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_NL 	|



  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is charged only GST on top-off amount when multiple items are selected from Dollars to Spend modal-AB:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window2
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_GST_Province_AB_2 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is not charged taxes on top-off amount for tax exempted schools when multiple items are selected from Dollars to Spend modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window2
    And teacher clicks on Confirm Selection button
    Then No tax is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                									|
    | Golden:DollarsToSpend:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is not charged taxes on top-off amount for tax exempted schools when one item is selected from Dollars to Spend modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window2
    And teacher clicks on Confirm Selection button
    Then No tax is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                									|
    | BTS:DollarsToSpend:TeacherOrder_TopOff_Garden Hill High School Garden Hill MB_2 	|


## (commented by soma)  this is invalid
#@DollarsToSpend
#@Priority1
#Scenario Outline:Teacher is not charged taxes on top-off amount if the only item selected from Dollars to spend modal is tax exempted:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When teacher selects [enter classroom order] from home page
#	And teacher adds student club items to the cart with [minumum amount]
#	And Teacher navigates to Review Your Cart page
#	When Teacher navigates to rewards & coupons page
#	And teacher sees the Dollars to spend promotion2
#	And teacher clicks on Make Selection button
#	And teacher selects a grade
#	When teacher selects an item from Make Selection window2
#	And teacher clicks on Confirm Selection button
#	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total
#
#Examples:
#  | UsingData                                				|
#  | BTS:DollarsToSpend:TeacherOrder_TopOff_Item_TaxExempted 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  @SCSCOD-3537
  Scenario Outline:Teacher can redeem Dollars to Spend once per level per customer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window
    And teacher clicks on Confirm Selection button
    And teacher is on coupons & Rewards page
    When teacher proceeds to checkout from rewards and coupons page
    When teacher clicks on Submit Order
    And teacher navigates to Home page from Order ref page
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    Then teacher does not see the Dollars to spend promotion

  Examples:
    | UsingData                                			|
    | Golden:DollarsToSpend:Teacher_DTS_with_minimum_amount_2 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher can redeem Dollars to Spend on second tier if teacher already redeemed on first tier:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [tier1 minimum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    When teacher selects an item from Make Selection window
    And teacher clicks on Confirm Selection button
    And teacher is on coupons & Rewards page
    When teacher proceeds to checkout from rewards and coupons page
    When teacher clicks on Submit Order
    And teacher navigates to Home page from Order ref page
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [tier2 minimum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    Then teacher sees the Dollars to spend promotion

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_3 	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Message to explain teacher about the top-off amount being added to Student club total:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window
    And teacher clicks on Confirm Selection button
    And teacher is on coupons & Rewards page
    When teacher proceeds to checkout from rewards and coupons page
    Then teacher see the items selected from Dollars to spend with strike price in Rewards Section
    And teacher submit the order
    And teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page

  Examples:
    | UsingData                                			|
    | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_4 	|


  @DollarsToSpend
  @Sprint18
  @Priority2
  @NotDeveloped
  Scenario Outline:Teacher is mandated to redeem dollars to spend promotion:[<UsingData>]

    Given teacher login into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And Teacher navigates to rewards & coupons page
    And teacher views Dollars to Spend promotion
  #When teacher click on Continue Checkout without making selections from Dollars to Spend promotion
  #Then page refreshes and error message “To proceed with checkout, please select at least one item to redeem your Dollars To Spend.” displays
  Examples:
    | UsingData                       |
    | Teacher_DTS_with_minimum_amount_Skip |