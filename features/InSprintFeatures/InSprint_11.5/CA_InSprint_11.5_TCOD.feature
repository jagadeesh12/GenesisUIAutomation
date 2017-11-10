Feature: InSprint_11.5
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site



@DollarsToSpend
@Priority1
@SCSCOD-4267
Scenario Outline:Teacher selects an item by Selecting a grade from Grade level dropdown in DTS model window:[<UsingData>]
                	
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher selects a grade
When teacher selects an item from Make Selection window
Then selected item displays in the Current Selection section
	
Examples:
  | UsingData                                		 	|
  | BTS:DollarsToSpend:Teacher_DTS_Selection_Grade |
  
  
@DollarsToSpend
@Priority1
@SCSCOD-4267
Scenario Outline:Teacher selects an item by searching with specific term in DTS model window:[<UsingData>]
                	
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher sees the Dollars to spend promotion
And teacher clicks on Make Selection button
And teacher searches for a [qualifying Item number]
And item displays in results in DTS model
When teacher selects an item from the Make Selection window
Then selected item displays in Current Selection section for DTS
	
Examples:
  | UsingData                                		 	|
  | BTS:DollarsToSpend:Teacher_DTS_Selection_Search_ValidSearch |
  
  
# Commented by Satnam , This should be manual test as data keeps on changing
#@DollarsToSpend
#@Priority1
#@SCSCOD-4140
#Scenario Outline:Teacher get result with valid search in DTS model window when he is in other than first page:[<UsingData>]
#
#Given teacher login into the application by providing [UserInformation]
#And teacher selects “enter classroom order” from home page
#And teacher adds student club items to cart with [minumum amount]
#And Teacher navigates to Review Your Cart page
#And Teacher navigates to rewards & coupons page
#And teacher views Dollars to Spend promotion
#And teacher clicks on Make Selection button
#And teacher searches for a [qualifying Item number]
#And teacher navigates to page2 in DTS model window
#When teacher searches for a [qualifying Item number]
#Then item displays in results in DTS model
#
#Examples:
#|UsingData													         |
#|InSprint_11.5:Dev35:Teacher_DTS_with_valid_Search_Otherthanfirstpage|



Scenario Outline:Teacher selects specific free pick item and checkout:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And Teacher enters [Free Pick Coupon] on rewards and coupons page
And Free pick modal displays
When teacher searches for [Dr. Seuss: What Was I Scared Of?]
And teacher selects [Dr. Seuss: What Was I Scared Of?] from the results
And teacher clicks on Confirm Selection button
And teacher proceeds to checkout from rewards and coupons page
Then Free pick is displayed in coupons section with correct details in Confirm & Submit page
And teacher submit the order
And Free pick is displayed in coupons section with correct details in Confirmation page

Examples: 
|UsingData|
|InSprint_11.5:Dev35:Golden:TeacherOrder_SpecificFreePickItem_Checkout|



Scenario Outline:Correct alternative shipping address checkbox message should be seen in payment page:[<UsingData>]

Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds “ItemInformation” from YTO page
When teacher navigates to payment page from YTO page
Then “Check this box if your school cannot currently recieve deliveries and you would like to provide an alternative shipping address.” message should be seen

Examples: 
|UsingData|
|InSprint_11.5:Dev35:TeacherOrder_Paymentpage_AlternativeShippingAddressChkbox_MSG|	



@SCSCOD-4464
@Priority1
Scenario Outline:Teacher sees entered items in cart when browser is closed and login with same account:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds “ItemInformation” from YTO page
And teacher close the browser without logging out
When teacher open rco-scholastic web site once again and login with same account
Then items entered should be auto saved
 
 Examples:
  | UsingData                                                |
  | InSprint_11.5:Dev35:Teacher_ItemsSaved_BrowserClose_Login|	
  

@SCSCOD-4009
@TeacherDesk
@Priority2
Scenario Outline:Teacher navigates to Order Details page for recent booking when clicked on View link present in YOUR ORDERS section in Teacher's Desk:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds items to cart and submit the order
And teacher navigates to Teachers Desk
When teacher clicks on View link
Then teacher should navigate to order details page for recent booking

Examples:
  | UsingData                                                           |
  | InSprint_11.5:Dev35:TeacherOrder_TeacherDesk_CurrentMonthRewardsLink|
  
  
  
@SCSCOD-4009
@TeacherDesk 
@Priority2
Scenario Outline:Submitted to Scholastic and Shipped options should not be highlighted in YOUR ORDERS section in Teacher's Desk if no orders are submitted:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
When teacher navigates to Teacher's Desk from home page
Then no information should be displayed under "Order Status" section
And Submitted to Scholastic and Shipped options should not be highlighted

Examples:
  | UsingData                                              |
  | InSprint_11.5:Dev35:TeacherOrder_OrderStatus_NewTeacher|
  
  

@SCSCOD-4009
@TeacherDesk
@Priority2
Scenario Outline:Submitted to Scholastic option should be highlighted in YOUR ORDERS section in Teacher's Desk if any order is submitted:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher adds items to cart and submit the order
When teacher navigates to Teachers Desk
Then referenec number and submitted date should be displayed under "Order Status" section for recent order
And Submitted to Scholastic option should be highlighted
And Shipped option should not be highlighted

Examples:
  | UsingData                                              |
  | InSprint_11.5:Dev35:TeacherOrder_OrderStatus_SubmittedToScholastic|
  
  

@SCSCOD-4009
@TeacherDesk
@Priority2 
Scenario Outline:Shipped option should be highlighted in YOUR ORDERS section in Teacher's Desk if any order is shipped which is booked:[<UsingData>]

Given teacher whose order is shipped logs into the application by providing [UserInformation]
When teacher navigates to Teacher's Desk from home page
Then Submitted to Scholastic and Shipped options should be highlighted

Examples:
  | UsingData                                           |
  | InSprint_11.5:Dev35:TeacherOrder_OrderStatus_Shipped|  