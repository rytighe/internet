Feature: The Internet has a downloads page
Background:
	Given I am at the landing page
	Scenario:
		The-Internet download page contains links
		When I navigate to the "download" page
		Then I count links 
	
	Scenario:
		When I access the dropdown page
		And I set the dropdown to option 1
		