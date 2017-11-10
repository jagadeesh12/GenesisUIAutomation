Feature: CSR – Redemptions – Bonus Coupon Dollars, Paper Bonus Coupons, Credit Notes & Manual Coupons – Reset
	This feature is to validate the CSR – Redemptions – Bonus Coupon Dollars, Paper Bonus Coupons, Credit Notes & Manual Coupons – Reset scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site 


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6993     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@1
Scenario Outline: Manual coupons and redemptions for YTO are removed when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the YTO section
And CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:YTORedemptionsManualCoupons |


@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@2
Scenario Outline: Redemptions are removed for Teacher Exclusive when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:TeacherExclusiveRedemptions |
  
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@3
Scenario Outline: Manual coupons and redemptions for Teacher Exclusive are removed when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Exclusive items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section
And CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:TeacherExclusiveRedemptionsManualCoupons |
	
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@4
Scenario Outline: Manual coupons and redemptions for Paid Shipping are removed when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is below the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the Paid Shipping section
And CSR clicks on ‘Apply’ button for Paid Shipping section
And CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the Paid Shipping section
And CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:PaidShippingRedemptionsManualCoupons |
	
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@5
Scenario Outline: Redemptions are removed for Paid Shipping when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is below the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the Paid Shipping section
And CSR clicks on ‘Apply’ button for Paid Shipping section
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the Paid Shipping section
And CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:PaidShippingRedemptions |


@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@6
Scenario Outline: Manual coupons and redemptions for YTO and Teacher Exclusive are removed when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR adds Teacher Exclusive items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the YTO section
And CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section
And CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:YTOTeacherExclusiveRedemptionsManualCoupons |
  
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@7
Scenario Outline: Redemptions are removed for YTO and Teacher Exclusive when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR adds Teacher Exclusive items to the cart such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the YTO section
And CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:YTOTeacherExclusiveRedemptions |
	
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@8
Scenario Outline: Redemptions are removed for YTO, Teacher Exclusive and Paid Shipping when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is below the automatic free shipping promotion
And CSR adds Teacher Exclusive items such that it is below the automatic free shipping promotion 
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR applies partial bonus bank and paper coupons on the Paid Shipping section
And CSR clicks on ‘Apply’ button for Paid Shipping section
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the YTO section
And CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section
And CSR does not see the applied bonus bank and paper coupons on the Paid Shipping section
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:YTOTeacherExclusivePaidshippingRedemptions |
	
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@9
Scenario Outline: Manual coupons and redemptions for YTO, Teacher Exclusive and Paid Shipping are removed when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is below the automatic free shipping promotion
And CSR adds Teacher Exclusive items such that it is below the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR applies partial bonus bank and paper coupons on the Paid Shipping section
And CSR clicks on ‘Apply’ button for Paid Shipping section
And CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the YTO section
And CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section
And CSR does not see the applied bonus bank and paper coupons on the Paid Shipping section
And CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:YTOTeacherExclusivePaidshippingRedemptionsManualCoupons |


@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@10
Scenario Outline: Manual coupons are removed when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:ManualCoupons |
  
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@11
Scenario Outline: Redemptions are removed for YTO when ‘Reset’ button is selected on Rewards Page [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items such that it is equal or more than the automatic free shipping promotion
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR clicks on ‘Reset’ button
And CSR selects ‘YES’ on delete pop-up
Then CSR does not see the applied bonus bank and paper coupons on the YTO section
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:YTORedemptions |
	
@SCSCOD-6993
@Priority1
@Sprint-15.5
@CSR-RewardsRedemption
@BTS2017-2
@12
Scenario Outline: Manual coupons and redemptions remain when CSR selects ‘NO’ on the ‘Reset’ button:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart such that it is below the automatic free shipping promotion
And CSR adds Teacher Exclusive items such that it is below the automatic free shipping promotion 
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR applies partial bonus bank and paper coupons on the YTO section
And CSR clicks on ‘Apply’ button for YTO section
And CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section
And CSR clicks on ‘Apply’ button for Teacher Exclusive section
And CSR applies partial bonus bank and paper coupons on the Paid Shipping section
And CSR clicks on ‘Apply’ button for Paid Shipping section
And CSR applies manual coupons
And CSR clicks on ‘Reset’ button
And CSR selects ‘NO’ on delete pop-up
Then CSR sees the same applied bonus bank and paper coupons on the YTO section
And CSR sees the same applied bonus bank and paper coupons on the Teacher Exclusive section
And CSR sees the same applied bonus bank and paper coupons on the Paid Shipping section
And CSR sees the same previously entered manual coupons
Examples:
	| UsingData |
	| InSprint15.5:CSR:RewardsRedemption:Reset:NO:YTOTeacherExclusivePaidshippingRedemptionsManualCoupons |