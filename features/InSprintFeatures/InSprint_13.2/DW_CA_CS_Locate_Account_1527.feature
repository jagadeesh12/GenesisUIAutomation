Feature: Locate Account – Search Results – Account Number – Account Listing
	This feature is to validate the Locate Account – Search Results – Account Number – Account Listing scenarios

 
Background: 
	Given CSR opens the rco-scholastic web site


@LocateAccount
@Priority1
@DWCACSR-1527
@Manual
@1
Scenario Outline:CSR sees correct details in a tabular structure containing the Teacher Account record(s):[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	When CSR searches with the [Account Number]
	Then CSR is presented with the tabular structure containing the Teacher Account record(s)
	And the table contains the header names [Teacher Name] [Email] [Account#] [SCHOOL NAME] [SCHOOL ADDRESS] [ACC STATUS]
	And the Teacher's last name is sorted by default
	And downward pointing arrow is positioned directly to the right of each header label
	And CSR sees Teacher's First & Last Name under [Teacher Name] header
	And CSR sees Teacher's unique email address under [Email] header
	And CSR sees Teacher's Account Number under [Account#] header
	And CSR sees full name of the Teacher's School under [School Name] header
	And CSR sees Teacher's full address of School under [School Address] header
	And CSR sees Teacher's Account status under [Acc Status] header depends on Account status either [Active] [Inactive] [Temporary on hold]
	And all the items within the tabular structure are vertically-aligned ‘top’ and horizontally-aligned ‘left’
	And each attribute listed within the tabular structure is hyperlinked
	
Examples:
  | UsingData 										|
  | Count_of_Search_results_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1527
@Manual
@2
Scenario Outline:CSR sees correct Tooltip message when he mouse over on the w.r.t that fields:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR mouse over on Email Address
	Then the same email address should display in a Tooltip
	When CSR mouse over on Account Number
	Then the same Account Number should display in a Tooltip
	When CSR mouse over on School Name
	Then the same School Name should display in a Tooltip
	When CSR mouse over on School Address
	Then the same School Address should display in a Tooltip
	
Examples:
  | UsingData 														|
  | Tooltip_msg_on_mouseOver_Search_results_in_SearchResultsPage	|
  
  
@LocateAccount
@Priority1
@DWCACSR-1527
@Manual
@3
Scenario Outline:Order Entry page displays when CSR clicks on hyperlinks in a Search results table:[<UsingData>]
	
	Given CSR logs into the application by providing [UserInformation]
	And CSR selects the order type as [Phone Order]
	And CSR searches with the [Account Number]
	When CSR clicks on Teacher name hyperlink
	Then Order Entry page displays
	When CSR clicks on Email address hyperlink
	Then Order Entry page displays
	When CSR clicks on Account number hyperlink
	Then Order Entry page displays
	When CSR clicks on School Name hyperlink
	Then Order Entry page displays
	When CSR clicks on School Address hyperlink
	Then Order Entry page displays
	When CSR clicks on Acc Status hyperlink
	Then Order Entry page displays
	
Examples:
  | UsingData 										|
  | Order_entry_page_displays_clicks_on_hyperlinks	|
  
             