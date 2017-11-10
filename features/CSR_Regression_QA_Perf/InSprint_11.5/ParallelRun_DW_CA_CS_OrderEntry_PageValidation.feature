Feature: Order Entry - Page Validation
	This feature is to validate the Order Entry - Page Validation Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site


@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@1
Scenario Outline:CSR sees proper error message when on Teacher Module, the  flyer code entered has non alphanumeric characters:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the flyer code comprising special character and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
	
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCode_SpecialCharacter	|			
  
    
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@2
Scenario Outline:CSR sees error message on clicking [Proceed to Checkout] when Teacher order, Item# and Flyer is blank and QTY is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	When CSR enters ItemNo as blank and enters Paid QTY
	And CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter an item number' for Item Number field

Examples:
  | UsingData |
  | Perf_QA_CSR_enters_NoFlyerCode_NoItemno_enterQty|
  

@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@3
Scenario Outline:CSR sees error message when Teacher order,Valid flyer is entered ,more than one Item# cell is blank and Qty is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters 'Item#' and enters Paid QTY
	And CSR enters 'Item#' as blank and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter an item number' for blank Item Number

Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCode_EntersItemNo_BlankItemNo_enterQty|	
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@4
Scenario Outline:CSR sees error message pop-up when Teacher order, Item# entered  has one or more speical characters &QTY is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters 'Item#' with special character and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Ok] button
	And all the Invalid ItemNo will be displayed in the error popup
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCode_ItemNoSpecialCharacte_enterQty|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@5
Scenario Outline:CSR sees error message when Teacher order, Flyer code is left blank,Item# entered is single integer &QTY is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemSerialNo and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Continue] & [Cancel] buttons
	And all the Invalid ItemNo will be displayed in the error popup
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_NoFlyerCode_ItemSerialNo_QTY|

  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@6
Scenario Outline:CSR sees error message on entering the Invalid Flyer in the flyer text box for Teacher Order Module on tabing out:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the unlisted flyer code and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCodeIsNotValidFlyer	|	
    
    
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@7
Scenario Outline:CSR sees error message when less than 6 chars are entered in Flyer text box for Teacher Order Module on tab out:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the flyer code less than 6 charactes and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCodeLessThan6Characters	|	
  
 
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@8
Scenario Outline:CSR sees error message on entering the Flyer and tabing out. The flyer code entered is not active for the current month:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the flyer code which is not active for current month and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCodeNotValidforCurrentMonth	|	
   
   
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@10
Scenario Outline:CSR tries to enter the [Paid Qty] for Teacher Module, as 3 digit:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters ItemNo and enters Paid QTY as 3 digits
	Then System triggers a popup message 'Is this the correct number of items?' with [YES] and [NO] buttons
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_ValidItemNo_Qty3Digit|

  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@11
Scenario Outline:CSR seen an Error message when CSR enters Flyercode, Invalid ItemNo#,QTY is blank and click [Proceed Checkout]:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters ItemNo and enters Paid QTY as blank
	And CSR moves to 3rd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 4th row and enters Invalid-ItemNo and enters Paid QTY as blank
	When CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter a quantity' for Paid Qty field
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCode_ValidItemNo2_InvalidItemNo2_QtyBlank2|

  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@12
Scenario Outline:CSR sees the message [Is this the correct number of items] and clicks on [Yes]:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters ItemNo and enters Paid QTY of 3 Integers
	When CSR clicks on [Yes]
	Then the Call out message for Qty closes and CSR is on Order Entry page
	#And the [Paid Qty] value is retained
Examples:
  | UsingData |
  | Perf_QA_CSR_clicksYes_QtyCallOut|


@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@13
Scenario Outline:CSR sees error message when valid flyer code, multiple rows of Item# is entered with invalid item No and Qty:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemSerialNo and enters Paid QTY
	And CSR enters ItemSerialNo with special character and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	And all the Invalid ItemNo will be displayed in the error popup_2
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCode_ItemSerialNo_ItemSerialNoSpecialCharacter_ItemSerialNoString|

  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@14
Scenario Outline:CSR sees the message [Is this the correct number of items] and clicks on [No]:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters ItemNo and enters Paid QTY of 3 Integers
	When CSR clicks on [NO]
	Then the Call out message for Qty closes and CSR is on Order Entry page
	#And the [Paid Qty] value is cleared
Examples:
  | UsingData |
  | Perf_QA_CSR_clicksNo_QtyCallOut|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@15
Scenario Outline:Error message when valid flyer code, multiple rows of Item# is entered with invalid item No and Qty and rows with valid Item# and qty:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters ItemNo and enters Paid QTY
	And CSR moves to 3rd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 4th row and enters ItemNum and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Continue] & [Cancel] buttons
	And all the Invalid ItemNo will be displayed in the error popup_3
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_FlyerCode_ValidItemNo2_InvalidItemNo2_Qty|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority2
@16
Scenario Outline:CSR sees the message [Is this the correct number of items] and the message automatically disappears:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters ItemNo and enters Paid QTY of 3 Integers
	When CSR does not do any action on the webpage for 3 sec
	#Then Error call out automatically disappears

Examples:
  | UsingData |
  | Perf_QA_CSR_sees_errorMsg_2|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@17
Scenario Outline:Flyer code is not entered, multiple rows of Item# is entered with invalid item No and Qty. and valid Item# and qty is present:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters ItemNo and enters Paid QTY
	And CSR moves to 3rd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 4th row and enters Invalid-ItemNo and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Continue] & [Cancel] buttons
	And all the Invalid ItemNo will be displayed in the error popup_3_4
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_ValidItemNo2_InvalidItemNo2_Qty|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority2
@18
Scenario Outline:CSR sees the message [Flyer is Invalid ] and the message automatically disappears:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters invalid flyer code tab to move out of the flyer field
	When CSR does not do any action on the webpage for 3 sec
	Then Error call out automatically disappears

Examples:
  | UsingData |
  | Perf_QA_CSR_sees_err_msg_for_Flyer_is_Invalid|
    
    
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@19
Scenario Outline:CSR sees proper error message when the Row of valid item#,row with Invalid Item#,row with blank Item#:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 3rd row and enters ItemNo as blank and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter an item number' for Item Number field

Examples:
  | UsingData |
  | Perf_QA_CSR_enters_ValidItemNo_InvalidItemNo_ItemNoBlak_Qty|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority2
@20
Scenario Outline:CSR sees the message [You must enter an item Number] and the message automatically disappears:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo as blank and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter an item number' for Item Number field
	And CSR does not do any action on the webpage for 3 sec
	Then Error call out automatically disappears

Examples:
  | UsingData |
  | Perf_QA_CSR_sees_err_msg_You_must_enter_an_item_Number|  
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority2
@22
Scenario Outline:CSR sees the message [You must enter a Quantity ] and the message automatically disappears:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo and Paid Qty as blank
	And CSR clicks on [Proceed to Checkout]
	When CSR does not do any action on the webpage for 3 sec
	Then Error call out automatically disappears
Examples:
  | UsingData |
  | Perf_QA_CSR_sees_err_msg_You_must_enter_a_qty| 
  

@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@23
Scenario Outline:CSR sees [Invalid Items] popup and click on [Continue] Button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters InvalidItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR clicks on [Proceed to Checkout]
	#When CSR clicks on [Continue] button
	#Then Review cart page is displayed
	#And the Invalid ItemNo is not displayed
	#And the valid ItemNo is displayed on Review cart page
	Then Error message is displayed for missing flyer code

Examples:
  | UsingData |
  | Perf_QA_CSR_enters_NoFlyerCode_InvalidItemNo_ValidItemNo_QTY_ClickContinue|
   
   
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@24
Scenario Outline:CSR sees [Invalid Items] popup and click on [Cancel] Button:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters InvalidItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters ItemNo and enters Paid QTY
	And CSR clicks on [Proceed to Checkout]
	#When CSR clicks on [Cancel] button
	#Then Error message popup is closed
	#And CSR is back on the [Order Entry page]
	Then Error message is displayed for missing flyer code
Examples:
  | UsingData |
  | Perf_QA_CSR_enters_NoFlyerCode_InvalidItemNo_ValidItemNo_QTY_ClickCancel|
  
  

  
