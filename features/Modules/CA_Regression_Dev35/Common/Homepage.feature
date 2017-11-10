Feature: Homepage
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    STORY 1880 Activation flow   #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################   
  
@Homepage
  Scenario Outline: Teacher,should only be allowed to input Numeric VALID account numbers with 8 characters in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number and Email field
 And click on Next button
 Then Forgot Your Password Modal with Close button is dispalyed
 And teacher clicks Close to close the modal
 
 
 Examples:
  | UsingData               |
  | dev35:validaccountNumber|
    
@Homepage
  Scenario Outline: Teacher,enters Invalid Numeric account numbers in Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number and Email field
 And  click on Next button 
 Then Account Not found modal is displayed with Back Button
 And teacher clicks Back, which brings back the Activate Your Account Modal
 
 
 Examples:
  | UsingData                                |
  | dev35:invalidaccountNumber                      |
    
 
@Homepage
 Scenario Outline: Teacher,should not be allowed to input account number which is not numeric in the Activate Your Account Modal:[<UsingData>]
 
 Given teacher open rco-scholastic web site 
 When teacher clicks on the Activate Your Account button
 Then the Activate Your Account modal should be dispalyed with Account Number field and Next Button
 And teacher enters the account Number [UserInformation]
 Then Account number field is blank

  
 
 Examples:
  | UsingData                                |
  | dev35:invalidaccountNumber                      |



  @SCSCOD-4604
  @Homepage
  @Priority3
  Scenario Outline:Hint label under Account Number field in Activate Your Account window should not be seen:[<UsingData>]

    Given teacher open rco-scholastic web site
    When teacher clicks on the Activate Your Account button
    Then hint label under Account Number field i.e. “Maximum 8 characters” should not be seen

  Examples:
    | UsingData                                          |
    | InSprint_12.1:Dev35:Teacher_HintLabel_AccountNumber|


