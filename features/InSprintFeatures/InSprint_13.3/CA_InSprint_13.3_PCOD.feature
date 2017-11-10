Feature: InSprint_13.2 PCOD
	This feature is used to validate all scenarios

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-150    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
   
@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent views the coupon code section:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent add item from PDP page and navigates to shopping cart page
Then Coupon code section displays with “HAVE A COUPON?” and text box to enter coupon code with default text
And Apply button displays
And a note “Please note: Only three Coupons can be applied to an order.”

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_CouponCodeSection|


@DWCAPCOD-105
@ReviewCart
@Priority2
Scenario Outline:Parent can enter letters, numbers, special characters in coupon code field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters letters in coupon code field
Then data is accepted and no error message is displayed
When parent enters numbers in coupon code field
Then data is accepted and no error message is displayed
When parent enters special characters along with numbers in coupon code field
Then data is accepted and no error message is displayed
When parent enters special characters along with letters in coupon code field
Then data is accepted and no error message is displayed

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_CouponCodecharactersAccepted|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent enters a non-existing coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters non-existing coupon code
And parent clicks “Apply” button
Then error message “The system does not recognize the coupon code you have entered. Please check the coupon and try again. If the coupon code is correct, please contact customer service at 1-800-SCHOLASTIC (1-800-724-6527).” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_Non-ExistingCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority2
Scenario Outline:Active/Inactive state of the Apply button for coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
And Apply button for coupon code is disabled by default
When parent enters 1 characters in coupon code
Then “Apply” button is enabled


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ActiveInactiveStateof_ApplyButton_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent can apply Free pick coupon on a cart with qualifying minimum amount:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart meeting the [minimum amount] from PDP page and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
Then Free pick modal displays

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ExistingCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent cannot apply already redeemed coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters already redeemed coupon code
Then error message “Our records indicate that coupon code "XXXXX" has already been redeemed.” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_RedeemedCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent cannot redeem expired coupon code:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters expired coupon code
Then error message “Our records indicate that coupon code "XXXXX" has expired.” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ExpiredCouponCode_ShoppingCart|


@DWCAPCOD-105
@ReviewCart
@Priority1
Scenario Outline:Parent cannot redeem teacher freepick coupon:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add item from PDP page and navigates to shopping cart page
When parent enters teacher freepick coupon code
Then error message “The system does not recognize the coupon code you have entered. Please check the coupon and try again. If the coupon code is correct, please contact customer service at 1-800-SCHOLASTIC (1-800-724-6527).” displays


Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_TeacherFreePickCouponCode_ShoppingCart|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-77    				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        



@DWCAPCOD-77
@ConnectToTeacher
@Priority1
Scenario Outline:Selected school address displays on Find your Teacher Step3:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent searches with a valid postal code
When parent selects a school
And clicks Next
Then selected school address displays with School name, street, City, province, postal code

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_Validpostal_SchoolDetails|


@DWCAPCOD-77
@ConnectToTeacher
@Priority2
Scenario Outline:Parent clicks on “Can't Find Your Teacher” link:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent searches with a valid postal code
And parent selects a school
And clicks Next
When parent clicks on “Can't Find Your Teacher” link 
Then tool tip message “At this time, there are no teachers at the selected school who are accepting Scholastic Reading Club online orders. Encourage your child's teacher to participate in Reading Club - it's a great way to build reading excitement and get books and resources for the classroom!” displays

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CantFindTeacher|


@DWCAPCOD-77
@ConnectToTeacher
@Priority2
Scenario Outline:Parent selects a school with no teacher's registered at the school:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent searches with a valid postal code
And parent selects a school with no teachers
And clicks Next
When parent clicks on “Select Teacher” dropdown 
Then tool tip message “At this time, there are no teachers at the selected school who are accepting Scholastic Reading Club online orders. Encourage your child's teacher to participate in Reading Club - it's a great way to build reading excitement and get books and resources for the classroom!” displays

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_School_NoTeacherRegistered|

@DWCAPCOD-77
@ConnectToTeacher
@Priority3
Scenario Outline:Parent clicks on Back on Step 3 of Find Your Teacher:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent searches with a valid postal code
And parent selects a school
And clicks Next
When parent clicks on Back
Then Find Your Teacher Step 2 with school selection should display


Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_BackBtn_Step3|

@DWCAPCOD-77
@ConnectToTeacher
@Priority3
Scenario Outline:Parent clicks on Close(X) on Step 3 of Find Your Teacher:[<UsingData>]

Given parent clicks on “Connect to your Teacher” option
And parent clicks on “Find Your Teacher”
And parent searches with a valid postal code
And parent selects a school
And clicks Next
When parent clicks on “Close (X)”
Then Connect to Your Teacher modal closes and the entered information is not saved

Examples:
|UsingData|
|InSprint12.4:PCOD:Parent_ConnectYourTeacher_CloseIcon_Step3|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-874   				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-874
@ReviewCart
@Priority1
Scenario Outline:Parent can apply Free pick coupon on cart with qualifying minimum amount:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
And parent clicks “Apply” button
Then Free pick modal displays

Examples:
|UsingData|
|InSprint13.3:PCOD:Parent_ValidCouponCode_MinimumAmt_ShoppingCart|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-356   				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent clicks through Pagination links on search results:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent searches for a keyword with more than 10 results
And parent clicks on Pagination links
Then 10 results display on each page

Examples:
| UsingData|
|InSprint13.3:PCOD:ParentOrder_FreepickCoupon_10resultsperpage|
      
      
      
@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Search on Freepick modal displays only items less than or equal to the coupon amount displays:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon] 
And Free pick modal displays
When parent searches for a [search term]
Then items less than or equal to the [coupon amount] displays in Freepick modal

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_CompareItemsPrice_SearchKeyword|
  
@DWCAPCOD-356
@ReviewCart
@Priority1 
Scenario Outline:Parent selects an item by searching for a qualifying item on Free pick modal:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And Free pick modal displays
When parent searches for a [qualifying Item number]
Then searched item(s) should display in result
When parent selects an item from the results
Then selected item displays in Current Selection section

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_QualifyingItemSearch|


@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent selects an item by searching with Author Name:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And Free pick modal displays
And parent searches for a [Author Name]
Then searched item(s) should display in result w.r.t author
When parent selects an item from the results
Then selected item displays in Current Selection section

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCouponQualifyingItemSearch_Author|


@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent selects an item by searching with Item title:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And Free pick modal displays
And parent searches for a [Item title]
Then searched item(s) should display in result
When parent selects an item from the results
Then selected item displays in Current Selection section

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCouponQualifyingItemSearch_Title|

      
      
@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:Parent cannot be able to find a non-qualifying item on free pick modal:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent searches item which is greater than coupon amount
Then no results message displays
When parent searches teacher club item
Then no results message displays
When parent searches expired item
Then no results message displays

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_NonQualifyingItem|



@DWCAPCOD-356
@ReviewCart
@Priority1
Scenario Outline:No results are displayed when teacher searches for a term with no results:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
And parent searches for a [search term] with no results
Then no results message displays
    
Examples: 
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_NoResults|
      
      
      
            
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-875   				 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@DWCAPCOD-875
@ReviewCart
@Priority2
Scenario Outline:Parent clicks through Pagination links on Grade level results:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent selects a grade from grade dropdown
And parent clicks on Pagination links
Then 10 results display on each page
Examples:
|UsingData|
|InSprint13.3:PCOD:parentOrder_FreepickCouponresult|


@DWCAPCOD-875
@ReviewCart
@Priority1
Scenario Outline:Parent cannot find Teacher Club items in Grade level results on Free pick modal:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
And parent enters [Free Pick Coupon]
When parent clicks on grade level dropdown
Then teacher catalogues does not display in list of grades

Examples:
| UsingData|
|InSprint13.3:PCOD:ParentOrder_FreepickCoupon_teachercat|



@DWCAPCOD-875
@ReviewCart
@Priority1
Scenario Outline:Items displayed in Free pick modal must not exceed maximum dollar value:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page meeting the [minimum amount] and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
And parent clicks on grade level dropdown and select a grade from dropdown
Then items less than or equal to the [coupon amount] displays in Freepick modal

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_CompareItemsPrice_CouponAmt|


@DWCAPCOD-875
@ReviewCart
@Priority1
Scenario Outline:Parent cannot apply coupon on a cart which does not meet the minimum cart total:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart from PDP page less than the [minimum amount] and navigates to shopping cart page
When parent enters [Free Pick Coupon] 
Then error message “Your order does not meet the “XXXXX” coupon requirements. Please check the coupon for details.” displays

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_FreePickCoupon_without_minimum_amount|


   
   
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-70        		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################             


@DWCAPCOD-70
@ShippingAndPayment
@Priority1
Scenario Outline:Shipping address for parent with 1 child:[<UsingData>]

Given parent has only one child configured
And Parent login in with valid [username] and [password]
And parent add items to cart
When parent navigates to Shipping & Payment page
Then Shipping section displays with “<Childname>'s items will be shipped to:”
And teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_ShippingPayment_ShippingSection_1Child|




@DWCAPCOD-70
@ShippingAndPayment
@Priority1
Scenario Outline:Shipping address for parent with 2 child connected to same teacher:[<UsingData>]

Given parent has 2 childs connected to same teacher
And Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And select different child for second item added
When parent navigates to Shipping & Payment page
Then Shipping section displays with “<Child1name>'s items will be shipped to:”
And teacher's first and last name with school address <School Name, Street, city,Country, postal code> displays
And “Child2name's items will be shipped to:”
And child2's teacher first and last name with school address <School Name, Street, city,Country, postal code> displays
    
Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_ShippingPayment_ShippingSection_2Child|


@DWCAPCOD-70
@ShippingAndPayment
@Priority1
Scenario Outline:Shipping address for parent with 2 child connected to different teacher:[<UsingData>]

Given parent has 2 childs connected to different teacher
And Parent login in with valid [username] and [password]
And parent add 2 items to cart and navigate to shopping cart
And reassigns few items to child2
When parent navigates to Shipping & Payment page
Then Shipping section displays with “<Child1name>'s items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
And “Child2name's items will be shipped to:”
And teacher2's first and last name with school address <School Name1, Street, city,Country, postal code> displays
   
Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_ShippingPayment_ShippingSection_1Child_DifferentTeacher|


@DWCAPCOD-70
@ShippingAndPayment
@Priority1
Scenario Outline:Shipping address for parent with 3 children 2 connected to same teacher and other to different teacher:[<UsingData>]

Given parent has 3 children 2 connected to same teacher and other to different child
And Parent login in with valid [username] and [password]
And parent add 3 items to cart and navigate to shopping cart
And reassigns few items to child2 and child3
When parent navigates to Shipping & Payment page
Then Shipping section displays with “<Child1name>'s items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
And “Child2name's items will be shipped to:”
And teacher2's first and last name with school address <School Name2, Street, city,Country, postal code> displays
And “Child3name's items will be shipped to:”
And teacher1's first and last name with school address <School Name1, Street, city,Country, postal code> displays
    
Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_ShippingPayment_ShippingSection_3Child|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-873        		 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################             


@DWCAPCOD-873
@ShippingAndPayment
@Priority2
Scenario Outline:Submit Your Order is not clickable on Step header when parent is on shipping & payment:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart
When parent navigates to Shipping & Payment page
And clicks on Submit Your Order on step header
Then Submit Your Order is not clickable

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_ShippingPayment_StepHeader_Click|
      
      
      
@DWCAPCOD-873
@ShippingAndPayment
@Priority2
Scenario Outline:Parent views the step header on Shipping & Payment page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart
When parent navigates to Shipping & Payment page
Then checkout phases 1) SHIPPING & PAYMENT 2) SUBMIT YOUR ORDER displays
And SHIPPING & PAYMENT is highlighted and not clickable

Examples:
|UsingData|
|InSprint13.3:PCOD:ParentOrder_ShippingPayment_StepHeader|    