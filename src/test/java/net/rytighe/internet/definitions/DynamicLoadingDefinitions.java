package net.rytighe.internet.definitions;

import net.rytighe.internet.pageobjects.DynamicLoadingExamplePage;
import net.rytighe.internet.pageobjects.DynamicLoadingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class DynamicLoadingDefinitions {
	
	private DynamicLoadingPage dynamicLoadingPage;
	private DynamicLoadingExamplePage examplePage;
	
	public DynamicLoadingDefinitions(DynamicLoadingPage dynamicLoadingPage){
		this.dynamicLoadingPage = dynamicLoadingPage;
	}
	
	@When("^I choose the second example$")
	public void i_choose_the_second_example() throws Throwable {
		examplePage = dynamicLoadingPage.exampleTwo();
	}
	
	@When("^I click on the button$")
	public void i_click_on_the_button() throws Throwable {
	    examplePage.clickStart();
	}
	
	@Then("^I should see \"(.+)\" at the finish$")
	public void i_should_wait_for_the_finish(String text) throws Throwable {
	    assertTrue(text.equals(examplePage.getFinishText()));
	}


}
