Feature: Verify whether login to Air Asia fails with incorrect login credentials 

@login 
Scenario: 
	Given User navigates to the site url "https://www.airasia.com/en/gb" 
	And Verify the title for successful navigation 
	And User clicks on login button 
	And User enters username as "a@gmail.com" 
	And User enters password as "India1234" 
	When User clicks on Sign In Button 
	Then Verify that error message is displayed on screen in red and contains the text "Your log in attempts has been unsuccessful." 
