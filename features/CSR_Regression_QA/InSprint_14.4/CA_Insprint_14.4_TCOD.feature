Feature: As a QE want to validate Sprint14.4,TCOD Stories
  This feature is used to validate all scenarios

  Background:
    Given teacher open rco-scholastic web site

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6284    	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

#  @Manual
#  @SCSCOD-6284
#  @Sprint-14.4
#  @Bilingual
#  @ForeseeSurveyPopUp
#
#
#  Scenario Outline: New teacher logs in to RCO:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    When teacher login into the application by providing [UserInformation]
#    And the url contain en as language parameter
#    Then Foresee Survey pop-up is displayed
#    And the Survey pop-up is displayed in English
#
#  Examples:
#    |UsingData|
#    |QA:InSprint14.4:TCOD:TeacherLoginDefualtLang|
#
#
#  @Manual
#  @SCSCOD-6284
#  @Sprint-14.4
#  @Bilingual
#  @ForeseeSurveyPopUp
#
#  Scenario Outline: Teacher opens RCO website without changing language toggle:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher does not toggle to change language
#    And the url contain en as language parameter
#    When teacher login into the application by providing [UserInformation]
#    Then Foresee Survey pop-up is displayed
#    And the Survey pop-up is displayed in English
#
#  Examples:
#    |UsingData|
#    |QA:InSprint14.4:TCOD:TeacherLoginDefualtLang1|
#
#  @Manual
#  @SCSCOD-6284
#  @Sprint-14.4
#  @Bilingual
#  @ForeseeSurveyPopUp
#
#  Scenario Outline: Teacher opens RCO website, toggle language to French:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher selects language as French
#    And the url contain fr as language parameter
#    When teacher login into the application by providing [UserInformation]
#    Then Foresee Survey pop-up is displayed
#    And the Survey pop-up is displayed in French
#
#  Examples:
#    |UsingData|
#    |QA:InSprint14.4:TCOD:TeacherLoginFrenchLang|
#
#
#  @Manual
#  @SCSCOD-6284
#  @Sprint-14.4
#  @Bilingual
#  @ForeseeSurveyPopUp
#
# Scenario Outline: RCO url has en as a parameter in the url:[<UsingData>]
#
#   Given teacher logs into the application by providing [UserInformation]
#   And the url contain en as language parameter
#   When Foresee Survey pop-up is displayed on any page
#   Then the Survey pop-up is displayed in English
# Examples:
#   |UsingData  |
#   |QA:InSprint14.4:TCOD:Urlen1           |
#
#
#
#  @Manual
#  @SCSCOD-6284
#  @Sprint-14.4
#  @Bilingual
#  @ForeseeSurveyPopUp
#
#  Scenario Outline: RCO url has en as a parameter and teacher toggle to French:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And the url contain en as language parameter
#    When teacher toggle language to French
#    Then the url contains fr as language parameter
#    When Foresee Survey pop-up is displayed on any page
#    Then the Survey pop-up is displayed in French
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:Urlen1           |
#
#  @Manual
#  @Sprint-14.4
#  @Bilingual
#  @ForeseeSurveyPopUp
#  Scenario Outline: RCO url has fr as a parameter and teacher toggle to English:[<UsingData>]
#
#    Given teacher logs into the application by providing [UserInformation]
#    And the url contain fr as language parameter
#    When teacher toggle language to English
#    Then the url contains en as language parameter
#    When Foresee Survey pop-up is displayed on any page
#    Then the Survey pop-up is displayed in English
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:Urlen1           |


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6274    	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################

#  @Manual
#  @SCSCOD-6274
#  @Sprint-14.4
#  @Bilingual
#  @HeaderEnglish
#  @1
#
#  Scenario Outline: RCO header is displayed in English:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher does not toggle to change language
#    And the header is displayed is English
#    When teacher login into the application by providing [UserInformation]
#    Then teacher sees the header displayed is English
#    And teacher navigates to other pages
#    And all the pages display the header in English
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:HeaderEnglish        |
#
#
#  @Manual
#  @SCSCOD-6274
#  @Sprint-14.4
#  @Bilingual
#  @HeaderEnglish
#  @2
#
#  Scenario Outline: RCO header is displayed in French:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And header is displayed in the English
#    When teacher selects the language as French
#    Then the header is updated to display in French
#    And teacher login into the application by providing [UserInformation]
#    And header is displayed in the French
#    When teacher navigates to other pages
#    Then the header is displayed in French
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:HeaderFrench       |
#
#
#  @Manual
#  @SCSCOD-6274
#  @Sprint-14.4
#  @Bilingual
#  @HeaderEnglish
#  @3
#
#  Scenario Outline: Teacher change the language and header language is updated :[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And header is displayed in the English
#    When teacher login into the application by providing [UserInformation]
#    And teacher selects the language as French
#    Then header is displayed in the French
#    When teacher adds [ItemInformation] from Student Flyer page
#    And teacher selects the language as English
#    Then the header is displayed in English
#    And Teacher navigates to Review Your Cart page
#    And teacher selects the language as French
#    And the header is displayed in the French
#    And teacher see the header in French on all the subsequent pages
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:HeaderFrench 2      |
#
#
#  @Manual
#  @SCSCOD-6274
#  @Sprint-14.4
#  @Bilingual
#  @HeaderEnglish
#  @4
#
#  Scenario Outline: RCO Footer is displayed in English:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher does not toggle to change language
#    And the footer is displayed is English
#    When teacher login into the application by providing [UserInformation]
#    Then teacher sees the footer displayed is English
#    And teacher navigates to other pages
#    And all the pages display the footer in English
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:FooterEnglish        |
#
#
#  @Manual
#  @SCSCOD-6274
#  @Sprint-14.4
#  @Bilingual
#  @FooterEnglish
#  @5
#
#  Scenario Outline: RCO footer is displayed in French:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And footer is displayed in the English
#    When teacher selects the language as French
#    Then the footer is updated to display in French
#    And teacher login into the application by providing [UserInformation]
#    And footer is displayed in the French
#    When teacher navigates to other pages
#    Then the footer is displayed in French
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:FooterFrench       |
#
#
#  @Manual
#  @SCSCOD-6274
#  @Sprint-14.4
#  @Bilingual
#  @FooterEnglish
#  @6
#
#  Scenario Outline: Teacher change the language and footer language is updated :[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And footer is displayed in the English
#    When teacher login into the application by providing [UserInformation]
#    And teacher selects the language as French
#    Then footer is displayed in the French
#    When teacher adds [ItemInformation] from Student Flyer page
#    And teacher selects the language as English
#    Then the footer is displayed in English
#    And Teacher navigates to Review Your Cart page
#    And teacher selects the language as French
#    And the footer is displayed in the French
#    And teacher see the footer in French on all the subsequent pages
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:FooterFrench 2      |




##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6558  	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


#  @Manual
#  @SCSCOD-6558
#  @Sprint-14.4
#  @Bilingual
#  @ContentAssets
#
#
#  Scenario Outline: Content displays in English  :[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher view all the content displayed in English
#    When teacher login into the application by providing [UserInformation]
#    Then teacher navigates to home page
#    And all the content will be displayed in English
#    And teacher navigates to other pages
#    And all the content are displayed in English in all the pages
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:Content1     |
#
#
#
#  @Manual
#  @SCSCOD-6558
#  @Sprint-14.4
#  @Bilingual
#  @ContentAssets
#
#
#  Scenario Outline: Content displays in French  :[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher view all the content displayed in English
#    And teacher selects the language as French
#    When teacher login into the application by providing [UserInformation]
#    Then teacher navigates to home page
#    And all the content will be displayed in French
#    And teacher navigates to other pages
#    And all the content are displayed in French in all the pages
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:Content2     |
#
#
#  @Manual
#  @SCSCOD-6558
#  @Sprint-14.4
#  @Bilingual
#  @ContentAssets
#
#
#  Scenario Outline: Content on the RCO page updates from English to French :[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher view all the content displayed in English
#    And teacher selects the language as French
#    And the content on the page is displayed in French
#    When teacher login into the application by providing [UserInformation]
#    Then teacher navigates to home page
#    And all the content will be displayed in French
#    And teacher navigates to other pages
#    And all the content are displayed in French in all the pages
#
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:Content3     |
#
#
#  @Manual
#  @SCSCOD-6558
#  @Sprint-14.4
#  @Bilingual
#  @ContentAssets
#
#  Scenario Outline: Content on the RCO page updates from English to French and again to English:[<UsingData>]
#
#    Given teacher is on the unauthenicated page of RCO
#    And teacher view all the content displayed in English
#    And teacher selects the language as French
#    And the content on the page is displayed in French
#    When teacher login into the application by providing [UserInformation]
#    Then teacher navigates to home page
#    And all the content will be displayed in French
#    And teacher selects the language as English
#    And teacher navigates to other pages
#    And all the content are displayed in English in all the pages
#    When teacher selects the language again as French
#    Then the page should refresh and the content should now display in French
#    And the French content is displayed in all the subsequent pages
#
#
#  Examples:
#    |UsingData  |
#    |QA:InSprint14.4:TCOD:Content4   |

##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-6165    	             #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Teacher can use free shipping coupon on Student club items:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                    |
  | TCOD_ManualRewards_FreeShipping_StudentClubs |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Teacher can use free shipping coupon on Teacher catalogue items:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds teacher catalogue items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                        |
  | TCOD_ManualRewards_FreeShipping_TeacherCatalogue |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Teacher can use free shipping coupon when Student Club orders is reduced to zero:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable paper coupon amount for Student Club items
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                              |
  | TCOD_ManualRewards_FreeShipping_StudentClubs_ZeroOrder |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Teacher can use free shipping coupon when Teacher Catalogue orders is reduced to zero:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds teacher catalogue items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
And teacher applies redeemable bonus bank amount for Teacher Catalogue items
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
Then free shipping coupon is applied to order
Examples:
  | UsingData                                                  |
  | TCOD_ManualRewards_FreeShipping_TeacherCatalogue_ZeroOrder |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Teacher sees free shipping coupon removed when ‘X’ icon is clicked:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
And teacher clicks the ‘X’ icon next to coupon
Then free shipping coupon is removed from order
And teacher sees original amount for shipping
Examples:
  | UsingData                                        |
  | TCOD_ManualRewards_FreeShipping_StudentClubs_Removed |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Free shipping coupon removed when order amount qualifies for automatic free shipping [TCOD]:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
And teacher returns to Review Cart page
And teacher increases the quantity of first item in cart
And Teacher navigates to rewards & coupons page
Then free shipping coupon is removed from order
And teacher sees the automatic free shipping applied to order
Examples:
  | UsingData                                        |
  | TCOD_ManualRewards_FreeShipping_Removed_NoPaidShipping_StudentClubs |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Teacher cannot apply free shipping coupon when automatic free shipping is applied:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And Teacher adds items from different Student clubs same months
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
Then an error message is displayed
And free shipping coupon is not applied to order
Examples:
  | UsingData                                        |
  | TCOD_ManualRewards_FreeShipping_NotApplied_AutomaticFreeShipping_StudentClubs |
  
@Coupon-FreeShipping-TCOD
@SCSCOD-6165
@Priority1
@Sprint-14.4
@Release-5.17
Scenario Outline: Free shipping coupon remains when order amount does not qualify for automatic free shipping [TCOD]:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher adds student club items to cart below the free shipping
And Teacher navigates to Review Your Cart page
And Teacher navigates to rewards & coupons page
When teacher enters free shipping coupon
And teacher clicks apply on coupon code section
And teacher returns to Review Cart page
And teacher decreases the quantity of first item in cart
And Teacher navigates to rewards & coupons page
Then free shipping coupon remains on the order
And teacher sees the automatic free shipping applied to order
Examples:
  | UsingData                                        |
  | TCOD_ManualRewards_FreeShipping_Remains_StudentClubs |
  
#@Coupon-FreeShipping-TCOD
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: Teacher cannot apply free shipping coupon when it has expired:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher adds student club items to cart below the free shipping
#And Teacher navigates to Review Your Cart page
#And Teacher navigates to rewards & coupons page
#When teacher enters free shipping coupon that has expired
#And teacher clicks apply on coupon code section
#Then an error message is displayed
#And free shipping coupon is not applied to order
#Examples:
#  | UsingData                                        |
#  | TCOD_ManualRewards_FreeShipping_Expired_NotApplied_StudentClubs |
#  
#@Coupon-FreeShipping-TCOD
#@SCSCOD-6165
#@Manual
#@Sprint-14.4
#@Release-5.17
#Scenario Outline: Teacher sees correct layout of free shipping coupon:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher adds student club items to cart below the free shipping
#And Teacher navigates to Review Your Cart page
#And Teacher navigates to rewards & coupons page
#When teacher enters free shipping coupon
#And teacher clicks apply on coupon code section
#Then teacher sees header title ‘Coupons Applied’ in new layer below coupon module
#And teacher sees label “<Coupon Code> <Coupon Message>” below title
#And teacher sees an icon labelled ‘X’ to the right of the layer
#And teacher sees the 'Shipping & Handling' Charges as FREE
#Examples:
#  | UsingData                              |
#  | TCOD_ManualRewards_FreeShipping_Layout |