Feature: CSR - Rewards & Redemption - Bonus Bank
	This feature is to validate the CSR - Rewards & Redemption - Bonus Bank scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
	
@RewardsRedemption_BonusBank
@SCSCOD-6238
@Priority1
@1
Scenario Outline: Bonus bank amount reduced by the amount redeemed on Student Club items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank amount for Student Club items
And CSR clicks on Apply in Students section
Then Bonus Bank amount is reduced by the redeemed amount
Examples:
  | UsingData                                        |
  | Perf_QA_RewardsRedemption_BonusBank_Reduced_StudentClubs |
  
@RewardsRedemption_BonusBank
@SCSCOD-6238
@Priority1
@2
Scenario Outline: Bonus bank amount reduced by the amount redeemed on Teacher Catalogue items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Catalogue items to the cart 
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR redeemable applies bonus bank amount for Teacher Catalogue items
And CSR clicks on Apply in teacher section
Then Bonus Bank amount is reduced by the redeemed amount
Examples:
  | UsingData                                            |
  | Perf_QA_RewardsRedemption_BonusBank_Reduced_TeacherCatalogue |

@RewardsRedemption_BonusBank
@SCSCOD-6238
@Priority1
@3
Scenario Outline: Bonus bank amount reduced by the amount redeemed on Paid Shipping:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR redeemable applies bonus bank amount for Paid Shipping
And CSR clicks on Apply in shipping section
Then Bonus Bank amount is reduced by the redeemed amount
Examples:
  | UsingData                                        |
  | Perf_QA_RewardsRedemption_BonusBank_Reduced_PaidShipping |
  
@RewardsRedemption_BonusBank
@SCSCOD-6238
@Priority1
@4
Scenario Outline: Bonus bank amount remains the same after removing redeemed amount on Student Club items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank amount for Student Club items
And CSR clicks on Apply in Students section
And CSR removes redeemable bonus bank amount for Student Club items
And CSR clicks on Apply in Students section
Then Bonus Bank amount is same as before
Examples:
  | UsingData                                                       |
  | Perf_QA_RewardsRedemption_BonusBank_Same_RemoveBonusAmount_StudentClubs |
  
@RewardsRedemption_BonusBank
@SCSCOD-6238
@Priority1
@5
Scenario Outline: Bonus bank amount remains the same after removing redeemed amount on Teacher Catalogue items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Catalogue items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR redeemable applies bonus bank amount for Teacher Catalogue items
And CSR clicks on Apply in teacher section
And CSR removes redeemable bonus bank amount for Teacher Catalogue items
And CSR clicks on Apply in teacher section
Then Bonus Bank amount is same as before
Examples:
  | UsingData                                                           |
  | Perf_QA_RewardsRedemption_BonusBank_Same_RemoveBonusAmount_TeacherCatalogue |
  
@RewardsRedemption_BonusBank
@SCSCOD-6238
@Priority1
@6
Scenario Outline: Bonus bank amount remains the same after removing redeemed amount on Paid Shipping:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR redeemable applies bonus bank amount for Paid Shipping
And CSR clicks on Apply in shipping section
And CSR removes redeemable bonus bank amount for Paid Shipping
And CSR clicks on Apply in shipping section
Then Bonus Bank amount is same as before
Examples:
  | UsingData                                                       |
  | Perf_QA_RewardsRedemption_BonusBank_Same_RemoveBonusAmount_PaidShipping |