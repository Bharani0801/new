package org.lo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Provider extends BaseClass {
	
	public Provider() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@id=\"u_0_d_ZP\"]")
	private WebElement btn;
}
