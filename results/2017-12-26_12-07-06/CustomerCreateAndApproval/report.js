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
  "duration": 32869065587,
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
  "duration": 1319612382,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_go_to_Customer_Page()"
});
formatter.result({
  "duration": 64671018824,
  "status": "passed"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_create_an_Customer()"
});
formatter.result({
  "duration": 67337660183,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for DefaultElementLocator \u0027By.xpath: //a[contains(text(),\u0027Verify\u0027)]/i\u0027 to be present (tried for 20 second(s) with 1 SECONDS interval)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:264)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat com.scholastic.torque.common.WaitUtils.waitForPresent(WaitUtils.java:33)\n\tat com.scholastic.torque.webdriver.ExtendedElementHandler.invoke(ExtendedElementHandler.java:46)\n\tat com.sun.proxy.$Proxy19.getWrappedElement(Unknown Source)\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\n\tat com.google.common.collect.Iterators$7.transform(Iterators.java:750)\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:47)\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:367)\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:571)\n\tat com.dw.automation.support.SCHUtils.clickUsingJavaScript(SCHUtils.java:170)\n\tat com.scholastic.cucumber.uploadResults.WrapperFunctions.click_element(WrapperFunctions.java:93)\n\tat com.dw.automation.pages.impl.CustomerCreateAndApproveImpl.createCustomer(CustomerCreateAndApproveImpl.java:379)\n\tat com.dw.automation.steps.redington.CustomerCreateAndApprove.i_create_an_Customer(CustomerCreateAndApprove.java:24)\n\tat ✽.Then I create an Customer(features/Redington/CustomerCreateAndApproval.feature:19)\n",
  "status": "failed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_BAM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_approve_the_customer()"
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
  "location": "CustomerCreateAndApprove.i_go_to_Customer_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CustomerCreateAndApprove.i_verify_that_the_customer_is_approved()"
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
formatter.write("Current Page URL is https://test.redington.market/endcustomer/new");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 8738231670,
  "status": "passed"
});
});