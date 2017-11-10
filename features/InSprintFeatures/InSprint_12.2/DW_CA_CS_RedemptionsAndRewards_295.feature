Feature: Redemptions & Rewards - Rewards Module - Qualifications - Free Readmoji Bookmark (Student Incentive)
	This feature is to validate the Redemptions & Rewards - Rewards Module - Qualifications - Free Readmoji Bookmark (Student Incentive) scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_StudentIncentive
@DWCACSR-295
@Priority1
@1
Scenario Outline:Student Incentive promotion displays when CSR enters into Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Student Incentive promotion should be displayed
	
Examples:
  | UsingData 												|
  | StudentIncentive_promotion_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_StudentIncentive
@DWCACSR-295
@Priority1
@2
Scenario Outline:Student Incentive text box displays when CSR enters into Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Student Incentive text box should be displayed
	
Examples:
  | UsingData 												|
  | StudentIncentive_textbox_displays_Redemptions_Rewards	| 
  
  
@Redemptions&Rewards_StudentIncentive
@DWCACSR-295
@Priority1
@3
Scenario Outline:CSR can enter numeric value in a Student Incentive text box in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters numeric value in a Student Incentive text box
    Then the Student Incentive text box should be allowed the entered value
	
Examples:
  | UsingData 												|
  | StudentIncentive_textbox_enter_Numeric_Redemptions_Rewards	| 
  
  
@Redemptions&Rewards_StudentIncentive
@DWCACSR-295
@Priority1
@4
Scenario Outline:CSR cannot enter other than numeric value in a Student Incentive text box in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters other than numeric value in a Student Incentive text box
    Then the Student Incentive text box should not allow the entered value
	
Examples:
  | UsingData 															|
  | Enter_alphabets_in_a_StudentIncentive_textbox_Redemptions_Rewards	|
  | Enter_negative_value_in_a_StudentIncentive_textbox_Redemptions_Rewards	|   
  | Enter_special_char_in_a_StudentIncentive_textbox_Redemptions_Rewards	|

  
@Redemptions&Rewards_StudentIncentive
@DWCACSR-295
@Priority1
@5
Scenario Outline:CSR can enter number of students value 50 in a Student Incentive text box in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters number of students in a Student Incentive text box
    And CSR clicks on [Continue Checkout] in [Redemptions & Rewards] page
    Then Exceeded students error message should not be displayed
	
Examples:
  | UsingData 												|
  | StudentIncentive_textbox_enter_50_Redemptions_Rewards	| 
    
  
@Redemptions&Rewards_StudentIncentive
@DWCACSR-295
@Priority1
@6
Scenario Outline:CSR cannot enter number of students value greater than 50 in a Student Incentive text box in Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR enters number of students in a Student Incentive text box
    When CSR clicks on [Continue Checkout] in [Redemptions & Rewards] page
    Then Exceeded students error message should be displayed
	
Examples:
  | UsingData 														|
  | StudentIncentive_textbox_enter_more_than_50_Redemptions_Rewards	| 
      

     