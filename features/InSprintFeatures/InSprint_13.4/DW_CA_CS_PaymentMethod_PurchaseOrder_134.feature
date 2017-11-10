Feature: Payment - Payment Method - Purchase Order
	This feature is to validate the Purchase Order Scenarios.
	
Background:
	Given CSR opens the rco-scholastic web site
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@1
Scenario Outline: CSR can enter 1 alphanumeric character in Purchase Order textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid PO Number in Purchase Order textbox
Then Purchase Order textbox accepts the input
Examples:
  | UsingData                                                |
  | Payment_PurchaseOrder_PONumber_1_AlphanumericCharacter   |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@2
Scenario Outline: CSR can enter 20 alphanumeric characters in Purchase Order textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid PO Number in Purchase Order textbox
Then Purchase Order textbox accepts the input
Examples:
  | UsingData                                                |
  | Payment_PurchaseOrder_PONumber_20_AlphanumericCharacters |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@3
#Scenario Outline: CSR cannot enter special characters in Purchase Order textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid characters in Purchase Order textbox
#Then Purchase Order textbox rejects the input
#Examples:
#  | UsingData                                                |
#  | Payment_PurchaseOrder_PONumber_SpecialCharacters         |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@4
Scenario Outline: CSR cannot enter more than 20 characters in Purchase Order textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid characters in Purchase Order textbox
Then Purchase Order textbox rejects the input
Examples:
  | UsingData                                                |
  | Payment_PurchaseOrder_PONumber_21_AlphanumericCharacters |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@5
Scenario Outline: CSR enters 2 integers in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Account Number textbox
Then Account Number textbox accepts the input
Examples:
  | UsingData                                      |
  | Payment_PurchaseOrder_AccountNumber_2_Integers |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@6
Scenario Outline: CSR enters 8 integers in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Account Number textbox
Then Account Number textbox accepts the input
Examples:
  | UsingData                                      |
  | Payment_PurchaseOrder_AccountNumber_8_Integers |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@7
Scenario Outline: CSR cannot enter only one integer in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Account Number textbox
#And CSR clicks outside the Account Number textbox
Then Account Number textbox rejects the input
Examples:
  | UsingData                                                  |
  | Payment_PurchaseOrder_AccountNumber_1_Integer              |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@8
Scenario Outline: CSR cannot enter more than 8 integers in Account Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Account Number textbox
And CSR clicks outside the Account Number textbox
Then Account Number textbox rejects the input
Examples:
  | UsingData                                                  |
  | Payment_PurchaseOrder_AccountNumber_9_Integers             |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@9
#Scenario Outline: CSR cannot enter alphabetical characters in Account Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Account Number textbox
#And CSR clicks outside the Account Number textbox
#Then Account Number textbox rejects the input
#Examples:
#  | UsingData                                                  |
#  | Payment_PurchaseOrder_AccountNumber_AlphabeticalCharacters |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@10
#Scenario Outline: CSR cannot enter special charcters in Account Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Account Number textbox
#And CSR clicks outside the Account Number textbox
#Then Account Number textbox rejects the input
#Examples:
#  | UsingData                                                  |
#  | Payment_PurchaseOrder_AccountNumber_SpecialCharacters      |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@11
Scenario Outline: CSR enters 2 integers in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Board/School Number textbox
Then Board/School Number textbox accepts the input
Examples:
  | UsingData                                          |
  | Payment_PurchaseOrder_BoardSchoolNumber_2_Integers |
  

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@11
Scenario Outline: CSR enters 8 integers in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters valid entry in Board/School Number textbox
Then Board/School Number textbox accepts the input
Examples:
  | UsingData                                          |
  | Payment_PurchaseOrder_BoardSchoolNumber_8_Integers |
  
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@12
Scenario Outline: CSR cannot enter 1 integer in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Board/School Number textbox
And CSR clicks outside the Board/School Number textbox
Then Board/School Number textbox rejects the input
Examples:
  | UsingData                                                      |
  | Payment_PurchaseOrder_BoardSchoolNumber_1_Integer 	           |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@13
Scenario Outline: CSR cannot enter more than 8 integers in Board/School Number textbox:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR enters invalid entry in Board/School Number textbox
And CSR clicks outside the Board/School Number textbox
Then Board/School Number textbox rejects the input
Examples:
  | UsingData                                                      |
  | Payment_PurchaseOrder_BoardSchoolNumber_9_Integers             |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@14
#Scenario Outline: CSR cannot enter alphabetical characters in Board/School Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Board/School Number textbox
#And CSR clicks outside the Board/School Number textbox
#Then Board/School Number textbox rejects the input
#Examples:
#  | UsingData                                                      |
#  | Payment_PurchaseOrder_BoardSchoolNumber_AlphabeticalCharacters |

########################################### This scenario is failing due to the nature of webdriver's sendKey() method ########################################################   
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@15
#Scenario Outline: CSR cannot enter special charcaters in Board/School Number textbox:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR enters invalid entry in Board/School Number textbox
#And CSR clicks outside the Board/School Number textbox
#Then Board/School Number textbox rejects the input
#Examples:
#  | UsingData                                                      |
#  | Payment_PurchaseOrder_BoardSchoolNumber_SpecialCharacters      |
      
@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@16
Scenario Outline: CSR can select only one radio button:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR selects a radio button
Then the other radio buttons should remain unselected
Examples:
  | UsingData                                 |
  | Payment_PurchaseOrder_RadioButton_OnlyOne |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@17
Scenario Outline: Radio button labelled ‘PUB (Backorders Allowed)’ selected by default:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
Then CSR sees radio button labelled ‘PUB (Backorders Allowed)’ selected
Examples:
  | UsingData                                 |
  | Payment_PurchaseOrder_RadioButton_Default |

@PaymentMethod_PurchaseOrder
@DWCACSR-134
@Priority1
@18
Scenario Outline: Error message shown when CSR clicks or tabs out of PO Number textbox without entering PO Number:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
When CSR selects Purchase Order as payment
And CSR selects Purchase Order textbox
And CSR clicks outside the Purchase Order textbox
Then CSR sees error message above Purchase Order textbox
Examples:
  | UsingData                                  |
  | Payment_PurchaseOrder_ErrorMessage_NoInput |

############################# These scenarios are not possible because the error messages are disabled in current build ###########################################
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@19
#Scenario Outline: Error message shown when CSR clicks or tabs out of Account Number textbox without entering Account Number:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR selects Account Number textbox
#And CSR clicks outside the Account Number textbox
#Then CSR sees error message above Account Number textbox
#Examples:
#  | UsingData                                  |
#  | Payment_AccountNumber_ErrorMessage_NoInput |
#
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Priority1
#@20
#Scenario Outline: Error message shown when CSR clicks or tabs out of Board/School Number textbox without entering Board/School Number:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
#And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#And CSR selects Board/School Number textbox
#And CSR clicks outside the Board/School Number textbox
#Then CSR sees error message above Board/School Number textbox
#Examples:
#  | UsingData                                      |
#  | Payment_BoardSchoolNumber_ErrorMessage_NoInput |

########################################    Manual Tests    ##########################################
#@PaymentMethod_PurchaseOrder
#@DWCACSR-134
#@Manual
#Scenario Outline: CSR sees correct layout for Purchase Order on Payment page:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#And CSR selects the order type as [Phone Order]
#And CSR navigates to Verify Account Page
##And CSR navigates to Order Entry Page
#And CSR adds Student Clubs items to the cart to meet the minimum amount
#And CSR navigates to Review Cart page from Order Entry page
#And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
#And CSR navigates to [Payment] page from [Redeem & Rewards] page
#When CSR selects Purchase Order as payment
#Then CSR sees heading ‘Purchase Order Information’ under the Payment Method drop-down
#And CSR sees ‘Purchase Order Number’ label under the heading
#And CSR sees ‘Purchase Order Number’ textbox under ‘Purchase Order Number’ label
#And CSR sees ‘Board/ School Number’ label under ‘Purchase Order Number’ textbox
#And CSR sees ‘Board/ School Number’ textbox under ‘Board/ School Number’ label
#And CSR sees message ‘Official School Board Number. Please confirm billing address in AS400’ under ‘Board/ School Number’ textbox
#And CSR sees ‘Account Number’ label under the above message
#And CSR sees ‘Account Number’ textbox under ‘Account Number’ label
#And default value ’99’ is in ‘Account Number’ textbox
#And CSR sees radio button labelled ‘Quote’ under ‘Account Number’ textbox
#And CSR sees radio button labelled ‘PUB (Backorders Allowed)’ under above radio button
#And CSR sees radio button labelled ‘PUR (Backorders not Allowed)’ under above radio button
#And CSR sees Cancel Button under the above radio button
#Examples:
#  | UsingData                    |
#  | Payment_PurchaseOrder_Layout |

