Feature: Parent-My Account
  Parent Site - My Account - Connect Child to Teacher FAT modal

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

###################################################################################################################################################
###########################################   		    DWCAPCOD-1307    	         #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Priority1
  @ParentMyAccount
  @DWCAPCOD-1307
  @Sprint-16.2
  @1

  Scenario Outline: Parent Edits and associates the child to teacher:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent has a child not connected to a teacher
    And parent clicks on My Account and Profile from the header
    When parent clicks on Edit
    And parent clicks on Find Your Teacher
    And parent selects a teacher
    And clicks on Save
    Then <ChildFirstName> in <TeacherName>'s class displays

    Examples:
      |UsingData|
      |InSprint16.2:PCOD:ParentMyAccount:FAT2|