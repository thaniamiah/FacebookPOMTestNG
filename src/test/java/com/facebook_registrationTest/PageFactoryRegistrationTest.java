package com.facebook_registrationTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_baseTest.BaseTest;
import com.facebook_registrationPage.PageFactoryRegistrationPage;

public class PageFactoryRegistrationTest extends BaseTest {

	WebDriver driver;
	private PageFactoryRegistrationPage prp;
	
	@BeforeMethod 
	public void init() {
		driver = openApp();
		
	}
	
	@Test
	public void signupNewAccount() {
		// Implemented with "Select"
		prp = new PageFactoryRegistrationPage(driver);
		prp.createNewAccount();
		prp.getFirstName("Xyz");
		prp.getLastName("Abc");
		prp.getEmailAddress("abc@s.com");
		prp.getConfirmEmailAddress("abc@s.com");
		prp.getPassword("pass1234");
		prp.getMonth1("Apr");
		prp.getDay1("15");
		prp.getYear1("1947");
		prp.getCustomGender();
		prp.getMaleGender();
		// prp.getSignUpButton();

	}


	

	@Test
	public void regressionSignupNewAccount() {
		// Implemented with "Select"
		prp = new PageFactoryRegistrationPage(driver);
		prp.signupRegression("John", "Smith", "Jsmith@mail.com", "Jsmith@mail.com", "pass246", "Jul", "31", "1929");



	}

	 /*@AfterMethod
	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}
	 }*/
}