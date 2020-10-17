package com.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.workshop.base.PageBase;

public class CartPage extends PageBase{
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;

	}

	public String getCartTotal() {
		WebElement wCartLink = driver.findElement(By.xpath("//a[@routerlink='/cart']"));
		clickOn(wCartLink, "Cart Tab");
		WebElement wCartTotal = driver.findElement(By.xpath("//b[text()= 'Total']/../../td[3]"));
		String total = getText(wCartTotal, "Cart Total");
		return total;
	}

}