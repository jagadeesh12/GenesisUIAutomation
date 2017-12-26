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
  "duration": 17956325583,
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
  "duration": 1170430997,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_update_the_customer_spend_limit()"
});
formatter.result({
  "duration": 36981302012,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for DefaultElementLocator \u0027By.xpath: //div[contains(text(),\u0027Credit limit change request created.\u0027)]\u0027 to be present (tried for 20 second(s) with 1 SECONDS interval)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:264)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat com.scholastic.torque.common.WaitUtils.waitForPresent(WaitUtils.java:33)\n\tat com.scholastic.torque.webdriver.ExtendedElementHandler.invoke(ExtendedElementHandler.java:46)\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\n\tat com.dw.automation.pages.impl.CustomerCreateAndApproveImpl.updateCustSpendLimit(CustomerCreateAndApproveImpl.java:506)\n\tat com.dw.automation.steps.redington.CustomerCreateAndApprove.i_update_the_customer_spend_limit(CustomerCreateAndApprove.java:56)\n\tat ✽.Then I update the customer spend limit(features/Redington/CustCreditReqApproval.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Finance_Manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_approve_the_customer_spend_limit()"
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
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_verify_that_the_customer_spend_limit_is_updated()"
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
formatter.write("Current Page URL is https://test.redington.market/endcustomerspendlimit");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2440096567,
  "status": "passed"
});
});