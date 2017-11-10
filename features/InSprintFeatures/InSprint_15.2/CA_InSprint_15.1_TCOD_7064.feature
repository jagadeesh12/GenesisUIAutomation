Feature: Validation of SCSCOD-7064 scenarios for Sprint 15.2
	This feature is used to validate all scenarios for SCSCOD-7064

Background:
	Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-7064      			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@1
Scenario Outline: Teacher sees recent addition of item at the top of the “ITEM#” list on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
When teacher enters another valid item number
And teacher clicks on the ‘ADD’ button
Then teacher sees the recent item added at the top of the "ENTER ITEM #" list
Examples: 
| UsingData                                                         |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_RecentItemOnTopOfList |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@2
Scenario Outline: Teacher can edit the quantity of an item in the “ITEM#” list on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
When teacher edits the quantity of the item to [quantity amount]
Then teacher sees the current quantity of item as [quantity amount]
Examples: 
| UsingData                                                         |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_FirstItem_IncreaseQty |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@3
Scenario Outline: Teacher can delete an item from the “ITEM#” list on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
When teacher selects the ‘X’ icon in the first item row
And teacher confirms the delete
Then teacher do not see the deleted item in the "ENTER ITEM #" list
Examples: 
| UsingData                                                    |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_FirstItem_Delete |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@4
Scenario Outline: Teacher sees the delete pop-up when the quantity of item is 0 on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher adds multiple valid item numbers
When teacher edits the quantity of the first item to 0
Then teacher sees the delete pop-up under the first item row
Examples: 
| UsingData                                                              |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_FirstItem_0Qty_DeletePopUp |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@5
Scenario Outline: Teacher does not see the “ITEM#” table when the only item in the list is deleted on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
When teacher selects the ‘X’ icon in the first item row
And teacher confirms the delete
Then teacher do not see the "ENTER ITEM #" table under the "ENTER ITEM #" layer
Examples: 
| UsingData                                   |
| InSprint15.2:TCOD:YTO_ByItem_NOItemNumTable |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@6
Scenario Outline: ‘ADD’ button is enabled when 3 characters are entered in the ‘ITEM#’ textbox:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters an item number with 3 characters
Then the "ADD" button is enabled
Examples: 
| UsingData                                                  |
| InSprint15.2:TCOD:YTO_ByItem_AddButtonEnabled_3Characters_StudentClubs |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@7
Scenario Outline: An error message is shown when teacher enters a non-existing item number on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a non-existing item number
And teacher clicks on the ‘ADD’ button
Then an error message is shown above the "ENTER ITEM #" textbox stating that the number does not exist
Examples: 
| UsingData                                                      |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_NonExistingItemNum |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@8
Scenario Outline: The “ITEM#” textbox is empty and the “ADD” button is disabled when an item is added to the “ITEM#” list on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
When teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
Then "ENTER ITEM #" textbox is empty
And "ADD" button is disabled
Examples: 
| UsingData                                                   |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_ITEM#_ADDButton |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@9
Scenario Outline: Teacher can enter 6 characters in the ‘ITEM#’ textbox on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters an item number with 6 characters
Then "ENTER ITEM #" textbox accepts the item number
Examples: 
| UsingData                                        |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_6char|

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@10
Scenario Outline: Teacher can enter 1 character in the ‘ITEM#’ textbox on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters an item number with 1 character
Then "ENTER ITEM #" textbox accepts the item number
Examples: 
| UsingData                                         |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_1char |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@11
Scenario Outline: Teacher cannot enter more than 6 characters in the ‘ITEM#’ textbox on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters an item number with more than 6 characters
Then the "ENTER ITEM #" textbox rejects the item number
Examples: 
| UsingData                                        |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_7char|

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@12
Scenario Outline: An error message is shown when teacher enters an item number with special characters on the Your Teacher Order page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters an item number with special characters
And teacher clicks on the ‘ADD’ button
Then an error message is shown above the "ENTER ITEM #" textbox stating the number is incorrect
Examples: 
| UsingData                        |
| InSprint15.2:TCOD:YTO_ByItem_ItemNumTextbox_SpecialChar|

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@13
Scenario Outline: Shopping cart is updated(increased) when the an item is added using the 'By Item#' section:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
When teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
Then the shopping cart is updated by an increase of 1
Examples: 
| UsingData                        |
| InSprint15.2:TCOD:YTO_ByItem_ShoppingCart_Updated_Increase |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@14
Scenario Outline: Shopping cart is updated (decrease) when the an item is removed using the 'By Item #' section:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
When teacher selects the ‘X’ icon in the first item row
And teacher confirms the delete
Then the shopping cart is updated by a decrease of 1
Examples: 
| UsingData                        |
| InSprint15.2:TCOD:YTO_ByItem_ShoppingCart_Updated_Decrease |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@15
Scenario Outline: The item number appears in the drop-down when it was entered previously:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
When teacher clicks in the "ENTER ITEM #" textbox
Then teacher sees a drop-down under the "ENTER ITEM #" textbox
And teacher sees the previously added item in the drop-down
Examples: 
| UsingData                        |
| InSprint15.2:TCOD:YTO_ByItem_ItemInDropDown |

@SCSCOD-7064
@Priority1
@Sprint-15.2
@Release-BTS2017
@YTO
@16
Scenario Outline: Teacher can add previously added item in the 'ITEM#' textbox from dropdown:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher selects [enter classroom order] from home page
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
When teacher clicks in the "ENTER ITEM #" textbox
And teacher selects previously added item number from dropdown
Then teacher sees item number added to "ITEM#" textbox
Examples: 
| UsingData                        |
| InSprint15.2:TCOD:YTO_ByItem_ItemInDropDown_AddedToItemNumTextbox |

########################################################################### Manual Tests ###################################################################################
#@SCSCOD-7064
#@Manual
#@Sprint-15.2
#@Release-BTS2017
#@YTO
#Scenario Outline: Teacher sees correct layout for ‘By Item#’ option on the Your Teacher Order page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher selects the Your Teacher Order option
#When teacher navigates to the Your Teacher Order page
#And teacher clicks the "By Item #" hyperlink is selected
#Then title of the tab is labelled ‘Your Teacher Order’
#And the message displayed below the aforementioned title is “Enter items for your classroom the usual way, BY FLYER, or the new way, BY ITEM #. You'll be asked to Redeem Bonus Coupons and Credit Notes at checkout.”
#And the link labelled "By Flyer" is on the left side under the message unselected
#And the link labelled "By Item #" is next to the ‘By Flyer’ link highlighted
#And the data field has only one textbox labelled "ENTER ITEM #"
#And the "ADD" button is disabled
#
#@SCSCOD-7064
#@Manual
#@Sprint-15.2
#@Release-BTS2017
#@YTO
#Scenario Outline: Teacher sees a tabular structure with the correct format when an item number is added on the Your Teacher Order page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher selects [enter classroom order] from home page
#And teacher selects the Your Teacher Order option
#When teacher navigates to the Your Teacher Order page
#And teacher clicks the "By Item #" hyperlink is selected
#And teacher enters a valid item number
#And teacher clicks on the ‘ADD’ button
#Then teacher sees a tabular structure under the "ITEM#" layer
#And teacher sees Student Name column, Item Number column, Item Title column, Flyer column, Coupon column, Price column, and Quantity column
#And teacher sees each column has the correct information for the added item