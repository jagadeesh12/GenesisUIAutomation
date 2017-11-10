Feature: TGAT

  This feature is to validate the Teacher Get A Teacher story(TGAT) scenarios.


  Background:
    Given teacher open rco-scholastic web site


  @TGAT
  Scenario Outline:New teacher using TGAT coupon for student club items with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon
    Then TGAT modal window should be displayed
    When Teacher enters referring Teacher account details in TGAT modal window
    Then referring Teacher account details should be displyed in the [Coupons Applied] section
   #When Teacher navigates to the Payments page
   #And Teacher navigates to Confirm and Submit page
   #And Teacher submit the order
   #Then order confirmation details should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:Teacher_using_TGAT_coupon_for_student_club_items	|


  @TGAT
  Scenario Outline:New teacher using TGAT coupon for student club and teacher club items with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And Teacher adds student club and Teacher club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  											|
    | TGAT:Teacher_using_TGAT_coupon_for_student_and_teacher_club_items	|


  @TGAT

  Scenario Outline:New teacher using TGAT coupon for teacher club items with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher add “teacher club items” to cart from YTO page
    And teacher navigates to coupons & Rewards page
    When Teacher enters a TGAT coupon
    Then the error message 'Your order does not meet the coupon requirements.Please check the coupon for details' should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:Teacher_using_TGAT_coupon_for_teacher_club_items	|


  @TGAT
  Scenario Outline:Existing inactive teacher using valid TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    When Teacher enters inactive Teacher account details in TGAT modal window
    Then the error message 'This customer account number is invalid. Please make sure you entered the correct number' should be displayed

  Examples:
    | UsingData                  											|
    | TGAT:Teacher_using_TGAT_coupon_and_enters_Inactive_account_number	|


  @TGAT
  Scenario Outline:Teacher views TGAT coupon information in Confirm & Submit and Confirmation page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    And Teacher navigates to the Payments page
    When Teacher navigates to Confirm and Submit page
    Then TGAT coupon information should be displayed in Confirm and Submit page
    When Teacher submit the order
    Then TGAT coupon information should be displayed in Confirmation page

  Examples:
    | UsingData                  													|
    | TGAT:TGAT_coupon_information_in_Confirm_and_Submit_and_Confirmation_page	|



#@TGAT Satnam - This is manual test case as coupon once applied cant be applied again
#Scenario Outline:Teacher views TGAT coupon information in Confirmation page in Order History:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	And teacher selects [enter classroom order] from home page
#	And teacher adds student club items to the cart with [minumum amount]
#	And Teacher navigates to Redemptions & Rewards page
#	And Teacher enters a TGAT coupon
#	And Teacher enters referring Teacher account details in TGAT modal window
#	And Teacher navigates to the Payments page
#	And Teacher navigates to Confirm and Submit page
#	When Teacher submit the order
#	Then Teacher can see the TGAT coupon information in Order History section
#
#Examples:
#  | UsingData                  								|
#  | TGAT:TGAT_coupon_information_in_Order_History_section	|
#
#

  @TGAT
  Scenario Outline:New teacher using TGAT coupon with incorrect referring teacher customer number:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    When Teacher enters invalid referring Teacher account number in TGAT modal window
    Then the error message 'This customer account number is invalid. Please make sure you entered the correct number' should be displayed

  Examples:
    | UsingData                  							|
    | TGAT:TGAT_coupon_with_incorrect_referring_teacher	|


  @TGAT
  Scenario Outline:New teacher using TGAT coupon without referring teacher customer number:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    When Teacher enters only the [Fname] and [Lname] of referring Teacher in TGAT modal window
    Then the [Submit] button should be disabled

  Examples:
    | UsingData                  									|
    | TGAT:TGAT_coupon_with_only_Fname_Lname_referring_teacher	|


  @TGAT
  Scenario Outline:New teacher using TGAT coupon without referring teacher's first name:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    When Teacher enters only the [AcNumber] and [Lname] of referring Teacher in TGAT modal window
    Then the [Submit] button should be disabled

  Examples:
    | UsingData                  									|
    | TGAT:TGAT_coupon_with_only_AcNumber_Lname_referring_teacher	|


  @TGAT
  Scenario Outline:New teacher using TGAT coupon without referring teacher's last name:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    When Teacher enters only the [AcNumber] and [Fname] of referring Teacher in TGAT modal window
    Then the [Submit] button should be disabled

  Examples:
    | UsingData                  									|
    | TGAT:TGAT_coupon_with_only_AcNumber_Fname_referring_teacher	|


  @TGAT
  Scenario Outline:New teacher using multiple TGAT coupon in different orders with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon which is referred by [Teacher1]
    And Teacher enters referring Teacher account details in TGAT modal window
    And Teacher navigates to the Payments page
    And Teacher navigates to Confirm and Submit page
    And Teacher submit the order
    And Teacher goes to YTO page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is referred by [Teacher2]
    Then the error message 'Our records indicate that you have already redeemed this Coupon.' should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:Teacher_using_multiple_TGAT_coupon_for_diff_orders	|


  @TGAT
  Scenario Outline:New teacher using multiple TGAT coupon in same order with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon which is referred by [Teacher1]
    And Teacher enters referring Teacher account details in TGAT modal window
    When Teacher enters a TGAT coupon which is referred by [Teacher2]
    Then the error message 'This Coupon has already been applied to this order' should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:Teacher_using_multiple_TGAT_coupon_for_same_orders	|


  @TGAT
  Scenario Outline:New teacher using invalid TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters invalid TGAT coupon
    Then the error message 'Coupon code is unknown.' should be displayed

  Examples:
    | UsingData                  				|
    | TGAT:Teacher_enters_invalid_TGAT_coupon	|


  @TGAT
  Scenario Outline:New teacher using expired TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters expired TGAT coupon
    Then the error message 'Coupon code is unknown.' should be displayed

  Examples:
    | UsingData                  				|
    | TGAT:Teacher_enters_expired_TGAT_coupon	|


  @TGAT
  Scenario Outline:New teacher using TGAT coupon without qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And Teacher adds student club items to the cart without qualifying [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon
    Then the error message 'Your order does not meet the coupon requirements. Please check the coupon for details.' should be displayed

  Examples:
    | UsingData                  						|
    | TGAT:TGAT_coupon_without_qualifying_order_value	|



  @TGAT
  Scenario Outline:Teacher already redeemed TGAT coupon using same TGAT coupon with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is already applied and redeemed
    Then the error message 'You have already redeemed this coupon code on a previous order.' should be displayed

  Examples:
    | UsingData                  										|
    | TGAT:Already_redeemed_TGAT_coupon_with_qualifying_order_value	|


  @TGAT
  Scenario Outline:Teacher already redeemed TGAT coupon using different TGAT coupon with qualifying order value:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is referred by [Teacher2]
    Then the error message 'You have already redeemed this coupon code on a previous order.' should be displayed

  Examples:
    | UsingData                  										|
    | TGAT:Already_redeemed_TGAT_coupon_using_different_TGAT_coupon	|

  @TGAT
  Scenario Outline:Multiple teachers using same TGAT coupon for the first with qualifying order value_1:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is referred by [Teacher1]
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:TeacherA_using_TGAT_coupon_referred_by_Teacher1	|


  @TGAT
  Scenario Outline:Multiple teachers using same TGAT coupon for the first with qualifying order value_2:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is referred by [Teacher1]
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:TeacherB_using_TGAT_coupon_referred_by_Teacher1	|


  @TGAT
  Scenario Outline:Multiple teachers using same TGAT coupon for the first with qualifying order value_3:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is referred by [Teacher1]
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:TeacherC_using_TGAT_coupon_referred_by_Teacher1	|



  @TGAT
  Scenario Outline:Multiple teachers using same TGAT coupon for the first with qualifying order value_4:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher enters a TGAT coupon which is referred by [Teacher1]
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  								|
    | TGAT:TeacherD_using_TGAT_coupon_referred_by_Teacher1	|



  @TGAT
  Scenario Outline:Teacher views correct tool tip for TGAT coupon number:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    When Teacher enters referring Teacher account details in TGAT modal window
   #When Teacher mouseover on entered TGAT coupon
    Then the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed

  Examples:
    | UsingData                  			|
    | TGAT:ToolTip_for_TGAT_coupon_number	|



  @TGAT
  Scenario Outline:Teacher is mandated to enter referring teacher’s information if New teacher applies TGAT coupon and closes the modal and tries to proceed checkout:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher closes the TGAT modal window
    When Teacher proceed to checkout from Rewards and coupons page
    Then the error message 'click the coupon link below to finalize your coupons' text should be displayed

  Examples:
    | UsingData                  												|
    | TGAT:Teacher_without_enter_TGAT_coupon_details_and_proceedToCheckout	|


  @TGAT
  Scenario Outline:New teacher applies the same TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    When Teacher enters again the same TGAT coupon
    Then the error message 'Coupon code is already in your cart.' should be displayed

  Examples:
    | UsingData                  					|
    | TGAT:Enter_same_TGAT_coupon_error_message	|


  @TGAT
  Scenario Outline:New teacher selects NO to delete the applied TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    When Teacher clicks on delete TGAT coupon button and selects as [NO]
    Then the applied TGAT coupon should be displayed in [Coupons Applied] section

  Examples:
    | UsingData                  					|
    | TGAT:TGAT_coupon_when_selects_NO_to_delete	|


  @TGAT
  Scenario Outline:New teacher selects YES to delete the applied TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    When Teacher clicks on delete TGAT coupon button and selects as [YES]
    Then the applied TGAT coupon should not be displayed in [Coupons Applied] section

  Examples:
    | UsingData                  					|
    | TGAT:TGAT_coupon_when_selects_YES_to_delete	|


  @TGAT
  Scenario Outline:New teacher deletes the applied TGAT coupon and enters the same TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon which is referred by [Teacher1]
    And Teacher enters referring Teacher account details in TGAT modal window
    When Teacher deletes the TGAT coupon
    And Teacher enters a TGAT coupon which is referred by [Teacher1]
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  					|
    | TGAT:Same_TGAT_coupon_when_delete_and_apply	|


  @TGAT
  Scenario Outline:New teacher deletes the applied TGAT coupon and enters the different TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon which is referred by [Teacher1]
    And Teacher enters referring Teacher account details in TGAT modal window
    When Teacher deletes the TGAT coupon
    And Teacher enters a TGAT coupon which is referred by [Teacher2]
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  					|
    | TGAT:Diff_TGAT_coupon_when_delete_and_apply	|


  @TGAT
  Scenario Outline:New teacher applies the coupon and removes items from cart making cart non-qualifying:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    When teacher deletes the items from cart making cart non-qualifying
    And Teacher navigates to rewards & coupons page
    Then the applied TGAT coupon should not be displayed in [Coupons Applied] section

  Examples:
    | UsingData                  								|
    | TGAT:Teacher_removes_items_to_make_cart_non_qualifying	|


  @TGAT
  Scenario Outline:New teacher can apply TGAT coupon if top-off from DTS makes the cart qualify for applying TGAT coupon:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And Teacher adds student club items to the cart without qualifying [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    When Teacher selects the DTS item which top off amount makes the cart to qualify
    And Teacher enters a TGAT coupon
    Then TGAT modal window should be displayed

  Examples:
    | UsingData                  						|
    | TGAT:Top_off_from_DTS_makes_the_cart_qualify	|


  @TGAT
  Scenario Outline:New teacher cannot apply TGAT coupon if there are redemptions against a qualifying cart total making the cart non-qualifying:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And teacher enters amount in student Bonus Bank
    And teacher enters amount in student Paper coupons
    And teacher clicks on Apply in Students section
    When Teacher enters a TGAT coupon
    Then the error message 'Your order does not meet the coupon requirements. Please check the coupon for details.' should be displayed

  Examples:
    | UsingData                  					|
    | TGAT:Redemptions_against_a_qualifying_cart_total	|


  @TGAT
  Scenario Outline:New teacher applies TGAT coupon and makes redemptions against student clubs making cart non-qualifying:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds student club items to the cart with [minumum amount]
    And Teacher navigates to Redemptions & Rewards page
    And Teacher enters a TGAT coupon
    And Teacher enters referring Teacher account details in TGAT modal window
    When teacher enters amount in student Bonus Bank
    And teacher enters amount in student Paper coupons
    And teacher clicks on Apply in Students section
    Then the applied TGAT coupon should not be displayed in [Coupons Applied] section

  Examples:
    | UsingData                  												|
    | TGAT:Applied_TGAT_coupon_with_Redemptions_against_a_qualifying_cart_total	|