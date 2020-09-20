package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.LogInPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver dr;

	ExcelReader reader = new ExcelReader("C:\\Users\\Palak\\Selenium\\DataDrivenExcel\\data\\ExcelData.xlsx");
	String uName = reader.getCellData("Loginfo", "UserName", 2);
	String pass = reader.getCellData("Loginfo", "Password", 2);

	String FulName = reader.getCellData("AddContactinfo", "FullNmae", 2);
	String compN = reader.getCellData("AddContactinfo", "CompanyName", 2);
	String emailN = reader.getCellData("AddContactinfo", "Email", 2);
	String phone = reader.getCellData("AddContactinfo", "PhoneNumber", 2);
	String add = reader.getCellData("AddContactinfo", "Address", 2);
	String citty = reader.getCellData("AddContactinfo", "City", 2);
	String st = reader.getCellData("AddContactinfo", "State", 2);

	String zip = reader.getCellData("AddContactinfo", "Zip", 2);
	String gr = reader.getCellData("AddContactinfo", "Group", 2);

	@Test
	public void addCustomerlogIn() {

		dr = BrowserFactory.init();

		LogInPage lIP = PageFactory.initElements(dr, LogInPage.class);

		lIP.enterUserName(uName);
		lIP.password(pass);
		lIP.signIn();

		AddCustomerPage addCustomer = PageFactory.initElements(dr, AddCustomerPage.class);

		addCustomer.clickCustomerB();
		addCustomer.clickAddCustomerB();
		addCustomer.addFullName(FulName);
		addCustomer.companyName(compN);
		addCustomer.addEmail(emailN);
		addCustomer.insertPhoneNum(phone);
		addCustomer.insertAddress(add);
		addCustomer.insertCity(citty);
		addCustomer.insertState(st);

		addCustomer.insertZip(zip);
		addCustomer.insertGroup(gr);

		addCustomer.clickOnSave();
		addCustomer.clickOnListCus();
		//addCustomer.varifyNameAndDelete();

		// BrowserFactory.tearDown();

	}

}
