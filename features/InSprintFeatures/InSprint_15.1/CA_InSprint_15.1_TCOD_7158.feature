Feature: InSprint_15.1 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7158                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @1


  Scenario Outline: SFO modal displays Apply Coupon text:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And the text “Apply a coupon for this student” is displayed under Student Name field


  Examples:
    | UsingData |
    | SFO_ApplyCoupon_Txt |



  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @2


  Scenario Outline: SFO Apply coupon Modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher click on link “Apply a coupon for this student”
    Then SFO Coupon Modal is displayed
    And the tile of the modal is “Apply a coupon for this student”
    And the subtitle is “Enter Coupon  Code”


  Examples:
    | UsingData |
    | SFO_CouponModal_title |


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @3


  Scenario Outline: SFO verify Coupon Modal close:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher click on link “Apply a coupon for this student”
    Then SFO Coupon Modal is displayed
    And the tile of the modal is “Apply a coupon for this student”
    And the subtitle is “Enter Coupon  Code”
    And the modal has a close icon on right corner
    When teacher click on the close icon
    Then the modal closes and teacher lands on SFO page


  Examples:
    | UsingData |
    | SFO_CouponModal_close |



  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @4


  Scenario Outline: SFO Apply Coupon Modal validate form :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher click on link “Apply a coupon for this student”
    Then SFO Coupon Modal is displayed
    And modal comprises of field Student Name,Coupon and Apply button
    And Student Name filed has text as “e.g. John S, J.s. or alias”
    And Coupon field has text as “E.G. 3P3RW”
    And Apply button is disabled


  Examples:
    | UsingData |
    | SFO_CouponModal_verify |


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @5


  Scenario Outline: SFO Apply Coupon Modal close and Reopen :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher click on link “Apply a coupon for this student”
    Then SFO Coupon Modal is displayed
    And the tile of the modal is “Apply a coupon for this student”
    And the subtitle is “Enter Coupon  Code”
    And the modal has a close icon on right corner
    When teacher click on the close icon
    Then the modal closes and teacher lands on SFO page
    And teacher clicks on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed

  Examples:
    | UsingData |
    | SFO_CouponModal_close1 |



  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @6

  Scenario Outline: Student Name spl character field validation on SFO coupon Modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters Student Name with special character and tabs out
    Then error message is displayed “Please enter a valid Student Name.”

  Examples:
    | UsingData |
    | SFO_CouponModal_StudentNameSpl|


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @7

  Scenario Outline: Student Name Enter is valid :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters Student Name with combination of numbers, characters and -
    Then no error message is displayed

  Examples:
    | UsingData |
    | SFO_CouponModal_NameValid|





  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @8

  Scenario Outline: Enter Coupon code with Special character SFO coupon modal :[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters Coupon code with special character
    Then error message is displayed for Coupon code
  Examples:
    | UsingData |
    | SFO_CouponModal_CouponIn-Valid|


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @9

  Scenario Outline: Enter Valid coupon code combination of character,- and Numbers applied on SFO coupon modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters valid coupon code with combination of numbers, characters and -
    Then no error message is seen

  Examples:
    | UsingData |
    | SFO_CouponModal_Coupon-Valid|


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @10

  Scenario Outline: Enter Valid coupon code which has expired on SFO coupon modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    When teacher enters Coupon code which has expired in BM
    And teacher clicks on Apply
    Then error message is displayed for expired coupon
    And the error is This coupon is no longer valid. Please check the coupon for details.


  Examples:
    | UsingData |
    | SFO_CouponModal_Coupon_Expired|

  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @11

  Scenario Outline: Enter coupon code which does not exist in setup on SFO coupon modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    When teacher enters Coupon code which is not setup in BM
    And teacher clicks on Apply
    Then error message is displayed for Coupon code
    And  the message is "The system does not recognize the coupon code you’ve entered. Please check the coupon and try again. If the coupon code is correct, please contact Customer Service at 1-800-268-3860."

  Examples:
    | UsingData |
    | SFO_CouponModal_Coupon_NoSetup|

  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @12

  Scenario Outline: Enter coupon code which has already been redeemed on SFO coupon modal :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters Student Name with combination of numbers, characters and -
    When teacher enters Coupon code which has been redeemed
    And teacher clicks on Apply
    Then error message is displayed “Our records indicate that this coupon code has already been redeemed.”

  Examples:
    | UsingData |
    | SFO_CouponModal_Coupon_Reedem|


  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @13

  Scenario Outline:Apply button gets enabled on entering name and valid coupon code :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    When teacher enters valid Coupon code
    Then Apply button is enabled

  Examples:
    | UsingData |
    | SFO_CouponModal_ApplyBtn|



  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @14

  Scenario Outline:Apply button is not enabled on entering name only :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters valid Student Name
    Then Apply button stays in disabled state

  Examples:
    | UsingData |
    | SFO_CouponModal_ApplyBtn1|

  @SCSCOD-7158
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @15

  Scenario Outline:Apply button is not enabled on entering Valide Coupon only :[<UsingData]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    When teacher enters valid Coupon code
    Then Apply button stays in disabled state

  Examples:
    | UsingData |
    | SFO_CouponModal_ApplyBtn2|




