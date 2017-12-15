$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/CustomerCreateAndReject.feature");
formatter.feature({
  "line": 1,
  "name": "Customer creation by PM and Rejection by BAM",
  "description": "",
  "id": "customer-creation-by-pm-and-rejection-by-bam",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Customer creation by PM and Rejection by BAM :[\u003cUsingData\u003e]",
  "description": "",
  "id": "customer-creation-by-pm-and-rejection-by-bam;customer-creation-by-pm-and-rejection-by-bam-:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When I go to Organization Page"
    },
    {
      "line": 7,
      "value": "#Then I onboard an Organization"
    },
    {
      "line": 8,
      "value": "#Then I logout from the application"
    },
    {
      "line": 9,
      "value": "#Then I launch the application as a BAM"
    },
    {
      "line": 10,
      "value": "#And I approve the organization"
    },
    {
      "line": 11,
      "value": "#Then I logout from the application"
    },
    {
      "line": 12,
      "value": "#Then I launch the application as a CA"
    },
    {
      "line": 13,
      "value": "#And I approve the organization as CA"
    },
    {
      "line": 14,
      "value": "#Then I logout from the application"
    },
    {
      "line": 15,
      "value": "#Given I launch the application as a Partner Manager"
    },
    {
      "line": 16,
      "value": "#And I verify that the organization is approved"
    },
    {
      "line": 17,
      "value": "#Then I logout from the application"
    },
    {
      "line": 18,
      "value": "#Given I launch the application as a Partner Manager"
    }
  ],
  "line": 19,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I create an Customer",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I launch the application as a BAM",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I reject the customer",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I verify that the customer is rejected",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "customer-creation-by-pm-and-rejection-by-bam;customer-creation-by-pm-and-rejection-by-bam-:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 30,
      "id": "customer-creation-by-pm-and-rejection-by-bam;customer-creation-by-pm-and-rejection-by-bam-:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 31,
      "id": "customer-creation-by-pm-and-rejection-by-bam;customer-creation-by-pm-and-rejection-by-bam-:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15835190038,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Customer creation by PM and Rejection by BAM :[OrderApproval]",
  "description": "",
  "id": "customer-creation-by-pm-and-rejection-by-bam;customer-creation-by-pm-and-rejection-by-bam-:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When I go to Organization Page"
    },
    {
      "line": 7,
      "value": "#Then I onboard an Organization"
    },
    {
      "line": 8,
      "value": "#Then I logout from the application"
    },
    {
      "line": 9,
      "value": "#Then I launch the application as a BAM"
    },
    {
      "line": 10,
      "value": "#And I approve the organization"
    },
    {
      "line": 11,
      "value": "#Then I logout from the application"
    },
    {
      "line": 12,
      "value": "#Then I launch the application as a CA"
    },
    {
      "line": 13,
      "value": "#And I approve the organization as CA"
    },
    {
      "line": 14,
      "value": "#Then I logout from the application"
    },
    {
      "line": 15,
      "value": "#Given I launch the application as a Partner Manager"
    },
    {
      "line": 16,
      "value": "#And I verify that the organization is approved"
    },
    {
      "line": 17,
      "value": "#Then I logout from the application"
    },
    {
      "line": 18,
      "value": "#Given I launch the application as a Partner Manager"
    }
  ],
  "line": 19,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I create an Customer",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I launch the application as a BAM",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I reject the customer",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I go to Customer Page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I verify that the customer is rejected",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager_UserInformation()"
});
formatter.result({
  "duration": 1731082764,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_go_to_Customer_Page()"
});
formatter.result({
  "duration": 63522777228,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_create_an_Customer()"
});
formatter.result({
  "duration": 37740818048,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9430001549,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_BAM()"
});
formatter.result({
  "duration": 377507906,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_reject_the_customer()"
});
formatter.result({
  "duration": 29777986642,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for DefaultElementLocator \u0027By.xpath: //span[@title\u003d\u0027Reject\u0027]\u0027 to be present (tried for 20 second(s) with 1 SECONDS interval)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:264)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat com.scholastic.torque.common.WaitUtils.waitForPresent(WaitUtils.java:33)\n\tat com.scholastic.torque.webdriver.ExtendedElementHandler.invoke(ExtendedElementHandler.java:46)\n\tat com.sun.proxy.$Proxy19.getAttribute(Unknown Source)\n\tat com.dw.automation.pages.impl.CustomerCreateAndApproveImpl.bamApproveCustomer(CustomerCreateAndApproveImpl.java:452)\n\tat com.dw.automation.steps.redington.CustomerCreateAndApprove.i_reject_the_customer(CustomerCreateAndApprove.java:44)\n\tat ✽.And I reject the customer(features/Redington/CustomerCreateAndReject.feature:23)\n",
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
  "location": "CustomerCreateAndApprove.i_go_to_Customer_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_verify_that_the_customer_is_rejected()"
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
formatter.write("Current Page URL is https://dev.redington.market/endcustomer");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2587929947,
  "status": "passed"
});
});