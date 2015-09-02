package net.rytighe.internet.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingExamplePage extends AbstractPage {
	
	@FindBy(xpath="//button")
	WebElement startButton;
	
	@FindBy(id="finish")
	WebElement finish;
	
	public DynamicLoadingExamplePage(){
		PageFactory.initElements(finder, this);
		
	}
	
	public void clickStart(){
		this.startButton.click();
	
		
	}
	
	public String getFinishText(){
		return finish.getText();
	}
	
}
