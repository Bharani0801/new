package org.lo;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Data extends BaseClass {
	
	public static void main(String[] args) {
		
		getdriver();
		launchurl("https://www.facebook.com/");
		
		Provider p = new Provider();
		WebElement username = p.getUsername();
		
		
		
	}
	
	

}
