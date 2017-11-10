Feature: MyAccount
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            MY ACCOUNT SCENARIOS                            ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################



 @MyAccount
@Priority3
Scenario Outline:Teacher clicks on My Account link to navigate to My Reading club account page:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	When teacher clicks on My Account link
	Then teacher navigates to My Reading Club account page

  Examples:
    | UsingData               |
    | BTS:MyAccount:Teacher_Login |


@MyAccount  
@Priority1
@ProdIssue
Scenario Outline:Teacher sees correct order number and amount in order history page:[<UsingData>]

Given teacher logs into the application by providing [UserInformation]
And teacher clicks on Order History from My Account dropdown
When teacher clicks on view details link for concerned order details
Then order number and amount in order history page should match with detials present in order history section in My Account page

Examples: 
|UsingData                                               |
|BTS:ProdIssue:IncorrectOrderNumOrderVal_OrderHistoryPage|

  @Sprint12.3
  @MyAccount
  @Priority1
  Scenario Outline:Teacher should be able to udpate unique email address at time of profile edits:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And clicks on Profile from My Account dropdown
    And teacher click Edit link present under My Profile section
    When teacher provides unique email address along with other required details
    And teacher clicks SAVE button
    Then changes should be updated without any issues

  Examples:
    | UsingData                                          |
    | InSprint_12.3:Dev35:Teacher_UniqueEmail_EditProfile|


  @Sprint12.3
  @MyAccount
  @Priority1
  Scenario Outline:Proper error message should be seen if email associated to other account is updated at time of profile edits:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And clicks on Profile from My Account dropdown
    And teacher click Edit link present under My Profile section
    When teacher provides email address which is already associated to other account along with other required details
    And teacher clicks SAVE button
    Then “This email address has already been assigned to an account. Please enter a different email address.” should be seen

  Examples:
    | UsingData                                                           |
    | InSprint_12.3:Dev35:Teacher_DuplicateEmail_ValidationMsg_EditProfile|
