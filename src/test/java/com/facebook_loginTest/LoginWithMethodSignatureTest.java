package com.facebook_loginTest;

import org.testng.annotations.Test;

import com.facebook_loginPage.LoginPageMethodSignature;

public class LoginWithMethodSignatureTest {

	@Test
	public void positiveLoginTest() {
		LoginPageMethodSignature lpms= new LoginPageMethodSignature();
	lpms.openApp();
	lpms.userName("ta1");
	lpms.getPassword("uyj");
	lpms.getLoginButton();
	}
	
	@Test
	public void positiveLoginTest1() {
		LoginPageMethodSignature lpms= new LoginPageMethodSignature();
	lpms.openApp();
	lpms.userName("S1");
	lpms.getPassword("dfg");
	lpms.getLoginButton();
	}
}
