Feature: DuplicateItems_in_ReviewCartPage
	This feature is to validate the DuplicateItems_in_ReviewCartPage

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@DuplicateItems_in_ReviewCartPage
@DWCACSR-428
@Priority1
@1
Scenario Outline:CSR sees correct item numbers in Order Entry page when he comes from Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on ORDER ENTRY tab
	Then entered item numbers and the quantities should be displayed correctly
	
Examples:
  | UsingData 						|
  | Perf_QA_CSR_sees_correct_item_numbers	|			
  

@DuplicateItems_in_ReviewCartPage
@DWCACSR-428
@Priority1
@2
Scenario Outline:CSR sees correct items in Review Cart page_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on ORDER ENTRY tab
    When CSR enter same Flyer code and clicks on [Proceed To CheckOut]
	Then entered items should be displayed correctly
	
Examples:
  | UsingData 				|
  | Perf_QA_CSR_sees_correct_items	|			
    