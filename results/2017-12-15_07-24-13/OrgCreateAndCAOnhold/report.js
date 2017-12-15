$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/OrgCreateAndCAOnhold.feature");
formatter.feature({
  "line": 1,
  "name": "Partner Organization creation by PM and Rejection by CA",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-ca",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Partner Organization creation by PM and Rejection by BAM:[\u003cUsingData\u003e]",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-ca;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to Organization Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I onboard an Organization",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application as a BAM",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I approve the organization",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I launch the application as a CA",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I onhold the organization as CA",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I verify that the organization is onhold",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-ca;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 20,
      "id": "partner-organization-creation-by-pm-and-rejection-by-ca;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 21,
      "id": "partner-organization-creation-by-pm-and-rejection-by-ca;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16094435375,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Partner Organization creation by PM and Rejection by BAM:[OrderApproval]",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-ca;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to Organization Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I onboard an Organization",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application as a BAM",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I approve the organization",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I launch the application as a CA",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I onhold the organization as CA",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I verify that the organization is onhold",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager_UserInformation()"
});
formatter.result({
  "duration": 1709235214,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_go_to_Organization_Page()"
});
formatter.result({
  "duration": 62314734629,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_onboard_an_Organization()"
});
formatter.result({
  "duration": 177434834185,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9346320715,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_BAM()"
});
formatter.result({
  "duration": 563264989,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization()"
});
formatter.result({
  "duration": 17780752845,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9506248553,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_CA()"
});
formatter.result({
  "duration": 427729990,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_onhold_the_organization_as_CA()"
});
formatter.result({
  "duration": 19659048835,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9321820666,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 478306145,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_verify_that_the_organization_is_onhold()"
});
formatter.result({
  "duration": 63681405800,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9330497099,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3394561771,
  "status": "passed"
});
});