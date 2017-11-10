Feature: Confirm & Submit - Order Detail Module - Student Clubs
	This feature is to validate the Confirm & Submit - Order Detail Module - Student Clubs scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@Confirm&Submit_StudentClubs_Module
@DWCACSR-329
@Priority1
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
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs items are displayed in the table of Student Clubs Order Detail section
	
Examples:
  | UsingData 										|
  | StudentClubs_items_displays_ConfirmSubmit_page	|		
  

@Confirm&Submit_StudentClubs_Module
@DWCACSR-329
@Priority1
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
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Different Flyer items are displays separate tables in the section of Student Clubs Order Detail
	And each line-item within the Student Clubs table(s) is listed within its own separate row
	
Examples:
  | UsingData 												|
  | StudentClubs_items_displays_separate_ConfirmSubmit_page	| 
  
 
@Confirm&Submit_StudentClubs_Module
@DWCACSR-329
@Priority1
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
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then Student Clubs items and the table not displays in Order Detail section
	
Examples:
  | UsingData 											|
  | StudentClubs_items_not_displays_ConfirmSubmit_page	| 
     
     
@Confirm&Submit_StudentClubs_Module
@DWCACSR-329
@Priority1
@Manual
@4
Scenario Outline:CSR sees the correct labels for the Student Clubs items section in Order Detail:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR navigates to Verify Account Page
	And CSR navigates to Order Entry Page
	And CSR adds Student Clubs items to the cart
	And CSR navigates to Review Cart page from Order Entry page
	And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	And CSR navigates to [Payment] page from [Redeem & Rewards] page
	When CSR navigates to [Confirm & Submit] page from [Payment] page
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
  | CSR_sees_StudentClubs_section_labels_ConfirmSubmit_page	|	
  
  	
         