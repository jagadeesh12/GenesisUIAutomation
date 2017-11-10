Feature: Confirm & Submit - Order Detail Module
	This feature is to validate the Confirm & Submit - Order Detail Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit_OrderDetail
@DWCACSR-328
@Priority1
@Manual
@1
Scenario Outline:CSR sees the correct labels for the ORDER DETAIL section and module in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs and Teacher Catalogues items to the cart without qualifying minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then CSR sees 2 layes : [Order Detail] & [Module details]
	And the label displays 'ORDER DETAIL' for the header of the Order Detail section
	And the label displays 'STUDENT CLUBS' for the Student Clubs items section in the Module details layer
	And the label displays 'TEACHER CATALOGUES' for the Teacher Catalogues items section in the Module details layer
	And the label displays 'SHIPPING & HANDLING' for the Shipping & Handling section in the Module details layer

Examples:
  | UsingData 										|
  | CSR_sees_OrderDetail_module_ConfirmSubmit_page	|		
  

      