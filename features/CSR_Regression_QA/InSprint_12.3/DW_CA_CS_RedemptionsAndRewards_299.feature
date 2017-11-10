@Perf200
Feature: Redemptions & Rewards - Page Validation
	This feature is to validate the Redemptions & Rewards - Page Validation scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_PageValidation
@DWCACSR-299
@Priority1 
@1 
Scenario Outline:CSR clicks ContinueCheckout without entering no. of students:[<UsingData>] 

	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	When CSR does not enter no. of students in student incentive promotion
	And CSR clicks on [Continue Checkout] in [Redemptions & Rewards] page
#	Then 'Empty field is invalid' error message displays
Examples: 
	| UsingData           	|
	| QA_CSR_continueCheckout_notEnter	|
		
      