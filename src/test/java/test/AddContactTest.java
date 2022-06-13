package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {

	WebDriver driver;
    
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");

		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenuButton();

		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.validateAddContactPage("Add Contact");
		addContactPage.insertFullName(999, "Jane Doe");
		addContactPage.selectCompany("Techfios");
		addContactPage.insertEmail(999,"JaneDoe@Techfios.com");
		addContactPage.insertPhone(999);
		addContactPage.insertAddress(999, "Belt Line Road");
		addContactPage.insertCity("Irving");
		addContactPage.insertState("Texas");
		addContactPage.insertZipCode(222);
		addContactPage.selectCountry("United States");
		addContactPage.selectTags("IT Training");
		addContactPage.selectCurrency("USD");
		addContactPage.selectGroup("Selenium");
		addContactPage.insertFormPassword("abcd1234");
		addContactPage.insertConfirmFormPassword("abcd1234");
		addContactPage.clickWelcomeEmail();
		addContactPage.clickSaveButton();
		
//		addContactPage.clickListCustomersMenu();
		

	}
}
