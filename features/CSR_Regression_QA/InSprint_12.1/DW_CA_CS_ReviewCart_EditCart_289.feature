@Perf200
Feature: Review Cart - Edit Cart
	This feature is to validate the Review Cart - Back to Shop scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart_EditCart
@DWCACSR-289
@Priority1
@1
Scenario Outline:CSR is presented with a hyperlink labeled 'Edit Cart' in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with a hyperlink labeled 'Edit Cart' in the footer region of the page
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_Edit_Cart_label		|			
  

@ReviewCart_EditCart
@DWCACSR-289
@Priority1
@2
Scenario Outline:Order Entry page displays when CSR clicks on hyperlink labeled 'Edit Cart' in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the hyperlink [Edit Cart]
    Then [Order Entry] page should be displayed
    And entered item numbers and the quantities should be displayed correctly
	
Examples:
  | UsingData 						|
  | QA_CSR_clicks_hyperlink_Edit_Cart	|			
  

  