Feature: Validation of SCSCOD-7063 stories for Sprint 15.1
	This feature is used to validate all scenarios for SCSCOD-7063

Background:
	Given CSR opens the rco-scholastic web site



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
@OrderEntry
@CSR
@1
Scenario Outline: CSR can navigate to the Rewards and Redemption page when the ‘Redeem Your Coupon’ link is selected:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
When CSR selects the hyperlink “Redeem your Coupons”
Then CSR sees the Rewards and Redemption page
Examples:
| UsingData                                                      |
| InSprint15.1:CSR:OrderEntry_RedeemCouponsHyperlink_RewardsPage |

########################################################################### Manual Tests ###################################################################################
#@SCSCOD-7063
#@Manual
#@CSR
#@Sprint-15.1
#@Release-BTS2017
#@OrderEntry
#Scenario Outline: CSR sees the Redeem Your Coupon message on Order Entry page:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#When CSR navigates to Order Entry Page
#Then CSR sees the Redeem Your Coupon message under the ‘Teacher Order’ link