Feature: DWCAPCOD-1908
	Teachers - Enter Orders - Navigation hyperlinks between SFO, SOO, YTO

  Background:
    Given Parent opens scholastic reading clubs e-commerce site

@Priority1
@YTO
@DWCAPCOD-1908
@Sprint-16.3
@1
Scenario Outline: Teacher clicks on Student Online Order page link from YTO by Flyer:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to the Your Teacher Order page
When teacher clicks on Student Online Orders hyperlink
Then teacher is redirected to SOO page
Examples:
  |UsingData|
  |InSprint16.3:PCOD:SOO:YTOByFlyer_hyperlink|

@Priority1
@YTO
@DWCAPCOD-1908
@Sprint-16.3
@2
Scenario Outline: Teacher clicks on Student Online Order page link from YTO by Item number:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to the Your Teacher Order page
And teacher clicks the "By Item #" hyperlink
And teacher enters a valid item number
And teacher clicks on the ‘ADD’ button
When teacher clicks on Student Online Orders hyperlink
Then teacher is redirected to SOO page
Examples:
  |UsingData|
  |InSprint16.3:PCOD:SOO:YTOByItem_hyperlink|
    
@Priority1
@YTO
@DWCAPCOD-1908
@Sprint-16.3
@3
Scenario Outline: Teacher clicks on Student Online Orders from SFO page:[<UsingData>]
Given teacher logs into the application by providing [UserInformation]
And teacher navigates to SFO page
When teacher add a valid item and Student Name to Student Flyer Order
And teacher clicks on Student Online Orders hyperlink
Then teacher is redirected to SOO page
Examples:
  |UsingData|
  |InSprint16.3:PCOD:SOO:SFO_hyperlink|
