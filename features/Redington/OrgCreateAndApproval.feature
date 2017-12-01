Feature: Partner Organization creation by PM and Approval by BAM and CA
		

  Scenario Outline: Partner Organization creation by PM and Approval by BAM and CA:[<UsingData>]
    Given I launch the application as a Partner Manager[UserInformation]
    When I go to Organization Page 
    Then I onboard an Organization
    Then I logout from the application
    Then I launch the application as a BAM
    And I approve the organization
    Then I logout from the application
    Then I launch the application as a CA
    And I approve the organization as CA
    Then I logout from the application
    Given I launch the application as a Partner Manager
    And I verify that the organization is approved
    Then I logout from the application
        
    Examples:
	|UsingData     |
	|OrderApproval |
	
#@existOrg	
  #Scenario Outline: Existing Organization Onboard by PM and Approval by BAM and CA:[<UsingData>]
   # Given I launch the application as a Partner Manager[UserInformation]
    #When I go to Organization Page 
    #Then I onboard Existing Organization
    #Then I logout from the application
    #Then I launch the application as a BAM
    #And I approve the organization
    #Then I logout from the application
    #Then I launch the application as a CAgit
    #And I approve the organization as CA
    #Then I logout from the application
    #Given I launch the application as a Partner Manager
    #And I verify that the organization is approved
    #Then I logout from the application
      
    #Examples:
	#|UsingData     |
	#|OrderApproval |
  