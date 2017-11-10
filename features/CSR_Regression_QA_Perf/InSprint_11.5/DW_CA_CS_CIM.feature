Feature: Customer Information Module Framework
	This feature is to validate the Customer Information Module Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site
 
@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view teacher's full name in customer information module:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then correct Teacher’s full name with that Teacher’s prefix preceding his/her first name displays in first container from [Order Entry] page to [Confirm & Submit] page
    
    Examples:
       | UsingData          |
       | Perf_QA_CIM_TeacherName	|


@CIM @Priority2  @DWCACSR-208
Scenario Outline:Teacher Name in customer information module with no prefix:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation] whose prefix is not selected
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then only Teacher’s full name is displayed with no prefix from [Order Entry] page to [Confirm & Submit] page
    Examples:
       | UsingData                  |
       | Perf_QA_CIM_TeacherName_NoPrefix	|


@CIM @Priority3  @DWCACSR-208
Scenario Outline:No apple status information displayed in CustomerInformation module:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    #When CSR navigates to Order Entry Page
    #Then no apple status information is displayed in 1st container
    Examples:
       | UsingData          |
       | Perf_QA_CIM_NoAppleStatus	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view the Teacher's School information:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then teacher's full school address with School Account Number, School Name, Street Number, Street Name, City, Province, Postal Code and Country displays in 2nd container as listed in customer's profile from [Order Entry] page to [Confirm & Submit] page
    Examples:
       | UsingData          |
       | Perf_QA_CIM_SchoolInfo		|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view teacher's account number:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then teacher's correct account number displays in 3rd container from [Order Entry] page to [Confirm & Submit] page
    And there is no CAC information displayed on 3rd container from [Order Entry] page to [Confirm & Submit] page
    Examples:
       | UsingData          |
       | Perf_QA_CIM_AccountNumber	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view the Active status for a teacher:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation] whose account status is active
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then account status 'Active' displays beneath the account number in 3rd container
    Examples:
       | UsingData          |
       | Perf_QA_CIM_Active_status	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view the inactive status of a teacher in 3rd container:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation] whose account status is inactive
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then account status 'Inactive' displays beneath the account number in 3rd container
    Examples:
       | UsingData              |
       | Perf_QA_CIM_Inactive_status	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view the Temparory Hold Account status of a given teacher beneath the account number:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation] whose account Hold status is 'Temporary Hold'
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then account Hold status 'Temporary Hold' displays beneath the account number in 3rd container
    Examples:
       | UsingData                  |
       | Perf_QA_CIM_TemporaryHold_Status	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view the [Pre-Paid] account hold status of a given teacher:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation] whose account Hold status is 'Pre-Paid'
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then account Hold status 'Pre-Paid' displays beneath the account number in 3rd container
    Examples:
       | UsingData              |
       | Perf_QA_CIM_Pre-Paid_Status	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view the [Held by A/R] account hold status of a given teacher:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation] whose account Hold status is 'Held by A/R'
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then account Hold status 'Held by A/R' displays beneath the account number in 3rd container
    Examples:
       | UsingData          |
       | Perf_QA_CIM_HeldByAR		|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR can view Bonus Bank information in 4th container in Customer Information module:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then Fourth container is divided into 2 rows with the first row containing the label ‘Bonus Bank’ from [Order Entry] page to [Confirm & Submit] page
    And the 2nd row contains that Teacher’s total Bonus Dollars currently in that Teacher's Bonus Bank i.e. previous accumulated from [Order Entry] page to [Confirm & Submit] page
    
    Examples:
       | UsingData          |
       | Perf_QA_CIM_BonusBank		|


@CIM @Priority2  @DWCACSR-208
Scenario Outline:CSR can click on Bonus Bank to view the Bonus bank range list:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR clicks on Bonus Bank in 4th container
    Then CSR is presented with flyout containing the Bonus bank range list
    Examples:
       | UsingData              |
       | Perf_QA_CIM_BonusBankFlyout	|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR searches for a teacher account with no dollar in Bonus Bank:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then Zero is displayed in Bonus Bank in 4th container in Customer Information Module from [Order Entry] page to [Confirm & Submit] page
    Examples:
       | UsingData          |
       | Perf_QA_CIM_0BonusBank		|


@CIM @Priority1  @DWCACSR-208
Scenario Outline:CSR search for an account number whose has previous bonus bank balance:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    When CSR navigates to Order Entry Page
    Then teacher's correct bonus bank balance is displayed in 4th container in CustomerInformation module from [Order Entry] page to [Confirm & Submit] page
Examples:
   | UsingData              |
   | Perf_QA_CIM_BonusBankBalance	|

