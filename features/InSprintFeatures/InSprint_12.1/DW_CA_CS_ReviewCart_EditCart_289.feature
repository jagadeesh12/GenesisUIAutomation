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
  | CSR_sees_Edit_Cart_label		|			
  

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
  | CSR_clicks_hyperlink_Edit_Cart	|			
  

@ReviewCart_EditCart
@DWCACSR-289
@Priority1
@3
Scenario Outline:CSR does not see the deleted items in Order Entry page when he deletes it in Review cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR deletes the item
    When CSR clicks on the hyperlink [Edit Cart]
    Then the deleted item should not be displayed in Order Entry page
	
Examples:
  | UsingData 					|
  | CSR_not_see_deleted_items	|  
  
  
@ReviewCart_EditCart
@DWCACSR-289
@Priority1
@4
Scenario Outline:CSR sees the correct item numbers and the quantities displays in all the forms of Order Entry:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart in a form1
	And CSR adds Student Clubs items to the cart in a form2
	And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the hyperlink [Edit Cart]
    Then entered item numbers and the quantities should be displayed correctly in all the forms
	
Examples:
  | UsingData 								|
  | CSR_sees_correct_data_OrderEntry_page	|
  
      