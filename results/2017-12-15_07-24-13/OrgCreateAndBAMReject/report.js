$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/OrgCreateAndBAMRejection.feature");
formatter.feature({
  "line": 1,
  "name": "Partner Organization creation by PM and Rejection by BAM",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-bam",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Partner Organization creation by PM and Rejection by BAM:[\u003cUsingData\u003e]",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-bam;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e]",
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
  "name": "I reject the organization",
  "keyword": "And "
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
  "name": "I verify that the organization is rejected",
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
  "id": "partner-organization-creation-by-pm-and-rejection-by-bam;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 17,
      "id": "partner-organization-creation-by-pm-and-rejection-by-bam;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 18,
      "id": "partner-organization-creation-by-pm-and-rejection-by-bam;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16585447460,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Partner Organization creation by PM and Rejection by BAM:[OrderApproval]",
  "description": "",
  "id": "partner-organization-creation-by-pm-and-rejection-by-bam;partner-organization-creation-by-pm-and-rejection-by-bam:[\u003cusingdata\u003e];;2",
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
  "name": "I reject the organization",
  "keyword": "And "
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
  "name": "I verify that the organization is rejected",
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
  "duration": 1592136939,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_go_to_Organization_Page()"
});
formatter.result({
  "duration": 61878344176,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_onboard_an_Organization()"
});
formatter.result({
  "duration": 200359363961,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@class\u003d\u0027fa fa-refresh fa-spin fa-3x fa-fw\u0027]\"}\nCommand duration or timeout: 11 milliseconds\n\tat sun.reflect.GeneratedConstructorAccessor29.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\n\tat com.dw.automation.support.RUtils.waitforloadingtodissappear(RUtils.java:107)\n\tat com.dw.automation.pages.impl.OrgCreateAndApproveImpl.fillOrgForm(OrgCreateAndApproveImpl.java:631)\n\tat com.dw.automation.steps.redington.OrgCreateAndApproveSteps.i_onboard_an_Organization(OrgCreateAndApproveSteps.java:23)\n\tat ✽.Then I onboard an Organization(features/Redington/OrgCreateAndBAMRejection.feature:7)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@class\u003d\u0027fa fa-refresh fa-spin fa-3x fa-fw\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///tmp/anonymous4312093601040443174webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:11390)\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///tmp/anonymous4312093601040443174webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:11399)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/k(file:///tmp/anonymous4312093601040443174webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12879)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///tmp/anonymous4312093601040443174webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12884)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///tmp/anonymous4312093601040443174webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12826)\n",
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
  "location": "OrgCreateAndApproveSteps.i_reject_the_organization()"
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
  "location": "OrgCreateAndApproveSteps.i_verify_that_the_organization_is_rejected()"
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
formatter.write("Current Page URL is https://dev.redington.market/partnerentity/entitynew");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 7115977561,
  "status": "passed"
});
});