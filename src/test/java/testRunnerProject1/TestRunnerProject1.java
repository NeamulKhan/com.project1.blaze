package testRunnerProject1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilityProject1.BaseClassProject1;

@CucumberOptions(features = {"src/test/resources/featureFolder_Project1"},
plugin = {"json:target/cucumber.json"},
glue ="stepDefinationProject1", tags= {"@Contact1"}//@Signup1,@Login1,@Contact1
)

public class TestRunnerProject1 extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	
	public void project1setup()throws Exception {
		
		BaseClassProject1 test = new BaseClassProject1();
		
		test.project1browserinit();
	}
	
	@AfterTest
	
	public void project1ClosureURL() throws Exception {
		
		BaseClassProject1 test = new BaseClassProject1();
		
	//	test.driver.quit();
		
	}
	
}




