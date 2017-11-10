Feature: Authentication – Sign-out of DW
	This feature is to validate the Authentication – Sign-out of DW scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
	
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@1
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Order Entry page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                       |
  | SignOut_Successfully_OrderEntry |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@2
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Verify Account page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                          |
  | SignOut_Successfully_VerifyAccount |

################################# This scenario is not possible with the current rco-ca-csr build #################################
#@Authentication_SignOut
#@DWCACSR-1830
#@Priority1
#@3
#Scenario Outline: Pending items in one account is shown on the same account when CSR logs out and login:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#And CSR selects Cheques as payment
#And CSR navigates to [Confirm & Submit] page
#When CSR clicks ’Sign Out’ hyperlink
#And CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#Then CSR sees the pending items on Order Entry page
#Examples:
#  | UsingData                                      |
#  | SignOut_Successfully_PendingItems_SameAcccount |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@4
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Review Cart page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                       |
  | SignOut_Successfully_ReviewCart |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@5
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Rewards and Redemption page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                               |
  | SignOut_Successfully_RedemptionsRewards |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@6
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Payment page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                    |
  | SignOut_Successfully_Payment |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@7
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Confirm and Submit page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Cheques as payment
And CSR navigates to [Confirm & Submit] page
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                          |
  | SignOut_Successfully_ConfirmSubmit |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@8
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Order Source page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                        |
  | SignOut_Successfully_OrderSource |
  
@Authentication_SignOut
@DWCACSR-1830
@Priority1
@9
Scenario Outline: CSR signs out successfully when ‘Sign Out’ hyperlink is clicked on Locate Account page:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
When CSR clicks ’Sign Out’ hyperlink
Then CSR sees the login screen
Examples:
  | UsingData                          |
  | SignOut_Successfully_LocateAccount |