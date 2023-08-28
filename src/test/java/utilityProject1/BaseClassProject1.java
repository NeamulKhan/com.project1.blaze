package utilityProject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassProject1 {
	
	
		public static Properties project1_prop;
		public static WebDriver driver;
		
	public BaseClassProject1() {
		
	try {
		FileInputStream	files = new FileInputStream( System.getProperty("user.dir")+"\\src\\test\\java\\com\\project1\\blaze\\config\\com.project1.blaze.Properties");
		
		project1_prop = new Properties();
		
		project1_prop.load(files);
		
	} catch (FileNotFoundException e) {
		
		System.out.println("Please check your constructor");
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}

	public void project1browserinit() {
		
		String project1Browser=project1_prop.getProperty("Browser1");
		
		if(project1Browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\webDriverProject1\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataProject1.implicityWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataProject1.pageLoadWait));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			}
		else if(project1Browser.equalsIgnoreCase("FireFox")) {
			
			
		}
	}
	 public static void project1LaunchURL(String URL) {
		 
		 driver.get(project1_prop.getProperty("URL"));
	 }


}
