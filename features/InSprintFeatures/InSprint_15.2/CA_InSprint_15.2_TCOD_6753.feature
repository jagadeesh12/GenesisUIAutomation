Feature: InSprint_15.2 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################                              #########################################################################
###########################################           SCSCOD-6753         ########################################################################
###########################################                               ########################################################################
###########################################                              #########################################################################
##################################################################################################################################################
##################################################################################################################################################

  #THIS HAS TO BE MOVED TO BTS FOLDER ONCE AUTOMATION IS COMPLETE

  @SCSCOD-6753
  @Priority1
  @Sprint-15.2
  @RewardsAndCoupons
  @NewTeacherKit
  @Release-BTS2017
  @SS

  Scenario Outline:As a teacher, I should see Free New Teacher Kit promotion:[<UsingData>]

    Given teacher is new to RCO clubs and placed an order who earned a New Teacher Kit Automatic Reward along with Free Item, DTS and Free pick
    And teacher navigates to Order history section under My Account page
    When teacher clicks on “View Details” link for recently placed order
    Then teacher should land on Order Details page and see Free Teacher Kit promotion in Rewards section along with Free Item, DTS and Free pick

    Examples:
      |UsingData                                                                         |
      |InSprint15.2:TCOD:Teacher_Automatic_NewTeacherKit_OrderDetailsPage_OtherPromotions|

