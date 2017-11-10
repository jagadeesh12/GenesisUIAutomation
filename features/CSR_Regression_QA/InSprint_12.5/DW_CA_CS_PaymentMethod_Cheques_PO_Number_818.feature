@Perf200
Feature: Payment - Payment Method - Cheques - PO Number
	This feature is to validate the Payment - Payment Method - Cheques - PO Number Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

 
@PaymentMethod_PO
@DWCACSR-818
@Priority1
@1
Scenario Outline:PO Number and Scholastic mailing address section displays when CSR selects Cheques as Payment:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	Then PO Number text box displays
	And Scholastic mailing address section displays
	
Examples:
  | UsingData               			|
  | QA_PO_Number_Mailing_section_displays	|		
  

@PaymentMethod_PO
@DWCACSR-818
@Priority1
@2
Scenario Outline:Scholastic mailing address text displays correctly when CSR selects Cheques as Payment:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR selects Checks as payment
	Then Scholastic mailing address text displays correctly
	
Examples:
  | UsingData               		|
  | QA_Mailing_section_text_displays	|		
  

@PaymentMethod_PO
@DWCACSR-818
@Priority1
@3
Scenario Outline:CSR can enter up to 20 numbers in a PO Number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	When CSR enters [PO Number]
	Then [PO Number] field accepts the entered number and CSR can see it
	
Examples:
  | UsingData               	|
  | QA_CSR_enters_PONumber_20_nums	|
  
  
@PaymentMethod_PO
@DWCACSR-818
@Priority1
@4
Scenario Outline:CSR cannot enter more than 20 numbers in a PO Number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	When CSR enters more than 20 numbers in [PO Number] field
	Then [PO Number] field not accept the entered number
	
Examples:
  | UsingData               				|
  | QA_CSR_enters_PONumber_more_than_20_nums	|  	   
  
  