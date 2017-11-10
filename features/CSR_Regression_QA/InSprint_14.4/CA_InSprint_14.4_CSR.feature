Feature: Validation of CSr stories for Sprint 14.4
	This feature is used to validate the Sprint 14.4 stories for CSR
	
  Background:
    Given CSR opens the rco-scholastic web site
    
##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6165    	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################
  
@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: CSR can use free shipping coupon on Student club items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                   |
  | QA:CSR_ManualRewards_FreeShipping_StudentClubs |

@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: CSR can use free shipping coupon on Teacher catalogue items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Catalogue items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                       |
  | QA:CSR_ManualRewards_FreeShipping_TeacherCatalogue |

@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: CSR can use free shipping coupon when Student Club orders is reduced to zero:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR applies redeemable paper coupon amount as the same for total amount for Student Club items
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                             |
  | QA:CSR_ManualRewards_FreeShipping_StudentClubs_ZeroOrder |
  
@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: CSR can use free shipping coupon when Teacher Catalogue orders is reduced to zero:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Catalogue items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR redeemable applies bonus bank amount as the same for total amount for Teacher Catalogue items
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                                 |
  | QA:CSR_ManualRewards_FreeShipping_TeacherCatalogue_ZeroOrder |

@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: CSR sees free shipping coupon removed when ‘X’ icon is clicked:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
And CSR clicks the ‘X’ icon next to coupon
Then free shipping coupon is removed from order
And CSR sees original amount for shipping
Examples:
  | UsingData                                           |
  | QA:CSR_ManualRewards_FreeShipping_StudentClubs_Removed |

@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Free shipping coupon removed when order amount qualifies for automatic free shipping [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
And CSR returns to Review Cart page
And CSR increases the quantity of first item in cart
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR sees the automatic free shipping applied to order
Examples:
  | UsingData                                                          |
  | QA:CSR_ManualRewards_FreeShipping_Removed_NoPaidShipping_StudentClubs |

@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Free shipping coupon remains when order amount does not qualify for automatic free shipping [CSR]:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart that is below the free shipping
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
And CSR returns to Review Cart page
And CSR decreases the quantity of first item in cart
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then free shipping coupon remains on the order
Examples:
  | UsingData                                           |
  | QA:CSR_ManualRewards_FreeShipping_Remains_StudentClubs |

@Coupon-FreeShipping-CSR
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: CSR cannot apply free shipping coupon when automatic free shipping is applied:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR enters free shipping coupon
And CSR clicks apply on coupon code section
Then an error message is displayed
And free shipping coupon is not applied to order
Examples:
  | UsingData                                                                    |
  | QA:CSR_ManualRewards_FreeShipping_NotApplied_AutomaticFreeShipping_StudentClubs |

#@Coupon-FreeShipping-CSR
#@SCSCOD-6165
#@Priority1
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: CSR cannot apply free shipping coupon when bonus bank is redeemed on the paid shipping amount:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart that is below the free shipping
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR applies redeemable bonus bank as the same for total amount for Paid Shipping
#When CSR enters free shipping coupon
#And CSR clicks apply on coupon code section
#Then an error message is displayed
#And free shipping coupon is not applied to order
#Examples:
#  | UsingData                                        					|
#  | CSR_ManualRewards_FreeShipping_PaidShippingisZero_BonusBankRedeemed |

#@Coupon-FreeShipping-CSR
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: CSR sees free shipping coupon on Confirm and Submit page:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Club items to the cart that is below the free shipping
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR applies redeemable bonus bank as the same for total amount for Paid Shipping
#When CSR enters free shipping coupon
#And CSR clicks apply on coupon code section
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#And CSR selects Cheques as payment
#And CSR navigates to [Confirm & Submit] page
#Then CSR sees coupon layer on the Confirm and Submit page
#And free shipping coupon is shown in the coupon layer
#Examples:
#  | UsingData                                        		 |
#  | CSR_ManualRewards_FreeShipping_CouponShown_ConfirmSubmit |
# 
#@Coupon-FreeShipping-CSR
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17  
#Scenario Outline: Free shipping coupon is shown in the order XML file [CSR]:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Club items to the cart that is below the free shipping
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR applies redeemable bonus bank as the same for total amount for Paid Shipping
#When CSR enters free shipping coupon
#And CSR clicks apply on coupon code section
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#And CSR selects Cheques as payment
#And CSR navigates to [Confirm & Submit] page
#And CSR submits the order 
#Then free shipping coupon appears in the order XML
#Examples:
#  | UsingData                                        	|
#  | CSR_ManualRewards_FreeShipping_CouponShown_OrderXML |
#
#@Coupon-FreeShipping-CSR
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: Free shipping coupon is shown in the ‘View Order Details’ link [CSR]:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Club items to the cart that is below the free shipping
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR applies redeemable bonus bank as the same for total amount for Paid Shipping
#When CSR enters free shipping coupon
#And CSR clicks apply on coupon code section
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#And CSR selects Cheques as payment
#And CSR navigates to [Confirm & Submit] page
#And CSR submits the order
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR selects the ‘View Order Details’ for the recent order
#Then CSR sees coupon layer on the View Order Details page
#And free shipping coupon is shown in the coupon layer
#Examples:
#  | UsingData                                        |
#  | CSR_ManualRewards_FreeShipping_CouponShown_ViewOrderDetails |
#          
#@Coupon-FreeShipping-CSR
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: CSR cannot apply free shipping coupon when it has expired:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart that is below the free shipping
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#When CSR enters free shipping coupon that has expired
#And CSR clicks apply on coupon code section
#Then an error message is displayed
#And free shipping coupon is not applied to order
#Examples:
#  | UsingData                                                      |
#  | CSR_ManualRewards_FreeShipping_Expired_NotApplied_StudentClubs |
#
#@Coupon-FreeShipping-CSR
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: CSR sees correct layout of free shipping coupon:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart that is below the free shipping
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#When CSR enters free shipping coupon
#And CSR clicks apply on coupon code section
#Then CSR sees header title ‘Coupons Applied’ in new layer below coupon module
#And CSR sees label “<Coupon Code> <Coupon Message>” below title
#And CSR sees an icon labelled ‘X’ to the right of the layer
#And CSR sees the 'Shipping & Handling' Charges as FREE
#Examples:
#  | UsingData                             |
#  | CSR_ManualRewards_FreeShipping_Layout | 