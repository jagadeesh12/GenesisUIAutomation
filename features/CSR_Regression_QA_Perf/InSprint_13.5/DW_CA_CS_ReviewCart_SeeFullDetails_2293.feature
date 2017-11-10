Feature: CSR - Review Cart - All Modules - Item Details - 'See Full Details' hyperlink
	This feature is to validate the CSR - Review Cart - All Modules - Item Details - 'See Full Details' hyperlink scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
	
@ReviewCart_SeeFullDetails
@DWCACSR-2293
@Priority1
@1
Scenario Outline: CSR sees item details in a new tab when ‘See Full Details’ hyperlink is clicked:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR clicks item number
And CSR clicks ‘See Full Details’ hyperlink
Then CSR sees item details in a new tab
Examples:
  | UsingData                        |
  | Perf_QA_ReviewCart_SeeFullDetails_NewTab |