Feature: InSprint_12.3
  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-4594  				 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Priority1
  @SCSCOD-4594
  @RewardsAndCoupons
  Scenario Outline:Edit and Apply buttons should be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections in Redemptions & Rewards page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And Teacher adds items from Student and Teacher clubs less than [shipping threshold]
    When Teacher navigates to rewards & coupons page
    Then only Apply buttons should be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections
    And teacher enter bonus amount for Student Clubs and clicks Apply button
    And Edit button should be seen for Student Clubs
    And teacher enter bonus amount for Teacher Catalogues and clicks Apply button
    And Edit button should be seen for Teacher Catalogues
    And teacher enter bonus amount for Shipping & Handling section and clicks Apply button
    And Edit button should be seen for Shipping & Handling section

  Examples:
    | UsingData                                                |
    | InSprint_12.3:Dev35:Teacher_Redemptions_Edit_ApplyButtons|


  @Priority1
  @SCSCOD-4594
  @RewardsAndCoupons
  Scenario Outline:Skip button should not be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections in Redemptions & Rewards page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And Teacher adds items from Student and Teacher clubs less than [shipping threshold]
    When Teacher navigates to rewards & coupons page
    Then Skip button should not be seen for Student Clubs, Teacher Catalogues, and Shipping & Handling sections


  Examples:
    | UsingData                                                    |
    | InSprint_12.3:Dev35:Teacher_Redemptions_SkipButton_NotPresent|


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-5033     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Payment
  @SCSCOD-5033
  @Priority1
  Scenario Outline:Postal code field is auto-formatted to correct format when valid postal code is entered in combination of lower case and upper case with space:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter valid postal code as combination of lower case and upper case with space after 3 characters along with other required information
    Then postal code field is auto-formatted to correct format
    And correct provice should populate in province field
    And teacher clicks on "Continue checkout"
    Then auto formatted postal code should be seen in alternative shipping address in confirm submit page

  Examples:
    |UsingData                                                                  |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_LowerUpperCase_WithSpace|


  @Payment
  @SCSCOD-5033
  @Priority1
  Scenario Outline:Postal code field is auto-formatted to correct format when valid postal code is entered in lower case with space:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter valid postal code as lower case with space after 3 characters along with other required information
    Then postal code field is auto-formatted to correct format
    And correct provice should populate in province field
    And teacher clicks on "Continue checkout"
    Then auto formatted postal code should be seen in alternative shipping address in confirm submit page

  Examples:
    |UsingData                                                             |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_LowerCase_WithSpace|


  @Payment
  @SCSCOD-5033
  @Priority1
  Scenario Outline:Postal code field is auto-formatted to correct format when valid postal code is entered in combination of lower case and upper case without space:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter valid postal code as combination of lower case and upper case without space along with other required information
    Then postal code field is auto-formatted to correct format
    And correct provice should populate in province field
    And teacher clicks on "Continue checkout"
    Then auto formatted postal code should be seen in alternative shipping address in confirm submit page

  Examples:
    |UsingData                                                                     |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_LowerUpperCase_WithoutSpace|


  @Payment
  @SCSCOD-5033
  @Priority1
  Scenario Outline:Postal code field is auto-formatted to correct format when valid postal code is entered in lower case without space:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter valid postal code as lower case without space along with other required information
    Then postal code field is auto-formatted to correct format
    And correct provice should populate in province field
    And teacher clicks on "Continue checkout"
    Then auto formatted postal code should be seen in alternative shipping address in confirm submit page

  Examples:
    |UsingData                                                            |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_Lower_WithoutSpace|


  @Payment
  @SCSCOD-5033
  @Priority2
  Scenario Outline:Proper validation message is seen if teacher enters postal code with 7 characters with no space:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter postal code with 7 characters with no space and tab out
    Then “Please enter a valid postal code.” should display

  Examples:
    |UsingData                                                        |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_7Char_ErrorMsg|


  @Payment
  @SCSCOD-5033
  @Priority2
  Scenario Outline:Proper validation message is seen if teacher enters postal code as less than 6 characters:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter postal code with less than 6 characters and tab out
    Then “Please enter a valid postal code.” should display

  Examples:
    |UsingData                                                        |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_6Char_ErrorMsg|


  @Payment
  @SCSCOD-5033
  @Priority3
  Scenario Outline:Proper UI should be present for postal code text field in alternative shipping address option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    When teacher selects alternative shipping option
    Then postal code field is displayed in gray with place holder as “E.G. M5V 1E1”

  Examples:
    |UsingData                                            |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_UI|




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-5052     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @DollarstoSpend
  @Priority2
  @SCSCOD-5052
  Scenario Outline:Correct unique item number is displayed on order history page for DTS:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items with unique item id number to the cart with [minumum amount]
    And Teacher navigates to rewards & coupons page
    And teacher sees the Dollars to spend promotion
    And teacher clicks on Make Selection button
    And teacher selects an item from the Make Selection window having unique item id
    And teacher clicks on Confirm Selection button
    And teacher proceeds to checkout from coupons & rewards page and submit the order
    When teacher navigates to my account page and click on view order option under order history for latest booked order
    Then teacher see the item selected from Dollars to spend with unique item id with correct format in Rewards Section

  Examples:
    | UsingData                                                |
    | InSprint_12.3:Dev35:Teacher_DTS_OrderHistory_UniqueItemId|


  @FreePick
  @Priority2
  @SCSCOD-5052
  Scenario Outline:Correct unique item number is displayed on order history page for Free pick:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items with unique item id number to the cart with [minumum amount]
    And teacher navigates to coupons & Rewards page
    And Teacher enters [Free Pick Coupon]
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from the model window having unique item id
    And teacher clicks on Confirm Selection button
    And teacher proceeds to checkout from coupons & rewards page and submit the order
    When teacher navigates to my account page and click on view order option under order history for latest booked order
    Then teacher see the item selected from Free pick window with unique item id with correct format in Rewards Section

  Examples:
    | UsingData                                                     |
    | InSprint_12.3:Dev35:Teacher_FreePick_OrderHistory_UniqueItemId|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-4486     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @MyAccount
  @Priority1
  @SCSCOD-4486
  Scenario Outline:Teacher should be able to udpate unique email address at time of profile edits:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And clicks on Profile from My Account dropdown
    And teacher click Edit link present under My Profile section
    When teacher provides unique email address along with other required details
    And teacher clicks SAVE button
    Then changes should be updated without any issues

  Examples:
    | UsingData                                          |
    | InSprint_12.3:Dev35:Teacher_UniqueEmail_EditProfile|


  @MyAccount
  @Priority1
  @SCSCOD-4486
  Scenario Outline:Proper error message should be seen if email associated to other account is updated at time of profile edits:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And clicks on Profile from My Account dropdown
    And teacher click Edit link present under My Profile section
    When teacher provides email address which is already associated to other account along with other required details
    And teacher clicks SAVE button
    Then “This email address has already been assigned to an account. Please enter a different email address.” should be seen

  Examples:
    | UsingData                                                           |
    | InSprint_12.3:Dev35:Teacher_DuplicateEmail_ValidationMsg_EditProfile|


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-4637     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

  @Payment
  @SCSCOD-4637
  @Priority1
  Scenario Outline:Continue Checkout button is enabled when incorrect postal code is entered and changed back to correct postal code:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enters incorrect postal code along with other required information
    Then Continue Checkout button should be disabled
    And teacher corrects the postal code with correct one
    Then Continue Checkout button should be enabled

  Examples:
    |UsingData                                                                                 |
    |InSprint_12.3:dev35:AlternativeShipping_PostalCode_Incorrect_Correct_ContinueChkBtnEnabled|


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    DTS             			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

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




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    YTO             			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @YTO
  @SCSCOD-4220
  @Priority3
  Scenario Outline:Teacher is navigated to specific grade's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on Early Childhood Elf flyer present under Grade section
    Then teacher is navigated to Early Childhood Elf flyer for current month in YTO page

  Examples:
    |UsingData                                                 |
    |InSprint_12.3:dev35:Teacher_AllFlyers_SpecGradesFlyerMonth|


  @YTO
  @SCSCOD-4220
  @Priority3
  Scenario Outline:Teacher is naviagted to special collection's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on Special Offers flyer present under Grade section
    Then teacher is navigated to special Offers flyer for current month in YTO page

  Examples:
    |UsingData                                                    |
    |InSprint_12.3:dev35:Teacher_AllFlyers_SpecialOffersFlyerMonth|


  @YTO
  @SCSCOD-4220
  @Priority3
  Scenario Outline:Teacher is naviagted to French Club's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on French Club flyer present under French section
    Then teacher is navigated to Club de lecture flyer for current month in YTO page

  Examples:
    |UsingData                                                  |
    |InSprint_12.3:dev35:Teacher_AllFlyers_FrenchClubsFlyerMonth|


  @YTO
  @SCSCOD-4220
  @Priority3
  Scenario Outline:Teacher is naviagted to correct special collection's flyer by month as linked by marketing team when clicked on All Flyers option:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    And teacher clicks on Special Offers flyer present under Grade section
    Then teacher is navigated to special Offers flyer for current month in YTO page
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    And teacher clicks on other Special Offers flyer present under Grade section
    Then teacher is navigated to special Offers flyer for current month in YTO page
    And teacher selects “ALL FLYERS” option present in main menu on top of the page
    When teacher clicks on flyer in special collection which was selected for the first time
    Then teacher is navigated to special Offers flyer for current month in YTO page

  Examples:
    |UsingData                                                    |
    |InSprint_12.3:dev35:Teacher_AllFlyers_SpecialOffersFlyerMonth_Repititive|



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    Search             			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Search
  @SCSCOD-4639
  @Priority2
  Scenario Outline:Teacher sees Item ID and flyer according to logged in teachers grade in PDP page, when same item is available in other grades and teacher teaching at a grade level that matches one of those flyers:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is present in logged in teacher's grade and also in other grades
    Then teacher sees grade related to logged in teacher for item in PDP page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_MultipleGrades|



  @ReviewCart
  @SCSCOD-4639
  @Priority2
  Scenario Outline:Teacher sees Item ID according to logged in teachers grade in Review Cart page, when same item is available in other grades and teacher teaching at a grade level that matches one of those flyers:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher add item to cart which is present in logged in teacher's grade and also in other grades
    Then teacher sees grade related to logged in teacher for item in Review Cart page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductReviewCart_MultipleGrades|


  @Search
  @SCSCOD-4639
  @Priority2
  Scenario Outline:Teacher sees Item ID from default grade or according to search ranking rule to teacher’s grade in PDP page, when item is not available in logged in teacher’s grade:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is not present in logged in teacher's grade
    Then teacher sees default grade or according to search ranking rule to teacher’s grade in PDP page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_NotPresentTeachersGrade|

  @ReviewCart
  @SCSCOD-4639
  @Priority2
  Scenario Outline:Teacher sees Item ID from default grade or according to search ranking rule to teacher’s grade in Review Cart page, when item is not available in logged in teacher’s grade:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher add item to cart which is not present in logged in teacher's grade
    Then teacher sees default grade or according to search ranking rule to teacher’s grade in Review Cart page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductReviewCart_NotPresentTeachersGrade|



  @Search
  @SCSCOD-4639
  @Priority2
  Scenario Outline:Teacher do not see Item ID in PDP page, when same item is available in other grades and logged in teacher is admin or teacher by speciality:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is present in multiple grades
    Then teacher do not see any item id in PDP page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_Admin|


  @Search
  @SCSCOD-4639
  @Priority2
  Scenario Outline:Teacher sees correct order Item ID's and flyers on pop up in PDP page, when same item is available in other grades and teacher teaching at a grade level that matches one of those flyers:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is present in logged in teacher's grade and also in other grades
    And mouse hover the grade in PDP page
    Then teacher sees correct order of item id's and grades

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_ItemIdsGradesOrder|




      
  