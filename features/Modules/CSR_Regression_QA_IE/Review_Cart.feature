Feature: Review Cart
	This feature is to validate the Review Cart page scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site

	
@ReviewCart-StepHeader
@DWCACSR-157
@Priority1
@1
Scenario Outline:Review Cart tab highlights when CSR enters into the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR navigates to Review Cart Page
	Then [Review Cart] tab should be highlighted
	
Examples:
  | UsingData                  	|
  | QA_ReviewCart_tab_highlights	|		
  

@ReviewCart-StepHeader
@DWCACSR-157
@Priority1
@2
Scenario Outline:Number of the Review Cart page displays in a bubble containing step header:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	When CSR navigates to Review Cart Page
	Then the step header number for the page in a highlighted tab should be displayed correctly
	
Examples:
  | UsingData                  		|
  | QA_Number_for_the_ReviewCart_tab	|		


@CSR_ReviewCart @Priority2  @DWCACSR-163
Scenario Outline: As a CSR, I am presented with expanded Teacher catalogue table when landed on Review cart page:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher catalogues table is expanded by default with the added item information displayed
	Examples:
      | UsingData                         |
      | QA_Teacher_Catalogue_ExpandbyDefault |


@CSR_ReviewCart @Priority3  @DWCACSR-163 
Scenario Outline:Teacher Catalogues table is not displayed when there are no teacher catalogue items added to cart:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds student club items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    #Then Teacher catalogues table is not displayed
    Examples:
      | UsingData           |
      | QA_NoTeacher_Catalogue |


@CSR_ReviewCart @Priority3  @DWCACSR-163 
Scenario Outline:CSR can click contract - to hide the Teacher catalogues table:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on '-' next to 'Your Teacher Order – Teacher Catalogues' label
    Then Teacher Catalogues table is hidden or contracted showing '+' sign and label 'Your Teacher Order – Teacher Catalogues'
    
    Examples:
      | UsingData                        |
      | QA_Contracted_TeacherCatalogueTable |


@CSR_ReviewCart @Priority3  @DWCACSR-163 
Scenario Outline:CSR can click expand + to show the Teacher catalogue table:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on '-' to hide the Teacher Catalogue table
    When CSR clicks on '+' next to 'Your Teacher Order – Teacher Catalogue' label
    Then Teacher Catalogue table is expanded with items displayed and shows '-' sign
    
    Examples:
      | UsingData                      |
      | QA_Expanded_TeacherCatalogueTable |


@CSR_ReviewCart @Priority2  @DWCACSR-163 
Scenario Outline:Table structure when CSR adds items from Single flyer from Teacher Catalogue:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds Teacher Catalogue items from single flyer to cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Columns 'Item#', 'Title', 'Flyer', 'Price', 'QTY.' displays in the mentioned order
    And the items are displayed sorted in ascending order of 'Item#'
    Examples:
      | UsingData                         			|
      | QA_TeacherCatalogue_SingleFlyer_SingleMonth 	|
      
@CSR_ReviewCart @Priority2  @DWCACSR-163 
Scenario Outline:Table structure and the item details when CSR adds items from Single flyer from Teacher Catalogue:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds Teacher Catalogue items from single flyer to cart
    And CSR navigates to Review Cart page from Order Entry page
    Then the items added are displayed with correct 'Item#', 'Title', 'Flyer', 'Price', 'QTY.'
    Examples:
      | UsingData                         						|
      | QA_TeacherCatalogue_SingleFlyer_SingleMonth_itemDetails 	|     


@CSR_ReviewCart @Priority2  @DWCACSR-163 
Scenario Outline:Table Structure when CSR adds items from Multiple flyers different months:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds teacher catalogue items from different flyers to cart
    And CSR navigates to Review Cart page from Order Entry page
    Then Single table displays with all the items listed under Teacher Catalogues
    And list of line-items are sorted by Flyer title and then by Item number in ascending order
    Examples:
      | UsingData                         	|
      | QA_TeacherCatalogues_MultipleFlyers 	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from Single flyer for GST & QST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from same month and flyer
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | QA_ReviewCart_GST_QST_Province_QC	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from Single flyer for GST & QST1:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from same month and different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | QA_ReviewCart_GST_QST_Province_QC_2	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST & PST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays correctly
    Examples:
        |UsingData                        	|
        | QA_ReviewCart_GST_PST_Province_BC	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for HST_NL:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_HST_Province_NL	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for HST_NB:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_HST_Province_NB	|

@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for HST_NS:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_HST_Province_NS	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for HST_ON:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_HST_Province_ON	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for HST_PE:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_HST_Province_PE	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST_AB:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_GST_Province_AB	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST_MB:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_GST_Province_MB	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST_NT:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_GST_Province_NT	|


@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST_NU:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_GST_Province_NU	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST_SK:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_GST_Province_SK	|



@CSR_ReviewCart @Priority1  @DWCACSR-163 
Scenario Outline:Correct values display for Teacher Catalogues when multiple items are added from multiple flyer for GST_YT:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
     And CSR selects the order type as [Phone Order]
     And CSR navigates to Verify Account Page
     And CSR navigates to Order Entry Page
     When CSR adds multiple Teacher Catalogue items from different flyers
     And CSR navigates to Review Cart page from Order Entry page
     Then Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly
     Examples:
         |UsingData                     |
         | QA_ReviewCart_GST_Province_YT	|



@CSR_ReviewCart @Priority1  @DWCACSR-215 
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for GST & PST:[<UsingData>]
    Given CSR logs into the application by providing [UserInformation]
    And CSR selects the order type as [Phone Order]
    And CSR navigates to Verify Account Page
    And CSR navigates to Order Entry Page
    When CSR adds multiple Teacher Catalogue items from different flyers
    And CSR navigates to Review Cart page from Order Entry page
    Then no tax displays for GST,PST and correct Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays
    Examples:
        |UsingData                      	|
        | QA_ReviewCart_GST_PST_Province_BC_2	|


@DuplicateItems_in_ReviewCartPage
@DWCACSR-428
@Priority1
@1
Scenario Outline:CSR sees correct item numbers in Order Entry page when he comes from Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on ORDER ENTRY tab
	Then entered item numbers and the quantities should be displayed correctly
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_correct_item_numbers	|			
  

@DuplicateItems_in_ReviewCartPage
@DWCACSR-428
@Priority1
@2
Scenario Outline:CSR sees correct items in Review Cart page_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on ORDER ENTRY tab
    When CSR enter same Flyer code and clicks on [Proceed To CheckOut]
	Then entered items should be displayed correctly
	
Examples:
  | UsingData 				|
  | QA_CSR_sees_correct_items	|	
  

@QA_ReviewCart_AccumuilatedCartTotal
@DWCACSR-165
@Priority2
@1
Scenario Outline:CSR is presented with the label 'Total Amount Owing' in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with a capitalized label 'Total Amount Owing' in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_TotalAmountOwing_label		|			
  

@QA_ReviewCart_AccumuilatedCartTotal
@DWCACSR-165
@Priority1
@2
Scenario Outline:CSR is presented with the a label representative of the total cost of all items in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with the a label representative of the total cost of all items in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_total_cost_of_all_items	|			
  
 
@QA_ReviewCart_AccumuilatedCartTotal
@DWCACSR-165
@Priority1
@3
Scenario Outline:CSR is presented with the a label representative of the total Qty and items of all the items in footer region of the Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with the a label representative of the total quantity and the items of all items in the footer region of the page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_total_quantity_and_items	|
  

@QA_ReviewCart_EditCart
@DWCACSR-289
@Priority1
@1
Scenario Outline:CSR is presented with a hyperlink labeled 'Edit Cart' in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with a hyperlink labeled 'Edit Cart' in the footer region of the page
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_Edit_Cart_label		|			
  

@QA_ReviewCart_EditCart
@DWCACSR-289
@Priority1
@2
Scenario Outline:Order Entry page displays when CSR clicks on hyperlink labeled 'Edit Cart' in the footer region of the Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
	And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the hyperlink [Edit Cart]
    Then [Order Entry] page should be displayed
    And entered item numbers and the quantities should be displayed correctly
	
Examples:
  | UsingData 						|
  | QA_CSR_clicks_hyperlink_Edit_Cart	|			
  

@QA_ReviewCart_PageHeaderAndCSR_Script
@DWCACSR-158
@Priority1
@1
Scenario Outline:Blue step script icon displays beside Review Your Cart header in a page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
	Then Blue step script icon should be displayed next to [Review Your Cart] header in a page
	
Examples:
  | UsingData 									|
  | QA_Blue_step_script_icon_displays_ReviewCart	|		
  

@QA_ReviewCart_PageHeaderAndCSR_Script
@DWCACSR-158
@Priority1
@2
Scenario Outline:modal window displays with the title 'To confirm your order' when CSR clicks on Blue step script icon:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on Blue step script icon in Review Cart page
    Then the modal window should be displayed with the title 'To confirm your order:'
    And the close button 'X' should be displayed in the top right corner of the [To confirm your order:] modal window
	
Examples:
  | UsingData 										|
  | QA_Blue_step_script_icon_modalWindow_ReviewCart	|		
  

@QA_ReviewCart_PageHeaderAndCSR_Script
@DWCACSR-158
@Priority1
@3
Scenario Outline:Modal window disappered when CSR closes the To confirm your order modal window:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on Blue step script icon in Review Cart page
    When CSR clicks on close button in [To confirm your order] modal window
	#Then [To confirm your order] modal window should be disappeared
	Then CSR is presented with the [Review Cart] page
	
Examples:
  | UsingData 													|
  | QA_Blue_step_script_icon_modalWindow_disappeared_ReviewCart	|
  
  		
@QA_ReviewCart_PageValidation
@DWCACSR-167
@Priority1
@1
Scenario Outline:CSR cannot proceed to the 5th step of the process that is 'Rewards' if there is an item line-item with a quantity of zero:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR changes the item quantity to zero and perform tab to move out of the field
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then [Rewards & Coupons] page should not be displayed
	
Examples:
  | UsingData 							|
  | QA_CSR_cannot_proceed_to_the_5th_step	|			
  

@QA_ReviewCart_PageValidation
@DWCACSR-167
@Priority1
@2
Scenario Outline:CSR cannot proceed to the 5th step of the process that is 'Rewards' if there is an item line item with a quantity of zero_2:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR changes the item quantity to zero and perform tab to move out of the field
    #When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then CSR is presented with the callout message with the text 'Delete this item' and the buttons [YES] [NO]
	
Examples:
  | UsingData 								|
  | QA_CSR_cannot_proceed_to_RewardsCoupons	|			
  

@QA_ReviewCart_ProceedToCheckout
@DWCACSR-194
@Priority1
@1
Scenario Outline:CSR is presented with a button labeled Proceed to Checkout positioned in the footer region of the 'Review Cart' page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    When CSR navigates to Review Cart page from Order Entry page
    Then CSR is presented with a button labeled [Proceed to Checkout] positioned in the footer region of the 'Review Cart' page
	
Examples:
  | UsingData 							|
  | QA_CSR_sees_ProceedToCheckout_label	|			
  

@QA_ReviewCart_ProceedToCheckout
@DWCACSR-194
@Priority1
@2
Scenario Outline:Rewards and Coupons page displays when CSR clicks on Proceed to Checkout in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on [Proceed To Checkout] in Review Cart page
    Then [Rewards & Coupons] page should be displayed
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_RewardsCoupons_page	|		
  

@QA_ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@1
Scenario Outline:CSR is presented with the callout message with the text 'Delete this item' and the buttons YES NO:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR clicks on the button labeled 'x' for the item
    Then CSR is presented with the callout message with the text 'Delete this item' and the buttons [YES] [NO]
	
Examples:
  | UsingData 						|
  | QA_CSR_sees_callout_msg_YES_NO		|			
  

@QA_ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@2
Scenario Outline:CSR sees correct items in Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    When CSR changes the item quantity to zero and perform tab to move out of the field
    Then CSR is presented with the callout message with the text 'Delete this item' and the buttons [YES] [NO]
	
Examples:
  | UsingData 								|
  | QA_CSR_perform_tab_sees_callout_msg_YES_NO	|			
    
    
@QA_ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@3
Scenario Outline:Delete confirmation callout disappears when CSR selects NO to delete:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on the button labeled 'x' for the item
    When CSR clicks on [NO] button in delete popup message
    #Then Delete confirmation callout disappears
	
Examples:
  | UsingData 						|
  | QA_CSR_selects_NO_btn_for_deletion	|			
        
        
@QA_ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@4
Scenario Outline:Deleted item is not displayed in the table when CSR selects YES to delete:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on the button labeled 'x' for the item
    When CSR clicks on [YES] button in delete popup message
    #Then Delete confirmation callout disappears
    Then the deleted item should not be displayed in the table
	
Examples:
  | UsingData 							|
  | QA_CSR_selects_YES_btn_for_deletion	|
  
  
@QA_ReviewCart_YTO_DeleteItem
@DWCACSR-291
@Priority1
@5
Scenario Outline:Delete confirmation callout disappears when CSR doesn't do any action for 3 seconds:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    And CSR clicks on the button labeled 'x' for the item
    When CSR doesn't do any action for 3 seconds
    Then Delete confirmation callout disappears
	
Examples:
  | UsingData 									|
  | QA_Delete_confirmation_disappears_after_3secs	|  	
  
@ReviewCart
@DWCACSR-1643
@Priority1
@1
Scenario Outline:CSR removes all items in the cart when selecting 'Yes' on last item on Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR removes all items in cart and select 'Yes' on the last item to delete
    Then CSR is redirected to Order Entry page
	And CSR sees empty forms on Order Entry page
	
Examples:
  | UsingData 									|
  | QA_ReviewCart_DeleteAll_Select_YES_Last_Item	|			
  

@ReviewCart
@DWCACSR-1643
@Priority1
@2
Scenario Outline:CSR removes all items in the cart when the last item's quantity is set to 0 on Review Cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
    And CSR navigates to Review Cart page from Order Entry page
    When CSR removes all items in cart and set the item quantity to 0 for last item
    And select 'Yes' on the last item to delete
    Then CSR is redirected to Order Entry page
	And CSR sees empty forms on Order Entry page
	
Examples:
  | UsingData 								|
  | QA_ReviewCart_DeleteAll_Set_0_Last_Item	|  	
  
  
@QA_ReviewCart_FlyerTitle
@DWCACSR-2292
@Priority1
@1
Scenario Outline: Flyer hyperlink for items is disabled on the Review Cart page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR clicks on flyer hyperlink for item
Then CSR cannot click on flyer hyperlink
Examples:
  | UsingData                                |
  | QA_ReviewCart_FlyerTitle_Hyperlink_Disabled |
  

@QA_ReviewCart_SeeFullDetails
@DWCACSR-2293
@Priority1
@1
Scenario Outline: CSR sees item details in a new tab when ‘See Full Details’ hyperlink is clicked:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR clicks item number
And CSR clicks ‘See Full Details’ hyperlink
Then CSR sees item details in a new tab
Examples:
  | UsingData                        |
  | QA_ReviewCart_SeeFullDetails_NewTab |
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@1
Scenario Outline: CSR is presented with a callout box slightly above the title when perform mouse hover on title in Review cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then CallOut box displays above the title

Examples:
  | UsingData                                     				|
  | QA_ReviewCart_Student_items_CSR_perform_Mouse_hover_on_Title   |
  

@ReviewCart
@SCSCOD-5708
@Priority1
@2
Scenario Outline: CSR sees complete item details in Callout message when he perform mouse hover on item in Review cart page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Full item title displays in a CallOut message
	And Base item price displays under the title
	And provincial taxes to be applied and displays under the base price
	And total price after tax displays for the item

Examples:
  | UsingData                                     								  |
  | QA_ReviewCart_Student_items_CSR_sees_complete_item_details_Mouse_hover_on_Title  |
  
  
#@ReviewCart
#@SCSCOD-5708
#@Priority1
#@3
#@NoNeedToImplement
#Scenario Outline: CallOut box disappears automatically after three seconds when CSR performs mouse hover on title in Review cart page:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	And CSR adds Student Clubs items to the cart to meet the minimum amount
#	And CSR navigates to Review Cart page from Order Entry page
#	When CSR performs mouse hover on item title box
#	Then CallOut box displays above the title
#	And CallOut box disappears automatically after three (3) seconds
#
#Examples:
#  | UsingData                                     								  |
#  | QA_ReviewCart_Student_items_CSR_perform_Mouse_hover_on_Title_callOut_disappear   |
    

#@ReviewCart
#@SCSCOD-5708
#@Priority1
#@4
#@Manual
#Scenario Outline: CallOut box disappears automatically CSR moves the mouse cursor away from the item title in Review cart page:[<UsingData>]
#	
#	Given CSR logs into the application by providing [UserInformation]
#	And CSR selects the order type as [Phone Order]
#	And CSR navigates to Verify Account Page
#	And CSR navigates to Order Entry Page
#	And CSR adds Student Clubs items to the cart to meet the minimum amount
#	And CSR navigates to Review Cart page from Order Entry page
#	When CSR performs mouse hover on item title box
#	Then CallOut box displays above the title
#	When CSR moves the mouse cursor away from the item title
##	Then CallOut box disappears automatically

#Examples:
#  | UsingData                                     								  	|
#  | QA_ReviewCart_Student_items_CSR_perform_Mouse_hover_on_Title_callOut_disappear_2   |  

@ReviewCart
@SCSCOD-5708
@Priority1
@5
Scenario Outline: Correct values displays for Student Club item in Callout message when CSR performs mouse hover on item_GST_PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, GST, PST and Total values displays correctly

Examples:
  | UsingData                                     					  |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_PST_Province_BC |
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@6
Scenario Outline: Correct values displays for Student Club item in Callout message when CSR performs mouse hover on item_GST_QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, GST, QST and Total values displays correctly

Examples:
  | UsingData                                     					  |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_QST_Province_QC |


@ReviewCart
@SCSCOD-5708
@Priority1
@7
Scenario Outline: Correct values displays for Student Club item in Callout message when CSR performs mouse hover on item_HST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, HST and Total values displays correctly

Examples:
  | UsingData                                     				  |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_NL |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_NB |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_NS |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_ON |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_PE |
  

@ReviewCart
@SCSCOD-5708
@Priority1
@8
Scenario Outline: Correct values displays for Student Club item in Callout message when CSR performs mouse hover on item_GST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, GST and Total values displays correctly

Examples:
  | UsingData                                     				  |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_AB |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_MB |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_NT |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_NU |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_SK |
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_YT |
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@9
Scenario Outline: No taxes are charged for Student Club item and displays correct values in Callout msg when CSR performs mouse hover on item_GST_PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then No tax displays for GST, PST and displays item base price, Total values correctly

Examples:
  | UsingData                   				                  				|
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_noTaxes_GST_PST_Province_BC 	|
   
  
@ReviewCart
@SCSCOD-5708
@Priority1
@10
Scenario Outline: No taxes are charged for Student Club item and displays correct values in Callout msg when CSR performs mouse hover on item_GST_QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then No tax displays for GST, QST and displays item base price, Total values correctly

Examples:
  | UsingData                                     								|
  | QA_ReviewCart_Student_items_Mouse_hover_on_Title_noTaxes_GST_QST_Province_QC 	|
   
     

@ReviewCart
@SCSCOD-5708
@Priority1
@11
Scenario Outline: Correct values displays for Teacher Catalogues item in Callout message when CSR performs mouse hover on item_GST_PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, GST, PST and Total values displays correctly

Examples:
  | UsingData                                     					  		|
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_PST_Province_BC 	|
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@12
Scenario Outline: Correct values displays for Teacher Catalogues item in Callout message when CSR performs mouse hover on item_GST_QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, GST, QST and Total values displays correctly

Examples:
  | UsingData                                     					  |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_QST_Province_QC |


@ReviewCart
@SCSCOD-5708
@Priority1
@13
Scenario Outline: Correct values displays for Teacher Catalogues item in Callout message when CSR performs mouse hover on item_HST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, HST and Total values displays correctly

Examples:
  | UsingData                                     				  	   |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_NL |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_NB |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_NS |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_ON |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_PE |
  

@ReviewCart
@SCSCOD-5708
@Priority1
@14
Scenario Outline: Correct values displays for Teacher Catalogues item in Callout message when CSR performs mouse hover on item_GST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then Item base price, GST and Total values displays correctly

Examples:
  | UsingData                                     					   |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_AB |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_MB |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_NT |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_NU |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_SK |
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_YT |
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@15
Scenario Outline:No taxes are charged for Teacher Club item and displays correct values in Callout msg when CSR performs mouse hover on item_GST_PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then No tax displays for GST, PST and displays item base price, Total values correctly

Examples:
  | UsingData                   				                  					|
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_noTaxes_GST_PST_Province_BC 	|
   
  
@ReviewCart
@SCSCOD-5708
@Priority1
@16
Scenario Outline:No taxes are charged for Teacher Club item and displays correct values in Callout msg when CSR performs mouse hover on item_GST_QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart to meet the minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	When CSR performs mouse hover on item title box
	Then No tax displays for GST, QST and displays item base price, Total values correctly

Examples:
  | UsingData                                     									|
  | QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_noTaxes_GST_QST_Province_QC 	|
   
     
          	                            