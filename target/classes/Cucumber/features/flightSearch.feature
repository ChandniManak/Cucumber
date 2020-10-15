Feature: Verify if the user is able to search flight on Air Asia website

Scenario: 
Given User is navigated successfully to the website "https://www.airasia.com/en/gb"
	And Verify its Title
	And Click on Flights Icon
	And Enter Origin as "Bengaluru"
	And Enter Destination as "Pune"
	And Select Depart date as "15/12/2020"
	And Select Return type as "One Way"
When User clicks on Search Button
Then Verify that the user is navigated successfully to search flight page
