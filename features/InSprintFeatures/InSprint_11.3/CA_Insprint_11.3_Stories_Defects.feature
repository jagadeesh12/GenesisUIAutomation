Feature: BTS Release Test Scenarios
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site




##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   STORY 3699 - ITEM LABEL                #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

 
@Story-3699 
@ReviewCart-LineItemLabel
@Priority3 
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher catalogues total in all checkout pages:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
When Teacher navigates to Review Your Cart page
Then line time label for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher navigates to confirm and submit page from Review cart page
And line time label in Confirm and Submit page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher clicks on Submit Order
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   
  
  Examples:
  |UsingData                        |
  |Sprint_11.3:dev35:TeacherOrder_StudentTeacherClubs_Label_Checkout|  
    
    
@Story-3699
@ReviewCart-LineItemLabel
@Priority3   
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher club total in order history:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
And teacher clicks on Submit Order
When teacher navigates to my account page and click on view order under order history
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   

  
  Examples:
  |UsingData                        |
  |Sprint_11.3:dev35:TeacherOrder_StudentTeacherClubs_Label_OrderHistory|
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3919 SEARCH RESULTS           #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
  
@Story-3919
@Search
@Priority3
Scenario Outline:Teacher should get user friendly page when searched anything which generates zero matches:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query for a product that does not match any items in the database
When search results are displayed [UserInformation]
Then the search result page displays Sorry no results page is displayed

Examples:
  | UsingData                                |
  | Sprint_11.3:dev35:Search_NoResult                           |
    
@Story-3919
@Search
@Priority3
Scenario Outline: Teacher should get user friendly page when searched anything which generated zero matches in already searched page:[<UsingData>]
 
  Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query in the search field which has more than 15 results
  When search results are presented with results set greater than the default 15 items and View All link
  And teacher have entered search query for a product that does not match any items in the database
  When search results are displayed [UserInformation]
  Then the search result page displays Sorry no results page is displayed
  
  Examples:
  | UsingData                                |
  | Sprint_11.3:dev35:Search_NoResult_fromSearchResultPage                        |
  
  
  
@Story-3919
@Search
@Priority3
Scenario Outline: Teacher, when searched with valid keyword in second search field should navigate to search result page:[<UsingData>]
 
 Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query for a product that does not match any items in the database
 When search results are displayed [UserInformation]
 Then the search result page displays Sorry no results page is displayed
 And Teacher have entered search query in the search field which return search result
 Then Search result page should display the searched item
 
 Examples:
  | UsingData                                |
  | Sprint_11.3:dev35:Search_NoResult_AgainSearchPage    | 
  
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3698 PAYMENT SCREEN           #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
  
    
@Story-3698
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST without redemptions in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST & PST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total



Examples: 
  |UsingData                                              |
  |Sprint_11.3:dev35:Golden:TeacherOrder_GST_PST_Province_BC_0_0_0_0_payment|
  
  
@Story-3698  
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student redemptions in Payment page:[<UsingData>]  

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST & PST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total



Examples: 
  |UsingData                                              |
  |Sprint_11.3:dev35:Golden:TeacherOrder_GST_PST_Province_BC_2_2_0_0_payment|
  
  
@Story-3698  
@Golden  
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with teacher redemptions in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST & PST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total



Examples: 
  |UsingData                                              |
  |Sprint_11.3:dev35:Golden:TeacherOrder_GST_PST_Province_BC_0_0_2_2_payment|  



@Story-3698
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student Club & Teacher club  items for GST & PST with student&Teacher redemptions in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST & PST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                          |
  |Sprint_11.3:dev35:Golden:TeacherOrder_GST_PST_Province_BC_2.1_2.1_2.1_2.1_payment|
  
  
@Story-4231
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher club  items for GST & PST with redemptions in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                          |
  |Sprint_11.3:dev35:Golden:TeacherOnlyOrder_GST_PST_Province_BC_2.1_2.1_payment|  
  
  
  
@Story-3698
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student club items for GST & QST with redemptions against 'QC' Province in Payment page:[<UsingData>]   
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST & QST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:StudentOrder_GST_QST_Province_QC_2.1_2.1_2.1_2.1_payment| 


@Story-3698
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Student and Teacher club items for GST & QST with Student and Teacher redemptions against 'QC' Province in Payment page:[<UsingData>]   
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST & QST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & QST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:TeacherOrder_GST_QST_Province_QC_2.1_2.1_2.1_2.1_payment|
  
  
  
@Story-4231
@Golden
@Example
@Payment
@Priority1
Scenario Outline:Teacher charged with correct subtotal on Teacher club items for GST & QST with redemptions against 'QC' Province in Payment page:[<UsingData>]   
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST & QST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:TeacherOnlyOrder_GST_QST_Province_QC_2.1_2.1_payment|  
  
  

@Story-3698  
@Golden  
@Payment
@Priority1
Scenario Outline: Teacher charged with correct subtotal for Student Club items for GST with redemptions against 'NU' Province in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:StudentOrder_GST_Province_NU_2.1_2.1_2.1_2.1_payment|


@Story-3698  
@Golden  
@Payment
@Priority1
Scenario Outline: Teacher charged with correct subtotal for Student & Teacher Club items for GST with Student and Teacher redemptions against 'NU' Province in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues GST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:TeacherOrder_GST_Province_NU_2.1_2.1_2.1_2.1_payment|
  
  
  
@Story-4231
@Payment
@Priority1
Scenario Outline: Teacher charged with correct subtotal for Teacher Club items for GST with redemptions against 'NU' Province in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:TeacherOnlyOrder_GST_Province_NU_2.1_2.1_payment|
  
  
@Story-3698
@Payment
@Priority1
Scenario Outline: Teacher charged with correct subtotal on Student Club items for HST with redemptions against 'NL' Province in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues HST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:StudentOrder_HST_Province_NL_2.1_2.1_payment|



@Story-3698  
@Golden  
@Payment
@Priority1
Scenario Outline: Teacher charged with correct subtotal on Student Club and Teacher club items for HST with Student and Teacher redemptions against 'NL' Province in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in student Bonus Bank
And teacher enters amount in student Paper coupons
And teacher clicks on Apply in Students section
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax & post Redemptions)in Student Clubs displays in the blue header
And tax rates for Student Catalogues HST display correctly
And Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays
And StudentClubsAmountOwing(post tax & redemptions) displays correctly
And No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues HST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:TeacherOrder_HST_Province_NL_2.1_2.1_2.1_2.1_payment|
  
  
@Story-4231
@Golden  
@Payment
@Priority1
Scenario Outline: Teacher charged with correct subtotal on Teacher club items for HST with redemptions against 'NL' Province in Payment page:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in teacher Bonus Bank
And teacher enters amount in teacher Paper coupons
And teacher clicks on Apply in teacher section
When teacher navigates to Payment page
Then No. of items and Total(post tax)in Teacher Catalogues displays
And Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly
And tax rates for Teacher Catalogues HST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly
And TeacherCataloguesAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:TeacherOnlyOrder_HST_Province_NL_2.1_2.1_payment|
  
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################  STORY - 3433 PAYMENT SCREEN - SHIPPING  #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################  


@Story-3433 
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & PST on Shipping Fee with redemptions against 'BC' Province in Payment page1:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_GST_PST_Province_BC_0_0_payment|


@Story-3433
@Golden  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & PST on Shipping Fee with redemptions against 'BC' Province in Payment page2:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_PST_Province_BC_2.2_2.2_payment|
  
  
@Story-3433 
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & PST on Shipping Fee with redemptions against 'BC' Province in Payment page3:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_GST_PST_Province_BC_0_2_payment|  
  
  
@Story-3433 
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & PST on Shipping Fee with redemptions against 'BC' Province in Payment page4:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & PST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_GST_PST_Province_BC_5_0_payment|
  
  
  
@Story-3433 
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & QST on Shipping Fee with redemptions against 'QC' Province in Payment page1:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & QST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_GST_QST_Province_QC_0_0_payment|


@Story-3433
@Golden  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & QST on Shipping Fee with redemptions against 'QC' Province in Payment page2:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & QST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_QST_Province_QC_2.2_2.2_payment|
  
  
@Story-3433 
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & QST on Shipping Fee with redemptions against 'QC' Province in Payment page3:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & QST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_GST_QST_Province_QC_0_2_payment|  
  
  
@Story-3433 
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST & QST on Shipping Fee with redemptions against 'QC' Province in Payment page4:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST & QST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_GST_QST_Province_QC_5_0_payment|     
   
  
 
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST on Shipping Fee with redemptions against 'AB' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_Province_AB_0_0_payment|


@Story-3433
@Golden  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST on Shipping Fee with redemptions against 'MB' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_Province_MB_2.2_2.2_payment|
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST on Shipping Fee with redemptions against 'NT' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_Province_NT_0_2_payment|  
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for GST on Shipping Fee with redemptions against 'SK' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_Province_SK_5_0_payment|
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for HST on Shipping Fee with redemptions against 'NS' Province in Payment page1:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping HST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:ShippingOrder_HST_Province_NS_0_0_payment|


@Story-3433
@Golden  
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for HST on Shipping Fee with redemptions against 'NS' Province in Payment page2:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping HST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_HST_Province_NS_2.2_2.2_payment|
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for HST on Shipping Fee with redemptions against 'NB' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping HST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_HST_Province_NB_0_2_payment|  
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher charged with correct taxes for HST on Shipping Fee with redemptions against 'NL' Province in Payment page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount in shipping Bonus Bank
And teacher enters amount in shipping Paper coupons
And teacher clicks on Apply in Shipping section
When teacher navigates to Payment page
Then tax rates for Shipping HST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_HST_Province_NL_5_0_payment|
  
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Teacher redeems entire shipping fee:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher add items from different Student and Teacher clubs
And Teacher navigates to rewards & coupons page
And teacher enters amount equal to the [ShippingFee] in shipping Bonus Bank and paper Bonus coupon
When teacher navigates to Payment page
Then tax rates for Shipping GST display correctly
And Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly
And ShippingAmountOwing(post tax & redemptions) displays correctly
And Total Amount Owing displays Student Club total + TeacherCatalogues Total + Shipping Total


Examples: 
  |UsingData                                                                        |
  |Sprint_11.3:dev35:Golden:ShippingOrder_GST_Province_YT_Redeem_Entire_payment|
  
  
  
@Story-3433 
@Golden
@Payment
@Priority1
Scenario Outline:Shipping Fee displays FREE on payment page when order qualifies for free shipping:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher add Teacher and Student club items to cart equal to [Shipping Threshold]
And teacher navigates to coupons & Rewards page
And teacher receives FREE shipping
When teacher navigates to Payment page
Then Shipping & Handling displays FREE! in blue header
And the redemptions section does not display, only the blue header displays for shipping

Examples: 
  |UsingData                                                  |
  |Sprint_11.3:dev35:Golden:ShippingOrder_FreeShipping_payment|      