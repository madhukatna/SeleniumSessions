package seleniumsessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		By de_xpath = By.xpath("//*[@id=\"post-291\"]/div/div[2]/select");
		
		Select select = new Select(driver.findElement(de_xpath));
		
		System.out.println(doMultipleSelect(de_xpath));
		
		if(doMultipleSelect(de_xpath)) {
			
			
			
			
			select.selectByIndex(1);
			select.selectByIndex(3);
			select.selectByIndex(4);
			select.selectByVisibleText("Chilean flamingo");
			
		}
		
		//select.deselectByVisibleText("Chilean flamingo");
		
		deSelectByIndex(de_xpath, 1);
		deSelectByVisibleText(de_xpath, "Chilean flamingo");
		


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
	
	
	public static void deSelectByIndex(By locator, int value) {

		Select select_list = new Select(getElement(locator));
		select_list.deselectByIndex(value);

	}

	public static void deSelectByVisibleText(By locator, String name) {

		Select select_byText = new Select(getElement(locator));
		select_byText.deselectByVisibleText(name);

	}

	public static void deSelectByValue(By locator, String name) {

		Select select_byvalue = new Select(getElement(locator));
		select_byvalue.deselectByValue(name);

	}
	
	public static boolean doMultipleSelect(By locator) {
		
		Select selectmul = new Select(getElement(locator));
		
		boolean value = selectmul.isMultiple();
		
		return value;
		
		
	}
	

}
