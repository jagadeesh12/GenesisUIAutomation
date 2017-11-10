@sfonow
Feature:SFO
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

  @Manual
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

  @Manual
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
    #And  the message is “from prop file”

    Examples:
      | UsingData |
      | SFO_CouponModal_Coupon_NoSetup|

  @Manual
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



  Scenario Outline:Apply button is not enabled on entering Valide Coupon only :[<UsingData>]

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



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7159                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @1


  Scenario Outline: Teacher Apply Free Pick Coupon on SFO modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved

    Examples:
      | UsingData |
      | SFO_FREEPICK_Applied |

  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @2


  Scenario Outline: When FreePick coupon is applied Coupon code field is deactivated:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved
    And Coupon Code field is deactivated



    Examples:
      | UsingData |
      | SFO_CouponModal_Couponfield_Inactive |


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @3


  Scenario Outline: When FreePick coupon is applied Student Name remains active:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved
    And Student Name field remains active


    Examples:
      | UsingData |
      | SFO_CouponModal__StudentName_Active |


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017



  Scenario Outline:Teacher applies coupon and call out message is displayed on the modal:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then SFO Coupon Modal is displayed
    And Apply button changes to Saved
    And Coupon call out message is displayed


    Examples:
      | UsingData |
      | SFO_CouponModal__CallOut_Message |

  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @5

  Scenario Outline:Teacher can search for free pick item by ItemID :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And SFO Coupon Modal is displayed
    And Apply button changes to Saved
    When teacher searches for a [qualifying Item number]
    ##Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
    And teacher selects an item from the results
    And Free Pick selected modal is displayed


    Examples:
      | UsingData |
      | SFO_CouponModal__FreePick_ItemIdSearch |


  @SCSCOD-7159
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @6

  Scenario Outline:Teacher can search for free pick item by ItemName:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And teacher click on link “Apply a coupon for this student”
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And SFO Coupon Modal is displayed
    And Apply button changes to Saved
    When teacher searches for a [qualifying Item name]
    #Then items less than or equal to the [coupon amount] displays in Manual Free Pick model
    And teacher selects an item from the results
    And Free Pick selected modal is displayed

    Examples:
      | UsingData |
      | SFO_CouponModal__FreePick_ItemName |

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7160                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7160
  @Priority1
  @Sprint-15.2
  @SFOPage_FreePickModal
  @Release-BTS2017
  @1


  Scenario Outline:SFO Coupon modal displays free pick item:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    When teacher click on Apply
    Then Free pick modal displays
    And teacher clicks on grade level dropdown and select a grade from dropdown
    #Then items less than or equal to the [coupon amount] displays in Manual Free Pick model


    Examples:
      | UsingData |
      | SFO_FreePick_Grade |



  @SCSCOD-7160
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @2
  
  Scenario Outline:SFO Teacher selects an item by searching for a qualifying item on Free pick modal :[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    When teacher searches for a [qualifying Item number]
    Then item displays in results in Free Pick model
    And teacher selects an item from the results
    And selected item displays in Current Selection section for Freepick
    And teacher clicks on Confirm Selection button


    Examples:
      | UsingData |
      | SFO_FreePick_Search |

  @SCSCOD-7160
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @6
  Scenario Outline:SFO Free Pick Confirm modal close:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from modal
    And Free Pick selected modal is displayed
    And the selected freeItem is displayed
    When teacher click on “X” button
    Then the Free Pick Modal close


    Examples:
      | UsingData |
      | SFO_FreePick_ModalClose |


  @SCSCOD-7160
  @Priority1
  @Sprint-15.1
  @SFOPage_FreePickModal
  @Release-BTS2017
  @7
	


  Scenario Outline:SFO Free Pick Selected modal close:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from modal
    And Free Pick selected modal is displayed
    And the selected freeItem is displayed
    When teacher click on “CANCEL” button
    Then the Free Pick Modal close


    Examples:
      | UsingData |
      | SFO_FreePick_ModalClose1 |

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6789                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @1



  Scenario Outline: SFO modal displays tab SFO and YTO tab:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And Student Flyer Orders tab should be displayed
    And Your Teacher Order tab should also be displayed

    Examples:
      | UsingData |
      | SFO_PageDisplay_Tab |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @2


  Scenario Outline: SFO modal display:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And Student Flyer Orders tab should be displayed
    And the title is displyed as “Student Flyer Orders”
    And the following message is displayed

    Examples:
      | UsingData |
      | SFO_PageDisplay_title |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @3

  Scenario Outline: SFO modal displays Data fields:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    And ADD button is not enabled state


    Examples:
      | UsingData |
      | SFO_Page_2Labels |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @4


  Scenario Outline: SFO Item# validation rules:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    When Valid ItemNo is entered less than 7 characters with valid student name
    Then Add button is enabled and teacher clicks on Add
    And no error message is displayed


    Examples:
      | UsingData |
      | SFO_Page_Item#Validation |

  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @5

  Scenario Outline: SFO Item#7 validation rules:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    When Valid ItemNo is entered as 7 characters with valid student name
    Then Add button is enabled and teacher clicks on Add
    And no error message is displayed


    Examples:
      | UsingData |
      | SFO_Page_Item#Validation_equal7 |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @6

  Scenario Outline: SFO Item# special character validation rules:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”
    When teacher enters ItemNo with special character
    Then error message should be displayed “Please enter a valid item number.”


    Examples:
      | UsingData |
      | SFO_Page_Item#Validation_specialCharacter |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @7

  Scenario Outline: SFO form Add button should be disabled with Item blank:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And ADD button is not enabled when Item# is blank and Student Name is present

    Examples:
      | UsingData |
      | SFO_Page_ADDButton1 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @8

  Scenario Outline:SFO form Add button should be disabled with Student name blank:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And ADD button is not enabled when Item# is entered and Student name is blank

    Examples:
      | UsingData |
      | SFO_Page_ADDButton2 |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @9

  Scenario Outline:SFO form Valid ItemNo and Student Name entered:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    When teacher clicks “Student Flyer Orders” link
    Then Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Item# and Student name is entered
    And teacher clicks on Add button
    And Student Flyer Order page displays ItemNo and Student Name

    Examples:
      | UsingData |
      | SFO_Page_Item_Added |



  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @10
 
  Scenario Outline:SFO form error message:[<UsingData>]



    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And ADD button is enabled when Invalid Item# and Student name is entered
    When teacher clicks on Add button
    Then error message is displayed for Item number filed


    Examples:
      | UsingData |
      | SFO_Page_Item_Added1 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @11

  Scenario Outline:SFO form Student Name alphanumeric with special character Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher enter the student name with special character
    Then error messsage is displayed “Please enter a valid Student Name.”



    Examples:
      | UsingData |
      | SFO_Page_Item_Name3 |




  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @12

  Scenario Outline:SFO form Student Name Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When Item# is entered and Student name entered is alphanumeric equal 20 Character
    Then teacher clicks on Add button
    And SFO page is populated with Student name and ItemNo


    Examples:
      | UsingData |
      | SFO_Page_Item_Added2 |


  #@SCSCOD-6789
  #@Priority1
  #@Sprint-15.1
  #@SFOPage
  #@Release-BTS2017
  #@13
#
  #Scenario Outline:SFO form Student Name Numeric Validation:[<UsingData>]
#
    #Given teacher logs into the application by providing [UserInformation]
    #And teacher clicks enter orders
    #And teacher clicks “Student Flyer Orders” link
    #And Student Flyer Orders modal is dispalyed
    #When Item# is entered and Student name entered is Numeric only equal 20 Character
    #Then teacher clicks on Add button
    #And SFO page is populated with Student name and ItemNo
#
#
    #Examples:
      #| UsingData |
      #| SFO_Page_Item_Name1 |


  @SCSCOD-6789
  @Priority1
  @Sprint-15.1
  @SFOPage
  @Release-BTS2017
  @14

  Scenario Outline:SFO form Student Name alphabets Validation:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When Item# is entered and Student name entered is all alphabets only equal 20 Character
    Then teacher clicks on Add button
    And SFO page is populated with Student name and ItemNo


    Examples:
      | UsingData |
      | SFO_Page_Item_Name2 |



  #@SCSCOD-6789
  #@Priority1
  #@Sprint-15.1
  #@SFOPage
  #@Release-BTS2017
  #@15


  #Scenario Outline:SFO form Student Name alphanumeric with special character Validation:[<UsingData>]
    #Given teacher logs into the application by providing [UserInformation]
    #And teacher clicks enter orders
    #And teacher clicks “Student Flyer Orders” link
    #And Student Flyer Orders modal is dispalyed
    #When teacher enter the student name with special character
    #Then error messsage is displayed “Please enter a valid Student Name.”

    #Examples:
      #| UsingData |
      #| SFO_Page_Item_Name3 |




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6790                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher adds single Students Order in SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When  teacher add a valid item and Student Name to Student Flyer Order
    Then teacher sees a grid displaying added items
    And the grid displays Student Name, Item#,Item Title, Flyer, Coupon, Price and Quantity




    Examples:
      | UsingData |
      | SFO_AddItem_1  |


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher adds more than one Students Order in SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds multiple item, student name from same Flyer
    Then  Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated


    Examples:
      | UsingData  |
      | SFO_AddItem_2          |


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher add multiple items- Multiple students and Items from different Flyer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds items for multiple student and items belong to different flyers
    Then Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added


    Examples:
      | UsingData  |
      | SFO_AddItem_3          |

  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher add multiple items with multiple QTY- Multiple students and Items from different Flyer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds items with QTY more than 1 for multiple student and items belong to different flyers
    Then Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added


    Examples:
      | UsingData  |
      | SFO_AddItem_4          |


  @SCSCOD-6790
  @Priority1
  @Sprint-15.1
  @Release-BTS2017
  @SFOPage

  Scenario Outline: Teacher add multiple items to same Student from different Flyer:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders page is displayed
    When teacher adds items multiple items to same Student from different Flyer
    Then Student Flyer Order grid displays items added in the order of addition
    And the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added


    Examples:
      | UsingData  |
      | SFO_AddItem_5          |

  ##################################################################################################################################################
##################################################################################################################################################
###########################################                              #############################################################
###########################################           SCSCOD-6794
###########################################
###########################################                              #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-6794
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @1

  Scenario Outline: Teacher click on ? on SFO page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher clicks on ?
    Then Teacher is presented with a pop-up modal
    #And the modal displays the Message
    And “Learn More” hyperlink is displayed

    Examples:
      | UsingData |
      | SFO_Student Name Mssg|


  @SCSCOD-6794
  @Priority1
  @Sprint-15.2
  @SFOPage
  @2
  @Release-BTS2017
  @Manual




  Scenario Outline: SFO page Enter student name message is content assest:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    When teacher clicks on ?
    Then Teacher is presented with a pop-up modal

    Examples:
      | UsingData |
      | SFO_Student Name MssgContent|



  @SCSCOD-6794
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @3





  Scenario Outline: SFO page Enter student name message close:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher clicks on ?
    And Teacher is presented with a pop-up modal
    #And the message is a content assest
    When teacher clicks on ?
    Then the pop-up modal is closed



    Examples:
      | UsingData |
      | SFO_Student Name Mssg1|


  ##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7161                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7161
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017

  Scenario Outline:SFO page displays free pick item:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    And teacher clicks on grade level dropdown and select a grade from dropdown
    And teacher selects an item from the results
    When teacher clicks on Confirm Selection button
    Then Student Flyer Orders modal is dispalyed
    #And the freepick item is displayed with Student Name,item Title, Item Flyer,Coupon Code.Price as FREE and QTY is displayed

    Examples:
      | UsingData |
      | SFO_FreePick_Grade |


  @SCSCOD-7161
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @2
  @Manual


  Scenario Outline:SFO display mini PDP for added Free Item for 2 Sec:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    And teacher clicks on grade level dropdown and select a grade from dropdown
    When teacher selects an item from the results
#    Then the mini PDP for added item is displayed for 2 seconds
#    And the mini PDP auto hides
    And the freepick item is displayed with Student Name,item Title, Item Flyer,Coupon Code.Price as FREE and QTY is displayed



    Examples:
      | UsingData |
      | SFO_FreePick_Grade1 |


  ##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7162                  #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-7162
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @1


  Scenario Outline:SFO Free Pick modal closed by X:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    When Free pick modal is closed by X button
    Then Free pick modal closes and SFO page is displayed
    And SFO pages displays error message for coupon
    And the coupon code and Student name is displayed on SFO


    Examples:
      | UsingData |
      | SFO_FreePick_Close_Mssg|


  @SCSCOD-7162
  @Priority1
  @Sprint-15.2
  @SFOPage
  @Release-BTS2017
  @2

  Scenario Outline:SFO coupon code hyperlink is clicked:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher clicks enter orders
    And teacher clicks “Student Flyer Orders” link
    And Student Flyer Orders modal is dispalyed
    And teacher click on link “Apply a coupon for this student”
    And SFO Coupon Modal is displayed
    And teacher enters valid Student Name
    And teacher enters valid Coupon code
    And teacher click on Apply
    And Free pick modal displays
    And Free pick modal is closed by X button
    And SFO pages displays coupon code which is hyperlink
    When teacher click on the coupon hyperlink
    Then SFO Coupon Modal is displayed


    Examples:
      | UsingData |
      | SFO_FreePick_couponLink|