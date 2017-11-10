Feature: BM User Creation
	This feature is to create the users in BM

 	
@UserCreationInBM
@1
Scenario Outline:User creation and set the role in BM:[<UsingData>]
	
	Given User opens the BM web site
	And User creates the data in BM and set the Role and save it to the Excel file
	
Examples:
  | UsingData        |
  | Dev35_BM_User_Creation |	


@PasswordSetForBMusers
@2
Scenario Outline:Password set for BM Users in BM:[<UsingData>]
	
	Given User opens the BM web site
	And Password set for the BM users
	
Examples:
  | UsingData					|
  | Dev35_BM_Password_Set_for_BMUsers |
  
  
#@PasswordResetForBMusers
#@3
#Scenario Outline:Password reset for expired users in BM:[<UsingData>]
#	
#	Given User opens the BM web site
#	And Password reset for the expired BM users
#	
#Examples:
#  | UsingData					|
#  | BM_Password_reset_for_expired_BMUsers |    
  
  