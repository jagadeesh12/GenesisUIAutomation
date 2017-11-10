Feature: CSR - Email stories
	This feature is to validate the Email Module scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Email
@Priority1
@DWCACSR-342
@Manual
@1
Scenario Outline:CSR sees the email confirmation sent to the correct recipient e-mail address and the content based on the languge selected:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees the email confirmation sent to the correct recipient e-mail address
	And the content of the mail displays based on the selection either English/ French
	
Examples:
  | UsingData 	|
  | CSR_Email_1	|
  

@Email
@Priority1
@DWCACSR-343
@Manual
@1
Scenario Outline:CSR sees the Scholastic Logo and the name of the recipient and submitted date in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees the image of the Scholastic Reading Club logo within the header area of the e-mail message
	And CSR sees the image of the official Scholastic logo within the header area of the e-mail message
	And CSR sees the introductory message containing their first name + last name i.e. ‘Dear John Smith’
	And CSR sees the introductory message letting him/her know that this e-mail is indeed a confirmation message pertaining to their most recent order request
	And CSR sees the submitted date with the format of ‘DD/MM/YYYY’
	
Examples:
  | UsingData 	|
  | CSR_Email_2	|

  
@Email
@Priority1
@DWCACSR-344
@Manual
@1
Scenario Outline:CSR sees the statement of the order and order number in a Email after submit the order:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then statement of the order displays ‘Your Order Reference Number is <Order Number>
	And  Order Reference Number which is attached to the text above is automatically generated from Demandware as per current-state functionality
	
Examples:
  | UsingData 	|
  | CSR_Email_3	|
  
  
@Email
@Priority1
@DWCACSR-345
@Manual
@1
Scenario Outline:CSR sees the Student Clubs, Teacher Catalogues, Shipping and Total Amount labels in Order Summary Module in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs and Teacher Catalogues items to the cart without minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees 2 layers : [Header Layer] and [Flyer Module Details Layer]
	And CSR sees the header layer with the label 'Order Summary'
	And the label 'Student Clubs Amount Owing' for the Student Clubs items amount
	And the amount is displays like [$##.##]
	And the label 'Teacher Catalogues Amount Owing' for the Teacher Catalogues items amount
	And the amount is displays like [$##.##]
	And the label 'Shipping & Handling Amount Owing' for the Shipping charges
	And the amount is displays like [$##.##] and if the shipping is free then it displays 'FREE'
	And the label 'TOTAL AMOUNT OWING' for all the total cost of the order
	And the amount is displays like [$##.##]
	And two horizontal lines displays above and below for the [TOTAL AMOUNT OWING] label row
	
Examples:
  | UsingData 	|
  | CSR_Email_4	|	
  


@Email
@Priority1
@DWCACSR-346
@Manual
@1
Scenario Outline:CSR sees the Payment header and the Amount Paid by Credit Card labels in the Payment section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Credit Card as payment
	And CSR selects saved Credit Card
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the label displays 'PAYMENT' for the header of the Payment section
	Then the label 'Amount Paid by Credit Card' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 														|
  | CSR_sees_correct_labels_Payment_CreditCard_Email_page	|		
  

@Email
@Priority1
@DWCACSR-346
@Manual
@2
Scenario Outline:CSR sees Amount Paid by Cheques label in the Payment section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the label 'Amount Paid by Cheques' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 													|
  | CSR_sees_correct_labels_Payment_Cheques_Email_page	|
  

@Email
@Priority1
@DWCACSR-346
@Manual
@3
Scenario Outline:CSR sees Amount Paid by Purchase Order label in the Payment section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Purchase Order as payment
	And CSR enter PO details
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the label 'Amount Paid by Purchase Order' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 												|
  | CSR_sees_correct_labels_Payment_PO_Email_page	|  
  
  
@Email
@Priority1
@DWCACSR-346
@Manual
@4
Scenario Outline:CSR sees Amount Paid by Credit Card and Amount Paid by Cheques labels in the Payment section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects combo as payment
	And CSR ennter details
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the label 'Amount Paid by Credit Card' and 'Amount Paid by Cheques' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 															|
  | CSR_sees_correct_labels_Payment_Credit_Cheques_Email_page	|  
  

@Email
@Priority1
@DWCACSR-346
@Manual
@5
Scenario Outline:CSR sees Amount Paid by Parent Online Payments label in the Payment section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects POP as payment
	Then the POP amount deducts automatically which is same as Actual order amount
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the label 'Amount Paid by Parent Online Payments' displays in the Payment section
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 												|
  | CSR_sees_correct_labels_Payment_POP_Email_page	|
  
 
@Email
@Priority1
@DWCACSR-347
@Manual
@1
Scenario Outline:CSR sees YOUR ORDER WILL BE SHIPPED TO label and the Shipping address correctly in the Shipping address section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the label 'YOUR ORDER WILL BE SHIPPED TO' displays for the header layer of Shipping address section
	And the Shipping address displays correctly in the Shipping Address details layer
	And the address is presented in the following format: Full Name, School Name (If applicable), Street Number & Name, City, Province, Postal Code, Country
	
	
Examples:
  | UsingData 											|
  | CSR_sees_correct_labels_Shipping_Addr_Email_page	|  
       

@Email
@Priority1
@DWCACSR-347
@Manual
@2
Scenario Outline:CSR sees alternate shipping address correctly in the Shipping address section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart with minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR selects Checks as payment
	And CSR clicks on alternate shipping check box
	And CSR enters the details
	And CSR clicks on [Continue Checkout] button in Payment page
	When CSR submits the order
	Then the entered Shipping address displays correctly in the Shipping Address details layer
	
	
Examples:
  | UsingData 											|
  | CSR_sees_correct_alternate_Shipping_Addr_Email_page	|  
  
  
@Email
@Priority1
@DWCACSR-348
@Manual
@1
Scenario Outline:CSR sees the correct labels for the ORDER DETAIL section and module in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs and Teacher Catalogues items to the cart without qualifying minimum amount
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees 2 layes : [Order Detail] & [Module details]
	And the label displays 'ORDER DETAIL' for the header of the Order Detail section
	And the label displays 'STUDENT CLUBS' for the Student Clubs items section in the Module details layer
	And the label displays 'TEACHER CATALOGUES' for the Teacher Catalogues items section in the Module details layer
	And the label displays 'SHIPPING & HANDLING' for the Shipping & Handling section in the Module details layer

Examples:
  | UsingData 								|
  | CSR_sees_OrderDetail_module_Email_page	|		
  

@Email
@Priority1
@DWCACSR-1123
@Manual
@1
Scenario Outline:Student Clubs items are displays in a same table in Order Detail section of Student Clubs when CSR selects the items from the same Flyer:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart from the same Flyer
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs items are displayed in the table of Student Clubs Order Detail section
	
Examples:
  | UsingData 										|
  | StudentClubs_items_displays_Email_page	|		
  

@Email
@Priority1
@DWCACSR-1123
@Manual
@2
Scenario Outline:Student Clubs items are displays in a separate tables when CSR selects the items from different Flyers:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart from the diffent Flyers
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Different Flyer items are displays separate tables in the section of Student Clubs Order Detail
	And each line-item within the Student Clubs table(s) is listed within its own separate row
	
Examples:
  | UsingData 												|
  | StudentClubs_items_displays_separate_Email_page	| 
  
 
@Email
@Priority1
@DWCACSR-1123
@Manual
@3
Scenario Outline:Student Clubs items and table not displays when CSR do not add the Student Club items to the cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs items and the table not displays in Order Detail section
	
Examples:
  | UsingData 											|
  | StudentClubs_items_not_displays_Email_page	| 
     
     
@Email
@Priority1
@DWCACSR-1123
@Manual
@4
Scenario Outline:CSR sees the correct labels for the Student Clubs items section in Order Detail of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then the label displays 'STUDENT CLUBS' for the header of Student Clubs items in Order Detail section
	And the amount is displays like [$##.##] in the blue header of Student Clubs
	And the label displays with the total  number of items '# Items' in the blue header of Student Clubs
	And CSR sees the single vertical line which separates the total price and total items in the blue header of Student Clubs
	And CSR sees the lables based on the items [#ITEM] [TITLE] [FLYER] [PRICE] [QUANTITY] in the header of 2nd layer in Student Clubs section
	And CSR sees the list of line-items are sorted by Flyer title (most recent month) and then by Item number in ascending order
	And CSR sees the correct details(fall under the same column) of the item number, title, Flyer name, Price and Quantity
	And the amount for the Item price displays like [$##.##]
	And the quantity for the item displays only integers
	And the label displays 'Student Clubs Subtotal' for the subtotal of all the added items in the footer region of 2nd layer
	And the amount is displays like [$##.##] in the 2nd layer
	And the label displays with the total  number of items '# Items' in the footer region of 2nd layer under QTY column
	And the labels are displays based on the Provinces like [GST] [PST] [HST] [QST] in the 3rd layer of Student Clubs section of Order Detail
	And the amount is displays like [$##.##] in the 3rd layer
	And the label displays 'Student Clubs Amount Owing' for the total amount (base price + applicable taxes)
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 												|
  | CSR_sees_StudentClubs_section_labels_Email_page	|	
  
  	
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 								|
  | Email_GST_PST_Province_BC	|
  
  	
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | Email_GST_PST_Province_BC_2	|
  
   
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
   And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 								|
  | Email_GST_QST_Province_QC	|
  
  	
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | Email_GST_QST_Province_QC_2	|
  
   
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | Email_HST_Province_NL	|



@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | Email_HST_Province_NB	|

  
  

@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | Email_HST_Province_NS	|

  
  
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | Email_HST_Province_ON	|

  
  
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | Email_HST_Province_PE	|
  
          

@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | Email_GST_Province_AB	|
     

@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | Email_GST_Province_MB	|

     
     
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | Email_GST_Province_NT	|

     
     
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | Email_GST_Province_NU	|

     
     
     
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 							|
  | Email_GST_Province_SK	|
   
     
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Teacher Catalogues when multiple items are added from same flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 						|
  | Email_GST_Province_YT	|
                    

@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 										|
  | Email_GST_PST_Province_BC_NoTaxes	|
  
   
@Email
@Priority1
@DWCACSR-1108,1109,1111,1113,1114,1116
@Manual
@1
Scenario Outline:No taxes are charged for Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then No tax displays and correct TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 										|
  | Email_GST_QST_Province_QC_NoTaxes	|
  


@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
   And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | StudentClubs_Email_GST_PST_Province_BC	|
  
  	
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
   And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | StudentClubs_Email_GST_PST_Province_BC_2	|
  
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | StudentClubs_Email_GST_QST_Province_QC	|
  
  	
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | StudentClubs_Email_GST_QST_Province_QC_2	|
  
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 									|
  | StudentClubs_Email_HST_Province_NL	|



@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_HST_Province_NB	|
  
  
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_HST_Province_NS	|

  
  
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_HST_Province_ON	|

  
  
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_HST_Province_PE	|
  
        

@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_GST_Province_AB	|
  
     

@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_GST_Province_MB	|

   
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_GST_Province_NT	|

   
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_GST_Province_NU	|

   
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_GST_Province_SK	|

   
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student Clubs when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 											|
  | StudentClubs_Email_GST_Province_YT	|
      
            
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & PST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then No tax displays and correct Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 												|
  | StudentClubs_Email_GST_PST_Province_BC_NoTaxes	|
  
   
@Email
@Priority1
@DWCACSR-1123,1105,1106,1111,1113,1114,1116
@Manual
@1
Scenario Outline:No taxes are charged for Student Clubs for tax exempted schools for provinces with applicable taxes as GST & QST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart without qualifying min order from the same flyer
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then No tax displays and correct Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData				 										|
  |  StudentClubs_Email_GST_QST_Province_QC_NoTaxes	|

 
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & PST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_PST_Province_BC	|
  
   
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from same flyer for GST & QST:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_QST_Province_QC	|
  
   
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NL:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_HST_Province_NL	|
  

@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_HST_Province_NB	|

  
  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_NS:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_HST_Province_NS	|

  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_ON:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_HST_Province_ON	|

  
  
  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for HST_PE:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_HST_Province_PE	|
      

@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_AB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_Province_AB	|


@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_MB:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_Province_MB	|
 
  
  
  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_NT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_Province_NT	|

  
  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_NU:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_Province_NU	|

  
  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_SK:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_Province_SK	|

  
  
@Email
@Priority1
@Manual
@1
Scenario Outline:CSR sees correct subtotals, shipping charges, totals, taxes display for Student and Teacher Catalogues when multiple items are added from different flyer for GST_YT:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page
	
Examples:
  | UsingData 															|
  | Student_And_TeacherCatalogues_Email_GST_Province_YT	|
 
@Email
@Priority1
@Manual
@1
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & PST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData 																	|
  | Student_And_TeacherCatalogues_Email_GST_PST_Province_BC_NoTaxes	|
  
   
@Email
@Priority1
@Manual
@1
Scenario Outline:No taxes are charged for Student and Teacher Catalogues for tax exempted schools for provinces with applicable taxes as GST & QST in Confirm & Submit page:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page
	
Examples:
  | UsingData				 													|
  |  Student_And_TeacherCatalogues_Email_GST_QST_Province_QC_NoTaxes	|
  
   
@Email
@Priority1
@DWCACSR-1117
@Manual
@1
Scenario Outline:CSR sees the correct labels for the REWARDS section in Order Detail rewards section in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then the header label displays 'REWARDS' for Order Detail rewards section
	And the text displays 'Rewards Earned with Todays Qualifying Order Value of' in the 2nd layer of the module
	And the date and time displays as e.g. 1/30, 11:59pm ET based on the date in a Time and Date section in Order Detail rewards section
	
Examples:
  | UsingData 							|
  | Email_Order_Summary_module	|
  
  	
@Email
@Priority1
@DWCACSR-1117
@Manual
@2
Scenario Outline:CSR sees correct qualifying order value in Order Detail rewards section in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then correct qualifying order value displays in Order Detail rewards section
	
Examples:
  | UsingData 							|
  | Email_qualifying_order_val	|
  


@Email
@Priority1
@DWCACSR-1117
@Manual
@3
Scenario Outline:CSR sees the various types of rewards section in Order Detail rewards section in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees the various types of rewards section displays in 3rd layer of the Order Detail rewards section
	
Examples:
  | UsingData 								|
  | Email_rewards_section_types	| 
  
   
@Email
@Priority1
@DWCACSR-1118
@Manual
@1
Scenario Outline:CSR sees the correct labels for the COUPONS section in Order Detail coupons section in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies a coupon
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then the header label displays 'COUPONS' for Order Detail rewards section
	And CSR is presented with the label of the Coupon(s)  <Coupon Code> and Description pulled from Business Manager
	
Examples:
  | UsingData 								|
  | Email_coupon_Summary_module	|
  
  	
@Email
@Priority1
@DWCACSR-1118
@Manual
@2
Scenario Outline:CSR sees FreePick item in a table with details in coupons section of Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR applies a FreePick coupon
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees table in a Coupons section with the details of [Item] [Item Title] [Grade Level] [Amount] [QTY]
	
Examples:
  | UsingData 								|
  | Email_coupon_freePick_table	|
  
 
@Email
@Priority1
@DWCACSR-1119
@Manual
@1
Scenario Outline:CSR sees to send another mail and Customer care number and date & time in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then e-mail recipient is presented with a paragraph of text which Let’s him/her know that another e-mail will be sent in the event of the order being shipped
 	And Provides him/her with the Customer Service contact number in the event of there being any issues regarding the order i.e. 1-800-268-3860
 	And Provides him/her with an appropriate date/time schedule of the optimal period to contact Customer Service
	
Examples:
  | UsingData 						|
  | Email_footer_thankYou_date_time	|
  
  
@Email
@Priority1
@DWCACSR-1120
@Manual
@1
Scenario Outline:CSR sees the instructions on how to UNSUBSCRIBE from transactional e-mails in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then CSR sees the instructions on how to UNSUBSCRIBE from transactional e-mails in a mail
	
Examples:
  | UsingData 						|
  | Email_instruction_unsubscribe	|
  
    
@Email
@Priority1
@DWCACSR-1121
@Manual
@1
Scenario Outline:CSR sees the Scholastic privacy policy and hyperlink of URL and content language in a Email:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	And CSR navigates to [Confirm & Submit] page from [Payment] page
	When CSR submits the order
	Then e-mail recipient will be presented with a concise paragraph of text which outlines Scholastic’s privacy policy
	And hyperlink of Canada Scholastic URL displays
	And the content shows based on the language selected like English or French
	
Examples:
  | UsingData 						|
  | Email_Privacy_policy_hyperlink	|
    
  	           	         