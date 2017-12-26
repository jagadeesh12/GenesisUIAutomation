$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Redington/OrderRejection.feature");
formatter.feature({
  "line": 1,
  "name": "Order Placement as PM",
  "description": "Order Rejection as FM\nOrder Rejection as PM",
  "id": "order-placement-as-pm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Place Order as PM and reject order and verify order rejection:[\u003cUsingData\u003e]",
  "description": "",
  "id": "order-placement-as-pm;place-order-as-pm-and-reject-order-and-verify-order-rejection:[\u003cusingdata\u003e]",
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
  "name": "I reject the product that has been ordered",
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
  "name": "I should see the Product that has been ordered is rejected",
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
  "id": "order-placement-as-pm;place-order-as-pm-and-reject-order-and-verify-order-rejection:[\u003cusingdata\u003e];",
  "rows": [
    {
      "cells": [
        "UsingData"
      ],
      "line": 20,
      "id": "order-placement-as-pm;place-order-as-pm-and-reject-order-and-verify-order-rejection:[\u003cusingdata\u003e];;1"
    },
    {
      "cells": [
        "OrderApproval"
      ],
      "line": 21,
      "id": "order-placement-as-pm;place-order-as-pm-and-reject-order-and-verify-order-rejection:[\u003cusingdata\u003e];;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13612028591,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Place Order as PM and reject order and verify order rejection:[OrderApproval]",
  "description": "",
  "id": "order-placement-as-pm;place-order-as-pm-and-reject-order-and-verify-order-rejection:[\u003cusingdata\u003e];;2",
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
  "name": "I reject the product that has been ordered",
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
  "name": "I should see the Product that has been ordered is rejected",
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
  "duration": 1252075939,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_add_a_product_to_the_cart()"
});
formatter.result({
  "duration": 68752812535,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9387649858,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Finance_Manager()"
});
formatter.result({
  "duration": 490088006,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_reject_the_product_that_has_been_ordered()"
});
formatter.result({
  "duration": 22111230724,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 39308356714,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_launch_the_application_as_a_Partner_Manager()"
});
formatter.result({
  "duration": 476515196,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_should_see_the_Product_that_has_been_ordered_is_rejected()"
});
formatter.result({
  "duration": 65278625409,
  "status": "passed"
});
formatter.match({
  "location": "MarketplacePageSteps.i_logout_from_the_application()"
});
formatter.result({
  "duration": 9323807009,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3372859642,
  "status": "passed"
});
});