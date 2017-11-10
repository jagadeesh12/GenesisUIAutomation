Feature: TCOD-Self Registration
	This feature is to validate the RCO Select Grade

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-8250    			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


	@SCSCOD-8250
	@Priority1
	@Sprint-16.1
	@TCOD-SelfRegistration
	@1

	Scenario Outline:Teacher see Create An Account option on homepage :[<UsingData>]

		Given teacher is on the RCO unauthenticated page
		And a block First Time Here? Teachers is displayed
		And teacher is presented with button Create An Account
		And Activate Your Account button should not be displayed anymore
		And a hyperlink Activate Your Account should be displayed

		Examples:
			| UsingData |
			| QA_SelfRegBlock|


	@SCSCOD-8250
	@Priority1
	@Sprint-16.1
	@TCOD-SelfRegistration
	@2

	Scenario Outline:Teacher view FR version of Self Registration modal :[<UsingData>]

		Given teacher is on the RCO unauthenticated page
		When teacher toggle to FR
		Then the FR version of the block First Time Here? Teachers is displayed
		And FR version of button Create An Account is displayed
		And Activate Your Account button should not be displayed anymore
		And FR version of hyperlink Activate Your Account is displayed



		Examples:
			| UsingData |
			| QA_SelfRegBlock_FR|



	@SCSCOD-8250
	@Priority1
	@Sprint-16.1
	@TCOD-SelfRegistration
	@3

	Scenario Outline:Teacher Self Registration Modal is Displayed :[<UsingData>]

		Given teacher is on the RCO unauthenticated page
		And a block First Time Here? Teachers is displayed
		When teacher click on the link Create An Account
		Then Self registraion modal window is displayed



		Examples:
			| UsingData |
			| QA_SelfRegistrationModal|



	@SCSCOD-8250
	@Priority1
	@Sprint-16.1
	@TCOD-SelfRegistration
	@4

	Scenario Outline:Teacher Self Registration Modal toggle to FR :[<UsingData>]

		Given teacher is on the RCO unauthenticated page
		And a block First Time Here? Teachers is displayed
		And teacher click on the link Create An Account
		And Self registraion modal window is displayed
		When teacher switch to FR
		Then FR version of the Self registration modal is displayed
		And teacher toggles back to EN
		And the EN version of Self registration modal is displayed



		Examples:
			| UsingData |
			| QA_SelfRegistrationModal_UpdateFR|



	@SCSCOD-8250
	@Priority1
	@Sprint-16.1
	@TCOD-SelfRegistration
	@5

	Scenario Outline:Teacher Self Registration Modal is Displayed in FR :[<UsingData>]

		Given teacher is on the RCO unauthenticated page
		And teacher toggle to FR
		And the FR version of the block First Time Here? Teachers is displayed
		And FR version of button Create An Account is displayed
		And FR version of hyperlink Activate Your Account is displayed
		When teacher click on the link Create An Account
		Then FR version of Self registration modal is displayed


		Examples:
			| UsingData |
			| QA_SelfRegistrationModal_FR|




	@SCSCOD-8250
	@Priority1
	@Sprint-16.1
	@TCOD-SelfRegistration
	@6

	Scenario Outline:Teacher can Activate Account :[<UsingData>]


		Given teacher is on the RCO unauthenticated page
		And teacher clicks on the Activate Your Account button
		When the Activation modal is displayed
		Then teacher should be able to activate her account
		And teacher should be able to login with the new password


		Examples:
			| UsingData |
			| QA_SelfRegistrationModal_FR|














