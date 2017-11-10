@Perf200
Feature: Review Cart - Accumuilated Cart Total
	This feature is to validate the Review Cart - Accumuilated Cart Total scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart_AccumuilatedCartTotal
@DWCACSR-165
@Priority2
@1
Scenario Outline:CSR is presented with the label 'Total Amount Owing' in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with a capitalized label 'Total Amount Owing' in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_TotalAmountOwing_label		|			
  

@ReviewCart_AccumuilatedCartTotal
@DWCACSR-165
@Priority1
@2
Scenario Outline:CSR is presented with the a label representative of the total cost of all items in the footer region of the Review Cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with the a label representative of the total cost of all items in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_total_cost_of_all_items	|			
  
 
@ReviewCart_AccumuilatedCartTotal
@DWCACSR-165
@Priority1
@3
Scenario Outline:CSR is presented with the a label representative of the total qty and the items of all items in the footer region of the Review Cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with the a label representative of the total quantity and the items of all items in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_total_quantity_and_items	|
  
  