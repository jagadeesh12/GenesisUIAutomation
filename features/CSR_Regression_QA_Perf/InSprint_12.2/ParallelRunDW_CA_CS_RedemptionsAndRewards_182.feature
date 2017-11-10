@Perf200
Feature: Redemptions & Rewards - Rewards Module - Dollars to Spend Modal Window & Search
	This feature is to validate the Redemptions & Rewards - Rewards Module - Dollars to Spend Modal Window & Search scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@1
Scenario Outline:DTS message and MAKE SELECTION button displays in Redemptions page when CSR adds minimum amount to the cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    Then DTS message section and MAKE SELECTION button should be displayed
	
Examples:
  | UsingData 											|
  | Perf_QA_DTS_msg_Selection_btn_displays_Redemptions_Rewards	|		
  

@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@2
Scenario Outline:DTS modal window, header label and title of the window displays when CSR clicks on MAKE SELECTION button in Redemptions page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [MAKE SELECTION] button
    Then DTS modal window should be displayed
    #And header label and title of the modal window should be displayed
    
Examples:
  | UsingData 												|
  | Perf_QA_DTS_header_title_section_displays_Redemptions_Rewards	|		
   
   
@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@3
Scenario Outline:Value of the amount of DTS within the header displays when CSR clicks on MAKE SELECTION button in Redemptions page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [MAKE SELECTION] button
    Then value of the amount of DTS within the header should be shown correctly as per the Rewards section
	
Examples:
  | UsingData 												|
  | Perf_QA_DTS_header_value_displays_correctly_Redemptions_Rewards	|		
 

 
@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@5
Scenario Outline:close button labeled 'X' displays in the top right position of the modal window when CSR clicks on MAKE SELECTION button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    When CSR clicks on [MAKE SELECTION] button
    Then the close button should be displayed in the top right position of the modal window
	
Examples:
  | UsingData 											|
  | Perf_QA_Close_btn_displays_in_modal_wnd_Redemptions_Rewards	|		


@Redemptions&Rewards_DTS-Window
@DWCACSR-182
@Priority1
@6
Scenario Outline:Redemptions and Rewards page displays when CSR clicks on close button in DTS modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
    And CSR clicks on [MAKE SELECTION] button
    When CSR clicks on close button in DTS modal window
    #Then modal window should be disappered
    Then [Redemptions & Rewards] page should be displayed
	
Examples:
  | UsingData 											|
  | Perf_QA_Close_btn_displays_in_modal_wnd_Redemptions_Rewards	|		
 

                    