Feature: Redemptions & Rewards - Rewards Module – DTS Overcharge - Apply Taxes
	This feature is to validate the Redemptions & Rewards - Rewards Module – DTS Overcharge - Apply Taxes scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@1
Scenario Outline:CSR is charged GST & PST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST & PST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 									|
  | CSR_StudentItems_TopOff_GST_PST_Province_BC	|		
  

@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@2
Scenario Outline:CSR is charged GST & QST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST & QST are charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 									|
  | CSR_StudentItems_TopOff_GST_QST_Province_QC	|		
  

@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@3
Scenario Outline:CSR is charged HST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then HST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | CSR_StudentItems_TopOff_HST_Province_NL	|	
  | CSR_StudentItems_TopOff_HST_Province_NB	|	
  | CSR_StudentItems_TopOff_HST_Province_NS	|	
  | CSR_StudentItems_TopOff_HST_Province_ON	|	
  | CSR_StudentItems_TopOff_HST_Province_PE	|	
  	
  
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@4
Scenario Outline:CSR is charged GST for applicable provinces on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then GST is charged on the top off amount and post tax top off amount is added to Student club total
	
Examples:
  | UsingData 								|
  | CSR_StudentItems_TopOff_GST_Province_AB	|	
  | CSR_StudentItems_TopOff_GST_Province_MB	|	
  | CSR_StudentItems_TopOff_GST_Province_NT	|	
  | CSR_StudentItems_TopOff_GST_Province_NU	|	
  | CSR_StudentItems_TopOff_GST_Province_SK	|
  | CSR_StudentItems_TopOff_GST_Province_YT	|
  	
   
   
@Redemptions&Rewards_DTS_ApplyCharges
@DWCACSR-574
@Priority1
@5
Scenario Outline:CSR is not charged on top-off amount when only one item is selected from Dollars to Spend modal:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation] 
	And CSR selects the order type as [Phone Order] 
	And CSR navigates to Verify Account Page 
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount 
	And CSR navigates to Review Cart page from Order Entry page 
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page 
	And CSR sees the Dollars to Spend promotion
	And CSR clicks on [MAKE SELECTION] button
	And CSR selects a grade
	When CSR select the item such that the price of selected item is more than the coupon amount
	When CSR clicks Confirm Selection button
	Then No tax is charged on the top off amount and post tax top off amount is added to Student club total 
	
Examples:
  | UsingData 									|
  | CSR_StudentItems_noTax_TopOff_GST_Province	|   
  
  