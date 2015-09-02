package net.rytighe.internet.pageobjects;

import net.rytighe.internet.SharedDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

	@FindBy(id="dropdown")
	private WebElement dropdown;
	
	private Select select;
	
	public DropdownPage(){
		PageFactory.initElements(SharedDriver.getInstance(), this);
		select = new Select(dropdown);
	}
	
	public void setDropdown(String value){
		this.select.selectByValue(value);
	}
	
	public String getDropdown(){
		return this.select.getFirstSelectedOption().getText();
	}

	public void setDropdown(int arg1) {
		this.select.selectByIndex(arg1);
	}
	
}
