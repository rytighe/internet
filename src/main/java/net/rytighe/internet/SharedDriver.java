package net.rytighe.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SharedDriver {

	private static WebDriver driver;
	private static int timeout;
	
	public static WebDriver getInstance(){
		if(driver == null){
			driver = new FirefoxDriver();
			timeout = 10;
		}
		return driver;
	}

	public static void tearDown() {
		if(driver != null){
			driver.quit();
			driver = null;
			timeout = 0;
		}
		
	}

	public static int getTimeout() {
		return timeout;
	}
}
