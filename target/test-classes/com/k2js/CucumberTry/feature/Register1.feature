Feature: NT ConfirmationPage validation
Background: Open NT with ConfirmationPage
Given Open browser and URL
@tag-2
Scenario: With Enter with username and password
When Click on confirmation link
And enter username
And enter password
And Click submit
Then Validate the details




