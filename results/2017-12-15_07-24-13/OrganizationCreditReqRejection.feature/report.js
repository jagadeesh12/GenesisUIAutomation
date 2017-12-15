$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/OrgCreditRequestReject.feature");
formatter.feature({
  "line": 1,
  "name": "Partner Organization credit request by PM and Rejection and CA",
  "description": "",
  "id": "partner-organization-credit-request-by-pm-and-rejection-and-ca",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Partner Organization creation by PM and Approval by BAM and CA:[\u003cUsingData\u003e]",
  "description": "",
  "id": "partner-organization-credit-request-by-pm-and-rejection-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e]",
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
  "name": "I go to Partner Organization Credit Request Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I apply for partner organization credit request",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application as a CA",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I reject the credit request",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I verify that the organization credit request is rejected",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "partner-organization-credit-request-by-pm-and-rejection-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 17,
      "id": "partner-organization-credit-request-by-pm-and-rejection-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 18,
      "id": "partner-organization-credit-request-by-pm-and-rejection-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15713158806,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Partner Organization creation by PM and Approval by BAM and CA:[OrderApproval]",
  "description": "",
  "id": "partner-organization-credit-request-by-pm-and-rejection-and-ca;partner-organization-creation-by-pm-and-approval-by-bam-and-ca:[\u003cusingdata\u003e];;2",
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
  "name": "I go to Partner Organization Credit Request Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I apply for partner organization credit request",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application as a CA",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I reject the credit request",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I verify that the organization credit request is rejected",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager_UserInformation()"
});
formatter.result({
  "duration": 1526003862,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreditReqSteps.i_go_to_Partner_Organization_Credit_Request_Page()"
});
formatter.result({
  "duration": 580092,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreditReqSteps.i_apply_for_partner_organization_credit_request()"
});
formatter.result({
  "duration": 74770992630,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9324831181,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_CA()"
});
formatter.result({
  "duration": 402838094,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreditReqSteps.i_reject_the_credit_request()"
});
formatter.result({
  "duration": 75939397641,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9309375824,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 484122630,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreditReqSteps.i_verify_that_the_organization_credit_request_is_rejected()"
});
formatter.result({
  "duration": 67921789467,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9495443295,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3460966058,
  "status": "passed"
});
});