package net.rytighe.internet.pageobjects;

import net.rytighe.internet.SharedDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public abstract class AbstractPage {
	public AjaxElementLocatorFactory finder;
	public AbstractPage(){
		finder = new AjaxElementLocatorFactory(SharedDriver.getInstance(), SharedDriver.getTimeout());
		PageFactory.initElements(finder, this);
	}
}
