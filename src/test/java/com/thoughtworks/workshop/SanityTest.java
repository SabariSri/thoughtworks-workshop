package com.thoughtworks.workshop;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.workshop.base.TestBase;
import com.workshop.base.PageBase;
import com.workshop.pages.CartPage;
import com.workshop.pages.HomePage;
import com.workshop.pages.ItemsGridWallPage;
import com.workshop.pages.LoginPage;

public class SanityTest extends TestBase {
//	System.out.println(driver);
	HomePage homePage;
	LoginPage loginPage;
	ItemsGridWallPage itemsPage;
	CartPage cartPage;
	PageBase utils = new PageBase();
	
	String userName = "srisabari1234@gmail.com";
	String pwd = "123456!";
	
	@Test
	public void testCart() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		itemsPage = new ItemsGridWallPage(driver);
		cartPage = new CartPage(driver);
		
		//Test steps
		driver.get("http://10.134.124.209:4200/");
		homePage.goToLoginScreen();
		loginPage.signIntoAccount(userName, pwd);
		homePage.selectRestaurant("Saravuana Bhauan ");
		itemsPage.selectGivenFoodItems(3);
		homePage.openLeftMenuPanel();
		String cartTotal = cartPage.getCartTotal();
		String expCartTotal = "754";
		System.out.println("Expected cart total is " + expCartTotal);
		Assert.assertEquals(cartTotal, expCartTotal);	
	}

	@Test
	public void testRegistration() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		itemsPage = new ItemsGridWallPage(driver);
		cartPage = new CartPage(driver);	
		driver.get("http://10.134.124.209:4200/");
		homePage.goToRegistrationScreen();
	
	}
	
}
