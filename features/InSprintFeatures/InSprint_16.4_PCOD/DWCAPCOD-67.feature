Feature: DWCAPCOD-67
	Parent Account - View, Add, Edit, and Remove Payment and Billing Information
	
Background: 
	Given Parent opens scholastic reading clubs e-commerce site

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@1
Scenario Outline: Parent clicks on Remove and NO for saved card on My Account:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on Remove link next to a saved card
And parent clicks on NO on Remove Card modal
Then Credit card is still displays in Billing & Payments section and is not deleted
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:RemoveCard_NO|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@2
Scenario Outline: Parent adds a New AMEX card on My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has no saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on "Add a Card", enters all mandatory information of the card and saves card
Then Image indicating specified card, type of card, last 4 digits of card
And Expiry date "EXP: " followed by [MM/YY] format card expiry date displays
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:AddNewCard_AMEX|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@3
Scenario Outline: Parent adds a New VISA card on My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has no saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on "Add a Card", enters all mandatory information of the card and saves card
Then Image indicating specified card, type of card, last 4 digits of card
And Expiry date "EXP: " followed by [MM/YY] format card expiry date displays
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:AddNewCard_VISA|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@4
Scenario Outline: Parent adds a New MasterCard on My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has no saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on "Add a Card", enters all mandatory information of the card and saves card
Then Image indicating specified card, type of card, last 4 digits of card
And Expiry date "EXP: " followed by [MM/YY] format card expiry date displays
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:AddNewCard_MasterCard|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@5
@Manual
Scenario Outline: Parent Edits a Saved AMEX card:[<UsingData>]
Given Parent login in with valid [username] and [password]
And parent has saved AMEX card on file
And parent clicks on Profile from My Account dropdown
And parent clicks on "Edit Card" for saved card
When parent edits expiration date, security code and billing information
And click on Save for Credit Card on Profile page
Then edited information for saved credit card is saved
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:EditSavedCard_AMEX|
#
#@DWCAPCOD-67
#@Parent_MyAccount
#@Priority1
#@Sprint-16.4
#@6
#@Manual
#Scenario Outline: Parent Edits a Saved Visa card:[<UsingData>]
#Given Parent login in with valid [username] and [password] 
#And parent has saved VISA card on file
#And parent clicks on Profile from My Account dropdown
#And parent clicks on "Edit Card" for saved card
#When parent edits expiration date, security code and billing information
#And click on Save for Credit Card on Profile page
#Then edited information for saved credit card is saved
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:EditSavedCard_VISA|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@7
Scenario Outline: Parent adds a invalid credit card on My Account page:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent clicks on Profile from My Account dropdown
When parent clicks on "Add a Card", enters all mandatory information of the card and saves card
Then error message displays and credit card info is not saved
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:InvalidCreditCard_ErrorMessage|

#@DWCAPCOD-67
#@Parent_MyAccount
#@Priority1
#@Sprint-16.4
#@8
#@Manual
#Scenario Outline: Parent Edits a Saved MasterCard:[<UsingData>]
#Given Parent login in with valid [username] and [password] 
#And parent has saved MasterCard on file
#And parent clicks on Profile from My Account dropdown
#And parent clicks on "Edit Card" for saved card
#When parent edits expiration date, security code and billing information
#And click on Save for Credit Card on Profile page
#Then edited information for saved credit card is saved
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:EditSavedCard_MasterCard|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@9
Scenario Outline: Security code is cleared when parent clicks Edit:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on "Edit Card" for saved card
Then security code is cleared
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:SecurityCodeCleared|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@10
Scenario Outline: Parent clicks on Cancel to cancel to edited information:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has saved cards on file
And parent clicks on Profile from My Account dropdown
And parent clicks on "Edit Card" for saved card
When parent edits expiration date, security code and billing information
And clicks on Cancel for Credit Card on Profile page
Then edited information is not saved
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:CancelEditCard|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@11
Scenario Outline: Parent clicks on Remove for a saved card on My Account:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on Remove link next to a saved card
Then  Tool tip message "Are you sure you want to delete this card?" displays with YES and NO buttons
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:RemoveCard_Tooltip|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@12
Scenario Outline: Parent cannot save more than 3 cards on file:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has 3 saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on "Add a Card" on Profile page
Then tool tip message displays "You can only store three credit cards"
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:CannotAddMoreThan3CreditCard|

@DWCAPCOD-67
@Parent_MyAccount
@Priority1
@Sprint-16.4
@13
Scenario Outline: Parent deletes saved card on My Account:[<UsingData>]
Given Parent login in with valid [username] and [password] 
And parent has saved cards on file
And parent clicks on Profile from My Account dropdown
When parent clicks on Remove link next to a saved card
And clicks on YES on Remove Card modal
Then Credit card is deleted and does not display in Billing & Payments section
Examples:
|UsingData|
|InSprint16.4:PCOD:MyAccount:PaymentBilling:DeleteSavedCard|

#@DWCAPCOD-67
#@Parent_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Parent cannot save edited credit card with missing information on mandetory fields:[<UsingData>]
#Given Parent login in with valid [username] and [password] 
#And parent has saved card on file
#And parent clicks on Billing & Payments from My Account dropdown
#When parent clicks on Edit card
#And clicks on save without entering any of the mandatory fields
#Then the focus is brought to the missing field
#And parent is not allowed to save until all the mandatory informaation is provided
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:|
#
#@DWCAPCOD-67
#@Parent_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Billing & Payments section with no saved cards:[<UsingData>]
#Given Parent login in with valid [username] and [password]
#And parent does not have saved cards on file
#When parent clicks on Profile from My Account dropdown
#Then "PAYMENT & BILLING INFORMATION" section displays with message "No Cards on File"
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:|
#
#@DWCAPCOD-67
#@Parent_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Billing & Payments section with saved cards on file:[<UsingData>]
#Given Parent login in with valid [username] and [password] 
#And parent has saved cards on file
#When parent clicks on Profile from My Account dropdown
#Then Image indicating type of card, type of card, last 4 digits of card
#And Expiry date "EXP: " followed by [MM/YY] format card expiry date
#And "Add a Card", "Edit" and "Remove" hyperlinks displays
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:|
#
#@DWCAPCOD-67
#@Parent_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Parent cannot add credit card with missing information on mandetory fields:[<UsingData>]
#Given Parent login in with valid [username] and [password] 
#And parent clicks on Billing & Payments from My Account dropdown
#When parent clicks on Add a card
#And clicks on save without entering any of the mandatory fields
#Then the focus is brought to the missing field
#And parent is not allowed to add credit card until all the mandatory informaation is provided
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:|
#
#@DWCAPCOD-67
#@Parent_MyAccount
#@Manual
#@Sprint-16.4
#Scenario Outline: Parent cannot edit card without reentering the security code:[<UsingData>]
#Given Parent login in with valid [username] and [password] 
#And parent has saved card on file
#And parent clicks on Billing & Payments from My Account dropdown
#When parent clicks on Edit card
#And clicks on save without entering the security code
#Then the focus is brought to security code field
#And parent is not allowed to save until the security code is reentered
#Examples:
#|UsingData|
#|InSprint16.4:PCOD:MyAccount:PaymentBilling:|