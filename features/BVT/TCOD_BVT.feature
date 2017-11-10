Feature: TCOD PRODUCTION BVT SCENARIOS
	This run is for tcod production bvt scenarios

Background: 
	Given teacher open rco-scholastic web site

####   	SCENARIOS WITHOUT CHECKOUT		##############

Scenario Outline: Browse SFO with mixed cart:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
And teacher navigates to Review Cart page with correct item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals

Examples:
|UsingData|
|BVTProd:Adds_SFO_Items_MultipleStudents|


Scenario Outline: Browse YTO with mixed cart:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page and adds YTO items from different flyers from YTO by Item number and YTO by flyer view
And teacher navigates to Review Cart page with correct YTO item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct YTO item information and totals

Examples:
|UsingData|
|BVTProd:Adds_YTO_Items_MultipleItemsFlyers|
  
  
Scenario Outline: Browse YTO and SFO items:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
And teacher navigates to YTO page and adds YTO items to cart
And teacher navigates to Review Cart page with correct SFO & YTO item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & YTO item information and totals

Examples:
  |UsingData|
  |BVTProd:Adds_SFO_YTO_Items_MultipleItemsFlyers|
  
  
Scenario Outline: Browse with SFO and Teacher Exclusive items:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
And teacher adds Teacher Exclusive items to cart
And teacher navigates to Review Cart page with correct SFO & teacher exclusive item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & teacher exclusive item information and totals

Examples:
  |UsingData|
  |BVTProd:Adds_SFO_TE_Items_MultipleItemsFlyers|
  
  
Scenario Outline: Browse with YTO and Teacher Exclusive items:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page and adds YTO items from different flyers from YTO by Item number and YTO by flyer view
And teacher adds Teacher Exclusive items to cart
And teacher navigates to Review Cart page with correct YTO & teacher exclusive item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct YTO & teacher exclusive item information and totals  

Examples:
  |UsingData|
  |BVTProd:Adds_YTO_TE_Items_MultipleItemsFlyers|
  
  
Scenario Outline: Browse with SFO, YTO and Teacher Exclusive items:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
And teacher navigates to YTO page and adds YTO items to cart
And teacher adds Teacher Exclusive items to cart
And teacher navigates to Review Cart page with correct SFO, YTO & teacher exclusive item information and totals
And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO,YTO & teacher exclusive item information and totals  


Examples:
  |UsingData|
  |BVTProd:Adds_SFO_YTO_TE_Items_MultipleItemsFlyers|
  
  
Scenario Outline: Browse SFO, YTO and Teacher Exclusive items with Bonus Bank and Credit notes redemptions:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
And teacher navigates to YTO page and adds YTO items to cart
And teacher adds Teacher Exclusive items to cart
And teacher navigates to Review Cart page with correct SFO, YTO & teacher exclusive item information and totals
And teacher navigates to Redemptions & Rewards page with correct totals
When teacher applies Credit Notes to SFO, Bonus Bank and paper coupons redemptions to YTO and teacher exclusives
Then correct totals display on Payment page
And correct SFO,YTO & teacher exclusive item information and totals with redemptions display on Confirm & Submit page
Examples:
  |UsingData|
  |BVTProd:Adds_SFO_YTO_TE_Items_Redemptions|




####   	SCENARIOS WITH FULL CHECKOUT		##############

#Scenario Outline: SFO checkout with mixed cart:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
#And teacher navigates to Review Cart page with correct item information and totals
#And teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals
#When teacher submits the order 
#Then teacher sees the correct SFO item information and totals
#
#Examples:
#|UsingData|
#|BVTProd:Adds_SFO_Items_MultipleStudents|
  #
  #
#Scenario Outline: YTO checkout with mixed cart:[<UsingData>] 
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to YTO page and adds YTO items from different flyers from YTO by Item number and YTO by flyer view
#And teacher navigates to Review Cart page with correct YTO item information and totals
#And teacher navigates to Confirm & Submit page from Review Cart page with correct YTO item information and totals  
#When teacher submits the order   
#Then teacher sees the correct YTO item information and totals   
#
#Examples:
#|UsingData|
#|BVTProd:Adds_YTO_Items_MultipleItemsFlyers|
  #
  #
#Scenario Outline: Order with YTO and SFO items:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
#And teacher navigates to YTO page and adds YTO items to cart
#And teacher navigates to Review Cart page with correct SFO & YTO item information and totals
#And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & YTO item information and totals   
#When teacher submits the order   
#Then teacher sees the correct SFO & YTO item information and totals  
#
#Examples:
  #|UsingData|
  #|BVTProd:Adds_SFO_YTO_Items_MultipleItemsFlyers|
  #
  #
#Scenario Outline: Order with SFO and Teacher Exclusive items:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
#And teacher adds Teacher Exclusive items to cart
#And teacher navigates to Review Cart page with correct SFO & teacher exclusive item information and totals
#And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & teacher exclusive item information and totals 
#When teacher submits the order   
#Then teacher sees the correct SFO & teacher exclusive item information and totals  
#
#Examples:
  #|UsingData|
  #|BVTProd:Adds_SFO_TE_Items_MultipleItemsFlyers|
  #
  #
#Scenario Outline: Order with YTO and Teacher Exclusive items:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to YTO page and adds YTO items from different flyers from YTO by Item number and YTO by flyer view
#And teacher adds Teacher Exclusive items to cart
#And teacher navigates to Review Cart page with correct YTO & teacher exclusive item information and totals
#And teacher navigates to Confirm & Submit page from Review Cart page with correct YTO & teacher exclusive item information and totals  
#When teacher submits the order   
#Then teacher sees the correct YTO & teacher exclusive item information and totals  
#
#Examples:
  #|UsingData|
  #|BVTProd:Adds_YTO_TE_Items_MultipleItemsFlyers|
  #
  #
#Scenario Outline: Order with SFO, YTO and Teacher Exclusive items:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
#And teacher navigates to YTO page and adds YTO items to cart
#And teacher adds Teacher Exclusive items to cart
#And teacher navigates to Review Cart page with correct SFO, YTO & teacher exclusive item information and totals
#And teacher navigates to Confirm & Submit page from Review Cart page with correct SFO,YTO & teacher exclusive item information and totals  
#When teacher submits the order   
#Then teacher sees the correct SFO, YTO & teacher exclusive item information and totals  
#
#Examples:
  #|UsingData|
  #|BVTProd:Adds_SFO_YTO_TE_Items_MultipleItemsFlyers|
  #
  #
#Scenario Outline: Order with Bonus Bank and Credit notes redemptions from SFO, YTO and Teacher Exclusive items:[<UsingData>]
#
#Given teacher logs into the application by providing [UserInformation]
#And teacher navigates to SFO page and adds SFO items from different flyers for multiple students
#And teacher navigates to YTO page and adds YTO items to cart
#And teacher adds Teacher Exclusive items to cart
#And teacher navigates to Review Cart page with correct SFO, YTO & teacher exclusive item information and totals
#And teacher navigates to Redemptions & Rewards page with correct totals
#When teacher applies Credit Notes to SFO, Bonus Bank and paper coupons redemptions to YTO and teacher exclusives
#Then correct totals display on Payment page
#And correct SFO,YTO & teacher exclusive item information and totals with redemptions display on Confirm & Submit page   
#And correct SFO,YTO & teacher exclusive item information and totals with redemptions display on Order Confirmation page  
#Examples:
  #|UsingData|
  #|BVTProd:Adds_SFO_YTO_TE_Items_Redemptions|
