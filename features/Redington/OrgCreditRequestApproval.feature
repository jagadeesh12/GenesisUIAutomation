Feature: Partner Organization credit request by PM and Approval and CA
		

  Scenario Outline: Partner Organization creation by PM and Approval by BAM and CA:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    And I go to Partner Organization Credit Request Page
    Then I apply for partner organization credit request
    Then I logout from the application
    Then I launch the application as a CA
    Then I approve the credit request
    Then I logout from the application
    Given I launch the application as a Partner Manager
    And I verify that the organization credit request is approved
    Then I logout from the application
    
    Examples:
	|UsingData     |
	|OrderApproval |