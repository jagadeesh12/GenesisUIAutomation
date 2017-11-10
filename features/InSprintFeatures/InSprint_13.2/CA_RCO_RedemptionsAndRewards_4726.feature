Feature: Redemptions & Rewards
  This feature is to validate the Redemptions & Rewards Upsell message for Shipping

  Background:
    Given teacher open rco-scholastic web site

  @Sprint13.2
  @RewardsAndCoupons
  @Shipping
  @Priority2
  @SCSCOD-4726
  Scenario Outline: Shipping upsell message displays when there is a shipping fee on the order:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher add items to cart less than the [shipping threshold]
    When teacher navigates to coupons & Rewards page
    Then shipping upsell message is shown in the blue header of Shipping & Handling section

  Examples:
    |UsingData                                |
    |Dev35:ShippingUpsellMessage_PaidShipping       |

  @Sprint13.2
  @RewardsAndCoupons
  @Shipping
  @Priority2
  @SCSCOD-4726
  Scenario Outline: Shipping upsell message does not display when cart is eligible for free shipping:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds items to cart such that the cart is eligible for free shipping
    When teacher navigates to coupons & Rewards page
    Then shipping upsell message is NOT shown in the blue header of Shipping & Handling section

  Examples:
    |UsingData                             |
    |Dev35:ShippingUpsellMessage_FreeShipping    |

  @Sprint13.2
  @RewardsAndCoupons
  @Priority2
  @Shipping
  @SCSCOD-4726
  Scenario Outline: Shipping upsell message does not display when teacher adds more items and cart becomes eligible for free shipping:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher add items to cart less than the [shipping threshold]
    And teacher navigates to coupons & Rewards page
    And shipping upsell message is shown in the blue header of Shipping & Handling section
    When teacher adds more items to cart such that the cart is eligible for free shipping
    And teacher navigates to coupons & Rewards page
    Then shipping upsell message is NOT shown in the blue header of Shipping & Handling section

  Examples:
    |UsingData                            |
    |Dev35:ShippingUpsellMessage_Shipping_moreItemsAdded      |

  @Sprint13.2
  @RewardsAndCoupons
  @Priority2
  @Shipping
  @SCSCOD-4726
  Scenario Outline: Shipping upsell message displays when teacher deletes items from cart making cart eligible for paid shipping:[<UsingData>]
    Given teacher logs into the application by providing [UserInformation]
    And teacher selects [enter classroom order] from home page
    And teacher adds items to cart such that the cart is eligible for free shipping
    And teacher navigates to coupons & Rewards page
    And shipping upsell message is NOT shown in the blue header of Shipping & Handling section
    And teacher clicks Back to Shop to navigate to YTO page
    When teacher deletes items from cart resulting in the cart total fall below [shipping threshold]
    And teacher navigates to coupons & Rewards page
    Then shipping upsell message is shown in the blue header of Shipping & Handling section
  Examples:
    |UsingData                            |
    |Dev35:ShippingUpsellMessage_Shipping_deleteItems       |

    