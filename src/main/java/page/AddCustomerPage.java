package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver dr;

	public AddCustomerPage(WebDriver driver) {

		this.dr = dr;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement customer;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement addCustomer;

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement fullName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement company;

	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement phoneNumber;

	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement address;

	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement state;

	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement zip;

	@FindBy(how = How.XPATH, using = "//*[@id=\"group\"]")
	WebElement group;

	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement save;

//	@FindBy(how = How.XPATH, using = "//*[@id=\"summary\"]")
//	WebElement summary;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement listCustomer;

	public void clickCustomerB() {

		customer.click();
	}

	public void clickAddCustomerB() {

		addCustomer.click();
	}

	String enterName;

	public void addFullName(String FulName) {
		String enterName = FulName + BasePage.randomNumber();

		fullName.sendKeys(enterName);
	}

	public void companyName(String compN) {

		BasePage.dropDown(company, compN);

	}

	public void addEmail(String emailN) {

		String enteremail = BasePage.randomNumber() + emailN;
		email.sendKeys(enteremail);

	}

	public void insertPhoneNum(String phone) {

		String enterPhoneNum = BasePage.randomNumber() + phone;
		phoneNumber.sendKeys(enterPhoneNum);

	}

	public void insertAddress(String add) {
		address.sendKeys(add);

	}

	public void insertCity(String citty) {
		city.sendKeys(citty);

	}

	public void insertState(String st) {
		state.sendKeys(st);

	}

	public void insertZip(String Zip) {
		zip.sendKeys(Zip);

	}

	public void insertGroup(String gr) {
		BasePage.dropDown(group, gr);

	}

	public void clickOnSave() {
		save.click();
//		//BasePage.waitForElement(dr, 3, By.xpath("//*[@id=\"summary\"]"));

	}

	public void clickOnListCus() {
		listCustomer.click();

	}

//	public void varifyNameAndDelete(){
//		
//		String firstXpath = "//tbody/tr[";
//		String secondXpath ="]/td[3]";
//		
//		for(int i=1; i<=5; i++) {
//			
//			String name = dr.findElement(By.xpath(firstXpath + i +secondXpath)).getText();
//			System.out.println(name);
//			
//			if(name.contains(enterName)) {
//				
//				System.out.println("Don't match");
//				
//				dr.findElement(By.xpath("//tbody/tr["+ i +"]/td[3]/following-sibling::td[4]/a[2]")).click();
//				
//				BasePage.waitForElement(dr, 2, By.xpath("/html/body/div[1]/div/div/div[2]/button[2]"));
//				dr.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click();
//			}
//		}
//	}

}
