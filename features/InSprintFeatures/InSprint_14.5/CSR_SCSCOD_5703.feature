Feature: Order Entry - Teacher Orders - Accept Unique Item Numbers
	This feature is to validate the CSR Order Entry - Teacher Orders - Accept Unique Item Numbers scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@1
Scenario Outline:CSR has the ability to enter a set of alphanumeric characters for a given unique item number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters unique item number which is a set of alphanumeric characters
	Then the item number field accepts the alphanumeric characters
	
Examples:
  | UsingData 										|
  | InSprint15.1:CSR_enters_alphanumeric_characters	|
  

@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@2
Scenario Outline:CSR can enter maximum of 6 characters in item number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters 6 characters of unique item number
	Then the item number field accepts the entered value
	
Examples:
  | UsingData 								|
  | InSprint15.1:CSR_enters_6_characters	|
  

@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@3
Scenario Outline:CSR cannot enter more than 6 characters in item number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters more than 6 characters in item number field
	Then the item number field should not accept the entered value
	
Examples:
  | UsingData 								|
  | InSprint15.1:CSR_enters_7_characters	|
  

@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@4
Scenario Outline:Modal window invalid Items displays when CSR enters Flyer code and Unique item number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code
	And CSR enters the unique item number and qty
	When CSR clicks on [Proceed To CheckOut]
	Then the modal window displays with the text 'Invalid Items'
	And the unique item numbers listed in the modal window
	
Examples:
  | UsingData 										|
  | InSprint15.1:CSR_enters_Flyer_code_Unique_item	|


@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@5
Scenario Outline:Error message displays to enter a quantity when CSR doesn't enter a quantity:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code
	And CSR enters the unique item number and doesn't enter the quantity
	When CSR clicks on [Proceed To CheckOut]
	Then the error message displays to enter the quantity
	
Examples:
  | UsingData 							|
  | InSprint15.1:CSR_does_not_enter_QTY	|
  
  
@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@6
Scenario Outline:Error message displays for item number field when CSR doesn't enter the unique item number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the Flyer code
	And CSR enters the quantity and doesn't enter the unique item number
	When CSR clicks on [Proceed To CheckOut]
	Then the error message displays to enter the item number
	
Examples:
  | UsingData 										|
  | InSprint15.1:CSR_does_not_enter_unique_item_no	|  
  
  
@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@7
Scenario Outline:CSR should be able to proceed to the next step of the process when he doesn't enter Flyer code:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR doesn't enter the Flyer code
	And CSR enters the unique item number and qty
	When CSR clicks on [Proceed To CheckOut]
	Then Review cart page displays and CSR should be able to proceed to the next steps
	
Examples:
  | UsingData 									|
  | InSprint15.1:CSR_enters_Unique_item_and_Qty	|
  

@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@8
Scenario Outline:Error message displays when CSR doesn't enter the quantity in Qty field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR doesn't enter the Flyer code
	And CSR enters the unique item number and doesn't enter the quantity
	When CSR clicks on [Proceed To CheckOut]
	Then the error message displays to enter the quantity
	
Examples:
  | UsingData 										|
  | InSprint15.1:CSR_enters_Unique_item_and_No_Qty	| 
  
  
@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@9
Scenario Outline:Error message displays for item number when CSR enters only quantity:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR doesn't enter the Flyer code
	And CSR enters the quantity and doesn't enter the unique item number
	When CSR clicks on [Proceed To CheckOut]
	Then the error message displays to enter the item number
	
Examples:
  | UsingData 										|
  | InSprint15.1:CSR_enters_Qty_and_No_Unique_item	|    


@OrderEntry
@Priority1
@SCSCOD-5703
@Sprint-15.1
@10
Scenario Outline:CSR should be able to proceed to the next step of the process when he enters items from diff Flyers:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR doesn't enter the Flyer code
	And CSR enters unique item numbers from different Flyer codes and Qty
	When CSR clicks on [Proceed To CheckOut]
	Then Review cart page displays and CSR should be able to proceed to the next steps
	
Examples:
  | UsingData 												|
  | InSprint15.1:CSR_enters_Unique_items_from_diff_Flyers	|    


#@OrderEntry
#@Priority1
#@SCSCOD-5703
#@Sprint-15.1
#@11
#Scenario Outline:Error messages displays if CSR doesn't enter Flyer code and item number:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	And CSR doesn't enter the Flyer code
#	And CSR enters the quantity and doesn't enter the unique item number
#	When CSR clicks on [Proceed To CheckOut]
#	Then the error message displays to enter the Flyer code
#	When CSR enters the Flyer code
#	And CSR clicks on [Proceed To CheckOut]
#	Then the error message displays to enter the item number
#	When CSR enters the unique item number
#	And CSR clicks on [Proceed To CheckOut]
#	Then the modal window displays with the text 'Invalid Items'
#	And the unique item numbers listed in the modal window
#	
#Examples:
#  | UsingData 							|
#  | InSprint15.1:CSR_enters_only_Qty	|    

