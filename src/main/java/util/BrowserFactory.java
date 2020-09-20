package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
static WebDriver dr;
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Palak\\Selenium\\Session7\\driver\\chromedriver.exe");
		dr = new ChromeDriver();
		
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.get("https://www.techfios.com/ibilling/?ng=login/");
		return dr;
		
	}
	
	public static void tearDown() {
		dr.close();
		dr.quit();
	}

}
