Feature: Partner Organization creation by PM and Onhold by BAM
		

  Scenario Outline: Partner Organization creation by PM and Rejection by BAM:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    When I go to Organization Page 
    Then I onboard an Organization
    Then I logout from the application
    Then I launch the application as a BAM
    And I onhold the organization
    Then I logout from the application
    Given I launch the application as a Partner Manager
    And I verify that the organization is onhold
    Then I logout from the application
    
    Examples:
	|UsingData     |
	|OrderApproval |