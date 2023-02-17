package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPageWithVariables;

public class LoginPageWithVariablesTest {
	@Test 
	public void boundaryLoginTest() {
		LoginPageWithVariables lpv = new LoginPageWithVariables();
		lpv.openApp();
		lpv.getUserName("Thania"); 
		lpv.getPassword("pass");
		lpv.getLoginButton();
	}

}
