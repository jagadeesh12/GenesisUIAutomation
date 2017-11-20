Feature: Partner user creation.
  
  Scenario Outline:  Creating a new Partner Manager User:[<UsingData>]
    Given I launch the application as a site admin[UserInformation]
    When I fill partner user form 
    Then Temporary password is generated
    Given I launch the mail application
    Then I get the verification code
    Given I launch the application
    Then I login with new username and temporary password
    Then I reset the password
    Given I launch the application
    Then I login with new username and reset password
    Then I view the partner user detail
    Then I logout from the application


    Examples:
	|UsingData     |
	|RedingtonLogin|
	

  Scenario Outline:  Creating a new Finance Manager User:[<UsingData>]
    Given I launch the application as a site admin[UserInformation]
    When I fill form to create Finance Manager
    Then Temporary password is generated
    Given I launch the mail application
    Then I get the verification code
    Given I launch the application
    Then I login with new username and temporary password
    Then I reset the password
    Given I launch the application
    Then I login with new username and reset password
    Then I logout from the application
    
    Examples:
	|UsingData     |
	|RedingtonLogin|

  
