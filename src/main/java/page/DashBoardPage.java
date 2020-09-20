package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {

	WebDriver dr;
	public DashBoardPage() {
		this.dr = dr;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement dashboard;
	
	public void varifyDashboard() {
	
		
	}
}
