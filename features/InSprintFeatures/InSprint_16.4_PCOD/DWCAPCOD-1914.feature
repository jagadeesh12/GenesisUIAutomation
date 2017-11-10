Feature: DWCAPCOD-1914
  Parents - Account Creation - Prevent Account Creation with non-unique email address

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

  @DWCAPCOD-1914
  @Parent_Registration
  @Priority1
  @Sprint-16.4
  @1
  Scenario Outline: Parent cannot create an account with already existing email address [LowerCase]:[<UsingData>]
    Given parent navigates to RCO CA Login page
    And parent clicks on "Connect to Your Teacher" button
    And parent enters postal code and selects a teacher
    And parent clicks on Create an Account
    When parent enters already existing teacher email address and all other mandatory information
    And parent clicks on "Continue"
    Then error message "An account associated with this email address already exists. Please sign in. Forgot your password? Click here" displays.
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ParentRegistration:TeacherEmail_LowerCase_AlreadyUsed|

  @DWCAPCOD-1914
  @Parent_Registration
  @Priority1
  @Sprint-16.4
  @2
  Scenario Outline: Parent cannot create an account with already existing email address [UpperCase]:[<UsingData>]
    Given parent navigates to RCO CA Login page
    And parent clicks on "Connect to Your Teacher" button
    And parent enters postal code and selects a teacher
    And parent clicks on Create an Account
    When parent enters already existing teacher email address and all other mandatory information
    And parent clicks on "Continue"
    Then error message "An account associated with this email address already exists. Please sign in. Forgot your password? Click here" displays.
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ParentRegistration:TeacherEmail_UpperCase_AlreadyUsed|

  @DWCAPCOD-1914
  @Parent_Registration
  @Priority1
  @Sprint-16.4
  @3
  Scenario Outline: Parent cannot create an account with already existing email address [MixedCase]:[<UsingData>]
    Given parent navigates to RCO CA Login page
    And parent clicks on "Connect to Your Teacher" button
    And parent enters postal code and selects a teacher
    And parent clicks on Create an Account
    When parent enters already existing teacher email address and all other mandatory information
    And parent clicks on "Continue"
    Then error message "An account associated with this email address already exists. Please sign in. Forgot your password? Click here" displays.
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ParentRegistration:TeacherEmail_MixedCase_AlreadyUsed|

  @DWCAPCOD-1914
  @Parent_Registration
  @Priority1
  @Sprint-16.4
  @4
  Scenario Outline: Click here link from duplicate email error messages on Create Account modal:[<UsingData>]
    Given parent navigates to RCO CA Login page
    And parent clicks on "Connect to Your Teacher" button
    And parent enters postal code and selects a teacher
    And parent clicks on Create an Account
    And parent enters already existing teacher email address and all other mandatory information
    And parent clicks on "Continue"
    When parent clicks on "click here" link from the error message
    Then Forgot password modal displays
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ParentRegistration:TeacherEmail_ForgotPassword|

  @DWCAPCOD-1914
  @Parent_Registration
  @Priority1
  @Sprint-16.4
  @5
  Scenario Outline: Parent can enter any domain in Email address:[<UsingData>]
    Given parent navigates to RCO CA Login page
    And parent clicks on "Connect to Your Teacher" button
    And parent enters postal code and selects a teacher
    And parent clicks on Create an Account
    And parent enters email address with any invalid domain like .education
    When parent enters rest of the mandatory information during the registration prcess
    Then parent lands on Home page
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ParentRegistration:AnyDomain|