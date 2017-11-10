Feature: Order Entry - Proceed To Checkout
  This feature is to validate the Order Entry form with duplicate Item#


  Background:
    Given CSR opens the rco-scholastic web site


@OrderEntry-DuplicateItem
@SCSCOD-5699
@1
@Sprint-14.5
Scenario Outline:CSR enters duplicate itemNo but QTY is different using the same flyer code:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds item with same item number with different quantity
    Then no error popup is displayed for duplicate item number
    And CSR navigates to Review Cart page from Order Entry page

  Examples:
    |UsingData |
    |CSR_Enter_duplicateItem |



@OrderEntry-DuplicateItem
@SCSCOD-5699
@2
@Sprint-14.5
Scenario Outline:CSR enter duplicate itemNo and same QTY using the same flyer code:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds item with same item number and same Qty for all items
    Then no error popup is displayed for duplicate item number
    And CSR navigates to Review Cart page from Order Entry page


  Examples:
    | UsingData                  							|
    | CSR_Enter_duplicateItem_QtyDuplicate	|


@OrderEntry-DuplicateItem
@SCSCOD-5699
@3
@Sprint-14.5
Scenario Outline:CSR enter duplicate itemNo and same QTY using different flyer code:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds item with same item number and same Qty from different flyers
    Then no error popup is displayed for duplicate item number
    And CSR navigates to Review Cart page from Order Entry page

  Examples:
    | UsingData                  							|
    | CSR_Enter_duplicateItem_Qtysame_flyers	|



@OrderEntry-DuplicateItem
@SCSCOD-5699
@4
@Sprint-14.5
Scenario Outline:CSR enter duplicate itemNo and QTY not same using different flyer code:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds item with same item number with Qty being different from different flyers
    Then no error popup is displayed for duplicate item number
    And CSR navigates to Review Cart page from Order Entry page

  Examples:
    | UsingData                  							|
    | CSR_Enter_duplicateItem_QtyDiff_flyers	|




@OrderEntry-DuplicateItem
@SCSCOD-5699
@5
@Sprint-14.5
Scenario Outline:CSR enter duplicate itemNo and same QTY navigate back to Order Entry page:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds item with same item number with different quantity
    And no error popup is displayed for duplicate item number
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the hyperlink [Edit Cart]
    Then Review cart page is displayed
    And the duplicate order is combined in 1 flyer

  Examples:
    | UsingData                  							|
    | CSR_ReviewCartback_sameFlyer	|





@OrderEntry-DuplicateItem
@SCSCOD-5699
@6
@Sprint-14.5
Scenario Outline:CSR enter duplicate itemNo using different flyer code and same QTY navigate back to Order Entry page:[<UsingData>]

    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds item with same item number with Qty being different from different flyers
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the hyperlink [Edit Cart]
    Then Review cart page is displayed
    And the duplicate order is combined and grouped in flyer code

  Examples:
    | UsingData                  							|
    | CSR_ReviewCartback_DifFlyer	|

