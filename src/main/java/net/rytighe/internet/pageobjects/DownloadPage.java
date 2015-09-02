package net.rytighe.internet.pageobjects;

import java.util.List;

import net.rytighe.internet.SharedDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
	
	@FindBy(xpath="//a[contains(@href, 'download')]")
	private List<WebElement> links;
	
	public DownloadPage(){
		PageFactory.initElements(SharedDriver.getInstance(), this);
	}

	public int countLinks() {
		return links.size();
	}

}
