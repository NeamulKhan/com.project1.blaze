package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Blaze {
	
	public static Properties blaze_prop;
	
	public static WebDriver driver;
	
	public Base_Blaze(){
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\project1\\blaze\\config\\com.blaze.Properties " );
			
			blaze_prop = new Properties();
			
			blaze_prop.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void blazebrowserinit() {
		
		String blazebrowser = blaze_prop.getProperty("Browser1");
		
		if (blazebrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Test_Data.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Test_Data.pageLoadwait));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
						
		}
		
		else if (blazebrowser.equalsIgnoreCase("FireFox")) {
			
		}
		
	}
	
	public void launchURL(String URL) {
		
		driver.get(blaze_prop.getProperty("URL"));
		
	}
	}


