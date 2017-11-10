Feature: Login to redington

	Scenario Outline:  Login to application:[<UsingData>]
	
	Given login to redington[UserInformation]
	
	Examples:
	|UsingData|
	|RedingtonLogin|