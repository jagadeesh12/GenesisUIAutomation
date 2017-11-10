@Perf200
Feature: CSR Login Page
	This feature is to validate the login page scenarios.


	
@LoginPage
@DWCACSR-2
@Priority1
@1
Scenario Outline:As a CSR rep, I am taken to Order source page when I enter valid credentials:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters valid username in 'UserName' field
	And CSR enters valid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then Home page should be displayed
	
Examples:
  | UsingData                  		|
  | Perf_QA_Login_with_valid_credentials	|	
  
  
@LoginPage
@DWCACSR-2
@Priority1
@10
Scenario Outline:Enter button disabled upon page load:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	Then CSR is presented with the user-authentication page
	And an enabled textbox with the label ‘Username’
	And an enabled textbox with the label ‘Password’
	And a disabled button labeled ‘ENTER’

Examples:
  | UsingData                  				|
  | Perf_QA_Enter_button_disabled_upon_page_load	|  
    	
   
@LoginPage
@DWCACSR-2
@Priority2
@2
Scenario Outline:ENTER box is disabled when CSR doesn't enter the UserName in a field:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR clicks on 'UserName' field
	But has not entered any information in the ‘username’ field
	Then the 'ENTER' box should be disabled
	
Examples:
  | UsingData                  	|
  | Perf_QA_Validation_of_enter_box_1	|
  
  	
@LoginPage
@DWCACSR-2
@Priority2
@3
Scenario Outline:ENTER box is disabled when CSR doesn't enter the Password in a field:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR clicks on 'Password' field
	But has not entered any information in the ‘password’ field
	Then the 'ENTER' box should be disabled
	
Examples:
  | UsingData                  	|
  | Perf_QA_Validation_of_enter_box_1b	|  
      
  
@LoginPage
@DWCACSR-2
@Priority1
@4
Scenario Outline:ENTER box is enabled when CSR enters the Username and Password in the fields:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters username in 'UserName' field
	And CSR enters password in 'Password' field with minimum 7 characters or more
	Then the 'ENTER' box should be enabled
	
Examples:
  | UsingData                  	|
  | Perf_QA_Validation_of_enter_box_2	|	
  
  
@LoginPage
@DWCACSR-2
@Priority1
@5
Scenario Outline:Error message displays when CSR logs in with invalid user name and valid password_1:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters valid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|
  | Perf_QA_invalid_username_with_alphabets		|	  

  
@LoginPage
@DWCACSR-2
@Priority1
@5
Scenario Outline:Error message displays when CSR logs in with invalid user name and valid password_2:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters valid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|  
  | Perf_QA_invalid_username_with_numerics		|
  
  
@LoginPage
@DWCACSR-2
@Priority1
@5
Scenario Outline:Error message displays when CSR logs in with invalid user name and valid password_3:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters valid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|	
  | Perf_QA_invalid_username_with_specialChars	|	

  
  
@LoginPage
@DWCACSR-2
@Priority1
@5
Scenario Outline:Error message displays when CSR logs in with invalid user name and valid password_4:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters valid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|	
  | Perf_QA_invalid_username_with_AlphaNumeric	|
        
  
@LoginPage
@DWCACSR-2
@Priority1
@6
Scenario Outline:Error message displays when CSR logs in with valid user name and invalid password_1:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters valid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|
  | Perf_QA_invalid_password_with_alphabets		|	  
      

@LoginPage
@DWCACSR-2
@Priority1
@6
Scenario Outline:Error message displays when CSR logs in with valid user name and invalid password_2:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters valid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|
  | Perf_QA_invalid_password_with_numerics		|
 
      
@LoginPage
@DWCACSR-2
@Priority1
@6
Scenario Outline:Error message displays when CSR logs in with valid user name and invalid password_3:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters valid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|
  | Perf_QA_invalid_password_with_specialChars	|
  
      
@LoginPage
@DWCACSR-2
@Priority1
@6
Scenario Outline:Error message displays when CSR logs in with valid user name and invalid password_4:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters valid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|
  | Perf_QA_invalid_password_with_AlphaNumeric	|	  
      

@LoginPage
@DWCACSR-2
@Priority1
@7
Scenario Outline:Error message displays when CSR logs in with invalid user name and invalid password_1:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  				|
  | Perf_QA_invalid_unameAndPwd_with_alphabets		|
  

@LoginPage
@DWCACSR-2
@Priority1
@10
Scenario Outline:Error message displays when CSR logs in with invalid user name and invalid password_2:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  				|
  | Perf_QA_invalid_unameAndPwd_with_numerics		|

  
@LoginPage
@DWCACSR-2
@Priority1
@11
Scenario Outline:Error message displays when CSR logs in with invalid user name and invalid password_3:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  				|
  | Perf_QA_invalid_unameAndPwd_with_specialChars	|

  
@LoginPage
@DWCACSR-2
@Priority1
@12
Scenario Outline:Error message displays when CSR logs in with invalid user name and invalid password_4:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters invalid username in 'UserName' field
	And CSR enters invalid password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  				|
  | Perf_QA_invalid_unameAndPwd_with_AlphaNumeric	|	
  
  
@LoginPage
@DWCACSR-2
@Priority1
@8
Scenario Outline:As a CSR, I am not able to login to the CSR site with non-CSR credentials:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	When CSR enters username in 'UserName' field
	And CSR enters password in 'Password' field
	And CSR clicks on 'ENTER' button
	Then the error message should be displayed as 'Error Logging In'
	
Examples:
  | UsingData                  			|
  | Perf_QA_CSR_user_has_isCSR_flag_disabled	|  
  
    
@LoginPage
@DWCACSR-2
@Priority1
@9
Scenario Outline:Error message displays when CSR enters lessthan min characters in password field:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	And CSR enters username in 'UserName' field
	When CSR enters lessthan 7 characters in 'Password' field
	And CSR clicks on outside in a page
	Then the error message should be displayed as 'Please enter at least 7 characters.'
	
Examples:
  | UsingData                  					|
  | Perf_QA_CSR_user_enters_lessthan_min_chars_in_pwd	|  
  
      
