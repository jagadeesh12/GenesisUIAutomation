Feature: Review Cart - Flyer Modules - Item Pricing Details - Callout
	This feature is to validate the Review Cart - Flyer Modules - Item Pricing Details - Callout Scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
  
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
  | Perf_QA_ReviewCart_Student_items_CSR_perform_Mouse_hover_on_Title   |
  
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
  | Perf_QA_ReviewCart_Student_items_CSR_sees_complete_item_details_Mouse_hover_on_Title  |

############################################################# Manual Test Scenario ###########################################################################  
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
#  | Perf_QA_ReviewCart_Student_items_CSR_perform_Mouse_hover_on_Title_callOut_disappear   |   
#
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
#	Then CallOut box disappears automatically
#
#Examples:
#  | UsingData                                     								  	|
#  | Perf_QA_ReviewCart_Student_items_CSR_perform_Mouse_hover_on_Title_callOut_disappear_2   |  

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
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_PST_Province_BC |
  
  
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
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_QST_Province_QC |


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
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_NL |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_NB |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_NS |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_ON |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_HST_Province_PE |
  

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
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_AB |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_MB |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_NT |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_NU |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_SK |
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_GST_Province_YT |
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@9
Scenario Outline: No taxes are charged and shows correct values in Callout message when CSR performs mouse hover on item_GST_PST:[<UsingData>]
	
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
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_noTaxes_GST_PST_Province_BC 	|
   
  
@ReviewCart
@SCSCOD-5708
@Priority1
@10
Scenario Outline: No taxes are charged and shows correct values in Callout message when CSR performs mouse hover on item_GST_QST:[<UsingData>]
	
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
  | Perf_QA_ReviewCart_Student_items_Mouse_hover_on_Title_noTaxes_GST_QST_Province_QC 	|
   
     

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
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_PST_Province_BC 	|
  
  
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
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_QST_Province_QC |


@ReviewCart
@SCSCOD-5708
@Priority1
@13
Scenario Outline: Correct item values displays for Teacher Catalogues item in Callout message when CSR performs mouse hover on item_HST:[<UsingData>]
	
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
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_NL |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_NB |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_NS |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_ON |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_HST_Province_PE |
  

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
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_AB |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_MB |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_NT |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_NU |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_SK |
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_GST_Province_YT |
  
  
@ReviewCart
@SCSCOD-5708
@Priority1
@15
Scenario Outline: No taxes are charged and shows correct values in Callout message when CSR performs mouse hover on item_GST_PST_BC:[<UsingData>]
	
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
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_noTaxes_GST_PST_Province_BC 	|
   
  
@ReviewCart
@SCSCOD-5708
@Priority1
@16
Scenario Outline: No taxes are charged and shows correct values in Callout message when CSR performs mouse hover on item_GST_QST_QC:[<UsingData>]
	
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
  | Perf_QA_ReviewCart_Teacher_Catalogues_Mouse_hover_on_Title_noTaxes_GST_QST_Province_QC 	|
   
     
        