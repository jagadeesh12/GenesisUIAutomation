$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/UserCreation.feature");
formatter.feature({
  "line": 1,
  "name": "Partner user creation.",
  "description": "",
  "id": "partner-user-creation.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Creating a new Partner Manager User:[\u003cUsingData\u003e]",
  "description": "",
  "id": "partner-user-creation.;creating-a-new-partner-manager-user:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I launch the application as a site admin[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I fill partner user form",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Temporary password is generated",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I launch the mail application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I get the verification code",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login with new username and temporary password",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I reset the password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I login with new username and reset password",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I view the partner user detail",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "partner-user-creation.;creating-a-new-partner-manager-user:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 19,
      "id": "partner-user-creation.;creating-a-new-partner-manager-user:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "RedingtonLogin"
      ],
      "line": 20,
      "id": "partner-user-creation.;creating-a-new-partner-manager-user:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31949712761,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Creating a new Partner Manager User:[RedingtonLogin]",
  "description": "",
  "id": "partner-user-creation.;creating-a-new-partner-manager-user:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I launch the application as a site admin[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I fill partner user form",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Temporary password is generated",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I launch the mail application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I get the verification code",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login with new username and temporary password",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I reset the password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I login with new username and reset password",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I view the partner user detail",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application_as_a_site_adminuserinformation()"
});
formatter.result({
  "duration": 2190979115,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_fill_partner_user_form()"
});
formatter.result({
  "duration": 11847859119,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.temporary_password_is_generated()"
});
formatter.result({
  "duration": 24133,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_mail_application()"
});
formatter.result({
  "duration": 4035243559,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_get_the_verification_code()"
});
formatter.result({
  "duration": 8995127457,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1650682815,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_temporary_password()"
});
formatter.result({
  "duration": 541191355,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_reset_the_password()"
});
formatter.result({
  "duration": 9471479064,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1405956686,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_reset_password()"
});
formatter.result({
  "duration": 664523762,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_view_the_partner_user_detail()"
});
formatter.result({
  "duration": 12913646980,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9561582276,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 5721194510,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Creating a new Finance Manager User:[\u003cUsingData\u003e]",
  "description": "",
  "id": "partner-user-creation.;creating-a-new-finance-manager-user:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I launch the application as a site admin[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I fill form to create Finance Manager",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Temporary password is generated",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I launch the mail application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I get the verification code",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I login with new username and temporary password",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I reset the password",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I login with new username and reset password",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I verify login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "partner-user-creation.;creating-a-new-finance-manager-user:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 38,
      "id": "partner-user-creation.;creating-a-new-finance-manager-user:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "RedingtonLogin"
      ],
      "line": 39,
      "id": "partner-user-creation.;creating-a-new-finance-manager-user:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 37271427504,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Creating a new Finance Manager User:[RedingtonLogin]",
  "description": "",
  "id": "partner-user-creation.;creating-a-new-finance-manager-user:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I launch the application as a site admin[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I fill form to create Finance Manager",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Temporary password is generated",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I launch the mail application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I get the verification code",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I login with new username and temporary password",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I reset the password",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I login with new username and reset password",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I verify login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application_as_a_site_adminuserinformation()"
});
formatter.result({
  "duration": 1651001043,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_fill_form_to_create_finance_manager()"
});
formatter.result({
  "duration": 12532495246,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.temporary_password_is_generated()"
});
formatter.result({
  "duration": 13591,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_mail_application()"
});
formatter.result({
  "duration": 4161163891,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_get_the_verification_code()"
});
formatter.result({
  "duration": 10667180449,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1441487521,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_temporary_password()"
});
formatter.result({
  "duration": 756910333,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_reset_the_password()"
});
formatter.result({
  "duration": 9495935603,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1601962305,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_reset_password()"
});
formatter.result({
  "duration": 498688631,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_verify_login_page_is_displayed()"
});
formatter.result({
  "duration": 3478268,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 39543923795,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 3259678312,
  "status": "passed"
});
});