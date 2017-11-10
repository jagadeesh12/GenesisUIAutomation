Feature: Confirm & Submit - Order Detail Module - Teacher Catalogues
	This feature is to validate the Confirm & Submit - Order Detail Module - Teacher Catalogues scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit_TeacherCatalogues_Module
@DWCACSR-331
@Priority1
@1
Scenario Outline:Teacher Catalogues items are displays in a same table in Order Detail section of Student Clubs when CSR adds the items from the same Flyer:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart from the same Flyer
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Teacher Catalogues items are displayed in the table of Teacher Catalogues Order Detail section
	
Examples:
  | UsingData 											|
  | TeacherCatalogues_items_displays_ConfirmSubmit_page	|		
  

@Confirm&Submit_TeacherCatalogues_Module
@DWCACSR-331
@Priority1
@2
Scenario Outline:Teacher Catalogues items are displays in a same table when CSR adds the items from different Flyers:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart from the diffent Flyers
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Teacher Catalogues items are displayed in the table of Teacher Catalogues Order Detail section
	And each each line-item within the Teacher Catalogues table(s) is listed within its own separate row
	
Examples:
  | UsingData 														|
  | TeacherCatalogues_items_displays_same_table_ConfirmSubmit_page	| 
  
 
@Confirm&Submit_TeacherCatalogues_Module
@DWCACSR-331
@Priority1
@3
Scenario Outline:Teacher Catalogues items and table not displays when CSR do not add the Teacher Catalogues items to the cart:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Teacher Catalogues items and the table not displays in Order Detail section
	
Examples:
  | UsingData 												|
  | TeacherCatalogues_items_not_displays_ConfirmSubmit_page	| 
     
     
@Confirm&Submit_TeacherCatalogues_Module
@DWCACSR-331
@Priority1
@Manual
@4
Scenario Outline:CSR sees the correct labels for the Teacher Catalogues items section in Order Detail:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Teacher Catalogues items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the label displays 'TEACHER CATALOGUES' for the header of Teacher Catalogues items in Order Detail section
	And the amount is displays like [$##.##] in the blue header of Teacher Catalogues
	And the label displays with the total  number of items '# Items' in the blue header of Teacher Catalogues
	And CSR sees the single vertical line which separates the total price and total items in the blue header of Teacher Catalogues
	And CSR sees the lables based on the items [#ITEM] [TITLE] [FLYER] [PRICE] [QUANTITY] in the header of 2nd layer in Teacher Catalogues section
	And CSR sees the list of line-items are sorted by Flyer title (most recent month) and then by Item number in ascending order
	And CSR sees the correct details(fall under the same column) of the item number, title, Flyer name, Price and Quantity
	And the amount for the Item price displays like [$##.##]
	And the quantity for the item displays only integers
	And the label displays 'Teacher Catalogues Subtotal' for the subtotal of all the added items in the footer region of 2nd layer
	And the amount is displays like [$##.##] in the 2nd layer
	And the label displays with the total  number of items '# Items' in the footer region of 2nd layer under QTY column
	And the labels are displays based on the Provinces like [GST] [PST] [HST] [QST] in the 3rd layer of Teacher Catalogues section of Order Detail
	And the amount is displays like [$##.##] in the 3rd layer
	And the label displays 'Teacher Catalogues Amount Owing' for the total amount (base price + applicable taxes)
	And the amount is displays like [$##.##]
	
	
Examples:
  | UsingData 														|
  | CSR_sees_TeacherCatalogues_section_labels_ConfirmSubmit_page	|	
  
  	
         