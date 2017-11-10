Feature: BTS Release Test Scenarios
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	



  
    

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            DOLLARS TO SPEND SCENARIOS                  ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################



@DollarsToSpend
@Priority1
@Maintenance
@DTSIssue
Scenario Outline:Teacher selects an item by Selecting a grade from Grade level dropdown:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to the cart with [minumum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher sees the Dollars to spend promotion
	And teacher clicks on Make Selection button
	And teacher selects a grade
	When teacher selects an item from Make Selection window
	Then selected item displays in the Current Selection section
	
Examples:
  | UsingData                                		         |
  | BTS:DollarsToSpend:Teacher_DTS_with_minimum_amount_IE10|
  

  
  

  		