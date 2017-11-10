Feature: Redemptions & Rewards - Page Header & CSR Script
	This feature is to validate the Redemptions & Rewards - Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


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
  | Blue_step_script_icon_displays_Redemptions_Rewards	|		
  

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
  | Blue_step_script_icon_modalWindow_Redemptions_Rewards	|		
  

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
  | Blue_step_script_icon_modalWindow_disappeared_Redemptions_Rewards	|
  
  		
      