@Perf200
Feature: Payment - Page Header & CSR Script
	This feature is to validate the Payment - Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Payment_PageHeader&CSR_Script
@DWCACSR-302
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Payment header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then Blue step script icon should be displayed next to [Payment] header in a page
	
Examples:
  | UsingData 									|
  | QA_Blue_step_script_icon_displays_Payment_page	|		
  

@Payment_PageHeader&CSR_Script
@DWCACSR-302
@Priority1
@2
Scenario Outline:Modal window displays with the title 'To apply redemptions' when CSR clicks on Blue step script icon in Payment page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
    When CSR clicks on Blue step script icon in [Payment] page
    Then the modal window should be displayed with the title 'Shipping & Payment:'
    And the close button 'X' should be displayed in the top right corner of the [Shipping & Payment:] modal window
	
Examples:
  | UsingData 										|
  | QA_Blue_step_script_icon_modalWindow_Payment_page	|		
  

@Payment_PageHeader&CSR_Script
@DWCACSR-302
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Payment page when CSR closes the To confirm your order modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
    And CSR clicks on Blue step script icon in [Payment] page
    When CSR clicks on close button in [Shipping & Payment:] modal window
	Then CSR is presented with the [Payment] page
	
Examples:
  | UsingData 													|
  | QA_Blue_step_script_icon_modalWindow_disappeared_Payment_page	|
  
  		
      