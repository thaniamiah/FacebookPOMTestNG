package com.facebook_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
public WebDriver driver;


public void openApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}

public WebElement userName() {
	driver.findElement(By.id("email")).sendKeys("treyu");
	return null;
	
}


public WebElement getPassword() {
	driver.findElement(By.id("pass")).sendKeys("ta1");
	return null;
	
}

public WebElement getLoginButton() {
	driver.findElement(By.name("login")).click();
	return null;
	
}


	
}
