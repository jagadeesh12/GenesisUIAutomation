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
      | Perf_QA_Teacher_Catalogue_ExpandbyDefault |


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
      | Perf_QA_NoTeacher_Catalogue |


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
      | Perf_QA_Contracted_TeacherCatalogueTable |


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
      | Perf_QA_Expanded_TeacherCatalogueTable |


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
      | Perf_QA_TeacherCatalogue_SingleFlyer_SingleMonth 	|
      
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
      | Perf_QA_TeacherCatalogue_SingleFlyer_SingleMonth_itemDetails 	|     


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
      | Perf_QA_TeacherCatalogues_MultipleFlyers 	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from Single flyer for GST & QST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from same month and flyer
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | Perf_QA_ReviewCart_GST_QST_Province_QC	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from Single flyer for GST & QST1:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from same month and different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | Perf_QA_ReviewCart_GST_QST_Province_QC_2	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST & PST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | Perf_QA_ReviewCart_GST_PST_Province_BC	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for HST_NL:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_HST_Province_NL	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for HST_NB:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_HST_Province_NB	|

@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for HST_NS:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_HST_Province_NS	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for HST_ON:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_HST_Province_ON	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for HST_PE:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_HST_Province_PE	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST_AB:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_GST_Province_AB	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST_MB:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_GST_Province_MB	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST_NT:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_GST_Province_NT	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST_NU:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_GST_Province_NU	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST_SK:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_GST_Province_SK	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct subtotals, totals, taxes display for Teacher Catalogues when multiple items are added from multiple flyer for GST_YT:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | Perf_QA_ReviewCart_GST_Province_YT	|



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
        | Perf_QA_ReviewCart_GST_PST_Province_BC_2	|

