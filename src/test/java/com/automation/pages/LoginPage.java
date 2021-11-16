package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver lDriver) {
		this.driver = lDriver;
	}
	
	@FindBy(id="usernameid") WebElement userName;
	@FindBy(name="passwordname") WebElement password;
	@FindBy(xpath="//div[]/span/onput") WebElement loginButton;
	
	public void loginToApplication(String uname, String pwd) {
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}
}
