$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/OrgCreateAndApproval.feature");
formatter.feature({
  "line": 1,
  "name": "Partner Organization creation by PM and Approval by BAM and CA",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-approval-by-bam-and-ca",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Partner Organization creation by PM and Approval by BAM and CA:[\u003cUsingData\u003e]",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-approval-by-bam-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e]",
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
  "name": "I approve the organization as CA",
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
  "name": "I verify that the organization is approved",
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
  "id": "partner-organization-creation-by-pm-and-approval-by-bam-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 20,
      "id": "partner-organization-creation-by-pm-and-approval-by-bam-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 21,
      "id": "partner-organization-creation-by-pm-and-approval-by-bam-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16337378919,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Partner Organization creation by PM and Approval by BAM and CA:[OrderApproval]",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-approval-by-bam-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];;2",
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
  "name": "I approve the organization as CA",
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
  "name": "I verify that the organization is approved",
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
  "duration": 1500036532,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_go_to_Organization_Page()"
});
formatter.result({
  "duration": 4576347892,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_onboard_an_Organization()"
});
formatter.result({
  "duration": 180893528424,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9435731416,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_BAM()"
});
formatter.result({
  "duration": 554505240,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization()"
});
formatter.result({
  "duration": 17792277793,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9430150953,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_CA()"
});
formatter.result({
  "duration": 455450964,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization_as_CA()"
});
formatter.result({
  "duration": 27092538326,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9446000543,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 623327331,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_verify_that_the_organization_is_approved()"
});
formatter.result({
  "duration": 63703160908,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9602097805,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4626558936,
  "status": "passed"
});
});