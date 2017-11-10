Feature: User Creation
  This feature is used to create users in BM


#[UserInformation]- UserName,Password
#[ItemInformation]-StudentName,ItemId

  Background:
    Given teacher open BM

@Priority1
@BM
  Scenario Outline:SetPassword in BM:[<UsingData>]

    Given teacher sets the password
  Examples:
    |UsingData  |
    |Test777           |
