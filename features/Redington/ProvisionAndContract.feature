Feature: Provisioning and contract


  Scenario Outline: Place Order as PM and approve order and verify approval:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    Then I go to orders page and search for the approved product 
    And I do provisioning for products
	Then I logout from the application
	
	
	Examples:
	|UsingData     |
	|OrderApproval |	
	