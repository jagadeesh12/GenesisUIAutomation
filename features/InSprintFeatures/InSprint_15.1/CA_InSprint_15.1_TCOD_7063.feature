Feature: Validation of SCSCOD-7063 stories for Sprint 15.1
	This feature is used to validate all scenarios for SCSCOD-7063

Background:
	Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7063      			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@ReviewCart
@3
Scenario Outline: Teacher can navigate to the Rewards and Redemption page with no items in cart when the hyperlink “Redeem your Coupons” is selected on Review Cart page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
When teacher selects the shopping cart icon with 0 items
And teacher selects the hyperlink “Redeem your Coupons”
Then teacher sees the Rewards and Redemption page
Examples:
| UsingData                                                       |
| InSprint15.1:TCOD:ReviewCart_RedeemCouponsHyperlink_RewardsPage |

@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@2
Scenario Outline: The label for the “UPDATE CART” button is changed to “SAVE” on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
Then label for the "Update Cart" button is changed to "SAVE"
Examples:
| UsingData                        |
| InSprint15.1:TCOD:YTO_SaveButton |

@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@4
Scenario Outline: Teacher can navigate to the Rewards and Redemption page with no items in cart when the hyperlink “Redeem your Coupons” is selected on YTO page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher selects the hyperlink “Redeem your Coupons”
Then teacher sees the Rewards and Redemption page
Examples:
| UsingData                                                |
| InSprint15.1:TCOD:YTO_RedeemCouponsHyperlink_RewardsPage |

@SCSCOD-7063
@Priority1
@Sprint-15.1
@Release-BTS2017
@YTO
@1
Scenario Outline: The link ‘By Flyer’ is selected by default when teacher navigates to the ‘Your Teacher Order’ page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
Then the link "By Flyer" is selected by default
Examples:
| UsingData                                   |
| InSprint15.1:TCOD:YTO_ByFlyerOption_Default |

########################################################################### Manual Tests ###################################################################################
#@SCSCOD-7063
#@Manual
#@Sprint-15.1
#@Release-BTS2017
#@ReviewCart
#Scenario Outline: The hyperlink “Redeem your Coupons” and statement for redeeming the coupons are present on the Review Cart page with 0 items:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher selects the shopping cart icon with 0 items
#Then teacher sees the hyperlink “Redeem your Coupons” on the page
#And teacher sees accompany statement for redeeming the coupon on the page
#
#@SCSCOD-7063
#@Manual
#@Sprint-15.1
#@Release-BTS2017
#@YTO
#Scenario Outline: The ‘Student Name’ column is removed on the Your Teacher Order page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher selects the Your Teacher Order option
#When teacher navigates to the Your Teacher Order page
#Then the "Student Name" column is not shown in the Your Teacher Order page
#
#@SCSCOD-7063
#@Manual
#@Sprint-15.1
#@Release-BTS2017
#@YTO
#Scenario Outline: The hyperlink “Redeem your Coupons” and statement for redeeming the coupons are present on the Your Teacher Order page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher selects the Your Teacher Order option
#When teacher navigates to the Your Teacher Order page
#Then teacher sees the hyperlink “Redeem your Coupons” on the page
#And teacher sees accompanied statement for redeeming the coupon on the page
#
#@SCSCOD-7063
#@Manual
#@Sprint-15.1
#@Release-BTS2017
#@ReviewCart
#Scenario Outline: Teachers sees two tabs, ‘Student Flyer Orders’ and ‘Your Teacher Order’, when the ‘Enter Orders’ option is selected:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#When teacher selects [enter classroom order] from home page
#Then teacher sees the two tabs under the main navigation bar
#And teacher sees "Student Flyer Orders" tab on the left side under the main navigation bar
#And teacher sees "Your Teacher Order" tab on the right side under the main navigation bar
#
#@SCSCOD-7063
#@Manual
#@Sprint-15.1
#@Release-BTS2017
#@ReviewCart
#Scenario Outline: Teacher sees the correct layout of the Your Teacher Order section:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#When teacher selects the Your Teacher Order option
#Then teacher navigates to the Your Teacher Order page
#And title of the tab is labelled ‘Your Teacher Order’
#And the message displayed below the aforementioned title is “Enter items for your classroom the usual way, BY FLYER, or the new way, BY ITEM #. You'll be asked to Redeem Bonus Coupons and Credit Notes at checkout.”
#And the link labelled "By Flyer" is on the left side under the message
#And the link labelled "By Item #" is next to the "By Flyer" link