package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
	
	
WebDriver dr;
	
	public LogInPage(WebDriver driver) {
	
		this.dr = dr;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement userName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement passWord;
	@FindBy(how = How.NAME, using = "login")
	WebElement logIn;

	public void enterUserName(String uName) {

		userName.sendKeys(uName);
	}

	public void password(String pass) {

		passWord.sendKeys(pass);
	}

	public void signIn() {

		logIn.click();
	}


}
