package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class BrowserUtil2 {

	WebDriver driver;
	
	public WebDriver launchBrowser(String browser){
	
	switch (browser) {
	case "chrome":
		
		driver= new ChromeDriver();
		
		break;

	default:
		
		System.out.println("pass the correct browser");
		break;
	}
	

	
	return driver;
	
}

} 


class ReadProperty1  {
	
	private Properties prop;
	
	public Properties InitProp() {
		
		try {
			FileInputStream file = new FileInputStream("./src/main/java/Configuration/configuration.properties");
		prop = new Properties();
		
		prop.load(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
		
	}
	
}

public class Practice {

	public static void main(String[] args) {
	
		ReadProperty1 rp = new ReadProperty1();
		
		Properties pro = rp.InitProp();
		
		pro.getProperty("browser");
		pro.getProperty("url");
		
		
		
	}

}
