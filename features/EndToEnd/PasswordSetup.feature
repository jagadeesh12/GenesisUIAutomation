Feature: BM Password Set for accounts in BM
	This feature is to set the password for accounts in BM

 	
@PasswordSet
@123
Scenario Outline:User password set and update for accounts in BM:[<UsingData>]
	
	Given User opens the BM web site
	And User set the password for the accounts
	
Examples:
  | UsingData        			|
  | BM_Password_Set_and_Update 	|	
  
  

