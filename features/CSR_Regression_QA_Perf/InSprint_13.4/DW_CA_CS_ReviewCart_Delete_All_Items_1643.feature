Feature: Review Cart – Delete All Items – Redirect to Order Entry
	This feature is to validate the Review Cart – Delete All Items – Redirect to Order Entry scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart
@DWCACSR-1643
@Priority1
@1
Scenario Outline:CSR removes all items in the cart when selecting 'Yes' on last item on Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR removes all items in cart and select 'Yes' on the last item to delete
    Then CSR is redirected to Order Entry page
	And CSR sees empty forms on Order Entry page
	
Examples:
  | UsingData 									|
  | Perf_QA_ReviewCart_DeleteAll_Select_YES_Last_Item	|			
  

@ReviewCart
@DWCACSR-1643
@Priority1
@2
Scenario Outline:CSR removes all items in the cart when the last item's quantity is set to 0 on Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR removes all items in cart and set the item quantity to 0 for last item
    And select 'Yes' on the last item to delete
    Then CSR is redirected to Order Entry page
	And CSR sees empty forms on Order Entry page
	
Examples:
  | UsingData 								|
  | Perf_QA_ReviewCart_DeleteAll_Set_0_Last_Item	|  	
  
  
          