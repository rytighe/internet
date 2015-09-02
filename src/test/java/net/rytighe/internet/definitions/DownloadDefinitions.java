package net.rytighe.internet.definitions;

import static org.junit.Assert.assertTrue;
import net.rytighe.internet.SharedDriver;
import net.rytighe.internet.pageobjects.DownloadPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DownloadDefinitions {
	
	private DownloadPage downloadPage;
	
	public DownloadDefinitions(DownloadPage downloadPage){
		this.downloadPage = downloadPage;
	}
	
	@Then("^I count links$")
	public void i_count_links() throws Throwable {
		assertTrue(downloadPage.countLinks() > 1);
	}
	
}
