Feature: CSR PRODUCTION BVT SCENARIOS
This run is for CSR production bvt scenarios


  Background:
    Given CSR opens the rco-scholastic web site


@CSR_BVT
@1


Scenario Outline:CSR clicks on Mail Order:[<UsingData>]

Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Mail Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR navigates to [Confirm & Submit] page from [Payment] page
When CSR submits the order
Then CSR can succesfully submit the order

Examples:
| UsingData               	|
| prod_mailOrder	|



@CSR_BVT
@2


Scenario Outline:CSR clicks on Fax order:[<UsingData>]

Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Fax Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR navigates to [Confirm & Submit] page from [Payment] page
When CSR submits the order
Then CSR can succesfully submit the order

Examples:
| UsingData               |
| prod_faxorder	|



@CSR_BVT
@3

Scenario Outline:Order with redemptions:[<UsingData>]

Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club and teacher catalogue items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR enters amount in student Bonus Bank
And CSR enters amount in student Paper coupons
And CSR clicks on Apply in Students section
And CSR enters amount in teacher Bonus Bank
And CSR enters amount in teacher Paper coupons
And CSR clicks on Apply in teacher section
And CSR navigates to [Payment] page from [Redeem & Rewards] page
Then StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly
And TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly
And Student and Teacher clubs Total owing amount displays correctly
And CSR navigates to [Confirm & Submit] page from [Payment] page
When CSR submits the order
Then CSR can succesfully submit the order


Examples:
| UsingData                                       		 |
| prod_csr_redemption  |

@CSR_BVT
@4


Scenario Outline:Order with YTO items only:[<UsingData>]

Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Fax Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR navigates to [Confirm & Submit] page from [Payment] page
When CSR submits the order
Then CSR can succesfully submit the order

Examples:
| UsingData                                       		 |
|  prod_YTOOrder|

@CSR_BVT
@5

Scenario Outline:Order with YTO and Teacher exclusive items:[<UsingData>]
Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club and teacher catalogue items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR navigates to [Confirm & Submit] page from [Payment] page
When CSR submits the order
Then CSR can succesfully submit the order

Examples:
| UsingData                                       		 |
| prod_YTO_teacherOrder |


@CSR_BVT
@6

Scenario Outline:Order with teacher exclusive items only:[<UsingData>]

Given CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher Catalogues items to the cart with minimum amount
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
And CSR navigates to [Payment] page from [Redeem & Rewards] page
And CSR navigates to [Confirm & Submit] page from [Payment] page
When CSR submits the order
Then CSR can succesfully submit the order

Examples:
| UsingData                                       		 |
| prod_teacherExorder |
