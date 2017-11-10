Feature: Parent-My Account
  Parent Site - My Account - Connect Child to Teacher FAT modal

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

###################################################################################################################################################
###########################################   		    DWCAPCOD-64	     	         #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Priority1
  @ParentMyAccount
  @DWCAPCOD-64
  @Sprint-16.2
  @1

  Scenario Outline: Parent clicks Edit and change the child and teacher information:[<UsingData>]

    Given Parent login in with valid [username] and [password]
    And parent has a child not connected to a teacher
    And parent clicks on My Account and Profile from the header
    When parent clicks on Edit
    And parent update the child first name, last name, grade, birth date
    And parent clicks on Find Your Teacher
    And parent selects a different teacher
    And clicks on Save add Child
    Then updated <ChildFirstName> in <TeacherName>'s class displays
    And new updates are saved

    Examples:
      |UsingData|
      |InSprint16.2:PCOD:ParentMyAccount:FAT|