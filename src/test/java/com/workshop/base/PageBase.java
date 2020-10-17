package com.workshop.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
	
	WebDriver driver;
	
	public void launchUrl(String url) {
		try {
			driver.get(url);
			System.out.println("Url launched :: " + url);
		} catch (Exception e) {
			System.out.println("Unable to launch url :: "  + e.toString());
		}
	}

	public void typeIn(WebElement element, String value, String refKey) {
		try {
			element.sendKeys(value);
			System.out.println("Typed " + value + " in " + refKey);
		} catch (Exception e) {
			System.out.println("Unable to type the given value in :: "  + e.toString());
		}
	}
	
	public void clickOn(WebElement element, String refKey) {
		try {
			element.click();
			System.out.println("Clicked on " + refKey);
		} catch (Exception e) {
			System.out.println("Unable to click on :: " + e.toString());
			System.out.println("");
		}
	}

	public String getText(WebElement element, String refKey) {
		try {
			String text = element.getText();
			System.out.println("Text of " + refKey + " is " + text);
			return text;
		} catch (Exception e) {
			System.out.println("Unable to getText of :: " + e.toString());
			return null;
		}
	}

}
