Feature: User Creation
  This feature is used to create teacher profile for new teacher login


  #Information--
  #Sat_UserTestNG.xml - same file is used for setting password in BM and RCO setting of profile for teacher. Accordingly
  #uncomment test here
  #Jenkins Job -BM_PasswordSet. URL parameter needs to be changes as per BM or ROC

#[UserInformation]- UserName,Password
#[ItemInformation]-StudentName,ItemId

#  Background:
#    Given teacher open rco-scholastic web site


  @Priority1
  @BM
  Scenario Outline:Edit Teacher profile:[<UsingData>]

    #Given teacher sets the password
    Given teacher logs in to create profile
  Examples:
    |UsingData  |
    |Test777           |