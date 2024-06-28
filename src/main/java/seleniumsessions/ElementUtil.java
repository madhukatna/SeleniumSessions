package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		try {
			WebElement ele = driver.findElement(locator);
			return ele;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doclick(By locator) {

		driver.findElement(locator).click();

	}

	private void nullCheck(String value) {
		if (value == null) {

			throw new ElementException("null value" + value);

		}

	}

	public void doSendKeys(By locator, String value) {

		nullCheck(value);

		getElement(locator).sendKeys(value);

	}

	public String doGetText(By locator) {

		String text = driver.findElement(locator).getText();
		return text;
	}

	public String doGetAttribute(By locator, String getElem) {

		return getElement(locator).getAttribute(getElem);

	}

	public List<String> getElementsTextLink(By locator) {

		List<WebElement> linkList = driver.findElements(locator);

		List<String> eleListText = new ArrayList<String>();

		for (WebElement e : linkList) {

			String text = e.getText();
			if (text.length() != 0) {
				eleListText.add(text);
				// System.out.println(text);
			}

		}

		return eleListText;

	}

	// _____________XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX______________
	// Select class

	public void SelectByIndex(By locator, int value) {

		Select select_list = new Select(getElement(locator));
		select_list.selectByIndex(value);

	}

	public void SelectByVisibleText(By locator, String name) {

		Select select_byText = new Select(getElement(locator));
		select_byText.selectByVisibleText(name);

	}

	public void SelectByValue(By locator, String name) {

		Select select_byvalue = new Select(getElement(locator));
		select_byvalue.selectByValue(name);

	}

	public int doOptionsListCount(By locator) {

		Select optionlist = new Select(getElement(locator));
		List<WebElement> optionsList = optionlist.getOptions();

		int count = optionsList.size();

		return count;

	}

	public void doclickoptionlistwithoutselectmethods(By locator, String optionText) {

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

	public void doClickWithoutSelectClass(By locator, String optionText) {

		List<WebElement> elements = getElements(locator);

		for (WebElement e : elements) {

			String text = e.getText();

			if (text.equals(optionText)) {

				e.click();

				break;
			}

		}

	}

	public void deSelectByIndex(By locator, int value) {

		Select select_list = new Select(getElement(locator));
		select_list.deselectByIndex(value);

	}

	public void deSelectByVisibleText(By locator, String name) {

		Select select_byText = new Select(getElement(locator));
		select_byText.deselectByVisibleText(name);

	}

	public void deSelectByValue(By locator, String name) {

		Select select_byvalue = new Select(getElement(locator));
		select_byvalue.deselectByValue(name);

	}

	public void doSearchEngine(By searchArealocator, String searchAreaValue, By searchDropdownLocator,
			String selectValueDropList) throws InterruptedException {

		doSendKeys(searchArealocator, searchAreaValue);

		Thread.sleep(5000);

		List<WebElement> list = getElements(searchDropdownLocator);

		System.out.println(list.size());

		for (WebElement e : list) {

			String listText = e.getText();
			System.out.println(listText);

			if (listText.equals(selectValueDropList)) {

				e.click();

				break;

			}

		}
	}
	public   void MovetoElementParentandSubClass(By locator, String value) {
		
		Actions act = new Actions(driver);
			
			act.moveToElement(getElement(locator)).perform();
			
			//getElement(locator).click();
			
			doclick(locator);

	}
	
	public   void MovetoElementParentandSubClass(By locator, By locator1) {
		
		Actions act = new Actions(driver);
			
			act.moveToElement(getElement(locator)).perform();
			
			//getElement(locator1).click();
			doclick(locator1);

	}
	
	
	public  void draganddrop(By sourceLocator, By targetLocator) {
		 Actions act = new Actions(driver);
		
		 act.dragAndDrop(getElement(sourceLocator), getElement(targetLocator)).perform();
		
	}

}
