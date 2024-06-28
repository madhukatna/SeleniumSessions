package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBasics {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil bro = new BrowserUtil();
		ReadProperty rp = new ReadProperty();
		Properties prop = rp.initProp();

		WebDriver driver = bro.launchBrowser(prop.getProperty("browser"));
		bro.lauchUrl(prop.getProperty("url"));

//		ElementUtil ele = new ElementUtil(driver);
//
//		By usr = By.id("input-email");
//
//		By pass = By.id("input-password");
//		
//		
//		
//		By forgetpass = By.linkText("Forgotten Password");
//		
//		//By getText = By.tagName("h2");
//
//		ele.doSendKeys(usr, "madhu");
//		ele.doSendKeys(pass, "dinesh");
//		
//		ele.doclick(forgetpass);

		// String h =ele.doGetText(getText);

		// System.out.println(h);

		List<WebElement> imgList = driver.findElements(By.tagName("img"));

		System.out.println(imgList.size());

		

		for (WebElement e : imgList) {

			String text = e.getAttribute("src");
		

				System.out.println(text);
			}

		}

	


	
}
