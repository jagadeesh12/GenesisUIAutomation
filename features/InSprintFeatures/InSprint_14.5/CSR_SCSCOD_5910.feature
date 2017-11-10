Feature: Verify Account – Order History – Modify Order – Indicator
	This feature is to validate the Verify Account – Order History – Modify Order – Indicator scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@VerifyAccount
@ModifyOrder
@SCSCOD-5910
@Sprint-14.5
@Priority1
@1
Scenario Outline:CSR is presented with a hyperlink labeled 'Modify Order' to the right of the previously generated order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	And CSR submit the order
	And CSR closes the Order confirmation popUp window
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then CSR is presented with a hyperlink labeled 'Modify Order' to the right of the previously generated order
	
Examples:
  | UsingData 									|
  | InSprint14.5:CSR_sees_hyperlink_ModifyOrder	|		
  

@VerifyAccount
@ModifyOrder
@SCSCOD-5910
@Sprint-14.5
@Priority1
@2
Scenario Outline:CSR is redirected to the review cart page displays correct Flyer code, item number and quantity:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	And CSR submit the order
	And CSR closes the Order confirmation popUp window
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR clicks on 'Modify Order' hyperlink
	Then Review Cart page displays
	And entered Flyer code, Item number and item quantity displays correctly
	
Examples:
  | UsingData 									|
  | InSprint14.5:CSR_sees_hyperlink_ModifyOrder	|		
  

@VerifyAccount
@ModifyOrder
@SCSCOD-5910
@Sprint-14.5
@Priority1
@3
@Manual
Scenario Outline:CSR is not presented with a hyperlink labeled 'Modify Order' to the right of the previously generated order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	And CSR submit the order
	And CSR closes the Order confirmation popUp window
	And CSR wait for 15 to 20 min's to run the AS400 to pick the orders
	And CSR selects the order type as [Phone Order]
	When CSR navigates to Verify Account Page
	Then CSR is not presented with a hyperlink labeled 'Modify Order' to the right of the previously generated order
	
Examples:
  | UsingData 										|
  | InSprint14.5:CSR_not_see_hyperlink_ModifyOrder	|	
  
  
#@VerifyAccount
#@ModifyOrder
#@SCSCOD-5910
#@Sprint-14.5
#@Priority1
#@4
#Scenario Outline:CSR is able to modify and submit the order by clicking on Modify Order in Locate Account page Order History:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	And CSR adds Student Clubs items to the cart
#	And CSR navigates to Review Cart page from Order Entry page
#	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#	And CSR navigates to [Payment] page from [Redeem & Rewards] page
#	And CSR navigates to [Confirm & Submit] page from [Payment] page
#	And CSR submit the order
#	And CSR closes the Order confirmation popUp window
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR clicks on 'Modify Order' hyperlink
#	And CSR modify the order in Order Entry page
#	And CSR navigates to Review Cart page from Order Entry page
#	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#	And CSR navigates to [Payment] page from [Redeem & Rewards] page
#	And CSR navigates to [Confirm & Submit] page from [Payment] page
#	When CSR submit the order
#	Then CSR sees the Order Confirmation modal window in Source page
#	
#Examples:
#  | UsingData 												|
#  | InSprint14.5:CSR_sees_order_confirmation_ModifyOrder	|		
    	
  