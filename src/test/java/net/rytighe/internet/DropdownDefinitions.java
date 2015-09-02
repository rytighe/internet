package net.rytighe.internet;

import net.rytighe.internet.pageobjects.DropdownPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class DropdownDefinitions {
	private DropdownPage dropdownPage;
	
	public DropdownDefinitions(DropdownPage dropdownPage){
		this.dropdownPage = dropdownPage;
	}
	
	@When("^I set the dropdown to option (\\d+)$")
	public void i_set_the_dropdown_to_option(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    dropdownPage.setDropdown(arg1);;
	    Thread.sleep(5000);
	}
}
