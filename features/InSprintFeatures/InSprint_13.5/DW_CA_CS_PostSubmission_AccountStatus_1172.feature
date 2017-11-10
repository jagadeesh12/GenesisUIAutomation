Feature: Post-Submission – Validations - Account & Order Statuses
	This feature is to validate the Post-Submission – Validations - Account & Order Statuses scenarios.
	
#Background:
#	Given CSR opens the rco-scholastic web site
#	
#@Postsubmission_AccountStatus
#@DWCACSR-1172
#@Manual
#@1
#Scenario Outline: CSR can submit order for account with Temporary Hold Status:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#When CSR selects the order type as [Phone Order]
#And CSR submits order
#Then CSR can succesfully submit the order
#Examples:
#  | UsingData                                            |
#  | PostSubmission_Validation_HoldStatus_TemporaryOnHold |
#  
#@Postsubmission_AccountStatus
#@DWCACSR-1172
#@Manual
#@2
#Scenario Outline: CSR can submit order for account with A/R Status:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#When CSR selects the order type as [Phone Order]
#And CSR submits order
#Then CSR can succesfully submit the order
#Examples:
#  | UsingData                                            |
#  | PostSubmission_Validation_HoldStatus_A/R             |
#  
#@Postsubmission_AccountStatus
#@DWCACSR-1172
#@Manual
#@3
#Scenario Outline: CSR can submit order for accounts with Pre-paid Status:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#When CSR selects the order type as [Phone Order]
#And CSR submits order
#Then CSR can succesfully submit the order
#Examples:
#  | UsingData                                            |
#  | PostSubmission_Validation_HoldStatus_Pre-paid        |
#  
#@Postsubmission_AccountStatus
#@DWCACSR-1172
#@Manual
#@1
#Scenario Outline: Orders with the ‘Quote’ option for Purchase Order payment will not be shipped:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#When CSR selects the order type as [Phone Order]
#And CSR submits order
#Then Purchase Order payment type is ‘Quote’ in the order XML
#And order is not shipped
#Examples:
#  | UsingData                                     |
#  | PostSubmission_Validation_PurchaseOrder_Quote |
#  
#@Postsubmission_AccountStatus
#@DWCACSR-1172
#@Manual
#@1
#Scenario Outline: Orders with the ‘PUR’ option for Purchase Order payment will be shipped:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#When CSR selects the order type as [Phone Order]
#And CSR submits order
#Then Purchase Order payment type is ‘PUR’ in the order XML
#And order is shipped
#Examples:
#  | UsingData                                   |
#  | PostSubmission_Validation_PurchaseOrder_PUR |
#  
#@Postsubmission_AccountStatus
#@DWCACSR-1172
#@Manual
#@1
#Scenario Outline: Orders with the ‘PUB’ option for Purchase Order payment will be shipped:[<UsingData>]
#Given CSR logs into the application by providing [UserInformation]
#When CSR selects the order type as [Phone Order]
#And CSR submits order
#Then Purchase Order payment type is ‘PUB’ in the order XML
#And order is shipped
#Examples:
#  | UsingData                                   |
#  | PostSubmission_Validation_PurchaseOrder_PUB |

