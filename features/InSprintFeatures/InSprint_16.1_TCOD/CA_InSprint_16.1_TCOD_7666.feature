Feature: RewardsAndCoupons
	This feature is to validate the RCO Select Grade

 
Background: 
	Given teacher open rco-scholastic web site


##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7666    			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################



	@SCSCOD-7666


	Scenario Outline: Teacher with educator as true, can apply Unique Free Pick coupon on Redemptions & Rewards page:[<UsingData>]
		Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
		And teacher logs into the application by providing [UserInformation]
		And teacher selects “enter classroom order” from home page
		And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
		And teacher navigates to [Redemptions & Rewards] page
		When Teacher enters [UniqueFreePickCoupon] on rewards and coupons page
		Then Free pick modal displays
		And teacher checkouts order without any issues


		Examples:
			|UsingData|
			|InSprint15.3:TCOD:Teacher_Educator_UniqueFreepick_RewardsPage|


	@SCSCOD-7666

	Scenario Outline: Teacher with educator as true, can apply Free Shipping coupon on Redemptions & Rewards page :[<UsingData>]
		Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
		And teacher logs into the application by providing [UserInformation]
		And teacher selects “enter classroom order” from home page
		And teacher add Student club items to cart qualifying for [Manual Free shipping coupon]
		And teacher navigates to [Redemptions & Rewards] page
		When teacher enters [Free Shipping Coupon] and click on Apply button
		Then teacher receives FREE shipping
		And teacher checkouts order without any issues

		Examples:
			|UsingData|
			|InSprint15.3:TCOD:Teacher_Educator_FreeShiping_RewardsPage|


	@SCSCOD-7666
	Scenario Outline: Teacher with educator as true, can apply Free Item coupon on Redemptions & Rewards page :[<UsingData>]
		Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
		And teacher logs into the application by providing [UserInformation]
		And teacher selects “enter classroom order” from home page
		And teacher adds student club items to cart with [minumum amount]
		And teacher navigates to Rewards & coupons page from Review Your Cart page
		When teacher applies [Free item coupon] and click on Apply button
		Then teacher sees Free item displayed in Coupons section
		And teacher checkouts order without any issues

		Examples:
			|UsingData|
			|InSprint15.3:TCOD:Teacher_Educator_FreeItem_RewardsPage|


	@SCSCOD-7666
	Scenario Outline: Teacher without educator, can apply Unique Free Pick coupon on Redemptions & Rewards page :[<UsingData>]
		Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
		And teacher logs into the application by providing [UserInformation]
		And teacher selects “enter classroom order” from home page
		And teacher adds student club items to cart with [minumum amount]
		And teacher navigates to Rewards & coupons page from Review Your Cart page
		When teacher enters unique [Free Pick Coupon] and click on Apply button
		Then teacher sees Free Pick modal
		And teacher avails unique free pick coupon and checkout without any issues

		Examples:
			|UsingData|
			|InSprint15.3:TCOD:Teacher_NoEducator_UniqueFreepick_RewardsPage|


	@SCSCOD-7666
	Scenario Outline: Teacher without educator, can apply Free Shipping coupon on Redemptions & Rewards page :[<UsingData>]
		Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
		And teacher logs into the application by providing [UserInformation]
		And teacher selects “enter classroom order” from home page
		And teacher adds student club items to cart with [minumum amount]
		And teacher navigates to Rewards & coupons page from Review Your Cart page
		When teacher enters [Free Shipping Coupon] and click on Apply button
		Then teacher receives FREE shipping
		And teacher checkouts order without any issues

		Examples:
			|UsingData                                                    |
			|InSprint15.3:TCOD:Teacher_NoEducator_FreeShipping_RewardsPage|


	@SCSCOD-7666
	Scenario Outline: Teacher without educator, can apply Free Item coupon on Redemptions & Rewards page :[<UsingData>]
		Given teacher has valid reading clubs account and navigates to Canada Reading Clubs site
		And teacher logs into the application by providing [UserInformation]
		And teacher selects “enter classroom order” from home page
		And teacher adds student club items to cart with [minumum amount]
		And teacher navigates to Rewards & coupons page from Review Your Cart page
		When teacher applies [Free item coupon] and click on Apply button
		Then teacher sees Free item displayed in Coupons section
		And teacher checkouts order without any issues

		Examples:
			|UsingData|
			|InSprint15.3:TCOD:Teacher_NoEducator_FreeItem_RewardsPage|














