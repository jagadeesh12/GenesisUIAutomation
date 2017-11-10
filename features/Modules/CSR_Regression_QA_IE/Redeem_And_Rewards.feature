Feature: Redeem & Rewards
	This feature is to validate the Redeem & Rewards page scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@Redemptions&Rewards_PageFramework
@DWCACSR-173
@Priority1
@1
Scenario Outline:Rewards and Coupons tab highlights when CSR clicks on Peoceed To Checkout in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
	#Then Rewards and Coupons popup window should be displayed
	Then [Redemptions & Rewards] tab should be highlighted in the step indicator
	
Examples:
  | UsingData 								|
  | QA_CSR_sees_RewardsAndCoupons_popup_window	|		
  

@Redemptions&Rewards_PageFramework
@DWCACSR-173
@Priority1
@2
Scenario Outline:Continue Checkout button enable in Rewards and Coupons page when CSR clicks on Peoceed To Checkout in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then the button [Continue Checkout] should be enabled in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_tab_highlights	|		
  

@Redemptions&Rewards_PageHeader&CSR_Script
@DWCACSR-175
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Redemptions and Rewards header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Blue step script icon should be displayed next to [Redemptions & Rewards] header in a page
	
Examples:
  | UsingData 											|
  | QA_Blue_step_script_icon_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_PageHeader&CSR_Script
@DWCACSR-175
@Priority1
@2
Scenario Outline:Modal window displays with the title 'To apply redemptions' when CSR clicks on Blue step script icon:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on Blue step script icon in [Rewards & Coupons] page
    Then the modal window should be displayed with the title 'To apply redemptions:'
    And the close button 'X' should be displayed in the top right corner of the [To apply redemptions:] modal window
	
Examples:
  | UsingData 												|
  | QA_Blue_step_script_icon_modalWindow_Redemptions_Rewards	|		
  

@Redemptions&Rewards_PageHeader&CSR_Script
@DWCACSR-175
@Priority1
@3
Scenario Outline:Modal window disappered when CSR closes the To confirm your order modal window_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on Blue step script icon in [Rewards & Coupons] page
    When CSR clicks on close button in [To apply redemptions:] modal window
	#Then [WHAT] modal window should be disappeared
	Then CSR is presented with the [Rewards & Coupons] page
	
Examples:
  | UsingData 															|
  | QA_Blue_step_script_icon_modalWindow_disappeared_Redemptions_Rewards	|
  
  		
@Redemptions&Rewards_StepHeader
@DWCACSR-174
@Priority1
@1
Scenario Outline:Redemptions and Rewards tab highlights in the step indicator when CSR enters into the Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    #When CSR clicks on [Proceed To Checkout] in Rewards and Coupons popup window
    Then [Redemptions & Rewards] tab should be highlighted in the step indicator
	
Examples:
  | UsingData                  			|
  | QA_Redemptions_Rewards_tab_highlights	|		
  

@Redemptions&Rewards_StepHeader
@DWCACSR-174
@Priority1
@2
Scenario Outline:Number of the Redemptions and Rewards page displays in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    #When CSR clicks on [Proceed To Checkout] in Rewards and Coupons popup window
	Then the step header number for the [Redemptions & Rewards] page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  				|
  | QA_Number_for_the_Redemptions_Rewards_tab	|	
  
  
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
    #And the text 'How is my Qualifying Order Value calculated?' should be displayed
	
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
    #Then Qualifying order value section should be displayed in Rewards module
	
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
  
                
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@1
Scenario Outline:Student Clubs section displays when CSR enters into Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Student Clubs section should be displayed
	
Examples:
  | UsingData 											|
  | QA_Student_Clubs_section_displays_Redemptions_Rewards	|  		
  

@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@3
Scenario Outline:Toggle button, Student Clubs header, items price and the summary displays correctly in Student Clubs header section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Toggle button should be displayed in Student Clubs header section
    And header label should be displayed as 'STUDENT CLUBS'
    And Student Clubs items price and the summary should be displayed
	
Examples:
  | UsingData 													|
  | QA_Student_Clubs_header_section_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@4
Scenario Outline:Student Clubs section expands by default when CSR enters into Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Student Clubs section should be expanded
	
Examples:
  | UsingData 											|
  | QA_Student_Clubs_section_expands_Redemptions_Rewards	|				
            
            
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@5
Scenario Outline:Minus button displays for the expanded Student Clubs toggle button in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label minus should be displayed in Student Clubs header section
	
Examples:
  | UsingData 										|
  | QA_Student_Clubs_label_Minus_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@6
Scenario Outline:Plus button displays when CSR clicks on Expanded Student Clubs toggle button in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on expanded Student Clubs toggle button
    Then the label plus should be displayed in Student Clubs header section
    And header label should be displayed as 'STUDENT CLUBS'
	
Examples:
  | UsingData 										|
  | QA_Student_Clubs_label_Plus_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@8
Scenario Outline:Student Clubs label and correct tax displays in Student Clubs second layer of the section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label 'Student Clubs Subtotal' should be displayed in the 2nd layer of the section
    And the tax module section and correct tax should be displayed for the Students Clubs items
	
Examples:
  | UsingData 								|
  | QA_Students_Clubs_tax_Redemptions_Rewards	|
  
   
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@10
Scenario Outline:'REDEEM BONUS COUPONS & CREDIT NOTES' label displays in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label 'REDEEM BONUS COUPONS & CREDIT NOTES' should be displayed in the 3rd layer of the Student Clubs section
	
Examples:
  | UsingData 														|
  | QA_REDEEM_BONUS_COUPONS_label_Student_Clubs_Redemptions_Rewards	|		
      
      
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@11
Scenario Outline:'Bonus Bank' label and paragraph of text reflective of the label displays in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label 'Bonus Bank' should be displayed in the 4th layer of the Student Clubs section
    And paragraph of text reflective of the label section should be displayed in the 4th layer of the Student Clubs section
	
Examples:
  | UsingData 											|
  | QA_Bonus_Bank_label_Student_Clubs_Redemptions_Rewards	|		
    
    
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@12
Scenario Outline:Bonus Bank field text box displays in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then [Bonus Bank] text box should be displayed with the label '-$' in the 4th layer of the Student Clubs section
	
Examples:
  | UsingData 													|
  | QA_Bonus_Bank_textBox_label_StudentClubs_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@13
Scenario Outline:CSR can enter decimal number in Bonus Bank text box in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters amount in Student Clubs Bonus Bank
    Then Student Clubs section Bonus Bank text box should accept the value
	
Examples:
  | UsingData 													|
  | QA_Bonus_Bank_textBox_decimal_StudentClubs_Redemptions_Rewards	|		
 
 
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@14
Scenario Outline:'Paper Bonus Coupons, And Credit Notes' label and paragraph of text reflective of the label displays in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label 'Paper Bonus Coupons, And Credit Notes' should be displayed in the 5th layer of the Student Clubs section
    And paragraph of text reflective of the label section should be displayed in the 5th layer of the Student Clubs section
	
Examples:
  | UsingData 													|
  | QA_Paper_Bonus_Coupons_label_StudentClubs_Redemptions_Rewards	|		
    
    
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@15
Scenario Outline:Paper Bonus Coupons And Credit Notes field text box displays in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then [Paper Bonus Coupons And Credit Notes] text box should be displayed with the label '-$' in the 5th layer of the Student Clubs section
	
Examples:
  | UsingData 															|
  | QA_Paper_Bonus_Coupons_textBox_label_StudentClubs_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@16
Scenario Outline:CSR can enter Float value in Paper Bonus Coupons And Credit Notes text box in Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters amount in Student Clubs Paper Bonus
    Then Student Clubs section Paper Bonus text box should accept the value
	
Examples:
  | UsingData 															|
  | QA_Paper_Bonus_Coupons_textBox_float_StudentClubs_Redemptions_Rewards	|
  
  
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@17
Scenario Outline:APPLY button displays in a Student Clubs section in Rdemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the Apply button should be displayed with the label 'APPLY' in the 6th layer of the Student Clubs section
	
Examples:
  | UsingData 										|
  | QA_APPLY_label_StudentClubs_Redemptions_Rewards	|
  
    		
@Redemptions&Rewards_StudentClubs&TeacherCatalogues
@DWCACSR-178
@Priority1
@18
Scenario Outline:'Student Clubs Amount Owing' label, Total Student Clubs amt and items displays in footer layer of the Student Clubs section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label 'Student Clubs Amount Owing' should be displayed in the footer layer of the Student Clubs section
    And Student Clubs Amount Owing field and Items field should be displayed in the footer layer of the Student Clubs section
	
Examples:
  | UsingData 											|
  | QA_Total_AmountOwing_StudentClubs_Redemptions_Rewards	|
  
 
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@1
Scenario Outline:Shipping and handling section displays when CSR enters into Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Shipping and Handing section should be displayed
	
Examples:
  | UsingData 													|
  | QA_Shipping_and_handling_section_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@2
Scenario Outline:Toggle button, Shipping header and shipping charge field displays in Shipping and Handling header section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Toggle button should be displayed in Shipping and handling header section
    And 'Shipping & Handling' header label should be displayed
    And Shipping price field should be displayed
	
Examples:
  | UsingData 															|
  | QA_Shipping_and_handling_header_section_displays_Redemptions_Rewards	|		
  


@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@4
Scenario Outline:Shipping and Handling section expands by default when CSR enters into Redemptions and Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then Shipping and Handling section should be expanded
	
Examples:
  | UsingData 													|
  | QA_Shipping_and_handling_section_expands_Redemptions_Rewards	|		
      
      
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@5
Scenario Outline:The label FREE! displays if the cart total is qualifies minimum amount in Shipping and Handling section in Rewards page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label should be displayed as 'FREE!' in Shipping and Handling header section
	
Examples:
  | UsingData 												|
  | QA_Shipping_and_handling_label_FREE_Redemptions_Rewards	|		
            
            
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@6
Scenario Outline:Expanded Shipping and Handling toggle button displays as minus button in Shipping and Handling section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label minus should be displayed in Shipping and Handling header section
	
Examples:
  | UsingData 												|
  | QA_Shipping_and_handling_label_Minus_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@7
Scenario Outline:Plus button displays when CSR clicks on Expanded Shipping and Handling toggle button in Shipping and Handling section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on expanded Shipping and Handling toggle button
    Then the label plus should be displayed in Shipping and Handling header section
	
Examples:
  | UsingData 												|
  | QA_Shipping_and_handling_label_Plus_Redemptions_Rewards	|		
  
  
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@8
Scenario Outline:Shipping and Handling label and correct tax displays in Shipping and Handling section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then the label 'Shipping & Handling' should be displayed in the 2nd layer of the section
    And the tax module section and correct tax should be displayed
	
Examples:
  | UsingData 										|
  | QA_Shipping_and_handling_tax_Redemptions_Rewards	|		
  

  
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@13
Scenario Outline:CSR can enter decimal number in Bonus Bank text box in Shipping and Handling section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters amount in Shipping and Handling Bonus Bank
    Then Shipping and Handling section Bonus Bank text box should accept the value
	
Examples:
  | UsingData 										|
  | QA_Bonus_Bank_textBox_decimal_Redemptions_Rewards	|		
 

@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@16
Scenario Outline:CSR can enter Float value in Paper Bonus Coupons And Credit Notes text box in Shipping and Handling section:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR enters amount in Shipping and Handling Paper Bonus
    Then Shipping and Handling section Paper Bonus text box should accept the value
	
Examples:
  | UsingData 												|
  | QA_Paper_Bonus_Coupons_textBox_float_Redemptions_Rewards	|
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@1
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 								|
  | QA_Redemptions_Rewards_GST_PST_Province_BC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@2
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 									|
  | QA_Redemptions_Rewards_GST_PST_Province_BC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@3
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 								|
  | QA_Redemptions_Rewards_GST_QST_Province_QC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@4
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 									|
  | QA_Redemptions_Rewards_GST_QST_Province_QC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@5
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_HST_Province_NL	|
 
 
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@5
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_HST_Province_NB	|

  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@5
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_HST_Province_NS	|

  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@5
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_HST_Province_ON	|

  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@5
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_HST_Province_PE	|
    
        

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_GST_Province_AB	|

     

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_GST_Province_MB	|

     
     
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_GST_Province_NT	|

     
     
     
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_GST_Province_NU	|

     
     
     
     
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_GST_Province_SK	|

     
     
     
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@6
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 							|
  | QA_Redemptions_Rewards_GST_Province_YT	|
          
                    
     
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@7
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays
	
Examples:
  | UsingData 										|
  | QA_Redemptions_Rewards_GST_PST_Province_BC_NoTaxes	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@8
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays
	
Examples:
  | UsingData 										|
  | QA_Redemptions_Rewards_GST_QST_Province_QC_NoTaxes	|


@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@11
Scenario Outline:Correct values display for Student Clubs when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Redemptions_Rewards_GST_PST_Province_BC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@12
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Redemptions_Rewards_GST_PST_Province_BC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@13
Scenario Outline:Correct values display for Student Clubs when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Redemptions_Rewards_GST_QST_Province_QC	|
  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@14
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 												|
  | QA_StudentClubs_Redemptions_Rewards_GST_QST_Province_QC_2	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@15
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_HST_Province_NL	|

  

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@15
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_HST_Province_NB	|

  
  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@15
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_HST_Province_NS	|

  
  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@15
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_HST_Province_ON	|

  
  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@15
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_HST_Province_PE	|
        


@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_GST_Province_AB	|

     

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_GST_Province_MB	|

     

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_GST_Province_NT	|

     

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_GST_Province_NU	|

     

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_GST_Province_SK	|

     

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@16
Scenario Outline:Correct values display for Student Clubs when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 											|
  | QA_StudentClubs_Redemptions_Rewards_GST_Province_YT	|
     

  
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@17
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays
	
Examples:
  | UsingData 														|
  | QA_StudentClubs_Redemptions_Rewards_GST_PST_Province_BC_NoTaxes	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@18
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays
	
Examples:
  | UsingData				 										|
  |  QA_StudentClubs_Redemptions_Rewards_GST_QST_Province_QC_NoTaxes	|
  
 

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@21
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 																|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_PST_Province_BC	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@22
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 																|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_QST_Province_QC	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@23
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_NL	|

  

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@23
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_NB	|

  
  
  @Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@23
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_NS	|

  
  
  @Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@23
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_ON	|

  
  
  @Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@23
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_HST_Province_PE	|
  

@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_AB	|



@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_MB	|

  
  
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_NT	|

  
  
  
  @Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_NU	|

  
  
  @Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_SK	|

  
  
  @Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@24
Scenario Outline:Correct values display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly
	
Examples:
  | UsingData 															|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_Province_YT	|
    
  	
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@25
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays
	
Examples:
  | UsingData 																		|
  | QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_PST_Province_BC_NoTaxes	|
  
   
@Redemptions&Rewards_Student-Teacher&Shipping_Taxes
@DWCACSR-564
@Priority1
@26
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying min order
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays
	
Examples:
  | UsingData				 														|
  |  QA_Student_And_TeacherCatalogues_Redemptions_Rewards_GST_QST_Province_QC_NoTaxes	|
  
  
  
  
  
  ##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7190        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR receives Free New Teacher Kit on only teacher club items:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher catalogue items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR should see Free Teacher Kit promotion is displayed
Examples:
|UsingData                                                                 |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit_TeacherClubItems|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR still receive Free New Teacher Kit if order total is zero with redemptions:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR makes order total as zero by applying redemptions
Then CSR should see Free Teacher Kit promotion is displayed

Examples:
|UsingData                                                            |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit_Redemptions|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR receives Free New Teacher Kit on Student club items:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR should see Free Teacher Kit promotion is displayed

Examples:
|UsingData                                                |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: Existing CSR does not receives Free New Teacher Kit:[<UsingData>]

Given CSR is not new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
But CSR should not receive Free Teacher Kit promotion

Examples:
|UsingData                                                         |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_Existing_NewTeacherKit|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR receives Free New Teacher Kit along with Free item promotion on a cart with qualifying min amt on Student Club orders:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR should see Free Teacher Kit promotion is displayed
And FreeItem promotion should be displayed

Examples:
|UsingData                                                              |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit_FreeItemPromo|
       
                                                                  