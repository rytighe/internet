package net.rytighe.internet;

import net.rytighe.internet.SharedDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class BackgroundDefinitions {
	
	@Given("^I am at the landing page$")
	public void i_am_at_the_landing_page() throws Throwable {
		SharedDriver.getInstance().get("http://the-internet.herokuapp.com");
	}
	
	@After
	public void tearDown(){
		SharedDriver.tearDown();
	}

}
