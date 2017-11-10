Feature: Parent-ReviewCart
  Parent Site - ReviewCart - Add Child

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

###################################################################################################################################################
###########################################   		    DWCAPCOD-66	     	         #############################################################
###########################################   							             #############################################################
##################################################################################################################################################
##################################################################################################################################################


  @Priority1
  @ParentMyAccount
  @DWCAPCOD-66
  @Sprint-16.2
  @1



Scenario Outline: Parent adds a child from Review Cart:[<UsingData>]

Given Parent login in with valid [username] and [password]
And parent has a child connected to a teacher
And parent add items to cart
And parent navigates to Review cart page
When parent clicks on Add a child from child dropdown
And parent enters First Name, Last Name, Grade
And parent clicks on Find Your Teacher
And parent selects a teacher
And clicks on Save
Then  <ChildFirstName LastName> displays in child dropdown


    Examples:
      |UsingData|
      |InSprint16.2:PCOD:AddChildReviewCart:FAT3|