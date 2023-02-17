package com.facebook_loginTestWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook_loginPageWithPageFactory.PageFactoryLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryLoginTest {
	WebDriver driver;
	@BeforeTest 
	public void openApp() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test 
	public void validUserNameTest() {
		PageFactoryLoginPage pageFactoryLoginPage= new PageFactoryLoginPage(driver);
		pageFactoryLoginPage.getUserName("uouiou");
		pageFactoryLoginPage.getPassword("");
		pageFactoryLoginPage.getLoginButton();
	}
	
	
}

