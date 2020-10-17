package com.workshop.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.workshop.base.PageBase;

public class ItemsGridWallPage extends PageBase {
	WebDriver driver;

	public ItemsGridWallPage(WebDriver driver) {
		this.driver = driver;

	}

	public void selectGivenFoodItems(int itemsCount) {
		List<WebElement> wItemsGrab = driver
				.findElements(By.xpath("//div//table//tr[2]//td[2]//button[@class='grab']"));
		for (int i = 0; i < itemsCount; i++) {
			clickOn(wItemsGrab.get(i), "+ of " + i+1 + "st Product");
			driver.switchTo().alert().accept();
		}
	}

}
