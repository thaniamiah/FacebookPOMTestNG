package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPage;

public class LoginTest {
//public WebDriver driver;

@Test
public void validLoginTest() {
	LoginPage lp= new LoginPage();
	lp.openApp();
	lp.userName();
	lp.getPassword();
	lp.getLoginButton();
	
	
}

@Test
public void validLoginTest1() {
	LoginPage lp= new LoginPage();
	lp.openApp();
	lp.userName();
	lp.getPassword();
	lp.getLoginButton();
}

}
