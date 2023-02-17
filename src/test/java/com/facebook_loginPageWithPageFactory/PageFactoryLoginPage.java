package com.facebook_loginPageWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPage {
	//Constructor instantiate instance properties of a class
	
	WebDriver driver;

	public PageFactoryLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	} 
	///input[@id='email']
	//driver.findElement(By.xpath("input[@id='email']"));
	
	@FindBy(how=How.ID, using="email") private WebElement userName;
	public WebElement getUserName(String enterUserName) {
		userName.sendKeys(enterUserName);
		return userName; 
	}
	
	@FindBy(how=How.ID, using="pass") private WebElement password; 
	public WebElement getPassword(String enterPassword) {
		password.sendKeys(enterPassword);
		return password; 
	}
	
	@FindBy(how=How.NAME, using="login") private WebElement loginButton;
	public WebElement getLoginButton() {
		loginButton.click();
		return loginButton;
	}
	
	public WebElement getLoginPage(String enterUserName, String enterPassword) {
		this.getUserName(enterUserName);
		this.getPassword(enterPassword);
		return this.getLoginButton();		
	}
	
}
