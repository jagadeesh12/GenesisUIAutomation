Feature: Your Teacher Order – Teacher Catalogues Module
	This feature is to validate the Your Teacher Order – Teacher Catalogues Module Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site
 
@CSR_ReviewCart @Priority2  @DWCACSR-163
Scenario Outline: As a CSR, I am presented with expanded Teacher catalogue table when landed on Review cart page:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher catalogues table is expanded by default with the added item information displayed
	Examples:
      | UsingData                         |
      | Teacher_Catalogue_ExpandbyDefault |


@CSR_ReviewCart @Priority3  @DWCACSR-163 
Scenario Outline:Teacher Catalogues table is not displayed when there are no teacher catalogue items added to cart:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds student club items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher catalogues table is not displayed
    Examples:
      | UsingData           |
      | NoTeacher_Catalogue |


@CSR_ReviewCart @Priority3  @DWCACSR-163 
Scenario Outline:CSR can click contract - to hide the Teacher catalogues table:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on '-' next to 'Your Teacher Order – Teacher Catalogues' label
    Then Teacher Catalogues table is hidden or contracted showing '+' sign and label 'Your Teacher Order – Teacher Catalogues'
    
    Examples:
      | UsingData                        |
      | Contracted_TeacherCatalogueTable |


@CSR_ReviewCart @Priority3  @DWCACSR-163 
Scenario Outline:CSR can click expand + to show the Teacher catalogue table:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on '-' to hide the Teacher Catalogue table
    When CSR clicks on '+' next to 'Your Teacher Order – Teacher Catalogue' label
    Then Teacher Catalogue table is expanded with items displayed and shows '-' sign
    
    Examples:
      | UsingData                      |
      | Expanded_TeacherCatalogueTable |


@CSR_ReviewCart @Priority2  @DWCACSR-163 
Scenario Outline:Table structure when CSR adds items from Single flyer from Teacher Catalogue:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds Teacher Catalogue items from single flyer to cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Columns 'Item#', 'Title', 'Flyer', 'Price', 'QTY.' displays in the mentioned order
    And the items are displayed sorted in ascending order of 'Item#'
    Examples:
      | UsingData                         			|
      | TeacherCatalogue_SingleFlyer_SingleMonth 	|
      
@CSR_ReviewCart @Priority2  @DWCACSR-163 
Scenario Outline:Table structure and the item details when CSR adds items from Single flyer from Teacher Catalogue:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds Teacher Catalogue items from single flyer to cart
    And CSR navigates to Review Cart page from Order Entry page
    Then the items added are displayed with correct 'Item#', 'Title', 'Flyer', 'Price', 'QTY.'
    Examples:
      | UsingData                         						|
      | TeacherCatalogue_SingleFlyer_SingleMonth_itemDetails 	|     


@CSR_ReviewCart @Priority2  @DWCACSR-163 
Scenario Outline:Table Structure when CSR adds items from Multiple flyers different months:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds teacher catalogue items from different flyers to cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Single table displays with all the items listed under Teacher Catalogues
    And list of line-items are sorted by Flyer title and then by Item number in ascending order
    Examples:
      | UsingData                         	|
      | TeacherCatalogues_MultipleFlyers 	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from Single flyer for province with applicable taxes as GST & QST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from same month and flyer
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | ReviewCart_GST_QST_Province_QC	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from Single flyer for province with applicable taxes as GST & QST1:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from same month and different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | ReviewCart_GST_QST_Province_QC_2	|


@CSR_ReviewCart @Priority1  @DWCACSR-163
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for province with applicable taxes as GST & PST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | ReviewCart_GST_PST_Province_BC	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for province with applicable taxes as HST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | ReviewCart_HST_Province_NL	|
         | ReviewCart_HST_Province_NB	|
         | ReviewCart_HST_Province_NS	|
         | ReviewCart_HST_Province_ON	|
         | ReviewCart_HST_Province_PE	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for province with applicable taxes as GST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | ReviewCart_GST_Province_AB	|
         | ReviewCart_GST_Province_MB	|
         | ReviewCart_GST_Province_NT	|
         | ReviewCart_GST_Province_NU	|
         | ReviewCart_GST_Province_SK	|
         | ReviewCart_GST_Province_YT	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogues items from same month
    And CSR navigates to Review Cart page from Order Entry page
    Then correct total for Price and Qty are displayed within the footer region of the flyer table
    And "Teacher Catalogues Subtotal" with correct subtotal(Pre-tax) and Qty displays
    And GST, QST tax rates displays as $0.00
    And correct "Teacher Catalogues total" displays
    And correct "Total amount Owing" with Teacher Catalogues total and total Qty displays
    Examples:
        |UsingData                        	|
        | ReviewCart_GST_PST_Province_QC	|


@CSR_ReviewCart @Priority1  @DWCACSR-215 
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for province with applicable taxes as GST & PST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then no tax displays for GST,PST and correct Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays
    Examples:
        |UsingData                      	|
        | ReviewCart_GST_PST_Province_BC_2	|


@CSR_ReviewCart @Priority1  @DWCACSR-215 
Scenario Outline:No taxes are charged for tax exempted schools for province with applicable taxes as HST:[<UsingData>]
     Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogues items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then "Teacher Catalogues Subtotal" with correct subtotal and Qty displays
     And HST tax rates displays as $0.00
     And correct "Teacher Catalogues total"(Teacher Catalogues Subtotal + HST) displays
     And correct "Total amount Owing" displays with Teacher Catalogues total and total Qty displays
     Examples:
         |UsingData                     |
         | ReviewCart_HST_Province_NL	|
         | ReviewCart_HST_Province_NB	|
         | ReviewCart_HST_Province_NS	|
         | ReviewCart_HST_Province_ON	|
         | ReviewCart_HST_Province_PE	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:No taxes are charged for tax exempted schools for province with applicable taxes as GST:[<UsingData>]
     Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogues items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then "Teacher Catalogues Subtotal" with correct subtotal and Qty displays
     And GST tax rates displays as $0.00
     And correct "Teacher Catalogues total"(Teacher Catalogues Subtotal + GST) displays
     And correct "Total amount Owing" displays with Teacher Catalogues total and total Qty displays
     Examples:
         |UsingData                     |
         | ReviewCart_HST_Province_AB	|
         | ReviewCart_HST_Province_MB	|
         | ReviewCart_HST_Province_NT	|
         | ReviewCart_HST_Province_NU	|
         | ReviewCart_HST_Province_SK	|
         | ReviewCart_HST_Province_YT	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:subtotals, totals, taxes are updated when Qty of items is updated:[<UsingData>]
     Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     And CSR adds multiple Teacher Catalogues club items from different flyers
     When CSR updates the Qty of items in every flyer table
     Then Unit price of the item is displayed on line item level with upated Qty in Qty field
     And "Teacher Catalogues Subtotal" with correct updated subtotal and Qty displays
     And correct updated GST, PST tax rates displays in 2 seperate line items
     And correct updated "Teacher Catalogues total"(Teacher Catalogues Subtotal + GST + PST) displays
     And correct updated "Total amount Owing" displays with Student Clubs total and total Qty displays
      Examples:
         |UsingData                        	|
       	 | ReviewCart_GST_PST_Province_BC	|



