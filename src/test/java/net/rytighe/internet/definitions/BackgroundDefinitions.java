package net.rytighe.internet.definitions;

import net.rytighe.internet.SharedDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class BackgroundDefinitions {
	
	@Given("^I am at the landing page$")
	public void i_am_at_the_landing_page() throws Throwable {
		SharedDriver.getInstance().get("http://the-internet.herokuapp.com");
	}
	
	@After
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			TakesScreenshot takesScreenshot = (TakesScreenshot) SharedDriver.getInstance();
			byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		SharedDriver.tearDown();
	}

}
