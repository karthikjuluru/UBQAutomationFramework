package com.automation.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BillingPage;
import com.automation.pages.LoginPage;
import com.automation.utilities.BaseClass;

public class BookAppointment extends BaseClass{
	
	@Test
	public void appoinmentBooking() {
		excel.loadFile("./TestData/Data.xlsx");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToApplication(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 1));
		BillingPage billingPage = PageFactory.initElements(driver, BillingPage.class);
	}

}
