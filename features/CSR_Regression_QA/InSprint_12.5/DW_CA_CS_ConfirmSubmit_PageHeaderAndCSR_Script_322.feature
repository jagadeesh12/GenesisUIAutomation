@Perf200
Feature: Confirm & Submit - Page Header & CSR Script
	This feature is to validate the Confirm & Submit - Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit_PageHeader&CSR_Script
@DWCACSR-322
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Confirm and Submit header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Blue step script icon should be displayed next to [Confirm & Submit] header in a page
	
Examples:
  | UsingData 											|
  | QA_Blue_step_script_icon_displays_ConfirmSubmit_page	|		
  

@Confirm&Submit_PageHeader&CSR_Script
@DWCACSR-322
@Priority1
@2
Scenario Outline:Modal window displays with the title 'Confirm and Submit' when CSR clicks on Blue step script icon in Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
    When CSR clicks on Blue step script icon in [Confirm & Submit] page
    Then the modal window should be displayed with the title 'Confirm & Submit:'
    And the close button 'X' should be displayed in the top right corner of the [Confirm & Submit:] modal window
	
Examples:
  | UsingData 												|
  | QA_Blue_step_script_icon_modalWindow_ConfirmSubmit_page	|		
  

@Confirm&Submit_PageHeader&CSR_Script
@DWCACSR-322
@Priority1
@3
Scenario Outline:Modal window disappered and presented with Confirm and Submit page when CSR closes the modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
    And CSR clicks on Blue step script icon in [Confirm & Submit] page
    When CSR clicks on close button in [Confirm & Submit:] modal window
	Then CSR is presented with the [Confirm & Submit] page
	
Examples:
  | UsingData 															|
  | QA_Blue_step_script_icon_modalWindow_disappeared_Confirm_Submit_page	|
  
  		
      