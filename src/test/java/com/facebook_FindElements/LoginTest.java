package com.facebook_FindElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver; 
	
	@BeforeTest
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	
	@Test
	public void validLoginTest() {
		
	}
	
	public void invalidLoginTest() {
		System.out.println("this is invalid login test");
	}
}
