package net.rytighe.internet;

import net.rytighe.internet.SharedDriver;
import net.rytighe.internet.pageobjects.DownloadPage;
import net.rytighe.internet.pageobjects.DropdownPage;
import net.rytighe.internet.pageobjects.LandingPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LandingPageDefinitions {
	
	private LandingPage landingPage;
	private DownloadPage downloadPage;
	private DropdownPage dropdownPage;
	
	public LandingPageDefinitions(LandingPage landingPage){
		System.out.println("CukesStepDefinitions CTOR");
		
		
		this.landingPage = landingPage;
	}
	
	@After
	public void tearDown(){
		SharedDriver.tearDown();
	}

	@Given("^I navigate to the \"(.*)\" page$")
	public void iNavigateToTheXPage(String page) throws Throwable {
		System.out.println("iNavigateToTheDownloadPage");
		
		downloadPage = landingPage.download();
		System.out.println(downloadPage.countLinks());
	}
	
	@When("^I access the dropdown page$")
	public void i_access_the_dropdown_page() throws Throwable {
		dropdownPage = landingPage.dropdown();
	}

	
}
