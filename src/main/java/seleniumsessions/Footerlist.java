package seleniumsessions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footerlist {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		//By footerlocator = By.name("q");

		By footertaglocator = By.xpath("//div[@class='col-sm-3']//a");

		footerSizeandText(footertaglocator,"Specials");

	}

	public static WebElement getElement(By locator) {
		try {
			WebElement ele = driver.findElement(locator);
			return ele;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}
	public static String doGetText(By locator) {

		String text = driver.findElement(locator).getText();
		return text;
	}

	public static void footerSizeandText (By footertaglocator, String value) {

	

		List<WebElement> list = getElements(footertaglocator);

		System.out.println(list.size());
		
	

		for (WebElement e : list) {

			String listText = e.getText();
			System.out.println(listText);

			if (listText.equals(value)) {

				e.click();

				break;

			}

		}
	}
}

