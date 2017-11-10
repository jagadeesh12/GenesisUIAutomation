Feature: Search
	This feature is used to validate all scenarios

 
Background: 
	Given teacher open rco-scholastic web site 
	

#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            SEARCH SCENARIOS                            ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################


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
  |UsingData|
  |Search_ViewAll|
  
  
  
@Search 
@Sprint18
@Priority3
Scenario Outline:Teacher does not see View All link when search results are less than 15:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query with less than 15 results
When search results are presented with results set less than the default 15 items
Then View All link does not display

Examples:
  |UsingData|
  |Search_WithLessProductsViewAll|
  
  
  
##################################################################################################################################################    
##################################################################################################################################################    
###########################################   							             #############################################################   
###########################################    STORY - 3919 SEARCH RESULTS           #############################################################
###########################################   							             #############################################################        
##################################################################################################################################################        
##################################################################################################################################################
  
@Search 
Scenario Outline:Teacher should get user friendly page when searched anything which generates zero matches:[<UsingData>]
	
Given teacher logs into the application by providing [UserInformation]
And teacher have entered search query for a product that does not match any items in the database
When search results are displayed [UserInformation]
Then the search result page displays Sorry no results page is displayed

Examples:
  |UsingData|
  |dev35:Search_NoResult|
    
@Search 
  Scenario Outline: Teacher should get user friendly page when searched anything which generated zero matches in already searched page:[<UsingData>]
 
  Given teacher logs into the application by providing [UserInformation]
  And teacher have entered search query in the search field which has more than 15 results
  When search results are presented with results set greater than the default 15 items and View All link
  And teacher have entered search query for a product that does not match any items in the database
  When search results are displayed [UserInformation]
  Then the search result page displays Sorry no results page is displayed
  
  Examples:
  |UsingData|
  |dev35:Search_NoResult_fromSearchResultPage|
  
  
@Search  
  Scenario Outline: Teacher, when searched with valid keyword in second search field should navigate to search result page:[<UsingData>]
 
 Given teacher logs into the application by providing [UserInformation]
 And teacher have entered search query for a product that does not match any items in the database
 When search results are displayed [UserInformation]
 Then the search result page displays Sorry no results page is displayed
 And Teacher have entered search query in the search field which return search result
 Then Search result page should display the searched item
 
 Examples:
  |UsingData|
  |dev35:Search_NoResult_AgainSearchPage|
  
  
  
  @Sprint12.3
  @Search
  @Priority2
  Scenario Outline:Teacher sees Item ID and flyer according to logged in teachers grade:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is present in logged in teacher's grade and also in other grades
    Then teacher sees grade related to logged in teacher for item in PDP page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_MultipleGrades|


  @Sprint12.3
  @ReviewCart
  @Priority2
  Scenario Outline:Teacher sees Item ID according to logged in teachers grade in Review Cart page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher add item to cart which is present in logged in teacher's grade and also in other grades
    Then teacher sees grade related to logged in teacher for item in Review Cart page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductReviewCart_MultipleGrades|

  @Sprint12.3
  @Search
  @Priority2
  Scenario Outline:Teacher sees Item ID from default grade or according to search ranking rule:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is not present in logged in teacher's grade
    Then teacher sees default grade or according to search ranking rule to teacher’s grade in PDP page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_NotPresentTeachersGrade|

  @Sprint12.3
  @ReviewCart
  @Priority2
  Scenario Outline:item is not available in logged in teacher’s grade,Review Cart display ItemID from Default Grade:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    When teacher add item to cart which is not present in logged in teacher's grade
    Then teacher sees default grade or according to search ranking rule to teacher’s grade in Review Cart page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductReviewCart_NotPresentTeachersGrade|


  @Sprint12.3
  @Search
  @Priority2
  Scenario Outline:Teacher do not see Item ID in PDP page for teacher is admin or teacher by speciality:[<UsingData>]
  
    Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is present in multiple grades
    Then teacher do not see any item id in PDP page

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_Admin|

  @Sprint12.3
  @Search
  @Priority2
  Scenario Outline:Item ID,flyes in PDP page for same item available in other grades:[<UsingData>]
  
   Given teacher logs into the application by providing [UserInformation]
    When teacher searches for item which is present in logged in teacher's grade and also in other grades
    And mouse hover the grade in PDP page
    Then teacher sees correct order of item id's and grades

  Examples:
    |UsingData|
    |InSprint_12.3:dev35:TecherGrade_ProductPDP_ItemIdsGradesOrder|
  
  
  
  ##################################################################################################################################################
##################################################################################################################################################
###########################################   							             ############################################################
###########################################   		    SCSCOD-5663        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3
  Scenario Outline: Teacher is able to search with Item# on the homepage:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher enters an Unique Item # in search bar
    And the search result returns single match
    When teacher click on search
    Then teacher is navigated to the PDP for the matching product
    And teacher adds “ItemInformation” from YTO page
    And the review cart page displays the searched item
    When teacher click on the Item# on the Review Cart page
    Then teacher should be navigated to Quick View PDP page with correct itemNo
    #And teacher clicks on Proceed to Checkout button
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher clicks on "Continue checkout"
    And teacher lands on Confirm and Submit page
    And teacher should see the correct item number in the Confirm and Submit page
    When teacher clicks on Submit Order
    Then order is succefully submitted and teacher sees correct item numbers in confirmation page
    And teacher navigates to my account page and click on view order under order history
    And correct item number should be displayed
    #And teacher checks email confirmation and correct item number should be dispalyed

    Examples:
      |UsingData|
      |Dev35:Search_HomePage_Valid_ItemNo|


  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3
  Scenario Outline: Teacher is able to search with Item# on the YTO Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher have entered search query with valid ItemNo
    And the search result returns single match
    When teacher click on search
    Then teacher is navigated to the PDP for the matching product
    And teacher adds “ItemInformation” from YTO page
    And the review cart page displays the searched item
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher clicks on "Continue checkout"
    And teacher lands on Confirm and Submit page
    And teacher should see the correct item number in the Confirm and Submit page
    When teacher clicks on Submit Order
    Then order is succefully submitted and teacher sees correct item numbers in confirmation page
    And teacher navigates to my account page and click on view order under order history
    And correct item number should be displayed
   # And teacher checks email confirmation and correct item number should be dispalyed

    Examples:
      |UsingData|
      |Dev35:Search_YTO_Valid_ItemNo|

  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3

  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3
  Scenario Outline:Teacher is able to search with Item# on the ReviewCart Page:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher selects “enter classroom order” from home page
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to Review Your Cart page1
    And teacher have entered search query with valid ItemNo
    And the search result returns single match
    When teacher click on search
    Then teacher is navigated to the PDP for the matching product
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to payment page
    And teacher selects checks as payment
    And teacher clicks on "Continue checkout"
    And teacher lands on Confirm and Submit page
    And teacher should see the correct item number in the Confirm and Submit page
    When teacher clicks on Submit Order
    Then order is succefully submitted and teacher sees correct item numbers in confirmation page
    And teacher navigates to my account page and click on view order under order history
    And correct item number should be displayed
    #And teacher checks email confirmation and correct item number should be dispalyed

    Examples:
      |UsingData|
      |Dev35:Search_ReviewCart_Valid_ItemNo|

  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3
Scenario Outline: Teacher sees zero result page with invalid Item# search:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher have entered search query with In-valid ItemNo
    When teacher click on search
    Then the search result page displays Sorry no results page is displayed

Examples:
  |UsingData|
  |Dev35:Search_Invalid Item No|



  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3
  Scenario Outline: Teacher sees Item# on the PDP :[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher have entered search query with valid ItemNo
    When teacher click on search
    Then teacher is navigated to the PDP for the matching product
    And item# field on the PDP displays the same Item# used in search bar

Examples:
  |UsingData|
  |Dev35:PDP_Item No_Dispalyed|


