$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/MultipleOrderPlacementAndApproal.feature");
formatter.feature({
  "line": 1,
  "name": "Placing multiple orders",
  "description": "",
  "id": "placing-multiple-orders",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Place Order as PM and approve order and verify approval:[\u003cUsingData\u003e]",
  "description": "",
  "id": "placing-multiple-orders;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e]",
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
  "name": "I add base products to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I add addon products to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application as a Finance Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I approve the product that has been ordered",
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
  "name": "I should see the Product that has been ordered is approved",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "placing-multiple-orders;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 18,
      "id": "placing-multiple-orders;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 19,
      "id": "placing-multiple-orders;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14580232364,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Place Order as PM and approve order and verify approval:[OrderApproval]",
  "description": "",
  "id": "placing-multiple-orders;place-order-as-pm-and-approve-order-and-verify-approval:[\u003cusingdata\u003e];;2",
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
  "name": "I add base products to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I add addon products to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I launch the application as a Finance Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I approve the product that has been ordered",
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
  "name": "I should see the Product that has been ordered is approved",
  "keyword": "Then "
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
  "duration": 1401926039,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_add_base_products_to_the_cart()"
});
formatter.result({
  "duration": 22981699973,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_add_addon_products_to_the_cart()"
});
formatter.result({
  "duration": 31641764152,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9483799659,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Finance_Manager()"
});
formatter.result({
  "duration": 476671389,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_approve_the_product_that_has_been_ordered()"
});
formatter.result({
  "duration": 22086699332,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 39702776233,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 698939286,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_should_see_the_Product_that_has_been_ordered_is_approved()"
});
formatter.result({
  "duration": 65700424888,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9356104246,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4329411771,
  "status": "passed"
});
});