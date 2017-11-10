Feature: CSR - Verify - Continue to Order Entry button disabled when account status is Inactive
	This feature is to validate the CSR - Verify - Continue to Order Entry button disabled when account status is Inactive scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
	
@Verify_OrderEntryButton
@SCSCOD-6177
@Priority1
@1
Scenario Outline: Order entry button disabled when account status is inactive after update:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
When CSR clicks Update Account button
Then CSR sees status as Inactive
And Order entry button is disabled
Examples:
  | UsingData                                                  |
  | QA:Verify_AccountStatus_UpdateAccount_Inactive_DisabledButton |
  
@Verify_OrderEntryButton
@SCSCOD-6177
@Priority1
@2
Scenario Outline: Order entry button disabled when account with inactive status is selected:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
When CSR navigates to Verify Account Page
Then Order entry button is disabled
Examples:
  | UsingData                                    |
  | QA:Verify_AccountStatus_Inactive_DisabledButton |