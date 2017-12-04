Feature: Placing multiple orders
		

  Scenario Outline: Place Order as PM and approve order and verify approval:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    Then I add base products to the cart
    Then I add addon products to the cart 
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