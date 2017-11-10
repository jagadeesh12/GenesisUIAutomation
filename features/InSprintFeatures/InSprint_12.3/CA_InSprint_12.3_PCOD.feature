Feature: InSprint_12.3 PCOD
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   		    DWCAPCOD-74     			 #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@DWCAPCOD-74
@MyAccount
@Priority3
Scenario Outline:Parent cannot give any spaces in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent tries to give spaces in CAC text field
Then CAC text field will not allow any spaces

Examples:
  | UsingData                                                   |
  | InSprint_12.3:PCOD:Dev35:Parent_ErrorMsg_CACSpacescharacters|
  
  
@DWCAPCOD-74
@MyAccount
@Priority3  
Scenario Outline:Parent see correct message text when mouse hover on “What's this?” link in Connect to Teacher model window:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent clicks “What's this?” hyperlink
Then “Your Class Code is the five-digit unique code that, once entered, will automatically connect you to your child's teacher for the remainder of the school year. This code may have been distributed by the teacher via email, letter, or written on the cover of a student flyer.” should be seen

Examples:
  | UsingData                                           |
  | InSprint_12.3:PCOD:Dev35:Parent_Whatsthislinkmessage|
  
@DWCAPCOD-74
@MyAccount
@Priority2 
Scenario Outline:Connect button in Connect to Teacher model window is disabled when CAC text field is blank:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When CAC text field is left blank
Then Connect button should be disabled

Examples:
  | UsingData                                                  |
  | InSprint_12.3:PCOD:Dev35:Parent_ConnectBtnDisabled_CACBlank|
  
@DWCAPCOD-74
@MyAccount
@Priority2  
Scenario Outline:Connect button in Connect to Teacher model window is enabled when CAC is entered in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters 5 characters in CAC text field
Then Connect button should be enabled

Examples:
  | UsingData                                                   |
  | InSprint_12.3:PCOD:Dev35:Parent_ConnectBtnEnabled_CACEntered|

@DWCAPCOD-74
@MyAccount
@Priority3
Scenario Outline:Parent cannot enter more than 5 characters in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent tries to enter more than 5 characters in CAC text field
Then CAC text field will not take more than 5 characters

Examples:
  | UsingData                                             |
  | InSprint_12.3:PCOD:Dev35:Parent_CACMorethan5characters|
  
  
@DWCAPCOD-74
@MyAccount
@Priority3  
Scenario Outline:Connect button should be disabled if parent enters less than 5 characters in CAC text field:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters enters less than 5 characters in CAC text field
Then Connect button should be disabled

Examples:
  | UsingData                                             |
  | InSprint_12.3:PCOD:Dev35:Parent_CACLessthan5characters|
  
  
@DWCAPCOD-74
@MyAccount
@Priority3  
Scenario Outline:Parent see proper validation message if incorrect CAC is entered:[<UsingData>]

Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent enters incorrect CAC in text field
And click on connect button
Then “Please make sure you entered the correct class code. If you don't have correct code , contact your child's teacher.” should be seen

Examples:
  | UsingData                                            |
  | InSprint_12.3:PCOD:Dev35:Parent_ErrorMsg_IncorrectCAC|
  
@DWCAPCOD-74
@MyAccount
@Priority3 
Scenario Outline:Parent cannot enter special characters in CAC text field:[<UsingData>]
 
 Given parent opens scholastic reading clubs e-commerce site
And parent clicks on “Connect to your Teacher” option
When parent tries to enter special characters in CAC text field
Then CAC text field will not allow special characters

Examples:
  | UsingData                                           |
  | InSprint_12.3:PCOD:Dev35:Parent_CACSpecialcharacters|     


    