Feature: Confirm & Submit - Order Details Module – Student Clubs – Bonus Dollars Applied
	This feature is to validate the Confirm & Submit - Order Details Module – Student Clubs – Bonus Dollars Applied scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit
@Priority1
@DWCACSR-1040
@Manual
@1
Scenario Outline:CSR sees the correct labels for the REWARDS section for Student Clubs in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the header label displays 'REWARDS' for Student Clubs rewards section
	And the label displays 'Bonus Bank' for the amount of Bonus Bank field
	And the amount is displays like [$##.##]
	And the label displays 'PAPER BONUS COUPONS, AND CREDIT NOTES' for the amount of Paper Bonus Coupons field
	And the amount is displays like [$##.##]
	
Examples:
  | UsingData 									|
  | Confirm_Submit_rewards_section_StudentClubs	|
  
  	
@Confirm&Submit
@Priority1
@DWCACSR-1044
@Manual
@1
Scenario Outline:CSR sees the correct labels for the REWARDS section for Teacher Catalogues in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the header label displays 'REWARDS' for Teacher Catalogues rewards section
	And the label displays 'Bonus Bank' for the amount of Bonus Bank field
	And the amount is displays like [$##.##]
	And the label displays 'PAPER BONUS COUPONS, AND CREDIT NOTES' for the amount of Paper Bonus Coupons field
	And the amount is displays like [$##.##]
	
Examples:
  | UsingData 											|
  | Confirm_Submit_rewards_section_TeacherCatalogues	|
  
  
@Confirm&Submit
@Priority1
@DWCACSR-1219
@Manual
@1
Scenario Outline:CSR sees the correct labels for the REWARDS section for Shipping and Handling in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the header label displays 'REWARDS' for Shipping and Handling rewards section
	And the label displays 'Bonus Bank' for the amount of Bonus Bank field
	And the amount is displays like [$##.##]
	And the label displays 'PAPER BONUS COUPONS, AND CREDIT NOTES' for the amount of Paper Bonus Coupons field
	And the amount is displays like [$##.##]
	
Examples:
  | UsingData 											|
  | Confirm_Submit_rewards_section_Shipping_Handling	|  
  
  