Feature: Validation of SCSCOD-7619 scenarios for Sprint 15.3
	This feature is used to validate all scenarios for SCSCOD-7619

Background:
	Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7619      			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


	@SCSCOD-7619
	@Priority1
	@Sprint-15.3
	@SFOPage_FreePickModal
	@Release-BTS2017
	@1

	Scenario Outline:Enter FreePick coupon Equal to 15 characters:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher clicks enter orders
		And teacher clicks “Student Flyer Orders” link
		And Student Flyer Orders modal is dispalyed
		And teacher click on link “Apply a coupon for this student”
		And SFO Coupon Modal is displayed
		And teacher enters valid Student Name
		When teacher enters valid Coupon code equal to 15 characters
		Then teacher click on Apply



		Examples:
			| UsingData |
			| SFO_FreePick_coupon_15 |



	@SCSCOD-7619
	@Priority1
	@Sprint-15.3
	@SFOPage_FreePickModal
	@Release-BTS2017
	@2


	Scenario Outline:Enter FreePick coupon less than 3 characters:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher clicks enter orders
		And teacher clicks “Student Flyer Orders” link
		And Student Flyer Orders modal is dispalyed
		And teacher click on link “Apply a coupon for this student”
		And SFO Coupon Modal is displayed
		And teacher enters valid Student Name
		When teacher enters valid Coupon code less than 3 characters
		And Apply button is disabled



		Examples:
			| UsingData |
			| SFO_FreePick_coupon_2|


	@SCSCOD-7619
	@Priority1
	@Sprint-15.3
	@SFOPage_FreePickModal
	@Release-BTS2017
	@3



	Scenario Outline:SFO FreePick coupon redeemed is displayed on SFO page:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher clicks enter orders
		And teacher clicks “Student Flyer Orders” link
		And Student Flyer Orders modal is dispalyed
		And teacher click on link “Apply a coupon for this student”
		And SFO Coupon Modal is displayed
		And teacher enters valid Student Name
		And teacher enters valid Coupon code
		And teacher click on Apply
		When teacher redeems the coupon
		Then the entered coupon code is displayed under Coupon header

		Examples:
			| UsingData |
			| SFO_FreePick_coupon_redeem|