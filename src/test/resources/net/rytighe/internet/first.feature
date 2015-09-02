Feature: The Internet has a downloads page
Background:
	Given I am at the landing page
	Scenario:
		The-Internet download page contains links
		When I navigate to the "download" page
		Then I count links 
	
	Scenario:
		The-Internet dropdown page contains a dropdown
		When I access the dropdown page
		Then I can set the dropdown to option 1
		