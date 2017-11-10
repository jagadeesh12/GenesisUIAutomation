Feature: Validation of SCSCOD-5101 scenarios for Sprint 15.2
	This feature is used to validate all scenarios for SCSCOD-5101

Background:
	Given teacher open rco-scholastic web site



##################################################################################################################################################
##################################################################################################################################################
###########################################   							             #############################################################
###########################################   		    SCSCOD-5101      			 #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO
@1
Scenario Outline: Navigating to the YTO page for Flyer item using unique number on PDP page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters an unique item number existing in a Flyer in the search textbox
And teacher clicks Search
When teacher clicks on the hyperlink next to the item number
Then teacher is re-directed to the YTO page
And corresponding grade that the item belongs to is selected
And corresponding month for that grade is selected
Examples:
| UsingData                                      |
| InSprint15.2:TCOD:YTO_PDP_Grade_EarlyChildhood |
| InSprint15.2:TCOD:YTO_PDP_Kindergarten_Grade1   |
| InSprint15.2:TCOD:YTO_PDP_Grade2_Grade3        |
| InSprint15.2:TCOD:YTO_PDP_Grade4_Grade5        |
| InSprint15.2:TCOD:YTO_PDP_Grade6_Grade7        |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO
@2
Scenario Outline: Navigating to the YTO page for Flyer item using partial text on Quick Look modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters a partial text for an item existing in a Flyer in the search textbox
And teacher clicks Search
When teacher clicks on the Quick Look link for the first item on the search result page
And teacher clicks on the hyperlink next to the item number
Then teacher is re-directed to the YTO page
And corresponding grade that the item belongs to is selected
And corresponding month for that grade is selected
Examples:
| UsingData                                              |
| InSprint15.2:TCOD:YTO_PartialText_Grade_EarlyChildhood |
| InSprint15.2:TCOD:YTO_PartialText_Kindergarten_Grade1   |
| InSprint15.2:TCOD:YTO_PartialText_Grade2_Grade3        |
| InSprint15.2:TCOD:YTO_PartialText_Grade4_Grade5        |
| InSprint15.2:TCOD:YTO_PartialText_Grade6_Grade7        |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO
@3
Scenario Outline: Navigating to the YTO page for Flyer item using its Flyer hyperlink on Review Cart page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters an unique item number existing in a Flyer in the search textbox
And teacher clicks Search
And teacher adds item to cart
When teacher navigates to the Review Cart page
And teacher clicks on Flyer hyperlink for the added item
Then teacher is re-directed to the YTO page
And corresponding grade that the item belongs to is selected
And corresponding month for that grade is selected
Examples:
| UsingData                                             |
| InSprint15.2:TCOD:YTO_ReviewCart_Grade_EarlyChildhood |
| InSprint15.2:TCOD:YTO_ReviewCart_Kindergarten_Grade1   |
| InSprint15.2:TCOD:YTO_ReviewCart_Grade2_Grade3        |
| InSprint15.2:TCOD:YTO_ReviewCart_Grade4_Grade5        |
| InSprint15.2:TCOD:YTO_ReviewCart_Grade6_Grade7        |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@BookResource
@4
Scenario Outline: Navigating to the Book Resource page for Teacher Catalogue item using unique number on PDP page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters an unique item number existing in the Teacher Catalogue in the search textbox
And teacher clicks Search
When teacher clicks on the hyperlink next to the item number
Then teacher is re-directed to the corresponding Book Resource page
Examples:
| UsingData                                                        |
| InSprint15.2:TCOD:TeacherExclusive_PDP_ClassroomRewardCatalogues |
| InSprint15.2:TCOD:TeacherExclusive_PDP_SpringClearance           |
| InSprint15.2:TCOD:Collection_PDP_ClubDeLecture                   |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@BookResource
@5
Scenario Outline: Navigating to the Book Resource page for Teacher Catalogue item using partial text on Quick Look modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters a partial text for an item existing in the Teacher Catalogue in the search textbox
And teacher clicks Search
When teacher clicks on the Quick Look link for the first item on the search result page
And teacher clicks on the hyperlink next to the item number
Then teacher is re-directed to the corresponding Book Resource page
Examples:
| UsingData                                                        |
| InSprint15.2:TCOD:TeacherExclusive_PartialText_ClassroomRewardCatalogues |
| InSprint15.2:TCOD:TeacherExclusive_PartialText_SpringClearance           |
| InSprint15.2:TCOD:Collection_PartialText_ClubDeLecture                   |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@BookResource
@6
Scenario Outline: Navigating to the Book Resource page for Teacher Catalogue item using its Flyer hyperlink on Review Cart page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters an unique item number existing in the Teacher Catalogue in the search textbox
And teacher clicks Search
And teacher adds item to cart
When teacher navigates to the Review Cart page
And teacher clicks on Flyer hyperlink for the added item
Then teacher is re-directed to the corresponding Book Resource page
Examples:
| UsingData                                                        |
| InSprint15.2:TCOD:TeacherExclusive_ReviewCart_ClassroomRewardCatalogues |
| InSprint15.2:TCOD:TeacherExclusive_ReviewCart_SpringClearance           |
| InSprint15.2:TCOD:Collection_ReviewCart_ClubDeLecture                   |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@GenericOnline
@7
Scenario Outline: Category hyperlink disabled for Generic Online item using partial text on the Quick Look modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters a partial text for an item existing only in the Generic Online category in the search textbox
And teacher clicks Search
When teacher clicks on the Quick Look link for the first item on the search result page
Then the hyperlink next to the "Item #" is removed and disabled
Examples:
| UsingData                                     |
| InSprint15.2:TCOD:OnlineExclusive_Honeybee_PartialText |

@SCSCOD-5101
@Priority1
@Sprint-15.25
@Release-15.2
@YTO
@8
Scenario Outline: Category hyperlink disabled for Generic Online item using unique number on the PDP page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters the unique item number for an item existing only in the Generic Online category in the search textbox
When teacher clicks Search
Then the hyperlink next to the "Item #" is removed and disabled
Examples:
| UsingData                             |
| InSprint15.2:TCOD:OnlineExclusive_Honeybee_PDP |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@GenericOnline
@9
Scenario Outline: Flyer hyperlink disabled for Generic Online item on the Review Cart page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters a partial text for an item existing only in the Generic Online category in the search textbox
And teacher clicks Search
When teacher clicks on the Quick Look link for the first item on the search result page
And teacher adds item to cart
And teacher navigates to the Review Cart page
Then the hyperlink under the Flyer column for the added item is removed and disabled
Examples:
| UsingData                                    |
| InSprint15.2:TCOD:OnlineExclusive_Honeybee_ReviewCart |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO-BookResource
@10
Scenario Outline: YTO hyperlink for item existing in a Flyer and Book Resource goes to the corresponding YTO page using its partial text on Quick Look modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters partial text for item existing in a Flyer and Book Resource in the search textbox
And teacher clicks Search
And teacher clicks on the Quick Look link for the first item on the search result page
And teacher hovers over the category hyperlink next to the item number
When teacher clicks on the YTO hyperlink in the pop-up
Then teacher is re-directed to the YTO page
And corresponding grade that the item belongs to is selected
And corresponding month for that grade is selected
Examples:
| UsingData                                                            |
| InSprint15.2:TCOD:MultipleCategories_YTO_TeacherExclusive_PartiaText_YTO_hyperlink |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO-BookResource
@11
Scenario Outline: Teacher Catalogue hyperlink for item existing in a Flyer and Book Resource goes to the corresponding page using its partial text on Quick Look modal:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters partial text for item existing in a Flyer and Book Resource in the search textbox
And teacher clicks Search
And teacher clicks on the Quick Look link for the first item on the search result page
And teacher hovers over the category hyperlink next to the item number
When teacher clicks on the Teacher Catalogue hyperlink in the pop-up
Then teacher is re-directed to the corresponding Book Resource page
Examples:
| UsingData                                                            |
| InSprint15.2:TCOD:MultipleCategories_YTO_TeacherExclusive_PartiaText_BookResource_hyperlink |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO-BookResource
@12
Scenario Outline: YTO hyperlink for item existing in a Flyer and Book Resource goes to the corresponding YTO page using its unique number on PDP page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters an unique item number existing in a Flyer and Book Resource in the search textbox
And teacher clicks Search
And teacher hovers over the category hyperlink next to the item number
When teacher clicks on the YTO hyperlink in the pop-up
Then teacher is re-directed to the YTO page
And corresponding grade that the item belongs to is selected
And corresponding month for that grade is selected
Examples:
| UsingData                                                     |
| InSprint15.2:TCOD:MultipleCategories_YTO_TeacherExclusive_UniqueNumber_YTO_PDP |

@SCSCOD-5101
@Priority1
@Sprint-15.2
@Release-15.2
@YTO-BookResource
@13
Scenario Outline: Teacher Catalogue hyperlink for item existing in a Flyer and Book Resource goes to the corresponding page using its unique number on PDP page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher enters an unique item number existing in a Flyer and Book Resource in the search textbox
And teacher clicks Search
And teacher hovers over the category hyperlink next to the item number
When teacher clicks on the Teacher Catalogue hyperlink in the pop-up
Then teacher is re-directed to the corresponding Book Resource page
Examples:
| UsingData                                                     |
| InSprint15.2:TCOD:MultipleCategories_YTO_TeacherExclusive_UniqueNumber_BookResource_PDP |

#@SCSCOD-5101
#@Priority1
#@Sprint-15.2
#@Release-15.2
#@YTO-GenericOnline
#@14
#Scenario Outline: Category hyperlink disabled for an item existing in Generic Online but enabled for Flyer using its unique number on PDP page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher enters an unique item number existing in Generic Online and Flyer in the search textbox
#And teacher clicks Search
#When teacher hovers over the category hyperlink next to the item number
#And the hyperlink for the Generic Online category is disabled
#And the hyperlink for the Flyer is enabled
#Examples:
#| UsingData                                                            |
#| InSprint15.2:TCOD:MultipleCategories_YTO_GenericOnline_UniqueNumber_PDP |
#
#@SCSCOD-5101
#@Priority1
#@Sprint-15.2
#@Release-15.2
#@BookResource-GenericOnline
#@15
#Scenario Outline: Category hyperlink disabled for an item existing in Generic Online but enabled for Book Resource using its unique number on PDP page:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher enters an unique item number existing in Generic Online and Book Resource in the search textbox
#And teacher clicks Search
#When teacher hovers over the category hyperlink next to the item number
#And the hyperlink for the Generic Online category is disabled
#And the hyperlink for the Book Resource is enabled
#Examples:
#| UsingData                                                            |
#| InSprint15.2:TCOD:MultipleCategories_TeacherExclusive_GenericOnline_UniqueNumber_PDP |
#
#@SCSCOD-5101
#@Priority1
#@Sprint-15.2
#@Release-15.2
#@YTO-GenericOnline
#@16
#Scenario Outline: Category hyperlink disabled for an item existing in Generic Online but enabled for either Flyer and Book Resource using its partial text on Quick Look modal:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher enters partial text for item existing in Generic Online and Flyer in the search textbox
#And teacher clicks Search
#And teacher clicks on the Quick Look link for the first item on the search result page
#When teacher hovers over the category hyperlink next to the item number
#And the hyperlink for the Generic Online category is disabled
#And the hyperlink for the Flyer is enabled
#Examples:
#| UsingData                                                                    |
#| InSprint15.2:TCOD:MultipleCategories_YTO_GenericOnline_UniqueNumber_PartialText |
#
#@SCSCOD-5101
#@Priority1
#@Sprint-15.2
#@Release-15.2
#@BookResource-GenericOnline
#@17
#Scenario Outline: Category hyperlink disabled for an item existing in Generic Online but enabled for either Flyer and Book Resource using its partial text on Quick Look modal:[<UsingData>]
#Given teacher logs into the application by providing [UserInformation]
#And teacher enters partial text for item existing in Generic Online and Book Resource in the search textbox
#And teacher clicks Search
#And teacher clicks on the Quick Look link for the first item on the search result page
#When teacher hovers over the category hyperlink next to the item number
#And the hyperlink for the Generic Online category is disabled
#And the hyperlink for the Book Resource is enabled
#Examples:
#| UsingData                                                                    |
#| InSprint15.2:TCOD:MultipleCategories_TeacherExclusive_UniqueNumber_Online_PartialText |