Feature: Order Placement as PM 
		Order Approval as FM
		Order Approval as PM
		
		
 
  Scenario Outline: Place Order as PM and approve order and verify approval:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    Then I add a product to the cart
    Then I logout from the application
    Given I launch the application as a Finance Manager
    Then I approve the product that has been ordered
	Then I logout from the application   
 	Given I launch the application as a Partner Manager
    Then I should see the Product that has been ordered is approved
	Then I logout from the application
	
	
	Examples:
	|UsingData     |
	|OrderApproval |