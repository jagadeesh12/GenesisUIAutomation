Feature: SFO Page - Free Pick Modal
	This feature is to validate the SFO Page - Free Pick Modal scenarios

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7359     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7359
@Priority1
@Sprint-15.5
@MSFOPage-FreePickModal
@BTS2017-2
@1
Scenario Outline: Enter Teacher Only Freepick coupon on SFO:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks enter orders
And teacher clicks “Student Flyer Orders” link
And Student Flyer Orders modal is dispalyed
And teacher click on link “Apply a coupon for this student”
And SFO Coupon Modal is displayed
And teacher enters valid Student Name
When teacher enters teacher only coupon
Then teacher click on Apply
And error message is displayed
Examples:
	| UsingData |
	| SFO_FreePick_TeacherOnlyCoupon |


@SCSCOD-7359
@Priority1
@Sprint-15.5
@MSFOPage-FreePickModal
@BTS2017-2
@2
Scenario Outline: Enter Studnet Only Freepick coupon on SFO:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher clicks enter orders
And teacher clicks “Student Flyer Orders” link
And Student Flyer Orders modal is dispalyed
And teacher click on link “Apply a coupon for this student”
And SFO Coupon Modal is displayed
And teacher enters valid Student Name
When teacher enters Student only coupon
Then teacher click on Apply
And No error message is displayed
Examples:
  | UsingData |
  | SFO_FreePick_StudnetOnlyCoupon |