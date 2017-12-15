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
  "comments": [
    {
      "line": 5,
      "value": "#  Given I launch the application as a Partner Manager[UserInformation]"
    },
    {
      "line": 6,
      "value": "#  When I go to Organization Page"
    },
    {
      "line": 7,
      "value": "#  Then I onboard an Organization"
    },
    {
      "line": 8,
      "value": "#  Then I logout from the application"
    },
    {
      "line": 9,
      "value": "#  Then I launch the application as a BAM"
    },
    {
      "line": 10,
      "value": "#  And I approve the organization"
    },
    {
      "line": 11,
      "value": "#  Then I logout from the application"
    }
  ],
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
  "duration": 45187020491,
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
  "comments": [
    {
      "line": 5,
      "value": "#  Given I launch the application as a Partner Manager[UserInformation]"
    },
    {
      "line": 6,
      "value": "#  When I go to Organization Page"
    },
    {
      "line": 7,
      "value": "#  Then I onboard an Organization"
    },
    {
      "line": 8,
      "value": "#  Then I logout from the application"
    },
    {
      "line": 9,
      "value": "#  Then I launch the application as a BAM"
    },
    {
      "line": 10,
      "value": "#  And I approve the organization"
    },
    {
      "line": 11,
      "value": "#  Then I logout from the application"
    }
  ],
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
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_CA()"
});
formatter.result({
  "duration": 2149502536,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization_as_CA()"
});
formatter.result({
  "duration": 24730522495,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9664683206,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 612041591,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_verify_that_the_organization_is_approved()"
});
formatter.result({
  "duration": 124129403194,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 11638499460,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 6575451702,
  "status": "passed"
});
});