Feature: ReviewCart-LineItemLabel
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   STORY 3699 - ITEM LABEL                #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

 
 
@ReviewCart-LineItemLabel
@Priority3 
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher catalogues total in all checkout pages:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
When Teacher navigates to Review Your Cart page
Then line time label for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher navigates to confirm and submit page from Review cart page
And line time label in Confirm and Submit page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"
And teacher clicks on Submit Order
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   
  
  Examples:
  |UsingData                        |
  |dev35:TeacherOrder_StudentTeacherClubs_Label_Checkout|  
    
    
    
Scenario Outline: As a teacher, I should see correct line item label for student clubs total and teacher club total in order history:[<UsingData>]
  
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student and Teacher clubs
And Teacher navigates to Review Your Cart page
And teacher navigates to confirm and submit page from Review cart page
And teacher clicks on Submit Order
When teacher navigates to my account page and click on view order under order history
And line time label in Confirmation page for student clubs total should be "Student Clubs Amount Owing" and for teacher club items it should be "Teacher Catalogues Amount Owing"   

  
  Examples:
  |UsingData                        |
  |dev35:TeacherOrder_StudentTeacherClubs_Label_OrderHistory|