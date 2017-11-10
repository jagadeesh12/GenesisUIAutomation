Feature: CSR - Review Cart - All Modules - Flyer Title - Hyperlink
	This feature is to validate the CSR - Review Cart - All Modules - Flyer Title - Hyperlink scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
	
@ReviewCart_FlyerTitle
@DWCACSR-2292
@Priority1
@1
Scenario Outline: Flyer hyperlink for items is disabled on the Review Cart page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR clicks on flyer hyperlink for item
Then CSR cannot click on flyer hyperlink
Examples:
  | UsingData                                |
  | ReviewCart_FlyerTitle_Hyperlink_Disabled |
  
  