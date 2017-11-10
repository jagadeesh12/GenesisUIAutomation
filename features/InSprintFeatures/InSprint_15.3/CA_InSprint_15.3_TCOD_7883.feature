Feature: RCO order issue with alternate shipping address
	This feature is to validate the RCO order issue with alternate shipping address scenarios

 
Background: 
	Given teacher open rco-scholastic web site


@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@1
Scenario Outline: Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank redemptions:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable bonus bank amount for YTO items such that the total amount is $0
And teacher clicks on Apply on YTO section
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBank:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBank:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBank:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBank:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBank:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBank:ContinueCheckout:Disabled:State |

@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@2
Scenario Outline: Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with paper coupon redemptions:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable paper coupon amount for YTO items such that the total amount is $0
And teacher clicks on Apply on YTO section
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:State |
   
@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@3
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank and paper coupon redemptions:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable bonus bank and paper coupon amount for YTO items such that the total amount is $0
And teacher clicks on Apply on YTO section
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:State |
  
@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@4
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank redemptions and POPs:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable bonus bank amount for YTO items such that the total amount is same as one of the POPs payment
And teacher clicks on Apply on YTO section
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher selects POPs payment that makes the total amount $0
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:State |
  
@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@5
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with paper coupon redemptions and POPs:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable paper coupon amount for YTO items such that the total amount is same as one of the POPs payment
And teacher clicks on Apply on YTO section
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher selects POPs payment that makes the total amount $0
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:State |
  
@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@6
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with POPs:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher selects POPs payment that makes the total amount $0
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:POP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:POP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:POP:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:POP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:POP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:POP:ContinueCheckout:Disabled:State |
  
@TCOD	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@7
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank, paper coupon redemptions and POPs:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable bonus bank and paper coupon amount for YTO items such that the total amount is same as one of the POPs payment
And teacher clicks on Apply on YTO section
When teacher navigates to [Payment] page from [Redeem & Rewards] page
And teacher selects POPs payment that makes the total amount $0
And teacher enables alternate shipping
And teacher enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:TCOD:CA:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:City |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:TCOD:US:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:State |