package seleniumsessions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	//static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.google.com/");	
//		
//		driver.getTitle();
//		
//		
//		driver.quit();
//		
//		driver.get("https://www.google.com/");

		//BrowserUtil1 bu1 = new BrowserUtil1();
		
		ReadProperty propReader = new ReadProperty();
		
		Properties prop = propReader.initProp();
		
		
		

		BrowserUtil bu = new BrowserUtil();

		bu.launchBrowser(prop.getProperty("browser"));

	bu.lauchUrl(prop.getProperty("url"));
		
		


		String currentUrl = bu.getCurrenturl();

		System.out.println("page title    "+bu.getTitle());
		System.out.println("current url    "+currentUrl);
		
		bu.closeBrowser();

	}

}
