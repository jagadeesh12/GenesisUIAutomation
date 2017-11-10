Feature: InSprint_14.3 TCOD

	This feature is used to validate all scenarios

 
Background: 
Given teacher open rco-scholastic web site



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


  Scenario Outline: Teacher is able to search with Item on the homepage:[<UsingData>]

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
      | UsingData |
      | Dev35:Search_HomePage_Valid_ItemNo  |


  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3

  Scenario Outline: Teacher is able to search with Item on the YTO Page:[<UsingData>]


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
      | UsingData                                |

      | Dev35:Search_YTO_Valid_ItemNo1           |

  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3

  Scenario Outline:Teacher is able to search with Item on the ReviewCart Page:[<UsingData>]


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
      | UsingData                                |

      | Dev35:Search_ReviewCart_Valid_ItemNo2                          |


  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3

Scenario Outline: Teacher sees zero result page with invalid Item search:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher have entered search query with In-valid ItemNo
    When teacher click on search
    Then the search result page displays Sorry no results page is displayed

    Examples:
      | UsingData                                |

      | Dev35:Search_Invalid Item No3                       |



  @SCSCOD-5663
  @SearchUniqueItemID
  @Search
  @Priority1
  @Sprint-14.3

  Scenario Outline: Teacher sees Item on the PDP :[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher have entered search query with valid ItemNo
    When teacher click on search
    Then teacher is navigated to the PDP for the matching product
    And item# field on the PDP displays the same Item# used in search bar

    Examples:
      | UsingData                                |

      | Dev35:PDP_Item No_Dispalyed4                       |
