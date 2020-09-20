package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LogInPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LogInTest {
	
	
	WebDriver dr;
	
	ExcelReader reader = new ExcelReader("C:\\Users\\Palak\\Selenium\\DataDrivenExcel\\data\\ExcelData.xlsx");
	String uName = reader.getCellData("Loginfo", "UserName", 2);
	String pass = reader.getCellData("Loginfo", "Password", 2);
	
	@Test
	public void logIn() {
		
		dr=BrowserFactory.init();
		
		 LogInPage lIP = PageFactory.initElements(dr, LogInPage.class);
		
		 lIP.enterUserName(uName);
		 lIP.password(pass);
		 lIP.signIn();
		 
		 BrowserFactory.tearDown();
		
	}

}
