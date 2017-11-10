@Perf200
Feature: Redemptions & Rewards - Rewards Module
	This feature is to validate the Redemptions & Rewards - Rewards Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_RewardsModule
@DWCACSR-180
@Priority1
@1
Scenario Outline:CSR sees header of the Rewards module as REWARDS in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the header label 'REWARDS' should be displayed for the title of the Rewards module
    And the text 'Rewards Earned with Todays Qualifying Order Value of' should be displayed
    And the text 'How is my Qualifying Order Value calculated?' should be displayed
	
Examples:
  | UsingData 							|
  | QA_Rewards_label_Redemptions_Rewards	|		
  
@Redemptions&Rewards_RewardsModule
@DWCACSR-180
@Priority1
@2
Scenario Outline:CSR sees Time and Date to recieve the rewards in a Rewards module in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Time and Date section should be displayed in Rewards module
	
Examples:
  | UsingData 									|
  | QA_CSR_sees_Time_and_Date_Redemptions_Rewards	|
  
  
@Redemptions&Rewards_RewardsModule
@DWCACSR-180
@Priority1
@3
Scenario Outline:CSR sees Time and Date to recieve the rewards in a Rewards module in Redemptions and Rewards page2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the date and time should be displayed as e.g. 11/30, 11:59pm ET based on the date in a Time and Date section in Rewards module
	
Examples:
  | UsingData 											|
  | QA_CSR_sees_correct_Time_and_Date_Redemptions_Rewards	|  		
  

@Redemptions&Rewards_RewardsModule
@DWCACSR-180
@Priority1
@4
Scenario Outline:CSR sees Qualifying order value section in a Rewards module in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Qualifying order value section should be displayed in Rewards module
	
Examples:
  | UsingData 											|
  | QA_CSR_sees_Qualifying_order_value_Redemptions_Rewards	|
  

@Redemptions&Rewards_RewardsModule
@DWCACSR-180
@Priority1
@5
Scenario Outline:CSR sees correct qualifying order value in a Rewards module in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then correct qualifying order value should be displayed in Rewards section
	
Examples:
  | UsingData 													|
  | QA_CSR_sees_correct_qualifying_order_value_Redemptions_Rewards	|  
  