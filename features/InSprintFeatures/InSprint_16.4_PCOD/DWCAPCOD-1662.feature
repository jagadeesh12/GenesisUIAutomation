Feature: DWCAPCOD-1662
  Parent - Sitewide - Suppress Teacher Resources Products in Parent Site - Demandware updates

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

  @DWCAPCOD-1662
  @Parent_Freepick
  @Priority1
  @Sprint-16.4
  @1
  Scenario Outline: Teacher Resource items not displayed on Free Pick modal:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent navigates to Review cart page
    When parent applies Free Pick coupon
    And parent searches for a Teacher Resource item# in the Free Pick modal
    Then parent do not see teacher resource items in the results
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ReviewCart:Freepick_Search:NoTeacherResource|

  @DWCAPCOD-1662
  @Parent_Freepick
  @Priority1
  @Sprint-16.4
  @2
  Scenario Outline: Parent cannot find teacher resources items when clicked on grade level dropdown:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent navigates to Review cart page
    When parent applies Free Pick coupon
    And parent clicks on grade from grade level dropdown
    Then parent do not see teacher resource items in the selection section
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:ReviewCart:Freepick_GradeDropdown:NoTeacherResource|

  @DWCAPCOD-1662
  @Parent_Search
  @Priority1
  @Sprint-16.4
  @3
  Scenario Outline: Teacher Resource items not displayed on Search:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    When parent searches for a Teacher Resource item# on the Homepage
    Then parent do not see any results for that item
    Examples:
      |UsingData|
      |InSprint16.4:PCOD:Search:NoTeacherResource|