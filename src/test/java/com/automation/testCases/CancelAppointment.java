package com.automation.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelAppointment {
	
	WebDriver driver = new ChromeDriver();
	public void tearDown() {
		driver.close();
	}
}
