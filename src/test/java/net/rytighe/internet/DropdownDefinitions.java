package net.rytighe.internet;

import net.rytighe.internet.pageobjects.DropdownPage;
import cucumber.api.java.en.Then;

public class DropdownDefinitions {
	private DropdownPage dropdownPage;
	
	public DropdownDefinitions(DropdownPage dropdownPage){
		this.dropdownPage = dropdownPage;
	}
	
	@Then("^I can set the dropdown to option (\\d+)$")
	public void i_set_the_dropdown_to_option(int arg1) throws Throwable {
	    dropdownPage.setDropdown(arg1);;
	}
}
