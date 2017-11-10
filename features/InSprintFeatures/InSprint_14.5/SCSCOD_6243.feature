Feature: Redemptions & Rewards - Teachers – Automatic Rewards – Spell Scholastic
	This feature is to validate Teachers – Automatic Rewards – Spell Scholastic scenarios

 
Background: 
	Given teacher open rco-scholastic web site 

	
@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@1
Scenario Outline:Teacher does not receive bonus dollars for the milestone order if order does not qualify for minimum amount:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	When teacher adds student club items to cart with pre-tax amount NOT meeting the [minimum amount]
	And Teacher navigates to rewards & coupons page
	Then teacher does not see the description for spell scholastic in Rewards section
	
Examples:
  | UsingData                 			|
  | Teacher_NOTQualify_SpellScholastic 	|	
  

@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@2
Scenario Outline:Teacher does not receive bonus dollars for milestone order if order qualifies for minimum amount on teacher catalogues:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	When teacher adds teacher catalogue items to cart with pre-tax amount meeting the [minimum amount]
	And Teacher navigates to rewards & coupons page
	Then teacher does not see the description for spell scholastic in Rewards section
	
Examples:
  | UsingData                 				|
  | Teacher_NOTQualify_SpellScholastic_2 	|	
  

@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@3
Scenario Outline:Teacher does not receive bonus dollars for milestone order if redemptions from bonus coupons make the order non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart with pre-tax amount meeting the [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher sees the description for spell scholastic in Rewards section
	When teacher enters amount in Bonus bank making the cart total go below the [minimum amount]
	Then teacher does not sees the description for spell scholastic in Rewards section
	
Examples:
  | UsingData                 				|
  | Teacher_NOTQualify_SpellScholastic_3 	|	
  
  
@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@4
Scenario Outline:Teacher does not receive bonus dollars for milestone order if redemptions from paper coupons make the order non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart with pre-tax amount meeting the [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher sees the description for spell scholastic in Rewards section
	When teacher enters amount in paper coupons making the cart total go below the [minimum amount]
	Then teacher does not sees the description for spell scholastic in Rewards section
	
Examples:
  | UsingData                 				|
  | Teacher_NOTQualify_SpellScholastic_4 	|	
  
  
@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@5
Scenario Outline:Teacher does not receive bonus dollars for milestone order if redemptions from Bonus Bank and paper coupons make the order non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart with pre-tax amount meeting the [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher sees the description for spell scholastic in Rewards section
	When teacher enters amount in both Bonus bank and paper coupons making the cart total go below the [minimum amount]
	Then teacher does not sees the description for spell scholastic in Rewards section
	
Examples:
  | UsingData                 				|
  | Teacher_NOTQualify_SpellScholastic_5 	|	
  
 
@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@6
Scenario Outline:Teacher receives bonus dollars if order qualifies for milestone order for designated month:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	When teacher adds student club items to cart with pre-tax amount meeting the [minimum amount]
	And Teacher navigates to Review Your Cart page
	When Teacher navigates to rewards & coupons page
	Then teacher sees the description for spell scholastic for the designated month in Rewards section
	
Examples:
  | UsingData                 				|
  | Teacher_NOTQualify_SpellScholastic_6 	|	
  
 
@RedemptionsAndRewards
@Priority1
@Sprint-14.5
@SCSCOD-6243
@7
Scenario Outline:The Bonus dollars earned are removed if teacher already qualified for a milestone order and teacher deletes items from the cart making the cart non-qualifying:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher selects [enter classroom order] from home page
	And teacher adds student club items to cart with pre-tax amount meeting the [minimum amount]
	And Teacher navigates to Review Your Cart page
	And Teacher navigates to rewards & coupons page
	And teacher sees the description for spell scholastic in Rewards section
	When teacher navigates back to cart page
	And teacher deletes items from cart making the cart total go below the [minimum amount]
	Then teacher does not sees the description for spell scholastic in Rewards section
	
Examples:
  | UsingData                 				|
  | Teacher_NOTQualify_SpellScholastic_7	|	
  
             