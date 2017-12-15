$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/OrderApproval.feature");
formatter.feature({
  "line": 1,
  "name": "Order Placement as PM",
  "description": "Order Approval as FM\nOrder Approval as PM",
  "id": "order-placement-as-pm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Place Order as PM and approve order and verify approval:[\u003cUsingData\u003e]",
  "description": "",
  "id": "order-placement-as-pm;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e]",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I add a product to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I launch the application as a Finance Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I approve the product that has been ordered",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I should see the Product that has been ordered is approved",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "order-placement-as-pm;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 20,
      "id": "order-placement-as-pm;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 21,
      "id": "order-placement-as-pm;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18660123708,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Place Order as PM and approve order and verify approval:[OrderApproval]",
  "description": "",
  "id": "order-placement-as-pm;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I launch the application as a Partner Manager[UserInformation]",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I add a product to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I launch the application as a Finance Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I approve the product that has been ordered",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I launch the application as a Partner Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I should see the Product that has been ordered is approved",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager_UserInformation()"
});
formatter.result({
  "duration": 1734291009,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_add_a_product_to_the_cart()"
});
formatter.result({
  "duration": 69792234476,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9390909134,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Finance_Manager()"
});
formatter.result({
  "duration": 494646709,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_approve_the_product_that_has_been_ordered()"
});
formatter.result({
  "duration": 23074832360,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 39406801680,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 534578570,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_should_see_the_Product_that_has_been_ordered_is_approved()"
});
formatter.result({
  "duration": 66369944672,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9355147104,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3620128168,
  "status": "passed"
});
});