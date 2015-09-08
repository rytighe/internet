Feature: Scenarios that fail will display a screenshot in the test report.  A previous feature correctly loads an AJAX element; this scenario expects to see it immediately.
Background:
	Given I am at the landing page
	Scenario: Verify something
		When I access the DynamicLoading page
		And I choose the second example
		When I click on the button
		Then I should see "Hello World!" immediately
		