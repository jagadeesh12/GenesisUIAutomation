$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/CustomerCreateAndApproval.feature");
formatter.feature({
  "line": 1,
  "name": "Customer creation flow by PM and approval by BAM",
  "description": "",
  "id": "customer-creation-flow-by-pm-and-approval-by-bam",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Customer creation by PM and Approval by BAM :[\u003cUsingData\u003e]",
  "description": "",
  "id": "customer-creation-flow-by-pm-and-approval-by-bam;customer-creation-by-pm-and-approval-by-bam-:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#When I go to Organization Page"
    },
    {
      "line": 6,
      "value": "#Then I onboard an Organization"
    },
    {
      "line": 7,
      "value": "#Then I logout from the application"
    },
    {
      "line": 8,
      "value": "#Then I launch the application as a BAM"
    },
    {
      "line": 9,
      "value": "#And I approve the organization"
    },
    {
      "line": 10,
      "value": "#Then I logout from the application"
    },
    {
      "line": 11,
      "value": "#Then I launch the application as a CA"
    },
    {
      "line": 12,
      "value": "#And I approve the organization as CA"
    },
    {
      "line": 13,
      "value": "#Then I logout from the application"
    },
    {
      "line": 14,
      "value": "#Given I launch the application as a Partner Manager"
    },
    {
      "line": 15,
      "value": "#And I verify that the organization is approved"
    },
    {
      "line": 16,
      "value": "#Then I logout from the application"
    },
    {
      "line": 17,
      "value": "#Given I launch the application as a Partner Manager"
    }
  ],
  "line": 18,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I create an Customer",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I launch the application as a BAM",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I approve the customer",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I verify that the customer is approved",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "customer-creation-flow-by-pm-and-approval-by-bam;customer-creation-by-pm-and-approval-by-bam-:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 29,
      "id": "customer-creation-flow-by-pm-and-approval-by-bam;customer-creation-by-pm-and-approval-by-bam-:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 30,
      "id": "customer-creation-flow-by-pm-and-approval-by-bam;customer-creation-by-pm-and-approval-by-bam-:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17771909501,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Customer creation by PM and Approval by BAM :[OrderApproval]",
  "description": "",
  "id": "customer-creation-flow-by-pm-and-approval-by-bam;customer-creation-by-pm-and-approval-by-bam-:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#When I go to Organization Page"
    },
    {
      "line": 6,
      "value": "#Then I onboard an Organization"
    },
    {
      "line": 7,
      "value": "#Then I logout from the application"
    },
    {
      "line": 8,
      "value": "#Then I launch the application as a BAM"
    },
    {
      "line": 9,
      "value": "#And I approve the organization"
    },
    {
      "line": 10,
      "value": "#Then I logout from the application"
    },
    {
      "line": 11,
      "value": "#Then I launch the application as a CA"
    },
    {
      "line": 12,
      "value": "#And I approve the organization as CA"
    },
    {
      "line": 13,
      "value": "#Then I logout from the application"
    },
    {
      "line": 14,
      "value": "#Given I launch the application as a Partner Manager"
    },
    {
      "line": 15,
      "value": "#And I verify that the organization is approved"
    },
    {
      "line": 16,
      "value": "#Then I logout from the application"
    },
    {
      "line": 17,
      "value": "#Given I launch the application as a Partner Manager"
    }
  ],
  "line": 18,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I create an Customer",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I launch the application as a BAM",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I approve the customer",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I verify that the customer is approved",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager_UserInformation()"
});
formatter.result({
  "duration": 2783246916,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_go_to_Customer_Page()"
});
formatter.result({
  "duration": 62941511900,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_create_an_Customer()"
});
formatter.result({
  "duration": 50340459448,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9406977348,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_BAM()"
});
formatter.result({
  "duration": 430889470,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_approve_the_customer()"
});
formatter.result({
  "duration": 10603238544,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9455384780,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 675183039,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_go_to_Customer_Page()"
});
formatter.result({
  "duration": 65738722480,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_verify_that_the_customer_is_approved()"
});
formatter.result({
  "duration": 5498102842,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9433344606,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3459152020,
  "status": "passed"
});
});