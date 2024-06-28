package seleniumsessions;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEngine {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By searchArealocator = By.name("q");
		
		By dropdownlistlocator = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		
		//doSendKeys(searchArealocator, "tamil");
		doSearchEngine(searchArealocator,"telugu",dropdownlistlocator, "telugu language");
	    
		

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
	
	public static void doSearchEngine(By searchArealocator, String searchAreaValue, By searchDropdownLocator, String selectValueDropList) throws InterruptedException  {
		
		doSendKeys(searchArealocator, searchAreaValue);
		
		Thread.sleep(5000);
		
		List<WebElement> list = getElements(searchDropdownLocator);
		
		System.out.println(list.size());
		
		
		
		
		for(WebElement e: list) {
			
			String listText = e.getText();
			System.out.println(listText);
		
		if(listText.equals(selectValueDropList)) {
			
			e.click();
			
			break;
			
			
			
		}
		
	}
	}
}
