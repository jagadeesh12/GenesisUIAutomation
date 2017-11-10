Feature: DTS
  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site


@DollarsToSpend
@Priority1
@SCSCOD-4267
Scenario Outline:Teacher selects an item by Selecting a grade from Grade level dropdown in DTS model window:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher selects a grade
When teacher selects an item from Make Selection window
Then selected item displays in the Current Selection section

Examples:
| UsingData                                		 	|
| BTS:DollarsToSpend:Teacher_DTS_Selection_Grade |


@DollarsToSpend
@Priority1
@SCSCOD-4267
Scenario Outline:Teacher selects an item by searching with specific term in DTS model window:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher searches for a [qualifying Item number]
And item displays in results in DTS model
When teacher selects an item from the Make Selection window
Then selected item displays in Current Selection section for DTS

Examples:
| UsingData                                		 	|
| BTS:DollarsToSpend:Teacher_DTS_Selection_Search_ValidSearch |

  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct HST on top-off amount for DTS when single item is selected with multiple quantity for NL province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_HST_Province_NL|


  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct HST on top-off amount for DTS when single item is selected with multiple quantity for NB province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_HST_Province_NB|



  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct HST on top-off amount for DTS when single item is selected with multiple quantity for NS province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_HST_Province_NS|



  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct HST on top-off amount for DTS when single item is selected with multiple quantity for ON province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    When Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion2
    And teacher clicks on Make Selection button
    And teacher selects a grade
    And teacher selects the multiple items from same grade in Make Selection window2
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_HST_Province_ON|



  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct HST on top-off amount for DTS when single item is selected with multiple quantity for PE province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then HST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_HST_Province_PE|



  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct GST on top-off amount for DTS when single item is selected with multiple quantity for AB province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then GST is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_HST_Province_AB|


  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct GST & PST on top-off amount for DTS when single item is selected with multiple quantity for BC province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_GST_PST_Province_BC|



  @DollarsToSpend
  @SCSCOD-4138
  @Priority1
  Scenario Outline:Teacher is charged correct GST & QST on top-off amount for DTS when single item is selected with multiple quantity for QC province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    |UsingData|
    |InSprint_12.3:Dev35:Teacher_DTS_TopOff_GST_QST_Province_QC	|


  @DollarsToSpend
  @Priority1
  @Maintenance
  Scenario Outline:Teacher is not charged taxes on top-off amount for DTS when single item is selected with multiple quantities for tax exempted schools for MB province:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds student club items to cart with [minumum amount]
    And Teacher navigates to Review Your Cart page
    And  teacher navigates to coupons & Rewards page
    And teacher views Dollars to Spend promotion
    And teacher clicks on Make Selection button
    When teacher clicks on make selection and selects an item such that there is a top-off
    And teacher makes the qty as 3
    And teacher clicks on Confirm Selection button
    Then No tax is charged on the top off amount and post tax top off amount is added to Student club total

  Examples:
    | UsingData                                							    |
    |InSprint_12.3:Dev35:TeacherOrder_TopOff_GardenHillHighSchoolGardenHill_MB|