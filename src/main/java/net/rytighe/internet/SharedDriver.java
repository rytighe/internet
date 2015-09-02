package net.rytighe.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SharedDriver {

	private static WebDriver driver;
	
	public static WebDriver getInstance(){
		if(driver == null){
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void tearDown() {
		if(driver != null){
			driver.quit();
			driver = null;
		}
		
	}
}
