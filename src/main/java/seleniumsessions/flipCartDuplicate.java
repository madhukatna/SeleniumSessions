package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipCartDuplicate {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		By searchArealocator = By.name("q");
		WebElement ele = driver.findElement(searchArealocator);
		
	 ele.sendKeys("mobile");


		By dropdownlistlocator = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		
		Thread.sleep(2000);
		
		//By dropdownlistlocator = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']");
		
		//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']
		
		List<WebElement> elements = driver.findElements(dropdownlistlocator);
		
		
		System.out.println(elements.size());
		
		
		

		

	}

}
