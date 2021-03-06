package net.rytighe.internet.pageobjects;

import java.util.List;

import net.rytighe.internet.SharedDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	@FindBy(xpath="//title")
	WebElement title;
	
	@FindBy(xpath="//ul")
	List<WebElement> links;
	
	@FindBy(xpath="//a[@href='/download']")
	WebElement downloadLink;
	
	@FindBy(xpath="//a[@href='/dropdown']")
	WebElement dropdownLink;
	
	@FindBy(xpath="//a[@href='/dynamic_loading']")
	WebElement dynamicLoadingLink;
	
	public String getTitle(){
		return title.getText();
	}
	
	public int getSize(){
		return links.size();
	}
	
	public LandingPage(){
		PageFactory.initElements(SharedDriver.getInstance(), this);
	}
	
	public DownloadPage download(){
		downloadLink.click();
		return new DownloadPage();
	}

	public DropdownPage dropdown() {
		dropdownLink.click();
		return new DropdownPage();
	}

	public DynamicLoadingPage dynamicLoading() {
		dynamicLoadingLink.click();
		return new DynamicLoadingPage();
	}
	
}
