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
  "duration": 28223160968,
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
  "duration": 2693255375,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_go_to_Organization_Page()"
});
formatter.result({
  "duration": 122702366434,
  "status": "passed"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_onboard_an_Organization()"
});
formatter.result({
  "duration": 39108979863,
  "error_message": "org.openqa.selenium.WebDriverException: The driver server has unexpectedly died!\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:88)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat com.scholastic.torque.webdriver.ExtendedElementHandler.invoke(ExtendedElementHandler.java:36)\n\tat com.sun.proxy.$Proxy19.getWrappedElement(Unknown Source)\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\n\tat com.google.common.collect.Iterators$7.transform(Iterators.java:750)\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:47)\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:367)\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:571)\n\tat com.dw.automation.support.SCHUtils.clickUsingJavaScript(SCHUtils.java:170)\n\tat com.scholastic.cucumber.uploadResults.WrapperFunctions.click_element(WrapperFunctions.java:93)\n\tat com.dw.automation.pages.impl.OrgCreateAndApproveImpl.fillOrgForm(OrgCreateAndApproveImpl.java:562)\n\tat com.dw.automation.steps.redington.OrgCreateAndApproveSteps.i_onboard_an_Organization(OrgCreateAndApproveSteps.java:23)\n\tat ✽.Then I onboard an Organization(features/Redington/OrgCreateAndApproval.feature:7)\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to localhost:19538 [localhost/127.0.0.1] failed: Connection refused\n\tat org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:72)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:139)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:87)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat com.scholastic.torque.webdriver.ExtendedElementHandler.invoke(ExtendedElementHandler.java:36)\n\tat com.sun.proxy.$Proxy19.getWrappedElement(Unknown Source)\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\n\tat com.google.common.collect.Iterators$7.transform(Iterators.java:750)\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:47)\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:367)\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:571)\n\tat com.dw.automation.support.SCHUtils.clickUsingJavaScript(SCHUtils.java:170)\n\tat com.scholastic.cucumber.uploadResults.WrapperFunctions.click_element(WrapperFunctions.java:93)\n\tat com.dw.automation.pages.impl.OrgCreateAndApproveImpl.fillOrgForm(OrgCreateAndApproveImpl.java:562)\n\tat com.dw.automation.steps.redington.OrgCreateAndApproveSteps.i_onboard_an_Organization(OrgCreateAndApproveSteps.java:23)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat com.scholastic.torque.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:124)\n\tat com.scholastic.torque.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:30)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:85)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:639)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:816)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1124)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:108)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:774)\n\tat org.testng.TestRunner.run(TestRunner.java:624)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:359)\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:39)\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:393)\n\tat org.testng.internal.thread.ThreadUtil$2.call(ThreadUtil.java:64)\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\n\tat java.lang.Thread.run(Thread.java:745)\nCaused by: java.net.ConnectException: Connection refused\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:589)\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)\n\tat org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)\n\t... 69 more\n",
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
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization()"
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
  "location": "OrgCreateAndApproveSteps.i_launch_the_application_as_a_CA()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrgCreateAndApproveSteps.i_approve_the_organization_as_CA()"
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
formatter.after({
  "duration": 120057626,
  "error_message": "java.lang.RuntimeException: org.openqa.selenium.WebDriverException: The driver server has unexpectedly died!\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat ru.yandex.qatools.ashot.util.InnerScript.execute(InnerScript.java:29)\n\tat ru.yandex.qatools.ashot.shooting.ViewportPastingDecorator.getFullHeight(ViewportPastingDecorator.java:67)\n\tat ru.yandex.qatools.ashot.shooting.ViewportPastingDecorator.getScreenshot(ViewportPastingDecorator.java:41)\n\tat ru.yandex.qatools.ashot.shooting.ViewportPastingDecorator.getScreenshot(ViewportPastingDecorator.java:35)\n\tat ru.yandex.qatools.ashot.AShot.takeScreenshot(AShot.java:143)\n\tat com.scholastic.torque.cucumber.ScenarioHook.takeFullPageScreenshot(ScenarioHook.java:108)\n\tat com.scholastic.torque.cucumber.ScenarioHook.takeScreenshot(ScenarioHook.java:73)\n\tat com.dw.automation.steps.Hooks.afterHook(Hooks.java:184)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat com.scholastic.torque.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:124)\n\tat com.scholastic.torque.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:30)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:85)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:639)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:816)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1124)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:108)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:774)\n\tat org.testng.TestRunner.run(TestRunner.java:624)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:359)\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:39)\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:393)\n\tat org.testng.internal.thread.ThreadUtil$2.call(ThreadUtil.java:64)\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\n\tat java.lang.Thread.run(Thread.java:745)\nCaused by: org.openqa.selenium.WebDriverException: The driver server has unexpectedly died!\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027jagadeesh-ThinkPad-L450\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-65-generic\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:88)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:573)\n\tat ru.yandex.qatools.ashot.util.InnerScript.execute(InnerScript.java:27)\n\t... 43 more\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to localhost:19538 [localhost/127.0.0.1] failed: Connection refused\n\tat org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:142)\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:319)\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:363)\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:219)\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:195)\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:86)\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:108)\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:72)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:57)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:139)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:87)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\t... 46 more\nCaused by: java.net.ConnectException: Connection refused\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:589)\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:72)\n\tat org.apache.http.impl.conn.HttpClientConnectionOperator.connect(HttpClientConnectionOperator.java:125)\n\t... 59 more\n",
  "status": "failed"
});
});