@teacherdesknow
Feature: TeacherDesk
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            TEACHER DESK SCENARIOS                      ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################

@ProductionIssue  
@TeacherDesk
@Priority1
@Sprint18  
Scenario Outline:Teacher can view her name, school and grade info on teacher's desk:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
When teacher selects [Teacher's Desk] from home page
Then correct teacher name, school and grade displays
Examples:
  | UsingData   |
  | QA:Teacher_Info_TeacherDesk|   
    		

@TeacherDesk
@Priority2
Scenario Outline:Teacher views hold status T message on Teachers Desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [Teacher's Desk] from home page
	Then hold status message "There is a problem with your account. Your new and pending orders are on hold and will not ship. Please contact Customer Service at 1-800-268-3860 or custserve@scholastic.ca to resolve the issue." displays
	
Examples:
  | UsingData                               	|
  | QA:TeacherDesk:Teacher_Login_HoldStatus_T 	|	
  
  
@TeacherDesk
@Priority2
Scenario Outline:Teacher views hold status H message on Teachers Desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [Teacher's Desk] from home page
	Then hold status message "There is a problem with your account. Your new and pending orders are on hold and will not ship. Please contact Customer Service at 1-800-268-3860 or custserve@scholastic.ca to resolve the issue." displays
	
Examples:
  | UsingData                               	|	
  | QA:TeacherDesk:Teacher_Login_HoldStatus_H 	|  	
  
  
  
@TeacherDesk
@Priority2
Scenario Outline:Teacher views hold status 'P' message on Teacher desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher selects [Teacher's Desk] from home page
	Then hold status message "Your order(s) will ship once payment is confirmed. If you pay by cheque, order(s) will ship once cheques are received." is displays
	
Examples:
  | UsingData                               	|
  | QA:TeacherDesk:Teacher_Login_HoldStatus_P 	|	
  
    
@TeacherDesk
@Priority2
Scenario Outline:Teacher clicks on Envelope to view the account status message on teacher's desk:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on Envelope on Home page
	Then teacher lands on teacher's desk with alert message
	
Examples:
  | UsingData                               		|
  | QA:TeacherDesk:Teacher_Login_HoldStatus_P2 	|