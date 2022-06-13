package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage {


	WebDriver driver;
	
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")WebElement ZIP_CODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='tags']")WebElement TAGS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"currency\"]")WebElement CURRENCY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")WebElement GROUP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")WebElement FORM_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cpassword\"]")WebElement CONFIRM_FORM_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[2]/div[5]/div/div/div/label[1]")WebElement WELCOME_EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")WebElement SAVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")WebElement LIST_CUSTOMERS_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id'foo_filter']")WebElement SEARCH_CONTACT_ELEMENT;
	
	
	
	
	public void validateAddContactPage(String addContact) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(),addContact, "Wrong Page!!");
	}
	public void insertFullName(int boundryNo, String fullName) {
		FULL_NAME_ELEMENT.sendKeys(generateRandomNo(boundryNo)+fullName);
	}
	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company);
	}
	public void insertEmail(int boundryNo, String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(boundryNo)+ email);
	}
	public void insertPhone(int boundryNo) {
		PHONE_ELEMENT.sendKeys(generateRandomNo(boundryNo)+ "1234567");
	}
	public void insertAddress(int boundryNo, String address) {
		ADDRESS_ELEMENT.sendKeys(generateRandomNo(boundryNo)+ address);
	}
	public void insertCity(String cityName) {
		CITY_ELEMENT.sendKeys(cityName);
	}
	public void insertState(String state) {
        STATE_ELEMENT.sendKeys(state);		
	}
	public void insertZipCode(int boundryNo) {
        ZIP_CODE_ELEMENT.sendKeys(generateRandomNo(boundryNo) + "34");		
	}
	public void selectCountry(String country) {
		selectFromDropdown(COUNTRY_ELEMENT, country);
	}
	public void selectTags(String tag) {
		selectFromDropdown(TAGS_ELEMENT, tag);
	}
	public void selectCurrency(String currency) {
		selectFromDropdown(CURRENCY_ELEMENT, currency);		
	}
	public void selectGroup(String group) {
		selectFromDropdown(GROUP_ELEMENT, group);			
	}
	public void insertFormPassword(String formPassword) {
        FORM_PASSWORD_ELEMENT.sendKeys(formPassword);		
	}
	public void insertConfirmFormPassword(String confirmFormPassword) {
		CONFIRM_FORM_PASSWORD_ELEMENT.sendKeys(confirmFormPassword);	
	}
	public void clickWelcomeEmail() {
        Actions action = new Actions(driver);
		action.doubleClick(WELCOME_EMAIL_ELEMENT).build().perform();		
	}
	public void clickSaveButton() {
        SAVE_BUTTON_ELEMENT.click();		
	}
	public void clickListCustomersMenu() {
		LIST_CUSTOMERS_MENU_ELEMENT.click();
	}
	public void insertSearchContact() {
		SEARCH_CONTACT_ELEMENT.sendKeys(null);
	}
	
	
}

