#Feature: SavedCart
#	This feature is used to validate all scenarios
#
#
#Background:
#	Given teacher open rco-scholastic web site
#
#
###################################################################################################################################################
###################################################################################################################################################
############################################   							             #############################################################
############################################   		    SAVED CART PAGE    		     #############################################################
############################################   							             #############################################################
###################################################################################################################################################
###################################################################################################################################################
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Items grouped by Student club when teacher saves cart for later with more than one Student Club same month:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	And teacher selects [enter classroom order] from home page
#	And Teacher adds items from different Student clubs same months
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	Then items are grouped by Student Club Youngest Club to Oldest Club in SavedCart page
#
#Examples:
#  | UsingData                                		 		|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentClub_Samemonth 	|
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Items grouped by teacher club when teacher saves cart for later with more than one teacher club:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	And Teacher adds items from different Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	Then items are grouped by teacher Club in SavedCart page
#
#Examples:
#  | UsingData                                		|
#  | BTS:SavedCart:TeacherOrder_DifferentTeacherClub 	|
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Subtotals, Qty and totals displayed correctly when teacher saves cart for later with Student Club:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	And Teacher adds items from different Student clubs different month
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	Then Student Club total is calculated correctly in Saved Cart page
#
#Examples:
#  | UsingData                         							|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentClub_differentmonth 	|
#
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Subtotals, Qty and totals displayed correctly when teacher saves cart for later with teacher Club:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	And Teacher adds items from different Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	Then Teacher Catalogues total is calculated correctly in Saved Cart page
#
#Examples:
#  | UsingData                         				|
#  | BTS:SavedCart:TeacherOrder_DifferentTeacherClub_2 	|
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Teacher clicks on No on delete confirmation modal for saved cart:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	When Teacher clicks on Delete and NO
#	Then Teacher is still on saved cart and it is not deleted
#
#Examples:
#  | UsingData                         						|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub 	|
#
#
#@SavedCart
#@Priority1
#@Maintenance
#Scenario Outline:Teacher can restore cart:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the Manage saved cart
#	And Teacher restore the Saved cart
#	When Teacher selects the Manage saved cart
#	Then saved cart is not shown in the Saved cart list
#
#Examples:
#  | UsingData                         			|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_2 |
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Teacher can view saved cart from Manage saved carts page:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the Manage saved cart
#	When Teacher clicks on View
#	Then selected saved cart page displays
#
#Examples:
#  | UsingData                         			|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_3 |
#
#
#@SavedCart
#@Priority1
#Scenario Outline:Teacher can delete a saved cart from Manage saved carts page:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the Manage saved cart
#	When Teacher clicks on Delete and YES
#	Then saved cart is not shown in the Saved cart list
#
#Examples:
#  | UsingData                         			|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_4 |
#
#
#
#@SavedCart
#@Priority2
#Scenario Outline:Teacher clicks on Close on delete confirmation modal of saved cart:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	And Teacher deletes the Saved cart
#	Then Teacher is still on saved cart
#
#Examples:
#  | UsingData                         							|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_5 	|
#
#
#@SavedCart
#@Priority2
#Scenario Outline:Teacher can return to manage saved carts from a saved cart page:[<UsingData>]
#
#	Given teacher logs into the application by providing [UserInformation]
#	When Teacher do the empty saved cart
#	When teacher selects [enter classroom order] from home page
#	When Teacher adds items from different Student and Teacher clubs
#	And Teacher navigates to Review Your Cart page
#	And Teacher clicks on Save Cart for Later button
#	And Teacher saves the cart
#	When Teacher selects the saved cart
#	When Teacher clicks on 'Return to Manage Saved Carts'
#	Then Manage Your Saved carts page displays with list of all saved carts
#
#Examples:
#  | UsingData                         							|
#  | BTS:SavedCart:TeacherOrder_DifferentStudentAndTeacherClub_6 	|
#
#
#
###################################################################################################################################################
###################################################################################################################################################
############################################   							             #############################################################
############################################   		    STORY 2856 -My Saved Cart    #############################################################
############################################   							             #############################################################
###################################################################################################################################################
###################################################################################################################################################
#
#
#@SavedCart
#Scenario Outline: Teacher updates the quantity of item in save card, updated quantity should be reflected :[<UsingData>]
#
#Given teacher login into the application by providing [UserInformation]
#When teacher selects “enter classroom order” from home page
#And teacher adds student club items to cart with [minumum amount]
#When teacher clicks save cart, provides cart name and save
#And quantity is updated and same reflects on cart
#
# Examples:
#  | UsingData                           |
#  | dev35:MySavedCart                   |