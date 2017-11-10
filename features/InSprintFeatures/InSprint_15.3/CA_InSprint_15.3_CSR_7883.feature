Feature: RCO order issue with alternate shipping address [CSR]
	This feature is to validate the RCO order issue with alternate shipping address [CSR] scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site 


@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@1
Scenario Outline: Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank redemptions:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank amount for YTO items such that the total amount is $0
And CSR clicks on Apply on YTO section
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBank:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBank:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBank:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:BounsBank:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:BounsBank:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:BounsBank:ContinueCheckout:Disabled:State |

@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@2
Scenario Outline: Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with paper coupon redemptions:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank amount for YTO items such that the total amount is $0
And CSR clicks on Apply on YTO section
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:PaperCoupon:ContinueCheckout:Disabled:State |
   
@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@3
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank and paper coupon redemptions:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank and paper coupon amount for YTO items such that the total amount is $0
And CSR clicks on Apply on YTO section
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:BonusBankPaperCoupon:ContinueCheckout:Disabled:State |
  
@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@4
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank redemptions and POPs:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank amount for YTO items such that the total amount is same as one of the POPs payment
And CSR clicks on Apply on YTO section
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects POPs payment that makes the total amount $0
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:BounsBankPOP:ContinueCheckout:Disabled:State |
  
@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@5
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with paper coupon redemptions and POPs:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable paper coupon amount for YTO items such that the total amount is same as one of the POPs payment
And CSR clicks on Apply on YTO section
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects POPs payment that makes the total amount $0
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:PaperCouponPOP:ContinueCheckout:Disabled:State |
  
@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@6
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with POPs:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects POPs payment that makes the total amount $0
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:POP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:POP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:POP:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:POP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:POP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:POP:ContinueCheckout:Disabled:State |
  
@CSR	
@Payment
@Priority1
@SCSCOD-7883
@Sprint_15.3
@7
Scenario Outline:Continue checkout button disabled on Payment page when a section on alternate shipping is missing value and the order total amount is $0 with bonus bank, paper coupon redemptions and POPs:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds YTO items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable bonus bank and paper coupon amount for YTO items such that the total amount is same as one of the POPs payment
And CSR clicks on Apply on YTO section
When CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects POPs payment that makes the total amount $0
And CSR enables alternate shipping
And CSR enters alternate shipping without [missing field]
Then Continue checkout button remains disabled
Examples: 
| UsingData                                                         |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:PostalCode |
| InSprint15.3:CSR:CA:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:City |
| InSprint15.3:CSR:US:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:Address1 |
| InSprint15.3:CSR:US:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:ZipCode |
| InSprint15.3:CSR:US:AlternateShipping:BounsBankPaperCouponPOP:ContinueCheckout:Disabled:State |