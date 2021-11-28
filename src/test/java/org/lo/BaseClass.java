package org.lo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharani\\eclipse-workspace\\DataProvider\\driver\\chromedriver1.exe");
	 return driver = new ChromeDriver();

	}
	public static void launchurl(String value) {
		driver.get(value);

	}
	

	

}
