Feature: Partner Organization creation by PM and Approval by BAM and CA
		

  Scenario Outline: Partner Organization creation by PM and Approval by BAM and CA:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    When I go to Organization Page 
    Then I onboard an Organization
    Then I logout from the application
    Then I launch the application as a BAM
    Then I go to Organization Page 
    And I approve the organization
    Then I logout from the application
    
    Examples:
	|UsingData     |
	|OrderApproval |