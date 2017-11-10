Feature: CSR - Teacher Cart - Including and Excluding SOO in Cart
	This feature is to validate the CSR - Teacher Cart - Including and Excluding SOO in Cart scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@1
Scenario Outline:SOO notification does not display when there are no SOO items in cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
  When CSR adds Student Clubs items to the cart
  And CSR navigates to Review Cart page from Order Entry page
  Then SOO notification message is not displayed

Examples:
    | UsingData                  				|
    | CSR_SOO_notification_not_display	|
    

@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@2
Scenario Outline:SOO notification displays when there are SOO items in cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
	And CSR navigates to Order Entry Page
  When CSR adds Student Clubs items to the cart
  And CSR navigates to Review Cart page from Order Entry page
  Then SOO notification message displays
  And the include orders checkbox is not selected by default
  And no SOO orders displays in Cart page
  
Examples:
    | UsingData                  						|
    | CSR_Pending_SOO_notification_display	|    
          	                            
          	                            
@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@3
Scenario Outline:CSR can include SOO items from cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
	And CSR navigates to Order Entry Page
  When CSR adds Student Clubs items to the cart
  And CSR navigates to Review Cart page from Order Entry page
  And CSR checks the include orders checkbox
  Then SOO orders display in the cart page
  And correct Child wise subtotal, taxes, total displays
  And correct Your Earning Rewards on total displays
  #And correct cart total, no. of items displays
  
Examples:
    | UsingData               |
    | CSR_includes_SOO_items	|   
    
    
@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@4
Scenario Outline:CSR can exclude SOO items from cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
	And CSR navigates to Order Entry Page
  When CSR adds Student Clubs items to the cart
  And CSR navigates to Review Cart page from Order Entry page
  And CSR checks the include orders checkbox
  And SOO orders display in the cart page
  When CSR unchecks the include orders checkbox
  Then no SOO orders displays in Cart page
  
Examples:
    | UsingData                  			|
    | CSR_execute_SOO_items_from_cart	|         
    

@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@5
Scenario Outline:CSR can delete all SOO items from teacher's cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
	And CSR navigates to Order Entry Page
  When CSR adds Student Clubs items to the cart
  And CSR navigates to Review Cart page from Order Entry page
  And CSR checks the include orders checkbox
  And SOO orders display in the cart page
  When CSR clicks delete for SOO order
  And CSR clicks on YES
  Then SOO orders are deleted from cart
  And SOO notification message is removed
  
Examples:
    | UsingData                 |
    | CSR_deletes_all_SOO_items	|     
    

@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@6
Scenario Outline:CSR deletes only one SOO order from teacher's cart:[<UsingData>]
	
		Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR checks the include orders checkbox
    And SOO orders display in the cart page
    When CSR clicks delete for one of the SOO order
    And CSR clicks on YES
    And CSR deletes student clubs items from Review cart page
    Then SOO orders are deleted from cart
    And SOO notification message still displays
    And rest of the SOO orders are still retained and shown
    And correct Your Earning Rewards on total displays
    And correct cart total, no. of items displays
  
Examples:
    | UsingData                 		|
    | CSR_deletes_only_one_SOO_item	|   
    
 
@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@7
Scenario Outline:SOO items do not display on Order Entry page:[<UsingData>]
	
		Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR checks the include orders checkbox
    When CSR navigates to Order Entry Page
    Then SOO orders do not display on Order Entry page
  
Examples:
    | UsingData                 |
    | CSR_SOO_items_not_display	|  
    
    
@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@8
Scenario Outline:CSR includes SOO orders and navigates back to Order entry and returns to cart:[<UsingData>]
	
		Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR checks the include orders checkbox
    And clicks on Order Entry from Step header
    And CSR navigates to Review Cart page from Order Entry page
    Then SOO orders display in the cart page
  
Examples:
    | UsingData                 |
    | CSR_includes_SOO_items		|  
    
    
@SOO_ReviewCart
@DWCAPCOD-1964
@Priority1
@9
Scenario Outline:CSR includes SOO orders, edits cart and returns to cart, all changes are saved:[<UsingData>]
	
		Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR checks the include orders checkbox
    And clicks on Edit cart
    And teacher updates the items on order entry page
    And CSR navigates to Review Cart page from Order Entry page
    Then SOO orders display in the cart page with the updates made to the items on order entry page
  
Examples:
    | UsingData                 					|
    | CSR_includes_SOO_items_edit_cart		| 
        
               	                            