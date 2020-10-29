package com.qa.hubspot.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.hubspot.Pages.ContactsPage;
import com.qa.hubspot.Pages.HomePage;
import com.qa.hubspot.Pages.LoginPage;

public class BaseTest {

	WebDriver driver;
	protected Properties prop;
	protected BasePage basePage;
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected ContactsPage contactsPage;

	@Parameters({ "browser" })
	@BeforeTest
	public void setUp(String browserName) {
		basePage = new BasePage();
		prop = basePage.init_prop();
		prop.setProperty("browser", browserName);
		driver = basePage.init_driver(prop);
		loginPage = new LoginPage(driver);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
