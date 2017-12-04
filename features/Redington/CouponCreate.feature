Feature: Creating coupon by BAM 		

  Scenario Outline: Partner Organization creation by PM and Approval by BAM and CA:[<UsingData>]
    Given I launch the application as a BAM[UserInformation]
	And I go to coupon page
	And I add a new coupon
	Then I get coupon number
    Then I logout from the application
        
    Examples:
	|UsingData     |
	|OrderApproval |
		
	
	
	