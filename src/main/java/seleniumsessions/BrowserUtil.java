package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();

			break;
		case "firefox":
			driver = new FirefoxDriver();

			break;

		case "edge":
			driver = new EdgeDriver();

			break;

		case "safari":
			driver = new SafariDriver();

			break;
		default:

			System.out.println("pass the correct broswer name");

			throw new BrowserException("invalid browser" + browserName);

		}
		return driver;
	}
	
	

	public void lauchUrl(String url) {

		if (url == null) {

			throw new BrowserException("invalid url" + url);
		}

		if (url.isBlank() || url.isEmpty()) {

			throw new BrowserException("url is blank/Empty" + url);
		}

		if (url.indexOf("http") == -1 || url.indexOf("http") > 0) {

			throw new BrowserException("Https is missing " + url);
		}

		driver.get(url.trim());

	}

	public String getTitle() {
		String title =driver.getTitle();
		
		if(title == null) {
			System.out.println("getting the title is null");
			return null;
		}
		return title;

	}

	public String getCurrenturl() {
		return driver.getCurrentUrl();

	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {

		driver.close();
	}

}
