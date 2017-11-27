Feature: Validate MPN id
  
  Scenario: Validating MPN id
    Given Login to Application
    When Enter MPN id
    Then MPN id is validated
   
  Scenario:Add New Partner Organisation
    Given Login to Application
    When Provide mandatory orgnisation details
    Then Validate orgnisation