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
  "duration": 17758846686,
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
  "duration": 1662784441,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_go_to_Organization_Page()"
});
formatter.result({
  "duration": 3900715698,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_onboard_an_Organization()"
});
formatter.result({
  "duration": 177833368394,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9529567192,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_BAM()"
});
formatter.result({
  "duration": 502950576,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization()"
});
formatter.result({
  "duration": 18011014256,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9420826870,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_CA()"
});
formatter.result({
  "duration": 390778371,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization_as_CA()"
});
formatter.result({
  "duration": 16967075109,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: 2: USD\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:209)\n\tat com.dw.automation.support.SCHUtils.selectOptionByvalue(SCHUtils.java:192)\n\tat com.dw.automation.pages.impl.OrgCreateAndApproveImpl.approveOrgAsCA(OrgCreateAndApproveImpl.java:803)\n\tat com.dw.automation.steps.redington.OrgCreateAndApproveSteps.i_approve_the_organization_as_CA(OrgCreateAndApproveSteps.java:53)\n\tat ✽.And I approve the organization as CA(features/Redington/OrgCreateAndApproval.feature:13)\n",
  "status": "failed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_verify_that_the_organization_is_approved()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://dev.redington.market/partnerentity");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2649978979,
  "status": "passed"
});
});