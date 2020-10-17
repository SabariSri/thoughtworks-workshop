package com.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.workshop.base.PageBase;

public class LoginPage extends PageBase {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void signIntoAccount(String userName, String pwd) {
		WebElement wUsernameField = driver.findElement(By.xpath("//input[@value = 'User Name']"));
		typeIn(wUsernameField, userName, "Username Field");
		WebElement wPwdField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		typeIn(wPwdField, pwd, "Password Field");
		WebElement wSignInBtn = driver.findElement(By.xpath("//button[text() = 'Signin']"));
		clickOn(wSignInBtn, "Sign-in Button");
	}
}
