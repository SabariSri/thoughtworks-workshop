package com.basic.problems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class TestRegistration {
	public static WebDriver driver;

	public static void main(String[] args) {
		try {
			// Browser Instantiation
			String strLocation = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", strLocation + "/lib/mac_chromedriver_77");
			ChromeOptions opt = new ChromeOptions();
			driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Registration of emails
			driver.get("http://10.134.124.209:4200/");
			WebElement wRegisterBtn = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
			wRegisterBtn.click();

			
			
			driver.close();
			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
