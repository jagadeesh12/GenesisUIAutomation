Feature: Rewards and Coupons
	This feature is used to check the "Search" scenario validation

 
Background: 
	Given teacher open rco-scholastic web site 

	
 
 @Search	    
@Sprint18
@Priority2
Scenario Outline:Teacher can view all search results when there are more than 15 results for a given search term:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query in the search field which has more than 15 results
When search results are presented with results set greater than the default 15 items and View All link
And teacher clicks on View All link
Then all the search results displays as teacher scrolls through the page

Examples:
  | UsingData                                |
  | Search_ViewAll                           |
  
  
  
@Search 
@Sprint18
@Priority3
Scenario Outline:Teacher does not see View All link when search results are less than 15:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query with less than 15 results
When search results are presented with results set less than the default 15 items
Then View All link does not display

Examples:
  | UsingData                                |
  | Search_WithLessProductsViewAll                          | 
  