package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	private Properties prop;
	public Properties initProp() {
		
		
		try {
			FileInputStream ip = new FileInputStream("./src/main/java/Configuration/configuration.properties");
		
		
		 prop = new Properties();
		
		prop.load(ip);
		
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
