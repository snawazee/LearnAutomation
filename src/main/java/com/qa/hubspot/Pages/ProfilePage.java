  
package com.qa.hubspot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.Base.BasePage;

public class ProfilePage extends BasePage {

	WebDriver driver;

	By deals = By.id("profile");

	public ProfilePage(WebDriver driver) {
		System.out.println("profile page");
		driver = this.driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
