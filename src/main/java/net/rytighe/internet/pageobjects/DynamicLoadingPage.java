package net.rytighe.internet.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage extends AbstractPage {

	@FindBy(xpath="//button")
	WebElement startButton;
	
	@FindBy(xpath="//a[@href='/dynamic_loading/1']")
	WebElement optionOne;
	
	@FindBy(xpath="//a[@href='/dynamic_loading/2']")
	WebElement optionTwo;
	
	public DynamicLoadingPage(){
		PageFactory.initElements(finder, this);
	}
	
	public DynamicLoadingExamplePage exampleTwo() {
		this.optionTwo.click();
		return new DynamicLoadingExamplePage();
	}
	
}
