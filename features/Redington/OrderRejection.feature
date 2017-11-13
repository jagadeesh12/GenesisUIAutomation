Feature: Order Placement as PM 
		Order Rejection as FM
		Order Rejection as PM
		
		
 
  Scenario Outline: Place Order as PM and reject order and verify order rejection:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    Then I add a product to the cart
    Then I logout from the application
    Given I launch the application as a Finance Manager
    Then I reject the product that has been ordered
	Then I logout from the application   
 	Given I launch the application as a Partner Manager
    Then I should see the Product that has been ordered is rejected
	Then I logout from the application
	
	
	Examples:
	|UsingData     |
	|OrderApproval |