Feature: Search
	This feature is used to validate PCOD Search

 
Background: 
Given Parent opens scholastic reading clubs e-commerce site




@Search
@DWCAPCOD-115
@Priority1
Scenario Outline:Searching with Item# navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent enters valid Item# in search field and click on search icon
Then PDP of the searched item displays

Examples:
  |UsingData                             |
  |InSprint13.1:PCOD:Parent_SearchbyItem#|
  
  
@Search
@DWCAPCOD-115
@Priority1
Scenario Outline:Searching with exact matching title navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent enters exact matching title in search field and click enter button
Then PDP of the searched item displays

Examples:
  |UsingData                                 |
  |InSprint13.1:PCOD:Parent_SearchbyItemtitle|
  
  
@Search
@DWCAPCOD-115
@Priority1
Scenario Outline:Searching with exact matching author name navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent enters exact matching author name in search field and click enter button
Then PDP of the searched author displays

Examples:
  |UsingData                                  |
  |InSprint13.1:PCOD:Parent_SearchbyAuthorName|
  
  
@Search
@DWCAPCOD-116
@Priority3

Scenario Outline:Pop up seen when clicked on the Reading Level in PDP page:[<UsingData>]    
   
Given Parent login in with valid [username] and [password]
And parent searches with valid item which is having reading level information
And PDP of the item displays
When parent click on Reading Level line
Then pop up is displayed with reading level infomation
And “About Reading Levels” link is present in the pop up

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_ReadingLevelWindowPopup|


@Search
@DWCAPCOD-116
@Priority3

Scenario Outline:Clicking on close icon in 'About Reading Levels' window in PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid item which is having reading level information
And PDP of the item displays
And parent click on Reading Level line
And clicks “About Reading Levels” link present in the pop up
When parent clicks on close icon
Then “About Reading Levels” window is closed

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_ReadingLevelWindowCloseIcon|



@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Clicking on item from search result page navigates to PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches with valid partial matching title
And clicks on any of the item
Then correct PDP of the item displays

Examples:
  |UsingData|
  |InSprint13.1:PCOD:Parent_SearchResultPage_ItemClick|
  
  
  
@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Parent cannot enter more than 999 in Quantity input field:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
When parent enter more than 999 in quantity input field
Then it should not allow to enter more than 3 digits

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_QuantityMoreThan3Digits|


@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Parent edits the quantity in PDP page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
When parent enter some number in quantity input field
Then quantity field should be displayed as entered
When parent edits the quantity field
Then modified data should be displayed in quantity input field

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_QuantityEdit|



@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Parent cannot enter negative value in Quantity field in PDP page:[<UsingData>] 

Given Parent login in with valid [username] and [password]
And parent searches with valid exact title
And PDP of the item displays
When parent tries to enter negative value in quantity input field
Then negative value is not accepted in quantity field

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_QuantityNegative|


@Search
@DWCAPCOD-116
@Priority2
Scenario Outline:Clicking on "Back To Results" link on PDP page should navigate back to search result page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with valid partial matching title
And parent clicks on any of the item present in search result page
And PDP of the item displays
When parent clicks on “Back To Results” link
Then parent is navigated back to search result page

Examples:
|UsingData|
|InSprint13.1:PCOD:Parent_PDPPage_BackToResultLink|



@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:No Search results page displays when user searches for a term with no results:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches with non-existing keyword
And parent clicks enter
Then no search results page displays

Examples:
  |UsingData                    |
  |PCOD:Parent_NoResults_Keyword|
  
  
@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:No Search results page displays when user searches with a non-existing item#:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches for non-existing item#
And parent click on Search icon
Then no search results page displays

Examples:
  |UsingData                  |
  |PCOD:Parent_NoResults_Item#|
  
  
  
@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:Parent searches for an author with no results:[<UsingData>]

Given Parent login in with valid [username] and [password]
When parent searches with author name with no results
Then no search results page displays

Examples:
  |UsingData                  |
  |PCOD:Parent_SearchbyKeyword|
  
  
@Search
@DWCAPCOD-305
@Priority2
Scenario Outline:Parent searches for Item# from no results page:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent searches with Item# with no results
Then no search results page displays
When parent searches for valid item# from no search results page
Then parent is navigated to PDP page
Examples:
  |UsingData                   |
  |PCOD:Parent_Search_NoResults|
  
  
  


