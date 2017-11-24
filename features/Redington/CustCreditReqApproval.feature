Feature: Customer spend limit request and approval by BAM

  Scenario Outline: Customer spend limit request and approval by BAM:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    Then I update the customer spend limit
    Then I verify that the customer spend limit is updated
    Then I logout from the application
    Examples:
	|UsingData     |
	|OrderApproval |