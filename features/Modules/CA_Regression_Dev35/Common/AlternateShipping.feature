Feature: AlternateShipping
  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site


Scenario Outline:Correct alternative shipping address checkbox message should be seen in payment page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds “ItemInformation” from YTO page
When teacher navigates to payment page from YTO page
Then “Check this box if your school cannot currently recieve deliveries and you would like to provide an alternative shipping address.” message should be seen

Examples:
|UsingData|
|InSprint_11.5:Dev35:TeacherOrder_Paymentpage_AlternativeShippingAddressChkbox_MSG|

  @Payment
  @Priority2
  @SCSCOD-3598
  Scenario Outline:Tool-tip error message pop up when teacher enters postal code as complete alphabets in alternative shipping address:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter postal code as complete alphabets and tab out
    Then “Please enter a valid postal code.” should display
    And Continue checkout button is deactivated

  Examples:
    |UsingData                                                   |
    |InSprint_12.1:dev35:AlternativeShipping_PostalCode_Alphabets|




  @Payment
  @Priority2
  @SCSCOD-3598
  Scenario Outline:Tool-tip error message pop up when teacher enters postal code as complete numbers in alternative shipping address:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter postal code as complete numbers and tab out
    Then “Please enter a valid postal code.” should display
    And Continue checkout button is deactivated

  Examples:
    |UsingData                                               |
    |InSprint_12.1:dev35:AlternativeShipping_PostalCode_Numbers|


  @Payment
  @Priority2
  @SCSCOD-3598
  Scenario Outline:Tool-tip error message pop up when teacher enters incorrect postal code in alternative shipping address:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher enter incorrect postal code and tab out
    Then “Please enter a valid postal code.” should display
    And Continue checkout button is deactivated

  Examples:
    |UsingData                                               |
    |InSprint_12.1:dev35:AlternativeShipping_PostalCode_Incorrect|

  @Payment
  @Priority1
  @SCSCOD-3598
  Scenario Outline:Teacher should populate Nunavat province when valid postal code starting with X is given in alternative shipping address:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher selects alternative shipping option
    When teacher provides valid postal code for Nunavat province
    Then correct provice should populate in province field
  #And province field is in read only mode
  Examples:
    |UsingData                                             |
    |InSprint_12.1:dev35:TeacherOrder_AlternativeShipping_Nunavut|

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