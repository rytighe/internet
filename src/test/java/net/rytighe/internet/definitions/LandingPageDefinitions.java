package net.rytighe.internet.definitions;

import net.rytighe.internet.SharedDriver;
import net.rytighe.internet.pageobjects.DownloadPage;
import net.rytighe.internet.pageobjects.DropdownPage;
import net.rytighe.internet.pageobjects.DynamicLoadingPage;
import net.rytighe.internet.pageobjects.LandingPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LandingPageDefinitions {
	
	private LandingPage landingPage;
	private DownloadPage downloadPage;
	private DropdownPage dropdownPage;
	private DynamicLoadingPage dynamicLoadingPage;
	
	public LandingPageDefinitions(LandingPage landingPage){
		this.landingPage = landingPage;
	}
	
	@Given("^I navigate to the \"(.*)\" page$")
	public void iNavigateToTheXPage(String page) throws Throwable {
		downloadPage = landingPage.download();
	}
	
	@When("^I access the dropdown page$")
	public void i_access_the_dropdown_page() throws Throwable {
		dropdownPage = landingPage.dropdown();
	}
	
	@When("^I access the DynamicLoading page$")
	public void i_access_the_DynamicLoading_page() throws Throwable {
	    dynamicLoadingPage = landingPage.dynamicLoading();
		
	}

	
}
