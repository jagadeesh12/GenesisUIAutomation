Feature: TCOD End to End SCENARIOS
	This run is for tcod production bvt scenarios

Background: 
	Given teacher open rco-scholastic web site

Scenario Outline: Order with SFO with one child multiple flyers paid items in cart:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds SFO items from multiple flyers for one student
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Adds_SFO_Items_MultipleStudents|



Scenario Outline: Order with SFO with Same paid item added to 2 different children:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds an item for one student
And teacher adds the same item to another student
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Payment page from Review Cart page
And teacher selects Combination of CC and Checks with Saved Visa card as payment
And teacher navigates to Confirm & Submit page from Payment page with correct SFO item information and totals
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Adds_SFO_SameItem_DiffStudents|


Scenario Outline: Order with SFO with paid and free item added for same child:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds an item for one student
And teacher applies coupon on SFO page for the same student and selects an item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Adds_SFO_Free_Paid|


Scenario Outline: Order with SFO with paid item added for one child and free item added for another child:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds an item for one student such that the order qualifies for free shipping
And teacher applies coupon on SFO page for different student and selects item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Payment page from Review Cart page
And teacher selects saved visa card as payment
And teacher navigates to Confirm & Submit page from Payment page with correct SFO item information and totals
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Adds_SFO_Free_Paid_Diff_Students|



Scenario Outline: Order with SFO with same item added as free and paid item added for the same child:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds an item for one student
And teacher applies coupon on SFO page for the same student and selects same item as paid item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Adds_Same_SFO_Free_Paid_Same_Students|


Scenario Outline: Order with SFO with same item added as free and paid item for different child:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds an item for one student
And teacher applies coupon on SFO page for different student and selects same item as paid item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Adds_Same_SFO_Free_Paid_Diff_Students|



Scenario Outline: Order with SFO only freepick item (Empty cart) with free shipping:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page, applies freepick coupon eligible for free shipping and selects item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals and see free shipping
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Add_OnlySFOFreeItem_FreeShipping|


Scenario Outline: Order with SFO only freepick item (Empty cart) with paid shipping:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page, applies freepick coupon NOT eligible for free shipping and selects item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Payment page from Review Cart page
And teacher selects new master card as payment
And teacher navigates to Confirm & Submit page from Payment page with correct item information and totals and see paid shipping
When teacher submits the order 
Then teacher sees the correct SFO item information and totals

Examples:
|UsingData|
|Development:E2E:Add_OnlySFOFreeItem_PaidShipping|


Scenario Outline: Order with SFO freepick only and YTO paid items:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page
And teacher applies freepick coupon on SFO page
And teacher selects an item from SFO coupon modal
And teacher navigates to YTO page and adds YTO items to cart
And teacher navigates to Review Cart page with correct SFO & YTO item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
When teacher submits the order
Then teacher sees the correct SFO & YTO item information and totals

Examples:
|UsingData|
|Development:E2E:Add_OnlySFOFreeItem_PaidYTO|

Scenario Outline: Order with SFO freepick and teacher exclusives paid items:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page
And teacher applies freepick coupon on SFO page
And teacher selects an item from SFO coupon modal
And teacher adds Teacher Exclusive items to cart
And teacher navigates to Review Cart page with correct SFO & teacher exclusive item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
When teacher submits the order 
Then teacher sees the correct SFO & teacher exclusive item information and totals

Examples:
|UsingData|
|Development:E2E:Add_OnlySFOFreeItem_PaidTE|

Scenario Outline: Order with SFO freepick only and YTO freepick only:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page
And teacher applies freepick coupon on SFO page
And teacher selects an item from SFO coupon modal
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Redemptions & Rewards page
And teacher applies freepick coupon
And teacher selects an item from freepick modal
And teacher navigates to Confirm & Submit page from Rewards page with correct item information and totals
When teacher submits the order 
Then teacher sees the correct Free SFO and YTO item information and totals

Examples:
  |UsingData|
  |Development:E2E:Adds_SFO_YTO_FreeItemsOnly|





@EndToEnd
Scenario Outline: Order with same paid item added to SFO and YTO:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
	And teacher navigates to YTO page and same item added to YTO as added to SFO
	#And teacher navigates to YTO page and same item added to YTO as added to SFO freepick item
	And teacher navigates to Review Cart page with correct SFO & YTO item information and totals
	#And teacher navigates to Review Cart page with correct item information and totals
	#And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
	And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & YTO item information and totals
	#And correct SFO,YTO & teacher exclusive item information and totals with redemptions display on Confirm & Submit page
	When teacher submits the order 
	Then teacher sees the correct SFO & YTO item information and totals
  
Examples:
  |UsingData|
  |Development:E2E:Adds_SFO_YTO_Items	|
  
  
@EndToEnd
Scenario Outline: Order with paid and free item added to both SFO and YTO:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
	And teacher applies freepick coupon NOT eligible for free shipping on SFO page
	And teacher selects an item from SFO coupon modal
	And teacher navigates to YTO page and same item added to YTO as added to SFO
	And teacher navigates to Review Cart page with correct SFO & YTO item information and totals
	And teacher navigates to Redemptions & Rewards page
	And teacher applies freepick coupon
	And teacher selects an item from freepick modal
	And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & YTO item information and totals
	When teacher submits the order 
	Then teacher sees the correct SFO & YTO item information and totals
  
Examples:
  |UsingData																						|
  |Development:E2E:Adds_Paid_FreeItem_to_SFO_YTO_Items	|  
  

@EndToEnd
Scenario Outline: Order with same free item added to both SFO and YTO:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher applies freepick coupon on SFO page
	And teacher selects an item from SFO coupon modal
	And teacher navigates to Review Cart page with correct item information and totals
	And teacher navigates to Redemptions & Rewards page
	And teacher applies freepick coupon
	And teacher selects the same item as selected on SFO from freepick modal
	And teacher navigates to Confirm & Submit page from Rewards page with correct item information and totals
	When teacher submits the order 
	Then teacher sees the correct Free SFO and YTO item information and totals
  
Examples:
  |UsingData																						|
  |Development:E2E:Adds_same_FreeItem_to_SFO_YTO_Items	|  
  

@EndToEnd
Scenario Outline: Order with SFO paid and freepick items for multiple children and YTO paid and freepick items and teacher exclusives:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And adds SFO items from different flyers for multiple students
	And teacher applies freepick coupon on SFO page
	And teacher selects an item from SFO coupon modal
	And teacher navigates to YTO page and same item added to YTO as added to SFO
	And teacher adds Teacher Exclusive items to cart
	And teacher navigates to Review Cart page with correct SFO, YTO & teacher exclusive item information and totals
	And teacher navigates to Redemptions & Rewards page
	And teacher applies freepick coupon
	And teacher selects an item from freepick modal
	And teacher navigates to Confirm & Submit page from Rewards page with correct SFO,YTO & TE item information and totals
	#When teacher submits the order
	#Then teacher sees the correct SFO, YTO, teacher exclusive item and Rewards information and totals
  
Examples:
  |UsingData																									|
  |Development:E2E:Adds_FreeItem_to_SFO_YTO_and_paid_TE_Items	|
  

@EndToEnd
Scenario Outline: Order with Redemptions from SFO with SFO only items in cart:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page and adds SFO items to cart such that order qualifies for free shipping
	And teacher navigates to Review Cart page with correct item information and totals
	And teacher navigates to Redemptions & Rewards page and get the SFO Total value
	And teacher enters amount in Credit notes for SFO
	And amount entered in credit notes is deducted from SFO total
	And teacher navigates to the [Payments] page
	And teacher selects saved amex card as payment
	And teacher navigates to Confirm & Submit page from Payment page with correct SFO item information and totals
	#When teacher submits the order 
	#Then teacher sees the correct SFO item information and totals

Examples:
  |UsingData																									|
  |Development:E2E:Adds_SFO_Items_and_Redeem_in_Rewards_Page	|
  
  
@EndToEnd
Scenario Outline: Order with Redemptions from SFO  and shipping with SFO only items in cart:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page and adds SFO items to cart such that order has paid shipping
	And teacher navigates to Review Cart page with correct item information and totals
	And teacher navigates to Redemptions & Rewards page with correct totals
	And teacher enters amount in Credit notes for SFO Then amount entered in credit notes is deducted from SFO total
	And teacher enters amount in Bonus bank and Credit notes for shipping Then amount entered in credit notes and bonus bank is deducted from shipping total
	And teacher navigates to the [Payments] page
	And teacher selects combination of cc and checks with new amex card as payment
	And teacher navigates to Confirm & Submit page from Payment page with correct SFO item information and totals
	When teacher submits the order 
	Then teacher sees the correct SFO item information and totals

Examples:
  |UsingData																									|
  |Development:E2E:Adds_SFO_Items_and_Redeem_in_SFO_Shipping_Rewards_Page	| 
  

@EndToEnd
Scenario Outline: Order with Redemptions from SFO making the cart total to $0 with SFO only items:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page and adds SFO items to cart such that order has paid shipping
	And teacher navigates to Review Cart page with correct item information and totals
	And teacher navigates to Redemptions & Rewards page with correct totals
	And teacher enters amount in Credit notes which is equal to SFO total
	And teacher enters amount in Bonus bank and Credit notes which is equal to Shipping fee
	And teacher navigates to the [Payments] page with correct totals
	And teacher navigates to Confirm & Submit page from Payment page with correct SFO item information and totals
	#And teacher navigates to Confirm & Submit page from Payment page with correct totals and no Payment method to select
	When teacher submits the order
	Then teacher sees the correct SFO item information and totals

Examples:
  |UsingData																																				|
  |Development:E2E:Adds_SFO_Items_and_Redeem_in_SFO_Shipping_to_make_0_Rewards_Page	| 
  
  
@EndToEnd
Scenario Outline: Order with SFO only items and DTS items:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
	And teacher navigates to Review Cart page with correct item information and totals
	And teacher navigates to Redemptions & Rewards page and get the YTO Total value
	And teacher select the item on DTS modal such that there is a top-off amount
	And top-off amount is added to YTO total
	And teacher navigates to the [Payments] page with correct totals
	And teacher navigates to Confirm & Submit page from Payment page with correct SFO and YTO item information and totals
	When teacher submits the order
	Then teacher sees the correct SFO and YTO item information and totals in Confirmation page
	#And DTS item information displays correctly in rewards section

Examples:
  |UsingData																																		|
  |Development:E2E:Adds_SFO_Items_and_select_DTS_with_Exceeded_amt_Rewards_Page	| 
         
         
@EndToEnd
Scenario Outline: Order with YTO with free shipping:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page and adds YTO items to cart such that order eligibles for free shipping
	And teacher navigates to Review Cart page with correct YTO item information and totals
	And teacher navigates to Confirm & Submit page from Review Cart page with correct YTO item information and totals
	When teacher submits the order
	Then teacher sees the correct YTO item information and totals

Examples:
  |UsingData																					|
  |Development:E2E:Adds_YTO_Items_with_Free_Shipping	| 
  
  
@EndToEnd
Scenario Outline: Order with YTO with paid shipping:[<UsingData>]

	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page and adds YTO items to cart such that order has paid shipping
	And teacher navigates to Review Cart page with correct YTO item information and totals
	And teacher navigates to Confirm & Submit page from Review Cart page with correct YTO item information and totals
	When teacher submits the order
	Then teacher sees the correct YTO item information and totals

Examples:
  |UsingData																					|
  |Development:E2E:Adds_YTO_Items_with_Paid_Shipping	|    
                   