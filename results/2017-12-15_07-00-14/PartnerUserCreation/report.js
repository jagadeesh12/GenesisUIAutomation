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
  "duration": 21760739684,
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
  "duration": 1719668836,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_fill_partner_user_form()"
});
formatter.result({
  "duration": 10731329123,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.temporary_password_is_generated()"
});
formatter.result({
  "duration": 20622,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_mail_application()"
});
formatter.result({
  "duration": 5244784711,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_get_the_verification_code()"
});
formatter.result({
  "duration": 23693619291,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1559441489,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_temporary_password()"
});
formatter.result({
  "duration": 540901998,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_reset_the_password()"
});
formatter.result({
  "duration": 9648970496,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 2072217838,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_reset_password()"
});
formatter.result({
  "duration": 558402721,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_view_the_partner_user_detail()"
});
formatter.result({
  "duration": 13359117391,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9532198806,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4242438410,
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
  "duration": 28388000755,
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
  "duration": 1688523269,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_fill_form_to_create_finance_manager()"
});
formatter.result({
  "duration": 12354354401,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.temporary_password_is_generated()"
});
formatter.result({
  "duration": 18164,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_mail_application()"
});
formatter.result({
  "duration": 7540976159,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_get_the_verification_code()"
});
formatter.result({
  "duration": 11041494702,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1492107147,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_temporary_password()"
});
formatter.result({
  "duration": 485907751,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_reset_the_password()"
});
formatter.result({
  "duration": 9733471321,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_launch_the_application()"
});
formatter.result({
  "duration": 1937143985,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_login_with_new_username_and_reset_password()"
});
formatter.result({
  "duration": 525330847,
  "status": "passed"
});
formatter.match({
  "location": "PartnerUserSteps.i_verify_login_page_is_displayed()"
});
formatter.result({
  "duration": 12871288,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 39565089184,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 3208389767,
  "status": "passed"
});
});