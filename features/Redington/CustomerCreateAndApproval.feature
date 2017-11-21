Feature: Customer creation by PM and Approval by BAM 

  Scenario Outline: Customer creation by PM and Approval by BAM :[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    #When I go to Organization Page 
    #Then I onboard an Organization
    #Then I logout from the application
    #Then I launch the application as a BAM
    #And I approve the organization
    #Then I logout from the application
    #Then I launch the application as a CA
    #And I approve the organization as CA
    #Then I logout from the application
    #Given I launch the application as a Partner Manager
    #And I verify that the organization is approved
    #Then I logout from the application
    #Given I launch the application as a Partner Manager
    When I go to Customer Page
    Then I create an Customer
    Then I logout from the application
    Then I launch the application as a BAM
    And I approve the customer
    Then I logout from the application
    Given I launch the application as a Partner Manager
	When I go to Customer Page
    And I verify that the customer is approved
    Then I logout from the application
    Examples:
	|UsingData     |
	|OrderApproval |