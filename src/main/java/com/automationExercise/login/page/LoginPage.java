package com.automationExercise.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationExercise.base.page.BasePage;

public class LoginPage extends BasePage {

	public WebDriver driver;

	@FindBy(css = "a[href='/login']")
	WebElement btnSignUpLogin;

	@FindBy(xpath = "//h2[text()='Login to your account']//parent::div//input[@placeholder='Email Address']")
	WebElement txtUserName;

	@FindBy(xpath = "//h2[text()='Login to your account']//parent::div//input[@placeholder='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//h2[text()='Login to your account']//parent::div//button")
	WebElement btnLogin;
	
	@FindBy(css="a[href='/logout']")
	WebElement btnLogout;

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// ---------- Methods ----------

	public void clickOnSignUpLoginButton() {
		btnSignUpLogin.click();
	}
	
	public void enterUsername(String strUsername) {
		txtUserName.sendKeys(strUsername);
	}
	
	public void enterPassword(String strPassword) {
		txtPassword.sendKeys(strPassword);
	}
	
	public void clickOnLoginButton() {
		btnLogin.click();
	}
	
	public boolean getLogoutButton() {
		return btnLogout.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
}
