Feature: InSprint_13.4 PCOD
	This feature is used to validate all scenarios

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-360    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
 
@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5   
Scenario Outline:Parent with child connected to teacher for AB Province with applicable taxes as GST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to AB Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_AB|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for MB Province with applicable taxes as GST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to MB Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_MB|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for NT Province with applicable taxes as GST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to NT Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_NT|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for YT Province with applicable taxes as GST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to YT Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_YT|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for SK Province with applicable taxes as GST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to SK Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_SK|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for BC Province with applicable taxes as GST and PST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to BC Province with applicable tax as GST and PST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_BC|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for NL Province with applicable taxes as HST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to NL Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_NL|

@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for NB Province with applicable taxes as HST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to NB Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_NB|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for NS Province with applicable taxes as HST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to NS Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_NS|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for ON Province with applicable taxes as HST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to ON Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_ON|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for PE Province with applicable taxes as HST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to PE Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_PE|



@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher for QC Province with applicable taxes as GST and QST:[<UsingData>]
 
Given parent with 1 child connected to teacher belonging to QC Province with applicable tax as GST and QST
And Parent login in with valid [username] and [password]
And parent add items to the cart
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_ChildGST_QC|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and GST/PST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
When parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all child orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_MultipleChilds_GST_GSTPST|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and HST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with HST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and HST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays


Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_MultipleChilds_GST_HST|

@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST/PST and HST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other with HST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and HST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_MultipleChilds_GSTPST_HST|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with 4 children all connected to different teacher each belonging to GST, GST/PST, HST, GST/QST:[<UsingData>]

Given parent with 4 child connected to different teacher belonging to provinces one with GST,GST/PST,HST and GST/QST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 4 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And Childname3's Orders - <Child3's Pretax subtotal>
And Childname4's Orders - <Child4's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for 4 children - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_PaymentPage_4MultipleChilds_Taxes|

@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with 2 children connected to different teacher, one teacher belongs to school which is PST exempt:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but PST tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and GST/PST exempted- <tax subtotal for all child orders> (Tax for child connected to PST tax exempted teacher, only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_1Child_DifferentTeacher_2GSTPST_PSTExempt|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent adds items which is PST tax exempt for a child connected to teacher with GST/PST school:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST/PST and item as PST tax exempt
And Parent login in with valid [username] and [password]
And parent add items to cart which are PST exempt
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders>(Only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_Child_GSTPST_ItemPSTExempt|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Change child selections to a child connected to teacher belonging to different school:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST
And Parent login in with valid [username] and [password]
And parent add items to cart for 1 child
And parent navigates to Shipping & Payment page
And Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of child1 orders>
And Tax Subtotal - <tax subtotal for child1 orders>
And Parent navigates back to Shopping cart page from shipping & payment page
When few items are assigned to child2
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all child orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_GSTPST_GST|


@DWCAPCOD-360
@ShippingAndPayment
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher, one teacher belonging to tax exempt school:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and GST/PST - <tax subtotal for all child orders> (Tax for child connected to tax exempted teacher is 0)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays


Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_GSTPST_GSTPST_GSTPSTExempt|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-361    		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
     
@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Last Name:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Last Name
Then Last Name field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyLastName_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Address 1:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Address 1
Then Address 1 field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyAddress1_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Parent selects Payment dropdown:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
Then Section title “PAYMENT METHOD” displays
And payment dropdown displays with grey text “Select a Payment Method”
And options for dropdown displays “Credit Card”
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_PaymentDropdown_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Postal Code field:[<UsingData>]
	
Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Postal Code
Then Postal Code field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyPostalCode_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Parent selects Credit card as Payment:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects Credit card from dropdown
Then another dropdown populates with grey text “Select a Card”
And options for dropdown display “Add a New Card”
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_CCDropdown_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for City field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for City
Then City field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.4:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyCity_ContinueCheckOutBtn|
      
@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Parent selects “Add a New Card”:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
Then “NAME ON CARD”, CARD# field displays with text fields
And “We accept American Express, Visam and MasterCard only.” text displays under CARD# textbox
And EXPIRATION DATE (month dropdown and year dropdown) and SECURITY CODE fields displays
And BILLING INFORMATION SECTION displays with FIRST NAME, LAST NAME, ADDRESS 1, ADDRESS 2, POSTAL CODE, CITY, PROVINCE, COUNTRY And PHONE NUMBER fields
And COUNTRY dropdown has US and CA values
And “SAVE THIS CARD” checkbox is disabled by default
And CANCEL button displays
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Name On Card:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Name on Card
Then Name on Card field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyCardName_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Province field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Province
Then Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyProvince_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Card# field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Card#
Then Card# field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyCardNumber_ContinueCheckOutBtn|

@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Phone number field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Phone number
Then Phone Number field is highlighted in Yellow
And Continue Checkout button is disabled
 
Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyPhoneNumber_ContinueCheckOutBtn|

@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Expiration date month:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for expiration date month
Then Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyDateMonth_ContinueCheckOutBtn|

@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Expiration date year:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for expiration date year
Then Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyYear_ContinueCheckOutBtn| 


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for Security Code field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for Security Code
Then Security code field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptySecurity_ContinueCheckOutBtn|


@DWCAPCOD-361
@ShippingAndPayment
@Priority2
@Sprint-13.5
Scenario Outline:Continue Checkout button is disabled when parent enters valid data in all fields except for First Name:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent add items to cart and navigate to shopping cart
And parent navigates to Shipping & Payment page
When parent selects “Add a new Card” from credit card dropdown
And enters valid data in all credit card fields except for First Name
Then First Name field is highlighted in Yellow
And Continue Checkout button is disabled

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_CreditCard_AddNewCard_EmptyFirstName_ContinueCheckOutBtn|




##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-96     		     #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        
     
@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Change child selections to a child connected to teacher belonging to different school:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST
And Parent login in with valid [username] and [password]
And parent add items to cart for 1 child
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of child1 orders>
And Tax Subtotal - <tax subtotal for child1 orders>
When Parent navigates back to Shopping cart page from submit your order page
And few items are assigned to child2
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
When parent navigates to Submit Your Order page
Then Payment section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all child orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_ChangeCilds_GSTPST_GST|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as GST:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
When parent selects New Visa card as payment and navigate to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_ShippingSection_1Child_GST|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as GST & PST:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST & PST
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
When parent selects New Master card as payment and navigate to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_1Child_GSTPST|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with child connected to teacher from Province with applicable taxes as HST:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as HST
And Parent login in with valid [username] and [password]
And parent adds items to cart
And parent navigates to Shipping & Payment page
And parent selects New Amex card as payment and navigate to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_1Child_HST|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and GST/PST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects New 5series Master card as payment and navigate to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and GST_PST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_2Childs_DifferentTeacher_GST_GSTPST|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST and HST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST and other with HST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects saved Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST and HST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_2Child_DifferentTeacher_GST_HST|

@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher from different provinces with GST/PST and HST:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other with HST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects saved Master card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and HST - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_2Child_DifferentTeacher_GSTPST_HST|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with 4 children all connected to different teacher each belonging to GST, GST/PST, HST, GST/QST:[<UsingData>]

Given parent with 4 child connected to different teacher belonging to provinces one with GST,GST/PST,HST and GST/QST
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 4 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects saved Amex card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And Childname3's Orders - <Child3's Pretax subtotal>
And Childname4's Orders - <Child4's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for 4 children - <tax subtotal for all chlid orders>
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_4Child_DifferentTeacher_GST_GSTPST_HST_GSTQST|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with multiple children connected to different teacher, one teacher belonging to tax exempt school:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
And parent selects New Visa card as payment and navigate to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and GST/PST - <tax subtotal for all child orders> (Tax for child connected to tax exempted teacher is 0)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_GSTPST_GSTPST_GSTPSTExempt|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent with 2 children connected to different teacher, one teacher belongs to school which is PST exempt:[<UsingData>]

Given parent with 2 child connected to different teacher belonging to provinces one with GST/PST and other is GST/PST but PST tax exempt school
And Parent login in with valid [username] and [password]
And parent add items to the cart assigning to 2 different childs belonging to different provinces
And parent navigates to Shipping & Payment page
When parent selects New Visa card as payment and navigate to Submit Your Order page
Then Order Summary section displays with <Childname1>'s Orders - <Child1's Pretax subtotal>
And Childname2's Orders - <Child2's Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal for GST/PST and GST/PST exempted- <tax subtotal for all child orders> (Tax for child connected to PST tax exempted teacher, only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays
Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_2Child_DifferentTeacher_2GSTPST_PSTExempt|


@DWCAPCOD-96
@SubmitYourOrderPage
@Priority1
@Sprint-13.5
Scenario Outline:Parent adds items which is PST tax exempt for a child connected to teacher with GST/PST school:[<UsingData>]

Given parent with 1 child connected to teacher belonging to Province with applicable tax as GST/PST and item as PST tax exempt
And Parent login in with valid [username] and [password]
And parent add items to cart which are PST exempt
And parent navigates to Shipping & Payment page
And parent selects saved Visa card as payment
When parent navigates to Submit Your Order page
Then Order Summary section displays with <Childname>'s Orders - <Pretax subtotal>
And OrderSubtotal - <Pre-tax subtotal of all child orders>
And Tax Subtotal - <tax subtotal for all child orders>(Only GST is charged)
And Total Amount Due - <Order Subtotal + Tax Subtotal> displays
And Payment section displays with Amount paid by Credit Card text
And XXXX-XXXX-XXXX-<LastFourDigitsOfCC> and Total Amount Due displays

Examples:
|UsingData|
|InSprint13.5:PCOD:ParentOrder_SubmitYourOrder_1Child_DifferentTeacher_GSTPST_ItemPSTExempt|


    
    




