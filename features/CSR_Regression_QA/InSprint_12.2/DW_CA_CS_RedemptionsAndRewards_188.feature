@Perf200
Feature: Redemptions & Rewards - Rewards Module - Qualifications - FREE item Promotion
	This feature is to validate the Redemptions & Rewards - Rewards Module - Qualifications - FREE item Promotion scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_FreeItemPromotion
@DWCACSR-188
@Priority1
@1
Scenario Outline:FreeItem promotion displays when CSR enters into Redemptions and Rewards page with minimum cart total:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then FreeItem promotion should be displayed
	
Examples:
  | UsingData 										|
  | QA_FreeItem_promotion_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_FreeItemPromotion
@DWCACSR-188
@Priority1
@2
Scenario Outline:CSR presented with the correct FreeItem promotion label in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then CSR should see the FreeItem promotion label
	
Examples:
  | UsingData 												|
  | QA_FreeItem_promotion_label_displays_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_FreeItemPromotion
@DWCACSR-188
@Priority1
@Manual
@3
Scenario Outline:FreeItem promotion is not displayed if the system date is outside of the date range:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then FreeItem promotion should not be displayed
	
Examples:
  | UsingData 										|
  | QA_FreeItem_promotion_not_display_Redemptions_Rewards	|		
    
 
@Redemptions&Rewards_FreeItemPromotion
@DWCACSR-188
@Priority1
@4
Scenario Outline:FreeItem promotion is not displayed when CSR enters into Redemptions and Rewards page without minimum cart total:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart less than the minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then FreeItem promotion should not be displayed
	
Examples:
  | UsingData 												|
  | QA_FreeItem_promotion_not_displayed_Redemptions_Rewards	|	
  
 
  