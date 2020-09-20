package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static void waitForElement (WebDriver dr, int timeInSeconds, By locator) {
		
		WebDriverWait wait =new WebDriverWait(dr,timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static int randomNumber() {

		Random rnd = new Random();
		int randomNum = rnd.nextInt(999);
		return randomNum;
	}
	
	public static void dropDown(WebElement locator, String visibleText) {
		Select sel  = new Select(locator);
		sel.selectByVisibleText(visibleText);
		
	}
	

}
