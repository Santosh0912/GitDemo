package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getdriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\Config\\Global.properties");
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		return driver;		
	}
}
