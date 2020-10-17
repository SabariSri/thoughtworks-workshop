package com.basic.problems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class TestCartTotal {
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

			// Log into account
			driver.get("http://10.134.124.209:4200/");
			String userName = "srisabari1234@gmail.com";
			String pwd = "123456!";
			WebElement wLoginBtn = driver.findElement(By.xpath("//a[@routerlink='/login']"));
			wLoginBtn.click();
			WebElement wUsernameField = driver.findElement(By.xpath("//input[@value = 'User Name']"));
			wUsernameField.sendKeys(userName);
			WebElement wPwdField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
			wPwdField.sendKeys(pwd);
			WebElement wSignInBtn = driver.findElement(By.xpath("//button[text() = 'Signin']"));
			wSignInBtn.click();
			
			// Adding to cart
			WebElement wHotelSaravana = driver.findElement(By.xpath("//div[text() = 'Saravuana Bhauan ']"));
			wHotelSaravana.click();
			List<WebElement> wItemsGrab = driver
					.findElements(By.xpath("//div//table//tr[2]//td[2]//button[@class='grab']"));
			for (int i = 0; i <= 2; i++) {
				wItemsGrab.get(i).click();
				driver.switchTo().alert().accept();
			}
			
			// Checking the cart 
			WebElement wCartHover = driver.findElement(By.xpath("//span[contains(text(),'Hi')]"));
			wCartHover.click();
			WebElement wCartLink = driver.findElement(By.xpath("//a[@routerlink='/cart']"));
			wCartLink.click();
			WebElement wCartTotal = driver.findElement(By.xpath("//b[text()= 'Total']/../../td[3]"));
			String total = wCartTotal.getText();
			Assert.assertEquals(total, "754");
			System.out.println(total);
			driver.close();
			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
