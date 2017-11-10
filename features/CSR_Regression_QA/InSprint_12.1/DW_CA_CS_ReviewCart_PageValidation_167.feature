Feature: Review Cart - Page Validation
	This feature is to validate the Review Cart - Page Validation scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart_PageValidation
@DWCACSR-167
@Priority1
@1
Scenario Outline:CSR cannot proceed to 'Rewards and Coupons' if there is an item line-item with a quantity of zero:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR changes the item quantity to zero and perform tab to move out of the field
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then [Rewards & Coupons] page should not be displayed
	
Examples:
  | UsingData 							|
  | QA_CSR_cannot_proceed_to_the_5th_step	|			
  

@ReviewCart_PageValidation
@DWCACSR-167
@Priority1
@2
Scenario Outline:CSR cannot proceed to 'Rewards and Coupons' if there is an item line item with a quantity of zero_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR changes the item quantity to zero and perform tab to move out of the field
    #When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then CSR is presented with the callout message with the text 'Delete this item' and the buttons [YES] [NO]
	
Examples:
  | UsingData 								|
  | QA_CSR_cannot_proceed_to_RewardsCoupons	|			
  
  