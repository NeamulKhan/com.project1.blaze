package testRunner_Blaze;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.Base_Blaze;

@CucumberOptions(features = {"src/test/resources/Feature_Folder "}, 
plugin = {"json:target/cucumber.json"},
glue ="stepDefination"
)

public class TestRunner_Blaze extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	
	public void blaze_setup() throws Exception{
		
		Base_Blaze test= new Base_Blaze();
		
		test.blazebrowserinit();
	}
	
	@AfterTest
	
	public void closureURL()  {
		
		Base_Blaze test= new Base_Blaze();
		
		//test.driver.quit();
		
	}
	

}
