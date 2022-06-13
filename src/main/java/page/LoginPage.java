package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	//create a constuctor to pass the same driver from LoginTest
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element list    //by class
//	WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//	By USER_NAME_FIELD = By.xpath("//*[@id=\"username\"]");
//	
//	But for pom we need to use @FindBy
//	@FindBy(how= How.XPATH, using="Put x path here") WebElement USER_NAME_Element;
	
	@FindBy(how= How.XPATH,using="//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how= How.XPATH, using= "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how= How.XPATH, using= "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	
	//Intractable Methods
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSigninButton() {
	   SIGNIN_ELEMENT.click();
	}
	
	//OR can do all these functions in one method
//	public void performLogin(String userName, String password) {
//		USER_NAME_ELEMENT.sendKeys(userName);
//		USER_NAME_ELEMENT.sendKeys(password);
//		SIGNIN_ELEMENT.click();
//		
//	}

}
