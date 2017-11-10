Feature: Payment
  This feature is to validate the expiry year for the CreditCard

 
Background: 
  Given teacher open rco-scholastic web site


@SCSCOD-5457
@Payment
Scenario Outline:Expiry date on credit card dropdown on Payment page should display 15 years:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects credit card as payment
When teacher updates card info
And teacher clicks on Expiration year
Then number of years in the dropdown should display from current year to current year+15

Examples: 
|UsingData |
|Dev_PaymentPage_Expiry year_paymentCC |

@SCSCOD-5457
@Payment
Scenario Outline: Expiration year on combination of cc and checks on Payment page should display 15 years:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds “ItemInformation” from YTO page
And teacher navigates to payment page
And teacher selects combination of credit card and cheques as payment
When user selects Add a New card
And teacher updates card info
And teacher clicks on Expiration year
Then number of years in the dropdown should display from current year to current year+15

Examples: 
|UsingData |
|Dev_PaymentPage_Expiry year_payment_combCCandChq |

@SCSCOD-5457
@Payment
Scenario Outline:Expiration year on credit card form should show 15 years on Billing and Payments on MyAccount:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher clicks on My Account link
And teacher clicks on Billing and Payments
When teacher clicks on Add a card
And teacher clicks on Expiration year
Then number of years in the dropdown should display from current year to current year+15

Examples: 
|UsingData   |
|Dev_PaymentPage_Expiry year_myacc |

