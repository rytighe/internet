package net.rytighe.internet.pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.rytighe.internet.SharedDriver;

public class DynamicLoadingIncorrectExamplePage extends AbstractPage {
	
	@FindBy(xpath="//button")
	WebElement startButton;
	
	@FindBy(id="finish")
	WebElement finish;
	
	public DynamicLoadingIncorrectExamplePage(){
		//This page will use the default ElementLocatorFactory, which means the getFinish div will not be present when accessed
		PageFactory.initElements(SharedDriver.getInstance(), this);
		
	}
	
	public void clickStart(){
		this.startButton.click();
	
		
	}
	
	public String getFinishText(){
		try {
			return finish.getText();
		} catch (NoSuchElementException nsee){
			return "";
		}
		
	}
	
}
