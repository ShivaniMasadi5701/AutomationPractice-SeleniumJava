package com.automationExercise.base.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.automationExercise.login.page.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public LoginPage loginPage;

	public void getBrowserAndWebsite(String browser, String siteURL) {

	    if (browser.equalsIgnoreCase("chrome")) {
	        WebDriverManager.chromedriver().setup();

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        driver = new ChromeDriver(options);

	    } else if (browser.equalsIgnoreCase("edge")) {
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	    }

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	    driver.get(siteURL);
	}


	
}
