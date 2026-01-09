package com.automationExercise.base.test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.automationExercise.register.page.RegisterPage;

public class BaseTest {
	
	public WebDriver driver;
	public RegisterPage registerPage;
	
	public void getBrowserAndWebsite(String browser, String siteURL) { 
	    switch (browser.toLowerCase()) {
	        case "chrome":   
	            driver = new ChromeDriver();
	            break;
	        case "edge":
	            driver=new EdgeDriver();
	            break;
	        default:
	            throw new IllegalArgumentException("Invalid browser name: " + browser);
	    }
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(siteURL);
	    }
}
