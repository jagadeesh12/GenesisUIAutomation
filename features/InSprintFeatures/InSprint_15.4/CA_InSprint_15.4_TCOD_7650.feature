Feature: MyAccount-MobileNo
	This feature is to validate the RCO Select Grade

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7650     			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@1

	Scenario Outline:Teacher see mobile number under My Profile:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		When clicks on Profile from My Account dropdown
		Then teacher navigates to My Reading Club account page
		And below Phone field Mobile field is displayed
		And acutal mobile number is displayed


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile |


	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@2

	Scenario Outline:Teacher only mobile number label under My Profile:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		When clicks on Profile from My Account dropdown
		Then teacher navigates to My Reading Club account page
		And below Phone field Mobile field is displayed
		And as teacher has not entered mobile number only Label Mobile will be displayed


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_label |




	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@3

	Scenario Outline:Teacher edits profile information and edit mobile number:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher enters mobile number equal 10 numbers
		Then mobile number is typed in
		And teacher save my profile
		And entered mobile number is dispalyed in My Profile


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_No10 |



	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@4

	Scenario Outline:Mobile field does not allow alphabet and specail character :[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher tries to types string character alphabets or special character in Mobile field
		Then the field should not take string values


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_String|



	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@5

	Scenario Outline:Error message is dispalyed when - is entered in mobile field :[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher enters - in the mobile no field
		Then error call out message is displayed


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_-|


	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@6

	Scenario Outline:Error message is dispalyed for 0,1 as first character on mobile no :[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher enters[0] OR [1] as first digit and tabs out
		Then error call out message is displayed


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_01|



	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@7

	Scenario Outline:Error message is dispalyed mobile no less than 10:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher enters less than 10 digit and tabs out
		Then error call out message is displayed


		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_9|


	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@8

	Scenario Outline:Edit Profile Modal Save button Not Enabled:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher deleted both Phone and Mobile
		Then SAVE button is not enabled in Edit Profile Modal

		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_SaveDisable|


	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@9

	Scenario Outline:Edit Profile Modal Save button  Enabled:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And clicks on Profile from My Account dropdown
		And teacher navigates to My Reading Club account page
		And teacher clicks on edit
		And Edit profile modal is displayed
		When teacher types either [Phone] OR [Mobile] No
		Then SAVE button is enabled in Edit Profile Modal

		Examples:
			| UsingData |
			| MyAccount_DisplayMobile_Save_PhoneEnable|
			| MyAccount_DisplayMobile_Save_MobileEnable|


	@SCSCOD-7650
	@Priority1
	@Sprint-15.4
	@MyAccount-Mobile
	@Release-BTS2017
	@10

	Scenario Outline:CSR Profile information display Mobile :[<UsingData>]

		Given CSR logs into the application by providing [UserInformation] whose account status is active
		And CSR selects the order type as [Phone Order]
		When CSR navigates to Verify Account Page
		Then Verify Account page displays Mobile label below phone





		Examples:
			| UsingData |
			| CSR_VerifyAccount_Mobile          |

