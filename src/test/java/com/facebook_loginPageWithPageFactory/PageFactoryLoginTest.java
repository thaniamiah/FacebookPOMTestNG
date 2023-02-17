package com.facebook_loginPageWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryLoginTest {
	WebDriver driver;
	private PageFactoryLoginPage plp;
	
	@BeforeMethod
	public void openApp() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test 
	public void validUserNameTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getUserName("Thania123");
		plp.getPassword("123");
		plp.getLoginButton();
	}
	
	@Test 
	public void validPasswordTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getUserName("Thania123");
		plp.getPassword("123");
		plp.getLoginButton();
	}
	
	@Test
	public void doLoginTest() {
		plp = new PageFactoryLoginPage(driver);
		plp.getLoginPage("abc", "123");
		
	}
	@AfterMethod
	public void closeApp() {
		if(driver != null) {
			driver.quit();
		}
			
		
	}
}
