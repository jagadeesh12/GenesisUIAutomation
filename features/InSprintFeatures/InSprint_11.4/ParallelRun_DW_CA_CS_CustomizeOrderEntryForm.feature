Feature: CSR_Customize order entry form for Canada
	This feature is to validate the Order Entry form Scenarios.

 
Background: 
	Given CSR opens the rco-scholastic web site

	
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
  | Two_layers_displays_CSR_enters_Order_Entry_page	|	
  
  
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
  | Two_tabs_displays_CSR_enters_Order_Entry_page	|	
  
    	
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
  | Student_Order_tab_disabled_CSR_enters_Order_Entry_page	|	
  
      
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority2
@4
Scenario Outline:Teacher Order tab is selected by default in the first layrer of the Order Entry module when CSR enters into the Order Entry page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Teacher Order tab should be selected in the first layer of Order Entry module
	
Examples:
  | UsingData                  								|
  | Teacher_Order_tab_selected_CSR_enters_Order_Entry_page	|	
      

@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@5
Scenario Outline:Three (3) horizontally aligned and the forms are present under Teacher Order tab in the second layrer of the Order Entry module:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	When CSR navigates to Order Entry Page
	Then Three horizontal forms should be present in the second layer of Order Entry module
	
Examples:
  | UsingData                  							|
  | Three_horizontal_forms_CSR_enters_Order_Entry_page	|	
      
      
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
  | Flyer_Code_entry_content_field_CSR_enters_Order_Entry_page	|	
      

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
  | Item_entry_content_field_CSR_enters_Order_Entry_page	|	
      
  
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
  | Form_expansion_button_CSR_enters_Order_Entry_page	|	
      

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
  | FLYER_CODE_label_CSR_enters_Order_Entry_page	|	
      

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
  | Placeholder_text_Fler_Code_field_CSR_enters_Order_Entry_page	|	
  
  
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
  | alphanumeric_in _the_Flyer_Code_entry_CSR_enters_Order_Entry_page	|	
  
    
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
  | Item_entry_label_CSR_enters_Order_Entry_page	|	
      
 
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
  | paid_qty_label_CSR_enters_Order_Entry_page	|	
      
 
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
  | Bonus_qty_label_CSR_enters_Order_Entry_page	|	
      

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
  | Eight_rows_CSR_enters_Order_Entry_page	|	
      

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
  | Three_textboxes_CSR_enters_Order_Entry_page	|	
      

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
  | Validation_of_Item_num_field_CSR_enters_Order_Entry_page	|	
      

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
  | CSR_enters_0_in_Paid_Qty	|	
  | CSR_enters_999_in_Paid_Qty	|	
  | CSR_enters_500_in_Paid_Qty	|	
      

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
  | CSR_enters_negative_value_in_Paid_Qty	|	 
  | CSR_enters_the_number_1000_in_Paid_Qty	|
  | CSR_enters_alphabets_in_Paid_Qty		|
  
  
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
  | Bonus_Qty_textboxes_disabled_CSR_enters_Order_Entry_page	|	
  
  
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
  | Form_expands_when_clicks_on_button_CSR_enters_Order_Entry_page	|	
  
       
@CustomizeOrderEntryForm
@DWCACSR-192
@Priority1
@24
Scenario Outline:Form expands with additional 8 rows in all 3 forms when CSR press the 'Tab' key and the cursor is in the last ‘accessible/enabled’ textbox within any of the 3 forms on that row:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And the cursor is in the last ‘accessible/enabled’ textbox within any of the 3 forms on that row
	When CSR press the [Tab] key
	Then the form should be expanded with additional Eight rows in all the 3 forms
	
Examples:
  | UsingData                  										|
  | Form_expands_when_perform_Tab_key_CSR_enters_Order_Entry_page	|	
  
      	                            