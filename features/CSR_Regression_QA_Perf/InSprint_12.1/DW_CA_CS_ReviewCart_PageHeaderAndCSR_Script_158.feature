@Perf200
Feature: Review Cart - Page Header & CSR Script
	This feature is to validate the Review Cart - Page Header & CSR Script scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@ReviewCart_PageHeaderAndCSR_Script
@DWCACSR-158
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Review Your Cart header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
	Then Blue step script icon should be displayed next to [Review Your Cart] header in a page
	
Examples:
  | UsingData 									|
  | Perf_QA_Blue_step_script_icon_displays_ReviewCart	|		
  

@ReviewCart_PageHeaderAndCSR_Script
@DWCACSR-158
@Priority1
@2
Scenario Outline:modal window displays with the title 'To confirm your order' when CSR clicks on Blue step script icon:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on Blue step script icon in Review Cart page
    Then the modal window should be displayed with the title 'To confirm your order:'
    And the close button 'X' should be displayed in the top right corner of the [To confirm your order:] modal window
	
Examples:
  | UsingData 										|
  | Perf_QA_Blue_step_script_icon_modalWindow_ReviewCart	|		
  

@ReviewCart_PageHeaderAndCSR_Script
@DWCACSR-158
@Priority1
@3
Scenario Outline:Modal window disappered when CSR closes the To confirm your order modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on Blue step script icon in Review Cart page
    When CSR clicks on close button in [To confirm your order] modal window
	#Then [To confirm your order] modal window should be disappeared
	Then CSR is presented with the [Review Cart] page
	
Examples:
  | UsingData 													|
  | Perf_QA_Blue_step_script_icon_modalWindow_disappeared_ReviewCart	|
  
  		
      