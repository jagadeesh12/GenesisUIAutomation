Feature: Auto-FreeShipping
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site



##################################################################################################################################################        
##################################################################################################################################################  
###########################################   		             	                 #############################################################  
###########################################   		SHIPPING             	         #############################################################  
###########################################   		                     	         #############################################################        
##################################################################################################################################################        
##################################################################################################################################################  

@Golden
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher recieves Free shipping on a cart with order total greater than or equal to Shipping threshold on Teacher and Student club orders:[<UsingData>]
		
		
Given teacher login into the application by providing [UserInformation]
When teacher adds items to cart equal to the [shipping threshold]
And teacher navigates to coupons & Rewards page
Then teacher receives FREE shipping

Examples: 
|UsingData|
|Golden:Teacher_FREEshipping_greaterthan_Shipping_Threshold|
	
	
	
@Golden
@Auto-FreeShipping
@Priority1	
@LocalRun
Scenario Outline:Teacher recieves Paid shipping on a cart with order total less than the Shipping threshold on Teacher and Student club orders:[<UsingData>]
		
		
Given teacher login into the application by providing [UserInformation]
When teacher add items to cart less than the [shipping threshold]
And teacher navigates to coupons & Rewards page
Then teacher does not receive free Shipping

Examples: 
|UsingData|
|Golden:Teacher_charged_ShippingFee_lessthan_Shipping_Threshold|
	
	
	
	
@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged GST & PST on the shipping fee:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, GST, PST and Shipping & Handling Total displays in Shipping & Handling section
   
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_BC |
  
  
  
@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged GST & QST on the shipping fee:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, GST, QST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_QC |
  
  
@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NL' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NL |
  
  
@Golden
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher is charged HST on the shipping fee against 'NS' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NS |
  
  
  
@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged HST on the shipping fee against 'NB' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_NB |
  
  
  
@Golden
@Auto-FreeShipping
@Priority1	
Scenario Outline:Teacher is charged HST on the shipping fee against 'ON' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_ON |
  
  
  
  
  @Golden
@Auto-FreeShipping	
@Priority1
Scenario Outline:Teacher is charged HST on the shipping fee against 'PE' Province in Coupons and Rewards page:[<UsingData>]

   Given teacher login into the application by providing [UserInformation]
   When teacher add items to cart less than the [shipping threshold]
   And teacher navigates to coupons & Rewards page
   Then [Shipping Fee] displays in Shipping & Handling blue header
   And Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section
Examples:
  | UsingData                                               |
  | Golden:Teacher_charged_taxes_onshippingfee_basedon_province_PE |
  
  
  
  
@Golden
@Auto-FreeShipping
@Priority1
Scenario Outline:Teacher still receive Free Shipping if redemptions from Student Bonus coupon makes the cart non-qualifying:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher add items to cart less than the [shipping threshold]
	And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	When teacher enters amount in [student bonus dollar] resulting in cart total fall below [shipping threshold]
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Golden:Teacher_FREEshipping_Redemption_lessthan_Shipping_Threshold|                                  



#########################       SHIPPING PRIORITY2 SCENARIOS             #######################################	
	
	
	
@Auto-FreeShipping
@Priority2
Scenario Outline:Teacher add more items to cart resulting in Free Shipping:[<UsingData>]
		
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds Student club items to cart less than the [Manual shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher does not receive free Shipping
	And teacher navigates to Review Your cart page from Coupons & Rewards page
    When teacher adds more items to cart meeting the [shipping threshold]
    And teacher navigates to coupons & Rewards page
    Then teacher receives FREE shipping
	
	Examples: 
	|UsingData|
	|Teacher_AddMoreItems_ShippingFee_lessthan_Shipping_Threshold|
	
	
	
@Auto-FreeShipping
@Priority2
Scenario Outline:Teacher deletes items from cart resulting in paid shipping:[<UsingData>]
		
	Given teacher login into the application by providing [UserInformation]
	And teacher adds items to cart equal to the [shipping threshold]
    And teacher navigates to coupons & Rewards page
	And teacher receives FREE shipping
	And teacher navigates to Review Your cart page from Coupons & Rewards page
    When teacher deletes items from cart resulting in cart total fall below [shipping threshold]
    And teacher navigates to coupons & Rewards page
    Then teacher does not receive free Shipping
	
	Examples: 
	|UsingData|
	|Teacher_DeletesItems_FREEshipping_greaterthan_Shipping_Threshold|
	