Feature: qastudentincentive
  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site


#######################################################################################################################################################
#######################################################################################################################################################
#################################################                                                        ##############################################
#################################################            QA STUDENT INCENTIVE SCENARIOS              ##############################################
#################################################                                                        ##############################################
#######################################################################################################################################################
#######################################################################################################################################################


  @Golden
  @SCSCOD-3462
  @qastudentincentive
  @Priority1
  Scenario Outline:Teacher enters 50 students in QA Student incentive and checkout:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    When teacher views Q & A Student incentive with no. of students
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees Q & A student incentive information in rewards section on Confirmation page

  Examples:
    |UsingData|
    |Golden:teacher_login_with_twentydollar_enterstudents_50|


  @Golden
  @SCSCOD-3462
  @qastudentincentive
  @Priority1
  Scenario Outline:Teacher enters 49 students in QA Student incentive and checkout:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    When teacher views Q & A Student incentive with no. of students
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees Q & A student incentive information in rewards section on Confirmation page

  Examples:
    |UsingData|
    |Golden:teacher_login_with_twentydollar_enterstudents_49|


  @Golden
  @qastudentincentive
  @Priority1
  Scenario Outline:Teacher enters 12 students in QA Student incentive and checkout:[<UsingData>]

    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    When teacher views Q & A Student incentive with no. of students
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees Q & A student incentive information in rewards section on Confirmation page

  Examples:
    |UsingData|
    |Golden:teacher_login_with_twentydollar_enterstudents_12|



  @Golden
  @SCSCOD-3469
  @qastudentincentive
  @Priority1
  Scenario Outline:Teacher should not receive QA Student incentive promotion on cart with Teacher catalogs:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    When teacher selects [enter classroom order] from home page
    When teacher add “teacher club items” to cart from YTO page
    And teacher navigates to coupons & Rewards page
    Then teacher should not see Q & A Student incentive line


  Examples:
    |UsingData|
    |Golden:teacher_login_TeacherCatalogueItems_QAStudentIncentive|




  @qastudentincentive
  @SCSCOD-3462
  @Priority3
  Scenario Outline:Teacher enters 0 and then edits to a non-zero number in no. of students:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    When teacher views Q & A Student incentive with no. of students
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    And teacher navigates back to coupons & Rewards page from confirm & submit page
    And teacher re-enters number of students in text field
    And teacher proceeds to confirm & submit page from couons & rewards page
    Then teacher sees updated Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees updated Q & A student incentive information in rewards section on Confirmation page


  Examples:
    |UsingData|
    |teacher_login_Item_enterstudents_0_enterstudents_14|



  @qastudentincentive
  @SCSCOD-3463
  @Priority3
  Scenario Outline:Teacher enters non-Zero number and then edits the no. of Students to 0:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    When teacher views Q & A Student incentive with no. of students
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    And teacher navigates back to coupons & Rewards page from confirm & submit page
    And teacher re-enters number of students in text field
    And teacher proceeds to confirm & submit page from couons & rewards page
    Then Teacher does not see Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    Then Teacher does not see Q & A student incentive information in rewards section on Confirmation page


  Examples:
    |UsingData|
    |teacher_login_Item_enterstudents_14_enterstudents_0|



  @qastudentincentive
  @SCSCOD-3468
  @Priority2
  Scenario Outline:Teacher cannot enter no. of students greater than 50 or negative value:[<UsingData>]


    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    When Teacher navigates to rewards & coupons page
    When teacher views Q & A Student incentive with no. of students
    And teacher enters number of students in text field
    And teacher tries to checkout from rewards and coupons page
    Then teacher sees appropriate error message for maximum input
    And teacher re-enters number of students in error text field
   #And teacher sees Q & A Student incentive field should not take negative value


  Examples:
    |UsingData|
    |teacher_login_Item_enterstudents_51_enterstudents_-1|



################################			PRIORITY 2 SCENARIOS			#######################################################################


  @qastudentincentive
  @Priority2
  Scenario Outline:Teacher should not receive Q&A Student incentive promotion when teacher deletes items from Student club:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher add items from different Student and Teacher clubs
    And teacher navigates to coupons & Rewards page
    And teacher views Q & A Student incentive with no. of students
    And teacher navigates to Review Your cart page from Coupons & Rewards page
    When teacher deletes all items from Students clubs
    And teacher navigates to coupons & Rewards page
    Then teacher should not see Q & A Student incentive line

  Examples:
    |UsingData|
    |BTS:teacher_login_StudentAndCatalogueItems_QAStudentIncentive|





  @Sprint-13.3
  @Auto-Q&A-Toss-in
  @Priority3
  @SCSCOD-5533
  Scenario Outline: Teacher deletes the number in no. of students:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    And teacher views Q & A Student incentive with no. of students defaulted to 0
    And teacher enters number of students in text field
    When teacher removes data in no. of students
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees updated Q & A student incentive information in rewards section on Confirmation page

  Examples:
    | UsingData |
    | Dev35:teacher_login_Delete_NoOfStudents |

  @Sprint-13.3
  @Auto-Q&A-Toss-in
  @Priority1
  @SCSCOD-5533
  Scenario Outline: Teacher edits to a non-zero number in no. of students:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    And teacher views Q & A Student incentive with no. of students defaulted to 0
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees updated Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees updated Q & A student incentive information in rewards section on Confirmation page

  Examples:
    | UsingData |
    | Dev35:teacher_login_Item_enterstudents_0_enterstudents_14 |

  @Sprint-13.3
  @Auto-Q&A-Toss-in
  @Priority1
  @SCSCOD-5533
  Scenario Outline: No. of Students in Student incentive is defaulted to 0 :[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    When teacher navigates to coupons & Rewards page
    Then teacher views Q & A Student incentive with no. of students defaulted to 0
    And teacher proceeds checkout from the rewards and coupons page
    And Teacher does not see Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And Teacher does not see Q & A student incentive information in rewards section on Confirmation page

  Examples:
    | UsingData |
    | Dev35:teacher_login_Item_No.Of Student_Defaultedto_0 |


  @Sprint-13.3
  @Auto-Q&A-Toss-in
  @Priority3
  @SCSCOD-5533
  Scenario Outline: Teacher deletes the number in no. of students:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    And teacher views Q & A Student incentive with no. of students defaulted to 0
    And teacher enters number of students in text field
    When teacher removes data in no. of students
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees updated Q & A student incentive information in rewards section on Confirmation page

  Examples:
    | UsingData |
    | Dev35:teacher_login_Delete_NoOfStudents |

  @Sprint-13.3
  @Auto-Q&A-Toss-in
  @Priority1
  @SCSCOD-5533
  Scenario Outline: Teacher edits to a non-zero number in no. of students:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    And teacher navigates to coupons & Rewards page
    And teacher views Q & A Student incentive with no. of students defaulted to 0
    And teacher enters number of students in text field
    And teacher proceeds checkout from rewards and coupons page
    Then teacher sees updated Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And teacher sees updated Q & A student incentive information in rewards section on Confirmation page

  Examples:
    | UsingData |
    | Dev35:teacher_login_Item_enterstudents_0_enterstudents_14 |

  @Sprint-13.3
  @Auto-Q&A-Toss-in
  @Priority1
  @SCSCOD-5533
  Scenario Outline: No. of Students in Student incentive is defaulted to 0 :[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher adds “ItemInformation” from YTO page
    When teacher navigates to coupons & Rewards page
    Then teacher views Q & A Student incentive with no. of students defaulted to 0
    And teacher proceeds checkout from the rewards and coupons page
    And Teacher does not see Q & A student incentive information in rewards section on Confirm & Submit page
    And teacher submit the order
    And Teacher does not see Q & A student incentive information in rewards section on Confirmation page

  Examples:
    | UsingData |
    | Dev35:teacher_login_Item_No.Of Student_Defaultedto_0 |
