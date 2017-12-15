$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/CustCreditReqApproval.feature");
formatter.feature({
  "line": 1,
  "name": "Customer spend limit request and approval by BAM",
  "description": "",
  "id": "customer-spend-limit-request-and-approval-by-bam",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Customer spend limit request and approval by BAM:[\u003cUsingData\u003e]",
  "description": "",
  "id": "customer-spend-limit-request-and-approval-by-bam;customer-spend-limit-request-and-approval-by-bam:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I update the customer spend limit",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I launch the application as a Finance Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I approve the customer spend limit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I verify that the customer spend limit is updated",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "customer-spend-limit-request-and-approval-by-bam;customer-spend-limit-request-and-approval-by-bam:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 14,
      "id": "customer-spend-limit-request-and-approval-by-bam;customer-spend-limit-request-and-approval-by-bam:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 15,
      "id": "customer-spend-limit-request-and-approval-by-bam;customer-spend-limit-request-and-approval-by-bam:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18501523596,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Customer spend limit request and approval by BAM:[OrderApproval]",
  "description": "",
  "id": "customer-spend-limit-request-and-approval-by-bam;customer-spend-limit-request-and-approval-by-bam:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I update the customer spend limit",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I launch the application as a Finance Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I approve the customer spend limit",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I verify that the customer spend limit is updated",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager_UserInformation()"
});
formatter.result({
  "duration": 1561541969,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_update_the_customer_spend_limit()"
});
formatter.result({
  "duration": 18318379849,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9562373109,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Finance_Manager()"
});
formatter.result({
  "duration": 510551142,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_approve_the_customer_spend_limit()"
});
formatter.result({
  "duration": 14534829183,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9312205665,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 940949862,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_verify_that_the_customer_spend_limit_is_updated()"
});
formatter.result({
  "duration": 10147917722,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9448446621,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3099659321,
  "status": "passed"
});
});