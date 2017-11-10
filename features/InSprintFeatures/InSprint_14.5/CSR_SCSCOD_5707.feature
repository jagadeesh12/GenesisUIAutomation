Feature: Order Source - Modal – Order Cancellation Confirmation
	This feature is to validate the CSR Order Source - Modal – Order Cancellation Confirmation scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@1
Scenario Outline:Order Source page and Order Cancellation modal window displays when CSR clicks on Cancel Order in Order Entry:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on 'Cancel Order' and select [YES] option
	Then CSR will be redirected to the Order Source page
	And Order Cancellation modal window displays with the title 'Order Cancellation'
	And the close icon 'X' positioned at the top right of the window
	#And  two (2) paragraphs of text directed at the CSR to communicate to the Teacher-on-call
	
Examples:
  | UsingData 													|
  | InSprint14.5:CSR_redirects_to_OrderSource_page_OrderEntry	|
  

@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@2
Scenario Outline:Order Cancellation modal window closes automatically when CSR clicks on close button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR clicks on 'Cancel Order' and select [YES] option
	When CSR clicks on 'X' button in Order Cancellation modal window
	Then the modal window closes automatically
	
Examples:
  | UsingData 																		|
  | InSprint14.5:CSR_clicks_on_X_button_OrderCancellation_window_from_OrderEntry	|
  
@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@3
Scenario Outline:Order Cancellation modal window first paragraph of the text displays 'Your order was successfully cancelled.':[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on 'Cancel Order' and select [YES] option
	Then Order Cancellation modal window displays with the title 'Order Cancellation'
	And the first paragraph of the text displays 'Your order was successfully cancelled.'
	
Examples:
  | UsingData 													|
  | InSprint14.5:CSR_OrderCancellation_window_first_paragraph	|
  

@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@4
Scenario Outline:Order Source page and Order Cancellation modal window displays when CSR clicks on Cancel Order in Review Cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	When CSR clicks on 'Cancel Order' and select [YES] option
	Then CSR will be redirected to the Order Source page
	And Order Cancellation modal window displays with the title 'Order Cancellation'
	And the close icon 'X' positioned at the top right of the window
	And the first paragraph of the text displays 'Your order was successfully cancelled.'
	
Examples:
  | UsingData 														|
  | InSprint14.5:CSR_redirects_to_OrderSource_page_from_ReviewCart	|
  

@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@5
Scenario Outline:Order Cancellation modal window closes automatically when CSR clicks on close button_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR clicks on 'Cancel Order' and select [YES] option
	When CSR clicks on 'X' button in Order Cancellation modal window
	Then the modal window closes automatically
	
Examples:
  | UsingData 																		|
  | InSprint14.5:CSR_clicks_on_X_button_OrderCancellation_window_from_ReviewCart	|  
  
  
@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@6
Scenario Outline:Order Source page and Order Cancellation modal window displays when CSR clicks on Cancel Order in Rewards:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	When CSR clicks on 'Cancel Order' and select [YES] option
	Then CSR will be redirected to the Order Source page
	And Order Cancellation modal window displays with the title 'Order Cancellation'
	And the close icon 'X' positioned at the top right of the window
	And the first paragraph of the text displays 'Your order was successfully cancelled.'
	
Examples:
  | UsingData 													|
  | InSprint14.5:CSR_redirects_to_OrderSource_page_from_Rewards	|
  

@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@7
Scenario Outline:Order Cancellation modal window closes automatically when CSR clicks on close button_3:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR clicks on 'Cancel Order' and select [YES] option
	When CSR clicks on 'X' button in Order Cancellation modal window
	Then the modal window closes automatically
	
Examples:
  | UsingData 																	|
  | InSprint14.5:CSR_clicks_on_X_button_OrderCancellation_window_from_Rewards	| 
  
  
@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@8
Scenario Outline:Order Source page and Order Cancellation modal window displays when CSR clicks on Cancel Order in Payment:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR clicks on 'Cancel Order' and select [YES] option
	Then CSR will be redirected to the Order Source page
	And Order Cancellation modal window displays with the title 'Order Cancellation'
	And the close icon 'X' positioned at the top right of the window
	And the first paragraph of the text displays 'Your order was successfully cancelled.'
	
Examples:
  | UsingData 													|
  | InSprint14.5:CSR_redirects_to_OrderSource_page_from_Payment	|
  

@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@9
Scenario Outline:Order Cancellation modal window closes automatically when CSR clicks on close button_4:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR clicks on 'Cancel Order' and select [YES] option
	When CSR clicks on 'X' button in Order Cancellation modal window
	Then the modal window closes automatically
	
Examples:
  | UsingData 																	|
  | InSprint14.5:CSR_clicks_on_X_button_OrderCancellation_window_from_Payment	|      
  
  
@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@10
Scenario Outline:Order Source page and Order Cancellation modal window displays when CSR clicks on Cancel Order in Confirm Submit:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR clicks on 'Cancel Order' and select [YES] option
	Then CSR will be redirected to the Order Source page
	And Order Cancellation modal window displays with the title 'Order Cancellation'
	And the close icon 'X' positioned at the top right of the window
	And the first paragraph of the text displays 'Your order was successfully cancelled.'
	
Examples:
  | UsingData 													|
  | InSprint14.5:CSR_redirects_to_OrderSource_page_from_Submit	|
  

@OrderEntry
@Priority1
@SCSCOD-5707
@Sprint-14.5
@11
Scenario Outline:Order Cancellation modal window closes automatically when CSR clicks on close button_5:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	And CSR clicks on 'Cancel Order' and select [YES] option
	When CSR clicks on 'X' button in Order Cancellation modal window
	Then the modal window closes automatically
	
Examples:
  | UsingData 																	|
  | InSprint14.5:CSR_clicks_on_X_button_OrderCancellation_window_from_Submit	|    
  
      