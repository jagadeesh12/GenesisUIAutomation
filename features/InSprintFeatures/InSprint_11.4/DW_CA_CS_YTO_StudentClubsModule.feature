Feature: CSR Review Cart YTO and Student Clubs
	This feature is to validate CSR Review Cart YTO and Student Clubs scenarios.

Background: 
	Given CSR opens the rco-scholastic web site

@CSR_ReviewCart
@DWCACSR-215
@Priority1
@1
Scenario Outline:Correct subtotals, totals, taxes display When multiple items are added from Single flyer and month for province with applicable taxes as GST & QST1:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from same month and flyer
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of the flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax) and Qty displays
And correct GST, QST tax rates displays in 2 seperate line items
And correct “Student Clubs total”(Post-tax amount) displays
And correct “Total amount Owing” with Student Clubs total(Post-tax amount) and total Qty displays
Examples:
    |UsingData                      |
    |InSprint_11.4:CSR:Dev35:ReviewCart_GST_QST_Province_QC|
    
    
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@2
Scenario Outline:Correct subtotals, totals, taxes display when multiple items are added from multiple flyer and months for province with applicable taxes as GST & PST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from different flyers and months
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And correct GST, PST tax rates displays in 2 seperate line items
And correct “Student Clubs total”(Student Clubs Subtotal + GST + PST) displays
And correct “Total amount Owing” with Student Clubs total(Post-tax amount) and total Qty displays
Examples:
    |UsingData                        |
    |InSprint_11.4:CSR:Dev35:ReviewCart_GST_PST_Province_BC|  
    
    
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@3
Scenario Outline:Correct subtotals, totals, taxes display when multiple items are added from multiple flyer and months for province with applicable taxes as HST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from different flyers and months
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And correct HST tax rates displays
And correct “Student Clubs total”(Student Clubs Subtotal + HST) displays
And correct “Total amount Owing” with Student Clubs total(Post-tax amount) and total Qty displays
Examples:
     |UsingData                        |
     |InSprint_11.4:CSR:Dev35:ReviewCart_HST_Province_NL|
     #| ReviewCart_HST_Province_NB|
     #| ReviewCart_HST_Province_NS|
     #| ReviewCart_HST_Province_ON|
     #| ReviewCart_HST_Province_PE| 
     
     
     
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@4
Scenario Outline:Correct subtotals, totals, taxes display when multiple items are added from multiple flyer and months for province with applicable taxes as GST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from different flyers and months
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And correct GST tax rates displays
And correct “Student Clubs total”(Student Clubs Subtotal + GST) displays
And correct “Total amount Owing” with Student Clubs total(Post-tax amount) and total Qty displays
 
Examples:
     |UsingData                        |
     |InSprint_11.4:CSR:Dev35:ReviewCart_HST_Province_AB|
     #| ReviewCart_HST_Province_MB|
     #| ReviewCart_HST_Province_NT|
     #| ReviewCart_HST_Province_NU|
     #| ReviewCart_HST_Province_SK|
     #| ReviewCart_HST_Province_YT|
     
     
     
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@5
Scenario Outline:No taxes are charged for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from same month and flyer
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of the flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax) and Qty displays
And GST, QST tax rates displays as $0.00
And correct “Student Clubs total” displays
And correct “Total amount Owing” with Student Clubs total and total Qty displays
Examples:
    |UsingData                        |
    |InSprint_11.4:CSR:Dev35:ReviewCart_GST_PST_Province_QC|
    
    
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@6
Scenario Outline:No taxes are charged for tax exempted schools for province with applicable taxes as GST & PST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from different flyers and months
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And GST, PST tax rates displays as $0.00
And correct “Student Clubs total” displays
And correct “Total amount Owing” with Student Clubs total and total Qty displays
Examples:
    |UsingData                        |
    |InSprint_11.4:CSR:Dev35:ReviewCart_GST_PST_Province_BC|
    
    
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@7
Scenario Outline:No taxes are charged for tax exempted schools for province with applicable taxes as HST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from different flyers and months
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And HST tax rates displays as $0.00
And correct “Student Clubs total” displays
And correct “Total amount Owing” with Student Clubs total and total Qty displays
Examples:
     |UsingData                        |
     |InSprint_11.4:CSR:Dev35:ReviewCart_HST_Province_NL|
     #| ReviewCart_HST_Province_NB|
     #| ReviewCart_HST_Province_NS|
     #| ReviewCart_HST_Province_ON|
     #| ReviewCart_HST_Province_PE|     
     
     
     
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@8
Scenario Outline:No taxes are charged for tax exempted schools for province with applicable taxes as GST:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds multiple Student club items from different flyers and months
And CSR navigates to Review Cart page from Order Entry page
Then correct total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And GST tax rates displays as $0.00
And correct “Student Clubs total” displays
And correct “Total amount Owing” with Student Clubs total and total Qty displays
Examples:
     |UsingData                        |
     |InSprint_11.4:CSR:Dev35:ReviewCart_HST_Province_AB|
     #| ReviewCart_HST_Province_MB|
     #| ReviewCart_HST_Province_NT|
     #| ReviewCart_HST_Province_NU|
     #| ReviewCart_HST_Province_SK|
     #| ReviewCart_HST_Province_YT|
     
     
@CSR_ReviewCart
@DWCACSR-215
@Priority1
@9
Scenario Outline:subtotals, totals, taxes are updated when Qty of items is updated:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds multiple Student club items from different flyers and months
When CSR updates the Qty of items in every flyer table
And CSR navigates to Review Cart page from Order Entry page
Then Unit price of the item is displayed on line item level with updated Qty in Qty field
And correct updated total for Price and Qty are displayed within the footer region of each flyer table
And “Student Clubs Subtotal” with correct updated subtotal(Pre-tax amount which is sum of subtotals from each flyer) and Qty(Sum of Qty subtotals from each flyer)displays
And correct updated GST, PST tax rates displays in 2 seperate line items
And correct updated “Student Clubs total”(Student Clubs Subtotal + GST + PST) displays
And correct updated “Total amount Owing” displays with Student Clubs total and total Qty displays
     
Examples:
     |UsingData                        |
	 |InSprint_11.4:CSR:Dev35:ReviewCart_GST_PST_Province_BC|
	 
	 
@CSR_ReviewCart
@DWCACSR-215
@Priority2
@10
Scenario Outline:As a CSR, I am presented with expanded Student clubs table when landed on Review cart page:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds Student clubs items to cart
And CSR navigates to Review Cart page from Order Entry page
Then Student clubs table is expanded by default with the added item information displayed
Examples:
  | UsingData                                            |
  |InSprint_11.4:CSR:Dev35:Student_club_ExpandbyDefault |
  
  
@CSR_ReviewCart
@DWCACSR-215
@Priority3
@11
Scenario Outline:Student Clubs table is not displayed when there are no student club items added to cart:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds teacher catalogue items to cart
And CSR navigates to Review Cart page from Order Entry page
Then Student clubs table is not displayed
Examples:
  | UsingData                                            |
  |InSprint_11.4:CSR:Dev35:NoStudent_Club | 
  
  
@CSR_ReviewCart
@DWCACSR-215
@Priority3
@12
Scenario Outline:CSR can click contract '-' to hide the student clubs table:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student clubs items to cart
And CSR navigates to Review Cart page from Order Entry page
When CSR clicks on '-' next to “Your Teacher Order – Student Club” label
Then Student clubs table is hidden or contracted showing '+' sign and label “Your Teacher Order – Student Club”

Examples:
  | UsingData                                            |
  |InSprint_11.4:CSR:Dev35:Contracted_StudentClubTable |
  
  
@CSR_ReviewCart
@DWCACSR-215
@Priority3
@13
Scenario Outline:CSR can click expand '+' to show the student clubs table:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student clubs items to cart
And CSR navigates to Review Cart page from Order Entry page
And CSR clicks on '-' to hide the Student clubs table
When CSR clicks on '+' next to “Your Teacher Order – Student Club” label
Then Student clubs table is expanded with items displayed
And shows '-' sign and label “Your Teacher Order – Student Club”

Examples:
  | UsingData                                            |
  |InSprint_11.4:CSR:Dev35:Expanded_StudentClubTable | 
  
  
@CSR_ReviewCart
@DWCACSR-215
@Priority2
@14
Scenario Outline:Table structure when CSR adds items from Single flyer single month:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds Student club items from Single month and single flyer to cart
And CSR navigates to Review Cart page from Order Entry page
Then Columns “Item#”, “Title”, “Flyer”, “Price”, “QTY” displays in the mentioned order
And the items added are displayed with correct “Item#”, “Title”, “Flyer”, “Price”, “QTY”
And the items are displayed sorted in ascending order of “Item#”
Examples:
  | UsingData                                            |
  |InSprint_11.4:CSR:Dev35:StudentClubs_SingleFlyer_SingleMonth |  
  
  
@CSR_ReviewCart
@DWCACSR-215
@Priority2
@15
Scenario Outline:Table Structure when CSR adds items from Multiple flyers different months:[<UsingData>]
	
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR adds Student club items from different flyers and different months to cart
And CSR navigates to Review Cart page from Order Entry page
Then different table with columns “Item#”, “Title”, “Flyer”, “Price”, “QTY” displays for each unique Flyer and month 
And the tables are sorted based on Flyer title in ascending order
And line items within each table are sorted by “Item#” in ascending order
Examples:
  | UsingData                                            |
  |InSprint_11.4:CSR:Dev35:StudentClubs_MultipleFlyers_multipleMonths |        	      
                     
    
    
    
        