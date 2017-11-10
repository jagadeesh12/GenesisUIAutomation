Feature: Order Entry
	This feature is to validate the Order Entry page scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
#@OrderEntry-StartOrderProcess
#@DWCACSR-154
#@Priority1
#@1
#Scenario Outline:Verify Account page displays when CSR selects Continue To Verify Account in Locate Account page:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	When CSR selects [Continue To Verify Account] in Locate Account page
#	Then [Verify Account] page should be displayed
#	
#Examples:
#  | UsingData                  							|
#  | QA_CSR_enters_Locate_Account_to_Verify_Account_page	|		
  
    
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@2
Scenario Outline:Order Entry page displays when CSR selects Continue To Order Entry in Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] page should be displayed
	
Examples:
  | UsingData                  						|
  | QA_CSR_enters_Verify_Account_to_OrderEntry_page	|		
  
 
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@3
Scenario Outline:Order Entry tab highlights when CSR selects Continue To Order Entry in Verify Account page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then [Order Entry] tab should be highlighted
	
Examples:
  | UsingData                  	|
  | QA_Order_Entry_tab_highlights	|		
  
  
  
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority1
@4
Scenario Outline:Order Entry Form displays to enter the details for the Teacher’s order request:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR selects [Continue To Order Entry] in Verify Account page
	Then Teacher [Order Entry] form should be displayed
	
Examples:
  | UsingData                  						|
  | QA_Order_Entry_form_displays_in_Order_Entry_page	|		
  
 
@OrderEntry-StartOrderProcess
@DWCACSR-154
@Priority2
@5
Scenario Outline:CSR is presented with a button ‘Proceed to Checkout’ positioned in the footer region of the ‘Order Entry’ page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then [Proceed To Checkout] button should be displayed
	
Examples:
  | UsingData                  								|
  | QA_Proceed_To_Checkout_button_displays_Order_Entry_page	|		
  

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@1
Scenario Outline:Two layers displays when CSR enters into the Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Two layers should be displayed in Order Entry module
	
Examples:
  | UsingData                  						|
  | QA_Two_layers_displays_CSR_enters_Order_Entry_page	|	
  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@2
Scenario Outline:Two tabs displays in the first layrer of the Order Entry module when CSR enters into the Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Two tabs should be displayed in the first layer of Order Entry module
	
Examples:
  | UsingData                  						|
  | QA_Two_tabs_displays_CSR_enters_Order_Entry_page	|	
  
    	
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@3
Scenario Outline:Student Order tab disabled in the first layrer of the Order Entry module when CSR enters into the Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Student Order tab should be disabled in the first layer of Order Entry module
	
Examples:
  | UsingData                  								|
  | QA_Student_Order_tab_disabled_CSR_enters_Order_Entry_page	|	
  
      
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@4
Scenario Outline:Teacher Order tab is selected by default in the first layer of the Order Entry module in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Teacher Order tab should be selected in the first layer of Order Entry module
	
Examples:
  | UsingData                  								|
  | QA_Teacher_Order_tab_selected_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@5
Scenario Outline:Three horizontally aligned and the forms are present under Teacher Order tab in the second layrer of the Order Entry module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Three horizontal forms should be present in the second layer of Order Entry module
	
Examples:
  | UsingData                  							|
  | QA_Three_horizontal_forms_CSR_enters_Order_Entry_page	|	
      
      
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@6
Scenario Outline:Flyer Code entry content field displays in the flyer form of the Order Entry module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Flyer Code entry content field should be displayed in the Order Entry module
	
Examples:
  | UsingData                  									|
  | QA_Flyer_Code_entry_content_field_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@7
Scenario Outline:Items entry content field displays in the flyer form of the Order Entry module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Items entry content field should be displayed in the Order Entry module
	
Examples:
  | UsingData                  								|
  | QA_Item_entry_content_field_CSR_enters_Order_Entry_page	|	
      
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@8
Scenario Outline:Form expansion button displays in the flyer form of the Order Entry module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Form expansion button should be displayed in the Order Entry module
	
Examples:
  | UsingData                  							|
  | QA_Form_expansion_button_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@9
Scenario Outline:FLYER CODE label displays for the Flyer code entry field layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then the label of the Flyer Code entry field should be displayed as 'FLYER CODE #'
	
Examples:
  | UsingData                  						|
  | QA_FLYER_CODE_label_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@10
Scenario Outline:Placeholder text displays within the Flyer Code entry field text box:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then the Placeholder text should be displayed within the Flyer Code entry field text box
	
Examples:
  | UsingData                  										|
  | QA_Placeholder_text_Fler_Code_field_CSR_enters_Order_Entry_page	|	
  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@11
Scenario Outline:CSR enters the alphanumeric in the Flyer Code entry field text box:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the Flyer code
	Then the Flyer Code field should accept the entered Flyer code
	#Then the Flyer items should be added to the cart
	
Examples:
  | UsingData                  											|
  | QA_alphanumeric_in _the_Flyer_Code_entry_CSR_enters_Order_Entry_page	|	
  
    
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@14
Scenario Outline:'Item #' label displays in the Item Entry layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then the header of the first column entry should be displayed as 'Item #'
	
Examples:
  | UsingData                  						|
  | QA_Item_entry_label_CSR_enters_Order_Entry_page	|	
      
 
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@15
Scenario Outline:'Paid QTY.' label displays in the Item Entry layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then the header of the second column entry should be displayed as 'Paid QTY.'
	
Examples:
  | UsingData                  					|
  | QA_paid_qty_label_CSR_enters_Order_Entry_page	|	
      
 
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@16
Scenario Outline:'Bonus QTY.' label displays in the Item Entry layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then the header of the third column entry should be displayed as 'Bonus QTY.'
	
Examples:
  | UsingData                  					|
  | QA_Bonus_qty_label_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@17
Scenario Outline:Eight rows displays under the header in Item Entry layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Eight rows should be displayed under the header in Item Entry layer of the form
	
Examples:
  | UsingData                  				|
  | QA_Eight_rows_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@18
Scenario Outline:Three textboxes displays in each row in Item Entry layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Three textboxes should be displayed in each row in Item Entry layer of the three forms
	
Examples:
  | UsingData                  					|
  | QA_Three_textboxes_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@19
Scenario Outline:CSR can enter from 1 to 6 digit number in Item number field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters Item number in a [Item number] field
	Then Item number field should accept the entered item number
	
Examples:
  | UsingData                  									|
  | QA_Validation_of_Item_num_field_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@20
Scenario Outline:CSR can enter only the values within the range of 0 – 999 in Paid Qty field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the quantity in [PAID QTY] field
	Then the [PAID QTY] field accepts the entered paid quantity number
	
Examples:
  | UsingData                  	|
  | QA_CSR_enters_0_in_Paid_Qty	|	

  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@20
Scenario Outline:CSR can enter only the values within the range of 0 – 999 in Paid Qty field_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the quantity in [PAID QTY] field
	Then the [PAID QTY] field accepts the entered paid quantity number
	
Examples:
  | UsingData                  	|
  | QA_CSR_enters_999_in_Paid_Qty	|	

  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@20
Scenario Outline:CSR can enter only the values within the range of 0 – 999 in Paid Qty field_3:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the quantity in [PAID QTY] field
	Then the [PAID QTY] field accepts the entered paid quantity number
	
Examples:
  | UsingData                  	|	
  | QA_CSR_enters_500_in_Paid_Qty	|    	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@21
Scenario Outline:Paid Qty field doesn't allow when CSR enter values other than the range of 0 – 999 in Paid Qty field:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the quantity in [PAID QTY] field
	Then the [PAID QTY] field should not accept the entered paid quantity number
	
Examples:
  | UsingData                  				|
  | QA_CSR_enters_negative_value_in_Paid_Qty	|	 

  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@21
Scenario Outline:Paid Qty field doesn't allow when CSR enter values other than the range of 0 – 999 in Paid Qty field_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the quantity in [PAID QTY] field
	Then the [PAID QTY] field should not accept the entered paid quantity number
	
Examples:
  | UsingData                  				| 
  | QA_CSR_enters_the_number_1000_in_Paid_Qty	|

  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@21
Scenario Outline:Paid Qty field doesn't allow when CSR enter values other than the range of 0 – 999 in Paid Qty field_3:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the quantity in [PAID QTY] field
	Then the [PAID QTY] field should not accept the entered paid quantity number
	
Examples:
  | UsingData                  				|
  | QA_CSR_enters_alphabets_in_Paid_Qty		|    
  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@22
Scenario Outline:Bonus Qty textboxes are disabled in the Item Entry Layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then the [BONUS QTY] textboxes should be disabled
	
Examples:
  | UsingData                  									|
  | QA_Bonus_Qty_textboxes_disabled_CSR_enters_Order_Entry_page	|	
  
  
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@23
Scenario Outline:Form expands with additional 8 rows in all 3 forms when CSR clicks on '+' button in the Item Entry Layer of the form:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on '+' button in the Item Entry Layer of the form
	Then the form should be expanded with additional Eight rows in all 3 forms
	
Examples:
  | UsingData                  										|
  | QA_Form_expands_when_clicks_on_button_CSR_enters_Order_Entry_page	|	
  
       
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@24
Scenario Outline:Form expands with additional 8 rows in all 3 forms when CSR press the 'Tab' key within any of the 3 forms on that row:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And the cursor is in the last ‘accessible/enabled’ textbox within any of the 3 forms on that row
	When CSR press the [Tab] key
	Then the form should be expanded with additional Eight rows in all the 3 forms
	
Examples:
  | UsingData                  										|
  | QA_Form_expands_when_perform_Tab_key_CSR_enters_Order_Entry_page	|	
  

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
  | QA_CSR_enters_FlyerCode_SpecialCharacter	|			
  
    
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@2
Scenario Outline:CSR sees proper error message on clicking [PTC] when Teacher order, Item# and Flyer code is blank and QTY is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters ItemNo as blank and enters Paid QTY
	And CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter an item number' for Item Number field

Examples:
  | UsingData |
  | QA_CSR_enters_NoFlyerCode_NoItemno_enterQty|
  

@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@3
Scenario Outline:Sees error message on clicking [PTC] when Valid flyer is entered more than one Item# cell is blank and Qty is entered:[<UsingData>]
	
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
  | QA_CSR_enters_FlyerCode_EntersItemNo_BlankItemNo_enterQty|	
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@4
Scenario Outline:Sees error message pop-up on clicking [PTC] when Item# entered has one or more speical characters &QTY is entered:[<UsingData>]
	
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
  | QA_CSR_enters_FlyerCode_ItemNoSpecialCharacte_enterQty|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@5
Scenario Outline:Sees error message pop-up on clicking [PTC] when Flyer code is left blank,Item# entered is single integer &QTY is entered:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters ItemSerialNo and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Continue] & [Cancel] buttons
	And all the Invalid ItemNo will be displayed in the error popup
Examples:
  | UsingData |
  | QA_CSR_enters_NoFlyerCode_ItemSerialNo_QTY|

  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@6
Scenario Outline:CSR sees error message on entering the Invalid Flyer code in the flyer text box for Teacher Order Module on tabing out:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the unlisted flyer code and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
Examples:
  | UsingData |
  | QA_CSR_enters_FlyerCodeIsNotValidFlyer	|	
    
    
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@7
Scenario Outline:CSR sees error message when less than 6 characters are entered in Flyer code text box for Teacher Order Module on tab out:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the flyer code less than 6 charactes and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
Examples:
  | UsingData |
  | QA_CSR_enters_FlyerCodeLessThan6Characters	|	
  
 
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@8
Scenario Outline:CSR sees error message on entering the Flyer code and tabing out from Flyer code for Teacher Order Module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR enters the flyer code which is not active for current month and tab to move out of the flyer field
	Then Error message is displayed for in-valid flyer code
Examples:
  | UsingData |
  | QA_CSR_enters_FlyerCodeNotValidforCurrentMonth	|	
   
   
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
  | QA_CSR_enters_ValidItemNo_Qty3Digit|

  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@11
Scenario Outline:CSR seen an Error message when CSR enters Flyercode, Invalid ItemNo#,QTY is blank and click [Proceed Checkout]:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters ItemNo and enters Paid QTY as blank
	And CSR moves to 3rd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 4th row and enters Invalid-ItemNo and enters Paid QTY as blank
	When CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter a quantity' for Paid Qty field
Examples:
  | UsingData |
  | QA_CSR_enters_FlyerCode_ValidItemNo2_InvalidItemNo2_QtyBlank2|

  
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
  | QA_CSR_clicksYes_QtyCallOut|


@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@13
Scenario Outline:CSR sees error message pop-up on clicking [PTC] when flyer, multiple items# is entered with invalid item and Qty:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR enters the flyer code and tab to move out of the flyer field
	And CSR enters ItemSerialNo and enters Paid QTY
	And CSR enters ItemSerialNo with special character and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Continue] & [Cancel] buttons
	And all the Invalid ItemNo will be displayed in the error popup_2
Examples:
  | UsingData |
  | QA_CSR_enters_FlyerCode_ItemSerialNo_ItemSerialNoSpecialCharacter_ItemSerialNoString|

  
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
  | QA_CSR_clicksNo_QtyCallOut|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@15
Scenario Outline:CSR sees error msg pop-up on clicking [PTC] with invalid item No and Qty and also rows with valid Item# and qty is present:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
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
  | QA_CSR_enters_FlyerCode_ValidItemNo2_InvalidItemNo2_Qty|
  
  
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
  | QA_CSR_sees_errorMsg_2|
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@17
Scenario Outline:CSR sees error message pop-up on clicking [PTC] with invalid item No and Qty and also rows with valid Item# and qty is present:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters ItemNo and enters Paid QTY
	And CSR moves to 3rd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 4th row and enters Invalid-ItemNo and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Continue] & [Cancel] buttons
	And all the Invalid ItemNo will be displayed in the error popup_3_4
Examples:
  | UsingData |
  | QA_CSR_enters_ValidItemNo2_InvalidItemNo2_Qty|
  
  
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
  | QA_CSR_sees_err_msg_for_Flyer_is_Invalid|
    
    
@OrderEntry-PageValidation
@DWCACSR-116
@Priority1
@19
Scenario Outline:CSR sees error message pop-up on clicking [PTC] when Row of valid item#,row with Invalid Item#,row with blank Item#:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR enters ItemNo and enters Paid QTY
	And CSR moves to 2nd row and enters Invalid-ItemNo and enters Paid QTY
	And CSR moves to 3rd row and enters ItemNo as blank and enters Paid QTY
	When CSR clicks on [Proceed to Checkout]
	Then the error message should be displayed as 'You must enter an item number' for Item Number field

Examples:
  | UsingData |
  | QA_CSR_enters_ValidItemNo_InvalidItemNo_ItemNoBlak_Qty|
  
  
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
  | QA_CSR_sees_err_msg_You_must_enter_an_item_Number|  
  
  
@OrderEntry-PageValidation
@DWCACSR-116
@Priority2
@22
Scenario Outline:CSR sees the message [You must enter a Quantity ] and the message automatically disappears:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR enters ItemNo and Paid Qty as blank
	And CSR clicks on [Proceed to Checkout]
	When CSR does not do any action on the webpage for 3 sec
	Then Error call out automatically disappears
Examples:
  | UsingData |
  | QA_CSR_sees_err_msg_You_must_enter_a_qty| 
  

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
	#Then Error message is displayed for missing flyer code
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Ok] button

Examples:
  | UsingData |
  | QA_CSR_enters_NoFlyerCode_InvalidItemNo_ValidItemNo_QTY_ClickContinue|
   
   
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
	#Then Error message is displayed for missing flyer code
	Then the Error message pop-up should be displayed with the title as [Invalid Items] and the [Ok] button
Examples:
  | UsingData |
  | QA_CSR_enters_NoFlyerCode_InvalidItemNo_ValidItemNo_QTY_ClickCancel|
  
  
@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@1
Scenario Outline:Step header text 'Enter New Order' displays in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	Then the step header should have the text 'Enter New Order'
	
Examples:
  | UsingData 							|
  | QA_Enter_New_Order_text_OrderEntryPage	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@2
Scenario Outline:CSR should see a blue step script icon beside the Verify Account header in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	Then CSR should see a blue step script icon beside the Verify Account header
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_blue_step_script_icon	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@3
Scenario Outline:Order Entry Script displays when CSR clicks on blue step script icon in Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on blue step script icon in Order Entry page
	Then [Order Entry Script] popup should be displayed
	#And correct text should be displayed in the popup
	
Examples:
  | UsingData 					|
  | QA_CSR_sees_Order_Entry_Script	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@4
Scenario Outline:close btn 'X' displays in the top right corner of the modal window in Order Entry Script modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR clicks on blue step script icon in Order Entry page
	Then the close button 'X' should be displayed in the top right corner of the modal window
	
Examples:
  | UsingData 											|
  | QA_CSR_sees_close_btn_in_OrderEntryScript_modal_window	|			
  

@OrderEntry_HeaderAndStepScript
@DWCACSR-109
@Priority1
@5
Scenario Outline:Verify Account page displays when CSR clicks on close btn 'X' in Order Entry Script modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR clicks on blue step script icon in Order Entry page
	When CSR clicks on close button in Order Entry Script modal window
	Then [Order Entry] page should be displayed
	
Examples:
  | UsingData 												|
  | QA_Verify_Account_page_displays_when_CSR_closes_the_window	|			
  
      