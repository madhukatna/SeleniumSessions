package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();//(8adbc316ce3d0a350437568954b12ac7) (af2977fa5d2d8270f05615bd5c236158)
		
		driver.get("https://www.flipkart.com/");//(8adbc316ce3d0a350437568954b12ac7)(af2977fa5d2d8270f05615bd5c236158)
		
	  System.out.println(driver.getTitle());//(8adbc316ce3d0a350437568954b12ac7) (af2977fa5d2d8270f05615bd5c236158)
		driver.close();//(8adbc316ce3d0a350437568954b12ac7)
		driver.quit(); //(af2977fa5d2d8270f05615bd5c236158)
		
		driver.get("https://www.flipkart.com/");//(8adbc316ce3d0a350437568954b12ac7)//invalid session id (null)
		//nosuchsessionException
		
		

	}

}
