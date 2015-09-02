Feature: This framework now waits
Background:
	Given I am at the landing page
	Scenario:
		When I access the DynamicLoading page
		And I choose the second example
		When I click on the button
		Then I should see "Hello World!" at the finish
		