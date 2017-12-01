Feature: Creating coupon by BAM 		
 @multOrder
  Scenario Outline: Partner Organization creation by PM and Approval by BAM and CA:[<UsingData>]
    Given I launch the application as a BAM[UserInformation]
	And I go to coupon page
	And I add a new coupon
	Then I get coupon number
    Then I logout from the application
        
    Examples:
	|UsingData     |
	|OrderApproval |
		

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