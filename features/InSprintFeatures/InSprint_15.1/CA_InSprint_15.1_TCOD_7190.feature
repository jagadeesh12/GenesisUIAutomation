Feature: InSprint_14.5 TCOD

  This feature is used to validate all scenarios


  Background:
    Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7190        #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR receives Free New Teacher Kit on only teacher club items:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Teacher catalogue items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR should see Free Teacher Kit promotion is displayed
Examples:
|UsingData                                                                 |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit_TeacherClubItems|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR still receive Free New Teacher Kit if order total is zero with redemptions:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club items to the cart
And CSR navigates to Review Cart page from Order Entry page
And CSR navigates to [Rewards & Coupons] page from [Review Cart] page
When CSR makes order total as zero by applying redemptions
Then CSR should see Free Teacher Kit promotion is displayed

Examples:
|UsingData                                                            |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit_Redemptions|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR receives Free New Teacher Kit on Student club items:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR should see Free Teacher Kit promotion is displayed

Examples:
|UsingData                                                |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: Existing CSR does not receives Free New Teacher Kit:[<UsingData>]

Given CSR is not new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds student club items to the cart
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
But CSR should not receive Free Teacher Kit promotion

Examples:
|UsingData                                                         |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_Existing_NewTeacherKit|



@SCSCOD-7190
@Priority1
@Sprint-15.1
@LoginPage
@Release-BTS2017
Scenario Outline: New CSR receives Free New Teacher Kit along with Free item promotion on a cart with qualifying minimum amount on Student Club orders:[<UsingData>]

Given CSR is new to RCO clubs
And CSR logs into the application by providing [UserInformation]
And CSR selects the order type as [Phone Order]
And CSR navigates to Verify Account Page
And CSR navigates to Order Entry Page
And CSR adds Student Clubs items to the cart to meet the minimum amount
And CSR navigates to Review Cart page from Order Entry page
When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
Then CSR should see Free Teacher Kit promotion is displayed
And FreeItem promotion should be displayed

Examples:
|UsingData                                                              |
|InSprint15.1:CSR:CSR_with_soo_and_Automatic_NewTeacherKit_FreeItemPromo|


















