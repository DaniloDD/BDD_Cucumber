package com.tutorialsninja.qa.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void initializeWebDriver(String browserName) {
		switch(browserName) {
		case "Chrome": 
			options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			break;
		
		case "Safari":
			driver = new SafariDriver();
			driver.manage().window().maximize();
			break;
		
		case "Firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		
		case "Edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		
		default: System.out.println("Invalid browser name");
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
