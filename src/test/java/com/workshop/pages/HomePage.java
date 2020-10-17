package com.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.workshop.base.PageBase;

public class HomePage extends PageBase {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public void goToLoginScreen() {
		WebElement wLoginBtn = driver.findElement(By.xpath("//a[@routerlink='/login']"));
		clickOn(wLoginBtn, "Login Tab");
	}
	
	public void goToRegistrationScreen() {
		WebElement wRegisterBtn = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		clickOn(wRegisterBtn, "Registration Tab");
	}
	
	public void selectRestaurant(String hotel) {
		WebElement wHotelSaravana = driver.findElement(By.xpath("//div[text() = '" + hotel + "']"));
		clickOn(wHotelSaravana, hotel);
	}
	
	public void openLeftMenuPanel() {
	WebElement wCartHover = driver.findElement(By.xpath("//span[contains(text(),'Hi')]"));
	clickOn(wCartHover, "Right Menu Pannel");
	}
	
}
