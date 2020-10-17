package com.workshop.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver;

	@BeforeMethod
	public void testMethodSetup() throws InterruptedException {
		String strLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", strLocation + "/lib/mac_chromedriver_77");
		ChromeOptions opt = new ChromeOptions();
		driver = new ChromeDriver(opt);
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void testMethodCleanup() {
		driver.close();
		driver.quit();
	}
}
