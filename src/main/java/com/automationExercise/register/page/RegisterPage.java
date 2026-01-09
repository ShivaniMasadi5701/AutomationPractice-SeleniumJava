package com.automationExercise.register.page;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automationExercise.base.page.BasePage;

public class RegisterPage extends BasePage {

    WebDriver driver;
 

    // ---------- Page Factory Locators ----------

    @FindBy(css = "a[href='/login']")
    WebElement btnSignUpLogin;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    WebElement lblNewUserSignup;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement txtName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//button[text()='Signup']")
    WebElement btnSignup;

    @FindBy(xpath = "//*[text()='ENTER ACCOUNT INFORMATION']")
    WebElement lblEnterAccInfo;

    @FindBy(xpath = "//label[text()='Mr.']/preceding-sibling::input")
    WebElement radioMr;

    @FindBy(xpath = "//label[text()='Mrs.']/preceding-sibling::input")
    WebElement radioMrs;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(id = "days")
    WebElement dayDropdown;

    @FindBy(id = "months")
    WebElement monthDropdown;

    @FindBy(id = "years")
    WebElement yearDropdown;

    @FindBy(xpath = "//*[text()='Address Information']")
    WebElement lblAddressInfo;

    @FindBy(id = "first_name")
    WebElement txtFirstName;

    @FindBy(id = "last_name")
    WebElement txtLastName;

    @FindBy(id = "address1")
    WebElement txtAddress;

    @FindBy(id = "country")
    WebElement countryDropdown;

    @FindBy(id = "state")
    WebElement txtState;

    @FindBy(id = "city")
    WebElement txtCity;

    @FindBy(id = "zipcode")
    WebElement txtZipcode;

    @FindBy(id = "mobile_number")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//*[text()='Create Account']")
    WebElement btnCreateAccount;

    @FindBy(xpath = "//*[text()='Account Created']")
    WebElement lblAccountCreated;

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement btnContinue;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    WebElement lblLoggedUsername;

    @FindBy(xpath = "//a[text()='Delete Account']")
    WebElement btnDeleteAccount;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement btnLogout;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    WebElement lblAccountDeleted;

    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    WebElement lblEmailAlreadyExist;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement btnHome;

    // ---------- Constructor ----------
    public RegisterPage(WebDriver driver) {
       super(driver);
       
    }

    // ---------- Methods ----------

    public void navigateToHome() {
        driver.get("https://automationexercise.com/");
    }

    public void clickSignUpLogin() {
        btnSignUpLogin.click();
    }

    public boolean isNewUserSignupVisible() {
        return lblNewUserSignup.isDisplayed();
    }

    public void enterName(String name) {
        txtName.sendKeys(name);
    }

    public void enterEmailWithRandom(String email) {
        int random = new Random().nextInt(100000);
        txtEmail.sendKeys(email + random + "@gmail.com");
    }

    public void clickSignupButton() {
        btnSignup.click();
    }

    public boolean isEnterAccountInfoVisible() {
        return lblEnterAccInfo.isDisplayed();
    }

    public void selectTitle(String title) {
        if (title.equalsIgnoreCase("Mr")) {
            radioMr.click();
        } else {
            radioMrs.click();
        }
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        new Select(dayDropdown).selectByValue(day);
        new Select(monthDropdown).selectByVisibleText(month);
        new Select(yearDropdown).selectByValue(year);
    }

    public void enterAddressDetails(String firstName, String lastName, String address,
                                    String country, String state, String city,
                                    String zip, String mobile) {

        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtAddress.sendKeys(address);
        new Select(countryDropdown).selectByVisibleText(country);
        txtState.sendKeys(state);
        txtCity.sendKeys(city);
        txtZipcode.sendKeys(zip);
        txtMobileNumber.sendKeys(mobile);
    }

    public void clickCreateAccount() {
        btnCreateAccount.click();
    }

    public boolean isAccountCreatedVisible() {
        return lblAccountCreated.isDisplayed();
    }

    public void clickContinue() {
        btnContinue.click();
    }

    public String getLoggedInUsername() {
        return lblLoggedUsername.getText();
    }

    public void clickDeleteAccount() {
        btnDeleteAccount.click();
    }

    public boolean isAccountDeletedVisible() {
        return lblAccountDeleted.isDisplayed();
    }

    public void logout() {
        btnLogout.click();
    }

	public boolean getLogoutButton() {
			return btnLogout.isDisplayed();
	}

	public boolean getDeleteAccountButton() {
		// TODO Auto-generated method stub
		return btnDeleteAccount.isDisplayed();
	}
}
