Feature: Register users to NewTours site 

Scenario Outline: 
	Given User navigates to homepage of "http://demo.guru99.com/test/newtours/" 
	When User clicks on the register link 
	And Enters First name "<firstName>" 
	And Enters Last Name "<lastName>" 
	And Enters Phone "<phone>" 
	And Enters Email "<email>" 
	And Enters address "<address>" 
	And Enters city "<city>" 
	And Enters State "<state>" 
	And Enters Postal Code "<postalCode>" 
	And Selects Country "India" 
	And Enters Username of your choice "<username>" 
	And Enters password "<password>" 
	And Enters same password in confirm password field "<password>" 
	Then User should be able to submit the form 
	
	Examples: Table.test 
		|firstName	|lastName  |phone	  |email			  |address	 |city	   |state	    |postalCode	|username	|password	|
		|Test       |User1     |8978675645|testuser1@gmail.com|1st street|Chennai  |Tamil nadu	|600001		|test1		|test1		|
		|Test       |User2     |9878675645|testuser2@gmail.com|2nd street|Bangalore|Karnataka 	|897967		|test2		|test2		|
		|Test       |User3     |9887675645|testuser3@gmail.com|3rd street|Mumbai   |Maharashtra	|796745		|test3		|test3		|
		|Test       |User4     |9878765645|testuser4@gmail.com|4th street|Bangalore|Karnataka 	|890967		|test4		|test4		|
		|Test       |User5     |9878676545|testuser5@gmail.com|5th street|Chennai  |Tamil Nadu 	|600003		|test5		|test5		|
		|Test       |User6     |9878675654|testuser6@gmail.com|6th street|Bangalore|Karnataka 	|897967		|test6		|test6		|
		|Test       |User7     |9878675644|testuser7@gmail.com|7th street|Chennai  |Tamil Nadu 	|600009		|test7		|test7		|
		|Test       |User8     |9878675643|testuser8@gmail.com|8th street|Chennai  |Tamil Nadu 	|600007		|test8		|test8		|
		|Test       |User9     |9878675642|testuser9@gmail.com|9th street|Bangalore|Karnataka 	|897967		|test9		|test9		|
		|Test       |User0     |9878675641|testuser0@gmail.com|0th street|Chennai  |Tamil Nadu 	|600064		|test0		|test0		|