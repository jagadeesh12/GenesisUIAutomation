Feature: StudentIncentive  ALL COMMENTED BY SATNAM AS HAVE MOVED THIS TO --> CA_REGRESSION_35->REWARDS_COUPON->QA_STUDENT INCENTIVE
  Student Incentive tests

  Background:
    Given teacher open rco-scholastic web site

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
