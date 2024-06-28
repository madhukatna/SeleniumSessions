package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/contact-sales");

		By countrylist = By.id("Form_getForm_Country");

		Select select_countrylist = new Select(driver.findElement(countrylist));

//	    select_countrylist.selectByIndex(1);
//	    
//	    select_countrylist.selectByValue("Algeria");
//	    
//	    select_countrylist.selectByVisibleText("India");

//		SelectByIndex(countrylist , 2);
//		SelectByVisibleText(countrylist , "India");
//		SelectByVisibleText(countrylist, "Pakistan");

//		List<WebElement> optionsList = select_countrylist.getOptions();
//
//		System.out.println(optionsList.size());
//
//		// System.out.println(doOptionsListCount(countrylist));
//
//		for (WebElement e : optionsList) {
//
//			String text = e.getText();
//			System.out.println(text);
//		}

		//System.out.println(doOptionsListText(countrylist));
		
		//doclickoptionlistwithoutselectmethods(countrylist, "India");
		
		
		By optionlistelements = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		doClickWithoutSelectClass(optionlistelements, "Afghanistan");
		
//		List<WebElement> elements =driver.findElements(optionlistelements);
//		
//		
//		for(WebElement e: elements) {
//			
//			String text =e.getText();
//			
//			if(text.equals("Afghanistan")) {
//				
//				
//				e.click();
//				
//				break;
//			}
//			
//		}
//		
//		
//		
		

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

	public static void SelectByIndex(By locator, int value) {

		Select select_list = new Select(getElement(locator));
		select_list.selectByIndex(value);

	}

	public static void SelectByVisibleText(By locator, String name) {

		Select select_byText = new Select(getElement(locator));
		select_byText.selectByVisibleText(name);

	}

	public static void SelectByValue(By locator, String name) {

		Select select_byvalue = new Select(getElement(locator));
		select_byvalue.selectByValue(name);

	}

	public static int doOptionsListCount(By locator) {

		Select optionlist = new Select(getElement(locator));
		List<WebElement> optionsList = optionlist.getOptions();

		int count = optionsList.size();

		return count;

	}

	public static List<String> doOptionsListText(By locator) {

		Select optionlist = new Select(getElement(locator));

		List<WebElement> optionsList = optionlist.getOptions();

		List<String> optionsListText = new ArrayList<String>();

		for (WebElement e : optionsList) {

			String text = e.getText();
			optionsListText.add(text);
		}
		return optionsListText;

	}

	public static void doclickoptionlistwithoutselectmethods(By locator, String optionText) {

		Select optionlist = new Select(getElement(locator));

		List<WebElement> optionsList = optionlist.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {

			String text = optionsList.get(i).getText();

			if (text.equals(optionText.trim())) {

				optionsList.get(i).click();

				break;
			}

		}

	}
	
	public static void doClickWithoutSelectClass(By locator, String optionText) {
		

		List<WebElement> elements =driver.findElements(locator);
		
		
		for(WebElement e: elements) {
			
			String text =e.getText();
			
			if(text.equals(optionText)) {
				
				
				e.click();
				
				break;
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
