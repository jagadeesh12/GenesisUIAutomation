Feature: CSR – Payment Redesign – Payment Methods – Credit Card – Delete Card
	This feature is to validate the CSR – Payment Redesign – Payment Methods – Credit Card – Delete Card scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site 


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
@CSR-Payment
@BTS2017-2
@1
Scenario Outline: Saved credit card is removed when CSR selects ’YES’ on the delete pop-up of the ‘Remove’ link for Credit Card payment:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Credit Card as payment
When CSR selects [Saved Card]
And CSR clicks on the ‘Remove’ link next to the ‘Edit’ link
And CSR selects ‘YES’ from the delete modal
And CSR selects Credit Card as payment
Then CSR does not see [Saved Card] that was removed
Examples:
	| UsingData |
	| InSprint15.5:CSR:Delete:SavedCreditCard:CreditCardPayment |


@SCSCOD-7622
@Priority1
@Sprint-15.5
@CSR-Payment
@BTS2017-2
@2
Scenario Outline: Saved credit card is removed when CSR selects ’YES’ on the delete pop-up of the ‘Remove’ link for Combination of Credit Card and Cheque payment:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Combination of Credit Card and Cheque as payment
When CSR selects [Saved Card]
And CSR clicks on the ‘Remove’ link next to the ‘Edit’ link
And CSR selects ‘YES’ from the delete modal
And CSR selects Combination of Credit Card and Cheque as payment
Then CSR does not see [Saved Card] that was removed
Examples:
	| UsingData |
	| InSprint15.5:CSR:Delete:SavedCreditCard:CombinationOfChequesCCPayment |
  
@SCSCOD-7622
@Priority1
@Sprint-15.5
@CSR-Payment
@BTS2017-2
@3
Scenario Outline: Saved credit card is not removed when CSR selects ’NO’ on the delete pop-up of the ‘Remove’ link for Credit Card payment:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Credit Card as payment
When CSR selects [Saved Card]
And CSR clicks on the ‘Remove’ link next to the ‘Edit’ link
And CSR selects ‘NO’ from the delete modal
Then CSR still sees [Saved Card]
Examples:
	| UsingData |
	| InSprint15.5:CSR:NoDelete:SavedCreditCard:CreditCardPayment |
	
@SCSCOD-7622
@Priority1
@Sprint-15.5
@CSR-Payment
@BTS2017-2
@4
Scenario Outline: Saved credit card is not removed when CSR selects ’NO’ on the delete pop-up of the ‘Remove’ link for Combination of Credit Card and Cheque payment:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR selects Combination of Credit Card and Cheque as payment
When CSR selects [Saved Card]
And CSR clicks on the ‘Remove’ link next to the ‘Edit’ link
And CSR selects ‘NO’ from the delete modal
Then CSR still sees [Saved Card]
Examples:
	| UsingData |
	| InSprint15.5:CSR:NoDelete:SavedCreditCard:CombinationOfChequesCCPayment |