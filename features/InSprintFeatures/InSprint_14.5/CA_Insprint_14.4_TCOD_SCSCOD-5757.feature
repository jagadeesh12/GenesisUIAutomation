Feature: Free New Teacher Kit

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-5757        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@RewardsAndCoupons
@SCSCOD-5757
@Priority1
@Sprint-14.5
Scenario Outline: New teacher still receive Free New Teacher Kit if order total is zero with redemptions:[<UsingData>]

Given teacher is new to RCO clubs and newTeacherFlag option is checked in BM
And teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
And teacher add items to cart
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When Teacher makes order total as zero by applying redemptions
Then Teacher should see Free Teacher Kit promotion is displayed

Examples:
|UsingData|
|InSprint14.5:TCOD:teacher_with_soo_and_Automatic_NewTeacherKit_Redemptions|


@RewardsAndCoupons
@SCSCOD-5757
@Priority1
@Sprint-14.5
Scenario Outline: New teacher receives Free New Teacher Kit:[<UsingData>]

Given teacher is new to RCO clubs and newTeacherFlag option is checked in BM
And teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
When teacher add items to cart
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then Teacher should see Free Teacher Kit promotion is displayed

Examples:
|UsingData|
|InSprint14.5:TCOD:teacher_with_soo_and_Automatic_NewTeacherKit|



@RewardsAndCoupons
@SCSCOD-5757
@Priority1
@Sprint-14.5
Scenario Outline: New teacher receives Free New Teacher Kit on only teacher club items:[<UsingData>]

Given teacher is new to RCO clubs and newTeacherFlag option is checked in BM
And teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
When teacher add teacher club items to cart
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then Teacher should see Free Teacher Kit promotion is displayed

Examples:
|UsingData|
|InSprint14.5:TCOD:teacher_with_soo_and_Automatic_NewTeacherKit_TeacherClubItems|



@RewardsAndCoupons
@SCSCOD-5757
@Priority1
@Sprint-14.5
Scenario Outline: Existing teacher does not receives Free New Teacher Kit:[<UsingData>]

Given teacher is already existing user to RCO clubs
And teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
When teacher add items to cart
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then Teacher should not receive Free Teacher Kit promotion

Examples:
|UsingData|
|InSprint14.5:TCOD:teacher_with_soo_and_Automatic_Existing_NewTeacherKit|


@RewardsAndCoupons
@SCSCOD-5757
@Priority1
@Sprint-14.5
Scenario Outline:New teacher receives Free New Teacher Kit along with Free item promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]

Given teacher is new to RCO clubs and newTeacherFlag option is checked in BM
And teacher logs into the application by providing [UserInformation]
And teacher selects “enter classroom order” from home page
When teacher adds student club items to cart with [minumum amount]
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
Then Teacher should see Free Teacher Kit promotion is displayed
And Teacher should see Free item promotion is displayed

Examples:
|UsingData|
|InSprint14.3:TCOD:teacher_with_soo_and_Automatic_NewTeacherKit_FreeItemPromo|

