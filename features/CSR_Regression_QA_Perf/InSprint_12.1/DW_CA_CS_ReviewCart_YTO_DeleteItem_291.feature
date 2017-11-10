Feature: Review cart YTO Delete Item
	This feature is to validate the Review cart YTO Delete Item scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@1
Scenario Outline:CSR is presented with the callout message with the text 'Delete this item' and the buttons YES NO:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the button labeled 'x' for the item
    Then CSR is presented with the callout message with the text 'Delete this item' and the buttons [YES] [NO]
	
Examples:
  | UsingData 						|
  | Perf_QA_CSR_sees_callout_msg_YES_NO		|			
  

@ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@2
Scenario Outline:CSR sees correct items in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR changes the item quantity to zero and perform tab to move out of the field
    Then CSR is presented with the callout message with the text 'Delete this item' and the buttons [YES] [NO]
	
Examples:
  | UsingData 								|
  | Perf_QA_CSR_perform_tab_sees_callout_msg_YES_NO	|			
    
    
@ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@3
Scenario Outline:Delete confirmation callout disappears when CSR selects NO to delete:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on the button labeled 'x' for the item
    When CSR clicks on [NO] button in delete popup message
    #Then Delete confirmation callout disappears
	
Examples:
  | UsingData 						|
  | Perf_QA_CSR_selects_NO_btn_for_deletion	|			
        
        
@ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@4
Scenario Outline:Deleted item is not displayed in the table when CSR selects YES to delete:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on the button labeled 'x' for the item
    When CSR clicks on [YES] button in delete popup message
    #Then Delete confirmation callout disappears
    Then the deleted item should not be displayed in the table
	
Examples:
  | UsingData 							|
  | Perf_QA_CSR_selects_YES_btn_for_deletion	|
  
  
@ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@5
Scenario Outline:Delete confirmation callout disappears when CSR doesn't do any action for 3 seconds:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on the button labeled 'x' for the item
    When CSR doesn't do any action for 3 seconds
    Then Delete confirmation callout disappears
	
Examples:
  | UsingData 									|
  | Perf_QA_Delete_confirmation_disappears_after_3secs	|  	
  
  	        