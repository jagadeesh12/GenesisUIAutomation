Feature: The cart items added to an account are carried over to another account
	This feature is to validate the cart items added to an account are carried over to another account Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@DWCACSR-1952
@Priority1
@1
Scenario Outline:Pending items on one account does not appear on the Order Entry page of another account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to [Locate Account] page
	And CSR searches with the [Other Account Number]
	When CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	Then CSR does not see the pending items on Order Entry page of [Other Account Number]
	
Examples:
  | UsingData               				|
  | Perf_QA_Items_Independent_Of_Accounts_Pending   |
 

@DWCACSR-1952
@Priority1
@2
Scenario Outline:Pending items on CSR Order Entry page for the account does not appear in shopping cart on Teacher's website for same account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to [Locate Account] page
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	When CSR navigates to Review Cart page by clicking on Review cart Tab
	Then pending items on CSR order entry page is not present in the cart
	
Examples:
  | UsingData               					|
  | Perf_QA_Items_Same_Account_Pending_Teacher_Account  |
 

@DWCACSR-1952
@Priority1
@3
Scenario Outline:Pending items on Teacher’s website for the account does not appear on Order Entry page when CSR searches for same account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to [Locate Account] page
	And CSR searches with the [Account Number]
	When CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	Then pending items on Teacher's website is not present on Order Entry page
	
Examples:
  | UsingData               		|
  | Perf_QA_Items_Same_Account_Pending_CSR  |
 
 
@DWCACSR-1952
@Priority1
@4
Scenario Outline:The items purchased on one account does not appear in another account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Cheques as payment
	And CSR navigates to [Confirm & Submit] page
	And CSR submits the order
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Other Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	When CSR navigates to Order Entry Page
	Then CSR does not see the items purchased with [Account Number] in [Other Account Number]
	
Examples:
  | UsingData               				|
  | Perf_QA_Items_Independent_Of_Accounts_Purchase  |


@DWCACSR-1952
@Priority1
@5
Scenario Outline:The items purchased on account does not appear on the Order Entry page of same account:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Cheques as payment
	And CSR navigates to [Confirm & Submit] page
	And CSR submits the order
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	And CSR navigates to Verify Account Page from Search Results page
	When CSR navigates to Order Entry Page
	Then CSR does not see the items purchased in Order Entry page
	
Examples:
  | UsingData               	|
  | Perf_QA_Items_Same_Account_Purchase |
    