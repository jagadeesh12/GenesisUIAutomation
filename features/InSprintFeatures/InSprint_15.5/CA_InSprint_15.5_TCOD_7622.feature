Feature: TCOD – Payment Redesign – Payment Methods – Credit Card – Delete Card
	This feature is to validate the TCOD – Payment Redesign – Payment Methods – Credit Card – Delete Card scenarios

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7622     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7622
@Priority1
@Sprint-15.5
@TCOD-Payment
@BTS2017-2
@1
Scenario Outline: Teacher does not see ‘Remove’ link for a saved credit card for the Credit Card payment:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to the cart
And teacher navigates to [Review Cart] page
And teacher navigates to [Redemptions & Rewards] page
And teacher navigates to the [Payments] page
And teacher selects Credit Card as payment
When teacher selects [Saved Card]
Then teacher does not see the ‘Remove’ link next to the ‘Edit’ link for [Saved Card]
Examples:
	| UsingData |
	| InSprint15.5:TCOD:NoRemoveLink:SavedCreditCard:CreditCardPayment |


@SCSCOD-7359
@Priority1
@Sprint-15.5
@MSFOPage-FreePickModal
@BTS2017-2
@2
Scenario Outline: Teacher does not see ‘Remove’ link for a saved credit card for Combination of Credit Card and Cheque payment:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to YTO page
And teacher adds YTO items to the cart
And teacher navigates to [Review Cart] page
And teacher navigates to [Redemptions & Rewards] page
And teacher navigates to the [Payments] page
And teacher selects Combination of Credit Card and Cheque as payment
When teacher selects [Saved Card]
Then teacher does not see the ‘Remove’ link next to the ‘Edit’ link for [Saved Card]
Examples:
	| UsingData |
	| InSprint15.5:TCOD:NoRemoveLink:SavedCreditCard:CombinationOfChequesCCPayment |