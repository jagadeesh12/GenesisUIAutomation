Feature: Locate Account – Search Results – Account Number  – Record Count & Account Number
	This feature is to validate the Locate Account – Search Results – Account Number  – Record Count & Account Number scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount
@Priority1
@DWCACSR-1525
@Manual
@1
Scenario Outline:CSR sees correct search results displayed with the School Address and the Account Number:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then the text displays 'We found ## results for [School Name]. Account #:[Ac Number]' in Search results page
	
Examples:
  | UsingData 										|
  | Count_of_Search_results_in_SearchResultsPage	|
  
  
          