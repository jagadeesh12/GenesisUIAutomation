Feature: DollarstoSpend
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 

	
	
@SCSCOD-4394
@DollarstoSpend
@Priority2	
Scenario Outline:Teacher sees correct options under grade dropdown in DTS modal window:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
And teacher views Dollars to Spend promotion
And teacher clicks on Make Selection button
When teacher clicks on grade level dropdown in DTS model
Then teacher should see Early Childhood, Kindergarten & Grade 1, Grades 2 & 3, Grades 4 & 5, Grades 6 & 7 and French  options
	
Examples: 
|UsingData										    |
|InSprint_11.4:Dev35:Teacher_Options_GradeDropDown_DTSModelWindow|



##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   STORY 4064 - POP UP REWARD TABLE             #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        


@SCSCOD-4064
@Priority1
@RewardTable
Scenario Outline:Teacher sees pop-up reward table when clicked Proceed to Checkout button present in Review Cart page for Student Catalogues:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart and proceed to Review Cart page
When teacher clicks on Proceed to Checkout button
Then pop-up reward table should be seen


Examples: 
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_PopupRewardTable|


@SCSCOD-4064
@Priority3
@RewardTable
Scenario Outline:Teacher see pop-up reward table when clicked Proceed to Checkout button present in Review Cart page for Teacher Catalogues:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds teacher catalogue items to cart and proceed to Review Cart page
When teacher clicks on Proceed to Checkout button
Then pop-up reward table should be seen


Examples: 
|UsingData                                        |
|InSprint_11.4:dev35:TeacherOrder_PopupRewardTable|



@SCSCOD-4064
@Priority1
@RewardTable
Scenario Outline:Teacher sees correct order total on pop-up reward table:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart and proceed to Review Cart page
When teacher clicks on Proceed to Checkout button
Then pop-up reward table should be seen
And order total on pop-up reward table should match with current order total


Examples: 
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_OrderTotal_PopupRewardTable|




@SCSCOD-4064
@Priority2
@RewardTable
Scenario Outline:Teacher proceeds to Coupons and Rewards page when clicked on Proceed to Checkout link present on top of pop-up reward table:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart and proceed to Review Cart page
And teacher clicks on Proceed to Checkout button
And pop-up reward table should be seen
When teacher clicks on Proceed to Checkout link present on top of the reward table
Then teacher should land on Coupons and Rewards page

Examples: 
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_ProceedtoCheckoutLink_PopupRewardTable|



@SCSCOD-4064
@Priority2
@RewardTable
Scenario Outline:Teacher proceeds to Coupons and Rewards page when clicked on Proceed to Checkout button present at bottom of pop-up reward table:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart and proceed to Review Cart page
And teacher clicks on Proceed to Checkout button
And pop-up reward table should be seen
When teacher clicks on Proceed to Checkout button present at bottom of the reward table
Then teacher should land on Coupons and Rewards page

Examples: 
|UsingData                                                                |
|InSprint_11.4:dev35:StudentOrder_ProceedtoCheckoutButton_PopupRewardTable|



@SCSCOD-4064
@Priority2
@RewardTable
Scenario Outline:Teacher navigates to current selected flyers page when clicked on Return to Shop link present at bottom of pop-up reward table:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart and proceed to Review Cart page
And teacher clicks on Proceed to Checkout button
And pop-up reward table should be seen
When teacher clicks on Return to Shop link present at bottom of the reward table
Then teacher should navigate back to flyers page and see the recently selected flyer

Examples: 
|UsingData                                                     |
|InSprint_11.4:dev35:StudentOrder_ReturnToShop_PopupRewardTable|


@SCSCOD-4064
@Priority2
@RewardTable
Scenario Outline:Teacher sees current Total Order value range highlighted on pop-up reward table:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page 
And teacher adds student club items to cart and proceed to Review Cart page
When teacher clicks on Proceed to Checkout button
Then pop-up reward table should be seen
And Current Total Order value range should be highlighted on pop-up reward table along with Bonus points and Dollars to Spend row


Examples: 
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_CurrentTotalOrder_Highlight_PopupRewardTable|




##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################   STORY 4059 - GRADE AND LANGUAGE        #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################        

@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade1 Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade1 and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade1 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade1_Callout_Message_English|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade3 Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade3 and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade3 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade3_Callout_Message_English|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade5 Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade5 and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade5 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade5_Callout_Message_English|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade7 Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade7 and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade7 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade7_Callout_Message_English|



@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade9 Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade9 and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade9 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade9_Callout_Message_English|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade11 Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade11 and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade11 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade11_Callout_Message_English|



@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade3 Callout Message] when associated to Grade1 and Grade3, has not identified grade preference and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade3 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:Golden:teacher_Grade1_Grade3_CallOutMsg_NoPreference_English|



@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade1 Callout Message] when associated to Grade1 and Grade3, has identified Grade1 as preference and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade1 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:Golden:teacher_Grade1_Grade3_CallOutMsg_Grade1Preference_English|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade7 Callout Message] when associated to Grade6 and Grade7, has identified Grade7 as preference and language set to English:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade7 Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:Golden:teacher_Grade6_Grade7_CallOutMsg_Grade7Preference_English|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade1 French Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade1 and language set to French:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade1 French Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade1_Callout_Message_French|


@SCSCOD-4059
@Priority1
@FreeItem
Scenario Outline:Teacher receives [Grade3 French Callout Message] on a cart with qualifying minimum amount on Student Club orders when associated to Grade3 and language set to French:[<UsingData>]
		
Given teacher login into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [Grade3 French Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_Grade3_Callout_Message_French|


@SCSCOD-4059
@Priority1
@qastudentincentive
Scenario Outline:Teacher receives [No Grade Student Incentive Callout Message] on Student Club orders when associated to no grade and language set to English:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [No Grade Student Incentive Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_NoGrade_Callout_Message_English|


@SCSCOD-4059
@Priority1
@qastudentincentive
Scenario Outline:Teacher receives [No Grade, No Language Student Incentive Callout Message] on Student Club orders when associated to no grade and no language:[<UsingData>]
		
Given teacher logs into the application by providing [UserInformation]
When teacher add student club items to cart with [minumum amount]
And teacher navigates to coupons & Rewards page
Then only [No Grade, No Language Student Incentive Callout Message] is displayed in the REWARDS section


Examples:
|UsingData                                        |
|InSprint_11.4:dev35:StudentOrder_NoGrade_NoLanguage_Callout_Message|


