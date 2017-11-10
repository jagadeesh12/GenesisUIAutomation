Feature: Redemptions & Rewards - Shipping & Handling
	This feature is to validate the Redemptions & Rewards - Shipping & Handling scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Shipping_and_handling_section_displays_Redemptions_Rewards	|		
  

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
  | Shipping_and_handling_header_section_displays_Redemptions_Rewards	|		
  


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
  | Shipping_and_handling_section_expands_Redemptions_Rewards	|		
      
      
@Redemptions&Rewards_Shipping&Handling
@DWCACSR-216
@Priority1
@5
Scenario Outline:The label FREE! displays if the cart total is qualifies minimum amount in Shipping and Handling section in Redemptions and Rewards page:[<UsingData>]
	
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
  | Shipping_and_handling_label_FREE_Redemptions_Rewards	|		
            
            
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
  | Shipping_and_handling_label_Minus_Redemptions_Rewards	|		
  
  
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
  | Shipping_and_handling_label_Plus_Redemptions_Rewards	|		
  
  
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
  | Shipping_and_handling_tax_Redemptions_Rewards	|		
  

  
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
  | Bonus_Bank_textBox_decimal_Redemptions_Rewards	|		
 

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
  | Paper_Bonus_Coupons_textBox_float_Redemptions_Rewards	|
  
                                   