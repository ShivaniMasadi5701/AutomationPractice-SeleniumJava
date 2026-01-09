package com.automationExercise.register.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.automationExercise.base.test.BaseTest;
import com.automationExercise.register.page.RegisterPage;

public class RegisterTest extends BaseTest {

	@BeforeClass
	@Parameters({ "browser,siteURL" })
	public void initBrowserAndWebsite(String browser, String siteURL) {
		getBrowserAndWebsite(browser, siteURL);
		registerPage = new RegisterPage(driver);
	}

	public void verifyValidRegister() {

		registerPage.clickSignUpLogin();
		registerPage.enterName("Shivani");
		registerPage.enterEmailWithRandom("Shivani");
		registerPage.clickSignupButton();
		// 🔹 Verify Enter Account Information
		Assert.assertTrue(registerPage.isEnterAccountInfoVisible());

		registerPage.selectTitle("Mrs");
		// 🔹 Enter Password
		registerPage.enterPassword("Shivani@5701");

		// 🔹 Select DOB
		registerPage.selectDateOfBirth("05", "07", "2002"); // 🔹 Address Information
		registerPage.enterAddressDetails("Shivani", "Masadi", "Boyapalli", "India", "Telangana", "Mancherial", "507251",
				"9632587410");
		// 🔹 Create Account
		registerPage.clickCreateAccount();

		Assert.assertTrue(registerPage.isAccountCreatedVisible());

		registerPage.clickContinue();

		String username = registerPage.getLoggedInUsername();
		System.out.println(username);

		Assert.assertTrue(registerPage.getLogoutButton());
		Assert.assertTrue(registerPage.getDeleteAccountButton());
		// 🔹 Delete Account
		registerPage.clickDeleteAccount();

	}
}
