package com.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.workshop.base.PageBase;

public class RegistrationPage extends PageBase {
	
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;

	}

	public void fillTheRegistrationForm(String userName, String pwd) {
		WebElement wUsernameField = driver.findElement(By.xpath("//input[@formcontrolname='firstName'"));
		typeIn(wUsernameField, userName, "First name");
			
		//input[@formcontrolname='lastName']
		//input[@formcontrolname='email']
		//input[@formcontrolname='mobileNumber']
		//input[@formcontrolname='password']
		//input[@formcontrolname='confirmPassword']
	}
}
