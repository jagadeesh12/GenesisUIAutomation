Feature: CSR - Verify -Order Source – Modal – Order Submission Confirmation
  This feature is to validate CSR Order Submission Confirmation Modal

  Background:
    Given CSR opens the rco-scholastic web site

@OrderSubmission
@SCSCOD-5706
@Priority1
@Sprint-14.3
@1
  Scenario Outline:CSR sees the Confirm & Submit Step on Order Source page :[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR navigates to [Payment] page from [Redeem & Rewards] page
    And CSR navigates to [Confirm & Submit] page from [Payment] page
    When CSR submits the order
    Then the CSR will be re-directed to the [Order Source] page
    And is presented with a modal window with the title [Order Confirmation]
    And a X icon is present on the top-right of the window
    And the text is displayed with order ref no


    Examples:
      | UsingData 	|
      | QA:CSR_CofirmSubmitStep1	|

@OrderSubmission
@SCSCOD-5706
@Priority1
@Sprint_14.3
@2
  Scenario Outline:CSR clicks on the X on the Order Confirmation to close the pop-up  :[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR navigates to [Payment] page from [Redeem & Rewards] page
    And CSR navigates to [Confirm & Submit] page from [Payment] page
    When CSR submits the order
    Then the CSR will be re-directed to the [Order Source] page
    And is presented with a modal window with the title [Order Confirmation]
    When CSR clicks on the X
    Then the [Order Confirmation] window is closed

    Examples:
      | UsingData 	|
      | QA:CSR_CofirmSubmitStep2	|


@OrderSubmission
@SCSCOD-5706
@Priority1
@Sprint_14.3
@3
  Scenario Outline: Order Source page displays the order Reference Number:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR navigates to [Payment] page from [Redeem & Rewards] page
    And CSR navigates to [Confirm & Submit] page from [Payment] page
    When CSR submits the order
    Then the CSR will be re-directed to the [Order Source] page
    And is presented with a modal window with the title [Order Confirmation]
    #And the Order Reference Number is displayed which is same as the number which will be attached to the Teacher’s e-mail confirmation message


    Examples:
      | UsingData 	|
      | QA:CSR_CofirmSubmitStep3	|


@OrderSubmission
@SCSCOD-5706
@Priority1
@Sprint_14.3
@4
  Scenario Outline: CSR submit order for teacher account which does not have email address in the account :[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR navigates to [Payment] page from [Redeem & Rewards] page
    And CSR navigates to [Confirm & Submit] page from [Payment] page
    When CSR submits the order
    Then the CSR will be re-directed to the [Order Source] page
    And is presented with a modal window with the title [Order Confirmation]
   # And the message "A confirmation message has been sent to the e-mail address provided" will not be displayed

    Examples:
      | UsingData 	|
      | QA:CSR_CofirmSubmitStep5	|
      
      