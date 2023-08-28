package stepDefinationProject1;

import com.project1.PageAction.HomePageActionProject1;
import com.project1.PageAction.ProfilePageActionProject1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilityProject1.BaseClassProject1;
import utilityProject1.UtilityProject1;

public class Login_Project1 extends BaseClassProject1{
	
	HomePageActionProject1 homePageActionProject1 = new HomePageActionProject1();
	ProfilePageActionProject1 profilePageActionProject1 = new ProfilePageActionProject1();
	
	@Given("^Lauch \"([^\"]*)\"$")
	public void lauch(String URL) throws Throwable {
	   
		project1LaunchURL(URL);
	}
	
	@Then("^click login link$")
	public void click_login_link() throws Throwable {
		
		homePageActionProject1.clickloginLink();   
	}

	@Then("^enter username,password and click login button$")
	public void enter_username_password_and_click_login_button() throws Throwable {
		
		homePageActionProject1.logincredentials(project1_prop.getProperty("Username"),project1_prop.getProperty("Password") );	
	   
	}

	@Then("^verify user can successfully log in$")
	public void verify_user_can_successfully_log_in() throws Throwable {
		
		profilePageActionProject1.verifyloginproject1();
		
		UtilityProject1.takeMyScreenshot(driver, "Profilepage");
	}
	   
	}





