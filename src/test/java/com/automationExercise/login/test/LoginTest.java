package com.automationExercise.login.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationExercise.base.test.BaseTest;
import com.automationExercise.login.page.LoginPage;


public class LoginTest extends BaseTest {

	@BeforeClass
	@Parameters({ "browser","siteURL"})
	public void initBrowserAndWebsite(String browser, String siteURL) {
		getBrowserAndWebsite(browser, siteURL);
		loginPage=new LoginPage(driver);	
	
	}

	@Test(priority=1)
	public void verifyValidLogin() {
		
		String username=System.getenv("AUTOMATION_EMAIL");
		String password=System.getenv("AUTOMATION_PASSWORD");
		
		System.out.println("USERNAME"+ username);
		System.out.println("PASSWORD"+ password);
		
		loginPage.clickOnSignUpLoginButton();
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLoginButton();		
		
	}
	}
